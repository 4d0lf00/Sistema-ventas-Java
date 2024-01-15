
package Modelo;



public class Usuario {
    private String nombre;
    private String usuario;
    private String clave;

    public Usuario(String nombre, String usuario, String clave) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    

}
