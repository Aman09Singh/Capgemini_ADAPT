class Accountss{
    private total_Balance: number;
    constructor(balance: number){
        this.total_Balance = balance;
    }
    get Balance(){
        return this.total_Balance;
    }
    deposit(amount:number){
        this.total_Balance += amount;
            console.log("Deposited : $"+ amount);
            console.log("Total Balance : $"+ this.Balance);
    }
    withdraw(amount:number){
        if (amount < this.Balance) {
            this.total_Balance -= amount;
                console.log("Withdraw Amount : $"+ amount);
                console.log("Remaining Balance : $"+ this.Balance);
            
        } else {
            return "Less Cash Present";
        }
    }
}


class Savings_Account extends Accountss{
    private interest :number = 0.05;
    getAfterInterest(){
        console.log("After Interest Added : $"+(this.Balance + (this.Balance*this.interest)));
    }
}


class Current_Account extends Accountss{
    private cashCreditR :number = 5.00;
    cashCredit(){
        console.log("After Cash Credited : $"+(this.Balance - ((this.Balance * 0.02) - this.cashCreditR)));
    }
}

let savingss = new SavingsAccount(1520);
savings.deposit(800);
savings.withdraw(500);
savings.getAfterInterest();
console.log("====================");
let checkingg = new CurrentAccount(4200);
checking.deposit(690);
checking.withdraw(270)
checking.cashCredit();