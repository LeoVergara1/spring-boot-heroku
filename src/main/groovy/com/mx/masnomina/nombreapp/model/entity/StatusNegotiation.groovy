package com.mx.masnomina.nombreapp.model.entity

import javax.persistence.*

@Entity
@Table(name = "estatus_negociaciones", schema = "serv_mn_negociaciones")
class StatusNegotiation {

  @Id
  @Column(name = "id_estatus_negociaciones")
  int id
  String estatus
  String descripcion

}