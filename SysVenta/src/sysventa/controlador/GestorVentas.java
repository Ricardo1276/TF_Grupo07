/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sysventa.controlador;
import sysventa.modelo.Cliente;
import sysventa.modelo.Producto;
import sysventa.modelo.Venta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class GestorVentas {
   
    private List<Producto> listaProductos = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Venta> listaVentas = new ArrayList<>();

    public void registrarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void registrarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void registrarVenta(Cliente cliente, List<Producto> productos) {
        Venta venta = new Venta(cliente, productos, new Date());
        listaVentas.add(venta);
        System.out.println("Venta registrada correctamente.");
        System.out.println(venta);
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Venta> getListaVentas() {
        return listaVentas;
    }
}
