import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BookServiceInterface service=new BookServiceImpl();

      
           System.out.println("                                              --------------------------------------");
           System.out.println("                                             |  WELCOME to the Secret public library |");
           System.out.println("                                              --------------------------------------");

           do{
           System.out.println("1.Add Book");
           System.out.println("2.Show All Books");
           System.out.println("3.Show Available Books");
           System.out.println("4.Borrow Book");
           System.out.println("5.Return Book");
           System.out.println("6.Exit");
           System.out.println("");
           System.out.print("Enter Your Choice :");
               int Choice = sc.nextInt();

           switch (Choice){
               case 1:
                   service.addBook();
                   System.out.println("");
                   break;
                   
               case 2:
                   service.showAllBooks();
                   System.out.println("");
                   break;
               case 3:
                   service.showAllAvailableBooks();
                   System.out.println("");
                   break;
               case 4:
                   service.borrowBook();
                   System.out.println("");
                   break;
               case 5:
                   service.returnBook();
                   System.out.println("");
                   break;
               case 6:
                   System.out.println("Thank you for choosing the Secret public library !!");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Please Enter Valid Choice !");
                   System.out.println("");

           }
       }
       while(true);
    }
}