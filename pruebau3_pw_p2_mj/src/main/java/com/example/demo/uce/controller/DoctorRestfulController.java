package com.example.demo.uce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.repository.modelo.Doctor;
import com.example.demo.uce.service.IDoctorService;
@RestController
@RequestMapping("/APIDoctor/V1/doctores")
public class DoctorRestfulController {
	@Autowired
	private IDoctorService doctorService;
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String creaeDoctor(@RequestBody Doctor doctor) {
		String mensaje = "Doctor creado con exito";
		try {
			this.doctorService.crear(doctor);
		} catch (Exception e) {
			mensaje = "Error intente mas tarde";
			
		}

		return mensaje;
		
	}
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String actualizarDoctor(@RequestBody Doctor doctor) {
		
		String mensaje = "Doctor actualizado con exito";
		try {
			this.doctorService.actualizar(doctor);
		} catch (Exception e) {
			mensaje = "Error intente mas tarde";
			
		}

		return mensaje;
		
	}
	@GetMapping(path="/buscar/{cedulaDoc}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Doctor buscarDoctor(@PathVariable("cedulaDoc") String cedula) {
		
		return 	this.doctorService.buscar(cedula);

	}
	@DeleteMapping(path="/eliminar/{idDoc}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String eliminarDoctor(@PathVariable("idDoc")String id) {
		
		String mensaje = "Doctor eliminado con exito";
		try {
			this.doctorService.eliminar(id);
		} catch (Exception e) {
			mensaje = "Error intente mas tarde";
			
		}

		return mensaje;
		
	}
	
}
