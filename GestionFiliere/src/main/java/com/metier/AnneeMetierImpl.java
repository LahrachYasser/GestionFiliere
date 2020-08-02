package com.metier;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Annee;
import com.repository.AnneeRepository;
@Component
public class AnneeMetierImpl implements AnneeMetier {

	@Autowired
	private AnneeRepository anneeRepository;
	
	//Saving "Annee"
	@Override
	public Annee addAnnee(Annee annee) {
		return anneeRepository.save(annee);
	}

	//Updating "Annee"
	@Override
	public Annee updateAnnee(Annee annee) {
		return anneeRepository.save(annee);
	}
	
	//Finding "Annee"
	@Override
	public Optional<Annee> findAnnee(Long id) {
		return anneeRepository.findById(id);
	}
	
	//Finding All "Annee"
	@Override
	public List<Annee> findAllAnnee() {
		return anneeRepository.findAll();
	}
	
	//Deleting "Annee"
	@Override
	public void deleteAnnee(Long id) {
		anneeRepository.deleteById(id);
		
	}


}
