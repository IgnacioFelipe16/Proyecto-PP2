package com.FacturacionYCocinaPP2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FacturacionYCocinaPP2.entities.Factura;
import com.FacturacionYCocinaPP2.repositories.BaseRepository;
import com.FacturacionYCocinaPP2.repositories.FacturaRepository;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService{
	
	@Autowired
	private FacturaRepository facturaRepository;

	public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository, FacturaRepository facturaRepository) {
		super(baseRepository);
		this.facturaRepository = facturaRepository;
	}
	
	
}
