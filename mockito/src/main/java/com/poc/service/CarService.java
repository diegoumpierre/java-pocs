package com.poc.service;

import com.poc.model.Car;
import com.poc.model.Road;
import jakarta.inject.Inject;

public class CarService {

    @Inject
    RoadService roadService;



    public int degreeAtTheEnd(Car car, Road road, int kmToRun){

        for (int i = 0; i < kmToRun; i++) {
            if (car.getTemp() > 20){
                throw new RuntimeException("Car is to hot!");
            }

            if (road.isHasRoadHole()){
                car.setTemp(car.getTemp()+0.1);
            }


            if (road.isHasSlopeStreet()){
                car.setTemp(car.getTemp()+0.5);
            }


        }








        return 1;
    }


}
