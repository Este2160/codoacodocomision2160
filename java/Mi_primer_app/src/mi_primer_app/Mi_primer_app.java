/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi_primer_app;

/**  @author estela */
public class Mi_primer_app {
     public static void main(String[] args) {
        int numero;
        String nombre;
        float promedio;
        boolean llueve = true;
        numero=13;
        float resultado;
        resultado = numero + 19;
        promedio = numero +19/2;
        System.out.println("Hola, es mi primer app");
        System.out.println(resultado);
        System.out.println("El promedio es: " + promedio);        
        System.out.println(45>19 != 19<32);//alt 124 ||
        System.out.println("");
        if (llueve == true){
            System.out.println("Usaremos paraguitas!");
        }else {
            System.out.println("Hacemos pignic");
        }
        juego jugador = new juego(0,4,"Mario","Hongos","Martillo");
        juego jugador1 = new juego(0,3,"Pablo","Clavo","Tiempo");
        juego jugador2 = new juego(0,8,"Ricardo","Clavito","Tenaz");

        
        System.out.println("Mi nombre es: "+ jugador.personaje);
        System.out.println("Tengo: "+ jugador.getVidas()+ " vidas");
        System.out.println(jugador.mostrarSaludo());
        System.out.println(jugador1.mostrarSaludo());
        System.out.println(jugador2.mostrarSaludo());

    }
    
    
    
}
