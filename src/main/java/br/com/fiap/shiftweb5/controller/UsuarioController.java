package br.com.fiap.shiftweb5.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


	@GetMapping
	public String get() {
		return "Consultando Usuário";
	}
	
	@PostMapping
	public String post() {
		return "cadastrando Usuário";
	}
	
	@PutMapping
	public String put() {
		return "alterando Usuário";
	}
	
	@DeleteMapping
	public String delete() {
		return "excluindo Usuário";
	}
	
}
