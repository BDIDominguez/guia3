

package guia3;

import javax.swing.JOptionPane;

/**
 *
 * @author Dario
 */

public class Hombre {
    private String nombre;

    public Hombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void jugarConRobot(Robot robot){
        String vContinuar;
        do {

            System.out.println(this.nombre + " Empieza a Jugar con Robot");
            if (robot.getEstado() == 0) {
                robot.despertar();
            }
            robot.avanzar(500);
            robot.retroceder(20);
            JOptionPane.showMessageDialog(null, "La Energia del Robot es de " + robot.toString());
            //System.out.println("La Energia del Robot es de " + robot.getBateria());
            vContinuar = JOptionPane.showInputDialog("Desea Salir");
        } while (!vContinuar.toUpperCase().equals("S"));
        
        robot.dormir();
        
    }
    
}
