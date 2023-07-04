package com.carDemo.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.carDemo.model.Car;
import com.carDemo.model.User;

@Component
public class carDaoImpl implements carDao{
	
	public static List<Car> carList = new ArrayList<>();
	public static List<User> userList = new ArrayList<>();
	
	static {
		User u1 = new User(1,"rushik","root");
		User u2 = new User(2,"sunnyn","root123");
		User u3 = new User(3,"adik","root11");
		User u4 = new User(4,"rohank","root22");
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		
		Car c1 = new Car(101,"Ertiga",1000.00,1);
		Car c2 = new Car(102,"Land Cruiser",2000.00,2);
		Car c3 = new Car(103,"Camry",3000.00,3);
		Car c4 = new Car(104,"Fortuner",4000.00,4);
		
		carList.add(c1);
		carList.add(c2);
		carList.add(c3);
		carList.add(c4);
	}

	@Override
	public List<Car> getAllCarDetails() throws Exception {
		
		return carList;
	}

	@Override
	public Car getCarDetailsById(int id) throws Exception {
		try {
			for(Car c1:carList){
				if(c1.getCarId()==id) {
					return c1;
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Void updateCarDetailsById(int id, Car c) throws Exception {
		Car oldcar = getCarDetailsById(id);
		oldcar.setCarName(c.getCarName());
		oldcar.setCarPrice(c.getCarPrice());
		return null;
	}

	@Override
	public List<User> getUserDetails() throws Exception {
		return userList;
	}

	@Override
	public boolean validateUser(String username, String password) throws Exception {
		boolean status = false;
		for(User u: userList) {
			if(u.getUsername().equals(username)) {
				if(u.getPassword().equals(password)) {
					status = true;
				}
			}
		}
		
		return status;
	}

	@Override
	public boolean addUser(User u) throws Exception {
		try {
			userList.add(u);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@Override
	public boolean addCar(Car c) throws Exception{
		try {
			carList.add(c);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean deleteUser(int id) throws Exception {
		try {
			Iterator itr = userList.iterator();
			  
	        while (itr.hasNext()) {
	            User x = (User)itr.next();
	            if (x.getId() == id ) {
	            	itr.remove();
	            	return true;
	            }
	        }
			return true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteCar(int id) throws Exception {
		try {
			Iterator itr = carList.iterator();
			  
	        while (itr.hasNext()) {
	            Car x = (Car)itr.next();
	            if (x.getCarId() == id ) {
	            	itr.remove();
	            	return true;
	            }
	                
	        }
			return false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

}
