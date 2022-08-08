

package palindromo;
import java.util.*;
import javax.swing.JOptionPane;
import sun.security.util.Length;

public class Palindromo {


    public static void main(String[] args) {
        

        
        
        int menu = 0;
        Scanner lectortexto = new Scanner (System.in);
        String cadenarepeticion = "";
        char [] cadenadearray;
        char caracter = 0;
        int contador = 0;
        
        do {
            menu=Integer.parseInt(JOptionPane.showInputDialog(null, "dijite una de las acciones a realizar:\n " +
                    "1- palindromo \n"+
                    "2- Repeticion \n"+
                    "3- Salir"));
            
            
                switch(menu){
                    
                 
                    
                    case 1 :   
                        Scanner teclado= new Scanner(System.in);
                        String nuevo;
                        palindromo2 objclass=new palindromo2();
                        System.out.println("Ingresa la palabra");
                        nuevo = teclado.nextLine();
                        if(objclass.espalindromo(nuevo)){
                            System.out.println("Palindromo");
                        }
                        else
                        {
                            System.out.println("No Palindromo");
                        }
                    break;
                    case 2:
                        System.out.println("Ingrese un texto: ");
                        cadenarepeticion = lectortexto.nextLine();
                        cadenadearray = cadenarepeticion.toCharArray();
                        for (int i = 0; i < cadenadearray.length; i++){
                            caracter = cadenadearray [i];
                        
                        
                        for (int j = 0; j < cadenadearray.length; j++){
                            if (cadenadearray[j] == caracter){
                                contador++;
                            }
                            System.out.println(cadenadearray[i] + " "+ contador);
                        contador = 0;
                        }
                        }   
                    
                        
                    break;
                    case 3: JOptionPane.showMessageDialog(null, "saliendo"); System.exit(0); break;
                    default:JOptionPane.showMessageDialog(null, "valor numerico invalido", "error", JOptionPane.WARNING_MESSAGE);
                  
                            
                }
        }while (menu !=3);
    }
            
    
     
}
