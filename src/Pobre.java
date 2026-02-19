public class Pobre extends Banco {
    public int dinMax = 300;
    public int dinMin = 1;
    public Pobre(int dinheiro){
        super(dinheiro);
    }

    @Override
    protected boolean podeSacar(int valor) {
        if (valor > this.dinheiro) {
            System.out.println("\n[!] Atenção: Seu saldo insuficiente verifique seu saldo!");
            return false;
        }
        return true;
    }

    @Override
    public void Mostrar() {

        if (this.dinheiro > dinMax) {
            System.err.println(" [!] STATUS: DEPÓSITO REJEITADO");
            System.out.println(" Motivo: Valor excede o limite de 300.");
        } else if (this.dinheiro < dinMin) {
            System.err.println(" [!] STATUS: OPERAÇÃO INVÁLIDA");
            System.out.println(" Motivo: Valor abaixo do mínimo de 1.");
        } else {
            System.out.println(" [✓] STATUS: VALOR ACEITO COM SUCESSO");
            System.out.println(" Aproveite seu saldo!");
        }

        System.out.println("\n=======================================");
        System.out.println("       EXTRATO - CONTA BAIXA RENDA        ");
        System.out.println("=======================================");
        System.out.printf(  " Saldo Atual: R$ %d,00\n", this.dinheiro);
        System.out.println(" Limite Máximo: R$ " + dinMax + ",00");
        System.out.println("---------------------------------------");
    }

}
