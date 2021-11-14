
package clase02java;
public class Ingreso {
 private String usuario,pass;
 private String miUsuario="Estela";
 private String miPass = "123456";
 
 public String getUsuario(){
   return usuario;
   
 }
 public String getPass(){
 return pass;
 }
 public void setPass(String pass){
  this.pass = pass;
 
 }
 public void setUsuario (String us){
 usuario= us;
 }
 
 /*
 public boolean validar(){
  if(miUsuario == null ? usuario == null : miUsuario.equals(usuario)){
    return true;
  
  }else{
     return false; 
  
  }*/
 public boolean validar(){
  return usuario.equals(miUsuario) && pass.equals(miPass);
 
 }
 
 
  
}

