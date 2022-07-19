package Exercicio01_getset_overload;

public class lampada {
	
	private String cor;
	private int potencia;
	private int valor;
	private String estaemestock;
	private boolean ligada;
	
	public lampada(){
		
	}
	
	public lampada(String cor, int potencia, int valor, String estaemestock, boolean ligada) {
		this.cor = cor;
		this.potencia = potencia;
		this.valor = valor;
		this.estaemestock = estaemestock;
		this.ligada = ligada;
	}



	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public String getEstaemestock() {
		return estaemestock;
	}
	public void setEstaemestock(String estaemestock) {
		this.estaemestock = estaemestock;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public void ligar(){
		setLigada(true);
	}
	public void desligar(){
		setLigada(false);
	}
	
	public void mostraEstado(){
	if(isLigada()){
		System.out.println("lampada esta ligada");
	}else{
			System.out.println("lampada esta desligada");
	
		}
	}
	
	public void mudarEstado(){
		if(isLigada()){
			desligar();
		}else{
			ligar();
		}
		
	}


}

