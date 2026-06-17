package com.reis.Manager;

import com.reis.taskRepository.TaskRepository;

import java.io.IOException;
import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Tasks> tasks = new ArrayList<>();
    private TaskRepository repository = new TaskRepository();

    public TaskManager(){
        try{
            tasks = repository.carregarTasks();

        }catch (IOException e){
            tasks = new ArrayList<>();
        }
        int maiorId = 0;
        for(Tasks task : tasks){
            if(task.getId()>maiorId){
                maiorId = task.getId();
            }
            Tasks.setContadorId(maiorId + 1);
        }

    }
    public void adicionarTask(String nome, String descricao, String data){
        Tasks task = new Tasks(nome, descricao, data);
        tasks.add(task);
        try{
            repository.salvar(tasks);
        }catch (IOException e){
            System.out.println("Erro ao salvar" + e.getMessage());
        }
    }
    public void deletarTask(int id){

        tasks.removeIf(task -> task.getId() == id);
        try{
            repository.salvar(tasks);
        }catch (IOException e){
            System.out.println("Erro ao salvar" + e.getMessage());
        }
   }
   public void editarTask(int id, String nome, String descricao, String data){
        for(Tasks task : tasks){
            if(task.getId() == id){
                task.setNome(nome);
                task.setDescricao(descricao);
                task.setData(data);

            }

        } try{
           repository.salvar(tasks);
       }catch (IOException e){
           System.out.println("Erro ao salvar" + e.getMessage());
       }
   }
   public void marcarStatus(int id, Status status){
        for(Tasks task : tasks){
            if(task.getId() == id){
                task.setStatus(status);
            }
        }
       try{
           repository.salvar(tasks);
       }catch (IOException e){
           System.out.println("Erro ao salvar" + e.getMessage());
       }

   }
   public void listarTodos(){
        for(Tasks task: tasks){
            System.out.println(task);
        }
   }
   public void listarPorStatus(Status status){
        for(Tasks task: tasks){
            if(task.getStatus().equals(status)){
                System.out.println(task);
            }
        }
   }
}
