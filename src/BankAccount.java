public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount+=sum;
        System.out.println("You add to your account: "+ sum);
    }
    public void withDraw(Double sum) throws LimitException{
        if (sum<amount){
            throw new LimitException("Error...You do not have enough funds in your account for the amount you requested" +
                    "You have on account: ", amount);
        }else {
            System.out.println("You can take from account: "+ sum);
            amount-= sum;
            System.out.println("You have on your account: " + sum);
        }
    }
}