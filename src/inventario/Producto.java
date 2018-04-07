/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author LuisT23
 */
public class Producto {
    
    public String Nombre;
    public int Precio;
    public int Existencia;
    
    public void producto(){
        Precio=0;
        Existencia=0;
    }
    
    public void mostrarExistencia(){
        System.out.println(Nombre + "   Existen " + Existencia + "  Precio: "  + Precio);
    }
    
    
    
    
}
