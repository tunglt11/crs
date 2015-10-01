package com.crs.entity;

public class CarModel {	
	int modelId;
	int manufacturerId;
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
}
