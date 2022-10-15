package aplication;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Herança {
    public static void main (String[] args){
        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        //UPCASTING: é quando se pega uma subclasse e atribui para uma superclasse

        Account acc1 = bacc;//não dá erro pois uma businessaccount é uma account
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        //DOWNCASTING: é quando pega um objeto da superclasse para a subclasse
        BusinessAccount acc4 = (BusinessAccount) acc2;//faz a conversão da superclasse para a superclasse, pois o compilador não converte
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;//erro pois o acc3 é savingsaccount, que é diferente de businessacount
        if (acc3 instanceof BusinessAccount ){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan! ");

        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


    }
}
