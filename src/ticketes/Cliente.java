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
public class Cliente {

    private int _codigoCliente;
    private String _nombreCliente;
    private boolean _tieneDescuento; 

    public void cargarCliente(int codigoCliente, String nombreCliente, boolean tieneDescuento) 
    {
        this._codigoCliente = codigoCliente;
        this._nombreCliente = nombreCliente;
        this._tieneDescuento = tieneDescuento;
    }
    
    public int obtenerCodigoCliente() 
    {
        return _codigoCliente;
    }

    public String obtenerNombreCliente() 
    {
        return _nombreCliente;
    }

    public boolean obtenerTieneDescuento() 
    {
        return _tieneDescuento;
    }
    
    public void establecerTieneDescuento(boolean tieneDescuento) 
    {
        this._tieneDescuento = tieneDescuento;
    }

}
