package com.fatec.scel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home() {
		return "/menu";
	}
	@GetMapping("/usuarios/cadastrar")
	public String cadastrarUsuario() {
		return "/cadastrarUsuario";
	}
	@GetMapping("/livros/cadastrar")
	public String cadastrarLivro() {
		return "/cadastrarLivro";
	}
	@GetMapping("/login")
	public String login() {
		return "/paginaLogin";
	}
}
