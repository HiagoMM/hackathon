package br.unifacisa.webServiceNutrisim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.webServiceNutrisim.domains.entities.People;

@Repository
public interface PeopleRepository  extends JpaRepository<People, Long>{
	
	Boolean existsByEmail(String email);
}
