package com.carros.carros.domain.dto;

import org.modelmapper.ModelMapper;

import com.carros.carros.domain.Carro;

import lombok.Data;

@Data
public class CarroDTO {
	private Long id;
	private String nome;
	private String tipo;
	
	 public static CarroDTO create(Carro carro) {
	        ModelMapper modelMapper = new ModelMapper();
	        return modelMapper.map(carro, CarroDTO.class);
	    }
}
