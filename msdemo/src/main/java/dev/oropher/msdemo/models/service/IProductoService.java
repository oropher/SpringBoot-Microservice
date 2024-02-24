package dev.oropher.msdemo.models.service;

import java.util.List;

import dev.oropher.msdemo.models.entity.Producto;

public interface IProductoService {

    public List<Producto> findAll();
    public Producto findById(Long id);
    
}
