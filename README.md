# FiapRide — Sistema de Mobilidade Urbana

Projeto incremental desenvolvido na disciplina de **Programação Orientada a Objetos (POO)**.
A cada aula, uma nova camada de conceitos é adicionada ao sistema — este README funciona como
**material de estudo**, documentando a teoria e a prática de cada etapa do projeto.

**Stack:** Java
**Padrão de pacotes:** `br.com.fiapride.model` (classes/entidades) e `br.com.fiapride.main` (execução/testes)

---

## Aula 1 — Fundamentos de OO: Classes e Objetos

### O que é uma Classe e o que é um Objeto?

| Classe | Objeto |
|---|---|
| O **molde**, o plano, a "planta da casa" | A **instância**, a "casa construída" |
| Conceito abstrato — não ocupa memória de execução | Concretização — ocupa espaço real na memória (RAM) |
| Define **o que pode existir** (quais atributos) | Define **quais são os valores atuais** |

> **Analogia:** a Classe é como o DNA; o Objeto é o ser vivo criado a partir daquele DNA.
> Todos compartilham a mesma estrutura, mas cada um tem seu próprio **estado**.

### Estado do Objeto
"Estado" é o conjunto de valores dos atributos de um objeto em um dado momento. É **mutável** —
o funcionamento de um software nada mais é do que a gestão da mudança de estado dos objetos
(ex: `saldo` de um passageiro muda de `50.0` para `40.0` após pagar uma viagem).

### Abstração: a arte de ignorar detalhes
Abstração não é "criar classes por criar" — é modelar **apenas o que o negócio precisa**.
Regra de ouro: *se o sistema não usa aquele dado para uma regra de negócio, ele é ruído e não
deve existir na classe.*

### Clean Code em atributos (Uncle Bob)
- Nomes **pronunciáveis** e significativos (`generationTimestamp`, não `genymdhms`).
- Sem redundância: se a classe já é `Passageiro`, o atributo é `nome`, não `nomePassageiro`
  (`passageiro.nome`, nunca `passageiro.nomePassageiro`).

---

## Aula 2 — Métodos e Comportamentos

### Teoria
Se os **Atributos** são os substantivos/adjetivos de um objeto, os **Métodos** são os **verbos**
— as ações que ele executa.

Para que servem os métodos?
1. **Alterar o estado** do objeto (ex: recarregar saldo).
2. **Comunicar-se com outros objetos** (um objeto chama o método de outro).
3. **Proteger regras de negócio** (impedir ações inválidas, como sacar sem saldo).

Sem métodos, os objetos seriam apenas listas de dados sem inteligência.

### Clean Code para métodos
- **Ações são verbos:** `atualizarEstoque()`, `registrarAlta()`.
- **Funções pequenas:** uma única responsabilidade por método — valida a regra e altera o estado.
- **Nomes de parâmetros significativos:** `quantidadeComprada`, nunca `q` ou `x`.


---

## Aula 2 — Métodos e Comportamentos

### Teoria
Se os **Atributos** são os substantivos/adjetivos de um objeto, os **Métodos** são os **verbos**
— as ações que ele executa.

Para que servem os métodos?
1. **Alterar o estado** do objeto (ex: recarregar saldo).
2. **Comunicar-se com outros objetos** (um objeto chama o método de outro).
3. **Proteger regras de negócio** (impedir ações inválidas, como sacar sem saldo).

Sem métodos, os objetos seriam apenas listas de dados sem inteligência.

### Clean Code para métodos
- **Ações são verbos:** `atualizarEstoque()`, `registrarAlta()`.
- **Funções pequenas:** uma única responsabilidade por método — valida a regra e altera o estado.
- **Nomes de parâmetros significativos:** `quantidadeComprada`, nunca `q` ou `x`.


---

## Aula 3 — Encapsulamento: Getters e Setters

###  A Teoria: a cápsula e o caixa eletrônico

O problema da Aula 2: mesmo tendo o método `adicionarSaldo()`, nada impedia alguém de fazer
`passageiro1.saldo = -500.0;` diretamente, ignorando toda a regra de negócio.

**Encapsulamento** é a técnica de esconder os detalhes internos de um objeto e proteger seus dados.

