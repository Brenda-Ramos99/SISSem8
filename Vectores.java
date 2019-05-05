package vectores;
import javax.swing.JOptionPane;

/**
 *
 * @author Brenda Ramos
 */  
public class Vectores 
{    ///vector de edades mayor ,menor y promedio
    public static void main(String[] args) 
    {
        int n=0;
        int acumE=0;
        float promE;
        int mayor=0;
        int menor=0;
        int i=0;
        n= Integer.parseInt(JOptionPane.showInputDialog(null,"Digite cuantas edades serán ingresadas: "));
        int edad[]=new int[n];
        
            for ( i = 0; i < n; i++) {
                edad[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la [" + (i+1)+"°] edad"));
                if (edad[i]>0 && edad[i]>mayor) {
                    mayor=edad[i];
                    acumE+=edad[i];
                } else if (edad[i]>0 && edad[i]<= mayor){
                    menor=edad[i];
                    acumE+=edad[i];
                }            
            }        
        promE = (float)acumE/(n);
        JOptionPane.showMessageDialog(null,"La Edad Mayor es : "+mayor+"\nLa Edad Menor es: "+menor+"\nEl Promedio de las edades ingresadas es: "+(float)promE);
    }
}
