package com.sample.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.sample.domain.SecurityPolicy;
import com.sample.repository.custom.SecurityPolicyRepositoryCustom;

public interface SecurityPolicyRepository extends ReactiveMongoRepository<SecurityPolicy, ObjectId>, SecurityPolicyRepositoryCustom {

}
