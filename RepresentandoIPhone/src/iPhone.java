public class iPhone {
    private String modelo;
    private String cor;

    public iPhone(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }

    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    public void pausarMusica() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public void ligar() {
        System.out.println("Ligando o telefone...");
    }

    public void atenderChamada() {
        System.out.println("Atendendo chamada...");
    }

    public void iniciarConversaVoz(Contato contato) {
        System.out.println("Iniciando conversa por voz com " + contato.getNome());
    }

    public void exibirPaginaWeb(String url) {
        System.out.println("Exibindo página web: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página no navegador...");
    }
}

