/**
 * 
 */
package org.elkin.springboot.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author ehurtado
 *
 */

@Controller
public class IndexController {

  @GetMapping({"/", "", "index"})
  public String index(Model model) {
    
    return "index";
  }
}
