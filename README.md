# 🚀 Fundamentos em Java: Estruturas de Controle

Este documento sumariza os conceitos chave das **Estruturas de Controle de Fluxo** em Java e lista exercícios práticos propostos.

As estruturas de controle atuam como o "cérebro" do programa, determinando a ordem de execução dos comandos, o que permite tomar decisões e executar tarefas repetitivas.

---

## 🚦 I. Controle de Fluxo (Decisão)

Permitem que o programa execute blocos de código diferentes com base em condições.

| Estrutura | Uso Principal | Palavras-chave |
| :--- | :--- | :--- |
| **`if-else`** | [cite_start]Decisão binária (Simples/Composta) ou múltipla sequencial[cite: 114, 116, 126]. | [cite_start]`if`, `else`, `else if`[cite: 114, 116, 126]. |
| **`switch-case`** | [cite_start]Testar o valor de uma única variável contra múltiplas possibilidades exatas[cite: 140]. | [cite_start]`switch`, `case`, `break`, `default`[cite: 145, 154]. |

---

## 🔄 II. Controle de Fluxo (Repetição / Loops)

Usadas para executar o mesmo bloco de código repetidamente.

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
