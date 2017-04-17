package com.github.tjpanda88.libra.account.client;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.github.tjpanda88.libra.account.resource.AccountResource;

@FeignClient("libra-account-service")
public interface AccountClient extends AccountResource  {
}
