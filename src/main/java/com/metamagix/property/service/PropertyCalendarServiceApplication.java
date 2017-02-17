package com.metamagix.property.service;

import com.metamagix.property.service.domain.Event;
import com.metamagix.property.service.domain.Property;
import com.metamagix.property.service.domain.Tenant;
import com.metamagix.property.service.domain.Workday;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.http.MediaType;

@SpringBootApplication
@Configuration
public class PropertyCalendarServiceApplication extends RepositoryRestConfigurerAdapter {
    public static void main(String[] args) {
        SpringApplication.run(PropertyCalendarServiceApplication.class, args);
    }

    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.setDefaultMediaType(MediaType.APPLICATION_JSON);
        config.exposeIdsFor(Event.class, Property.class, Tenant.class, Workday.class);
    }
}
