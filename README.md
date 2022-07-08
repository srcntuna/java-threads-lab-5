# Threads Lab 5

## Instruction

You are given a class called `SavingsAccount`. It has:

- A `long` field called `total`.
- A `deposit` method that adds to the `total`.
- A `withdraw` method that subtracts the given amount from the `total`. It
  returns `true` if the operation is valid and successful and `false` otherwise.

The class should work with multiple threads. If multiple threads are operating
on the same instance of `SavingsAccount`, the `total` must have the correct
value once all the thread operations are completed.

## Starter Code

```java
class SavingsAccount {

    private long total = 0;

    public boolean withdraw(long amount) {

    }

    public void deposit(long amount) {

    }

    public long getTotal() {
        return total;
    }
}
```
