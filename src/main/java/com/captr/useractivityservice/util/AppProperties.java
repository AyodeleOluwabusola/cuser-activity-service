package com.captr.useractivityservice.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author toyewole
 */

@Component
@ConfigurationProperties
@Getter
@Setter
public class AppProperties {

    private String queueName = "activity_log_queue";
    private String exchangeName = "exchange.activity_log_exchange";
    private String routingKey = "routing.activty_log";


}
