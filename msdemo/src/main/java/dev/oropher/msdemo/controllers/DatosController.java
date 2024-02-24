package dev.oropher.msdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import dev.oropher.msdemo.models.entity.Producto;
import dev.oropher.msdemo.models.service.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class DatosController {
    
    @Autowired
    private IProductoService productoService;
    
    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.findAll();
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id) {
        return productoService.findById(id);
    }

}
