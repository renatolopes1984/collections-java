package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributo
    private Set<Convidado> convidadoSet;

    //Construtor
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    //Método de adição de convidados ao conjunto Set:
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    //Método de remoção de um convidado no conjunto Set:
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado convidado : convidadoSet){
            if(convidado.getCodigoConvite() == codigoConvite){
               convidadoParaRemover = convidado;
               break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    //Método que faz a contagem dos convidados:
    public int contarConvidados(){
        return convidadoSet.size();
    }

    //Método que exibe todos os convidados:
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }


}
