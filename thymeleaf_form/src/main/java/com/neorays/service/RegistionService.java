package com.neorays.service;

import org.springframework.stereotype.Service;

import com.neorays.dto.RegistrationDTO;

@Service
public class RegistionService {
	public RegistionService() {
		System.out.println("Service");
	}

	public boolean register(RegistrationDTO dto) {
		if (dto.getEmail() != null && dto.getPassword()!=null) {
			return true;
		} else {
			return false;
		}

	}

}
