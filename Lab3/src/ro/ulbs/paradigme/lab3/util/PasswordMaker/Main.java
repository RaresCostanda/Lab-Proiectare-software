package ro.ulbs.paradigme.lab3.util.PasswordMaker;

public class Main {
     public static void main(String[] args) {
         PasswordMaker pm1 = PasswordMaker.getInstance();
         System.out.println("Parola: " + pm1.getPassword());
         PasswordMaker pm2 = PasswordMaker.getInstance();
         System.out.println("Parola: " + pm2.getPassword());

         System.out.println("Metoda getInstance() a fost apelata de " + PasswordMaker.getInstanceCounter() + " ori.");
     }



}

