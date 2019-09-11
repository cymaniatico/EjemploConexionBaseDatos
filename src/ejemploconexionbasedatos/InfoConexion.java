/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploconexionbasedatos;

/**
 *
 * @author cymaniatico
 */
public class InfoConexion {
    
    String url = "jdbc:mysql://sql174.main-hosting.eu/u804115905_conta";
    String username="u804115905_sena";
    String password="senacbn";

    public InfoConexion() {
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
