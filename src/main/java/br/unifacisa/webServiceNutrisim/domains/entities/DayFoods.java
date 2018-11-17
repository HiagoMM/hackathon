package br.unifacisa.webServiceNutrisim.domains.entities;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.unifacisa.webServiceNutrisim.interfaces.Identificable;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor

public class DayFoods  implements Identificable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	private Date date = new Date();

	@OneToMany
	private List<Meal> breakfast;
	@OneToMany
	private List<Meal> snack;
	@OneToMany
	private List<Meal> lunch;
	@OneToMany
	private List<Meal> afternoonSnack;
	@OneToMany
	private List<Meal> dinner;



}
