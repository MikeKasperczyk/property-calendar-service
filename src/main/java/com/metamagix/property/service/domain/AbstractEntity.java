package com.metamagix.property.service.domain;

import org.springframework.data.annotation.Id;

public class AbstractEntity {
    @Id
    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(!"".equals(id)) {
            this.id = id;
        }
    }
}
