package com.qa.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.account.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	
}
