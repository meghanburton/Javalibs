import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum;
        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Enter a place: ");
        String place = sc.nextLine();

        System.out.println("Enter a color: ");
        String color = sc.nextLine();

        System.out.println("Enter your favorite food: ");
        String food = sc.nextLine();

        System.out.println("Enter a hobby: ");
        String hobby = sc.nextLine();

        System.out.print("Enter your favorite animal: ");
        String animal = sc.nextLine();

        System.out.println("Enter an occupation: ");
        String occupation = sc.nextLine();

        System.out.println("Enter a number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter a second number: ");
        int n2 = sc.nextInt();

        System.out.println("Enter a third number: ");
        int n3 = sc.nextInt();
        sum = n1 + n2 + n3;
        double average = ((double) n1 + n2 + n3 / 3);





        String story = "My name is " + name + "." + "\n"
                + "One day, " + name + " went to " + place + " because of all the vibrant "
                + color + " colors. " +"\n"
                + name + " also loves " + place + " because of the " + food + " dishes they serve. " +"\n"
                + name + " loves to play " + hobby + "." +"\n"
                + name + " loves " + animal + ". "
                +"\n" + name + " dreamed of becoming a "
                + occupation + ". "
                +"\n"+ "The time it took " + name + " to become a " + occupation +
                " was " + sum + " years. "
                +"\n"+ "On average, it took "  + name + " " + average + " years.";

        System.out.println(story);

        sc.close();

    }

}