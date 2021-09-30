public class Regnearter
{
    public static Double divider()
    {

        return Double.valueOf(Input.getInt("skriv det første tal")) / Double.valueOf(Input.getInt("skriv det andet tal"));

    }

    public static int div()
    {

        return Input.getInt("skriv det første tal") / Input.getInt("skriv det andet tal");

    }

    public static int modulus()
    {

        return Input.getInt("skriv det første tal") % Input.getInt("skriv det andet tal");

    }

    public static int plus()
    {

        return Input.getInt("skriv det første tal") + Input.getInt("skriv det andet tal");

    }

    public static int minus()
    {

        return Input.getInt("skriv det første tal") - Input.getInt("skriv det andet tal");

    }

    public static int gange()
    {

        return Input.getInt("skriv det første tal") * Input.getInt("skriv det andet tal");

    }
}