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
    
    public void add(Producto producto){
        productos.add(producto);
    }
    
    public void descargar(ListaProducto lista){
        System.out.println("ingrese producto a vender: ");
        Scanner leer = new Scanner(System.in);
        String productoVendido = leer.nextLine();
        Producto newVenta=lista.buscarProducto(productoVendido);
        String flag;
        if (newVenta==null){
            System.out.println("desea continuar S/N");
            flag=leer.next();
            if (flag=="N" || flag=="n"){
                return;
            }
            descargar(lista);
        }else{
            System.out.println("ingrese total de producto avender: ");
            int total =lista.descargarProdcuto(newVenta, leer.nextInt());
            ventaTotal +=total * newVenta.Precio;
            cantidadProducto +=total;
            System.out.println("desea continuar S/N");
            flag=leer.next();
            if (flag=="N" || flag=="n"){
                return;
            }
            descargar(lista);
        }
        
        
    }
    
    
    
    
    
}
