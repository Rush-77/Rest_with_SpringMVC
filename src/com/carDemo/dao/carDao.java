package com.carDemo.dao;

import java.util.List;

import com.carDemo.model.Car;
import com.carDemo.model.User;

public interface carDao {

	public List<Car> getAllCarDetails() throws Exception;
	
	public List<User> getUserDetails() throws Exception;
	
	public Car getCarDetailsById(int id) throws Exception;
	
	public Void updateCarDetailsById(int id,Car c) throws Exception;
	
	public boolean validateUser(String username,String password) throws Exception;
}
