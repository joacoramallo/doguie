
import javax.swing.JOptionPane;



public class RamalloJ_perro {

//////////////////

    // ATRIBUTOS
    private String nombre;
    private int edad;
    private String raza;
   
    // METODOS
    
    public RamalloJ_perro(){}
    
    //public Perro(String n,int e, String r){
        //this.nombre=n;
       // this.edad=e;
       //this.raza=r;
    //}
    
    public void setNombre(String n){
        this.nombre = n;
    }
   
    public String getNombre(){
        return this.nombre;
    }
   
    // Guardar dato
    public void setEdad(int e){
        this.edad = e+1;
    }
   
    //Leer dato
    public int getEdad(){
        return this.edad;
    }

    public String getRaza() {
        return this.raza;
    }
   public void setRaza(String r){
       this.raza=r; 
   } 
    
public static void main (String args[]){   
int a = 1;
int i;      
     RamalloJ_perro labrador[] = new RamalloJ_perro[a];
     for(i=0; i<labrador.length; i++){

            labrador[i] = new RamalloJ_perro();
            labrador[i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));

            labrador[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese Edad(en años)")));
            labrador[i].setRaza(JOptionPane.showInputDialog("Ingrese Raza"));


        }
     for(i=0; i<labrador.length; i++){

            JOptionPane.showMessageDialog(null, labrador[i].getNombre()+", "+labrador[i].getEdad()+" años, "+labrador[i].getRaza());

        }
}

}