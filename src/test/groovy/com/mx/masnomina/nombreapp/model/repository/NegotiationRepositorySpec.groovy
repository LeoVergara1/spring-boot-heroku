package com.mx.masnomina.nombreapp.model.repository

import org.springframework.stereotype.Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Ignore
import org.springframework.transaction.annotation.Transactional
import com.mx.masnomina.nombreapp.model.entity.Negotiation

@SpringBootTest
//@TestPropertySource("classpath:application-test.properties")
class NegotiationRepositorySpec extends Specification {

	@Autowired
  NegotiationRepository negotiationRepository

  def "Spect 0 Check service inject"() {
    when:
      println negotiationRepository
    then:
      assert negotiationRepository
  }

  def "Spect 1 get all negotiations"() {
    when:
      def list =  negotiationRepository.findAll()
      println "*"*100
      println list.size()
      println list[0].dump()
    then:
      assert list
  }

  def "Spect 2 find one negotiation by contrato"() {
    given: "A contrato"
      String contrato = "000078584017"
    when:
      def result =  negotiationRepository.findByContrato(contrato)
      println "*"*100
      println result.dump()
    then:
      assert result.size() == 10
  }

  @Transactional
  def "Spect 3 Save Negotiation"() {
    given: "A contrato"
    def negotiation = new Negotiation(contrato: "000078584017", usuario: "000726295483")
    when:
      def result =  negotiationRepository.save(negotiation)
      println "*"*100
      println result.dump()
    then:
      assert result
  }

  @Transactional
  def "Spect 4 update Negotiation"() {
    given: "A contrato"
      String contrato = "000078584017"
      BigDecimal newImporteTotal = 8976
    when:
      def negotiationsList =  negotiationRepository.findByContrato(contrato)
      Negotiation negotiation = negotiationsList.first()
      negotiation.importeTotal = newImporteTotal
      negotiationRepository.save(negotiation)
    then:
      assert negotiation.importeTotal == 8976
  }
}
