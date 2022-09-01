package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.repository.IDoctorRepository;
import com.example.demo.uce.repository.modelo.Doctor;
@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
private IDoctorRepository doctorRepository;
	@Override
	public void crear(Doctor doctor) {
		doctorRepository.crear(doctor);
		
	}

	@Override
	public void actualizar(Doctor doctor) {
		doctorRepository.actualizar(doctor);
		
	}

	@Override
	public void eliminar(String cedula) {
doctorRepository.eliminar(cedula);		
	}

	@Override
	public Doctor buscar(String cedula) {
		
		return doctorRepository.buscar(cedula);
	}
	

}
