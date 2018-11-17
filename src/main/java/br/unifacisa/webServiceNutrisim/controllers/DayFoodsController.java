package br.unifacisa.webServiceNutrisim.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifacisa.webServiceNutrisim.abstracts.ControllerAbs;
import br.unifacisa.webServiceNutrisim.abstracts.ServiceAbs;

import br.unifacisa.webServiceNutrisim.domains.entities.DayFoods;
import br.unifacisa.webServiceNutrisim.services.DayFoodsService;

@RestController

@RequestMapping("/dayfood")
public class DayFoodsController extends ControllerAbs<DayFoods> {

	@Autowired
	DayFoodsService service;
	
	
	public DayFoodsController(ServiceAbs<DayFoods> service) {
		super(service);
	}
	
	
//	@GetMapping("/month/{mes}")
//	public ResponseEntity< List<DayFoods>> resumeByMonth (@PathVariable int mes) {
//		return new ResponseEntity< List<DayFoods>>(service.resumeByMonth(mes),HttpStatus.OK);
//	}

}
