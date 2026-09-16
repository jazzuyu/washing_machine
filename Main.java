package washing_machine;
public class Main {

    public static void main(String[] args) {
        WashingMachine maquina = new WashingMachine();

        // tentando usar sem ligar
        maquina.iniciarLavagem();
        maquina.pausarLavagem();
        maquina.desligar();
        maquina.mostrarstatus();

        System.out.println();
        maquina.ligar();
        maquina.ligar(); // ja esta ligada, tem que dar erro
        maquina.mostrarstatus();

        System.out.println();
        maquina.iniciarLavagem();
        maquina.abrirTampa(); // nao pode, ta lavando
        maquina.desligar(); // nao pode, ta lavando
        maquina.mostrarstatus();

        System.out.println();
        maquina.pausarLavagem();
        maquina.pausarLavagem(); // ja ta pausada
        maquina.abrirTampa(); // agora pode, ta pausada
        maquina.iniciarLavagem(); // tampa aberta, nao da
        maquina.fecharTampa();
        maquina.retomarLavagem();
        maquina.mostrarstatus();

        System.out.println();
        maquina.finalizarLavagem();
        maquina.mostrarstatus();

        System.out.println();
        maquina.iniciarCentrifugacao();
        maquina.abrirTampa(); // nao pode, ta centrifugando
        maquina.desligar(); // nao pode, ta centrifugando
        maquina.mostrarstatus();

        System.out.println();
        maquina.finalizarCentrifugacao();
        maquina.mostrarstatus();

        System.out.println();
        maquina.abrirTampa();
        maquina.desligar();
        maquina.desligar(); // ja esta desligada
        maquina.mostrarstatus();
    }
}