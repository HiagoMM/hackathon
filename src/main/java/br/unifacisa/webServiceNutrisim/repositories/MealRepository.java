package br.unifacisa.webServiceNutrisim.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unifacisa.webServiceNutrisim.domains.entities.Meal;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {

}
