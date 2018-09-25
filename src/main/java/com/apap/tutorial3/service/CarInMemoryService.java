package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.apap.tutorial3.model.CarModel;
import org.springframework.stereotype.Service;

@Service
public  class CarInMemoryService implements CarService{
	private 
	List<CarModel> archieveCar;
	
	public CarInMemoryService() {
		archieveCar = new ArrayList<>();
	}
	
	@Override
	public void addCar(CarModel car) {
		archieveCar.add(car);
	}
	
	@Override
	public List<CarModel> getCarList(){
		return archieveCar;
	}

	@Override
	public CarModel getCarDetail(String id) {
		// TODO Auto-generated method stub
		CarModel mobil = new CarModel();
		for(CarModel car : archieveCar) {
			if(car.getId().equals(id)) {
				mobil = car;
			}
		}
		return mobil;
	}
}
