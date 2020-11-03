package br.eleicao.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.eleicao.app.model.Candidato;

@Repository
public interface CandidatoRepository extends CrudRepository <Candidato, Long> {

}
