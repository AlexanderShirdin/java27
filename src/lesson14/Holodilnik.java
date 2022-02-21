package lesson14;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String product, int count) {
        if (products.containsKey(product)) {
            products.put(product, count + products.get(product));
        } else {
            products.put(product, count);
        }
    }

    public void getProduct(String product, int count) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта нет!!!");
            return;
        }
        if (products.get(product) < count) {
            System.out.println("Такого продукта недостаточно!!!");
            return;
        }
        if (products.get(product) == count) {
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - count);
    }

    public void printAllProduct() {
//        for (String key : products.keySet()) {
//            System.out.println(key + " - " + products.get(key));
//        }
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public boolean canCook(Receipt receipt) {
        // receipt.getIngredients()
        // products
        for (String ingredient : receipt.getIngredients().keySet()) {
            if (!products.containsKey(ingredient)) {
                System.out.println("Нет такого продукта: " + ingredient);
                return false;
            }
            if (products.get(ingredient) < receipt.getIngredients().get(ingredient)) {
                System.out.println("Нехватает продукта: " + ingredient);
                return false;
            }
        }
        return true;
    }
}