package br.unifacisa.webServiceNutrisim.repositories;



import java.util.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.unifacisa.webServiceNutrisim.domains.entities.DayFoods;

@Repository
public interface DayFoodsRepository extends JpaRepository<DayFoods, Long> {
	
//	List<DayFoods> findByDateBetween (Date data1, Date data2);

}
