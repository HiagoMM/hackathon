package br.unifacisa.webServiceNutrisim.domains.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import br.unifacisa.webServiceNutrisim.interfaces.Identificable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Food implements Identificable{
		
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
		@NotNull(message = "{string.not.null}")
        private Integer qty;
		
		@NotNull(message = "{string.not.null}")
		private Double kcal;
		@NotNull(message = "{string.not.null}")
		private Double protein;
		@NotNull(message = "{string.not.null}")
		private Double carbohydrate;
		@NotNull(message = "{string.not.null}")
		private Double lipid;
}
