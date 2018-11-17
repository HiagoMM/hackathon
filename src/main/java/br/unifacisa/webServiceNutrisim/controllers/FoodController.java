package br.unifacisa.webServiceNutrisim.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifacisa.webServiceNutrisim.abstracts.ControllerAbs;
import br.unifacisa.webServiceNutrisim.abstracts.ServiceAbs;
import br.unifacisa.webServiceNutrisim.domains.entities.Food;
import br.unifacisa.webServiceNutrisim.services.FoodService;


@RestController

@RequestMapping("/food")
public class FoodController extends ControllerAbs<Food> {

	@Autowired
	FoodService service;
	
	
	public FoodController(ServiceAbs<Food> service) {
		super(service);
	}

}
