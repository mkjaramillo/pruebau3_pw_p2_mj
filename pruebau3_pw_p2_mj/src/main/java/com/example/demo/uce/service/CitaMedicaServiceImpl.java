package com.example.demo.uce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.controller.DTO.ActualizarCita;
import com.example.demo.uce.controller.DTO.Agendamiento;
import com.example.demo.uce.repository.ICitaMedicaRepository;
import com.example.demo.uce.repository.modelo.CitaMedica;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {
	@Autowired
	private ICitaMedicaRepository citaRepository;
	@Autowired
	private IDoctorService doctorService;
	@Autowired
	private IPacienteService pacienteService;

	@Override
	public void crear(Agendamiento agenda) {
		CitaMedica cita = new CitaMedica();
		cita.setNumeroCita(agenda.getNumeroCita());
		cita.setFechaCita(agenda.getFechaCita());
		cita.setValorCita(agenda.getValorCita());
		cita.setLugarCita(agenda.getLugarCita());
		cita.setDoctor(doctorService.buscar(agenda.getCedulaDoctor()));
		cita.setPaciente(pacienteService.buscar(agenda.getCedulaPaciente()));
		System.out.println(cita.getDoctor().getCedula());
		System.out.println(cita.getPaciente().getCedula());
		citaRepository.crear(cita);

	}

	@Override
	public CitaMedica buscarCita(Integer numeroCita) {

		return citaRepository.buscarCita(numeroCita);
	}

	@Override
	public void actualizarCita(Integer numeroCita, ActualizarCita actual) {
		CitaMedica cita = citaRepository.buscarCita(numeroCita);
		cita.setDiagnostico(actual.getDiagnostico());
		cita.setReceta(actual.getReceta());
		cita.setFechaProximaCita(actual.getFechaProximaCita());
		citaRepository.actualizarCita(cita);

	}

	@Override
	public List<CitaMedica> citaPendiente(String cedulaDoctor) {
		List<CitaMedica> lp = new ArrayList<>();
		List<CitaMedica>lista=  citaRepository.citaPendiente(cedulaDoctor);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>"+lista.toString());
		for (CitaMedica cita :lista) {
			if (cita.getDiagnostico() == null || cita.getReceta() == null || cita.getFechaProximaCita() == null) {
				lp.add(cita);
			}
		}
		return lp;
	}



}