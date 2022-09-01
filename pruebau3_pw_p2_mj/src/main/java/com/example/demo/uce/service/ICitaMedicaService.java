package com.example.demo.uce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.uce.controller.DTO.ActualizarCita;
import com.example.demo.uce.controller.DTO.Agendamiento;
import com.example.demo.uce.repository.modelo.CitaMedica;


public interface ICitaMedicaService {
	
	public void crear(Agendamiento agenda);
	public CitaMedica buscarCita(Integer numeroCita);
	public void actualizarCita(Integer numeroCita, ActualizarCita actual);
	public List<CitaMedica> citaPendiente(String cedulaDoctor);
	
}
