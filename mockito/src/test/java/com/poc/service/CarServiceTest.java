package com.poc.service;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class CarServiceTest {


    @InjectMocks
    RoadService roadService;

    @Mock
    CarService carService = new CarService();

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMock(){

        System.out.println("test");



    }



}