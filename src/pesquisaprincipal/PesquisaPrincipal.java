
package pesquisaprincipal;

import java.io.IOException;
import java.util.Scanner;


public class PesquisaPrincipal {
    //criar a aplicação para consultar a API viaCep
    //menu de busca o cep
    //gerar o arquivo .JSON com os dados do endereço.

    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        ConsutarCep consultarCep = new ConsutarCep();
        
        System.out.println("Digite o numero de CEP para consultar : ");
        var cep = leitura.nextLine();
        
        try{
            Endereco novoEndereco = consultarCep.pesquisaEndereco(cep);
            System.out.println(novoEndereco);
            GerandoArquivo gerador = new GerandoArquivo();
            gerador.SalvandoArquivoJson(novoEndereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
   
    }
    
}
    

