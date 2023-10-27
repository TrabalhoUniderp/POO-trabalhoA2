package Menu;
import java.util.Scanner;

public class AlunoMenu {
    private Scanner scan;
    TurmasMenu T1 = new TurmasMenu();
    DisciplinasMenu D = new DisciplinasMenu();
    public AlunoMenu(){
        this.scan = new Scanner(System.in);
        }
    
    public void Executar1(){
        this.Alunoum();
    }
    public void Executar2(){
        this.Alunodois();
    }
    public void Executar3(){
        this.Alunotres();
    }
    public void Executar4(){
        this.Alunoquatro();
    }
    private void Alunoum(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info1();
                    break;
                    case 2:
                    D.Aluno1();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
            }
    
       
    private void Alunodois(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info1();
                    break;
                    case 2:
                    D.Aluno2();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }
    private void Alunotres(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info1();
                    break;
                    case 2:
                    D.Aluno3();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }
    private void Alunoquatro(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info1();
                    break;
                    case 2:
                    D.Aluno4();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }

    public void Executar5(){
        this.Alunoumdois();
    }
    public void Executar6(){
        this.Alunodoisdois();
    }
    public void Executar7(){
        this.Alunotresdois();
    }
    public void Executar8(){
        this.Alunoquatrodois();
    }

    private void Alunoumdois(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info2();
                    break;
                    case 2:
                    D.Aluno5();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }
       
    private void Alunodoisdois(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info2();
                    break;
                    case 2:
                    D.Aluno6();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }
    private void Alunotresdois(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info2();
                    break;
                    case 2:
                    D.Aluno7();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }
    private void Alunoquatrodois(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info2();
                    break;
                    case 2:
                    D.Aluno8();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }

    public void Executar9(){
        this.Alunoumtres();
    }
    public void Executar10(){
        this.Alunodoistres();
    }
    public void Executar11(){
        this.Alunotrestres();
    }
    public void Executar12(){
        this.Alunoquatrotres();
    }    

    private void Alunoumtres(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info3();
                    break;
                    case 2:
                    D.Aluno9();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
            }
    
       
    private void Alunodoistres(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info3();
                    break;
                    case 2:
                    D.Aluno10();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }
    private void Alunotrestres(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    T1.Info3();
                    break;
                    case 2:
                    D.Aluno11();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }
    private void Alunoquatrotres(){
         int continuar = 99;
        do{
            System.out.println("\n\t=====================");
            System.out.println("\tSelecione uma opcao");
            System.out.println("\t=====================\n\n");   
            System.out.println("1. Informacao da turma\n");
            System.out.println("2. Disciplinas\n");
            System.out.println("3. Rendimento escolar\n");
            System.out.println("0. Voltar\n");
            continuar = this.scan.nextInt();
            switch(continuar)
                    {
                    case 1:
                    
                    T1.Info3();
                    break;
                    case 2:
                    D.Aluno12();
                    break;
                    case 3:
                    //Aqui a gente coloca todas as informações da classe RendEscolar
                    break;
                    case 0:
                    return;
                default:
                    System.out.println("Digite uma opção válida\n");
                    }
                    } while(continuar != 0);
    }
}







