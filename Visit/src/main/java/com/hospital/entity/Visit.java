package com.hospital.entity;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Visit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int visitId;
	private String client;
//	@Temporal(TemporalType.TIMESTAMP)
	private LocalTime startTime;
//	@Temporal(TemporalType.TIMESTAMP)
	private LocalTime endTime;
	private String address;
	private double duration;
	private boolean status;
	private String FTAreason;
	private int cost;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JsonBackReference
	private Round round;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="visitList")
	@JsonManagedReference
	private List<Client> clientList;

	public int getVisitId() {
		return visitId;
	}

	public void setVisitId(int visitId) {
		this.visitId = visitId;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getFTAreason() {
		return FTAreason;
	}

	public void setFTAreason(String fTAreason) {
		FTAreason = fTAreason;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Round getRound() {
		return round;
	}

	public void setRound(Round round) {
		this.round = round;
	}

	public List<Client> getClientList() {
		return clientList;
	}

	public void setClientList(List<Client> clientList) {
		this.clientList = clientList;
	}

	public Visit(int visitId, String client, LocalTime startTime, LocalTime endTime, String address, double duration,
			boolean status, String fTAreason, int cost, Round round, List<Client> clientList) {
		
		this.visitId = visitId;
		this.client = client;
		this.startTime = startTime;
		this.endTime = endTime;
		this.address = address;
		this.duration = duration;
		this.status = status;
		this.FTAreason = fTAreason;
		this.cost = cost;
		this.round = round;
		this.clientList = clientList;
	}

	public Visit() {
		
	}



}
