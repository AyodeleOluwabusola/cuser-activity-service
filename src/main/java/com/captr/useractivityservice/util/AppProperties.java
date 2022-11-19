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

    private String queueName = "email_sender_queue";
    private String exchangeName = "exchange.email_sender_exchange";;
    private String routingKey = "routing.email_sender";


}
