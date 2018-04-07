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
public class ListaUsers {
    private ArrayList<Users> users;
    
    public ListaUsers(){
        users = new ArrayList<>();
    }
    
    public void add(){
        Users user = new Users();
        users.add(user);
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el nombre de usuario: ");
        user.setUser(leer.nextLine());
        System.out.println("ingrese la contraseña a usar: ");
        user.setPassword(leer.nextLine());
        
    }
    
    public boolean acceder(){
        System.out.println("ingrese nombre de usuario: ");
        Scanner leer = new Scanner(System.in);
        for ( Users u : users ){
            if ((u.getUser())==(leer.nextLine())){
                System.out.println("ingrese contraseña:");
                while (u.getPassword() != leer.nextLine()){
                    System.out.println("contarseeña incorrecta: ");
                    System.out.println("intentar nueamente? S/N");
                    if (leer.nextLine()== "N"){
                        return false;
                    }
                }
                return true;
            }
        }
        
    }
    
    
    
    
    
    
    
}

