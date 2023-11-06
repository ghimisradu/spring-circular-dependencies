package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.sample.repository.AccountRepository;
import com.sample.repository.ApiTokenRepository;
import com.sample.repository.SecurityPolicyRepository;

@Service
public class ReactiveAuthenticationServiceImpl implements ReactiveAutenticationService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private ApiTokenRepository apiTokenRepository;
	@Autowired
	private SecurityPolicyRepository securityPolicyRepository;
	
}
