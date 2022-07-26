public class SavingsAccount  {

  private long total = 0;

  public boolean withdraw(long amount) {
      synchronized (this){
          if(total<amount){
              System.out.println("Error! insufficient funds! . rejected process for "+Thread.currentThread().getName());
              return false;
          }

          total-=amount;

          return true;


      }


  }

  public  void deposit(long amount) {

      synchronized (this){
          total+=amount;
      }


  }

  public long getTotal() {
      return total;
  }

}