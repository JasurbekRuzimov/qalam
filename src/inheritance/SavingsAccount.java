package inheritance;

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String owner,
                   double balance, double rate) {
        super(owner, balance);
        this.interestRate = rate;
    }

    void addInterest() {
        double interest =
                balance * interestRate / 100;
        deposit(interest);
        System.out.println("Foiz: "
                + interest);
    }
}
// NATIJA:
// 500.0 so'm kiritildi.
// Foiz: 50.0
// Balans: 1550.0

