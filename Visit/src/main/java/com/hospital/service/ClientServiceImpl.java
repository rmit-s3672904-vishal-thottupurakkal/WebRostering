package com.hospital.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.dao.ClientDAO;
import com.hospital.entity.Client;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO clientDAO;
	
	@Override
	@Transactional
	public List<Client> findAll() { 
		return clientDAO.findAll(); 
	}

}
