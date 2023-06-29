package com.carDemo.model;

public class Car {

	private int carId;
	private String carName;
	private Double carPrice;
	private int userId;
	
	public Car() {
		super();
	}
	
	public Car(int carId, String carName, Double carPrice, int userId) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carPrice = carPrice;
		this.userId = userId;
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
	public int getUserId() {
		return userId;
	}
	public void setUser(int userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carPrice=" + carPrice + ", userId=" + userId + "]";
	}
	
	
}
