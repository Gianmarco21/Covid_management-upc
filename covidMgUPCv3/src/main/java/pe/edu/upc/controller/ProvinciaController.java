package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import pe.edu.upc.entities.Provincia;
import pe.edu.upc.service.IProvinciaService;

@Named
@RequestScoped
public class ProvinciaController {

	@Inject
	private IProvinciaService prService;

	// Atributos

	private Provincia provincia;
	List<Provincia> listaprovincias;

	// Constructor

	@PostConstruct
	public void init() {

		this.provincia = new Provincia();
		this.listaprovincias = new ArrayList<Provincia>();
		list();

	}

	// metodos

	public String newProvincia() {

		this.setProvincia(provincia);
		return "vaccination.xhtml";

	}

	public void insert() {

		prService.insert(provincia);
		list();
		
	}

	public void list() {

		listaprovincias = prService.list();

	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Provincia> getListaprovincias() {
		return listaprovincias;
	}

	public void setListaprovincias(List<Provincia> listaprovincias) {
		this.listaprovincias = listaprovincias;
	}

}
