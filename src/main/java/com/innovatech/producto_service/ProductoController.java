package com.innovatech.producto_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*") // Habilitado desde el día 1
public class ProductoController {

    @Autowired
    private ProductoRepository repository;

    @GetMapping
    public List<Producto> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Producto crear(@RequestBody Producto producto) {
        return repository.save(producto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Producto actualizar(@PathVariable Long id, @RequestBody Producto producto) {
        producto.setId(id);
        return repository.save(producto);
    }
}