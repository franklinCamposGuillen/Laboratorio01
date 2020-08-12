package Ejercicio01;

import java.util.Scanner;

public class Temperatura {
 
public static void main (String[]args){
Scanner entrada= new Scanner(System.in);

double temperaturaF, temperaturaC;

    System.out.println("por favor ingrese la temperatura en farengers: ");
    temperaturaF= entrada.nextDouble();
    
    temperaturaC= ((temperaturaF-32)*5/9);
    
    System.out.println("la temperatura en grados Celcius es: "+temperaturaC+"º");
   

}
    
    
    
    
}
