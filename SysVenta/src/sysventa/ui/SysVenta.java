/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sysventa.ui;
import sysventa.controlador.GestorVentas;
import sysventa.modelo.Cliente;
import sysventa.modelo.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class SysVenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GestorVentas gestor = new GestorVentas();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE VENTAS ===");
            System.out.println("1. Registrar producto");
            System.out.println("2. Registrar cliente");
            System.out.println("3. Registrar venta");
            System.out.println("4. Listar ventas");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    sc.nextLine();
                    gestor.registrarProducto(new Producto(codigo, nombre, precio, stock));
                    System.out.println("Producto registrado.");
                    break;

                case 2:
                    System.out.print("DNI: ");
                    String dni = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombreCliente = sc.nextLine();
                    System.out.print("Correo: ");
                    String correo = sc.nextLine();
                    gestor.registrarCliente(new Cliente(dni, nombreCliente, correo));
                    System.out.println("Cliente registrado.");
                    break;

                case 3:
                    if (gestor.getListaClientes().isEmpty() || gestor.getListaProductos().isEmpty()) {
                        System.out.println("Debe haber al menos un cliente y un producto.");
                        break;
                    }

                    System.out.println("Seleccione cliente:");
                    for (int i = 0; i < gestor.getListaClientes().size(); i++) {
                        System.out.println((i + 1) + ". " + gestor.getListaClientes().get(i));
                    }
                    int clienteIndex = sc.nextInt() - 1;

                    List<Producto> productosVenta = new ArrayList<>();
                    String continuar;
                    do {
                        System.out.println("Seleccione producto:");
                        for (int i = 0; i < gestor.getListaProductos().size(); i++) {
                            System.out.println((i + 1) + ". " + gestor.getListaProductos().get(i));
                        }
                        int productoIndex = sc.nextInt() - 1;
                        productosVenta.add(gestor.getListaProductos().get(productoIndex));
                        System.out.print("¿Agregar otro producto? (s/n): ");
                        continuar = sc.next();
                    } while (continuar.equalsIgnoreCase("s"));

                    gestor.registrarVenta(gestor.getListaClientes().get(clienteIndex), productosVenta);
                    break;

                case 4:
                    if (gestor.getListaVentas().isEmpty()) {
                        System.out.println("No hay ventas registradas.");
                    } else {
                        for (var venta : gestor.getListaVentas()) {
                            System.out.println("\n" + venta);
                        }
                    }
                    break;

                case 5:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    
    }
    
}
