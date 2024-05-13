
/*
    Equipo: Syntax Squad
 */

import static java.lang.System.exit;
import java.util.Scanner;

public class OperadorMatematico {

    public static void main(String[] args) {
        
       
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        do{
            System.out.println("   Bienvenid@ ");
            System.out.println("                 ");
            System.out.println("Menu de opciones");
            System.out.println(" 1- Suma ");
            System.out.println(" 2- Resta ");
            System.out.println(" 3- Multiplicacion");
            System.out.println(" 4- Division");
            System.out.println(" 5- Salir del programa");
        
            System.out.println("Digite la opcion deseada: ");
            opcion = entrada.nextInt();
        
            if (opcion == 5){
                System.exit(0);
            } else{
                int num1, num2, resultado;
        
                System.out.println("Digite el primer numero: ");
                num1 = entrada.nextInt();
        
                System.out.println("Digite el segundo numero: ");
                num2 = entrada.nextInt();
        
                resultado = 0;
                switch(opcion){
                    case 1:
                        resultado = num1 + num2; 
                        System.out.println("El resultado de la suma es: " + resultado);
                    break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("El resultado de la resta es: " + resultado);
                    break;
                    case 3:
                        resultado = num1 * num2; 
                        System.out.println("El resultado de la multiplicacion es: " + resultado);
                    break;    
                    case 4:
                        resultado = num1 / num2; 
                        System.out.println("El resultado de la cociente de la divion es: " + resultado);
                    break;
                }
            }
            System.out.println("Desea hacer otra operacion? Escriba 1 para continuar y 5 para terminar. ");
            opcion = entrada.nextInt();
        }
        while(opcion != 5);
        System.out.println("Gracias por usar el programa, by: Syntax Squad :D");
    }
}