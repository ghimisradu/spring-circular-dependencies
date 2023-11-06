package com.sample.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.sample.domain.Role;

public interface RoleRepository extends ReactiveMongoRepository<Role, ObjectId> {

}
