package com.hospital.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.entity.Employee;
import com.hospital.entity.Round;

@Repository
public class RoundDAOimpl implements RoundDAO {

	@Autowired
	EntityManager entityManager;

	@Override
	public void save(Round round) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(round);
		session.clear();
	}

	@Override
	public void delete(int id) {
		try {
			Session session = entityManager.unwrap(Session.class);
			Query<?> query = session.createQuery("DELETE from Round where roundId=:roundId1");
			query.setParameter("roundId1",id);
			query.executeUpdate();
			} catch (Exception e) {
			e.printStackTrace();
			}

	}

	
	@Override
	public Round findById(int id) {
		Round round;

		try {
			Session session = entityManager.unwrap(Session.class);
			round = session.get(Round.class, id);
		} catch (NoResultException e) {
			round = new Round();
		}

		return round;
	}

	
	@Override
	public List<Round> findAll() {
		Session session = entityManager.unwrap(Session.class);
		Query<Round> query = session.createQuery("from Round  ORDER BY date DESC ", Round.class);
		return query.getResultList();
	}

	
	
	@Override
	public List<Round> findRoundsByDate(Date date) {
		List<Round> roundList;

		try {
			Session session = entityManager.unwrap(Session.class);
			Query<Round> query = session.createQuery("from Round where date=:date1 ORDER BY date DESC ", Round.class);
			query.setParameter("date1", date);
			roundList = query.getResultList();
		} catch (NoResultException e) {
			roundList = new ArrayList<>();
		}

		return roundList;
	}

	@Override
	public List<Round> findRoundsByEmpId(Employee employee) {
		List<Round> round;

		try {
			Session session = entityManager.unwrap(Session.class);
			Query<Round> query = session.createQuery("from Round where employee=:object", Round.class);
			query.setParameter("object", employee);
			round = query.getResultList();
		} catch (NoResultException e) {
			round = new ArrayList<>();
		}

		return round;
	}
	
	@Override
	public Round findRoundByEmployeeAndDate(Employee employee, Date date) {
		Round round;

		try {
			Session session = entityManager.unwrap(Session.class);
			Query<Round> query = session.createQuery("from Round where employee=:empId1 AND date=:date1", Round.class);
			query.setParameter("empId1", employee);
			query.setParameter("date1", date);
			round = query.getSingleResult();
		} catch (NoResultException e) {
			round = new Round();
		}

		return round;
	}

}
