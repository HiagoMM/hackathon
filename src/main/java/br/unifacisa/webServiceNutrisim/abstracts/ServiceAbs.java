package br.unifacisa.webServiceNutrisim.abstracts;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.unifacisa.webServiceNutrisim.exceptions.NotFoundException;
import br.unifacisa.webServiceNutrisim.exceptions.alreadyExistsException;
import br.unifacisa.webServiceNutrisim.interfaces.Identificable;



public abstract class ServiceAbs <T extends Identificable >{
	
	@Autowired
	protected JpaRepository<T, Long> repository;
	
	@Autowired
	public ServiceAbs(JpaRepository<T,Long> repository) {
		this.repository = repository;
	}
	
	public List<T> getAll() {  //READ ALL
		return repository.findAll();
	}
	
	public T getById(Long id) { //READ BY ID
		return repository.findById(id).get() ;
	}
	
	public T add(T t) throws alreadyExistsException { // ADD 
		if (t.getId() == null) {
			return repository.save(t);
		}else {
			throw new alreadyExistsException("already exists on data base try use Put");
		}
		
	}
	
	public T put( T t, Long id)throws NotFoundException{ // ATUALIZA
		if (repository.existsById( id )) {
			return repository.save(t);
		}throw new NotFoundException("That id not exists on data base !! ");
	}
	
	
	public void delete( Long id ) throws NotFoundException { // DELETE
		if (repository.existsById(id)) {
			repository.deleteById(id); 
		}else{
			throw new NotFoundException("That id not exists on data base !! ");
		}
	}

	public JpaRepository<T, Long> getRepository() {
		return repository;
	}

	public void setRepository(JpaRepository<T, Long> repository) {
		this.repository = repository;
	}
		
}