package cz.czechitas.java2webapps.ukol6.controller;

import cz.czechitas.java2webapps.ukol6.service.CitatyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 */
@Controller
public class CitatyController {

  private final CitatyService service;

  @Autowired
  public CitatyController(CitatyService service) {
    this.service = service;
  }


  @GetMapping("/")
  public ModelAndView nahodnyCitat() {
    return new ModelAndView("citat")
            .addObject("citat", service.nahodnyCitat());
  }


}
