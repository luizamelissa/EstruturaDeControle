# 🚀 Fundamentos em Java: Estruturas de Controle

Este documento sumariza os conceitos chave das **Estruturas de Controle de Fluxo** em Java e lista exercícios práticos propostos.

As estruturas de controle atuam como o "cérebro" do programa, determinando a ordem de execução dos comandos, o que permite tomar decisões e executar tarefas repetitivas.

---

## 🚦 I. Controle de Fluxo (Decisão)

Permitem que o programa execute blocos de código diferentes com base em condições[cite: 109, 112].

| Estrutura | Uso Principal | Palavras-chave |
| :--- | :--- | :--- |
| **`if-else`** | [cite_start]Decisão binária (Simples/Composta) ou múltipla sequencial[cite: 114, 116, 126]. | [cite_start]`if`, `else`, `else if`[cite: 114, 116, 126]. |
| **`switch-case`** | [cite_start]Testar o valor de uma única variável contra múltiplas possibilidades exatas[cite: 140]. | [cite_start]`switch`, `case`, `break`, `default`[cite: 145, 154]. |

---

## 🔄 II. Controle de Fluxo (Repetição / Loops)

[cite_start]Usadas para executar o mesmo bloco de código repetidamente[cite: 161].

| Estrutura | Característica | Condição | Uso Principal |
| :--- | :--- | :--- | :--- |
| **`while`** | [cite_start]Laço pré-condicional[cite: 163]. | [cite_start]É testada **antes** da execução do bloco[cite: 163]. | [cite_start]Usado enquanto a condição for verdadeira[cite: 161]. |
| **`do-while`** | [cite_start]Laço pós-condicional[cite: 175]. | [cite_start]É verificada **no final**, garantindo que o código rode pelo menos **uma vez**[cite: 175]. | [cite_start]Validação de entrada (Ex: Senhas)[cite: 177]. |
| **`for`** | [cite_start]Laço de contagem[cite: 188]. | [cite_start]Une inicialização, condição e incremento em uma única linha[cite: 189]. | [cite_start]Ideal quando o número de repetições é conhecido[cite: 188]. |

### 🛑 Controle de Laços (`break` e `continue`)

| Comando | Ação |
| :--- | :--- |
| **`break`** | [cite_start]Interrompe completamente a execução do laço[cite: 202]. |
| **`continue`** | [cite_start]Pula a iteração atual e vai para a próxima volta do laço[cite: 203]. |

---

## 🎯 III. Exercícios Focados em Estruturas

[cite_start]Abaixo, exercícios que aplicam intensivamente as estruturas de controle[cite: 1].

| Exercício | Descrição | Foco Estrutural |
| :--- | :--- | :--- |
| **Ex. 2** | Cálculo de lucro de teatro: tabela e lucro máximo. | [cite_start]Repetição (`for`/`while`) e Decisão (`if`)[cite: 4, 7]. |
| **Ex. 5** | Mostrar a tabuada dos números de 1 a 10. | [cite_start]Repetição aninhada (Laço dentro de Laço)[cite: 24]. |
| **Ex. 6** | Quinze transações 'V' (à vista) ou 'P' (a prazo). | [cite_start]Repetição (`for`), Decisão (`if` ou `switch`)[cite: 26, 27]. |
| **Ex. 12** | Contar números primos entre dez números inteiros. | [cite_start]Repetição (`for` ou `while`), Decisão, e Estrutura de Validação de Primo[cite: 61, 62]. |
| **Ex. 20** | Criar um Menu com opções para Média Aritmética e Ponderada. | [cite_start]Decisão (`switch` ou `if/else`) e Repetição (para manter o menu ativo)[cite: 90]. |
| **Ex. 24** | Receber valores, mostrar o maior e o menor. Encerra com `0`. | [cite_start]Repetição (`while` com condição de parada) e Decisão (`if`) para atualização de máximo/mínimo[cite: 98]. |
