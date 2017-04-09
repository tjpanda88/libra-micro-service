package com.github.tjpanda88.libra.account.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@RequestMapping(path = "/current", method = RequestMethod.GET)
	public Map<String,String> getCurrentAccount() {
		Map<String,String> result = new HashMap<String,String>();
		result.put("test", "test");
		return result;
	}

}
