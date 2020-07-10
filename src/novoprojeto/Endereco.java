package novoprojeto;

public final class Endereco {

    //atributos
    private String cidade;
    private String bairro;
    private String nomeRua;
    private int numeroCasa;

    //Construtor
    public Endereco(String cidade, String bairro, String nomeRua, int numeroCasa) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.nomeRua = nomeRua;
        this.numeroCasa = numeroCasa;

    }

    // metodos de impressao
    public String imprimirEndereco() {
        StringBuilder dados = new StringBuilder();

        dados.append("\ncidade :").append(this.getCidade())
                .append("\nbairro :").append(this.getBairro())
                .append("\nnome da rua :").append(this.getNomeRua())
                .append("\nnumero da casa :").append(this.getNumeroCasa());

        return dados.toString();
    }

    // metodos especiais
    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

}
