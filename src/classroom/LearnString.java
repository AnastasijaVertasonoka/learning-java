package classroom;

public class LearnString {
    public static void main(String[] args) {
      // String
      String name = "Nastja";
      String lastName = "Vertasonoka";
        System.out.println(name);
        System.out.println(lastName);

        // Exercise: Print name and surname (Example: John Doe)
        //Concatenation
        String fullName = name + " " + lastName; // Nastja Vertasonoka
        System.out.println(fullName);

        // Same example without Variables String / srazu vnutri String uze string
        System.out.println(fullName + " " + lastName);

        System.out.println(String.format("%s %s", name, lastName));
         // ili ze ne vse vmeste

        String.format("%s %s", name, lastName);
        System.out.println(String.format("%s %s", name, lastName));

        // Hello World!

        String hello = "Hello,";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        // Exercise:
        // Step 1: Declare a string variable with your name;
        // Step 2: string variable with your programming language;
        // Step 3: Concatenate the two strings to fare a message : 'My name is (name). I love coding in (language)';
        // Step 4: Print it out;

        //Variant 1

        String myName = "Nastja";
        String Lang = "Java";
        String.format("My name is %s. I love coding in %s.", myName, Lang);
        System.out.println(String.format("My name is %s. I love coding in %s.", myName, Lang));

        // Variant 2

        String myName2 = "Nastja";
        String Lang2 = "Java";
        System.out.println("My name is " + myName2 + ".I love programming in" + Lang2);

        // Variant 3

        String myName3 = "My name is Nastja.";
        String Lang3 = "I love codding in Java.";
        String text = myName3.concat(Lang3);
        System.out.println(text);

        String randomstring = "some text";
        System.out.println(randomstring.toUpperCase());




    }

}
