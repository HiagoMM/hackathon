package br.unifacisa.webServiceNutrisim.domains.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import br.unifacisa.webServiceNutrisim.interfaces.Identificable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class People implements Identificable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message =  "{string.not.blank}")
	private String name;

	@NotNull(message = "{string.not.null}")
	private Integer telephone;
	@NotBlank(message =  "{string.not.blank}")
	@Email(message = "{email.validation}")
	private String email;
	@NotBlank(message =  "{string.not.blank}")
	private String password;

	@NotNull(message = "{string.not.null}")
	private Integer age;

	@NotNull(message = "{string.not.null}")
	@Positive(message = "{positive}")
	private Double weight;

	@NotNull(message = "{string.not.null}")
	@Positive(message = "{positive}")
	private Double height;

	@OneToMany
	private List<DayFoods> foodDiary; 


}
