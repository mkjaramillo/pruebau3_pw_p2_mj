package com.example.demo.uce.repository;

import com.example.demo.uce.repository.modelo.CitaMedica;
import com.example.demo.uce.repository.modelo.Paciente;

public interface IPacienteRepository {
	public Paciente buscar(String cedula);
	public void crear(Paciente paciente);
}
