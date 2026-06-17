package com.reis.main;

import com.reis.Manager.Status;
import com.reis.Manager.TaskManager;
import com.reis.Manager.Tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        //int opcao = input.nextInt();
        int opcao;
        while (true) {

            System.out.println("=====================================\n" +
                    "         GERENCIADOR DE TAREFAS      \n" +
                    "=====================================\n" +
                    "1. Adicionar tarefa\n" +
                    "2. Editar tarefa\n" +
                    "3. Deletar tarefa\n" +
                    "4. Marcar status\n" +
                    "5. Listar todas\n" +
                    "6. Listar por status\n" +
                    "0. Sair\n" +
                    "=====================================\n" +
                    "Escolha uma opção:");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    input.nextLine();
                    System.out.println("Nome da tarefa:");
                    String nome = input.nextLine();
                    System.out.println("Descrição:");
                    String descricao = input.nextLine();
                    System.out.println("Data:");
                    String data = input.nextLine();
                    manager.adicionarTask(nome, descricao, data);
                    break;
                case 2:
                    input.nextLine();
                    System.out.println("Id da tarefa: ");
                    int id = input.nextInt();
                    System.out.println("Faça as alterações \n Nome da tarefa: ");
                    String nomeAlterado = input.nextLine();
                    System.out.println("Descrição:");
                    String descricaoAlterada = input.nextLine();
                    System.out.println("Data:");
                    String dataAlterada = input.nextLine();
                    manager.editarTask(id, nomeAlterado, descricaoAlterada, dataAlterada);
                    break;
                case 3:
                    System.out.println("Id da tarefa: ");
                    int idDeletar = input.nextInt();
                    manager.deletarTask(idDeletar);
                    break;
                case 4:
                    System.out.println("Id da tarefa: ");
                    int idMarcarStatus = input.nextInt();
                    input.nextLine();
                    System.out.println("1.Não iniciado\n2. Em progresso\n3. Finalizado");
                    int opcaoStatus = input.nextInt();
                    input.nextLine();
                    Status status = switch (opcaoStatus) {
                        case 1 -> Status.NAO_INICIADO;
                        case 2 -> Status.EM_PROGRESSO;
                        case 3 -> Status.FINALIZADO;
                        default -> throw new IllegalArgumentException("Opção inválida.");
                    };
                    manager.marcarStatus(idMarcarStatus, status);
                    break;

//                    Status status = Status.valueOf(statusMarcar.toUpperCase());
//                    manager.marcarStatus(idMarcarStatus, status);
//                    break;
                case 5:
                    System.out.println("Listando todas as tarefas...");
                    manager.listarTodos();
                    break;
                case 6:
                    System.out.println("Digite o status que deseja buscar: ");
                    int opcaoBusca = input.nextInt();
                    input.nextLine();
                    Status statusBuscado = switch (opcaoBusca) {
                        case 1 -> Status.NAO_INICIADO;
                        case 2 -> Status.EM_PROGRESSO;
                        case 3 -> Status.FINALIZADO;
                        default -> throw new IllegalArgumentException("Opção inválida");
                    };
                    System.out.println("Listando todas as tarefas por status...");
                    manager.listarPorStatus(statusBuscado);
                    break;


            }
            if (opcao == 0) {
                System.out.println("Fechando...");
                break;
            }
        }


    }
}




