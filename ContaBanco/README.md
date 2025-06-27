# ContaBanco

Este é um projeto simples em Java para simular a abertura de uma conta bancária via terminal. O usuário informa os dados da conta e recebe uma mensagem de confirmação.

## Funcionalidades

- Solicita ao usuário:
  - Número da agência
  - Número da conta (apenas inteiros)
  - Nome do cliente
  - Saldo inicial (apenas números)
- Exibe uma mensagem de boas-vindas com os dados informados

## Como executar

1. Certifique-se de ter o Java instalado (JDK 8 ou superior).
2. Compile o arquivo:

   ```
   javac src/ContaTerminal.java
   ```

3. Execute o programa:

   ```
   java -cp src ContaTerminal
   ```

## Exemplo de uso

```
Por favor, digite o número da Agência: 1234
Por favor, digite o número da Conta: 56789
Por favor, digite o nome do Cliente: João Silva
Por favor, digite o saldo: 1500.50

Olá João Silva, obrigado por criar uma conta em nosso banco, sua agência é 1234, conta 56789 e seu saldo 1500.5 já está disponível para saque.
```

## Autor

Projeto desenvolvido para fins de aprendizado na trilha Java Básico.
