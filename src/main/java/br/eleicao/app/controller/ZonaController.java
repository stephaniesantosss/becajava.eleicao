package br.eleicao.app.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.eleicao.app.model.Zona;
import br.eleicao.app.repository.ZonaRepository;

@RestController
@RequestMapping("/zonas")
public class ZonaController {
	final ZonaRepository _zonaRepository;

	public ZonaController(ZonaRepository zonaRepository) {
		_zonaRepository = zonaRepository;
	}

	@PostMapping
	public ResponseEntity inserir(@RequestBody Zona zona) {
		_zonaRepository.save(zona);

		return ResponseEntity.status(HttpStatus.CREATED).body("Zona Criada com Sucesso");
	}

	@GetMapping
	public ResponseEntity listar() {

		Iterable<Zona> zona = _zonaRepository.findAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(zona);
	}

	@GetMapping(path = "/{id}")
    public ResponseEntity obter(@PathVariable Long id) {    	  	    	
		Optional<Zona> zona = _zonaRepository.findById(id);    	
        return ResponseEntity.status(HttpStatus.OK).body(zona);
    }
	

    @PutMapping(path = "/{id}")
    public ResponseEntity atualizar(@RequestBody Zona zona, @PathVariable Long id) {
    	zona.setId(id);
		_zonaRepository.save(zona);		
        return ResponseEntity.status(HttpStatus.OK).body("Zona atualizada com sucesso!");
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
    	_zonaRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
