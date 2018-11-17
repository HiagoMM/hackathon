package br.unifacisa.webServiceNutrisim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.unifacisa.webServiceNutrisim.abstracts.ServiceAbs;
import br.unifacisa.webServiceNutrisim.domains.entities.Meal;
import br.unifacisa.webServiceNutrisim.repositories.MealRepository;

@Service
public class MealService extends ServiceAbs<Meal>{

	
	@Autowired
	MealRepository repository;
	
	public MealService(JpaRepository<Meal, Long> repository) {
		super(repository);
	}
	
	

}
