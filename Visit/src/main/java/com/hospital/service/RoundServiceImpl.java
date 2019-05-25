package com.hospital.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hospital.dao.RoundDAO;
import com.hospital.entity.Employee;
import com.hospital.entity.Round;

@Service
public class RoundServiceImpl implements RoundService {
	@Autowired
	RoundDAO roundDAO;

	@Override
	@Transactional
	public List<Round> findAll() {
		return roundDAO.findAll();
	}

	@Override
	@Transactional
	public Round findById(int id) {
		return roundDAO.findById(id);
	}

	@Override
	@Transactional
	public void save(Round round) {
		roundDAO.save(round);

	}

	@Override
	@Transactional
	public void delete(int id) {
		 roundDAO.delete(id);
	}

	@Override
	@Transactional
	public List<Round> findRoundsByDate(Date date) {
		return roundDAO.findRoundsByDate(date);
	}

	@Override
	@Transactional
	public Round findRoundByEmployeeAndDate(Employee employee, Date date) {
		
		return roundDAO.findRoundByEmployeeAndDate(employee, date);
	}

	@Override
	@Transactional
	public List<Round> findRoundsByEmpId(Employee employee) {
		return roundDAO.findRoundsByEmpId(employee);
	}

}
