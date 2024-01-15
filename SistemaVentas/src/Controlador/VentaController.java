/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Producto;
import java.util.ArrayList;
import Modelo.Venta;

/**
 *
 * @author Cristopher
 */
public class VentaController {
    public ArrayList<Venta> listarVenta(){
        return Venta.listarVenta();
    }
}
