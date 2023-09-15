package com.poc;

import java.util.ArrayList;
import java.util.List;

/**
 * The proposal for the class it is show the basic structure.
 *
 * @author diegoUmpierre
 * @since Sep 15 2023
 */
public class Solution {
    public List<Car> findCars(List<Car> carList, int budget, int maxMiles){

        if (carList == null) return null;

        List<Car> resultCarList = new ArrayList<>();

        for (Car car :resultCarList) {
            if (car.getMiles() < maxMiles && car.getPrice() <= budget){
                resultCarList.add(car);
            }
        }

        //order by price

        return carList;
    }
}
