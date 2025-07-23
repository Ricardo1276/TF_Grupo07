/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sysventa.modelo;

/**
 *
 * @author LENOVO
 */
public class Producto  {
    // Atributos (características del producto)
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor para crear productos fácilmente
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Métodos getter y setter (acceso y modificación de datos)
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Método para mostrar los datos del producto en texto
    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre + ", Precio: S/ " + precio + ", Stock: " + stock;
     }
}
