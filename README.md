## Introdução

### O que é o Java

A linguagem Java é composta por um conjunto bem definido de funcionalidades (features) que são super recomendadas para você conhecer o máximo que puder.

Algumas funcionalidades essenciais para nosso engajamento com a linguagem:

| Object Oriented | Robust | Interpreted |
| --- | --- | --- |
| Simple | Portable | High Performance |
| Secured | Architecture Neutral | Multithreaded |
| Platform Independent | Dynamic | Distributed |
- Simples
    - simples e fácil de entender, pois não contém complexidades que existam em linguagens de programação anteriores. Na verdade, a simplicidade era o objetivo do design dos povos Javasoft, porque ele tem que funcionar em dispositivos eletrônicos onde menos memória/recursos estão disponíveis.
- Orientada a Objeto
    - isso significa que em Java tudo é escrito em termos de classes e objetos.
    - para começar a desenvolver softwares de forma consistente com Java, é necessário compreender os pilares da Programação Orientada a Objetos (POO), que são:
        - Classe e Objeto
        - Encapsulamento
        - Abstração
        - Herança
        - Polimorfismo
- Plataforma Independente
    - o código-fonte Java é compilado para bytecode e esse bytecode não está vinculado a nenhuma plataforma.
- Portátil
    - o conceito WORA (Write Once Run Anywhere) e o recurso independente de plataforma o torna portátil. Agora, usando a linguagem de programação Java, os desenvolvedores podem obter o mesmo resultado em qualquer máquina, escrevendo o código apenas uma vez. A razão por trás disso é JVM e bytecode.
- Robusta
    - significa que é capaz de lidar com o encerramento inesperado de um programa
        - usa um gerenciamento de memória forte
        - fornece coleta de lixo automática
        - há tratamento de exceção e mecanismo de verificação de tipos em Java
- Segura
    - problemas como ameaça de vírus, adulteração, espionagem ou representação podem ser tratados ou minimizados. E nossa construção de aplicativo também precisa de algum tipo de segurança. Por isso, a linguagem também fornece recursos de segurança para os programadores. Também existem recursos de criptografia e decriptografia para proteger seus dados contra espionagem e adulteração na internet.
- Interpretada
    - usa o compilador e o interpretador. São compilados para gerar arquivos de bytecode e a JVM interpreta o arquivo durante a execução.
- Multi-thread
    - thread é um processo leve e independente de um programa em execução que compartilha recursos. Mlti-thread é o nome dado ao processo de vários threads sendo executados simultaneamente.

---

# Aprendendo a Sintaxe Java

## Anatomia das Classes

A escrita de códigos de um programa é feita através da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome dos nossos arquivos, classes, atributos e métodos.

É muito comum  mesclarmos expressões no idioma americano com o nosso vocabulário. Existem projetos que recomendam que toda a implementação do seu programa seja escrita em língua inglesa. 

```java
public class MinhaClasse {
	public static void main (String [] args) {
    System.out.print ("Hello, world!");
  }
}
```

### Padrão de nomenclatura

- **Arquivo.java:** todo arquivo .java deve começar com letra maiúscula.
- **Nome da classe no arquivo:** a classe deve possuir o mesmo nome do Arquivo.java.
- **Nome de variável:** toda variável deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deve ser maiúscula.
- Deve conter apenas letras, _, $ ou números de 0 a 9;
- Não pode conter espaços;
- Não pode usar palavras reservadas;
- O nome deve ser único dentro de um escopo;
- Não pode começar com numeral;
- Deve ser clara, sem abreviações ou definição sem sentido;
- Deve ser no singular, exceto quando se referir a um array ou coleção;
- Devem ser escritas em apenas um idioma.

### Declarando variáveis e métodos

Declarar uma variável em Java requer a seguinte estrutura:

```java
tipo nomeBemDefinido = Atribuicao (opcional em alguns casos)
//Exemplo
int idade = 23;
double altura = 1.65;
Dog Spike;
```

Declarando métodos em Java segue uma estrutura bem simples:

```java
tipoRetorno nomeObjetivoNoInfinitivo (Parametro ou não)
//Exemplo
int somar (int numero1, int numero2)
String formatarCep (long cep)
```

### Identação

É um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.

### Organizando arquivos

A medida que nosso sistema vai evoluindo, surgem novos arquivos em nossa estrutura. Isso exige que seja realizado uma organização destes arquivos através de pacotes (packages).

### Java Beans

Uma das maiores dificuldades na programação é escrever algoritmos legíveis a níveis que sejam compreendidos por todo seu time ou você mesmo no futuro. Para isso a linguagem Java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos, pacotes.

## Tipos e Variáveis

No  Java, existem algumas palavras reservadas para a representação dos tipos de dados básicos que precisam ser manipulados para a construção de programas. Estes tipos são conhecidos como Tipos Primitivos (Primitive Types).

<aside>
📌 int, byte, short, long, float, double, boolean, char

</aside>

### Declaração de variáveis

Variável é uma identificação de um espaço em memória utilizado pelo nosso programa. Seguindo as convenções em linguagem de programação, toda variável é composta por: tipo de dados + identificação + valor atribuído.

```java
<Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>
//Exemplo
int idade;
int anoFabricacao = 2001;
double salarioMinimo = 2500,23;
```

### Variáveis e Constantes

Variável é uma área da memória, associada a um nome, que pode armazenar valores de um determinado tipo. Um tipo de dado define um conjunto de valores e um conjunto de operações. Java é uma linguagem com rigidez de tipos, diferente de linguagens como JavaScript, onde declarar o tipo não é obrigatório.

No Java utilizamos identificadores que representam uma referência a um valor de memória, e esta referência pode ser redirecionada e outro valor, sendo portanto a causa do nome “variável”.

Já as **Constantes** são valores armazenados em memória que não podem ser modificados depois de declarados. São representados pela palavra reservada *final*, seguida do tipo. São sempre escritas em CAIXA ALTA.
