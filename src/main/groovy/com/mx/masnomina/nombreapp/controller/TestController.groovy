package com.mx.masnomina.nombreapp.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("test")
class TestController {

  @GetMapping
  String getMessage(){
    return "Hellor word from heroku"
  }
}
