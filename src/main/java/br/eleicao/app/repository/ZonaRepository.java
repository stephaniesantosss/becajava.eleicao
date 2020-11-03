package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.Zona;

@Repository
public interface ZonaRepository extends CrudRepository <Zona, Long> {

}
