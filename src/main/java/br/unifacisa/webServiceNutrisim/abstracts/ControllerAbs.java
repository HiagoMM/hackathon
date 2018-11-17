package br.unifacisa.webServiceNutrisim.abstracts;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.unifacisa.webServiceNutrisim.exceptions.NotFoundException;
import br.unifacisa.webServiceNutrisim.exceptions.alreadyExistsException;
import br.unifacisa.webServiceNutrisim.interfaces.Identificable;


public abstract class ControllerAbs<A extends Identificable> {
	
	@Autowired
	protected ServiceAbs<A> service;
	
	public ControllerAbs(ServiceAbs<A> service) {
		this.service = service;
	}
	
	@GetMapping("/")
	public ResponseEntity<List<A>> getAll(){ // READ ALL
		return new ResponseEntity<List<A>>(service.getAll(),HttpStatus.OK);
	}
	
	
	@GetMapping("/{id}") //READ BY ID
	public ResponseEntity<A> getById(@Valid @PathVariable Long id) {
		service.getById(id);
		return new ResponseEntity<A>(service.getById(id),HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<A> add(@Valid @RequestBody A a) { //ADD A
		try {
			a = service.add(a);
			return new ResponseEntity<A>(a,HttpStatus.CREATED);
		} catch (alreadyExistsException e) {
			return new ResponseEntity<A>(HttpStatus.CONFLICT);
		}
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<A> put(@Valid @RequestBody A a,@PathVariable Long id)  { // ATUALIZA 
		try {
			service.put(a,id);
			return new ResponseEntity<A>(HttpStatus.OK);
		} catch (NotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> del(@PathVariable Long id) { // DELETA A
		try {
			service.delete(id);
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (NotFoundException e) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
		
	}
}