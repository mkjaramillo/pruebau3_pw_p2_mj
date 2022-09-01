package com.example.demo.uce.service;

import com.example.demo.uce.repository.modelo.Paciente;

public interface IPacienteService {
	public Paciente buscar(String cedula);
	public void crear(Paciente paciente);
}
