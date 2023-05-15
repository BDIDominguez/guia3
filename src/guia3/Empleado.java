/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.time.LocalDate;

/**
 *
 * @author Dario
 */

/* 
nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en
la clase Kiosoco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el
Empleado con mayor antigüedad.
*/
public class Empleado {
        private String nombre;
        private String apellido;
        private LocalDate fingreso;
        private String dni;

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", fingreso=" + fingreso + ", dni=" + dni + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFingreso() {
        return fingreso;
    }

    public void setFingreso(LocalDate fingreso) {
        this.fingreso = fingreso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
   
}
