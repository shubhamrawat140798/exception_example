//WAP to produce NoClassDefFoundError and ClassNotFoundException exception
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=null;
        try{
            scanner= new Scanner(System.in);
            System.out.print("\nCompile by Shubham Singh Rawat");
            System.out.print("\nChoice\n\t1.Class Not Found Exception\n\t2. No Class DefFound Error\nYour choice: ");
            int n = scanner.nextInt();
            classNotFoundEX ex = new classNotFoundEX();
            NoClassDefFoundError er = new NoClassDefFoundError();
            switch(n){
                case 1:
                    ex.excep();
                    break;
                case 2:
                    er.Hello();
                    break;
                default:
                    System.out.println("Wrong Input");
            }

        }
        finally{
            if(scanner!=null)
             scanner.close();
        }
    }
}
 class classNotFoundEX{
 
    public  void excep()
    {
        try {
 
            Class.forName("Shubham");
        }
        catch (ClassNotFoundException ex) {
             ex.printStackTrace();
        }
    }
}
class NoClassDefFoundError {
 // we have to remove the NoClassDefFoundError.class file
    void Hello()
    {
        System.out.println("hello!");
    }
}
