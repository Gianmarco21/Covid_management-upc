package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Padecimiento;
import pe.edu.upc.service.IPadecimientoService;

@Named
@RequestScoped
public class PadecimientoController {

	@Inject
	private IPadecimientoService pService;

	// Atributos

	private Padecimiento padecimiento;
	List<Padecimiento> listapadecimientos;

	// Constructor

	@PostConstruct
	public void init() {

		this.padecimiento = new Padecimiento();
		this.listapadecimientos = new ArrayList<Padecimiento>();
		list();
		
	}

	// Metodos

	public String newPadecimiento() {

		this.setPadecimiento(new Padecimiento());
		return "padecimiento.xhtml";

	}

	public void insert() {

		pService.insert(padecimiento);
		list();
	}

	public void list() {

		listapadecimientos = pService.list();

	}

	public Padecimiento getPadecimiento() {
		return padecimiento;
	}

	public void setPadecimiento(Padecimiento padecimiento) {
		this.padecimiento = padecimiento;
	}

	public List<Padecimiento> getListapadecimientos() {
		return listapadecimientos;
	}

	public void setListapadecimientos(List<Padecimiento> listapadecimientos) {
		this.listapadecimientos = listapadecimientos;
	}

}
