# 👁️ Padrão Observer – Relatório Financeiro

Este projeto demonstra o uso do **padrão comportamental Observer** em **Java**, aplicado ao contexto de **relatórios financeiros**.  
O objetivo é permitir que **diversos analistas, gestores ou interessados sejam automaticamente notificados** sempre que um relatório for atualizado, revisado ou publicado — **sem acoplamento direto** entre os componentes.

> 💡 O padrão **Observer** é essencial para sistemas **reativos**, **modulares** e **flexíveis**, em que múltiplas partes precisam responder a eventos de mudança.
---

## 🧠 O que é o padrão Observer?

O **Observer** é um **padrão comportamental** que define uma **relação de dependência um-para-muitos** entre objetos.  
Quando o objeto **sujeito (Subject)** muda de estado, **todos os seus observadores (Observers)** são **notificados automaticamente**, podendo reagir de forma independente.

> 🔔 Esse padrão é amplamente utilizado em **interfaces gráficas**, **sistemas de notificação**, **eventos** e **integrações entre módulos empresariais**.
---

## 💼 Cenário: Relatórios Financeiros como Observáveis

Neste projeto:

- **Subject (Observável):** `RelatorioFinanceiro`  
  Representa o relatório que será monitorado e notifica os observadores em cada atualização.

- **Observers (Observadores):** `AnalistaFinanceiro`  
  Representam analistas, auditores ou sistemas externos que recebem notificações automáticas quando o relatório é **publicado** ou **revisado**.

- **Notificação:**  
  Ao mudar o status do relatório, todos os observadores são informados e podem **reagir de forma independente**.

  ---

## ⚙️ Funcionamento

### 🔹 **RelatorioFinanceiro (Subject)**
Mantém uma lista de observadores (`AnalistaFinanceiro`) e **notifica todos** quando o relatório é publicado, revisado ou atualizado.  
Permite que observadores:
- Se inscrevam (`assinar`)
- Se removam (`cancelarAssinatura`)

### 🔹 **AnalistaFinanceiro (Observer)**
Se inscreve para receber notificações automáticas e **registra a última atualização recebida**.

### 🔹 **Fluxo de Notificação**
Quando o relatório muda de status:
1. O método `publicar()` ou `revisar()` é chamado.  
2. O relatório atualiza seu estado.  
3. Todos os observadores inscritos são notificados automaticamente.  

> ⚡ O relatório não sabe **quem** está inscrito nem **como** reagirá cada observador — garantindo **baixo acoplamento**.
