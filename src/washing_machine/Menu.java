package washing_machine;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        WashingMachine maquina = new WashingMachine();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            maquina.mostrarstatus();
            System.out.println();
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Iniciar lavagem");
            System.out.println("4 - Pausar lavagem");
            System.out.println("5 - Retomar lavagem");
            System.out.println("6 - Finalizar lavagem");
            System.out.println("7 - Iniciar centrifugacao");
            System.out.println("8 - Finalizar centrifugacao");
            System.out.println("9 - Abrir tampa");
            System.out.println("10 - Fechar tampa");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = Integer.parseInt(scanner.nextLine());
            System.out.println();

            if (opcao == 1) {
                maquina.ligar();
            } else if (opcao == 2) {
                maquina.desligar();
            } else if (opcao == 3) {
                maquina.iniciarLavagem();
            } else if (opcao == 4) {
                maquina.pausarLavagem();
            } else if (opcao == 5) {
                maquina.retomarLavagem();
            } else if (opcao == 6) {
                maquina.finalizarLavagem();
            } else if (opcao == 7) {
                maquina.iniciarCentrifugacao();
            } else if (opcao == 8) {
                maquina.finalizarCentrifugacao();
            } else if (opcao == 9) {
                maquina.abrirTampa();
            } else if (opcao == 10) {
                maquina.fecharTampa();
            } else if (opcao != 0) {
                System.out.println("Opcao invalida.");
            }

            System.out.println();
        }

        System.out.println("Fim do programa.");
        scanner.close();
    }
}
