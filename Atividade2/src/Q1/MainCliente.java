/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;
import java.util.ArrayList;

/**
 *
 * @author 1222106962
 */
public class MainCliente {
    public static void main(String[]args){
        ArrayList<Cliente> cliente = new ArrayList<>();
        
        
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jorge");
        cliente1.setId(0);
        cliente1.setIdade(45);
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Wendell");
        cliente2.setId(1);
        cliente2.setIdade(19);
        
        Cliente cliente3 = new Cliente();
        cliente3.setNome("Roberto");
        cliente3.setId(2);
        cliente3.setIdade(23);
        
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
        
        System.out.println(cliente1.getNome()+"\n"+cliente1.getId()+"\n"+cliente1.getIdade()
        +"\n"+"\n"+cliente2.getNome()+"\n"+cliente2.getId()+"\n"+cliente2.getIdade()+"\n"+"\n"
        +cliente3.getNome()+"\n"+cliente3.getId()+"\n"+cliente3.getIdade());
        
    }
}
        
        
        
        

        
        
      
   

