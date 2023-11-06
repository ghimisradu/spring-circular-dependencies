package com.sample.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.sample.domain.Account;

public interface AccountRepository extends ReactiveMongoRepository<Account, ObjectId> {

	
}
