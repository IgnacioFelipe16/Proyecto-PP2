package com.FacturacionYCocinaPP2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FacturacionYCocinaPP2.entities.DetalleFactura;
import com.FacturacionYCocinaPP2.repositories.BaseRepository;
import com.FacturacionYCocinaPP2.repositories.DetalleFacturaRepository;

@Service
public class DetalleFacturaServiceImpl extends BaseServiceImpl<DetalleFactura, Long> implements DetalleFacturaService{
	
	@Autowired
	private DetalleFacturaRepository detalleFacturaRepository;

	public DetalleFacturaServiceImpl(BaseRepository<DetalleFactura, Long> baseRepository, DetalleFacturaRepository detalleFacturaRepository) {
		super(baseRepository);
		this.detalleFacturaRepository = detalleFacturaRepository;
	}
	
	
}
