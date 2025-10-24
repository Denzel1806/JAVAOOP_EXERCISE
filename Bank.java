import java.util.ArrayList;


class Account {
    private String accountNumber;
    private String accountHolder;
    private double balance;


    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited ₱" + amount + " to " + accountHolder + "'s account.");
        } else {
            System.out.println(" Deposit amount must be positive!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" Withdrawn ₱" + amount + " from " + accountHolder + "'s account.");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance!");
        } else {
            System.out.println(" Withdrawal amount must be positive!");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₱" + balance);
        System.out.println("------------------------------");
    }
}


class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

    
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("🏦 Account added: " + account.getAccountHolder());
    }


    public void removeAccount(String accountNumber) {
        boolean removed = false;
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                accounts.remove(acc);
                System.out.println(" Account removed: " + acc.getAccountHolder());
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("⚠️ Account not found: " + accountNumber);
        }
    }


    public Account findAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    
    public void displayAllAccounts() {
        System.out.println("\n List of All Accounts:");
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
        } else {
            for (Account acc : accounts) {
                acc.displayAccountInfo();
            }
        }
    }
}


class Main {
    public static void main(String[] args) {
        
        Bank bank = new Bank();

        
        Account acc1 = new Account("1001", "LUNA MOONFANG", 5000);
        Account acc2 = new Account("1002", "LANNY SMITH", 8000);

        
        bank.addAccount(acc1);
        bank.addAccount(acc2);

        
        bank.displayAllAccounts();

        
        acc1.deposit(1500);
        acc1.withdraw(2000);
        acc2.withdraw(9000); 

    
        bank.removeAccount("1002");

        bank.displayAllAccounts();
    }
}
