package com.gapperdan.hsbaop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gapperdan.hsbaop.bo.Random;
import com.gapperdan.hsbaop.service.RandomGeneratorService;

@RestController
public class RandomGeneratorController {
	
	@Autowired
	private RandomGeneratorService randomGeneratorService;
	
	@RequestMapping("/random")
	public Random random() {
		String randomString = randomGeneratorService.generate();
		return new Random(randomString);
	}
}
