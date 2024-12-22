
package ejerciciosprog1;

import javax.swing.JOptionPane;

public class EjerciciosProg5 {
    public static void main(String args[]){
        byte num=0;
        num=Byte.parseByte(JOptionPane.showInputDialog("Ingresa el valor del numero"));
        if(num%2==0){
            System.out.println("El"+"---"+num+"---"+"Es par");
           
           
        }else 
            System.out.println("El"+"---"+num+"---"+"Es impar");
           
    }
    
}
