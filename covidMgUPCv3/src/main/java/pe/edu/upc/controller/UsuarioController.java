package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

@Named
@RequestScoped
public class UsuarioController {

	@Inject
	private IUsuarioDao uService;

	// atributos

	private Usuario usuario;
	List<Usuario> listausuarios;

	// constructors

	@PostConstruct
	public void init() {

		this.usuario = new Usuario();
		this.listausuarios = new ArrayList<Usuario>();

	}

	// metodos

	public String newUsuario() {

		this.setUsuario(new Usuario());
		return "vaccinarion.xhtml";

	}

	public void insert() {

		uService.insert(usuario);

	}

	public void list() {

		uService.list();

	}

	// getters and setters

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListausuarios() {
		return listausuarios;
	}

	public void setListausuarios(List<Usuario> listausuarios) {
		this.listausuarios = listausuarios;
	}

}
