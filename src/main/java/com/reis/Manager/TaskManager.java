package com.reis.Manager;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Tasks> tasks = new ArrayList<>();


    public void adicionarTask(String nome, String descricao, String data){
        Tasks task = new Tasks(nome, descricao, data);
        tasks.add(task);
    }
    public void deletarTask(int id){
        //tasks.remove(id);
//        for(Tasks task : tasks){
//            if(task.getId() == id){
//                tasks.remove(task);
//            }
//        }
        tasks.removeIf(task -> task.getId() == id);
   }
   public void editarTask(int id, String nome, String descricao, String data){
        for(Tasks task : tasks){
            if(task.getId() == id){
                task.setNome(nome);
                task.setDescricao(descricao);
                task.setData(data);
            }
        }
   }
   public <status> void marcarStatus(int id, Status status){
        for(Tasks task : tasks){
            if(task.getId() == id){
                task.setStatus(status);
            }
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
