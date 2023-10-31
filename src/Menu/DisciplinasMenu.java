package Menu;
import java.util.Scanner;

public class DisciplinasMenu {
    private Scanner scan;
    
    public DisciplinasMenu(){
        this.scan = new Scanner(System.in);
        }
    
    public void Aluno1(){
        this.Alunoum();
    }
    public void Aluno2(){
        this.Alunodois();
    }
    public void Aluno3(){
        this.Alunotres();
    }
    public void Aluno4(){
        this.Alunoquatro();
    }
    public void Aluno5(){
        this.Alunoumdois();
    }
    public void Aluno6(){
        this.Alunodoisdois();
    }
    public void Aluno7(){
        this.Alunotresdois();
    }
    public void Aluno8(){
        this.Alunoquatrodois();
    }    
     public void Aluno9(){
        this.Alunoumtres();
    }
    public void Aluno10(){
        this.Alunodoistres();
    }
    public void Aluno11(){
        this.Alunotrestres();
    }
    public void Aluno12(){
        this.Alunoquatrotres();
    }

    private void Alunoum(){
        int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho: 10, 10");
                System.out.println("notas de prova: 10");
                break;
                case 2:
                System.out.println("\nnotas de trabalho: 10, 10");
                System.out.println("notas de prova: 7");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }
       
    private void Alunodois(){
       int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho: 7.5, 7.5");
                System.out.println("notas de prova: 8");
                break;
                case 2:
                System.out.println("\nnotas de trabalho: 7.5, 7.5");
                System.out.println("notas de prova: 3");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }
    private void Alunotres(){
        int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho: 8, 8");
                System.out.println("notas de prova: 7");
                break;
                case 2:
                System.out.println("\nnotas de trabalho: 8, 8");
                System.out.println("notas de prova: 7");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }
    private void Alunoquatro(){
        int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho: 5.5, 5.5");
                System.out.println("notas de prova: 6");
                break;
                case 2:
                System.out.println("\nnotas de trabalho: 5.5, 5.5");
                System.out.println("notas de prova:5");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }

    private void Alunoumdois(){
        int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho: 6, 6");
                System.out.println("notas de prova: 8");
                break;
                case 2:
                System.out.println("\nnotas de trabalho: 6, 6");
                System.out.println("notas de prova: 5");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }
       
    private void Alunodoisdois(){
     int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho:10, 10");
                System.out.println("notas de prova: 6");
                break;
                case 2:
                System.out.println("\nnotas de trabalho:10, 10");
                System.out.println("notas de prova: 6");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }
    private void Alunotresdois(){
       int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho:4, 4");
                System.out.println("notas de prova: 8");
                break;
                case 2:
                System.out.println("\nnotas de trabalho:4, 4");
                System.out.println("notas de prova: 8");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }
    private void Alunoquatrodois(){
      int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho: 8, 8");
                System.out.println("notas de prova: 9");
                break;
                case 2:
                System.out.println("\nnotas de trabalho: 8, 8");
                System.out.println("notas de prova: 10");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }

    private void Alunoumtres(){
      int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho: 9.5, 9.5");
                System.out.println("notas de prova: 6");
                break;
                case 2:
                System.out.println("\nnotas de trabalho: 9.5, 9.5");
                System.out.println("notas de prova: 3");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }
       
    private void Alunodoistres(){
       int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho:3, 3");
                System.out.println("notas de prova: 2");
                break;
                case 2:
                System.out.println("\nnotas de trabalho:3, 3");
                System.out.println("notas de prova: 0");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }
    private void Alunotrestres(){
      int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho:7.5, 7.5");
                System.out.println("notas de prova: 3");
                break;
                case 2:
                System.out.println("\nnotas de trabalho:7.5, 7.5");
                System.out.println("notas de prova: 1");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }
    private void Alunoquatrotres(){
        int continuar = 99;
        do{
        System.out.println("\n\t========================");
        System.out.println("\tSelecione uma disciplina");
        System.out.println("\t========================\n\n");  
        System.out.println("1. Ciencias\n");
        System.out.println("2. Matematica\n");
        System.out.println("0. voltar\n");
        continuar = this.scan.nextInt();
            switch(continuar){    
                case 1:
                System.out.println("\nnotas de trabalho:10, 10");
                System.out.println("notas de prova: 10");
                break;
                case 2:
                System.out.println("\nnotas de trabalho:10, 10");
                System.out.println("notas de prova: 10");
                break;
                case 0:
                return;
                default:
                System.out.println("digite uma opcao valida");    
                break; 
            }
        }while (continuar != 0);
    }    
}
