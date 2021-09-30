import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here


        String s = " å#.ø€l o  sw.%e,     lkjrd.    nsdk'       fjh a.åæe";




        String  text = Util.læsFil("teksten.txt");

        text = rensTekst(text);
        Util.udskriv(text);






    }


    public static void a(int x, String s) {

        b(x, s);
    }

    private static void b(int x, String s)
    {
        c(x, s);
    }

    private static void c(int x, String s)
    {
    d(x,s);
    }

    private static void d(int x, String s)
    {
    }



    public static String normaliserMellemrum(String tekst)
    {

        while (tekst.contains("  ")) {
            tekst = tekst.replace("  ", " ");
            System.out.println(tekst);
        }

        return tekst;

    }

    public static String rensTekst(String tekst)
    {

        String specialTegn = "!#€%&/().,\"«»'";

        String[] tegn = specialTegn.split("");

        for (int i = 0; i < tegn.length; i++) {

            tekst = tekst.replace(tegn[i], "");
        }

        return tekst;
    }


}
