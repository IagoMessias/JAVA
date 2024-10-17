/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;
/**
 *
 * @author 1222106962
 */
public class Empresa {
    private String nome;
    private String CNPJ;
    private int salario;
    private Funcionario funcionario[];  
    private int contador=0;
    
    public Empresa(int tamanho) {
    	this.funcionario = new Funcionario[tamanho];
    }
    
    public void adiciona(Funcionario f) {
    	if (contador < funcionario.length) {
    		funcionario[contador]=f;
    		contador++;
    	}else {
    		System.out.println("Não é possível adicionar mais funcionários.");
    	}
    }
    
    public void imprimeEmpregados() {
    	for (Funcionario f : funcionario) {
    		if (f!=null) {
    			System.out.println("Salário:"+f.getSalario());
    		}
    	}
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Funcionario[] getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario[] funcionario) {
		this.funcionario = funcionario;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
    
    
}
