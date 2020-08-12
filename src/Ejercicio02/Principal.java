
package Ejercicio02;

import java.util.Scanner;

public class Principal {
public static void main(String[]args){
Scanner entrada= new Scanner(System.in);
int lado1,lado2,lado3, perimetro;
double area;

    System.out.println("ingrese el valor del primer lado del triángulo");
    lado1= entrada.nextInt();
    System.out.println("ingrese el valor del segundo lado del triángulo");
    lado2= entrada.nextInt();
    System.out.println("ingrese el valor del tercer lado del triángulo");
    lado3= entrada.nextInt();

perimetro= Triangulo.PerimetroTriangulo(lado1, lado2, lado3);
area= Triangulo.AreaTriangulo(lado1, lado2, lado3);


    System.out.println("el perimetro del triangulo es: "+ perimetro);
    System.out.println("el área del triangulo es: "+ area );
}
       
    
}    
    
    
    

