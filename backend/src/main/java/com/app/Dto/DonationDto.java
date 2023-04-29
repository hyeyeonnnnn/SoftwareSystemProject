package com.app.Dto;

import java.sql.Date;

public class DonationDto {
	private int donation_id, like_count, donation_closeState;
	private double totalDonationPrice;
	private String donation_name, donation_detail;
	private Date donation_closeDate;
	
	public int getDonation_id() {
		return donation_id;
	}
	public void setDonation_id(int donation_id) {
		this.donation_id = donation_id;
	}
	public int getLike_count() {
		return like_count;
	}
	public void setLike_count(int like_count) {
		this.like_count = like_count;
	}
	public int getDonation_closeState() {
		return donation_closeState;
	}
	public void setDonation_closeState(int donation_closeState) {
		this.donation_closeState = donation_closeState;
	}
	public double getTotalDonationPrice() {
		return totalDonationPrice;
	}
	public void setTotalDonationPrice(double totalDonationPrice) {
		this.totalDonationPrice = totalDonationPrice;
	}
	public String getDonation_name() {
		return donation_name;
	}
	public void setDonation_name(String donation_name) {
		this.donation_name = donation_name;
	}
	public String getDonation_detail() {
		return donation_detail;
	}
	public void setDonation_detail(String donation_detail) {
		this.donation_detail = donation_detail;
	}
	public Date getDonation_closeDate() {
		return donation_closeDate;
	}
	public void setDonation_closeDate(Date donation_closeDate) {
		this.donation_closeDate = donation_closeDate;
	}
	
	
}
