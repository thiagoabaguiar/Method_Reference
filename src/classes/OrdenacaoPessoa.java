package classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo

    private List<Pessoa> listaPessoas;

    //construtor
    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void add(String nome, Integer idade, Double altura) {
        Pessoa novaPessoa = new Pessoa(nome, idade, altura);
        listaPessoas.add(novaPessoa);
    }

    public List<Pessoa> ordenarPorAltura() {

        if (!listaPessoas.isEmpty()) {
            
            List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
            pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoasPorAltura;
            
        } else {
            
            throw new RuntimeException("A lista está vazia!");
            
        }
    }

    @Override
    public String toString() {
        return """
               OrdenacaoPessoa{listaPessoas= 
               """ + listaPessoas + '}';
    }

}
