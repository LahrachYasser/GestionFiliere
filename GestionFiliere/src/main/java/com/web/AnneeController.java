package com.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Annee;
import com.metier.AnneeMetier;

@RestController
public class AnneeController {
	@Autowired
	private AnneeMetier anneeMetier;

	@PostMapping("/annees")
	public Annee addAnnee(@RequestBody Annee annee) {
		return anneeMetier.addAnnee(annee);
	}

	@PutMapping("/annees")
	public Annee updateAnnee(@RequestBody Annee annee) {
		return anneeMetier.updateAnnee(annee);
	}

	@GetMapping("/annees/{id}")
	public Optional<Annee> findAnnee(@PathVariable Long id) {
		return anneeMetier.findAnnee(id);
	}

	@GetMapping("/annees")
	public List<Annee> findAllAnnee() {
		return anneeMetier.findAllAnnee();
	}

	@DeleteMapping("/annees/{id}")
	public void deleteAnnee(@PathVariable Long id) {
		anneeMetier.deleteAnnee(id);
	}

}
