package novoprojeto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

// classe abstrata 
public abstract class Funcionario {

    //atributos
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private List<String> telefones;
    private Endereco endereco;

    public Funcionario(String nome, String cpf, LocalDate dataNascimento,
            List<String> telefones, Endereco endereco) {

        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.telefones = telefones;
        this.endereco = endereco;
    }

    //metodo de impressao
    public String imprimirGeral() {
        StringBuilder dados = new StringBuilder();

        dados.append("\nfuncionario :").append(this.getNome().trim())
                .append("\ncpf :").append(this.getCpf().trim())
                .append("\ndata de nascimento :").append(this.getDataNascimento()
                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        for (String tele : telefones) {
            dados.append("\nnumero :").append(tele);
        }

        if (endereco != null) {
            dados.append("\n").append(endereco.imprimirEndereco().trim());
        }

        return dados.toString();

    }

    // metodos especiais
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public List<String> getTelefones() {
        return telefones;
    }

    public Endereco getEndereco() {
        return endereco;
    }

}
