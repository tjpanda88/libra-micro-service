package com.github.tjpanda88.libra.account.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;

import com.github.tjpanda88.libra.account.resource.AccountResource;

@RestController
public class AccountController implements AccountResource {

	public Map<String,String> getCurrentAccount() {
		Map<String,String> result = new HashMap<String,String>();
		result.put("test", "test");
		return result;
	}

}
