/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codificacionhuffman;

/**
 *
 * @author alehe
 */
public class Nodo {
    private char caracter;
    private int frecuencia,lado=-1;
    private String clave;
    private Nodo Hijoder, Hijoizq, siguiente,padre;

    public Nodo() {
        this.Hijoder = null;
        this.Hijoizq = null;
        this.frecuencia = 0;
    }

    public Nodo getHijoder() {
        return Hijoder;
    }

    public void setHijoder(Nodo Hijoder) {
        this.Hijoder = Hijoder;
    }

    public Nodo getHijoizq() {
        return Hijoizq;
    }

    public void setHijoizq(Nodo Hijoizq) {
        this.Hijoizq = Hijoizq;
    }
    
    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
        
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    void setCaracter(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


