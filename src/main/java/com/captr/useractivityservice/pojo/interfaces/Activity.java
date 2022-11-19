package com.captr.useractivityservice.pojo.interfaces;

import java.time.LocalDateTime;

/**
 * @author toyewole
 */
public interface Activity {
    String getActivity ();
    String getDescription ();
    LocalDateTime getActivityTimestamp ();

}
