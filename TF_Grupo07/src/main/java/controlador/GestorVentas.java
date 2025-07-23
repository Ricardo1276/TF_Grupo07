package controlador;

/* controlador;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;
import modelo.Producto;
import modelo.Venta;

/**
 *
 * @author LENOVO
 
 */
// Clase que gestiona las ventas del sistema
public class GestorVentas {
    // Lista para almacenar los productos disponibles
    private List<Producto> productos;

    // Lista para almacenar los clientes registrados
    private List<Cliente> clientes;

    // Lista para almacenar las ventas realizadas
    private List<Venta> ventas;

    /**
     * Constructor que inicializa las listas.
     */
    public GestorVentas() {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    // Métodos para agregar entidades al sistema

    /**
     * Agrega un producto nuevo a la lista.
     *
     * @param producto Producto a agregar
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Agrega un cliente nuevo a la lista.
     *
     * @param cliente Cliente a agregar
     */
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Registra una venta en el sistema.
     *
     * @param venta Venta a registrar
     */
    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }

    // Métodos para obtener las listas

    public List<Producto> getProductos() {
        return productos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Venta> getVentas() {
        return ventas;
    }
}