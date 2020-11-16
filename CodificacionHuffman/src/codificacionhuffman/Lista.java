/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacionhuffman;

/**
 *
 * @author Daniel
 */
public class Lista {
    private Nodo tope=null;
    private String cadena;
    private int size=0;
   
   public void Insertar(Nodo nodo_referencia){
       tope = Agregar(tope,nodo_referencia);
       size++;
   }
   
   private Nodo Agregar( Nodo actual,Nodo nodo_referencia){
       if(actual==null){
           actual = nodo_referencia;
           actual.setSiguiente(null);
       }else{
           if(actual.getFrecuencia()<nodo_referencia.getFrecuencia()){
               actual.setSiguiente(Agregar(actual.getSiguiente(),nodo_referencia));
           }else{
               Nodo aux = nodo_referencia;
               aux.setSiguiente(actual);
               actual = aux;
           }
       }
       return actual;
   }
   
   public Nodo BuscarPorClave(String clave){
       Nodo nodo_aux = null, nodo_actual = tope;
       while(nodo_actual!=null){
           System.out.println(nodo_actual.getClave());
           if(nodo_actual.getClave() == clave){
               nodo_aux = nodo_actual;
           }
           nodo_actual = nodo_actual.getSiguiente();
       }
       return nodo_aux;
   }
   
   public boolean Buscar(char caracter){
       Nodo actual = tope;
       boolean existe = false;
      return BuscarNodo(caracter,actual, existe);
   }
   
    private boolean BuscarNodo(char caracter,Nodo actual,boolean existe){
        if(actual!=null){
            if(actual.getCaracter() == caracter){
                return true;
            }
            else{
                actual = actual.getSiguiente();
               return  BuscarNodo(caracter, actual, existe);
            }
        }
        else{
            return existe = false;
        }    
    }
    
    public String Mostrar(){
        cadena = "";
        Nodo nodo_actual = tope;
        while(nodo_actual!=null){
            cadena+="\n"+"Caracter: "+nodo_actual.getCaracter()+" --> Frecuencia: "+nodo_actual.getFrecuencia()+" --> Clave: "+nodo_actual.getClave();
            nodo_actual = nodo_actual.getSiguiente();
        }
        return cadena;
    }

    public Nodo getTope() {
        return tope;
    }

    public int getSize() {
        return size;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }
}



