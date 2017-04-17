package com.github.tjpanda88.libra.gateway;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.tjpanda88.libra.account.client.AccountClient;

@RestController
@RequestMapping(path = "/gateway")
public class GatewayController {

	@Autowired
	private AccountClient accountClient;
	
	@RequestMapping(path = "current", method = RequestMethod.GET)
	public Map<String,String> getCurrentAccount() {
		Map<String,String> result = accountClient.getCurrentAccount();
		result.put("gateWayTest", "gateWayTest");
		return result;
	}

}
