# POO - Desafio Modelagem e Diagramação de um Componente iPhone

Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos .java.

https://www.youtube.com/watch?v=9ou608QQRq8

Minutos relevantes: 00:15 até 00:55

## Objetivo

Funcionalidades a Modelar:

### Reprodutor Musical

Métodos: tocar(), pausar(), selecionarMusica(String musica)

### Aparelho Telefônico

Métodos: ligar(String numero), atender(), iniciarCorreioVoz()

### Navegador na Internet

Métodos: exibirPagina(String url), adicionarNovaAba(), atualizarPagina()

## Objetivo

Criar um diagrama UML que represente as funcionalidades descritas acima.
Implementar as classes e interfaces correspondentes em Java.

```Mermaid
classDiagram
  class ReprodutorMusical {
    - musicaAtual: String
    - volume: int

    + tocar()
    + pausar()
    + selecionarMusica(String musica)
  }

  class AparelhoTelefonico {
    - numeroTelefone: String

    + ligar(String numeroTelefone)
    + atender()
    + iniciarCorreioVoz()
    + desligarTelefonema()
  }

  class NavegadorInternet {
    - url: String

    + exibirPagina(String url)
    + adicionarNovaAba()
    + atualizarPagina()
  }

  class iPhone {
  }

  iPhone --> ReprodutorMusical
  iPhone --> AparelhoTelefonico
  iPhone --> NavegadorInternet
```