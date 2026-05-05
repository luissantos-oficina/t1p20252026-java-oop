public class Barco extends Viatura {

    private boolean temPiscina;

    public Barco() {
        super("Barco", 0, 0, "");
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }

    @Override
    public void mostraInfo() {
        System.out.println("Vou mostrar a informação do barco");
        System.out.println("Tipo: " + getTipoCarro());
        System.out.println("Número de Rodas: " + getNumRodas());
        System.out.println("Velocidade Máxima: " + getVelMaxima());
        System.out.println("Matricula: " + getMatricula());
        if (temPiscina) {
            System.out.println("Tem Piscina :-) ");
        } else {
            System.out.println("NAO Tem Piscina :-( ");
        }
    }
    
}
