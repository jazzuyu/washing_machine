package washing_machine;
public class WashingMachine {

    // guarda o estado atual da maquina (desligada, ligada, lavando, pausada, lavagem concluida, centrifugando, centrifugacao concluida)
    String estado;
    boolean tampaAberta;

    public WashingMachine() {
        estado = "desligada";
        tampaAberta = false;
    }

    public void ligar() {
        if (estado.equals("desligada")) {
            estado = "ligada";
            System.out.println("Maquina ligada");
        } else {
            System.out.println("A maquina ja esta ligada.");
        }
    }

    public void desligar() {
        if (estado.equals("lavando") || estado.equals("centrifugando")) {
            System.out.println("Nao pode desligar enquanto estiver lavando ou centrifugando.");
        } else if (estado.equals("desligada")) {
            System.out.println("A maquina ja esta desligada.");
        } else {
            estado = "desligada";
            System.out.println("Maquina desligada.");
        }
    }

    public void iniciarLavagem() {
        if (estado.equals("desligada")) {
            System.out.println("Precisa ligar a maquina antes de lavar.");
            return;
        }
        if (tampaAberta) {
            System.out.println("Feche a tampa antes de iniciar a lavagem.");
            return;
        }
        if (!estado.equals("ligada")) {
            System.out.println("Nao e possivel iniciar a lavagem agora.");
            return;
        }
        estado = "lavando";
        System.out.println("Lavagem iniciada.");
    }

    public void pausarLavagem() {
        if (estado.equals("desligada")) {
            System.out.println("Maquina desligada, nao tem como pausar.");
            return;
        }
        if (!estado.equals("lavando")) {
            System.out.println("So da pra pausar durante a lavagem.");
            return;
        }
        estado = "pausada";
        System.out.println("Lavagem pausada.");
    }

    public void retomarLavagem() {
        if (!estado.equals("pausada")) {
            System.out.println("Nao existe lavagem pausada pra retomar.");
            return;
        }
        estado = "lavando";
        System.out.println("Lavagem retomada.");
    }

    // usei esse metodo pra marcar quando a lavagem termina, senao não dava
    // pra saber quando podia liberar a centrifugacao
    public void finalizarLavagem() {
        if (!estado.equals("lavando")) {
            System.out.println("Nao ha lavagem em andamento.");
            return;
        }
        estado = "lavagem concluida";
        System.out.println("Lavagem concluida.");
    }

    public void iniciarCentrifugacao() {
        if (!estado.equals("lavagem concluida")) {
            System.out.println("A lavagem precisa estar concluida pra centrifugar.");
            return;
        }
        if (tampaAberta) {
            System.out.println("Feche a tampa antes de centrifugar.");
            return;
        }
        estado = "centrifugando";
        System.out.println("Centrifugacao iniciada.");
    }

    public void finalizarCentrifugacao() {
        if (!estado.equals("centrifugando")) {
            System.out.println("Nao ha centrifugacao em andamento.");
            return;
        }
        estado = "centrifugacao concluida";
        System.out.println("Centrifugacao concluida. Ja pode desligar a maquina.");
    }

    public void abrirTampa() {
        if (estado.equals("lavando") || estado.equals("centrifugando")) {
            System.out.println("Nao da pra abrir a tampa nesse estado.");
            return;
        }
        if (tampaAberta) {
            System.out.println("A tampa ja esta aberta.");
            return;
        }
        tampaAberta = true;
        System.out.println("Tampa aberta.");
    }

    public void fecharTampa() {
        if (!tampaAberta) {
            System.out.println("A tampa ja esta fechada.");
            return;
        }
        tampaAberta = false;
        System.out.println("Tampa fechada.");
    }

    public void mostrarstatus() {
        System.out.println("Estado atual: " + estado + " Tampa: " + (tampaAberta ? "aberta" : "fechada"));
    }
}