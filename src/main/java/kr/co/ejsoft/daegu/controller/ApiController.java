package kr.co.ejsoft.daegu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ejsoft.daegu.model.CarInfo;
import kr.co.ejsoft.daegu.service.ApiService;

@RestController
public class ApiController {

  @Autowired
  private ApiService apiService;

  @PostMapping
  public void main(@RequestBody CarInfo json) {
    // System.out.println(json.toString());

    apiService.toJson(json);
  }
}
