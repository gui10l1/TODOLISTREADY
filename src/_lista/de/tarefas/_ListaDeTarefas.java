package _lista.de.tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class _ListaDeTarefas {

    static String op1;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Classes
        Usuario u = new Usuario();
        ArrayList<Usuario> usuarios = new ArrayList();

        //Variaveis
        String email;
        String senha;
        String op;
        String keep;

        boolean running = true;
        boolean entrar = false;

        while (running) {
            System.out.println("");
            System.out.println("====================");
            System.out.println("|| Menu principal ||");
            System.out.println("====================");
            System.out.println("[1] Fazer cadastro");
            System.out.println("[2] Fazer login");
            System.out.println("[3] Finalizar o programa");
            op = sc.nextLine();

            switch (op) {
                case "1":
                    System.out.println("");
                    System.out.println("======================");
                    System.out.println("|| Menu de cadastro ||");
                    System.out.println("======================");
                    System.out.print("Insira um novo email: ");
                    email = sc.nextLine();
                    System.out.print("Insira uma nova senha: ");
                    senha = sc.nextLine();

                    u.setEmail(email);
                    u.setSenha(senha);

                    usuarios.add(u);

                    if (usuarios.add(u)) {
                        System.out.println("Usuário cadastrado com sucesso!");
                        System.out.println("Aperte enter para continuar");
                        keep = sc.nextLine();
                    } else {
                        System.out.println("Usuário não foi cadastrado!");
                        System.out.println("Aperte enter para continuar");
                        keep = sc.nextLine();
                    }

                    break;

                case "2":
                    System.out.println("");
                    System.out.println("===================");
                    System.out.println("|| Menu de login ||");
                    System.out.println("===================");
                    System.out.print("Insira seu email: ");
                    email = sc.nextLine();
                    System.out.print("Insira sua senha: ");
                    senha = sc.nextLine();

                    for (int i = 0; i < usuarios.size(); i++) {
                        if (u.getEmail().equals(email) && u.getSenha().equals(senha)) {
                            System.out.println("Usuario logado com sucesso!");
                            entrar = true;
                            System.out.println("Aperte enter para continuar");
                            keep = sc.nextLine();
                            segundoMenu(entrar);
                            break;
                        } else {
                            System.out.println("Usuario e/ou senha incorretos!");
                            System.out.println("Aperte enter para continuar");
                            keep = sc.nextLine();
                            break;
                        }
                    }

                    break;

                case "3":
                    running = false;
                    System.out.println("Finalizando o programa...");

                    System.out.println("Aperte enter para continuar");

                    keep = sc.nextLine();
                    break;

                case "998":
                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario e = usuarios.get(i);
                        System.out.print("Usuario " + i + " : " + e);
                    }
                    System.out.println("Aperte enter para continuar");

                    keep = sc.nextLine();
                    break;

            }

        }

    }

    static void segundoMenu(boolean entrar) {
        //Classes instanciadas

        ArrayList<Tarefa> tarefas = new ArrayList();
        Tarefa t = new Tarefa();
        Usuario u = new Usuario();

        //Variaveis
        String titulo;
        String procurar;
        String finalizar;
        String keep;
        String proc;

        int tamanho;
        int procura;
        boolean finalizada = false;
        boolean running = true;

        while (entrar) {
            System.out.println("");
            System.out.println("==========");
            System.out.println("|| Menu ||");
            System.out.println("==========");
            System.out.println("[1] Listar todas as tarefas");
            System.out.println("[2] Listar as tarefas finalizadas");
            System.out.println("[3] Listar tarefas não finalizadas");
            System.out.println("[4] Adicionar nova tarefa");
            System.out.println("[5] Finalizar tarefa");
            System.out.println("[6] Remover tarefa");
            System.out.println("[7] Fazer logout");
            op1 = sc.nextLine();

            switch (op1) {
                case "1":
                    System.out.println("");
                    System.out.println("====================");
                    System.out.println("|| Listar tarefas ||");
                    System.out.println("====================");
                    tamanho = tarefas.size();
                    for (int i = 0; i < tarefas.size(); i++) {
                        String e1 = tarefas.get(i).getTitulo();
                        boolean e2 = tarefas.get(i).getFinalizada();
                        System.out.println("Tarefa [" + i + "] : " + e1 + " " + e2);
                    }

                    if (tamanho == 0) {
                        System.out.println("Lista de tarefas vazia!");          
                        break;
                    }

                    break;

                case "2":
                    System.out.println("");
                    System.out.println("================================");
                    System.out.println("|| Listar tarefas finalizadas ||");
                    System.out.println("================================");
                    tamanho = tarefas.size();
                    for (int i = 0; i < tarefas.size(); i++) {
                        Tarefa e1 = tarefas.get(i);
                        String e2 = tarefas.get(i).getTitulo();
                        if (e1.getFinalizada()) {
                            System.out.println("Tarefa [" + i + "]: " + e2 + " finalizada!");
                        }                                                 
                    }
                    
                    if (tamanho == 0) {
                            System.out.println("Lista vazia!");
                            break;
                        }
                    break;

                case "3":
                    System.out.println("");
                    System.out.println("====================================");
                    System.out.println("|| Listar tarefas não finalizadas ||");
                    System.out.println("====================================");
                    tamanho = tarefas.size();
                    for (int i = 0; i < tarefas.size(); i++) {
                        Tarefa e1 = tarefas.get(i);
                        String e2 = tarefas.get(i).getTitulo();
                        if (!e1.getFinalizada()) {
                            System.out.println("Tarefa [" + i + "]: " + e2 + " não finalizada!");                            
                        }                      
                    }
                    
                     if (tamanho == 0) {
                            System.out.println("Lista vazia...");
                            break;
                        }
                    break;

                case "4":
                    System.out.println("");
                    System.out.println("=============================");
                    System.out.println("|| Adicionar novas tarefas ||");
                    System.out.println("=============================");
                    System.out.print("Digite o título da nova tarefa: ");
                    titulo = sc.nextLine();

                    Tarefa tarefa = new Tarefa();
                    tarefa.setTitulo(titulo);

                    if (tarefas.add(tarefa)) {
                        System.out.println("Tarefa adicionada com sucesso!");
                        break;
                    } else {
                        System.out.println("Tarefa não foi adicionada!");
                    }

                    u.setTarefa(tarefas);

                    break;

                case "5":
                    System.out.println("");
                    System.out.println("=======================");
                    System.out.println("|| Finalizar tarefas ||");
                    System.out.println("=======================");
                    for (int i = 0; i < tarefas.size(); i++) {
                        String e1 = tarefas.get(i).getTitulo();
                        boolean e2 = tarefas.get(i).getFinalizada();
                        System.out.println("Tarefa [" + i + "]: " + e1 + " " + e2);

                    }

                    System.out.print("Digite o número da tarefa para finaliza-la: ");
                    procura = sc.nextInt();

                    tarefas.get(procura).setFinalizada(true);
                    
                    System.out.println("Tarefa finalizada com sucesso!");

                    break;

                case "6":
                    System.out.println("");
                    System.out.println("====================");
                    System.out.println("|| Remover tarefa ||");
                    System.out.println("====================");
                    for (int i = 0; i < tarefas.size(); i++) {
                        String e1 = tarefas.get(i).getTitulo();
                        System.out.println("Tarefa [" + i + "]: " + e1);
                    }

                    System.out.print("Digite o número da tarefa que deseja remover: ");
                    procura = sc.nextInt();

                    tarefas.get(procura);
                    tarefas.remove(procura);
                    
                    System.out.println("Tarefa removida com sucesso!");
                    break;

                case "7":
                    entrar = false;
                    System.out.println("Fazendo logout...");
                    System.out.println("Redirecionando para o menu principal...");
                    break;
            }

            System.out.println("Aperte enter para voltar ao menu");

            keep = sc.nextLine();
        }

    }
}
