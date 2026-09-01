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

