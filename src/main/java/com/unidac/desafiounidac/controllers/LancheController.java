package com.unidac.desafiounidac.controllers;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.unidac.desafiounidac.models.Lanche;
import com.unidac.desafiounidac.repository.LancheRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
@Api(value = "Api REST Lanches")
public class LancheController {
	
	@Autowired
	LancheRepository lancheRepository;
	
	@GetMapping("/lanches")
	@ApiOperation(value="Retorna uma lista de lanches")
	public List<Lanche> listaLanche() {
		return lancheRepository.findAll();
		
	}
	
	@GetMapping("/lanche/{id}")
	@ApiOperation(value="Retorna um unico lanche")
	public Lanche listaLancheUnico(@PathVariable(value="id") long id) {
		return lancheRepository.findById(id);
	}
	
	
	@PostMapping("/lanche")
	@ApiResponses({ @ApiResponse(code = 201, message = "Criado"), @ApiResponse(code = 400, message = "Bad Request"), @ApiResponse(code = 500, message = "Valor duplicado", response = Error.class) })
	@ResponseStatus
	@ApiOperation(value="Salva um lanche")
	public  Lanche salvaLanche(@RequestBody @Valid Lanche lanche) {	
		 return lancheRepository.save(lanche);
		
	}
	
	@DeleteMapping("/lanche")
	@ApiOperation(value="Deleta um lanche")
	public void deletaLanche(@RequestBody Lanche lanche) {
		lancheRepository.delete(lanche);
		
	}
	
	@PutMapping("/lanche")
	@ApiOperation(value="Atualiza um lanche")
	public Lanche atualizaLanche(@RequestBody Lanche lanche) {
		return lancheRepository.save(lanche);
		
	}
	
	

}
