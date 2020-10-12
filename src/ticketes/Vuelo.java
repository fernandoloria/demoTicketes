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
    private int _codigoVuelo;
    private String _nombreDestino;
    private double _precio;
    private boolean _estaAtrasado; 
       

    public void cargarVuelo(int codigoVuelo, String nombreDestino,double precio, boolean estaAtrasado) 
    {
        this._codigoVuelo = codigoVuelo;
        this._nombreDestino = nombreDestino;
        this._precio = precio;
        this._estaAtrasado = estaAtrasado;
    }
    
    public int obtenerCodigoVuelo() 
    {
        return _codigoVuelo;
    }

    public String obtenerNombreDestino() 
    {
        return _nombreDestino;
    }
    
    public double obtenerPrecio() 
    {
        return _precio;
    }

    public boolean obtenerEstaAtrasado() 
    {
        return _estaAtrasado;
    }
    
}
