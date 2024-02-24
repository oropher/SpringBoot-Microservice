package dev.oropher.msdemo.models.dao;

import org.springframework.data.repository.CrudRepository;

import dev.oropher.msdemo.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long>{
    
}
