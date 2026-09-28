📱 Clone de Layout — Tinder App

Este repositório contém a entrega da atividade de Conceitos de Interface do Usuário, com foco na recriação fiel da interface de um aplicativo famoso utilizando ConstraintLayout no Android Studio.

🎯 Objetivo da Atividade

O objetivo principal deste projeto é reproduzir com alta fidelidade visual a tela principal do aplicativo Tinder (Card de perfil com botões de ação ancorados na base e cabeçalho superior), aplicando exclusivamente conceitos de alinhamento relativo e restrições com ConstraintLayout, sem o uso de posições absolutas (x/y fixos).

🛠️ Detalhes da Implementação

📂 Estrutura do Projeto

Package: br.ulbra.tinder

Layout Principal: activity_main.xml (utilizando unicamente ConstraintLayout para gerenciar a hierarquia de forma limpa).

⚙️ Funcionalidade

Atendendo aos requisitos do layout, foi adicionada uma interatividade simples para navegação entre fotos:

Alternância de Fotos: Clique nos cantos laterais do card da imagem para alternar/passar as imagens do perfil em exibição, simulando o comportamento original do aplicativo.

📋 Critérios Atendidos

[x] Fidelidade Visual: Proporções, alinhamentos e espaçamentos alinhados à referência original.

[x] Uso do ConstraintLayout: Elementos ancorados com restrições (topToTopOf, bottomToBottomOf, startToStartOf, endToEndOf), garantindo responsividade.

[x] Organização de Código: Identificadores (android:id) claros e legíveis no XML, evitando aninhamentos desnecessários de layouts.

[x] Entrega e Print Comparativo: Documentação completa incluída no README do repositório.
