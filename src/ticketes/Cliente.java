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

    private int codigoCliente;
    private String nombreCliente;
    private boolean tieneDescuento; 

    public void cargarCliente(int codigoCliente, String nombreCliente, boolean tieneDescuento) 
    {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.tieneDescuento = tieneDescuento;
    }
    
    public int obtenerCodigoCliente() 
    {
        return this.codigoCliente;
    }

    public String obtenerNombreCliente() 
    {
        return this.nombreCliente;
    }

    public boolean obtenerTieneDescuento() 
    {
        return this.tieneDescuento;
    }
    
    public void establecerTieneDescuento(boolean tieneDescuento) 
    {
        this.tieneDescuento = tieneDescuento;
    }

}
