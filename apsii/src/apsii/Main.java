package apsii;
import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<String> listaFunci = new ArrayList<>();
		
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome("Iago");
		funcionario1.setCPF("01526545878");
		funcionario1.setDataN(16122003);
		funcionario1.setMatricula(01);

		
		listaFunci.add(funcionario1.getNome());
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Leo");
		funcionario2.setCPF("04525412302");
		funcionario2.setDataN(10032002);
		funcionario2.setMatricula(02);
		
		listaFunci.add(funcionario2.getNome());
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.setNome("Iago");
		funcionario3.setCPF("07885415965");
		funcionario3.setDataN(12112004);
		funcionario3.setMatricula(03);
		
		listaFunci.add(funcionario3.getNome());		
		Salarios.ClassificaçaoFuncionario();

		
		
		
	}

}
