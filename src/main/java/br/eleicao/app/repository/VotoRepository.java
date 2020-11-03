package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.Voto;

@Repository
public interface VotoRepository extends CrudRepository <Voto, Long> {

}
