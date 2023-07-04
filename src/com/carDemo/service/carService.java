package com.carDemo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.carDemo.model.Car;
import com.carDemo.model.User;

@Component
public interface carService {

	public List<Car> getAllCarDetails() throws Exception;
	public List<User> getUserDetails() throws Exception;
	public Car getCarDetailsById(int id) throws Exception;
	public Void updateCarDetailsById(int id,Car c) throws Exception;
	public boolean validateUser(String username,String password) throws Exception;
	public boolean addUser(User u) throws Exception;
	public boolean addCar(Car c) throws Exception;
	public boolean deleteUser(int id) throws Exception;
	public boolean deleteCar(int id) throws Exception;
}
