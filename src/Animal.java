public class Animal {
    private String nome;
    private Double comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private Double velocidade;

    public Animal(String nome, Double comprimento, int numeroDePatas, String cor, String ambiente, Double velocidade) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }
}
