package com.jaehyuk.springCloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaehyuk.springCloud.service.DynamicConfigService;
import com.jaehyuk.springCloud.service.StaticConfigService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ConfigController {
	
	private final StaticConfigService staticConfigService;
	private final DynamicConfigService configDynamicService;
	
	@GetMapping(value = "/static")
	public Object getConfigFromStatic() {
		return staticConfigService.getConfig();
	}

	@GetMapping(value = "/dynamic")
	public Object getConfigFromDynamic() {//git test
		return configDynamicService.getConfig();
	}
}
