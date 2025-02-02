public class Elevador {
    public int andarAtual = 0;
    public int capacidade = 0;
    public int totalAndares = 0;
    public int pessoasPresentes = 0;

    public Elevador(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    }
    public String Inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        return "Você iniciou o elevador";
    }
    public String entra() {
        this.pessoasPresentes = this.pessoasPresentes++;
        return "Você adicionou uma pessoa, agora o elevador possui " + this.pessoasPresentes;
    }
    public String sai() {
        this.pessoasPresentes = this.pessoasPresentes--;
        return "Você removeu uma pessoa";
    }
    public String sobe() {
        andarAtual++;
        return "você está no andar" + andarAtual;

    }
    public String desce() {
        andarAtual--;
        return "Você está no andar" + andarAtual;

    }
}
