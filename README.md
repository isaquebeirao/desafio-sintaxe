# ContaBanco

Projeto desenvolvido como parte do curso de Java Básico da DIO. Este projeto consiste em uma aplicação que simula a criação de uma conta bancária, recebendo dados via terminal e exibindo uma mensagem de confirmação com os detalhes da conta criada.

## Descrição

O projeto `ContaBanco` recebe dados via terminal referentes a uma conta bancária, tais como:

- Número da conta (inteiro)
- Agência (texto)
- Nome do Cliente (texto)
- Saldo (decimal)

### Funcionamento

O programa solicita que o usuário insira as informações da conta através do terminal, exibindo mensagens para indicar qual dado está sendo solicitado. Após o preenchimento de todos os campos, o sistema exibe uma mensagem de confirmação com os detalhes fornecidos.

### Estrutura do Projeto

O projeto contém a classe `ContaTerminal.java`, que é responsável por realizar toda a codificação do programa.

## Como Executar

1. Clone o repositório:
    ```bash
    git clone https://github.com/isaquebeirao/desafio-sintaxe.git
    ```
2. Navegue até o diretório do projeto:
    ```bash
    cd ContaBanco
    ```
3. Compile o programa:
    ```bash
    javac ContaTerminal.java
    ```
4. Execute o programa:
    ```bash
    java ContaTerminal
    ```

### Exemplo de Uso

Ao executar o programa, o usuário verá as seguintes mensagens e deverá fornecer as informações solicitadas:

```plaintext
Por favor, digite o número da Agência !
Usuário: 067-8
Por favor, digite o número da Conta !
Usuário: 1021
Por favor, digite o nome do Cliente !
Usuário: MARIO ANDRADE
Por favor, digite o saldo da Conta !
Usuário: 237.48
 ```

Após a inserção dos dados, o sistema exibirá a mensagem:

```plaintext
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

###
Tecnologias Utilizadas
- Java
- Intellij IDEA
