public class App {
    public static void main(String[] args) throws Exception {
        //
        //System.out.println("Hello, World!");

        Viatura carro = new Viatura();
        carro.setNumRodas(4);
        carro.setTipoCarro("Carro Desportivo");
        carro.setVelMaxima(120);

        carro.mostraInfo();
    }
}
