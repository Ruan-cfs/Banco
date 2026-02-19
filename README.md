# 🏦 Sistema de Banco - Demonstração de Lógica Java

Este projeto é mais um passo nos meus estudos de **Java**, onde simulo o funcionamento de contas bancárias com diferentes perfis. O foco aqui foi aplicar regras de validação e sobrescrita de métodos para diferenciar comportamentos entre tipos de conta.

## 🚀 O que estou praticando?

Neste exercício, foquei em aprofundar os seguintes conceitos de POO:

* **Sobrescrita de Métodos (@Override):** Personalização dos métodos `Mostrar` e `podeSacar` para que cada conta exiba extratos e valide limites de forma específica.
* **Lógica de Validação:** Implementação de condições para depósitos e saques, garantindo que valores abaixo do mínimo ou acima do máximo permitido sejam rejeitados.
* **Reutilização de Código:** Uso da classe base `Banco` para gerenciar os atributos comuns como `dinheiro` e `saque`, evitando repetição desnecessária.

## 🎮 Estrutura do Projeto

O sistema divide os clientes em dois perfis com regras distintas:

* **Conta Baixa Renda (Pobre):** Possui um limite máximo de depósito de R$ 300,00.
* **Conta Alta Renda (Rico):** Voltada para valores maiores, com um depósito mínimo exigido de R$ 1.000,00 e limite de até R$ 9.999.999,00.
* **Operações:**
* **Depósito:** Valida se o valor está dentro da faixa permitida pelo perfil.
* **Saque:** Verifica se há saldo suficiente antes de concluir a transação.
* **Extrato:** Exibe informações formatadas sobre o saldo atual e os limites da conta.



## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 15).
* **IDE:** IntelliJ IDEA.

## 📝 Exemplo de Execução

O arquivo `Main.java` testa o sistema criando uma conta de cada tipo e realizando operações de depósito e tentativa de saque para validar se as mensagens de erro e sucesso estão funcionando corretamente.

---

*Este repositório serve como registro da minha evolução na compreensão de estruturas de controle e orientação a objetos.*
