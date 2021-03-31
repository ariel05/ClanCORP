package com.clancorp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String goToIndex(Model model) {
		return "index";
	}
	@RequestMapping("/notificaciones")
	public String goToNotifications(Model model) {
		return "notifications";
	}
	@RequestMapping("/tablas")
	public String goToPositionTable(Model model) {
		return "tables";
	}
	@RequestMapping("/formulario")
	public String goToForm(Model model) {
		return "form";
	}

	@RequestMapping("/adminCrearLiga")
	public String goToAdminCargarLiga(Model model) {
		List<String> periodos = Arrays.asList("01/2021","02/2021","03/2021","04/2021","05/2021","06/2021","07/2021","08/2021","09/2021","10/2021","11/2021","12/2021");
		model.addAttribute("periodos", periodos);
		
		return "adminCrearLiga";
	}
	
	@RequestMapping("/adminCargarLiga")
	public String goToAdminCrearLiga(Model model) {
		return "adminCargarLiga";
	}
}
