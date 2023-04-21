import java.util.ArrayList;

public class Banco {
    
    private ArrayList<ContaBancaria> contas;
    private ArrayList<Pessoa> pessoas;

    private String nome;


    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.pessoas = new ArrayList<>();
    }

    public void criarConta(ContaBancaria conta){
        contas.add(conta);
    }

    public void CriarPessoa(Pessoa cons){
        pessoas.add(cons);
    }

    public String sacar(String numero, String agencia, double valor){

        
        for(ContaBancaria aux:contas){
            if(aux.getNumero().equals(numero) && 
               aux.getAgencia().equals(agencia)){
                return aux.sacar(valor);
            }
        }

        return "Conta não encontrada!!";

    }

    public String depositar(String numero, String agencia, double valor){

        
        for(ContaBancaria aux:contas){
            if(aux.getNumero().equals(numero) && 
               aux.getAgencia().equals(agencia)){
                return aux.depositar(valor);
            }
        }

        return "Conta não encontrada!";

    }

    public String relatorio(){
        String relatorio="";

        for(ContaBancaria aux:contas){
            relatorio=aux.mostrarSaldo()+"\n";
        }

        return relatorio;

    }

    public String buscarPessoa(String verificacpf){
        
        for(Pessoa aux:pessoas){
            if(aux.getCpf() == verificacpf){
                return "joia";
                //return aux.buscarPessoa(verificacpf);
                
                /*String texto1="";
                
                texto1 = "Nome" + nome ;

                return texto1;
                */
            }
        }  
      //5  System.out.println("erroooou");

        return "Cliente não encontrado!!";
      
    }

}
