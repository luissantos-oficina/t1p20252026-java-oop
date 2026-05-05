public class Cruzeiro extends Barco {

    private int numQuartos;
    private int numPisos;
    private String nomeBarco;

    public Cruzeiro() {
    }

    public Cruzeiro(int numQuartos, int numPisos, String nomeBarco) {
        this.numQuartos = numQuartos;
        this.numPisos = numPisos;
        this.nomeBarco = nomeBarco;
    }

    public int getNumQuartos() {
        return numQuartos;
    }
    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }
    public int getNumPisos() {
        return numPisos;
    }
    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }
    public String getNomeBarco() {
        return nomeBarco;
    }
    public void setNomeBarco(String nomeBarco) {
        this.nomeBarco = nomeBarco;
    }

    public void mostrarInfoCruzeiro() {
        super.mostraInfo();
        System.out.println("Num Quartos: " + numQuartos);
        System.out.println("Num Pisos: " + numPisos);
        System.out.println("Nome Barco: " + nomeBarco);
    }
}
