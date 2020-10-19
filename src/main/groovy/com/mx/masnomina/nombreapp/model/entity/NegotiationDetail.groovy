package com.mx.masnomina.nombreapp.model.entity

import javax.persistence.*
import java.time.LocalTime

@Entity
@Table(name = "negociaciones_detalle", schema = "serv_mn_negociaciones")
class NegotiationDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_negociaciones_detalle")
	Integer id
  @Column(name = "no_pago")
  Integer noPago
  @Column(name = "fecha_pago_promesa")
  Date fechaPagoPromesa
  @Column(name = "importe")
  BigDecimal importe
  @Column(name = "importe_pago")
  BigDecimal importePago
  @Column(name = "saldo_liquidar")
  BigDecimal saldoLiquidar

}