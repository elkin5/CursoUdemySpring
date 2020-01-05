/**
 * 
 */
package org.elkin.springboot.app.models;

/**
 * @author elkin
 *
 */
public class Usuario {

  private String nombre;
  private String apellido;
  private String email;
  private int edad;

  /**
   * @return the nombre
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * @param nombre the nombre to set
   */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * @return the apellido
   */
  public String getApellido() {
    return apellido;
  }

  /**
   * @param apellido the apellido to set
   */
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the edad
   */
  public int getEdad() {
    return edad;
  }

  /**
   * @param edad the edad to set
   */
  public void setEdad(int edad) {
    this.edad = edad;
  }

}
