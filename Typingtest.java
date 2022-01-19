
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("You are about to start");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("3");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("2");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }
        System.out.println("1");
        try {
            Thread.sleep(1000);
        } catch (Exception e) { }

        double start_time= LocalTime.now().toNanoOfDay();
        System.out.println("India is my country and all Indians are my brothers\n" +
                "and sisters. I love my country and I am proud of its\n" +
                "rich and varied heritage. I shall always strive to be\n" +
                "worthy of it. I shall give respect to my parents,\n" +
                "teachers and elders and treat everyone with\n" +
                "courtesy. To my country and my people, I pledge\n" +
                "my devotion. In their well being and prosperity\n" +
                "alone, lies my happiness.");
        System.out.println();

        System.out.print("Start Typing : ");
        Scanner sc =new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println();

        double finish_time=LocalTime.now().toNanoOfDay();
        double check= finish_time -start_time;
        double sec = check/Math.pow(10,9);
        int chars = text.length();
        int wpm=(int)(((double)chars/sec)*60);
        System.out.println("You can type "+wpm+" words per minute.");
    }
}
