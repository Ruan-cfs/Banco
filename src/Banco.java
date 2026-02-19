public class Banco {
    protected int dinheiro=0;
    protected int saque=0;

    public Banco(int dinheiro){
        this.dinheiro=dinheiro;
    }
    public void Mostrar(){
        //esse metodo esta na class Pobre <=
    }
    public void Depositar(){
        Mostrar();
    }
    public void Sacar(int saque){
        this.saque=saque;
        int ress = this.dinheiro-this.saque;
        if (this.saque < 0){
            System.out.println("\n[!] Valor de saque inválido.");
            return;
        }
        if (podeSacar(this.saque)){
            int saldoAnterior = this.dinheiro;
            System.out.println("\n---------------------------------------");
            System.out.println("      SAQUE REALIZADO COM SUCESSO      ");
            System.out.println("---------------------------------------");
            System.out.printf(  " Saldo anterior : %d\n", saldoAnterior);
            System.out.printf(  " Valor do saque : %d\n", this.saque);
            System.out.printf(  " Saldo Atual    : %d\n", ress);
            System.out.println("---------------------------------------");
        }
    }

    protected boolean podeSacar(int valor) {
        return false;
    }
}
