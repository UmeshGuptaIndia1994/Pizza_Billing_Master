
public class DeluxPizza extends Pizza {
    public DeluxPizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
