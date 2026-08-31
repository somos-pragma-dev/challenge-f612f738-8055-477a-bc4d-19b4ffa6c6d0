package com.empresa.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@Tag(name = "Product Controller", description = "API para gestionar productos")
public class ProductController {

    @PostMapping
    @Operation(summary = "Crear un nuevo producto")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        // Logic to create product
        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @GetMapping
    @Operation(summary = "Obtener todos los productos")
    public ResponseEntity<List<Product>> getAllProducts() {
        // Logic to get all products
        return ResponseEntity.ok(List.of());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Obtener un producto por ID")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        // Logic to get product by ID
        return ResponseEntity.ok(new Product());
    }

    @PutMapping("/{id}")
    @Operation(summary = "Actualizar un producto por ID")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        // Logic to update product
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Eliminar un producto por ID")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        // Logic to delete product
        return ResponseEntity.noContent().build();
    }
}