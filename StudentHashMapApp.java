import java.util.HashMap;

public class StudentHashMapApp {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        if (args.length == 0) {
            System.out.println("Please enter student data or ListAll");
            return;
        }

        if (args[0].equals("ListAll")) {
            for (String name : students.keySet()) {
                int age = students.get(name);
                System.out.println("Name: " + name + ", Age: " + age);
            }
        } else {
            for (String data : args) {
                String[] parts = data.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int age = Integer.parseInt(parts[1].trim());
                    students.put(name, age);
                    System.out.println("Saved: " + name + ", Age: " + age);
                }
            }
        }
    }
}
