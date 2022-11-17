package lab1711;

public class Stringfunction {
    public static void main(String[] args) {
        String name="arko";
        int value= name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring= name.toUpperCase();
        System.out.println(ustring);

        String nontrimstring="     arko     ";
        System.out.println(nontrimstring);

        String trimedstring=nontrimstring.trim();
        System.out.println(trimedstring);

       
 
    }

}

