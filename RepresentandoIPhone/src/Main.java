
    public class Main {
        public static void main(String[] args) {
            iPhone meuiPhone = new iPhone("iPhone 13", "Preto");

            Contato contato1 = new Contato("Isa", "123-456-7890");

            meuiPhone.selecionarMusica("CORALINE");
            meuiPhone.tocarMusica();
            meuiPhone.pausarMusica();

            meuiPhone.ligar();
            meuiPhone.atenderChamada();
            meuiPhone.iniciarConversaVoz(contato1);

            meuiPhone.exibirPaginaWeb("www.example.com");
            meuiPhone.adicionarNovaAba();
            meuiPhone.atualizarPagina();
        }
    }
