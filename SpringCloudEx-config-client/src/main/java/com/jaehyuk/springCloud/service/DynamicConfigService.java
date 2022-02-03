package com.jaehyuk.springCloud.service;

import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class DynamicConfigService {
	
	@Value("${taeng.profile}")
	private String profile;
	
	@Value("${taeng.comment}")
	private String comment;

	public Map<String, String> getConfig() {
		Map<String, String> map = new HashMap<>();
		map.put("profile", profile);
		map.put("comment", comment);
		return map;
	}
}
