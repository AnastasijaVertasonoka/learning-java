public class DataTypes {
    public static void main(String[] args) {
        // first command
     /*
     Hello World
     I am Nastja
      */
        //Variables int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);

        //Variables double
        double temperature = 3.4;
        double price = 99.99;
        System.out.println(temperature);
        System.out.println(price);

        //Variables: float , na konce vsegda f
        float pi = 3.14F;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        //Casting okrugljaet 4islo
        int areaInteger = (int) area;
        System.out.println(Math.round(area));

        //Char
        char symbol = '$';
        System.out.println(symbol);

        //Exercise
        char n = 78; // N
        System.out.println(n);

        // Nastja
        char m = 78;// N
        System.out.println(m);
        char u = 65; // A
        System.out.println(u);
        char o = 83; //S
        System.out.println(o);
        char p = 84; // T
        System.out.println(p);
        char e = 74; // J
        System.out.println(e);
        char w = 65; // A
        System.out.println(w);

        // Boolean is / has (return true or false)

        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
        System.out.println(isSummer);
    }
}
