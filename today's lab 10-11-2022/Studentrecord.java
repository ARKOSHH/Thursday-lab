package todaylab;
class Sample {
    private String name;
    private int grade;
    private String email;

    public Sample(String name, int grade, String email) {

        this.name = name;
        this.grade = grade;
        this.email = email;
    }

    public String toString() {

        return name + " " + grade + " " + email;
    }}
        public class Studentrecord {

            public static void main(String[] args) {
                Sample[] s = new Sample[3];// Array of objects.

                s[0] = new Sample("Peter",104, "p@gmail.com");
                s[1] = new Sample("John",305 , "j@gmail.com");
                s[2] = new Sample("Lisa",506, "l@gmail.com");

                for (int i = 0; i < 3; ++i) {
                    System.out.println(s[i].toString());
                }
            }
}