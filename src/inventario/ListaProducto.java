/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author LuisT23
 */
public class ListaProducto {

    private ArrayList<Producto> productos;

    public ListaProducto() {
        productos = new ArrayList<>();
    }

    public void add() {
        Producto producto = new Producto();
        productos.add(producto);
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese nombre del producto: ");
        producto.Nombre = leer.nextLine();
        try {
            System.out.println("ingrese cantidad de producto: ");
            producto.Existencia = leer.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("por favor ingrese un numero");
            leer.nextLine();
        }
        try {
            System.out.println("ingrese precio de producto: ");
            producto.Precio = leer.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("por favor ingrese un numero");
            leer.nextLine();
        }

    }

    public void eliminarProducto() {
        System.out.println("ingrese nomre de producto a eliminar: ");
        Scanner leer = new Scanner(System.in);
        String productoAeliminar = leer.nextLine();
        for (Producto u : productos) {
            if (u.Nombre == productoAeliminar) {
                u = null;
                break;
            }
        }

    }

    public void modificarProducto(String nombre) {

    }

    public int descargarProdcuto(Producto producto, int descarga) {
        if (producto.Existencia <= descarga) {
            producto.Existencia -= descarga;
            return descarga;
        } else {
            descarga = producto.Existencia;
            producto.Existencia = 0;
            return descarga;
        }

    }

    public void cargarProducto(Producto producto, int carga) {
        producto.Existencia += carga;
    }
    
    public void mostrar(){
        for (Producto u: productos){
            u.mostrarExistencia();
        }
    }
    public Producto buscarProducto(String nombreProducto){
        for (Producto u : productos){
            if (u.Nombre==nombreProducto){
                return u;
            }
        }
        System.out.println("el producto no fue encontardo");
        return null;
    }

}
