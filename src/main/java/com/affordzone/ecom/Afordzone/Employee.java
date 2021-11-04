package com.affordzone.ecom.Afordzone;

public class Employee {
	private String fristName;
	private String lastName;
	private String userId;
	private String adress;
	
	
	
	public Employee(String fristName, String lastName, String userId, String adress) {
		super();
		this.fristName = fristName;
		this.lastName = lastName;
		this.userId = userId;
		this.adress = adress;
	}
	/**
	 * @return the fristName
	 */
	public String getFristName() {
		return fristName;
	}
	/**
	 * @param fristName the fristName to set
	 */
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}
	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [fristName=" + fristName + ", lastName=" + lastName + ", userId=" + userId + ", adress="
				+ adress + "]";
	}
	

}
