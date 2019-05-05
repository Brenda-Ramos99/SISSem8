package numeros;
import javax.swing.JOptionPane;

/**
 *
 * @author Brenda Ramos
 */
public class Numeros 
{
    public static int repetidos[];

    static boolean numero(int nume) {
        for (int i = 0; i < repetidos.length; i++) {
            if (repetidos[i]== nume) {
                return false;
            }            
        }
        return true;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la dimensión del vector: "));
        int num[] = new int[n];
        repetidos = new int[num.length];
        
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un número entero: "));
        }
        //contador de pares e impares para definir su longitud
        int pares[]= new int[num.length];
        int impares[]= new int[num.length];
        //paso del vector 1 a un vector x
        int inverso[] = new int[n];
        int conta = (n - 1);
        
        System.out.println("Arreglo en forma ordenada de como se ingreso: ");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + ", ");
        }

        //Repetidos
        System.out.println("\nLos valores repetidos del arreglo son:");
        for (int i = 0; i < num.length; i++) {
            int contaRep = 0;
            for (int j = 0; j < num.length; j++) {
                if (num[i] == num[j]) {
                    contaRep++;
                    if (numero(num[i])) {
                        repetidos[i]= num[i];
                    }
                }
            }
            if (repetidos[i]!=0) {
                System.out.println("El numero: "+repetidos[i]+" se repite "+contaRep+" veces");
            }
        }
        // números pares e impares
        System.out.println("\nLos números pares del arreglo son: \n");
        for (int i = 0; i < num.length; i++) {
            if (num[i]%2==0) {
                pares[i]= num[i];
                System.out.println(pares[i]);
            }
        }
        System.out.println("\nLos números impares del arreglo son: \n");
        for (int i = 0; i < num.length; i++) {
            if(num[i]%2!=0){
                impares[i]=num[i];
                System.out.println(impares[i]);
            }
        }
        System.out.println("\nArreglo en forma Inversa de como se ingreso es: ");
        for (int i = 0; i < num.length; i++) {
            inverso[i] = num[conta];
            System.out.print(inverso[i]+", ");
            conta -= 1;
        }
    }
}
    

