package com.captr.useractivityservice.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author toyewole
 */
@Data
public class ActivityLog implements Serializable {
    private String activityType;
    private String description;
    private Long userId;
    private String requestTime;
}
