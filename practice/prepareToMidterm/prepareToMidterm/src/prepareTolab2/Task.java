public class Task {
    public static void main(String[] args){
        User user1 = new User ("Nasyp", "11111");
        User user2 = new User ("Nasyp", "22222");
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }

}
