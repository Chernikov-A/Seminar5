import java.util.*;

public class Main {

    private static HashMap<String, ArrayList> contact = new HashMap<>();
    public static void main(String[] args) {
        addContact("Валерия","+79535489987");
        addContact("Олег","+79545556886");
        addContact("Антон","+79533325583");
        addContact("Лера","+79995558899");
        addContact("Олег","+79565644411");
        addContact("Олег","+7956227799");
        addContact("Антон","+79664564121");
        print();

    }
    // Добавляет новый контакт телефона
    public static void addContact (String name, String phoneNumber){
        if (contact.containsKey(name)) {
            ArrayList phone = contact.get(name);
            phone.add(phoneNumber);
            contact.put(name,phone);
        }else {
            ArrayList phone = new ArrayList();
            phone.add(phoneNumber);
            contact.put(name,phone);
        }
    }
// Отсортировывает контакты и выводит их
    public static void print() {
        ArrayList<Map.Entry<String, ArrayList>> list = new ArrayList<>(contact.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, ArrayList>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList> o1, Map.Entry<String, ArrayList> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        });
        for (Map.Entry<String, ArrayList> entry:list){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}