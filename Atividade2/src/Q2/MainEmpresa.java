/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author 1222106962
 */
public class MainEmpresa {
	public static void main(String[] args) {
        Empresa empresa = new Empresa(10); 

        Funcionario f1 = new Funcionario();
        f1.setNome("Lucas");
        f1.setCPF("12345678901");
        f1.setSalario(2500);

        Funcionario f2 = new Funcionario();
        f2.setNome("Vinicius");
        f2.setCPF("98765432100");
        f2.setSalario(3000);

        empresa.adiciona(f1);
        empresa.adiciona(f2);

        empresa.imprimeEmpregados(); 
    }
}
