package com.captr.useractivityservice.service;

import com.captr.useractivityservice.pojo.ActivityRequest;
import com.captr.useractivityservice.pojo.AuthBean;
import com.captr.useractivityservice.pojo.interfaces.Activity;
import com.captr.useractivityservice.repository.IActivityLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author toyewole
 */
@Service
public class ActivityService {

    @Autowired
    private AuthBean authBean;

    @Autowired
    private IActivityLogRepository iActivityLogRepository;

    public List<Activity> getActivitiesByUserId(ActivityRequest request) {
        return iActivityLogRepository.getFirstByUserFkOrderByActivityTime(authBean.getUserId(),
                Pageable.ofSize(request.getPageSize()).withPage(request.getPageIndex()));

    }
}
