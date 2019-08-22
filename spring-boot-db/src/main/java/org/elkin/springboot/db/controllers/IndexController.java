/**
 * 
 */
package org.elkin.springboot.db.controllers;

import org.elkin.springboot.db.model.services.MiServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ehurtado
 *
 */
@Controller
public class IndexController {

  @Autowired
  private MiServicio servicio;

  @GetMapping({"/", "", "index"})
  public String index(Model model) {

    model.addAttribute("objeto", servicio.operacion());
    return "index";
  }
}
