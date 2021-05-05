package Entities;

import java.util.Date;

import Abstract.Entity;

public class Member implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private Date dataOfBirth;
	private String nationalityId;
	
	public Member() {
		
	}
	
	public Member(int id, String firstName, String lastName, Date dataOfBirth, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dataOfBirth = dataOfBirth;
		this.nationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDataOfBirth() {
		return dataOfBirth;
	}
	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	

}
