package com.mx.masnomina.nombreapp.model.repository

import org.springframework.stereotype.Repository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestPropertySource
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification
import spock.lang.Ignore
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
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
    then:
      assert list
  }
}
