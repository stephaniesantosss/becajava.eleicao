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
public class EleicaoApplication implements CommandLineRunner {
	//final CandidatoRepository _candidatoRepository;
    //final EleitorRepository _eleitorRepository;
       final VotoRepository _votoRepository;
     // final ZonaRepository _zonaRepository;
//	final MunicipioRepository _municipioRepository; // Criando propriedade da Interface Município

//	public EleicaoApplication(MunicipioRepository municipioRepository) {
//		_municipioRepository = municipioRepository; // Alimentando a propriedade com a construção da classe
//	}

	public static void main(String[] args) {
		SpringApplication.run(EleicaoApplication.class, args);
	}

//
//	@Override
//	public void run(String... args) throws Exception {
//
////		// Salvar Município
////		Municipio municipio = new Municipio();
////		municipio.setNome("São Paulo");
////		municipio.setPopulacao(14000000);
////		_municipioRepository.save(municipio);
////		System.out.println("Município salvo com sucesso!");
////
////		municipio = new Municipio();
////		municipio.setNome("Sorocaba");
////		municipio.setPopulacao(140000);
////		_municipioRepository.save(municipio);
////		System.out.println("Município salvo com sucesso!");
////
////		municipio = new Municipio();
////		municipio.setNome("Guarulhos");
////		municipio.setPopulacao(1400000);
////		_municipioRepository.save(municipio);
////		System.out.println("Município salvo com sucesso!");
//
//	   // Deletando um município
////		Municipio municipio = new Municipio();		
////		municipio.setId(new Long(2));
////		_municipioRepository.delete(municipio);;
////		System.out.println("Município deletado com sucesso!");
//
//		// Atualizando um município
////		Municipio municipio = new Municipio();
////		municipio.setId(new Long(1));
////		municipio.setNome("São Paulo");
////		municipio.setPopulacao(1400);		
////		_municipioRepository.save(municipio);		
////		System.out.println("Município atualizado com sucesso!");	
//
//		// Selecionando apenas UM município
////		Optional<Municipio> municipio = _municipioRepository.findById(new Long(3));
////		System.out.println("Município: " + municipio.get().getNome());
//
//		// Selecionando todos os municípios
////		Iterable<Municipio> municipios = _municipioRepository.findAll();		
////		for(Municipio m : municipios) {
////			System.out.println("Município: " + m.getNome());
//		//}
//
//	}
//	public EleicaoApplication(CandidatoRepository candidatoRepository) {
//		_candidatoRepository = candidatoRepository; // Alimentando a propriedade com a construção da classe
//	}

//	@Override
//	public void run(String... args) throws Exception {

		// SALVAR CANDIDATO
//		Candidato candidato = new Candidato();
//		candidato.setNome("Stephanie");
//		candidato.setTipo("Prefeito");
//		candidato.setNumero(17);
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato Salvo Com Sucesso!");
//
//		candidato = new Candidato();
//		candidato.setNome("Jhony");
//		candidato.setTipo("Vereador");
//		candidato.setNumero(10);
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato Salvo Com Sucesso!");
//
//		candidato = new Candidato();
//		candidato.setNome("John");
//		candidato.setTipo("Vereador");
//		candidato.setNumero(18);
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato Salvo Com Sucesso!");
//		
//		candidato = new Candidato();
//		candidato.setNome("Belinha");
//		candidato.setTipo("Prefeito");
//		candidato.setNumero(12);
//		_candidatoRepository.save(candidato);
//		System.out.println("Candidato Salvo Com Sucesso!");

		// DELETANDO CANDIDATO
//		Candidato candidato = new Candidato();
//		candidato.setId(new Long(4));
//		_candidatoRepository.delete(candidato);
//		System.out.println("Candidato deletado com sucesso!");

//		// ATUALIZANDO UM CANDIDATO
//		Candidato candidato = new Candidato();
//		candidato.setId(new Long(1));
//		candidato.setNome("Stephanie S");
//		candidato.setTipo("Vereador");
//		candidato.setNumero(81);		
//		_candidatoRepository.save(candidato);		
//		System.out.println("Candidato atualizado com sucesso!");	

		//SELECIONANDO APENAS UM CANDIDATO
//		Optional<Candidato> candidato = _candidatoRepository.findById(new Long(3));
//		System.out.println("Candidato: " + candidato.get().getNome());

	    //SELECIONANDO TODOS OS CANDIDATOS
//		Iterable<Candidato> candidato = _candidatoRepository.findAll();		
//		for(Candidato m : candidato) {
//		System.out.println("Candidatos: " + m.getNome());
		//}
//	}
	
//	public EleicaoApplication(EleitorRepository eleitorRepository) {
//		_eleitorRepository = eleitorRepository; // Alimentando a propriedade com a construção da classe
//	}
//	@Override
//	public void run(String... args) throws Exception {

