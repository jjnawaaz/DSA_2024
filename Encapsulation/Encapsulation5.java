package Encapsulation;

class Account{
    private long accNo;
    private String name;
    private String email;
    private float amount;

    public long getAccNo(){ return accNo; }
    public void setAccNo(long accNo){this.accNo = accNo;}
    public String getName(){ return name; }
    public void setName(String name){this.name = name;}
    public String getEmail(){ return email; }
    public void setEmail(String email){this.email = email;}
    public float getAmount(){ return amount; }
    public void setAmount(float amount){this.amount = amount;}
}

public class Encapsulation5 {
public static void main(String[] args) {
    Account account = new Account();

    account.setName("Aysh");
    account.setAccNo(123456789);
    account.setEmail("demo@test.com");
    account.setAmount(100000f);

    System.out.println("Account number : " +account.getAccNo());
    System.out.println("Name : " +account.getName());
    System.out.println("Email : " +account.getEmail());
    System.out.println("Amount : " +account.getAmount());
}
}