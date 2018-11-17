package br.unifacisa.webServiceNutrisim.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifacisa.webServiceNutrisim.abstracts.ControllerAbs;
import br.unifacisa.webServiceNutrisim.abstracts.ServiceAbs;
import br.unifacisa.webServiceNutrisim.domains.entities.Meal;
import br.unifacisa.webServiceNutrisim.services.MealService;

@RestController

@RequestMapping("/"
		+ "meal")
public class MealController extends ControllerAbs<Meal> {

	@Autowired
	MealService service;
	
	
	public MealController(ServiceAbs<Meal> service) {
		super(service);
	}

}
