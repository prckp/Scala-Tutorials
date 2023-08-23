object T9Q3 extends App{
  class Account(val accountId: Int, var balance: Double) {
    def deposit(amount: Double): Unit = {
      if (amount > 0) {
        balance += amount
        println(s"Deposited $amount. New balance: $balance")
      } else {
        println("Invalid deposit amount. Amount must be greater than 0.")
      }
    }

    def withdraw(amount: Double): Boolean = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        println(s"Withdrew $amount. New balance: $balance")
        true
      } else {
        println("Withdrawal failed. Insufficient funds or invalid amount.")
        false
      }
    }

    def transfer(toAccount: Account, amount: Double): Boolean = {
      if (amount > 0 && amount <= balance) {
        if (withdraw(amount)) {
          toAccount.deposit(amount)
          println(s"Transferred $amount to Account ${toAccount.accountId}")
          true
        } else {
          false
        }
      } else {
        println("Transfer failed. Insufficient funds or invalid amount.")
        false
      }
    }

    def getBalance: Double = balance
  }

  object Account {
    var accountCounter: Int = 0

    def createAccount(initialBalance: Double): Account = {
      accountCounter += 1
      new Account(accountCounter, initialBalance)
    }
  }

  val account1 = Account.createAccount(1000.0)
  val account2 = Account.createAccount(500.0)

  account1.deposit(200.0)
  account2.withdraw(100.0)
  account1.transfer(account2, 300.0)


}
