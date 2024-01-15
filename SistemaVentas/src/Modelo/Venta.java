
package Modelo;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import java.util.ArrayList;

public class Venta {
    private int folio;
    private Date fecha_y_hora;
    private int cantidad;
    private double subtotal;
    private double IVA;
    private double total;  
    private String vendedor;

    public Venta(int folio, Date fecha_y_hora, int cantidad, double subtotal, double IVA, double total, String vendedor) {
        this.folio = folio;
        this.fecha_y_hora = fecha_y_hora;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.IVA = IVA;
        this.total = total;
        this.vendedor = vendedor;
    }
    

    public Venta() {
    }

    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public Date getFecha_y_hora() {
        return fecha_y_hora;
    }

    public void setFecha_y_hora(Date fecha_y_hora) {
        this.fecha_y_hora = fecha_y_hora;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    
    
    public static ArrayList<Venta> listarVenta(){
        
        ArrayList<Venta> datos = new ArrayList<>();
        try (Connection con = Conexion.getConnection()){
            String sql = "select * from venta";
            try(PreparedStatement ps = con.prepareStatement(sql)){
                try(ResultSet rs = ps.executeQuery()){
                    while (rs.next()){                        
                        Venta v = new Venta();                        
                        v.setFolio(rs.getInt("folio"));
                        v.setFecha_y_hora(rs.getDate("fecha_actual"));
                        v.setCantidad(rs.getInt("cantidad_productos"));
                        v.setSubtotal(rs.getInt("subtotal"));                        
                        v.setIVA(rs.getInt("iva"));
                        v.setTotal(rs.getInt("total"));                        
                        v.setVendedor(rs.getString("vendedor"));                        
                        datos.add(v);
                        
                    }
                
                }
            
            }        
        }catch(Exception e){
            System.out.println("Error: "+ e);
        }
        return datos;
    
    
    }
    
    
}
