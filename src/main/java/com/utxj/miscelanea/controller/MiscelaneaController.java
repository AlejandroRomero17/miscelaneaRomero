package com.utxj.miscelanea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.utxj.miscelanea.model.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/miscelanea")
public class MiscelaneaController {

    @GetMapping
    public String mostrarTienda() {
        return "index";
    }

    @GetMapping("/productos")
    public String producto(Model modelo) {
        List<producto> productos = new ArrayList<producto>();
        productos.add(new producto(1, "Televisor", 399.99f, 599.99f, "Electrónicos", "Samsung"));
        productos.add(new producto(2, "Laptop", 899.99f, 1299.99f, "Computadoras", "Dell"));
        productos.add(new producto(3, "Smartphone", 299.99f, 499.99f, "Electrónicos", "Apple"));
        productos.add(new producto(4, "Cámara", 199.99f, 299.99f, "Fotografía", "Canon"));
        productos.add(new producto(5, "Refrigerador", 799.99f, 1199.99f, "Electrodomésticos", "LG"));
        productos.add(new producto(6, "Aspiradora", 59.99f, 89.99f, "Electrodomésticos", "Dyson"));

        modelo.addAttribute("productos", productos);
        return "producto";
    }

    @GetMapping("/ventas")
    public String venta(Model modelo) {
        List<venta> ventas = new ArrayList<venta>();
        ventas.add(new venta(11, "15/02/2024", 101, 1001, 499.99f, "Samsung Store"));
        ventas.add(new venta(12, "18/02/2024", 202, 1002, 1099.99f, "Dell Shop"));
        ventas.add(new venta(13, "20/02/2024", 303, 1003, 399.99f, "Apple Reseller"));
        ventas.add(new venta(14, "22/02/2024", 404, 1004, 249.99f, "Camera World"));
        ventas.add(new venta(15, "25/02/2024", 505, 1005, 999.99f, "LG Electronics"));
        ventas.add(new venta(16, "28/02/2024", 606, 1006, 69.99f, "Home Appliances"));

        modelo.addAttribute("ventas", ventas);
        return "venta";
    }

    @GetMapping("/proveedores")
    public String proveedor(Model modelo) {
        List<proveedor> proveedores = new ArrayList<proveedor>();
        proveedores
                .add(new proveedor(111, "Yulisa Vazquez", "09:00-17:00", "Samsung", "Calle Principal 123", "1234567890"));
        proveedores.add(
                new proveedor(112, "Joan Salas", "08:00-18:00", "Dell", "Avenida Secundaria 456", "2345678901"));
        proveedores.add(
                new proveedor(113, "Carlos Ocelote", "10:00-16:00", "Apple", "Calle Comercial 789", "3456789012"));
        proveedores.add(
                new proveedor(114, "Javier Prades", "09:30-19:30", "Canon", "Avenida Tecnológica 101", "4567890123"));
        proveedores.add(
                new proveedor(115, "Alvaro Vazquez", "08:00-20:00", "LG", "Calle de la Tecnología 202", "5678901234"));
        proveedores
                .add(new proveedor(116, "Ana Valdez", "07:30-17:30", "Sony", "Plaza de la Innovación 303", "6789012345"));

        modelo.addAttribute("proveedores", proveedores);
        return "proveedor";
    }

    @GetMapping("/empleados")
    public String empleado(Model modelo) {
        List<empleado> empleados = new ArrayList<empleado>();
        empleados.add(new empleado(101, "Alejandro", "Gonzalez", "Romero", "10:00-12:00", "Gerente"));
        empleados.add(new empleado(102, "Mariano", "Pérez", "López", "09:00-17:00", "Vendedor"));
        empleados.add(new empleado(103, "María", "González", "Martínez", "08:00-16:00", "Cajero"));
        empleados.add(new empleado(104, "Carlos", "Hernández", "Sánchez", "10:30-18:30", "Reponedor"));
        empleados.add(new empleado(105, "Laura", "Rodríguez", "Fernández", "12:00-20:00", "Supervisor"));
        empleados.add(new empleado(106, "Pedro", "López", "García", "11:00-19:00", "Asistente de Tienda"));

        modelo.addAttribute("empleados", empleados);
        return "empleado";
    }

    @GetMapping("/clientes")
    public String cliente(Model modelo) {
        List<cliente> clientes = new ArrayList<cliente>();
        clientes.add(new cliente(5001, "Haziel", "Ortiz", "Ramirez", "Zapata", "12342342134"));
        clientes.add(new cliente(5002, "Fernanda", "García", "López", "Av. Juárez 123", "5512345678"));
        clientes.add(new cliente(5003, "Juan Carlos", "Hernández", "González", "Calle Revolución 456", "5523456789"));
        clientes.add(new cliente(5004, "Laura", "Martínez", "Rodríguez", "Paseo de la Reforma 789", "5534567890"));
        clientes.add(new cliente(5005, "Pedro", "Sánchez", "Pérez", "Calle de la Paz 101", "5545678901"));
        clientes.add(new cliente(5006, "Ana", "López", "Fernández", "Avenida Hidalgo 202", "5556789012"));

        modelo.addAttribute("clientes", clientes);
        return "cliente";
    }
}
