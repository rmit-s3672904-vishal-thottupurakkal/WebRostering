package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.entity.Client;
import com.hospital.entity.Employee;
import com.hospital.service.ClientService;

@RestController
@CrossOrigin(origins= "http://localhost:4200")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping("/getClientList")
	public List<Client> getClientList(){
		
		return clientService.findAll();
		
	}
	
}
