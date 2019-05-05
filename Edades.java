package edades;
import javax.swing.JOptionPane;

/**
 *Nombre de la clase: edades
 * 
 * @author Brenda Ramos
 */
public class Edades 
{    
    public static void main(String[] args) 
    {
        int n=0;
        int acum=0;
        float prom;
        int mayor=0;
        int menor=0;
        int i=0;
        n= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite cuantas edades serán ingresadas: "));
        
        int edad[]=new int[n];
            for ( i = 0; i < n; i++) {
            
                edad[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad N[" + (i+1)+"°]: "));
            
                if (edad[i]>0 && edad[i]>mayor) {
                    mayor=edad[i];
                    acum+=edad[i];
                } else if (edad[i]>0 && edad[i]<=mayor){
                    menor=edad[i];
                    acum+=edad[i];
                }            
            }        
        prom = (float)acum/(n);
        JOptionPane.showMessageDialog(null,"Edad Mayor : "+mayor+"\nEdad Menor: "+menor+"\nPromedio de las edades ingresadas: "+(float)prom);

    }
    
}