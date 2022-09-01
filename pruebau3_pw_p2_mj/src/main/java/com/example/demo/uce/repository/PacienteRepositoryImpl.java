package com.example.demo.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Doctor;
import com.example.demo.uce.repository.modelo.Paciente;
@Repository
@Transactional
public class PacienteRepositoryImpl implements IPacienteRepository{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Paciente buscar(String cedula) {
		
		TypedQuery<Paciente>query= this.entityManager.createQuery("SELECT p from Paciente p WHERE p.cedula =:ced", Paciente.class);
		query.setParameter("ced", cedula);
		return query.getSingleResult();
		
	}
	@Override
	public void crear(Paciente paciente) {
		entityManager.persist(paciente);
	}

}