> **Analogia:** o cofre de um caixa eletrônico é **privado**. Você não abre a tampa e pega o
> dinheiro — o banco te dá uma tela com botões (**públicos**). Você clica em "Sacar", o sistema
> valida, e só então a máquina mexe no cofre por você.

### Modificadores de acesso
| Modificador | Símbolo UML | Quem acessa |
|---|---|---|
| `private` | `-` | Somente a própria classe |
| `public` | `+` | Qualquer classe do sistema |

**Regra de ouro:** atributos **sempre** `private`. O acesso externo só acontece através de métodos
controlados (`get`/`set`).

---

### Setter privado: por quê?
Perceba que `setSaldo()` é **privado**. Em vez de deixar qualquer classe alterar o saldo
livremente com `setSaldo(50)`, obrigamos o uso de métodos com regra de negócio clara:
`adicionarSaldo()` e `pagarViagem()`. Isso é uma prática avançada de Clean Code — **não crie
setters para tudo automaticamente**. Se um atributo nunca deve mudar depois de criado, ele
**não deve** ter setter.

> **Pergunta de reflexão:** por que é seguro deixar o `get` público, mas perigoso deixar o
> atributo original público? Pense na diferença entre dar uma **cópia** de um documento e
> entregar o **original** para alguém rasurar.

---

# 🚗 FiapRide — Sistema de Mobilidade Urbana

Projeto incremental desenvolvido na disciplina de **Programação Orientada a Objetos (POO)**.
A cada aula, uma nova camada de conceitos é adicionada ao sistema — este README funciona como
**material de estudo**, documentando a teoria e a prática de cada etapa do projeto.

**Stack:** Java
**Padrão de pacotes:** `br.com.fiapride.model` (classes/entidades) e `br.com.fiapride.main` (execução/testes)

---

## 📚 Índice

