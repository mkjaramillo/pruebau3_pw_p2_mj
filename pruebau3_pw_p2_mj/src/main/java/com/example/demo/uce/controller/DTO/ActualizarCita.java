package com.example.demo.uce.controller.DTO;

import java.time.LocalDate;

public class ActualizarCita {
	 private String diagnostico;
	private String receta;
	private LocalDate fechaProximaCita;
	
	public ActualizarCita() {
		super();
	}
	
	public ActualizarCita(String diagnostico, String receta, LocalDate fechaProximaCita) {
		super();
		this.diagnostico = diagnostico;
		this.receta = receta;
		this.fechaProximaCita = fechaProximaCita;
	}

	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getReceta() {
		return receta;
	}
	public void setReceta(String receta) {
		this.receta = receta;
	}
	public LocalDate getFechaProximaCita() {
		return fechaProximaCita;
	}
	public void setFechaProximaCita(LocalDate fechaProximaCita) {
		this.fechaProximaCita = fechaProximaCita;
	}

}
