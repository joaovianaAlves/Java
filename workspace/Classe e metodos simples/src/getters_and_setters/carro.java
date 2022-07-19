package getters_and_setters;

public class carro {

	//privando variaveis para encapsulamento
	private String Modelo;
	private int passageiros; 
	private String Marca;
	private double cap_do_tanque;
	private double com_combustivel;
	
	//getters and setters, encapsulando
	public String getMarca(){
		return this.Marca;
	}
	
	public void setMarca(String Marca){
		this.Marca = Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public double getCap_do_tanque() {
		return cap_do_tanque;
	}

	public void setCap_do_tanque(double cap_do_tanque) {
		this.cap_do_tanque = cap_do_tanque;
	}

	public double getCom_combustivel() {
		return com_combustivel;
	}

	public void setCom_combustivel(double com_combustivel) {
		this.com_combustivel = com_combustivel;
	}
	
	
	
}
