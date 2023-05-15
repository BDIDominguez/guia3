/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */


/* 
2. Un Kiosco tiene 3 Empleados. Vamos a contar de dos clases. Kiosco, que tendrá los atributos:
dirección, nombre, cuit y 3 atributos de tipo Empleado; y la clase Empleado posee los atributos:
nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en
la clase Kiosoco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el
Empleado con mayor antigüedad.

Ahora en el método main de la clase principal usted creará un Kiosco y 3 Empleados, luego
incorporará al Kisoco esos Empleados y le solicitará al Kiosco que muestre los datos del Empleado
de mayor antigüedad.
*/

public class Kiosco {
    private String direccion;
    private String nombre;
    private String cuit;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;

    public Kiosco(String nombre, String direccion, String cuit) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleado getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public Empleado getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(Empleado empleado3) {
        this.empleado3 = empleado3;
    }
    
    public void masAntiguo(){
        if (ChronoUnit.DAYS.between(empleado1.getFingreso(),LocalDate.now()) > ChronoUnit.DAYS.between(empleado2.getFingreso(),LocalDate.now())){
            if (ChronoUnit.DAYS.between(empleado1.getFingreso(),LocalDate.now()) > ChronoUnit.DAYS.between(empleado3.getFingreso(),LocalDate.now())){
                JOptionPane.showMessageDialog(null,empleado1.toString());
            }else{
                JOptionPane.showMessageDialog(null,empleado2.toString());
            }
                
        }else{ 
            if (ChronoUnit.DAYS.between(empleado2.getFingreso(),LocalDate.now()) > ChronoUnit.DAYS.between(empleado3.getFingreso(),LocalDate.now())){
                JOptionPane.showMessageDialog(null,empleado2.toString());
            }else{
                JOptionPane.showMessageDialog(null,empleado3.toString());
            }
        }
      
    }
    
    public void agregaEmpleado(Empleado empleado){
         if (this.empleado1==null){
            this.empleado1 = empleado;
            JOptionPane.showMessageDialog(null,"Se Agrego el Primer Empleado");
        }else if (this.empleado2==null){
            this.empleado2 = empleado;
            JOptionPane.showMessageDialog(null,"Se Agrego el Segundo Empleados");
        }else if (this.empleado3==null){
            this.empleado3 = empleado;
            JOptionPane.showMessageDialog(null,"Se Agrego el Tercer Empleado");
        }else{
            JOptionPane.showMessageDialog(null,"No queda espacion para mas Empleados, Gracias Kris, Gracias Peron!!!!!");
        }
        
    }
    
}
