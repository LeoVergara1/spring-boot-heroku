package com.mx.masnomina.nombreapp.model.repository

import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository
import com.mx.masnomina.nombreapp.model.entity.Negotiation
import com.mx.masnomina.nombreapp.model.entity.StatusNegotiation

@Repository
public interface NegotiationRepository extends CrudRepository<Negotiation, Integer> {
	List<Negotiation> findAll()
	List<Negotiation> findAllByFechaPromesaLessThan(Date fechaPromesa)
	List<Negotiation> findAllByFechaPromesaLessThanAndEstatusNegociacion(Date fechaPromesa, StatusNegotiation statusNegotiation)
	List<Negotiation> findByContrato(String contrato)
}