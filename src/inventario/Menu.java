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
public class Menu {

    public static Menu menu;

    public Menu() {

    }

    

    public void mostrar(ListaUsers users, ListaProducto productoslista) {
        System.out.println("-------------INVENTARIO------------");

        System.out.println("ingrese su nombrede usuario: ");
        while (!users.acceder()) {
            System.out.println("usuario invalido. intente otra vez: ");
        }
        System.out.println("desea: \n 1.vender \n 2.comprar \n 3.eliminar un producto");

        Scanner leer = new Scanner(System.in);
        int opc = leer.nextInt();

        switch  (opc)
            {
            case 1:
                FacturaVenta venta = new (FacturaVenta);
                venta.descargar(productoslista);
                break;
            case 2:
                FacturaCompra compra = new (FacturaCompra);
                compra.add(productoslista);
                break;
            case 3:
                System.out.println("que producto desea eliminar: ");
                productoslista.mostrar();
                productoslista.eliminarProducto(leer.nextLine());
                break;

        }

    }

}
