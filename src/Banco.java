import java.util.ArrayList;

public class Banco {
    
    private ArrayList<ContaBancaria> contas;

    private String nome;


    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void criarConta(ContaBancaria conta){
        contas.add(conta);
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

        return "Conta não encontrada!!";

    }

    public String relatorio(){
        String relatorio="";

        for(ContaBancaria aux:contas){
            relatorio=aux.mostrarSaldo()+"\n";
        }

        return relatorio;

    }



}
