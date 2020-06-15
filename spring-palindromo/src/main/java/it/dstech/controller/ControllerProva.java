package it.dstech.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerProva {
	@RequestMapping(value = "/chiamata")
	public ModelAndView parametro(@RequestParam("testo") String testo, Model model) {
		int contatore = contaParole(testo);
		List<String> parolePalindrome = new ArrayList<String>();
		String reverse = "";
		int contaPalindrome = 0;
		String [] parola = testo.split("\\s+");
			for (String string : parola) {
				System.out.println(string);
				for (int i = string.length()-1; i >= 0; i--) {
					reverse = reverse + string.charAt(i);
					}
				if(string.equals(reverse)) {
					parolePalindrome.add(reverse);
					contaPalindrome++;
				}
				reverse = "";
			}
		contatore = contatore + 1;
		for (String string : parolePalindrome) {
			System.out.println("Parole Palindrome: " + string);
		}
		System.out.println("Numero parole palindrome: " + contaPalindrome);
		System.out.println("Numero parole: " + contatore);
		ModelAndView view = new ModelAndView("risultato");
		view.addObject("contatore", contatore);
		view.addObject("contaPalindrome", contaPalindrome);
		view.addObject("parolePalindrome", parolePalindrome);
		return view;
	}

	private int contaParole(String testo) {
		int contatore = 0;
			for (int i = 0; i < testo.length(); i++) {
				if (testo.charAt(i) == ' ' && testo.charAt(i+1) != ' ') {
					contatore++;
				}
			}
		return contatore;
	}
}
