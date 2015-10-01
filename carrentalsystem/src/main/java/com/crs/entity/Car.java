package com.crs.entity;

import java.util.Date;
import java.util.List;

public class Car {
	long carId;
	CarModel carModel;
	String registerNumber;
	Date registerDate;
	List<byte[]> images; // at least 4 images: front, back & 2 sides
}
