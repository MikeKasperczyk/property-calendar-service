package com.metamagix.property.service;

import com.metamagix.property.service.domain.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "properties", path="properties")
public interface PropertyRestRepository extends MongoRepository<Property, String> {
    @Override
    List<Property> findAll();
}
