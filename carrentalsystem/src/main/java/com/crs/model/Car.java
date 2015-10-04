package com.crs.model;

import java.util.Date;
import java.util.List;

public class Car {
	long carId;
	CarModel carModel;
	String registerNumber;
	Date registerDate;
	List<byte[]> images; // at least 4 images: front, back & 2 sides
	double pricePerDay;
	double pricePerMonth;	
	int companyId;  // each car belong to specific company
	float ratingStar; // rate from 1 to 5 stars
	public long getCarId() {
		return carId;
	}
	public void setCarId(long carId) {
		this.carId = carId;
	}
	public CarModel getCarModel() {
		return carModel;
	}
	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}
	public String getRegisterNumber() {
		return registerNumber;
	}
	public void setRegisterNumber(String registerNumber) {
		this.registerNumber = registerNumber;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public List<byte[]> getImages() {
		return images;
	}
	public void setImages(List<byte[]> images) {
		this.images = images;
	}
	public double getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public double getPricePerMonth() {
		return pricePerMonth;
	}
	public void setPricePerMonth(double pricePerMonth) {
		this.pricePerMonth = pricePerMonth;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public float getRatingStar() {
		return ratingStar;
	}
	public void setRatingStar(float ratingStar) {
		this.ratingStar = ratingStar;
	}
	
	
}
