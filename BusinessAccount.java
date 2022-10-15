package entities;

public class BusinessAccount extends Account {//o extends indica que a classe businessaccount tem todos os dados e comportamento da classe account
    private Double loanLimit;


    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);//chama o construtor da super classe, e serve para executar a lógica do construtor da classe super classe
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    public void loan(double amount) {
        if (amount <= loanLimit) {//põe um limite limite de empréstimo
            balance += amount = 10.0;
        }
    }

}
