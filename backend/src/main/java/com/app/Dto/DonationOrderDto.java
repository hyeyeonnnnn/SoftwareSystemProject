package com.app.Dto;

import java.sql.Date;

public class DonationOrderDto {
	
	private int donation_id, donation_state;
	private double donation_price;
	private Date donationAdd_date;
	private String user_id;
	public int getDonation_id() {
		return donation_id;
	}
	public void setDonation_id(int donation_id) {
		this.donation_id = donation_id;
	}
	public int getDonation_state() {
		return donation_state;
	}
	public void setDonation_state(int donation_state) {
		this.donation_state = donation_state;
	}
	public double getDonation_price() {
		return donation_price;
	}
	public void setDonation_price(double donation_price) {
		this.donation_price = donation_price;
	}
	public Date getDonationAdd_date() {
		return donationAdd_date;
	}
	public void setDonationAdd_date(Date donationAdd_date) {
		this.donationAdd_date = donationAdd_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
}
