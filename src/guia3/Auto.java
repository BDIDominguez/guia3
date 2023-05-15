
package guia3;

/**
 *
 * @author Dario
 */
public class Auto {
    private String color;
    private String patente;
    private int combustible = 50;
    private Rueda rueda1;
    private Rueda rueda2;
    private Rueda rueda3;
    private Rueda rueda4;
    
    public void descinflar() {
        rueda1.desinflar();
        rueda2.desinflar();
        rueda3.desinflar();
        rueda4.desinflar();
    }
    public void inflar(){
        rueda1.inflar();
        rueda2.inflar();
        rueda3.inflar();
        rueda4.inflar();
    }
    
    public Rueda getRueda1() {
        return rueda1;
    }

    public void setRueda1(Rueda rueda1) {
        this.rueda1 = rueda1;
    }

    public Rueda getRueda2() {
        return rueda2;
    }

    public void setRueda2(Rueda rueda2) {
        this.rueda2 = rueda2;
    }

    public Rueda getRueda3() {
        return rueda3;
    }

    public void setRueda3(Rueda rueda3) {
        this.rueda3 = rueda3;
    }

    public Rueda getRueda4() {
        return rueda4;
    }

    public void setRueda4(Rueda rueda4) {
        this.rueda4 = rueda4;
    }
    
    public void avanzar(int distancia){
        if ((combustible*10)>=distancia){
            System.out.println("Avanzando " + distancia + " metros ...");
            combustible = combustible - (distancia / 10);
        }else{
            System.out.println("No tienes Suficiente combustible para esa distancia");
        }
        
    }
    public void retroceder(int distancia){
        if ((combustible*10)>=distancia){
            System.out.println("Retrocediendo " + distancia + " metros ...");
            combustible = combustible - (distancia / 10);
        }else{
            System.out.println("No tienes Suficiente combustible para esa distancia");
        }
        
    }
    public void llenarTanque(){
        System.out.println("Llenando el tanque ....");
        combustible = 50;
    }

    public Auto(String color, String patente) {
        this.color = color;
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
}
