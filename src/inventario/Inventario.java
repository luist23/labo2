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
public class Inventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaProducto lista = new ListaProducto();
        ListaUsers Usuarios = new ListaUsers();
        Usuarios.addAdmind("admin", "1234");
        Menu menu = new(Menu);
    }

}
