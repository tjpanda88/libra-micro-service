package com.github.tjpanda88.libra.account.resource;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface AccountResource {

	@RequestMapping(path = "/current", method = RequestMethod.GET)
	public Map<String,String> getCurrentAccount();

}
