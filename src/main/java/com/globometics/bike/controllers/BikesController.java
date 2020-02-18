package com.globometics.bike.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globometics.bike.models.Bike;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {
	public List<Bike> list(){
		List<Bike> bikes = new ArrayList<>();
		return bikes;
	}
}
