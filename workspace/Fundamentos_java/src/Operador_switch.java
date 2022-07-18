
public class Operador_switch {

	public static void main(String[] args) {
		 int dia = 6;
		String dia_da_semana;
		switch (dia) {
			case 0:  
				dia_da_semana = "segunda";
				break;
				
			case 1:  
				dia_da_semana = "terça";
				break;
				
			case 2:  
				dia_da_semana = "quarta";
				break;
				
			case 3:  
				dia_da_semana = "quinta";
				break;
				
			case 4:  
				dia_da_semana = "sssexta";
				break;
				
			case 5:  
				dia_da_semana = "sabado";
				break;
				
			case 6:  
				dia_da_semana = "domingo";
				break;
			
			default:
				dia_da_semana = "nao existe";
				break;
		}
		
		System.out.println("Dia da semana" + dia_da_semana);

	}

}
