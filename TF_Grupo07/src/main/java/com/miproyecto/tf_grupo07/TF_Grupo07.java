/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.miproyecto.tf_grupo07;

import modelo.Cliente;
import modelo.Producto;
import modelo.Venta;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 * Clase principal que ejecuta el menú del sistema de ventas.
 */
public class TF_Grupo07 {
  
      private static List<Cliente> clientes = new ArrayList<>();
    private static List<Producto> productos = new ArrayList<>();
    private static List<Venta> ventas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n=== SISTEMA DE VENTAS ===");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Registrar producto");
            System.out.println("3. Realizar venta");
            System.out.println("4. Listar ventas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> registrarCliente(scanner);
                case 2 -> registrarProducto(scanner);
                case 3 -> realizarVenta(scanner);
                case 4 -> listarVentas();
                case 5 -> System.out.println("Gracias por usar el sistema.");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private static void registrarCliente(Scanner scanner) {
        System.out.print("Ingrese nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese DNI del cliente: ");
        String dni = scanner.nextLine();
        System.out.print("Ingrese correo del cliente: ");
        String correo = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, dni, correo);
        clientes.add(cliente);
        System.out.println("Cliente registrado con éxito.");
    }

    private static void registrarProducto(Scanner scanner) {
        System.out.print("Ingrese código del producto: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese precio del producto: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese stock disponible: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        Producto producto = new Producto(codigo, nombre, precio, stock);
        productos.add(producto);
        System.out.println("Producto registrado con éxito.");
    }

    private static void realizarVenta(Scanner scanner) {
        if (clientes.isEmpty() || productos.isEmpty()) {
            System.out.println("Debe registrar al menos un cliente y un producto antes de vender.");
            return;
        }

        System.out.println("Seleccione cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i).getNombre());
        }
        System.out.print("Opción: ");
        int clienteIndex = scanner.nextInt() - 1;

        System.out.println("Seleccione producto:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i).getNombre() + " (Stock: " + productos.get(i).getStock() + ")");
        }
        System.out.print("Opción: ");
        int productoIndex = scanner.nextInt() - 1;

        System.out.print("Ingrese cantidad a comprar: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        Producto producto = productos.get(productoIndex);
        if (cantidad > producto.getStock()) {
            System.out.println("No hay suficiente stock disponible.");
            return;
        }

        // Reducir stock
        producto.setStock(producto.getStock() - cantidad);

        Venta venta = new Venta(clientes.get(clienteIndex), producto, cantidad);
        ventas.add(venta);
        System.out.println("Venta realizada con éxito.");
        System.out.println("Total a pagar: S/ " + venta.calcularTotal());
    }

    private static void listarVentas() {
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            System.out.println("\n=== LISTA DE VENTAS ===");
            for (Venta venta : ventas) {
                System.out.println(venta);
            }
        }
    }
}
