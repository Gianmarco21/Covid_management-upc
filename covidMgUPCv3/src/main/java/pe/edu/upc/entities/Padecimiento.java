package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Padecimiento")
public class Padecimiento {

	@Id
	private int idPadecimiento;

	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;

	@Column(name = "gravedad", nullable = false, length = 50)
	private String gravedad;

	public Padecimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Padecimiento(int idPadecimiento, String nombre, String gravedad) {
		super();
		this.idPadecimiento = idPadecimiento;
		this.nombre = nombre;
		this.gravedad = gravedad;
	}

	public int getIdPadecimiento() {
		return idPadecimiento;
	}

	public void setIdPadecimiento(int idPadecimiento) {
		this.idPadecimiento = idPadecimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGravedad() {
		return gravedad;
	}

	public void setGravedad(String gravedad) {
		this.gravedad = gravedad;
	}

}
