//Liskov principle
public abstract class Money 
{
    int amount;
    char currency;

    public abstract void convert_currency();
}

class Payment extends Money{

public void convert_currency() {
        
        System.out.println("Converting currency for payment.");
    }
}

//The class payment extends from money without adding onto any functionality.
// It simply implements the abstract method convert_currency.
