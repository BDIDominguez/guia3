
package guia3;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */

/* 1. Realizar un programa para que una Persona pueda adoptar hasta tres Perros. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño, un constructor que
permita inicializar todos sus atributos y los respectivos métodos getter y setter de sus atributos; y
la clase Persona con atributos: nombre, apellido, edad, documento y tres atributos de tipo Perro,
un constructor que sólo permita inicializar los atributos: nombre, apellido, edad y documento. La
Persona cuenta además con los siguientes métodos:
adoptarPerro() Este método recibe por parámetro un Perro y lo asigna en alguna de las variables
vacías; si todas las variables atributos Perro están ocupadas, mostrará un mensaje “Ya no puedo
adoptar”.
perroMasGrande() Este método retornará el Perro de mayor edad.

Ahora deberemos en el main crear una Persona y 4(cuatro) Perros. Después, vamos a hacer que
persona adopte cada uno de esos Perros (luego al ejecutar veremos que pasa), por último pediremos
a la Persona que nos diga cual es el Perro más viejo. */


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String dni;
    private Perro perro1;
    private Perro perro2;
    private Perro perro3;

    public Persona(String nombre, String apellido, int edad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Perro getPerro1() {
        return perro1;
    }

    public void setPerro1(Perro perro1) {
        this.perro1 = perro1;
    }

    public Perro getPerro2() {
        return perro2;
    }

    public void setPerro2(Perro perro2) {
        this.perro2 = perro2;
    }

    public Perro getPerro3() {
        return perro3;
    }

    public void setPerro3(Perro perro3) {
        this.perro3 = perro3;
    }

    
    
    public void adoptarPerro(Perro perro){
        if (this.perro1==null){
            this.perro1 = perro;
            JOptionPane.showMessageDialog(null,"Se Agrego el Primer Perro");
        }else if (this.perro2==null){
            this.perro2 = perro;
            JOptionPane.showMessageDialog(null,"Se Agrego el Segundo Perro");
        }else if (this.perro3==null){
            this.perro3 = perro;
            JOptionPane.showMessageDialog(null,"Se Agrego el Tercer Perro");
        }else{
            JOptionPane.showMessageDialog(null,"No queda espacion para mas perros!!!!");
        }
    }
    
    public Perro perroMasGrande(){
        if (this.perro1.getEdad()>this.perro2.getEdad()){
            if (this.perro1.getEdad()>this.perro3.getEdad()){
                return perro1;
            }else{
                return perro2;
            }
        }else if (this.perro2.getEdad()>this.perro3.getEdad()){
            return perro2;
        }else{
            return perro3;
        }
        
    }
}
