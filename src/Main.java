public class Main {
    public static void main(String[] args) {
        int take = 18700;
        int have = 487;
        int bonus;
        boolean percent = true;
        if (take > 1000) {
            bonus = take / 100;
        } else {
            bonus = 0;
        }
        int score = take + have;



        System.out.println("итоговый бонус: " + bonus);
        System.out.println("личный счёт: " + score);

    }
}