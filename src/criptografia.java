import java.util.*;
public class criptografia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensagem = "";
		String senha;
		String acesso = "senha123";
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		senha = s.next();
		
		if(senha.equals(acesso)) {
		System.out.println("Digite sua mensagem");
		mensagem =s.next();
		s.nextLine();
		//System.out.println(encriptarComChave(senha, mensagem));
		System.out.println(decriptarComChave(senha, "vp+o"));
		}else{
			System.out.println("Senha incorreta.");
		}
		
		
}
	public static String encriptarComChave(String chave, String texto){
		
		String textoCifrado = "";
		
		int tamanhoTexto = texto.length();
		int letraCifradaASCII;
			
		// Criptografa cada caractere por vez 
		for(int c=0; c < tamanhoTexto; c++){
			// pega o codigo ASCII e faz a criptografia
			// não criptografa espaço.
			// pega o codigo ASCII e faz a criptografia
			// não criptografa espaço.
			int letranormal = ((int) texto.charAt(c));
			if (letranormal != 32)
				letraCifradaASCII = ((int) texto.charAt(c)) + ((int) chave.charAt(c % chave.length()));
			else
				letraCifradaASCII = ((int) texto.charAt(c));
						// Verifica se o codigo ASCII esta no limite dos 			
						// caracteres imprimiveis
			while(letraCifradaASCII > 126)  {
					letraCifradaASCII -= 94;
			}
			textoCifrado = textoCifrado + (char)letraCifradaASCII;
			}
			
			// retorna a mensagem criptografada por completo
			return textoCifrado;
		}
	
	
	public static String decriptarComChave(String chave, String textoCifrado)  {
		// Variavel que ira guardar o texto decifrado
		String texto = "";
		int tamanhoTexto = textoCifrado.length();
		int letraDecifradaASCII=0;
			
		// Deografa cada caractere por vez
		for(int c=0; c < tamanhoTexto; c++)   {
			int letracifradaASCII = (int) textoCifrado.charAt(c);
			if (letracifradaASCII != 32)
				letraDecifradaASCII = ((int) textoCifrado.charAt(c)) - ((int) chave.charAt(c % chave.length()));
			else
				letraDecifradaASCII = ((int) textoCifrado.charAt(c));

			// Verifica se o codigo ASCII esta no limite dos caracteres 		// imprimiveis
			while(letraDecifradaASCII < 32)
				letraDecifradaASCII += 94;

			// Transforma codigo ASCII deografado em caracter 		// ao novo texto
			texto = texto + (char)letraDecifradaASCII ;
		}
			
		return texto;
	}
	
	
	

}