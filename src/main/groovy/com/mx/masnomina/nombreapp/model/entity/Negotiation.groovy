package com.mx.masnomina.nombreapp.model.entity

import javax.persistence.*
import java.time.LocalTime

@Entity
@Table(name = "negociaciones", schema = "serv_mn_negociaciones")
class Negotiation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_negociaciones")
	Integer id
  @Column(name = "contrato")
	String contrato
	String usuario;
  @Column(name = "fecha_negociacion")
	Date fechaNegociacion
  @Column(name = "fecha_promesa")
	Date fechaPromesa
  @Column(name = "importe_total")
	BigDecimal importeTotal
  @Column(name = "tipo_pago")
	String tipoPago
  @Column(name = "medio_pago")
	String medioPago
	String comentario
  @Column(name = "frecuencia_pago")
	String frecuenciaPago
  @Column(name = "importe_pago")
	BigDecimal importePago
  @Column(name = "no_pagos")
	Integer noPagos
  @Column(name = "no_pagos_aplicados")
	Integer noPagosAplicados
  @Column(name = "hora_negociacion")
	LocalTime horaNegociacion
  @Column(name = "importe_pagado")
	BigDecimal importePagado

	@OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "id_estatus_negociaciones", referencedColumnName = "id_estatus_negociaciones")
	StatusNegotiation estatusNegociacion
	@Column(name = "tipo_saldo")
	String tipoSaldo
	@Column(name = "bonif_monto_capital")
	BigDecimal bonifMontoCapital
	@Column(name = "bonif_interes_ordinario")
	Boolean bonifInteresOrdinario
	@Column(name = "bonif_gastos_cobranza")
	Boolean bonifGastosCobranza
	@Column(name = "bonif_moratorios")
	Boolean bonifMoratorios

	@OneToMany(mappedBy="id")
	List<NegotiationDetail> negociacionesDetalle

}