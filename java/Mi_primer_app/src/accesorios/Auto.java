
package accesorios;/**@author estela*/
/*atributo de un auto*/
public class Auto {
    public int velocidad;
    public boolean encendido;
    public int capPasajeros;
    public String color,modelo,anio,patente;
    
      public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    
    public Auto(int velocidad,int capPasajeros,String color,String modelo,String anio,String patente){
    this.velocidad=velocidad;
    this.capPasajeros=capPasajeros;
    this.color=color;
    this.modelo=modelo;
    this.anio=anio;
    this.patente=patente;
    
    }

  public boolean encender_auto(){
   if (this.isEncendido()){
       System.out.println("El auto esta apagado");
     return false;   
    } else{    
      System.out.println("El auto está encendiendo");
      return true;
   }
  }
}
