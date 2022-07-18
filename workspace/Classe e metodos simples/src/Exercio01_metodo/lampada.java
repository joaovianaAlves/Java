package Exercio01_metodo;

public class lampada {
	
	String cor;
	int potencia;
	int valor;
	String estaemestock;
	boolean ligada;
	
	void ligar(){
		ligada = true;
		}
	void desligar(){
		ligada = false;
		}
	
	void mostraEstado(){
	if(ligada){
		System.out.println("lampada esta ligada");
	}else{
			System.out.println("lampada esta desligada");
	
		}
	}
	
	void mudarEstado(){
		if(ligada){
			desligar();
		}else{
			ligar();
		}
		
	}


}
