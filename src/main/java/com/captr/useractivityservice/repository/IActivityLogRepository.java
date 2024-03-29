package com.captr.useractivityservice.repository;

import com.captr.useractivityservice.entity.CtActivityLog;
import com.captr.useractivityservice.pojo.interfaces.IActivity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author toyewole
 */
public interface IActivityLogRepository extends JpaRepository<CtActivityLog, Long> {


    List<IActivity> getFirstByUserEmailOrderByActivityTime(String userEmail, Pageable page);


}
