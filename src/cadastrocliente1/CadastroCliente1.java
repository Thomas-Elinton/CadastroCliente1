
package cadastrocliente1; 


public class CadastroCliente1 {

   
    public static void main(String[] args) {
        //Instanciando um objeto
        UICadastroCliente formularioCadastro = new UICadastroCliente();
        Pessoa cliente = new Pessoa(formularioCadastro.Nome,formularioCadastro.CPF,"Masculino",
                        formularioCadastro.Endereco,formularioCadastro.Cidade,formularioCadastro.Estado);
        
        
        
      
    }
    
}
