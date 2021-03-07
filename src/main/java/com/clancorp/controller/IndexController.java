package com.clancorp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String goToIndex(Model model) {
		model.addAttribute("isIndex", true);
		return "dashboard";
	}
	@RequestMapping("/notificaciones")
	public String goToNotifications(Model model) {
		model.addAttribute("isNotifications", true);
		return "notifications";
	}
	@RequestMapping("/tablas")
	public String goToPositionTable(Model model) {
		model.addAttribute("isTable", true);
		return "tables";
	}
	@RequestMapping("/formulario")
	public String goToForm(Model model) {
		model.addAttribute("isForm", true);
		return "form";
	}
}
