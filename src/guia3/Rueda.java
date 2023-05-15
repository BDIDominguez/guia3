
package guia3;

/**
 *
 * @author Dario
 */

public class Rueda {
    private String marca;
    private double presion;
    
    public void inflar(){
        System.out.println("Inflando rueda ...");
        presion = 28;
    }
    public void pinchar(){
        System.out.println("Se pincho .....");
        presion = 0;
    }
    public void desinflar(){
        if (presion >= 0.5){
            presion = presion - 0.5;
            System.out.println("Desinflando .... queda " + presion + " psi");
        }else{
            System.out.println("Ya no tienes presion en la rueda!!! ");
        }
    }

    @Override
    public String toString() {
        return "Rueda{" + "marca=" + marca + ", presion=" + presion + '}';
    }

    public Rueda(String marca, double presion) {
        this.marca = marca;
        this.presion = presion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }
    
}
