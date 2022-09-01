package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IPacienteRepository;
import com.example.demo.uce.repository.modelo.Paciente;
@Service
public class PacienteServiceImpl implements IPacienteService{
	@Autowired
	private IPacienteRepository pacienteRepository;
	@Override
	public Paciente buscar(String cedula) {
		
		return this.pacienteRepository.buscar(cedula);
	}
	@Override
	public void crear(Paciente paciente) {
		this.pacienteRepository.crear(paciente);
		
	}

}
