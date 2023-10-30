package Menu;
import java.util.Scanner;
public class Menu {
private Scanner scan;
TurmasMenu T = new TurmasMenu();
AlunoMenu A1 = new AlunoMenu();
public Menu(){
this.scan = new Scanner(System.in);
}
public void Executar(){
this.ExibirMenu();
}
private void ExibirMenu(){
    int continuar = 99;
    do
    {
        System.out.println("\n\t===================");
        System.out.println("\tSelecione uma opcao");
        System.out.println("\t===================\n\n");    
        System.out.println("1. Professor\n");
        System.out.println("2. Aluno\n");
    System.out.println("0. Sair\n");
    continuar = this.scan.nextInt();
    
    switch(continuar)
    {
    case 1:
    this.ProfessorMenu();
    break;
    case 2:
    this.AlunoMenu();
    break;
    case 0:
    this.Sair();
    break;
    default:
    System.out.println("Digite uma opção válida\n");
    }
    } while(continuar != 0);
}

private void ProfessorMenu()
{
int continuar = 99;
do{
    System.out.println("\n\t===================");
    System.out.println("\tSelecione um professor");
    System.out.println("\t===================\n\n");   
    System.out.println("1. Professor 1\n");
    System.out.println("2. Professor 2\n");
    System.out.println("0. Voltar\n");
    continuar = this.scan.nextInt();
    switch(continuar)
            {
            case 1:
            this.TurmaMenu();
            break;
            case 2:
            this.TurmaMenu();
            break;
            case 0:
            return;
        default:
            System.out.println("Digite uma opção válida\n");
            }
            } while(continuar != 0);
}
private void TurmaMenu()
{
int continuar = 99;
do{
    System.out.println("\n\t===================");
    System.out.println("\tSelecione uma turma");
    System.out.println("\t===================\n\n");   
    System.out.println("1. Turma 1\n");
    System.out.println("2. Turma 2\n");
    System.out.println("3. Turma 3\n");
    System.out.println("0. Voltar\n");
    continuar = this.scan.nextInt();
    switch(continuar)
            {
            case 1:
            
            T.Executar1();
            break;
            case 2:
            T.Executar2();
            break;
            case 3:
            T.Executar3();
            break;
            case 0:
            return;
        default:
            System.out.println("Digite uma opção válida\n");
            }
            } while(continuar != 0);
}

private void Sair()
{
System.out.println("Fechando o programa.\n");
}


private void AlunoMenu(){
    int continuar = 99;
    do{
        System.out.println("\n\t===================");
        System.out.println("\tSelecione um aluno");
        System.out.println("\t===================\n\n");   
        System.out.println("1. Aluno 1\n");
        System.out.println("2. Aluno 2\n");
        System.out.println("3. Aluno 3\n");
        System.out.println("4. Aluno 4\n");
        System.out.println("5. Aluno 5\n");
        System.out.println("6. Aluno 6\n");
        System.out.println("7. Aluno 7\n");
        System.out.println("8. Aluno 8\n");
        System.out.println("9. Aluno 9\n");
        System.out.println("10. Aluno 10\n");
        System.out.println("11. Aluno 11\n");
        System.out.println("12. Aluno 12\n");
        System.out.println("0. Voltar\n");
        continuar = this.scan.nextInt();
        switch(continuar){
            case 1:
            A1.Executar1();
            break;
            case 2:
            A1.Executar2();
            break;
            case 3:
            A1.Executar3();
            break;
            case 4:
            A1.Executar4();
            break;            
            case 5:
            A1.Executar5();
            break;
            case 6:
            A1.Executar6();
            break;
            case 7:
            A1.Executar7();
            break;
            case 8:
            A1.Executar8();
            break;    
            case 9:
            A1.Executar9();
            break;
            case 10:
            A1.Executar10();
            break;
            case 11:
            A1.Executar11();
            break;
            case 12:
            A1.Executar12();
            break;    
            case 0:
            return;
            default:
            System.out.println("Digite uma opção válida\n");
        }
            } while(continuar != 0);
}
}