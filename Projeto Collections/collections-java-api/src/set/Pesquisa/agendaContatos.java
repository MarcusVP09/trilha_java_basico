package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class agendaContatos {
    private Set<Contato> contatoSet;

    public agendaContatos() {
        this.contatoSet =new HashSet<>();
}
        public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }   
    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);
                              
            }
        }
        return contatoPorNome;
    }
   public Contato atualizarNumeroContato(String nome, int novoNumero){
    Contato contatoAtuallizado = null;
    for(Contato c: contatoSet){
        if (c.getNome().equalsIgnoreCase(nome)) {
            c.setNumero(novoNumero);
            contatoAtuallizado=c;
            break;
            
        }
    }
    return contatoAtuallizado;
   }
public static void main(String[] args) {
    agendaContatos agendaContatos = new agendaContatos();
    
    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("João", 123456789);
    agendaContatos.adicionarContato("Maria", 987654321);
    agendaContatos.adicionarContato("Maria Fernandes", 55555555);
    agendaContatos.adicionarContato("Ana", 88889999);
    agendaContatos.adicionarContato("Fernando", 77778888);
    agendaContatos.adicionarContato("Carolina", 55555555);

    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Maria"));

    
    Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
    System.out.println("Contato atualizado: " + contatoAtualizado);

    // Exibindo os contatos atualizados na agenda
    System.out.println("Contatos na agenda após atualização:");
    agendaContatos.exibirContatos();
}


}

