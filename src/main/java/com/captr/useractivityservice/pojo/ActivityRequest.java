package com.captr.useractivityservice.pojo;

import lombok.Data;

/**
 * @author toyewole
 */
@Data
public class ActivityRequest {
    private String activityType;
    private int pageIndex;
    private int pageSize;
}
