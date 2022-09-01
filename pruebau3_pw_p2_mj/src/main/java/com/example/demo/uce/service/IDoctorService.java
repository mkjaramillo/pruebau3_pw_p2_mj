package com.example.demo.uce.service;

import com.example.demo.uce.repository.modelo.Doctor;

public interface IDoctorService {
	public void crear(Doctor doctor);
	public void actualizar(Doctor doctor);
	public void eliminar(String cedula);
	public Doctor buscar(String cedula);

}
