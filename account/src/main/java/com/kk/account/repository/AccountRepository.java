package com.kk.account.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kk.account.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{

	Account findByCustomerId(int customerId);
}
