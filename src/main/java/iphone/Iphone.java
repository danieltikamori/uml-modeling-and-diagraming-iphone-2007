package iphone;

// Classe IPhone
class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String musicaAtual;
    private int volume;

    public IPhone() {
        this.musicaAtual = null;
        this.volume = 50;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música: " + musicaAtual);
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musicaAtual);
    }

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para: " + numeroTelefone);
    }

    @Override
    public void atender() {
        System.out.println("Atendedendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Redirecionando para correio de voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Carregando página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }
}
