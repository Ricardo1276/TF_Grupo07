/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sysventa.modelo;

/**
 *
 * @author LENOVO
 */
public class Cliente {
     // Atributos del cliente
    private String dni;
    private String nombre;
    private String tipo; // Ej: "frecuente", "nuevo"

    // Constructor
    public Cliente(String dni, String nombre, String tipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Método para mostrar datos del cliente
    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre + ", Tipo: " + tipo;
    }
}
