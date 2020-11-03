package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.Municipio;

@Repository
public interface MunicipioRepository extends CrudRepository <Municipio, Long> {
	

}
