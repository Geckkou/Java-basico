import java.util.*;
public class Exercico_aeroporto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        String regiao="";
	        int idaevolta;
	        System.out.println("Digite o destino desejado:");
	        Scanner s = new Scanner(System.in);
	        regiao = s.next();
	        if ( regiao.equalsIgnoreCase("nordeste") || regiao.equalsIgnoreCase("norte") || regiao.equalsIgnoreCase("centro-oeste") )   {
	            System.out.println("Deseja ida e volta (1 - Sim / 2 – Não)?");
	            idaevolta = s.nextInt();
	            if (regiao.equalsIgnoreCase("norte"))
	                if (idaevolta == 1)
	                    System.out.println("Passagem para o Norte ida e volta: R$ 180 reais");
	                else
	                    System.out.println("Passagem para o Norte só ida: R$ 100 reais");
	            if (regiao.equalsIgnoreCase("nordeste"))
	                if (idaevolta == 1)
	                    System.out.println("Passagem para o Nordeste ida e volta: R$ 375 reais");
	                else
	                    System.out.println("Passagem para o Nordeste só ida: R$ 205 reais");
	            if (regiao.equalsIgnoreCase("centro-oeste"))
	                if (idaevolta == 1)
	                    System.out.println("Passagem para o Centro-oeste ida e volta: R$ 1007 reais");
	                else
	                    System.out.println("Passagem para o Centro-oeste só ida: R$ 548 reais");
	        }
	        else  {
	            System.out.println("Região não coberta pela nossa companhia ou inválida.");
	        }
	     }
	}


