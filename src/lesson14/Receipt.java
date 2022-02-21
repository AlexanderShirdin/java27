package lesson14;

import java.util.HashMap;

public class Receipt {
    private String name;
    private HashMap <String, Integer> ingredients = new HashMap<>();

    public void addIngredients(String ingredient, int amount){
        if (ingredients.containsKey(ingredient)) {
            ingredients.put(ingredient, amount + ingredients.get(ingredient));
        } else {
            ingredients.put(ingredient, amount);
        }
    }

    public HashMap<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}