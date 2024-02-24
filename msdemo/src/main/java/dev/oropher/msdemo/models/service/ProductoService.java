package dev.oropher.msdemo.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.oropher.msdemo.models.dao.ProductoDao;
import dev.oropher.msdemo.models.entity.Producto;
import jakarta.transaction.Transactional;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional()
    public List<Producto> findAll() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional()
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }
    
}
