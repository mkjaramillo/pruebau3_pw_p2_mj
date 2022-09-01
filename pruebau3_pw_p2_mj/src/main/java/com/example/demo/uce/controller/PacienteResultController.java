package com.example.demo.uce.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.repository.modelo.Doctor;
import com.example.demo.uce.repository.modelo.Paciente;
import com.example.demo.uce.service.IPacienteService;

@RestController
@RequestMapping("/APIPaciente/V1/pacientes")
public class PacienteResultController {
	@Autowired
	private IPacienteService pacienteServicio;

	@GetMapping(path="/{cedulaPaciente}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Paciente buscarPaciente(@PathVariable("cedulaPaciente") String cedulaPaciente) {
		return this.pacienteServicio.buscar(cedulaPaciente);

	}
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String crearPaciente(@RequestBody Paciente paciente) {
		String mensaje = "Paciente creado con exito";
		try {
			this.pacienteServicio.crear(paciente);
		} catch (Exception e) {
			mensaje = "Error intente mas tarde";
			
		}

		return mensaje;
		
	}
}
