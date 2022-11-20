package com.captr.useractivityservice.pojo.interfaces;

import java.time.LocalDateTime;

/**
 * @author toyewole
 */
public interface IActivity {

    String getActivityType();

    String getDesc();

    LocalDateTime getActivityTime();

}
