package com.hibernate.com.hibernate;

import java.util.Map;
import java.util.Set;

public class Emp {
	private String id;
	private String name;
	//private Set<PhoneNumber> phoneno;
	private Map<Integer,Set<PhoneNumber>> phoneno;
	private Integer phoneKey;
	public Emp() {
		System.out.println("employee object is created");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<Integer, Set<PhoneNumber>> getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Map<Integer, Set<PhoneNumber>> phoneno) {
		this.phoneno = phoneno;
	}
	public Integer getphoneKey() {
		return phoneKey;
	}
	public void setphoneKey(Integer phoneKey) {
		this.phoneKey = phoneKey;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}	
}
