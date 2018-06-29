package Hotel;

public class Guest {
    private String name;
    private double wallet;
    
    
    public Guest(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }


    public String getName() {
        return name;
    }

    public double getWalletAmmount() {
        return this.wallet;
    }
}

  
