package bank;

import java.util.List;
import java.util.Date;

public class BankAccount {
    private String name;
    private String accountNumber;
    private Float accountBalance = 0f;
    private List<String> transactions;
    private Boolean closed = false;
    private Date creationDate;
    private Date closingDate;

    // constructor
    public BankAccount(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.creationDate = new Date();
    }

    // getter/setters
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Float getAccountBalance() {
        return accountBalance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public Boolean getClosed() {
        return closed;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getClosingDate() {
        return closingDate;
    }

    public void setAccountBalance(Float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setTransactions(String transactions) {
        this.transactions.add(transactions);
    }

    public void setClosed(Boolean closed) {
        this.closed = true;
        setClosingDate(new Date());
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setClosingDate(Date closingDate) {
        this.closingDate = closingDate;
    }

    // methods
    public void deposit(String money) {
        if (!closed) {
            Date d = new Date();
            setTransactions("deposit " + money + " at " d.getTime());
        } else {throw IllegalArgumentException;}
        
    }

    public void withdraw(String money) {
        if (!closed) {
            Date d = new Date();
            setTransactions("deposit " + money + " at " d.getTime());
        } else {throw IllegalArgumentException;}
    }
}
