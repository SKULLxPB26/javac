import java.util.Scanner;
 class loops {

     public static void main(String args[]) {
        
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the value");
        try {
            System.out.println("Enter the first NO.");
            int c = sca.nextInt();
            System.out.println("Enter the second NO.");
            int t = sca.nextInt();
            System.out.println("Enter 1 for + 2 for -");
            int n = sca.nextInt();
            
           switch (n) {
               case 1:
                   System.out.println(c + t);
                   break;
               case 2:
                   System.out.println(c - t);
                   break;

                   default: System.out.println("Invalid input");
           }
            // System.out.println("did you enter"+f);    
        }
        catch(Exception e){
            System.out.println(e);
        };
    }
}
