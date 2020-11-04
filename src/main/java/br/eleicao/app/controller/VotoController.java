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

import br.eleicao.app.model.Voto;
import br.eleicao.app.repository.VotoRepository;

@RestController
@RequestMapping("/votos")
public class VotoController {
	final VotoRepository _votoRepository;

	public VotoController(VotoRepository votoRepository) {
		_votoRepository = votoRepository;
	}

	@PostMapping
	public ResponseEntity inserir(@RequestBody Voto voto) {
		_votoRepository.save(voto);

		return ResponseEntity.status(HttpStatus.CREATED).body("Voto Criado com Sucesso");
	}

	@GetMapping
	public ResponseEntity listar() {

		Iterable<Voto> voto = _votoRepository.findAll();
		
		return ResponseEntity.status(HttpStatus.OK).body(voto);
	}

	@GetMapping(path = "/{id}")
    public ResponseEntity obter(@PathVariable Long id) {    	  	    	
		Optional<Voto> voto = _votoRepository.findById(id);    	
        return ResponseEntity.status(HttpStatus.OK).body(voto);
    }
	

    @PutMapping(path = "/{id}")
    public ResponseEntity atualizar(@RequestBody Voto voto, @PathVariable Long id) {
    	voto.setId(id);
		_votoRepository.save(voto);		
        return ResponseEntity.status(HttpStatus.OK).body("Voto atualizado com sucesso!");
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity deletar(@PathVariable Long id) {
    	_votoRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
