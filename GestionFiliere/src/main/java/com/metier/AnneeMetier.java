package com.metier;

import java.util.List;
import java.util.Optional;

import com.entities.Annee;

public interface AnneeMetier {
	public Annee addAnnee(Annee annee);
	public Annee updateAnnee(Annee annee);
	
	public Optional<Annee> findAnnee(Long id);
	public List<Annee> findAllAnnee();
	public void deleteAnnee(Long id);

}
