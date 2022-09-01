package com.example.demo.uce.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.uce.repository.modelo.Doctor;


public interface IDoctorRepository {
	public void crear(Doctor doctor);
	public void actualizar(Doctor doctor);
	public void eliminar(String cedula);
	public Doctor buscar(String cedula);
	
}
