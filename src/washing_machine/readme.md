# Máquina de Lavar - Trabalho de POO

Trabalho da disciplina de Programação Orientada a Objetos, curso de Sistemas de Informação, terceiro semestre.

## Sobre o exercício

O objetivo era modelar uma classe que representasse uma máquina de lavar roupas, controlando os estados de funcionamento da máquina e as regras de quais operações podem ou não ser feitas dependendo do estado atual.

## Arquivos

- **WashingMachine.java** - classe principal, com os atributos (`estado` e `tampaAberta`) e os métodos que controlam o funcionamento da máquina.
- **Main.java** - classe com o `main`, usada pra testar a máquina, chamando os métodos em sequência e mostrando tanto o funcionamento normal quanto os casos em que uma operação é bloqueada pelas regras.
- **diagrama.png** - diagrama de classe UML da `MaquinaDeLavar`.

## Estados da máquina

A máquina pode estar em um dos seguintes estados (guardados na variável `estado`):

- `desligada`
- `ligada`
- `lavando`
- `pausada`
- `lavagem concluida`
- `centrifugando`
- `centrifugacao concluida`

Além disso, existe o atributo `tampaAberta`, que controla se a tampa está aberta ou fechada.

## Métodos

- `ligar()` - liga a máquina, só funciona se ela estiver desligada.
- `desligar()` - desliga a máquina, não funciona se estiver lavando ou centrifugando.
- `iniciarLavagem()` - só funciona com a máquina ligada e a tampa fechada.
- `pausarLavagem()` - só funciona se a máquina estiver lavando.
- `retomarLavagem()` - só funciona se a lavagem estiver pausada.
- `finalizarLavagem()` - marca o fim do ciclo de lavagem (precisa pra poder centrifugar depois).
- `iniciarCentrifugacao()` - só funciona se a lavagem já tiver sido concluída e a tampa estiver fechada.
- `finalizarCentrifugacao()` - marca o fim da centrifugação.
- `abrirTampa()` - não funciona enquanto a máquina está lavando ou centrifugando.
- `fecharTampa()` - fecha a tampa.
- `imprimirStatus()` - imprime no console o estado atual da máquina e se a tampa está aberta ou fechada.

## Como rodar

1. Colocar os arquivos `MaquinaDeLavar.java` e `Main.java` na mesma pasta.
2. Rodar: `java Main`

;b