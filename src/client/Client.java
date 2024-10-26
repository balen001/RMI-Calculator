package client;
import java.rmi.Naming;
import java.util.*;

import server.CalcService;


public class Client {
    public static void main(String[] args){

        
        while (true){

            try{
                CalcService servic = (CalcService) Naming.lookup("rmi://localhost/calc");

                Scanner scan = new Scanner(System.in);
                System.out.println("\nAvailable operations (+ , - , * , / , ^ , sqr() , sin() , cos() , tan())");
                System.out.print("Enter an equation to be evaluated: ");
                String inp = scan.nextLine();
                System.out.println("The result is: " + servic.eval(inp));
            }
            catch(RuntimeException e){System.out.println("Invalid input");} 
            catch (Exception e) {
                e.printStackTrace();
                } 

            
        }
    }
}
