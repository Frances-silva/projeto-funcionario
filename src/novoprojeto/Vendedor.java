package novoprojeto;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.List;

//classe vendedor herda de funcionario
public final class Vendedor extends Funcionario {

    //atributos
    private int codigo;
    private BigDecimal salario;
    

    //construtor
    public Vendedor(String nome, String cpf, LocalDate dataNascimento,
            List<String> telefones, Endereco endereco, int codigo, BigDecimal salario) {

        super(nome, cpf, dataNascimento, telefones, endereco);

        this.codigo = codigo;
        this.salario = salario;
    }
    

    //metodo de impressao
    public String imprimirVendedor() {
        NumberFormat formatar = NumberFormat.getCurrencyInstance();
        StringBuilder dados = new StringBuilder();

        dados.append(super.imprimirGeral())//super referencia a classe mae
                .append("\ncodigo :").append(this.codigo)
                .append("\nsalario :").append(formatar.format(this.salario.doubleValue()));

        return dados.toString();
    }

    
    
    //metodos especiais
    public int getCodigo() {
        return codigo;
    }

    public BigDecimal getSalario() {
        return salario;
    }

}