- [Aula 1 — Fundamentos de OO: Classes e Objetos](#aula-1--fundamentos-de-oo-classes-e-objetos)
- [Aula 2 — Métodos e Comportamentos](#aula-2--métodos-e-comportamentos)
- [Aula 3 — Encapsulamento: Getters e Setters](#aula-3--encapsulamento-getters-e-setters)
- [Aula 4 — Construtores](#aula-4--construtores)
- [Aula 5 — Associação de Objetos](#aula-5--associação-de-objetos)
- [Glossário Rápido](#-glossário-rápido)

---

## Aula 1 — Fundamentos de OO: Classes e Objetos

### 🎯 O que é uma Classe e o que é um Objeto?

| Classe | Objeto |
|---|---|
| O **molde**, o plano, a "planta da casa" | A **instância**, a "casa construída" |
| Conceito abstrato — não ocupa memória de execução | Concretização — ocupa espaço real na memória (RAM) |
| Define **o que pode existir** (quais atributos) | Define **quais são os valores atuais** |

> **Analogia:** a Classe é como o DNA; o Objeto é o ser vivo criado a partir daquele DNA.
> Todos compartilham a mesma estrutura, mas cada um tem seu próprio **estado**.

### Estado do Objeto
"Estado" é o conjunto de valores dos atributos de um objeto em um dado momento. É **mutável** —
o funcionamento de um software nada mais é do que a gestão da mudança de estado dos objetos
(ex: `saldo` de um passageiro muda de `50.0` para `40.0` após pagar uma viagem).

### Abstração: a arte de ignorar detalhes
Abstração não é "criar classes por criar" — é modelar **apenas o que o negócio precisa**.
Regra de ouro: *se o sistema não usa aquele dado para uma regra de negócio, ele é ruído e não
deve existir na classe.*

### Clean Code em atributos (Uncle Bob)
- Nomes **pronunciáveis** e significativos (`generationTimestamp`, não `genymdhms`).
- Sem redundância: se a classe já é `Passageiro`, o atributo é `nome`, não `nomePassageiro`
  (`passageiro.nome`, nunca `passageiro.nomePassageiro`).

### Código — Classe `Passageiro` (versão inicial)

```java
package br.com.fiapride.model;

public class Passageiro {
    public String nome;
    public double saldo;
    // Nota: 'public' usado só para aprendizado. Na Aula 3 isso muda!
}
```

```java
package br.com.fiapride.main;

import br.com.fiapride.model.Passageiro;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro(); // instanciação: 'new' aloca memória
        passageiro1.nome = "Ana Silva";
        passageiro1.saldo = 50.0;
    }
}
```

**Modelagem UML (Astah):** um retângulo com o nome da classe e, abaixo, os atributos
(`- nome: String`, `- saldo: double`).

---

## Aula 2 — Métodos e Comportamentos

### Teoria
Se os **Atributos** são os substantivos/adjetivos de um objeto, os **Métodos** são os **verbos**
— as ações que ele executa.

Para que servem os métodos?
1. **Alterar o estado** do objeto (ex: recarregar saldo).
2. **Comunicar-se com outros objetos** (um objeto chama o método de outro).
3. **Proteger regras de negócio** (impedir ações inválidas, como sacar sem saldo).

Sem métodos, os objetos seriam apenas listas de dados sem inteligência.

### Prática — Comportamentos do `Passageiro`

```java
public void adicionarSaldo(double valor) {
    if (valor <= 0) {
        System.out.println("Erro: O valor de recarga deve ser maior que zero.");
        return; // interrompe a execução
    }
    this.saldo += valor;
}

public void pagarViagem(double custo) {
    if (custo <= 0 || this.saldo < custo) {
        System.out.println("Erro: operação inválida.");
        return;
    }
    this.saldo -= custo;
}
```

### Clean Code para métodos
- **Ações são verbos:** `atualizarEstoque()`, `registrarAlta()`.
- **Funções pequenas:** uma única responsabilidade por método — valida a regra e altera o estado.
- **Nomes de parâmetros significativos:** `quantidadeComprada`, nunca `q` ou `x`.

### 🐙 Boas práticas de repositório: `.gitignore`
Nunca versionar arquivos compilados (`*.class`) nem pastas de configuração de IDE
(`.vscode/`, `.idea/`, `.metadata/`, `bin/`, `target/`).

---

## Aula 3 — Encapsulamento: Getters e Setters

### 🔐 A Teoria: a cápsula e o caixa eletrônico

O problema da Aula 2: mesmo tendo o método `adicionarSaldo()`, nada impedia alguém de fazer
`passageiro1.saldo = -500.0;` diretamente, ignorando toda a regra de negócio.

**Encapsulamento** é a técnica de esconder os detalhes internos de um objeto e proteger seus dados.

> **Analogia:** o cofre de um caixa eletrônico é **privado**. Você não abre a tampa e pega o
> dinheiro — o banco te dá uma tela com botões (**públicos**). Você clica em "Sacar", o sistema
> valida, e só então a máquina mexe no cofre por você.

### Modificadores de acesso
| Modificador | Símbolo UML | Quem acessa |
|---|---|---|
| `private` | `-` | Somente a própria classe |
| `public` | `+` | Qualquer classe do sistema |

**Regra de ouro:** atributos **sempre** `private`. O acesso externo só acontece através de métodos
controlados (`get`/`set`).

### Getters e Setters

```java
public class Passageiro {
    private String nome;
    private double saldo;

    // Getter: PEGA o valor (leitura) — geralmente público
    public double getSaldo() {
        return this.saldo;
    }

    // Setter: DEFINE o valor (escrita) — pode ter regra de negócio embutida
    private void setSaldo(double valor) {
        if (valor >= 0) {
            this.saldo = valor;
        } else {
            System.out.println("Erro de Segurança: saldo negativo bloqueado!");
        }
    }
}
```

### 💡 Setter privado: por quê?
Perceba que `setSaldo()` é **privado**. Em vez de deixar qualquer classe alterar o saldo
livremente com `setSaldo(50)`, obrigamos o uso de métodos com regra de negócio clara:
`adicionarSaldo()` e `pagarViagem()`. Isso é uma prática avançada de Clean Code — **não crie
setters para tudo automaticamente**. Se um atributo nunca deve mudar depois de criado, ele
**não deve** ter setter.

> **Pergunta de reflexão:** por que é seguro deixar o `get` público, mas perigoso deixar o
> atributo original público? Pense na diferença entre dar uma **cópia** de um documento e
> entregar o **original** para alguém rasurar.

---

## Aula 4 — Construtores

### 🏗️ A Teoria: o certificado de nascimento

Um cartório não emite uma certidão em branco — ele **exige** dados obrigatórios no nascimento.
O **Construtor** é o cartório da programação: um método especial executado **uma única vez**,
exatamente no momento do `new`, que garante que o objeto já nasça em um estado válido.

> Nenhum carro sai de fábrica sem chassi. Nenhum `Veiculo` deveria "nascer" sem placa.

### Regras de ouro do construtor em Java
1. Tem **exatamente o mesmo nome da classe**.
2. **Não tem tipo de retorno** (nem mesmo `void`).
3. Ao criar **qualquer** construtor customizado, o construtor padrão vazio `()` deixa de existir
   automaticamente — o objeto passa a ser **obrigado** a nascer com os dados exigidos.

### Clean Code — a regra dos 3 parâmetros (Uncle Bob)
- Ideal: **zero, um ou dois** parâmetros.
- Limite máximo recomendado: **três**.
- Construtores com 5, 6, 10 parâmetros ficam ilegíveis
  (`new Veiculo("ABC", "Gol", 2020, "Preto", 4, 1.0, true)` — o que significa cada valor?).
  *(Padrões como o **Builder** resolvem isso — assunto de aulas futuras.)*

---

## Aula 5 — Associação de Objetos

### A Teoria: o relacionamento "Tem-Um" (HAS-A)

Até aqui, `Passageiro` e `Veiculo` funcionam isoladamente. Mas no mundo real, objetos **conversam**:
uma corrida não existe no vácuo — ela precisa de um passageiro que a solicitou e de um veículo
que vai realizá-la.

**Associação** é a técnica de fazer uma classe "ter um" atributo cujo **tipo é outra classe**
(e não um tipo primitivo como `String` ou `double`).

> **Analogia:** um Computador tem atributos simples (`preco: double`), mas também **TEM UM**
> Processador, **TEM UM** Teclado, **TEM UMA** PlacaMãe — cada um sendo, por si só, uma classe
> complexa. É como montar um objeto grande usando objetos menores, como peças de Lego.

No FiapRide:
- Uma `Viagem` **TEM UM** `Passageiro`.
- Uma `Viagem` **TEM UM** `Veiculo`.

### Passagem por referência
Quando um objeto é passado como parâmetro para dentro de outro, **não é feita uma cópia** — é
enviada uma **referência** ao mesmo objeto na memória. Por isso, se o `saldo` do passageiro mudar
*depois* de a viagem ser criada, a viagem "enxerga" esse novo valor — porque ambos apontam para
o mesmo objeto.

### Clean Code — nomes baseados em papéis
O maior erro de iniciantes em associação é dar nomes genéricos às variáveis de referência.
O nome da variável deve indicar o **papel** que o objeto desempenha ali, não repetir o nome da
classe:

- ❌ `Passageiro passageiro` dentro de `Viagem`
- ✅ `Passageiro solicitante` (o papel que ele exerce naquela viagem)
- ❌ `Veiculo carro`
- ✅ `Veiculo veiculoUtilizado`


> **Pergunta de reflexão:** por que o construtor de `Viagem` exige o objeto `Passageiro` inteiro,
> em vez de só a `String` do nome? Pense nas regras de negócio: se a viagem guardasse só o texto
> "Ana Silva", ela conseguiria descontar o saldo dela ao final da corrida?

---

##  Glossário Rápido

| Termo | Definição resumida |
|---|---|
| **Classe** | O molde/estrutura que define atributos e métodos de um tipo de objeto |
| **Objeto** | Uma instância concreta de uma classe, criada com `new` |
| **Atributo** | Característica/dado que um objeto guarda (o "substantivo") |
| **Método** | Ação/comportamento que um objeto executa (o "verbo") |
| **Estado** | O conjunto de valores atuais dos atributos de um objeto |
| **Abstração** | Modelar só o que é relevante para o domínio do negócio |
| **Encapsulamento** | Esconder atributos (`private`) e controlar o acesso via `get`/`set` |
| **Construtor** | Método especial, sem retorno e com o nome da classe, executado uma vez na criação do objeto |
| **Associação (HAS-A)** | Uma classe possui um atributo cujo tipo é outra classe |
| **Passagem por referência** | Enviar o "endereço" de um objeto, não uma cópia dos dados |

---
