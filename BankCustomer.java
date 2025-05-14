public class BankCustomer {
    String name;
    String accountNumber;
    int age;

    public BankCustomer(String name, String accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
    }
        public void displayDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Age: " + age);
    }

    public static void main(String[] args) {
        BankCustomer customer = new BankCustomer("Amogh", "1234567890", 30);
        customer.displayDetails();
    }
}