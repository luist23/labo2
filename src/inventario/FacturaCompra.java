/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.Scanner;

/**
 *
 * @author LuisT23
 */
public class FacturaCompra {

    public void add(ListaProducto lista) {
        System.out.println("ingrese nombre de producto: ");
        Scanner leer = new Scanner(System.in);
        String producto = leer.nextLine();
        Producto newProducto = lista.buscarProducto(producto);
        if (newProducto == null) {
            System.out.println("el producto no existe se creara uno nuevo ;)");
            lista.add();
        }else{
        System.out.println("ingrese cantidad comprada: ");
        int total = leer.nextInt();
        newProducto.Existencia += total;
    }
        System.out.println("continuar S/N : ");
        producto = leer.nextLine();
        if (producto == "S"){
            add(lista);
        }
    }
}
