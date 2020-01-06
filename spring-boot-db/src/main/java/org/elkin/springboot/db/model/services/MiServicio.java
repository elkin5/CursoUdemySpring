/**
 * 
 */
package org.elkin.springboot.db.model.services;

import org.springframework.stereotype.Component;

/**
 * @author ehurtado
 *
 */
@Component
public class MiServicio {

  public String operacion() {
    return "Ejecutando una operacion importante...";
  }
}
