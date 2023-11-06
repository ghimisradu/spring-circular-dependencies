package com.sample.repository.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;

public class SecurityPolicyRepositoryCustomImpl implements SecurityPolicyRepositoryCustom {
	
	@Autowired
	private ReactiveMongoOperations reactiveMongoOperations;
	

}
