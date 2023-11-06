package com.sample.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.sample.domain.ApiToken;

public interface ApiTokenRepository extends ReactiveMongoRepository<ApiToken, ObjectId> {
	
	
}