package com.FacturacionYCocinaPP2.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FacturacionYCocinaPP2.entities.Producto;
import com.FacturacionYCocinaPP2.repositories.BaseRepository;
import com.FacturacionYCocinaPP2.repositories.ProductoRepository;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto, Long> implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;

	public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository) {
		super(baseRepository);
		this.productoRepository = productoRepository;
	}

}