		// SALVAR ELEITOR
//		Eleitor eleitor = new Eleitor();
//		eleitor.setNome("Belinha");
//		_eleitorRepository.save(eleitor);
//		System.out.println("Eleitor Salvo Com Sucesso!");
//		
//		eleitor = new Eleitor();
//		eleitor.setNome("Jhony O");
//		_eleitorRepository.save(eleitor);
//		System.out.println("Eleitor Salvo Com Sucesso!");
//		
//		eleitor = new Eleitor();
//		eleitor.setNome("John R");
//		_eleitorRepository.save(eleitor);
//		System.out.println("Eleitor Salvo Com Sucesso!");
//		
//		eleitor = new Eleitor();
//		eleitor.setNome("Stephanie R");
//		_eleitorRepository.save(eleitor);
//		System.out.println("Eleitor Salvo Com Sucesso!");
	
		
		// DELETANDO ELEITOR
//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(new Long(2));
//		_eleitorRepository.delete(eleitor);
//		System.out.println("Candidato deletado com sucesso!");

		// ATUALIZANDO UM CANDIDATO
//		Eleitor eleitor = new Eleitor();
//		eleitor.setId(new Long(1));
//		eleitor.setNome("Belinha Rodrigues");		
//		_eleitorRepository.save(eleitor);		
//		System.out.println("Candidato atualizado com sucesso!");	

		//SELECIONANDO APENAS UM ELEITOR
//		Optional<Eleitor> eleitor = _eleitorRepository.findById(new Long(3));
//		System.out.println("Eleitor: " + eleitor.get().getNome());

	    //SELECIONANDO TODOS OS ELEITORES
//		Iterable<Eleitor> eleitor = _eleitorRepository.findAll();		
//		for(Eleitor m : eleitor) {
//		System.out.println("Eleitores: " + m.getNome());
//		
//	}
	
//	public EleicaoApplication(ZonaRepository zonaRepository) {
//		_zonaRepository = zonaRepository; // Alimentando a propriedade com a construção da classe
//	}
//	@Override
//	public void run(String... args) throws Exception {

		// SALVAR ZONA
//		Zona zona = new Zona();
//		zona.setNumero(8);
//		_zonaRepository.save(zona);
//		System.out.println("Zona Salvo Com Sucesso!");
//		
//		zona = new Zona();
//		zona.setNumero(3);
//		_zonaRepository.save(zona);
//		System.out.println("Zona Salvo Com Sucesso!");
//	
//		zona = new Zona();
//		zona.setNumero(5);
//		_zonaRepository.save(zona);
//		System.out.println("Zona Salvo Com Sucesso!");
	
		
		// DELETANDO ZONA
//		Zona zona = new Zona();
//		zona.setId(new Long(2));
//		_zonaRepository.delete(zona);
//		System.out.println("Zona deletado com sucesso!");

		// ATUALIZANDO UMA ZONA
//		Zona zona = new Zona();
//		zona.setId(new Long(1));
//		zona.setNumero(10);		
//		_zonaRepository.save(zona);		
//		System.out.println("Zona atualizada com sucesso!");	

		//SELECIONANDO APENAS UM ELEITOR
//		Optional<Zona> zona = _zonaRepository.findById(new Long(3));
//		System.out.println("Zona: " + zona.get().getNumero());

	    //SELECIONANDO TODOS OS ELEITORES
//		Iterable<Zona> zona = _zonaRepository.findAll();		
//		for(Zona m : zona) {
//		System.out.println("Zonas: " + m.getNumero());
//	}
	
	public EleicaoApplication(VotoRepository votoRepository) {
		_votoRepository = votoRepository; // Alimentando a propriedade com a construção da classe
	}
	@Override
	public void run(String... args) throws Exception {

		// SALVAR ZONA
//		Voto voto = new Voto();
//		voto.setCodigo(111);
//		_votoRepository.save(voto);
//		System.out.println("Zona Salvo Com Sucesso!");
//
//		voto = new Voto();
//		voto.setCodigo(222);
//		_votoRepository.save(voto);
//		System.out.println("Zona Salvo Com Sucesso!");
//		
//		voto = new Voto();
//		voto.setCodigo(333);
//		_votoRepository.save(voto);
//		System.out.println("Zona Salvo Com Sucesso!");
	
		
		// DELETANDO VOTO
//		Voto voto = new Voto();
//		voto.setId(new Long(2));
//		_votoRepository.delete(voto);
//		System.out.println("Voto deletado com sucesso!");

		// ATUALIZANDO UM VOTO
//		Voto voto = new Voto();
//		voto.setId(new Long(1));
//		voto.setCodigo(101);		
//		_votoRepository.save(voto);		
//		System.out.println("Voto atualizado com sucesso!");	

		//SELECIONANDO APENAS UM VOTO
//		Optional<Voto> voto = _votoRepository.findById(new Long(3));
//		System.out.println("Voto: " + voto.get().getCodigo());

	    //SELECIONANDO TODOS OS VOTOS
		Iterable<Voto> voto = _votoRepository.findAll();		
		for(Voto m : voto) {
		System.out.println("Zonas: " + m.getCodigo());
	}
  }
}
