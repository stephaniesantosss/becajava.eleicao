package br.eleicao.app;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.eleicao.app.model.Candidato;
import br.eleicao.app.model.Eleitor;
import br.eleicao.app.model.Municipio;
import br.eleicao.app.model.Voto;
import br.eleicao.app.model.Zona;
import br.eleicao.app.repository.CandidatoRepository;
import br.eleicao.app.repository.EleitorRepository;
import br.eleicao.app.repository.MunicipioRepository;
import br.eleicao.app.repository.VotoRepository;
import br.eleicao.app.repository.ZonaRepository;

@SpringBootApplication
public class EleicaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}
}
