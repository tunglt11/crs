package com.crs.model;

public class CarModel {	
	int modelId;
	Manufacturer manufacturer;
	String modelName;
	int yearMade;
	ModelColor modelColor;
	byte numberOfSeat;
	byte transmissionType; //0 auto, 1 manual
	
	ModelType modelType; // sedan, suv,...
	FuelType fuelType;
	
	public enum ModelColor{
		Black, White, Red, Silver
	}
	
	public enum ModelType {
		Sedan, SUV, Hatchback, Coup, Van, Truck
	}
	
	public enum FuelType {
		Gasoline, Diesel, Electric, Hyprid
	}

	public int getModelId() {
		return modelId;
	}

	public void setModelId(int modelId) {
		this.modelId = modelId;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getYearMade() {
		return yearMade;
	}

	public void setYearMade(int yearMade) {
		this.yearMade = yearMade;
	}

	public ModelColor getModelColor() {
		return modelColor;
	}

	public void setModelColor(ModelColor modelColor) {
		this.modelColor = modelColor;
	}

	public byte getNumberOfSeat() {
		return numberOfSeat;
	}

	public void setNumberOfSeat(byte numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
	}

	public byte getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(byte transmissionType) {
		this.transmissionType = transmissionType;
	}

	public ModelType getModelType() {
		return modelType;
	}

	public void setModelType(ModelType modelType) {
		this.modelType = modelType;
	}

	public FuelType getFuelType() {
		return fuelType;
	}

	public void setFuelType(FuelType fuelType) {
		this.fuelType = fuelType;
	}
	
	
}
