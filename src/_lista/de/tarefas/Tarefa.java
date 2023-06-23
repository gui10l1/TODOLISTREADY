package _lista.de.tarefas;

public class Tarefa {
    private boolean finalizada;
    private String titulo;
    
    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.finalizada = false;
    }
    
    //Titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    //Finalizada
    public void setFinalizada(boolean finalizada){
        this.finalizada = finalizada;
    }
    
    public boolean getFinalizada(){
        return finalizada;
    }

    
}
