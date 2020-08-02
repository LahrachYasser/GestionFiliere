package com.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Parametrage;
import com.repository.ParametrageRepository;
@Component
public class ParametrageMetierImpl implements ParametrageMetier {

	@Autowired
	private ParametrageRepository parametrageRepository;

	//Saving "Parametrage"
	@Override
	public Parametrage addParametrage(Parametrage parametrage) {
		return parametrageRepository.save(parametrage);
	}

	//Updating "Parametrage"
	@Override
	public Parametrage updateParametrage(Parametrage parametrage) {
		return parametrageRepository.save(parametrage);
	}
    
	//Finding "Parametrage"
	@Override
	public Optional<Parametrage> findParametrage(Long parametrage_id) {
		return parametrageRepository.findById(parametrage_id);
	}
	

	//Finding All "Parametrage"
	@Override
	public List<Parametrage> findAllParametrage() {
		return parametrageRepository.findAll();
	}
    
	//Deleting "Parametrage"
	@Override
	public void deleteParametrage(Long parametrage_id) {
		parametrageRepository.deleteById(parametrage_id);
	}

}
