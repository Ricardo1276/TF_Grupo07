# TF_Grupo07

Este proyecto es una aplicación de consola desarrollada en Java con Maven, como parte del trabajo final del curso de Programación. Su objetivo es simular el funcionamiento de una tienda informática, permitiendo registrar clientes, productos (como laptops, mouses, teclados, etc.) y realizar ventas, aplicando los principios de la programación orientada a objetos y el control de stock.


## 👥 Integrantes
- Ricardo Quispe Vilca  
- Ronaldo Waldir Quispe Supho
  
## 📁 Estructura del Proyecto
TF_Grupo07/
├── Source Packages/
│   ├── com.miproyecto.tf_grupo07/
│   │   └── TF_Grupo07.java
│   ├── controlador/
│   │   └── GestorVentas.java
│   └── modelo/
│       ├── Cliente.java
│       ├── Producto.java
│       └── Venta.java
├── Test Packages/
├── Dependencies/
│   └── JDK 22 (Default)


## 🛠 Funcionalidades
- Registro de clientes con nombre, DNI y correo.
- Registro de productos con código, nombre, precio y stock.
- Proceso de venta con verificación de stock.
- Cálculo total de la venta y actualización de stock.
- Detalle de la venta mostrado en consola.

## 🚀 Requisitos
- NetBeans con soporte Maven  
- JDK 17 o superior (en este caso JDK 22 está configurado)  
- Git (opcional, para control de versiones)

## ▶️ Ejecución
1. Abrir el proyecto con NetBeans.
2. Ejecutar la clase `TF_Grupo07.java` ubicada en `com.miproyecto.tf_grupo07`.
3. Ingresar los datos que solicita el sistema en consola.

## 📌 Observaciones
- El proyecto está dividido en paquetes:  
  - `modelo` para clases lógicas (Cliente, Producto, Venta).  
  - `controlador` para clases de gestión (GestorVentas).  
  - `com.miproyecto.tf_grupo07` contiene el punto de entrada (main).  
