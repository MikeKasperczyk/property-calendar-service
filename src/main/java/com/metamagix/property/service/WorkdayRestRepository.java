package com.metamagix.property.service;

import com.metamagix.property.service.domain.Workday;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "workdays", path="workdays")
public interface WorkdayRestRepository extends MongoRepository<Workday, String> {
}
