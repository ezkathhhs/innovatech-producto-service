package com.innovatech.producto_service;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String marca;
    private String familiaOlfativa;
    private Double precio;
    private Integer stock;

    // test
    // Constructores
    public Producto() {}

    public Producto(String nombre, String marca, String familiaOlfativa, Double precio, Integer stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.familiaOlfativa = familiaOlfativa;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getFamiliaOlfativa() { return familiaOlfativa; }
    public void setFamiliaOlfativa(String familiaOlfativa) { this.familiaOlfativa = familiaOlfativa; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public Integer getStock() { return stock; }
    public void setStock(Integer stock) { this.stock = stock; }
}