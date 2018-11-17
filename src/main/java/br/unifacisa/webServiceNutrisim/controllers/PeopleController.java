package br.unifacisa.webServiceNutrisim.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifacisa.webServiceNutrisim.abstracts.ControllerAbs;
import br.unifacisa.webServiceNutrisim.abstracts.ServiceAbs;
import br.unifacisa.webServiceNutrisim.domains.entities.People;
import br.unifacisa.webServiceNutrisim.services.PeopleService;


@RestController

@RequestMapping("/user")
public class PeopleController extends ControllerAbs<People> {

	@Autowired
	PeopleService service;
	
	
	public PeopleController(ServiceAbs<People> service) {
		super(service);
	}
	
	
	
	
	
	

}
