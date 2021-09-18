package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Medico;
import pe.edu.upc.service.IMedicoService;

@Named
@RequestScoped
public class MedicoController {

	@Inject
	private IMedicoService mService;

	// atributos

	private Medico medico;
	List<Medico> listamedicos;

	// Constructor

	@PostConstruct
	public void init() {

		this.medico = new Medico();
		this.listamedicos = new ArrayList<Medico>();
		list();

	}

	// métodos

	public String newMedico() {

		this.setMedico(new Medico());

		return "medico.xhtml";

	}

	public void insert() {

		mService.insert(medico);
		list();
		
	}

	public void list() {

		listamedicos = mService.list();

	}

	// setters y getters

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public List<Medico> getListamedicos() {
		return listamedicos;
	}

	public void setListamedicos(List<Medico> listamedicos) {
		this.listamedicos = listamedicos;
	}

}
