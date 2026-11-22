# Atividade Calculadora – TESTES FUNCIONAIS, REFATORAÇÃO E DOCUMENTAÇÃO DE SOFTWARE

## 1. Descrição da Atividade

Esta atividade tem como objetivo aplicar conceitos de qualidade de software durante o desenvolvimento de uma aplicação simples em Java, utilizando uma calculadora como exemplo prático.

Ao longo da atividade, foram trabalhados conceitos de implementação, testes funcionais, tratamento de erros, refatoração, documentação técnica e versionamento de código.

## 2. Objetivos

- Desenvolver uma aplicação Java com operações matemáticas básicas.
- Implementar mecanismos de tratamento de erros.
- Realizar testes para verificar o funcionamento das operações.
- Aplicar técnicas de refatoração para melhorar a organização do código.
- Documentar classes e métodos utilizando JavaDoc.
- Utilizar Git e GitHub para controle de versão e publicação do código.

## 3. Tecnologias e Ferramentas Utilizadas

- **Java:** linguagem de programação utilizada na atividade.
- **NetBeans:** ambiente de desenvolvimento.
- **Git:** ferramenta de controle de versão.
- **GitHub:** plataforma de hospedagem do código-fonte.
- **JavaDoc:** ferramenta utilizada para geração da documentação técnica em HTML.

## 4. Implementação

Foi desenvolvida uma calculadora capaz de realizar quatro operações matemáticas básicas:

| Operação | Símbolo |
|---|---|
| Soma | + |
| Subtração | - |
| Multiplicação | * |
| Divisão | / |

Também foram implementados tratamentos para situações específicas, como divisão por zero, operações inválidas e entradas incompatíveis com os tipos numéricos esperados.

A aplicação possui duas formas de execução:

- **Main_Calculadora:** apresenta um menu interativo para o usuário realizar operações.
- **TesteCalculadora:** executa testes utilizando entradas predefinidas.

## 5. Testes Funcionais

Foram realizados seis testes funcionais para verificar o comportamento da calculadora, contemplando as quatro operações matemáticas básicas e duas situações de erro.

### 5.1 Teste de Soma

- **Entradas utilizadas:**
  - Primeiro valor: 10
  - Segundo valor: 5
  - Operação: +

- **Resultado esperado:** 10 + 5 = 15
- **Resultado obtido:** 15
- **Status:** APROVADO

### 5.2 Teste de Subtração

- **Entradas utilizadas:**
  - Primeiro valor: 10
  - Segundo valor: 5
  - Operação: -

- **Resultado esperado:** 10 - 5 = 5
- **Resultado obtido:** 5
- **Status:** APROVADO

### 5.3 Teste de Multiplicação

- **Entradas utilizadas:**
  - Primeiro valor: 10
  - Segundo valor: 5
  - Operação: *

- **Resultado esperado:** 10 * 5 = 50
- **Resultado obtido:** 50
- **Status:** APROVADO

### 5.4 Teste de Divisão

- **Entradas utilizadas:**
  - Primeiro valor: 10
  - Segundo valor: 5
  - Operação: /

- **Resultado esperado:** 10 / 5 = 2
- **Resultado obtido:** 2
- **Status:** APROVADO

### 5.5 Teste de Erro: Divisão por Zero

- **Entradas utilizadas:**
  - Primeiro valor: 10
  - Segundo valor: 0
  - Operação: /

- **Resultado esperado:** Mensagem "Impossível divisão por zero".
- **Resultado obtido:** Mensagem "impossível divisão por zero".
- **Status:** APROVADO

### 5.6 Teste de Erro: Operação Inválida

- **Entradas utilizadas:**
  - Primeiro valor: 10
  - Segundo valor: 5
  - Operação: %

- **Resultado esperado:** Mensagem "Operação inválida".
- **Resultado obtido:** Mensagem "Operação inválida".
- **Status:** APROVADO

### 5.7 Evidências dos Testes

Abaixo devem ser inseridas capturas de tela da execução dos testes no ambiente de desenvolvimento, demonstrando os resultados apresentados no console.

![Resultados Testes Funcionais](Resultado teste funcional.png)

## 6. Refatoração

Foi criada uma branch denominada `Refatoracao`, destinada à aplicação de melhorias na estrutura do código.

O processo contempla melhorias na organização, legibilidade, nomenclatura de variáveis e simplificação das estruturas utilizadas.

Após as alterações, os testes devem ser executados novamente para verificar se o comportamento da aplicação foi preservado.

## 7. Documentação JavaDoc

As classes e os métodos foram documentados utilizando os padrões JavaDoc, incluindo descrições de suas funcionalidades, parâmetros e valores de retorno.

A documentação HTML foi gerada por meio da ferramenta JavaDoc e armazenada na pasta `docs/`.

Para visualizar a documentação, basta abrir o arquivo `index.html` presente nessa pasta em um navegador.

### Evidências da documentação

![Package calculadora](Package Calculadora.png)
![Class Calculadora](Class calculadora.png)
![Class main_calculadora](Class main_calculadora.png)
![Class testecalculadora](Class testecalculadora.png)

## 8. Versionamento

O controle de versão foi realizado utilizando Git, com publicação do código-fonte no GitHub.

Foram utilizadas duas branches:

- **main:** contém a versão principal da atividade.
- **Refatoracao:** contém as alterações realizadas durante o processo de refatoração.

**Repositório GitHub:** https://github.com/ImKyzen/Projeto_Calculadora

---

**Atividade acadêmica desenvolvida individualmente.**