package com.example.demo.uce.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.example.demo.uce.repository.modelo.CitaMedica;
@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void crear(CitaMedica cita) {
		entityManager.persist(cita);
		
	}
	@Override
	public CitaMedica buscarCita(Integer numeroCita) {
		TypedQuery<CitaMedica>query=this.entityManager.createQuery("SELECT c from CitaMedica c WHERE c.numeroCita=:numeroCita",CitaMedica.class);
		query.setParameter("numeroCita", numeroCita);
		return query.getSingleResult();
	}
	@Override
	public void actualizarCita(CitaMedica cita) {
		
		
		this.entityManager.merge(cita);
	}
	@Override
	public List<CitaMedica> citaPendiente(String cedulaDoctor) {
		System.out.println("............."+cedulaDoctor);
		TypedQuery<CitaMedica>query=entityManager.createQuery("SELECT c from CitaMedica c WHERE c.doctor.cedula =:cedulaDoctor",CitaMedica.class);
		query.setParameter("cedulaDoctor", cedulaDoctor);
		return query.getResultList();
	}
	
}
