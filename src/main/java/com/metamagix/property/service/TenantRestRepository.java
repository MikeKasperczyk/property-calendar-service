package com.metamagix.property.service;

import com.metamagix.property.service.domain.Tenant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "tenants", path="tenants")
public interface TenantRestRepository extends MongoRepository<Tenant, String> {
}
