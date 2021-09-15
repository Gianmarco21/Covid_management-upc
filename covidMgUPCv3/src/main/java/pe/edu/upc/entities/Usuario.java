package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	private int idUsuario;

	@Column(name = "nombre1", nullable = false, length = 50)
	private String nombre1;
	
	@Column(name = "nombre2", nullable = false, length = 50)
	private String nombre2;
	
	@Column(name = "apellido1", nullable = false, length = 50)
	private String apellido1;
	
	@Column(name = "apellido2", nullable = false, length = 50)
	private String apellido2;
	
	@Column(name = "dni", nullable = false, length = 50)
	private int dni;
	
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	
	@Column(name = "telefono", nullable = false, length = 50)
	private int telefono;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int idUsuario, String nombre1, String nombre2, String apellido1, String apellido2, int dni,
			String email, int telefono) {
		super();
		this.idUsuario = idUsuario;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre1() {
		return nombre1;
	}

	public void setNombre1(String nombre1) {
		this.nombre1 = nombre1;
	}

	public String getNombre2() {
		return nombre2;
	}

	public void setNombre2(String nombre2) {
		this.nombre2 = nombre2;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
