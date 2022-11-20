
package com.captr.useractivityservice.listener;

import com.captr.useractivityservice.entity.CtActivityLog;
import com.captr.useractivityservice.pojo.ActivityLog;
import com.captr.useractivityservice.repository.IActivityLogRepository;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
@Slf4j
public class ActivityListener {

    final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    @Autowired
    IActivityLogRepository iActivityLogRepository;

    @RabbitListener(queues = "${queue-name}")
    public void listener(ActivityLog activityLog) {

        log.info("Message Received: {}", activityLog);
        CtActivityLog ctActivityLog = new CtActivityLog();
        ctActivityLog.setActivityType(activityLog.getActivityType());
        ctActivityLog.setDesc(activityLog.getDescription());
        ctActivityLog.setUserEmail(activityLog.getEmailAddress());
        ctActivityLog.setActivityTime(StringUtils.isNotBlank(activityLog.getRequestTime()) ? LocalDateTime.parse(activityLog.getRequestTime(), DATE_TIME_FORMATTER): null );

        iActivityLogRepository.save(ctActivityLog);

    }

}
