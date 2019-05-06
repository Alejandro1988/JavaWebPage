package com.pagina.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "levadura", schema = "pagina", catalog = "")
public class LevaduraEntity {
	private int id;
	private String nombre;
	private String nombreComercial;

	@Id
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "nombre", nullable = false, length = 25)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Basic
	@Column(name = "nombreComercial", nullable = false, length = 5)
	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		LevaduraEntity that = (LevaduraEntity) o;
		return id == that.id &&
				Objects.equals(nombre, that.nombre) &&
				Objects.equals(nombreComercial, that.nombreComercial);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, nombreComercial);
	}
}
