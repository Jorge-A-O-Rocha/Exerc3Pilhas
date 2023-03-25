package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {
	
	public FatController() {
		super();
	}
	
	public int fatorial(int valor) throws Exception {
		
		Pilha pilha = new Pilha();
		
		if(pilha.isEmpty() ) {
			
			for(int i = 0; i <= valor; i++) {
				pilha.push(i);
			}
			
		} 
	
		if( !pilha.isEmpty() ){
			for(int j=1; j < valor; j++) {
				int v1 = pilha.pop();
				int v2 = pilha.pop();
				
				 pilha.push(v1* v2); 				
			}			
		}
		int res = pilha.top();
		return res;
		
	}

}
