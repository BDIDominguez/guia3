/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;


import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */
public class Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vOps;
        do {
            System.out.print("************ Menu Guia 6 *********** \n"
                    + " 1 --- Cargar Perro a una Persona \n"
                    + " 2 --- Kiosco \n"
                    + " 3 --- Auto \n"
                    + " 4 --- Jugar Con Robot \n"
                    + " 6 --- Salir \n"
                    + "Que opcion elijes: ");

            vOps = teclado.nextInt();
            switch (vOps) {
                case 1:
                    Perro doky = new Perro();
                    doky.setEdad(1);
                    doky.setNombre("Doky");
                    doky.setRaza("Casche");
                    doky.setTamaño("Chico");
                    Perro cual = new Perro();
                    cual.setEdad(2);
                    cual.setNombre("Cual");
                    cual.setRaza("PuroPerro");
                    cual.setTamaño("Chico");
                    Perro dokyprimero = new Perro();
                    dokyprimero.setEdad(3);
                    dokyprimero.setNombre("Doky Primero");
                    dokyprimero.setRaza("Casche");
                    dokyprimero.setTamaño("Chico");
                    Perro kyra = new Perro();
                    kyra.setEdad(4);
                    kyra.setNombre("Kyra");
                    kyra.setRaza("Masticadora");
                    kyra.setTamaño("Mediana");

                    Persona dario = new Persona("Bernardo Dario Ismael", "Dominguez", 35, "30.541.575");
                    //System.out.println("Datos " + (dario.getPerro1()==null));

                    dario.adoptarPerro(doky);
                    dario.adoptarPerro(dokyprimero);
                    dario.adoptarPerro(kyra);
                    dario.adoptarPerro(cual);
                    Perro masGrande = dario.perroMasGrande();
                    JOptionPane.showMessageDialog(null, "el perro mas grande es " + masGrande.toString());

                    JOptionPane.showMessageDialog(null, "Se termino XD");
                    break;
                case 2:
                    /* Ahora en el método main de la clase principal usted creará un Kiosco y 3 Empleados, luego
incorporará al Kisoco esos Empleados y le solicitará al Kiosco que muestre los datos del Empleado
de mayor antigüedad. */
                    String ingreso;
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    
                    Kiosco distri = new Kiosco("Distribuidora","La providencia N° 62","20-30541575-9");
                    
                    Empleado dario1 = new Empleado();
                    //dario1.setNombre(JOptionPane.showInputDialog("Ingresa el Nombre del empleado"));
                    //dario1.setApellido(JOptionPane.showInputDialog("Ingresa el Apellido del empleado"));
                    //ingreso = JOptionPane.showInputDialog("Ingresa la Fecha de ingreso DD/MM/AAA");
                    //dario1.setFingreso(LocalDate.parse(ingreso,formato));
                    //dario1.setDni(JOptionPane.showInputDialog("Ingrese DNI separado por puntos"));
                    
                    dario1.setNombre("Dario");
                    dario1.setApellido("Dominguez");
                    dario1.setFingreso(LocalDate.of(1983,Month.SEPTEMBER,26));
                    dario1.setDni("30.541.575");
                    
                    
                    Empleado bernardo = new Empleado();
                    /*
                    bernardo.setNombre(JOptionPane.showInputDialog("Ingresa el Nombre del empleado"));
                    bernardo.setApellido(JOptionPane.showInputDialog("Ingresa el Apellido del empleado"));
                    ingreso = JOptionPane.showInputDialog("Ingresa la Fecha de ingreso DD/MM/AAA");
                    bernardo.setFingreso(LocalDate.parse(ingreso,formato));
                    bernardo.setDni(JOptionPane.showInputDialog("Ingrese DNI separado por puntos")); 
                     */
                    
                    bernardo.setNombre("Bernardo");
                    bernardo.setApellido("Dominguez");
                    bernardo.setFingreso(LocalDate.of(1983,Month.SEPTEMBER,27));
                    bernardo.setDni("30.541.575");
                    
                    Empleado ismael = new Empleado();
                    /*
                    ismael.setNombre(JOptionPane.showInputDialog("Ingresa el Nombre del empleado"));
                    ismael.setApellido(JOptionPane.showInputDialog("Ingresa el Apellido del empleado"));
                    ingreso = JOptionPane.showInputDialog("Ingresa la Fecha de ingreso DD/MM/AAA");
                    ismael.setFingreso(LocalDate.parse(ingreso,formato));
                    ismael.setDni(JOptionPane.showInputDialog("Ingrese DNI separado por puntos"));
                    */
                    
                    ismael.setNombre("Ismael");
                    ismael.setApellido("Dominguez");
                    ismael.setFingreso(LocalDate.of(1983,Month.SEPTEMBER,27));
                    ismael.setDni("30.541.575");
                    
                    
                    distri.agregaEmpleado(dario1);
                    distri.agregaEmpleado(bernardo);
                    distri.agregaEmpleado(ismael);
                    distri.agregaEmpleado(ismael);
                    distri.masAntiguo();
                    
                    break;
                case 3:
                    /* Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas,
                    avanzar/retroceder, y llenarTanque.*/
                    
                    Auto renault = new Auto("Blanco", "dlx380");
                    Rueda delIz = new Rueda("Firestone", 28);
                    Rueda delDe = new Rueda("Firestone", 28);
                    Rueda traIz = new Rueda("Firestone", 28);
                    Rueda traDe = new Rueda("Firestone", 28);
                    renault.setRueda1(delIz);
                    renault.setRueda2(delDe);
                    renault.setRueda3(traIz);
                    renault.setRueda4(traDe);
                    
                    renault.descinflar();
                    renault.descinflar();
                    renault.inflar();
                    renault.avanzar(50);
                    renault.retroceder(40);
                    renault.llenarTanque();
                    break;
                case 4:
                    Bateria bateria = new Bateria(1000);
                    Robot bob = new Robot(bateria);
                    Hombre dario2 = new Hombre("Dario");
                    Hombre bernardo1 = new Hombre("Bernardo");
                    dario2.jugarConRobot(bob);
                    bernardo1.jugarConRobot(bob);
                    break;
                           
                case 6:
                    JOptionPane.showMessageDialog(null, "Gracias por usar nuestro Software! ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No existe es Opcion!!, por favor preste atencion pequeño #$%!!!!");
                    break;
            }
        } while (vOps != 6);

    }
    
}
