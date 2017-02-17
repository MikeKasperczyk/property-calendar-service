package com.metamagix.property.service;

import com.metamagix.property.service.domain.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;
import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "events", path="events")
public interface EventsRestRepository extends MongoRepository<Event, String> {
    List<Event> findByStartBetween(LocalDateTime from, LocalDateTime to);
}
