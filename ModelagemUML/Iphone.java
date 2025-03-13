package ModelagemUML;
import java.util.Random;

public class Iphone {
    public static void main(String[] args) {
        Random musica = new Random();
        ReprodutorMusical Ipod = new ReprodutorMusical();
        AparelhoTelefonico MobilePhone = new AparelhoTelefonico();
        NavegadorDeInternet Internet = new NavegadorDeInternet();

        System.out.println(Ipod.Tocar());
        System.out.println(Ipod.Pausar());
        System.out.println(Ipod.SelecionarMusica(musica.nextInt(10)));
        System.out.println(Ipod.SelecionarMusica());

        System.out.println(MobilePhone.Ligar());
        System.out.println(MobilePhone.Atender());
        System.out.println(MobilePhone.IniciarCorreioDeVoz());

        System.out.println(Internet.ExibirPagina());
        System.out.println(Internet.AdicionarNovaAba());
        System.out.println(Internet.AtualizarPagina());
    }
}