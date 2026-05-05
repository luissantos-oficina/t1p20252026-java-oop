public class Viatura {

    private String tipoCarro;
    private int numRodas;
    private int velMaxima;
    private String matricula;

    public Viatura() {
        numRodas = 2;
    }

    public Viatura(String tipoCarro, int numRodas, int velMaxima, String matricula) {
        this.tipoCarro = tipoCarro;
        this.numRodas = numRodas;
        this.velMaxima = velMaxima;
        this.matricula = matricula;
    }

    public Viatura(String tipoCarro, int numRodas, int velMaxima) {
        this.tipoCarro = tipoCarro;
        this.numRodas = numRodas;
        this.velMaxima = velMaxima;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }
    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
    public int getNumRodas() {
        return numRodas;
    }
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    public int getVelMaxima() {
        return velMaxima;
    }
    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    public void mostraInfo() {
        System.out.println("Vou mostrar a informação da viatura");
        System.out.println("Tipo: " + this.tipoCarro);
        System.out.println("Número de Rodas: " + this.numRodas);
        System.out.println("Velocidade Máxima: " + this.velMaxima);
        System.out.println("Matricula: " + this.matricula);
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
