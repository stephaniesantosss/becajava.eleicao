package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.Eleitor;

@Repository
public interface EleitorRepository extends CrudRepository <Eleitor, Long> {

}
