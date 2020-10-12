/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketes;

/**
 *
 * @author ferna
 */
public class Vuelo {
    private int codigoVuelo;
    private String nombreDestino;
    private double precio;
    private boolean estaAtrasado; 
       

    public void cargarVuelo(int codigoVuelo, String nombreDestino,double precio, boolean estaAtrasado) 
    {
        this.codigoVuelo = codigoVuelo;
        this.nombreDestino = nombreDestino;
        this.precio = precio;
        this.estaAtrasado = estaAtrasado;
    }
    
    public int obtenerCodigoVuelo() 
    {
        return this.codigoVuelo;
    }

    public String obtenerNombreDestino() 
    {
        return this.nombreDestino;
    }
    
    public double obtenerPrecio() 
    {
        return this.precio;
    }

    public boolean obtenerEstaAtrasado() 
    {
        return this.estaAtrasado;
    }
    
}
