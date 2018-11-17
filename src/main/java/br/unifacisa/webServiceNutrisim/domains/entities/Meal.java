package br.unifacisa.webServiceNutrisim.domains.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import br.unifacisa.webServiceNutrisim.interfaces.Identificable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Meal implements Identificable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull(message = "{string.not.null}")
	private Integer qty;

	@NotNull(message = "{string.not.null}")
	@OneToOne
	private Food food;

}
