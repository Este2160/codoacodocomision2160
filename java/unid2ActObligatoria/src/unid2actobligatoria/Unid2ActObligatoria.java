
package unid2actobligatoria;/*@author estela */
import java.util.Scanner;
public class Unid2ActObligatoria {
        public static final String ANSI_RED = "\u001B[31m";
      public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in); 
      System.out.println("Ingrese su Nombre: ");
      String nombre = entrada.nextLine();
      System.out.println("Ingrese su Apellido: ");
      String apellido = entrada.nextLine();
      System.out.println("Ingrese su Edad: ");
       int edad = entrada.nextInt();
      System.out.println("Ingrese su Hobbie: ");
      String hobbie = entrada.next();
      
      System.out.println("Ingrese el editor de código preferido: ");
      String editor = entrada.next();
      System.out.println("Ingrese el sistema operativo que usa: ");
     String sistema = entrada.next();
      
          System.out.println("Bienvenid@ al Sistema ");
          System.out.println("Los datos ingresados son:");
          System.out.println("Tu nombre: "+ nombre +" "+ apellido);
          
          System.out.println("Tu edad: " +edad);
          System.out.println("Tu hobbie: "+hobbie);
          System.out.println("Tu Editor de codigo preferido: "+editor);
          System.out.println("Tu sistema operativo: "+sistema);
      
    }
    
}
