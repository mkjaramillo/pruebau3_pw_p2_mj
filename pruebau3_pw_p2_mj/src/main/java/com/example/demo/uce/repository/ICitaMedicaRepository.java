package com.example.demo.uce.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.example.demo.uce.repository.modelo.CitaMedica;
import com.example.demo.uce.repository.modelo.Doctor;


public interface ICitaMedicaRepository {
	public void crear(CitaMedica cita);
	public CitaMedica buscarCita(Integer numeroCita);
	public void actualizarCita(CitaMedica cita);
	public List<CitaMedica> citaPendiente(String cedulaDocto);

}
