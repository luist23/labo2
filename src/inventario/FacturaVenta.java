/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LuisT23
 */
public class FacturaVenta {
    
    int ventaTotal;
    int cantidadProducto;
    private ArrayList<Producto> productos;

    public FacturaVenta() {
        productos = new ArrayList<>();
        ventaTotal=0;
        cantidadProducto=0;
    }
    
    public void add(){
        Producto producto = new Producto();
        productos.add(producto);
        Scanner leer = new Scanner(System.in);
    }
    
    public void descargar(){
        
    }
    
    
    
    
    
}
