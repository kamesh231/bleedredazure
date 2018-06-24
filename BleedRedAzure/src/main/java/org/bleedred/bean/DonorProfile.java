package org.blooddonors.bean;

public class DonorProfile {
	private String firstName;
	private String lastName;
	private String messengerUserId;
	private String chatFuelUserId;
	private Boolean gender;
	private String timeZone;
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
	public String getMessengerUserId() {
		return messengerUserId;
	}
	public void setMessengerUserId(String messengerUserId) {
		this.messengerUserId = messengerUserId;
	}
	public String getChatFuelUserId() {
		return chatFuelUserId;
	}
	public void setChatFuelUserId(String chatFuelUserId) {
		this.chatFuelUserId = chatFuelUserId;
	}
	
	public DonorProfile(String firstName,String lastName,String messengerUserId,String chatFuelUserId,Boolean gender,String timeZone) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.messengerUserId=messengerUserId;
		this.chatFuelUserId=chatFuelUserId;
		this.gender=gender;
		this.timeZone=timeZone;
	}
	
	

}
