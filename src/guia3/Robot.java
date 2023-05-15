/*
Avanzar(cantidad de pasos)
Retroceder(cantidad de Pasos)
Dormir()
Despertar()
Recargar()
bateriaLLena():boolean
bateriaVacia() :boolean
energiaActual() :int
*/

package guia3;

/**
 *
 * @author Dario
 */
public class Robot {
    private Bateria bateria;
    private int estado = 0;

    @Override
    public String toString() {
        return "Robot{" + "bateria=" + bateria + '}';
    }

    public Robot(Bateria bateria) {
        this.bateria = bateria;
    }
        
    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public void avanzar (int pasos){
        if (this.estado == 1){
            if ((bateria.getCarga()*10)>=pasos){
                System.out.println("Avanzando " + pasos + " pasos");
                bateria.setCarga(bateria.getCarga()-(pasos/10));
            }else{
                System.out.println("No queda Bateria Suficiente!!!");
            }
                
        }else{
            System.out.println("El Robot esta durmiendo Activalo primero");
        }
    }
    public void retroceder(int pasos){
        if (this.estado == 1){
            if ((bateria.getCarga()*10)>=pasos){
                System.out.println("Retrocediendo " + pasos + " pasos");
                bateria.setCarga(bateria.getCarga()-(pasos/10));
            }else{
                System.out.println("No queda Bateria Suficiente!!!");
            }
                
        }else{
            System.out.println("El Robot esta durmiendo Activalo primero");
        }
    }
    public void dormir(){
        System.out.println("Durmiendo.....");
        estado = 0;
    }
    public void despertar(){
        System.out.println("Despertando.....");
        estado = 1;
    }
    public void recargar(){
        System.out.println("Cargando Bateria....");
        bateria.setCarga(1000);
    }
    public boolean bateriaLlena(){
        return (bateria.getCarga()==1000);
    }
    public boolean bateriaVacia(){
        return (bateria.getCarga()==0);
    }
    public int energiaActual(){
        return bateria.getCarga();
    }

}
