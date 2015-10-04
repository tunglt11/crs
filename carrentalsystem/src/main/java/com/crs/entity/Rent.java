package com.crs.entity;

import java.util.Date;

public class Rent {
	long rentId;
	long carId;
	long customerId;
	long employeeId;
	Date rentDate;
	Date startDate;
	Date endDate;
	boolean includeDriver;
	double discount;
	double prepaid; // thanh toan truoc
	String assetment; // tai san the chap: xe may...
	byte rentStatus; // 0-pending; 1-ongoing; 2-completed; 3-canceled
	
	byte fuelLevel; //1 2 3 4...
	int kmStart;
	int kmEnd;
	int kmMaxPerDay;
	int kmOver;
	double kmOverPayment; // so tien phat cho moi km vuot
	
	String issue; // scratch, crash, accident
	double issuePaymentAmount;
	
	
	public long getRentId() {
		return rentId;
	}
	public void setRentId(long rentId) {
		this.rentId = rentId;
	}
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public boolean isIncludeDriver() {
		return includeDriver;
	}
	public void setIncludeDriver(boolean includeDriver) {
		this.includeDriver = includeDriver;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getPrepaid() {
		return prepaid;
	}
	public void setPrepaid(double prepaid) {
		this.prepaid = prepaid;
	}
	public String getAssetment() {
		return assetment;
	}
	public void setAssetment(String assetment) {
		this.assetment = assetment;
	}
	public byte getRentStatus() {
		return rentStatus;
	}
	public void setRentStatus(byte rentStatus) {
		this.rentStatus = rentStatus;
	}
	public byte getFuelLevel() {
		return fuelLevel;
	}
	public void setFuelLevel(byte fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	public int getKmStart() {
		return kmStart;
	}
	public void setKmStart(int kmStart) {
		this.kmStart = kmStart;
	}
	public int getKmEnd() {
		return kmEnd;
	}
	public void setKmEnd(int kmEnd) {
		this.kmEnd = kmEnd;
	}
	public int getKmMaxPerDay() {
		return kmMaxPerDay;
	}
	public void setKmMaxPerDay(int kmMaxPerDay) {
		this.kmMaxPerDay = kmMaxPerDay;
	}
	public int getKmOver() {
		return kmOver;
	}
	public void setKmOver(int kmOver) {
		this.kmOver = kmOver;
	}
	public double getKmOverPayment() {
		return kmOverPayment;
	}
	public void setKmOverPayment(double kmOverPayment) {
		this.kmOverPayment = kmOverPayment;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public double getIssuePaymentAmount() {
		return issuePaymentAmount;
	}
	public void setIssuePaymentAmount(double issuePaymentAmount) {
		this.issuePaymentAmount = issuePaymentAmount;
	}	
}
