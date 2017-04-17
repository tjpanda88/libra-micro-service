package com.github.tjpanda88.libra.account.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.github.tjpanda88.libra.account.domain.Account;
import com.github.tjpanda88.libra.account.repository.AccountRepository;
import com.github.tjpanda88.libra.account.resource.AccountResource;

@RestController
public class AccountController implements AccountResource {

	@Autowired
	private AccountRepository accountRepository;

	public Map<String, String> getCurrentAccount() {

		Account temp = accountRepository.findByName("My");

		if (temp == null) {
			Account entity = new Account();
			entity.setAge(15);
			entity.setName("My");
			accountRepository.save(entity);
		}
		
		Account searchEntity = accountRepository.findByName("My");

		Map<String, String> result = new HashMap<String, String>();
		result.put("test", "test");
		result.put("age", searchEntity.getAge().toString());
		return result;
	}

}
