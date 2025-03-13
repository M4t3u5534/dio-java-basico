import java.util.Random;

public class AparelhoTelefonico {
    public String Ligar(){
        Random tocar = new Random();
        for (int i=0;i<10;i++) {
            System.out.println("...");
            if(tocar.nextInt(4) == 3){
                return "Ligacao atendida";
            }
        }
        return "Ligacao nao atendida";
    }
    public String Atender(){
        return "Ligacao atendida";
    }
    public String IniciarCorreioDeVoz(){
        return "Correio de voz iniciado";
    }
}
