import java.util.HashMap;
import java.util.Map;

public class HomeWorkMap {
    public static void main(String[] args) {
        Map<String, Fruits> fruits = new HashMap<>();
        fruits.put("key", new Fruits("watermelon", 10, "green"));
        fruits.put("key1", new Fruits("melon", 7, "yellow"));
        fruits.put("key2", new Fruits("apple", 1, "red"));
        fruits.put("key3", new Fruits("pineapple", 1, "yellow"));
        fruits.put("key5", new Fruits("oranges", 2, "orange"));
        fruits.put("key6", new Fruits("WaterMelon", 6, "yellow"));
        fruits.put("key7", new Fruits("WaTerMeLon", 6, "yellow"));

        System.out.println(fruits.get("key2"));// Получил элемент по ключу

        Map<String, Fruits> fruitsOnMarket = new HashMap<>(fruits); // Создал новый и добавил еще один фрукт 2(б)
        fruitsOnMarket.put("key8", new Fruits("banana", 3, "yellow"));
        System.out.println(fruitsOnMarket.toString());
        // Можно копировать один МАР в Другой с помощью метода
        fruits.putAll(fruitsOnMarket);

        System.out.println("Удаление по ключу: " + "fruitsOnMarket.remove(\"key2\") = " + fruitsOnMarket.remove("key2"));
        System.out.println("Проверка есть ли это значение" + "fruitsOnMarket.containsValue(\"apple\") = " + fruitsOnMarket.containsValue("apple"));
        System.out.println("Проверка есть ли по ключу: " + "fruitsOnMarket.containsKey(\"key2\") = " + fruitsOnMarket.containsKey("key2"));
        System.out.println();

        System.out.println("Выводим все ключи" +  fruitsOnMarket.keySet());
        System.out.println();
        System.out.println("Выводим значения" + fruitsOnMarket.values());
        System.out.println();
        System.out.println("Выводим ключи и значения с помощью entrySet()" + fruitsOnMarket.entrySet());
        System.out.println();
        System.out.println(fruitsOnMarket.size());
        System.out.println("Выводим пару Ключ-Значение: ");
        for (Map.Entry entry: fruitsOnMarket.entrySet()) {

            System.out.println(entry);
        }

        for(String name : fruitsOnMarket.keySet()){



        }

    }

}
