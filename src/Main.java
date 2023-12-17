//Main

public class Main {
    public static void main(String[] args) throws Exception {

        Food[] breakfast = new Food[200];

        Cake cake = new Cake(null);
        Cheese cheese = new Cheese();
        Apple apple = new Apple(null);

        int itemsSoFar = 0;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cake")) {
                breakfast[itemsSoFar] = new Cake(parts[1]);
            } else if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else if (parts[0].equals("Apple")) {
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }

            itemsSoFar++;
        }

        for (Food item : breakfast)
            if (item != null) {
                if (item.equals(cake)) Cake.Count++;
                if (item.equals(cheese)) Cheese.Count++;
                if (item.equals(apple)) Apple.Count++;
                item.consume();
            } else
                break;

        System.out.println("Съедено сыра: " + Cheese.Count);
        System.out.println("Съедено яблок: " + Apple.Count);
        System.out.println("Съедено торта: " + Cake.Count);
        System.out.println("Всего хорошего!");
    }
}
