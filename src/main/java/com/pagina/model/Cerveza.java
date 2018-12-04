package com.pagina.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cerveza")
public class Cerveza {
	@Id
	private int id;
	private String nombre;
	private short densidInicial;
	private short densidFinal;
	private BigDecimal ibus;
	private BigDecimal alcohol;
	private BigDecimal aguaMacerado;
	private Short aguaMaceradoTemp;
	private BigDecimal aguaLavado;
	private Short aguaLavadoTemp;
	private Time maceracionTiempo;
	private Short maceracionTemp;
	private Time hervido;

	@ManyToMany
	@JoinTable(
			name = "cerveza_malta",
			joinColumns = @JoinColumn(
					name = "idCerveza",
					referencedColumnName = "id"
			),
			inverseJoinColumns = @JoinColumn(
					name = "idMalta",
					referencedColumnName = "id"
			)
	)
	private List<MaltaEntity> maltas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public short getDensidInicial() {
		return densidInicial;
	}

	public void setDensidInicial(short densidInicial) {
		this.densidInicial = densidInicial;
	}

	public short getDensidFinal() {
		return densidFinal;
	}

	public void setDensidFinal(short densidFinal) {
		this.densidFinal = densidFinal;
	}

	public BigDecimal getIbus() {
		return ibus;
	}

	public void setIbus(BigDecimal ibus) {
		this.ibus = ibus;
	}

	public BigDecimal getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(BigDecimal alcohol) {
		this.alcohol = alcohol;
	}

	public BigDecimal getAguaMacerado() {
		return aguaMacerado;
	}

	public void setAguaMacerado(BigDecimal aguaMacerado) {
		this.aguaMacerado = aguaMacerado;
	}

	public Short getAguaMaceradoTemp() {
		return aguaMaceradoTemp;
	}

	public void setAguaMaceradoTemp(Short aguaMaceradoTemp) {
		this.aguaMaceradoTemp = aguaMaceradoTemp;
	}

	public BigDecimal getAguaLavado() {
		return aguaLavado;
	}

	public void setAguaLavado(BigDecimal aguaLavado) {
		this.aguaLavado = aguaLavado;
	}

	public Short getAguaLavadoTemp() {
		return aguaLavadoTemp;
	}

	public void setAguaLavadoTemp(Short aguaLavadoTemp) {
		this.aguaLavadoTemp = aguaLavadoTemp;
	}

	public Time getMaceracionTiempo() {
		return maceracionTiempo;
	}

	public void setMaceracionTiempo(Time maceracionTiempo) {
		this.maceracionTiempo = maceracionTiempo;
	}

	public Short getMaceracionTemp() {
		return maceracionTemp;
	}

	public void setMaceracionTemp(Short maceracionTemp) {
		this.maceracionTemp = maceracionTemp;
	}

	public Time getHervido() {
		return hervido;
	}

	public void setHervido(Time hervido) {
		this.hervido = hervido;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Cerveza that = (Cerveza) o;
		return id == that.id &&
				densidInicial == that.densidInicial &&
				densidFinal == that.densidFinal &&
				Objects.equals(nombre, that.nombre) &&
				Objects.equals(ibus, that.ibus) &&
				Objects.equals(alcohol, that.alcohol) &&
				Objects.equals(aguaMacerado, that.aguaMacerado) &&
				Objects.equals(aguaMaceradoTemp, that.aguaMaceradoTemp) &&
				Objects.equals(aguaLavado, that.aguaLavado) &&
				Objects.equals(aguaLavadoTemp, that.aguaLavadoTemp) &&
				Objects.equals(maceracionTiempo, that.maceracionTiempo) &&
				Objects.equals(maceracionTemp, that.maceracionTemp) &&
				Objects.equals(hervido, that.hervido);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nombre, densidInicial, densidFinal, ibus, alcohol, aguaMacerado, aguaMaceradoTemp, aguaLavado, aguaLavadoTemp, maceracionTiempo, maceracionTemp, hervido);
	}
}
