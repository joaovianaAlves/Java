
public class operador_if {

	public static void main(String[] args) {
		int valor1, valor2;
		boolean Tof;
		valor1 = 20;
		valor2 = 13;
		
		if(valor1 == valor2) {
		   System.out.println("igual");
			
		} else {
			System.out.println("diferentes");
		}
		
			if(valor1 > valor2){
				System.out.println("O maior valor e:" + valor1);
			
			}else {
				System.out.println("O maior valor e:"+ valor2);
			}
				
				if (valor1 < valor2){
					System.out.println("o menor valor e:"+ valor1);
				
				}else {
					System.out.println("o menor valor e:"+ valor2);
				}
	if(valor1 >= valor2){
		Tof = true;
		System.out.println("valor1 maior ou igual aou valor2" + Tof);
	}else {
		Tof = false; // nao e necessario por poiso java ja entende essa opçao com false
		System.out.println("valor1 nao e maior ou igual ao valor2" + Tof);	
	} 
	
	}
	

}
