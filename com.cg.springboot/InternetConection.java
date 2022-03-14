package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class InternetConection {
	private String ip_address;

	public String getIp_address() {
		return ip_address;
	}

	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
}
	public void Internet() {
		System.out.println("Connectiong internet");
	}
}