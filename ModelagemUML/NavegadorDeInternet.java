package ModelagemUML;
public class NavegadorDeInternet {
    private byte aba = 0;
    private byte quantidadeAbas = 0;
    public String ExibirPagina(){
        if(aba == 0)aba++;
        return "Exibindo pagina " + aba;
    }
    public String AdicionarNovaAba(){
        this.aba = ++quantidadeAbas;
        this.quantidadeAbas++;
        return ExibirPagina();
    }
    public String AtualizarPagina(){
        return "Pagina atualizada";
    }
}
