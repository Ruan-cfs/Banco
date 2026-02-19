public class Rico extends Banco{
    public int valMax = 9999999;
    public int valMin = 1000;
    public Rico(int dinheiro){
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

        if (this.dinheiro > valMax) {
            System.err.println(" [!] STATUS: DEPÓSITO REJEITADO");
            System.out.println(" Motivo: Valor excede o limite de 9999999.");
        } else if (this.dinheiro < valMin) {
            System.err.println(" [!] STATUS: OPERAÇÃO INVÁLIDA");
            System.out.println(" Motivo: Valor abaixo do mínimo de 1000.");
        } else {
            System.out.println(" [✓] STATUS: VALOR ACEITO COM SUCESSO");
            System.out.println(" Aproveite seu saldo!");
        }


        System.out.println("\n=======================================");
        System.out.println("       EXTRATO - CONTA ALTA RENDA        ");
        System.out.println("=======================================");
        System.out.printf(  " Saldo Atual: R$ %d,00\n", this.dinheiro);
        System.out.println(" Limite Máximo: R$ " + valMax + ",00");
        System.out.println("---------------------------------------");


    }

}
