public class Main {
    public static void main(String[] args){

        Pobre baixaRenda = new Pobre(200);
        Rico altaRenda = new Rico(150000);

        baixaRenda.Depositar();
        altaRenda.Depositar();

        baixaRenda.podeSacar(250);
        altaRenda.Sacar(100);

    }
}
