package cart;

public class Apple extends Item {

    private String appleType;

    public Apple() {
        super("Apple", "apple");
        this.appleType = "Granny Smith";
    }

    public String getAppleType() {
        return appleType;
    }

    public void setAppleType(String appleType) {
        this.appleType = appleType;
    }

}
