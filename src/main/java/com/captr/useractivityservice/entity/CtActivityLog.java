package com.captr.useractivityservice.entity;

import com.captr.useractivityservice.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author toyewole
 */
@Getter
@Setter
@Entity
@Table(name = "CT_ACTIVITY_LOG")
public class CtActivityLog extends BaseEntity {

    @Column(name = "TYPE")
    private String activityType ;

    @Column(name = "DESCRIPTION")
    private String desc ;

    @Column(name= "ACT_TIMESTAMP")
    private LocalDateTime activityTime;

    @Column(name = "USER_FK")
    private Long userFk;

}
