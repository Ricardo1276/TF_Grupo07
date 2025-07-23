/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sysventa.modelo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Venta {
    private Cliente cliente;
    private List<Producto> productos;
    private double total;
    private Date fecha;

    // Constructor
    public Venta(Cliente cliente, List<Producto> productos, Date fecha) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.total = calcularTotal();
    }

    // Método para calcular el total de la venta
    private double calcularTotal() {
        double suma = 0;
        for (Producto p : productos) {
            suma += p.getPrecio(); // puedes modificar si deseas incluir cantidad
        }
        return suma;
    }

    // Getters y setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
        this.total = calcularTotal(); // recalcula total al cambiar productos
    }

    public double getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    // Método para mostrar detalles de la venta
    @Override
    public String toString() {
        return "Venta realizada el " + fecha +
               "\nCliente: " + cliente +
               "\nProductos: " + productos +
               "\nTotal: S/ " + total;
    }
}
