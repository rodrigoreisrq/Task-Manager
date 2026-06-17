# TaskManager

Gerenciador de tarefas via linha de comando desenvolvido em Java, como projeto de portfólio durante meu aprendizado de programação orientada a objetos.

## Sobre o projeto

Este é um projeto de aprendizado onde apliquei conceitos de POO como encapsulamento, enums, separação de responsabilidades entre classes, e persistência de dados com JSON.

## Funcionalidades

- Adicionar tarefas com nome, descrição e data
- Editar tarefas existentes por ID
- Deletar tarefas por ID
- Marcar status de uma tarefa (Não iniciado / Em progresso / Finalizado)
- Listar todas as tarefas
- Listar tarefas filtradas por status
- Persistência automática em arquivo JSON

## Tecnologias

- Java 24
- Maven
- Gson 2.10.1

## Estrutura do projeto

```
src/main/java/com/reis/
├── Manager/
│   ├── Tasks.java          # Entidade de uma tarefa
│   ├── TaskManager.java    # Gerencia a lista de tarefas
│   └── Status.java         # Enum com os status possíveis
├── taskRepository/
│   └── TaskRepository.java # Leitura e escrita no JSON
└── main/
    └── Main.java           # Interface com o usuário via terminal
```

## Como rodar

**Pré-requisitos:** Java 24 e Maven instalados.

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/TaskManager.git

# Entre na pasta
cd TaskManager

# Compile
mvn compile

# Execute
mvn exec:java -Dexec.mainClass="com.reis.main.Main"
```

As tarefas são salvas automaticamente em `tasks.json` na raiz do projeto.

## O que aprendi

- Separação de responsabilidades entre classes (`Task`, `TaskManager`, `TaskRepository`)
- Uso de `enum` para representar valores fixos
- Serialização e desserialização de objetos com Gson
- Persistência de dados em JSON com `FileWriter` e `FileReader`
- Tratamento do buffer do `Scanner` em menus interativos
- Gerenciamento de IDs incrementais com atributos estáticos

## Status

Projeto concluído. Desenvolvido como exercício prático de Java OOP.
