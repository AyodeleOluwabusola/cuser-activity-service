package com.captr.useractivityservice.controller;

import com.captr.useractivityservice.pojo.ActivityRequest;
import com.captr.useractivityservice.pojo.interfaces.IActivity;
import com.captr.useractivityservice.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author toyewole
 */

@RestController
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping
    @RequestMapping("/recent")
    public List<IActivity> getActivities(ActivityRequest request) {
        return activityService.getActivitiesByUserId( request);
    }
}
