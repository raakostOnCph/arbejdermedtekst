import java.util.Scanner;

public class Input
{
    public static int getInt(String s)
    {

        int tal = 0;

        while (true) {
            try {
                String svar = getString(s);
                tal = Integer.parseInt(svar);   // hvis det fejler, så springer jeg brak linjen over og griber
                // fejlen.

                break;  // her hopper jeg ud af mit while loop terminerer funktionen.

            } catch (NumberFormatException e) {
                System.out.println("husk ikke et tal ord");
            }
        }


        return tal;

    }

    public static String getString(String s)
    {

        udskriv(s);
        Scanner scanner = new Scanner(System.in);

//        String res = scanner.nextLine();
//        return  res;

        return scanner.nextLine();

    }

    public static void udskriv(String s)
    {

        System.out.print(s + " : ");

    }
}