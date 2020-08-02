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

import com.entities.Parametrage;
import com.metier.ParametrageMetier;

@RestController
public class ParametrageController {
	@Autowired
	private ParametrageMetier parametrageMetier;
    @PostMapping("/parametrages")
	public Parametrage addParametrage(@RequestBody Parametrage parametrage) {
		return parametrageMetier.addParametrage(parametrage);
	}
    @PutMapping("/parametrages")
	public Parametrage updateParametrage(@RequestBody Parametrage parametrage) {
		return parametrageMetier.updateParametrage(parametrage);
	}
    
    @GetMapping("/parametrages/{parametrage_id}")
    public Optional<Parametrage> findParametrage(@PathVariable Long parametrage_id) {
		return parametrageMetier.findParametrage(parametrage_id);
	}
	@GetMapping("/parametrages")
	public List<Parametrage> findAllParametrage() {
		return parametrageMetier.findAllParametrage();
	}
    @DeleteMapping("/parametrages/{parametrage_id}")
	public void deleteParametrage(@PathVariable Long parametrage_id) {
		parametrageMetier.deleteParametrage(parametrage_id);
	}
	

}
