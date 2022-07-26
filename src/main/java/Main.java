public class Main {
    public static void main(String[] args) throws InterruptedException {
        // your code here
        SavingsAccount savingsAccount = new SavingsAccount();

       Thread t1 = new Thread(()->savingsAccount.deposit(10_000));
       Thread t2 = new Thread(()->savingsAccount.withdraw(5_000));
       Thread t3 = new Thread(()->savingsAccount.withdraw(15_000));
       Thread t4 = new Thread(()->savingsAccount.withdraw(5_000));

       t1.setName("thread-1");
       t2.setName("thread-2");
       t3.setName("thread-3");
       t4.setName("thread-4");


       t1.start();
       t2.start();
       t3.start();
       t4.start();

       t1.join();
       t2.join();
       t3.join();
       t4.join();

        System.out.println(savingsAccount.getTotal());

    }
}
