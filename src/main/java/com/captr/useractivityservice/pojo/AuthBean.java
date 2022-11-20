package com.captr.useractivityservice.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author toyewole
 */
@Component
@RequestScope
@Data
public class AuthBean {
    private String principal;
    private Long userId;
}
