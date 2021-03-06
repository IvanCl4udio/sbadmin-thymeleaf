package net.ivancl4udio.apps.SBAdminJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Classe responsável por tratar as requisições vindas do usuário as redirecionando para a página template correta
 * 
 * @author IvanCl4udio
 *
 */
@Controller
public class ViewController {

	/**
	 * Metodo que recebe a requisição '/login' do tipo GET e redireciona para o template do Thymeleaf
	 * @return String relativa ao nome do template do Thymeleaf
	 */
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}

	/**
	 * Metodo que recebe a requisição '/forgotpassword' do tipo GET e redireciona para o template do Thymeleaf
	 * @return String relativa ao nome do template do Thymeleaf
	 */
	@GetMapping("/forgotpassword")
	public String forgotPassword() {
		return "forgot-password";
	}

	/**
	 * Metodo que recebe a requisição '/register' do tipo GET e redireciona para o template do Thymeleaf
	 * @return String relativa ao nome do template do Thymeleaf
	 */
	@GetMapping("/register")
	public String register() {
		return "register";
	}

	/**
	 * Metodo que recebe a requisição '/' do tipo GET e redireciona para o template do Thymeleaf
	 * @return String relativa ao nome do template do Thymeleaf
	 */
	@GetMapping("/")
	public String home() {
		return "index";
	}

	/**
	 * Metodo que recebe a requisição '/blank' do tipo GET e redireciona para o template do Thymeleaf
	 * @return String relativa ao nome do template do Thymeleaf
	 */
	@GetMapping("/blank")
	public String blank() {
		return "blank";
	}
	/**
	 * Metodo que recebe a requisição '/charts' do tipo GET e redireciona para o template do Thymeleaf
	 * @return String relativa ao nome do template do Thymeleaf
	 */
	@GetMapping("/charts")
	public String charts() {
		return "charts";
	}
	/**
	 * Metodo que recebe a requisição '/tables' do tipo GET e redireciona para o template do Thymeleaf
	 * @return String relativa ao nome do template do Thymeleaf
	 */
	@GetMapping("/tables")
	public String tables() {
		return "tables";
	}
}
