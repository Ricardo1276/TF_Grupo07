/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;




/**
 *
 * @author LENOVO
 * * Clase que representa una venta realizada en la tienda.
 */
// Clase que representa una venta
public class Venta {
       private Cliente cliente;
    private Producto producto;
    private int cantidad;

    /**
     * Constructor que inicializa la venta con cliente, producto y cantidad.
     *
     * @param cliente  Cliente que realiza la compra
     * @param producto Producto que se compra
     * @param cantidad Cantidad del producto vendido
     */
    public Venta(Cliente cliente, Producto producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    // Métodos getters y setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Calcula el total a pagar por esta venta.
     *
     * @return Monto total de la venta (precio * cantidad)
     */
    public double calcularTotal() {
        return producto.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "cliente=" + cliente.getNombre() +
                ", producto=" + producto.getNombre() +
                ", cantidad=" + cantidad +
                ", total=" + calcularTotal() +
                '}';
    }
}
