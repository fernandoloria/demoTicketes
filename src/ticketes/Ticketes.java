/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketes;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Ticketes {

    static Cliente cliente1 = new Cliente();
    static Cliente cliente2 = new Cliente();
    static Cliente cliente3 = new Cliente();
    
    static Vuelo vuelo1 = new Vuelo();
    static Vuelo vuelo2 = new Vuelo();
    static Vuelo vuelo3 = new Vuelo();
    static int numeroTickete;
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        cargarVuelo();
        numeroTickete = 100;
        while(continuar)
        {
            int codigoCliente, codigoVuelo;
            String  nombreCliente;
            
            System.out.print("Digite el codigo cliente:");
            codigoCliente = entrada.nextInt();
            while(codigoCliente <= 0 || codigoCliente > 3)
            {
                System.out.print("El codigoCliente debe ser 1,2 o 3:");
                codigoCliente = entrada.nextInt();
            }
            Cliente cliente = optenerCliente(codigoCliente);
            if(cliente.obtenerCodigoCliente() == 0)
            {
                System.out.println("Cliente nuevo!");
                System.out.print("Nombre Cliente:");
                nombreCliente = entrada.next();
                cliente.cargarCliente(codigoCliente, nombreCliente, false);
            }

            System.out.printf("Hola %s por favor digite el numero de vuelo los destinos son los siguientes: \n", cliente.obtenerNombreCliente());
            for(int i=1;i<=3;i++)
            { 
                Vuelo vuelo = optenerVuelo(i);
                System.out.println("Codigo Vuelo:" + vuelo.obtenerCodigoVuelo() + " Destino:" + vuelo.obtenerNombreDestino() + " Precio:" + optenerPrecioFinal(cliente,vuelo,false));               
            }
            System.out.print("Ingrese el cimprimirArtedigo Vuelo:");
            codigoVuelo = entrada.nextInt();
            Vuelo vuelo = optenerVuelo(codigoVuelo);
            String tickete = comprarTickete(cliente,vuelo);
            System.out.print(tickete);
            
            System.out.print("Desea salir S/N:");
            String cont = entrada.next();
            if(cont.toUpperCase().contentEquals("S"))
            {
                continuar = false;
            }
            System.out.print("\n");
        }  
        System.out.print(imprimirArte());
    }
    
    private static String imprimirArte()
    {
        String str = "";
        str += "Estimados pasajeros, todos nuestros vuelos estan atrasados les ofrecemos las disculpas por los inconvenientes. \n";
        for(int i=0;i<6;i++)
        {
            for(int e=0;e<i;e++)
            {
                str += " ";
            }
            str +="*\n"; 
        }
        str += "*******";
        return str;
    }
    
    private static String comprarTickete(Cliente cliente, Vuelo vuelo)
    { 
        String str = "**** Gracias por comprar en Aerolineas Fenix *****\n";
        str += "Tikete numero: " + numeroTickete;
        str += "\n";
        str += "Destino: " + vuelo.obtenerNombreDestino();
        str += "\n";
        str += "Monto cancelado:" + optenerPrecioFinal(cliente,vuelo,true);  
        str += "\n";
        if(vuelo.obtenerEstaAtrasado())
        {
            str += "Estimado pasajero su vuelo se encuentra atrasado, \n lamentamos los inconvenientes en los que pueda incurrir, \nla familia de Aerolineas Felix desea obsequierle un 25% de descuento en su proxima compra.\n";
            cliente.establecerTieneDescuento(true);
        }
        str += "Gracias y disfrute su vuelo \n";
        numeroTickete++;
        return str;
    }
    
    private static String optenerPrecioFinal(Cliente cliente, Vuelo vuelo,boolean usaDescuento)
    {
        String etiquetaPrecio;
        if(cliente.obtenerTieneDescuento())
        {
            double montoDescuento = vuelo.obtenerPrecio() * 0.25; //Aplica el 25 descuento por atraso en el tickete anterior
            double precio = vuelo.obtenerPrecio() - montoDescuento;
            etiquetaPrecio = "$" + precio + "25% desc (" + montoDescuento + ") precio anterior: " + vuelo.obtenerPrecio();
            if(usaDescuento)
            {
                cliente.establecerTieneDescuento(false);
            }
        }
        else
        {
            etiquetaPrecio = "$" + vuelo.obtenerPrecio();
        }
        return etiquetaPrecio;
    }
    
    private static Cliente optenerCliente(int codigoCliente)
    {
        Cliente cliente = new Cliente();
        switch (codigoCliente)
        {
            case 1: 
                cliente = cliente1;
                break;
            case 2: 
                cliente = cliente2;
                break;
            case 3: 
                cliente = cliente3;
                break;
        } 
        return cliente;
    }
    
    private static Vuelo optenerVuelo(int codigoVuelo)
    {
        Vuelo vuelo = new Vuelo();
        switch (codigoVuelo)
        {
            case 1: 
                vuelo = vuelo1;
                break;
            case 2: 
                vuelo = vuelo2;
                break;
            case 3: 
                vuelo = vuelo3;
                break;
        } 
        return vuelo;
    }
    
    private static void cargarVuelo()
    {
        vuelo1.cargarVuelo(1,"Miami", 300.00,false);
        vuelo2.cargarVuelo(2,"New York", 450.00, true);
        vuelo3.cargarVuelo(3,"Vegas", 375.00,true);
    }
    
}
