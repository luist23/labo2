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
public class Users {

    private String User;
    private String Password;

    public Users() {
    }

    public void setUser(String newUser) {
        User = newUser;
    }

    private void setNewPassword(String Password) {
        this.Password = Password;
    }

    public void setPassword(String newPassword) {

        Password = newPassword;
    }

    public String getUser() {
        return User;
    }

    public String getPassword() {
        return Password;
    }

}
