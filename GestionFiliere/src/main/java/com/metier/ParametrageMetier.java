package com.metier;

import java.util.List;
import java.util.Optional;

import com.entities.Parametrage;

public interface ParametrageMetier {

	public Parametrage addParametrage(Parametrage parametrage);

	public Parametrage updateParametrage(Parametrage parametrage);

	public Optional<Parametrage> findParametrage(Long parametrage_id);

	public List<Parametrage> findAllParametrage();

	public void deleteParametrage(Long parametrage_id);


}
