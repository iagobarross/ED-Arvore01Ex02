package view;

import br.edu.fateczl.Arvore.*;
import controller.ArvoreController;

public class Principal {
	public static void main(String[] args) {
		ArvoreController arvCont = new ArvoreController();
		int[] vetor = { 33, 15, 41, 38, 47, 34, 49, 43 };
		Arvore arvore = new Arvore();
		
		arvore = arvCont.insereElemento(vetor);
		
		arvCont.printElementos(arvore);
	}
}
