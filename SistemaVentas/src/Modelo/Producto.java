
package Modelo;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Producto {
    private int codigo;
    private String nombre;
    private int stock;
    private double precio;

    public Producto(int codigo, String nombre, int stock, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static ArrayList<Producto> listar(){
        ArrayList<Producto> datos = new ArrayList<>();
        try (Connection con = Conexion.getConnection()){
            String sql = "select * from producto";
            try(PreparedStatement ps = con.prepareStatement(sql)){
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){
                        Producto p = new Producto(0, sql, 0, 0);
                        p.setCodigo(rs.getInt("codigo"));
                        p.setNombre(rs.getString("nombre"));
                        p.setPrecio(rs.getInt("precio"));
                        p.setStock(rs.getInt("stock"));
                        datos.add(p);
                    }
                
                }
            
            }        
        }catch(Exception e){
            System.out.println("Error: "+ e);
        }
        return datos;
    
    
    }
    
    
    
}
