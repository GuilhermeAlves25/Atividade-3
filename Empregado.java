public class Empregado {
    private String nome;
    private String sobrenome;
    private double salarioM;

    public Empregado(String nome, String sobrenome, double salarioM) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioM = salarioM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioM() {
        return salarioM;
    }

    public void setSalarioM(double salarioM) {
        this.salarioM = salarioM;
    }
    public Double CalcularSalarioAnual() {
        double SalarioAnual = getSalarioM()*12;
        return SalarioAnual;
    }
    public void Aumento(double porcentagem){
        porcentagem = porcentagem/100;
        setSalarioM(getSalarioM()+(getSalarioM()*porcentagem));
    }

}
