package com.example.demo.uce.controller.DTO;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Agendamiento {
	private Integer numeroCita;
	private LocalDate fechaCita;
	private BigDecimal valorCita;
	private String lugarCita;
	private String cedulaDoctor;
	private String cedulaPaciente;
	
	public Agendamiento() {
		super();
	}
	public Agendamiento(Integer numeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		super();
		this.numeroCita = numeroCita;
		this.fechaCita = fechaCita;
		this.valorCita = valorCita;
		this.lugarCita = lugarCita;
		this.cedulaDoctor = cedulaDoctor;
		this.cedulaPaciente = cedulaPaciente;
	}
	public Integer getNumeroCita() {
		return numeroCita;
	}
	public void setNumeroCita(Integer numeroCita) {
		this.numeroCita = numeroCita;
	}
	public LocalDate getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDate fechaCita) {
		this.fechaCita = fechaCita;
	}
	public BigDecimal getValorCita() {
		return valorCita;
	}
	public void setValorCita(BigDecimal valorCita) {
		this.valorCita = valorCita;
	}
	public String getLugarCita() {
		return lugarCita;
	}
	public void setLugarCita(String lugarCita) {
		this.lugarCita = lugarCita;
	}
	public String getCedulaDoctor() {
		return cedulaDoctor;
	}
	public void setCedulaDoctor(String cedulaDoctor) {
		this.cedulaDoctor = cedulaDoctor;
	}
	public String getCedulaPaciente() {
		return cedulaPaciente;
	}
	public void setCedulaPaciente(String cedulaPaciente) {
		this.cedulaPaciente = cedulaPaciente;
	}
	

}
