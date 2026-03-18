package inheritance;

class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner,
                double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount
                + " so'm kiritildi.");
    }

    void showBalance() {
        System.out.println("Balans: "
                + balance);
    }
}

