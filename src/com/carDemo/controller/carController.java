package com.carDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carDemo.model.Car;
import com.carDemo.model.User;
import com.carDemo.service.carService;

@RestController
@Component
public class carController {

	@Autowired
	private carService cs;
	
	@RequestMapping(value="/getAllCarDetails", method = RequestMethod.GET)
	public List<Car> getAllCarDetails(){
		List<Car> carList = new ArrayList<>();
		try {
			carList = cs.getAllCarDetails();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return carList;
	}
	
	@RequestMapping(value="/getUserDetails", method = RequestMethod.GET)
	public List<User> getUserDetails(){
		List<User> userList = new ArrayList<>();
		try {
			userList = cs.getUserDetails();
			System.out.println(userList);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return userList;
	}
	
	@RequestMapping(value="/validateUser",method= RequestMethod.POST)
	public String validateUser(@RequestParam(value="username") String username,@RequestParam(value="password") String password) {
		String response = "Response Awaited...!!";
		
		try {
			if(cs.validateUser(username, password)) {
				response = "Welcome " + username;
			}else {
				response = "Username or Password Incorrect";
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return response;
	}
	
	@RequestMapping(value="/getCarDetailById/",method=RequestMethod.POST)
	public Car getCarDetailById(@RequestParam(value="id") int id) {
		Car c= new Car();
		
		try {
			c = cs.getCarDetailsById(id);
		}catch(Exception e) {
			
		}
		
		return c;
	}
	
	@RequestMapping(value="/updateCarDetailById/{id}",method=RequestMethod.PUT)
	public String updateCarDetailById(@PathVariable(value="id") int id,@RequestBody Car c) {
		try {
			cs.updateCarDetailsById(id, c);
		}catch(Exception e) {
			return "Fail to update.";
		}
		
		return "Updated Succesfully..!!";
	}
		
	@RequestMapping(value="/addCar",method=RequestMethod.POST)
	public String addCar(@RequestBody Car c) {
		try {
			cs.addCar(c);
		}catch(Exception e) {
			return "Fail to add Car.";
		}
		
		return "Car Added Succesfully..!!";
	}
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public String addUser(@RequestBody User u) {
		try {
			cs.addUser(u);
		}catch(Exception e) {
			return "Fail to add User.";
		}
		
		return "User Added Succesfully..!!";
	}
	
	@RequestMapping(value="/deleteUser", method=RequestMethod.DELETE)
	public String deleteUser(@RequestParam int id) {
		try {
			if(cs.deleteUser(id)) {
				return "User Deleted Succesfully";
			}else {
				return "User not found";
			}
		}catch(Exception e) {
			e.printStackTrace();
			return "Fail to delete User.";
		}
		
	}
	
	@RequestMapping(value="/deleteCar", method=RequestMethod.DELETE)
	public String deleteCar(@RequestParam int id) {
		try {
			if(cs.deleteCar(id)) {
				return "Car Deleted Succesfully";
			}else {
				return "Car not found";
			}
		}catch(Exception e) {
			e.printStackTrace();
			return "Fail to delete Car.";
		}
		
	}
}
