package com.example.demo.uce.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uce.controller.DTO.ActualizarCita;
import com.example.demo.uce.controller.DTO.Agendamiento;
import com.example.demo.uce.repository.modelo.CitaMedica;
import com.example.demo.uce.service.ICitaMedicaService;

@RestController
@RequestMapping("/APICita/V1/citas")
public class CitaMedicaRestfulController {
	@Autowired
	private ICitaMedicaService citaService;
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String crearAgenda(@RequestBody Agendamiento agenda) {
		String mensaje = "Cita agendada con exito";
		try {
			this.citaService.crear(agenda);
		} catch (Exception e) {
			mensaje = "Error intente mas tarde";
			
		}

		return mensaje;
	}
	@PutMapping(path="/actualizar/{numeroCita}",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String actualizar(@PathVariable("numeroCita")Integer numeroCita,@RequestBody ActualizarCita actual) {
		
		String mensaje = "Cita actualizada con exito";
		try {
			this.citaService.actualizarCita(numeroCita, actual);
		} catch (Exception e) {
			mensaje = "Error intente mas tarde";
			
		}

		return mensaje;
		
	}
	@GetMapping(path="/doctores/{cedulaDoctor}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CitaMedica>> citaPendiente(@PathVariable("cedulaDoctor")String cedulaDoctor){
		return new ResponseEntity(citaService.citaPendiente(cedulaDoctor),HttpStatus.OK);
	}
}
