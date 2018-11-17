package br.unifacisa.webServiceNutrisim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifacisa.webServiceNutrisim.abstracts.ServiceAbs;
import br.unifacisa.webServiceNutrisim.domains.entities.People;
import br.unifacisa.webServiceNutrisim.exceptions.alreadyExistsException;
import br.unifacisa.webServiceNutrisim.repositories.PeopleRepository;


@Service
public class PeopleService extends ServiceAbs<People> {
	
	@Autowired
	private PeopleRepository repository;
	
	
	@Autowired
	public PeopleService(PeopleRepository repository) {
		super(repository);
	}
	
	
	@Override
	public People add(People t) throws alreadyExistsException { // ADD 
		if (t.getId() == null && !repository.existsByEmail(t.getEmail())) {
			return repository.save(t);

		}else {
			throw new alreadyExistsException("already exists on data base try use Put");
		}
		
	}


}
