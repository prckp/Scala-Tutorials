object T9Q4 extends App {

  import T9Q3.Account

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

    def applyInterest(): Unit = {
      if (balance > 0) {
        balance += balance * 0.05 // Deposit interest
      } else {
        balance += balance * 0.1 // Overdraft interest
      }
    }
  }

  class Bank(val accounts: List[Account]) {
    def getAccountsWithNegativeBalance: List[Account] = {
      accounts.filter(_.balance < 0)
    }

    def calculateTotalBalance: Double = {
      accounts.map(_.balance).sum
    }

    def applyInterestToAllAccounts(): Unit = {
      accounts.foreach(_.applyInterest())
    }
  }

  val account1 = new Account(1, 1000.0)
  val account2 = new Account(2, -500.0)
  val account3 = new Account(3, 2000.0)

  val bank = new Bank(List(account1, account2, account3))

  val accountsWithNegativeBalance = bank.getAccountsWithNegativeBalance
  val totalBalance = bank.calculateTotalBalance

  println("Accounts with negative balance:")
  accountsWithNegativeBalance.foreach(account => println(s"Account ${account.accountId}: ${account.balance}"))

  println(s"Total balance of all accounts: $totalBalance")

  bank.applyInterestToAllAccounts()

  println("Balances after applying interest:")
  bank.accounts.foreach(account => println(s"Account ${account.accountId}: ${account.balance}"))
}