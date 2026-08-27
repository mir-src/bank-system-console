public class Account {
    private int id;
    private int amount;
    private String password;
    private String name;

    public Account(int id, int amount, String password, String name){
        this.id = id;
        this.amount = amount;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }
    public int withdrawMoney(int amount){
        if (amount <= this.amount){
            this.amount -= amount;
            return amount;
        }
        return -1;
    }
    public void addMoney(int amount){
        this.amount += amount;
    }
    public boolean transfer(Account person, int amount){
        if (this.amount >= amount){
            person.amount += this.amount;
            this.amount -= amount;
            return true;
        }
        return false;
    }
}
