package com.brmgf.ds_vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brmgf.ds_vendas.dto.SellerDTO;
import com.brmgf.ds_vendas.entities.Seller;
import com.brmgf.ds_vendas.repositories.SellerRepository;

@Service
public class SellerService {

	/* injeta a dependencia de forma transparente */
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
