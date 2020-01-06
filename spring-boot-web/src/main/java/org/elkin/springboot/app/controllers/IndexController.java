/**
 * 
 */
package org.elkin.springboot.app.controllers;

import org.elkin.springboot.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author elkin
 *
 */
// los controladores permiten manejar las peticiones y responder a ellas
@Controller
// Esta etiqueta permite agrupar a todos los metodos del controlador con una ruta
@RequestMapping("/app")
public class IndexController {
  /*
   * Los controladores contienen methodos o handling que seran los encargados de recibir la peticion
   * y deterinar la respuesta
   */


  /**
   * Para mostrar una vista se debe crear un metodo que retorna el nombre de un template que debe
   * estar creado con el mismo nombre y debe mapear una url si no se determina que tipo de request
   * es por defecto sera un GET aunque podemos cambiar el @RequestMapping por un @GetMapping si no
   * tengo mas parametros en el () puedo escribirlo sin el value= y ademas puedo enrutar varias url
   * a una misma ruta para lo que se usa {"url1", "url2"}
   * 
   * @return
   */
  @GetMapping({"/index", "/", ""})
  /*
   * La interfaz Model se usa para pasar datos a la vista tambien se puede usar la clase ModelMap
   * que funciona de la misma manera o se pueden usar drectaente los Map<> de java
   */
  public String index(Model model) {
    model.addAttribute("titulo", "Index");
    return "index";
  }
  
  @GetMapping({"/home", "/hola"})
  public ModelAndView home(ModelAndView mv) {
    mv.addObject("titulo", "Home");
    mv.setViewName("index");
    
    return mv;
  }
  
  @RequestMapping("/perfil")
  public String perfil(Model model) {
    Usuario usuario = new Usuario();
    usuario.setNombre("Abril");
    usuario.setApellido("Hurtado");
//    usuario.setEmail("as@gmail.com");
    usuario.setEdad(4);
    
    model.addAttribute("usuario", usuario);
    model.addAttribute("titulo", "Perfil ".concat(usuario.getNombre()));
    
    return "perfil";
  }
}
