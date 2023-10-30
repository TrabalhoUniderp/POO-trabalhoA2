package Menu;
import java.util.Scanner;
public class TurmasMenu {
    private Scanner scan;
    DisciplinasMenu A = new DisciplinasMenu();

    public TurmasMenu(){
        this.scan = new Scanner(System.in);
        }

        public void Executar1(){
            this.TurmaUm();
        }
        public void Executar2(){
            this.TurmaDois();
        }
        public void Executar3(){
            this.TurmaTres();
        }

        private void TurmaUm(){
            int continuar = 99;
            do{
                System.out.println("\n\t========================");
                System.out.println("\t    Selecione um aluno ");
                System.out.println("\tpara ver suas disciplinas ");
                System.out.println("\t==========================\n\n");  
                System.out.println("1. Aluno 1 \n");
                System.out.println("2. Aluno 2\n");
                System.out.println("3. Aluno 3\n");
                System.out.println("4. Aluno 4\n");
                System.out.println("0. Voltar\n");
                continuar = this.scan.nextInt();
                switch(continuar){
                case 1:
                A.Aluno1();
                break;
                case 2:
                A.Aluno2();        
                break;
                case 3:
                A.Aluno3();
                break;
                case 4:
                A.Aluno4();
                break;
                default:
                System.out.println("Digite uma opção válida\n");
                }
            } while(continuar != 0);
        
        }
        private void TurmaDois(){
            int continuar = 99;
            do{
                System.out.println("\n\t========================");
                System.out.println("\t    Selecione um aluno ");
                System.out.println("\tpara ver suas disciplinas ");
                System.out.println("\t==========================\n\n");  
                System.out.println("1. Aluno 1 \n");
                System.out.println("2. Aluno 2\n");
                System.out.println("3. Aluno 3\n");
                System.out.println("4. Aluno 4\n");
                System.out.println("0. Voltar\n");
                continuar = this.scan.nextInt();
                switch(continuar){
                case 1:
                A.Aluno5();
                break;
                case 2:
                A.Aluno6();        
                break;
                case 3:
                A.Aluno7();
                break;
                case 4:
                A.Aluno8();    
                break;
                default:
                System.out.println("Digite uma opção válida\n");
                }
            } while(continuar != 0);
        
        }
        private void TurmaTres(){
            int continuar = 99;
            do{
                System.out.println("\n\t========================");
                System.out.println("\t    Selecione um aluno ");
                System.out.println("\tpara ver suas disciplinas ");
                System.out.println("\t==========================\n\n");  
                System.out.println("1. Aluno 1 \n");
                System.out.println("2. Aluno 2\n");
                System.out.println("3. Aluno 3\n");
                System.out.println("4. Aluno 4\n");
                System.out.println("0. Voltar\n");
                continuar = this.scan.nextInt();
                switch(continuar){
                case 1:
                A.Aluno9();
                break;
                case 2:
                A.Aluno10();    
                break;
                case 3:
                A.Aluno11();    
                break;
                case 4:
                A.Aluno12();    
                break;
                default:
                System.out.println("Digite uma opção válida\n");
                }
            } while(continuar != 0);
        
        }

 public void Info1(){
            this.turmaumInfo();
        }
        public void Info2(){
            this.turmadoisInfo();
        }
        public void Info3(){
            this.turmatresInfo();
        }

private void turmaumInfo(){
     System.out.println("Alunos nessa turma1:\n");
     System.out.println("Disciplinas nessa turma1:\n");
     System.out.println("Professores nessa turma1:\n");
}
private void turmadoisInfo(){
    System.out.println("Alunos nessa turma2:\n");
    System.out.println("Disciplinas nessa turma2:\n");
    System.out.println("Professores nessa turma2:\n");
}
private void turmatresInfo(){
    System.out.println("Alunos nessa turma3:\n");
    System.out.println("Disciplinas nessa turma3:\n");
    System.out.println("Professores nessa turma3:\n");
}
}