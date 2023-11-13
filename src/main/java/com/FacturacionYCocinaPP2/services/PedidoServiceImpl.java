package com.FacturacionYCocinaPP2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FacturacionYCocinaPP2.entities.Pedido;
import com.FacturacionYCocinaPP2.repositories.BaseRepository;
import com.FacturacionYCocinaPP2.repositories.PedidoRepository;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService{

	@Autowired
	private PedidoRepository pedidoRepository;

	public PedidoServiceImpl(BaseRepository<Pedido, Long> baseRepository, PedidoRepository pedidoRepository) {
		super(baseRepository);
		this.pedidoRepository = pedidoRepository;
	}
	
	

}
