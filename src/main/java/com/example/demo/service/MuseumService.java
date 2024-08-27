package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Museum;

public interface MuseumService {
	
	List<Museum>card_details();
	Museum fullDetails(int mid);
	//admin
	String createmueByAdmin(Museum mue);
	String updatemueByAdmin(Museum mue);
	String deletemueByAdmin(Museum mue);
	
	//additional
	List<Museum>findMueByState(String state);
	List<Museum>findMueBycity(String city);
	List<Museum>findMueByStateandCity(String state, String city);
	List<Museum> searchMuseumsByName(String name);
	
	
	
}
