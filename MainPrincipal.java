MainPrincipal.java

public class MainPrincipal {
	public static void main (String[] args) {

	Pessoa objpessoa = new Pessoa ("Pedro", 45);
	
	System.out.println("Nome" + objpessoa.getNome());
	System.out.println("Idade" + objpessoa.getIdade());

	objpessoa.setNome("Ana");
	objpessoa.setIdade(20);

	System.out.println("Nome modificado" + objpessoa.getNome());
	System.out.println("Nome modificado" + objpessoa.getIdade());
	}
}
