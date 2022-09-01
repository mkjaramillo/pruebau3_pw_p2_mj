package com.example.demo.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.repository.modelo.Doctor;
@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void crear(Doctor doctor) {
entityManager.persist(doctor);		
	}

	@Override
	public void actualizar(Doctor doctor) {
entityManager.merge(doctor);		
	}

	@Override
	public void eliminar(String cedula) {
entityManager.remove(this.buscar(cedula));		
	}

	@Override
	public Doctor buscar(String cedula) {
		TypedQuery<Doctor>query= this.entityManager.createQuery("SELECT d from Doctor d WHERE d.cedula=:cedula", Doctor.class);
		query.setParameter("cedula", cedula);
		return query.getSingleResult();
	}
	

}
