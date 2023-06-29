package com.carDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carDemo.dao.carDao;
import com.carDemo.model.Car;
import com.carDemo.model.User;

@Component
public class carServiceImpl implements carService{
	
	@Autowired
	private carDao cd;

	@Override
	public List<Car> getAllCarDetails() throws Exception {
		return cd.getAllCarDetails();
	}

	@Override
	public Car getCarDetailsById(int id) throws Exception {
		return cd.getCarDetailsById(id);
	}

	@Override
	public Void updateCarDetailsById(int id, Car c) throws Exception {
		cd.updateCarDetailsById(id, c);
		return null;
	}

	@Override
	public List<User> getUserDetails() throws Exception {
		return cd.getUserDetails();
	}

	@Override
	public boolean validateUser(String username, String password) throws Exception {
		return cd.validateUser(username, password);
	}
	
	

}
