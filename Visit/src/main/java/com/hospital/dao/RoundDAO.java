package com.hospital.dao;

import java.util.Date;
import java.util.List;

import com.hospital.entity.Employee;
import com.hospital.entity.Round;

public interface RoundDAO {

	public void save(Round round);
	
	public void delete(int id);
	
	public Round findById(int id);
	
	public List<Round> findAll();
	
	public List<Round> findRoundsByDate(Date date);
	
	public List<Round> findRoundsByEmpId(Employee employee);
	
	public Round findRoundByEmployeeAndDate(Employee employee,Date date);
}
