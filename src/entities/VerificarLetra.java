package entities;

public class VerificarLetra {
	public String nome;

	public VerificarLetra() {
		super();
	}
	
	public VerificarLetra(String nome) {
		this.nome = nome;
	}
	
	public void verificarString() {
		
		if (nome == null || nome.isEmpty()) {
            System.out.println("A string 'nome' está vazia ou não foi inicializada.");
            return;
        }
		
		int contador = 0;
		
		for (int i = 0; i < this.nome.length(); i ++) {
			char letra = nome.charAt(i);
			
		if (letra == 'a' || letra == 'A') {
			contador++;
		}
	}
		if (contador > 0) {
			System.out.println("A letra 'a' foi encontrada " + contador + " vezes. ");
		} else {
			System.out.println("A letra 'a' nao foi encontrada");
		}
		
	}

}
