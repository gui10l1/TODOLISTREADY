package _lista.de.tarefas;

import java.util.ArrayList;

public class Usuario {
    private String email;
    private String senha;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Tarefa> tarefas;
    
    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.tarefas = new ArrayList();
    }
    
    //Email e senha
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
    //ArrayList usuarios
    public void setUsuario(ArrayList<Usuario> usuarios){
        this.usuarios = usuarios;
    }
    
    public ArrayList getUsuario(){
        return usuarios;
    }
    
    //ArrayList tarefas
    public void setTarefa(ArrayList<Tarefa> tarefas){
        this.tarefas = tarefas;
    }
    
    public ArrayList<Tarefa> getTarefas(){
        return tarefas;
    }
}
