package prepare;

public class Task {
    public static void main(String[] args) {
        User user1 = new User("Nasyp", "111111");
        User user2 = new User("Nasyp", "222222");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals((user2)));
    }
}
