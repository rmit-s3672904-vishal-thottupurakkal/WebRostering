package com.hospital.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Client;
import com.hospital.entity.Employee;

@Repository
public class ClientDAOImpl implements ClientDAO  {

	@Autowired
	EntityManager entityManager;

	
	@Override
	public List<Client> findAll() { 
		Session session=entityManager.unwrap(Session.class);
		Query<Client> query=session.createQuery("from Client",Client.class);
 		return query.getResultList();
	}

}
