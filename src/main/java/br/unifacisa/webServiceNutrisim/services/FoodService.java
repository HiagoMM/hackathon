package br.unifacisa.webServiceNutrisim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.unifacisa.webServiceNutrisim.abstracts.ServiceAbs;
import br.unifacisa.webServiceNutrisim.domains.entities.Food;
import br.unifacisa.webServiceNutrisim.repositories.FoodRepository;

@Service
public class FoodService extends ServiceAbs<Food>{

	
	@Autowired
	FoodRepository repository;
	
	
	public FoodService(JpaRepository<Food, Long> repository) {
		super(repository);
	}
	
	

}
