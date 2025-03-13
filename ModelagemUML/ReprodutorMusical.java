package ModelagemUML;
public class ReprodutorMusical {
    private int musicaSelecionada = 0;
    public String Tocar(){
        if(musicaSelecionada == 0)musicaSelecionada++;
        return "Tocando musica " + musicaSelecionada;
    }
    public String Pausar(){
        return "Musica pausada";
    }
    public String SelecionarMusica(int musica){
        musicaSelecionada = musica;
        return "Tocando musica " + musicaSelecionada;
    }
    public String SelecionarMusica(){
        return this.SelecionarMusica(++musicaSelecionada);
    }
}
