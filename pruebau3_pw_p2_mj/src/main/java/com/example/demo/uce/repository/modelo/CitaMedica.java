package com.example.demo.uce.repository.modelo;

import java.io.Serial;
import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="cita_medica")
public class CitaMedica {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "secCita")
	@SequenceGenerator(name = "secCita", sequenceName = "secCita",allocationSize = 1)
	@Column(name="cime_id")
	private Integer id;
	@Column(name="cime_numero_Cita")
	private Integer numeroCita;
	@Column(name="cime_fecha_cita")
	private LocalDate fechaCita;
	@Column(name="cime_valor_cita")
	private BigDecimal valorCita;
	@Column(name="cime_lugar_cita")
	private String lugarCita;
	@Column(name="cime_diagnostico")
	private String diagnostico;
	@Column(name="cime_receta")

	private String receta;
	@Column(name="cime_fecha_proxima_cita")

	private LocalDate fechaProximaCita;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "doct_id")
	private Doctor doctor;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paci_id")
	private Paciente paciente;
	
	
	
	public CitaMedica(Integer id, Integer numeroCita, LocalDate fechaCita, BigDecimal valorCita, String lugarCita,
			String diagnostico, String receta, LocalDate fechaProximaCita, Doctor doctor, Paciente paciente) {
		super();
		this.id = id;
		this.numeroCita = numeroCita;
		this.fechaCita = fechaCita;
		this.valorCita = valorCita;
		this.lugarCita = lugarCita;
		this.diagnostico = diagnostico;
		this.receta = receta;
		this.fechaProximaCita = fechaProximaCita;
		this.doctor = doctor;
		this.paciente = paciente;
	}
	
	
	


	public CitaMedica() {
		super();
	}





	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
