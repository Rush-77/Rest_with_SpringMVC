package com.carDemo.model;

public class Car {

	private int carId;
	private String carName;
	private Double carPrice;
	private int id;
	
	public Car() {
		super();
	}
	
	public Car(int carId, String carName, Double carPrice, int id) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carPrice = carPrice;
		this.id = id;
	}
	
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public Double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}
	public int getid() {
		return id;
	}
	public void setUser(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carPrice=" + carPrice + ", id=" + id + "]";
	}
	
	
}
