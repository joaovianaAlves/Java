package Overload;

public class MinhaCalculadora {

	//sobrecarga de metodos 
	public int soma(int num1, int num2){
		return num1 + num2;
	}
	
	public double soma(double num1, double num2){
		return num1 + num2;
	}
	
	public int soma(int num1, int num2, int num3){
		return num1 + num2 + num3;
	}
	
	public int soma(int[] VetorInteiros){
		
		int total = 0;
		
		for(int i=0; i<VetorInteiros.length; i++){
			total += VetorInteiros[i];
		}
		return total;
	}

}
