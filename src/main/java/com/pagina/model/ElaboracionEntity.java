package com.pagina.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "elaboracion", schema = "pagina", catalog = "")
public class ElaboracionEntity {
	private int id;
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
	private BigDecimal litrosFinalesFermentador;
	private Integer botellas;
	private BigDecimal azucarBotellas;
	private String notas;

	@Id
	@Column(name = "id", nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Basic
	@Column(name = "densidInicial", nullable = false)
	public short getDensidInicial() {
		return densidInicial;
	}

	public void setDensidInicial(short densidInicial) {
		this.densidInicial = densidInicial;
	}

	@Basic
	@Column(name = "densidFinal", nullable = false)
	public short getDensidFinal() {
		return densidFinal;
	}

	public void setDensidFinal(short densidFinal) {
		this.densidFinal = densidFinal;
	}

	@Basic
	@Column(name = "IBUS", nullable = true, precision = 2)
	public BigDecimal getIbus() {
		return ibus;
	}

	public void setIbus(BigDecimal ibus) {
		this.ibus = ibus;
	}

	@Basic
	@Column(name = "alcohol", nullable = true, precision = 2)
	public BigDecimal getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(BigDecimal alcohol) {
		this.alcohol = alcohol;
	}

	@Basic
	@Column(name = "aguaMacerado", nullable = true, precision = 2)
	public BigDecimal getAguaMacerado() {
		return aguaMacerado;
	}

	public void setAguaMacerado(BigDecimal aguaMacerado) {
		this.aguaMacerado = aguaMacerado;
	}

	@Basic
	@Column(name = "aguaMaceradoTemp", nullable = true)
	public Short getAguaMaceradoTemp() {
		return aguaMaceradoTemp;
	}

	public void setAguaMaceradoTemp(Short aguaMaceradoTemp) {
		this.aguaMaceradoTemp = aguaMaceradoTemp;
	}

	@Basic
	@Column(name = "aguaLavado", nullable = true, precision = 2)
	public BigDecimal getAguaLavado() {
		return aguaLavado;
	}

	public void setAguaLavado(BigDecimal aguaLavado) {
		this.aguaLavado = aguaLavado;
	}

	@Basic
	@Column(name = "aguaLavadoTemp", nullable = true)
	public Short getAguaLavadoTemp() {
		return aguaLavadoTemp;
	}

	public void setAguaLavadoTemp(Short aguaLavadoTemp) {
		this.aguaLavadoTemp = aguaLavadoTemp;
	}

	@Basic
	@Column(name = "maceracionTiempo", nullable = true)
	public Time getMaceracionTiempo() {
		return maceracionTiempo;
	}

	public void setMaceracionTiempo(Time maceracionTiempo) {
		this.maceracionTiempo = maceracionTiempo;
	}

	@Basic
	@Column(name = "maceracionTemp", nullable = true)
	public Short getMaceracionTemp() {
		return maceracionTemp;
	}

	public void setMaceracionTemp(Short maceracionTemp) {
		this.maceracionTemp = maceracionTemp;
	}

	@Basic
	@Column(name = "hervido", nullable = true)
	public Time getHervido() {
		return hervido;
	}

	public void setHervido(Time hervido) {
		this.hervido = hervido;
	}

	@Basic
	@Column(name = "litrosFinalesFermentador", nullable = true, precision = 2)
	public BigDecimal getLitrosFinalesFermentador() {
		return litrosFinalesFermentador;
	}

	public void setLitrosFinalesFermentador(BigDecimal litrosFinalesFermentador) {
		this.litrosFinalesFermentador = litrosFinalesFermentador;
	}

	@Basic
	@Column(name = "botellas", nullable = true)
	public Integer getBotellas() {
		return botellas;
	}

	public void setBotellas(Integer botellas) {
		this.botellas = botellas;
	}

	@Basic
	@Column(name = "azucarBotellas", nullable = true, precision = 2)
	public BigDecimal getAzucarBotellas() {
		return azucarBotellas;
	}

	public void setAzucarBotellas(BigDecimal azucarBotellas) {
		this.azucarBotellas = azucarBotellas;
	}

	@Basic
	@Column(name = "notas", nullable = true, length = 255)
	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ElaboracionEntity that = (ElaboracionEntity) o;
		return id == that.id &&
				densidInicial == that.densidInicial &&
				densidFinal == that.densidFinal &&
				Objects.equals(ibus, that.ibus) &&
				Objects.equals(alcohol, that.alcohol) &&
				Objects.equals(aguaMacerado, that.aguaMacerado) &&
				Objects.equals(aguaMaceradoTemp, that.aguaMaceradoTemp) &&
				Objects.equals(aguaLavado, that.aguaLavado) &&
				Objects.equals(aguaLavadoTemp, that.aguaLavadoTemp) &&
				Objects.equals(maceracionTiempo, that.maceracionTiempo) &&
				Objects.equals(maceracionTemp, that.maceracionTemp) &&
				Objects.equals(hervido, that.hervido) &&
				Objects.equals(litrosFinalesFermentador, that.litrosFinalesFermentador) &&
				Objects.equals(botellas, that.botellas) &&
				Objects.equals(azucarBotellas, that.azucarBotellas) &&
				Objects.equals(notas, that.notas);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, densidInicial, densidFinal, ibus, alcohol, aguaMacerado, aguaMaceradoTemp, aguaLavado, aguaLavadoTemp, maceracionTiempo, maceracionTemp, hervido, litrosFinalesFermentador, botellas, azucarBotellas, notas);
	}
}
