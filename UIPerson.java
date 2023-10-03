public class UIPerson {
    /**
     *  interact with the user 
     */
    public static void showui(UIPersondetails person) {

        System.out.println("What do you want to do?" );
        System.out.println("  1. Show person's name" );
        System.out.println("  2. Change the person's name" );
        System.out.println("  9. Leave the program ");

        String command = System.console().readLine();

        while( !command.equals("9")) {

            if( command.equals("1")) {
                System.out.println("Hello " + person.firstName + person.lastName);
            }
            if( command.equals("2")) { 
                System.out.print("What's your name? " );
                person.firstName = System.console().readLine();
            }
            System.out.println("What do you want to do?" );
            System.out.println("  1. Show person's name" );
            System.out.println("  2. Change the person's name" );
            System.out.println("  9. Leave the program ");
            command = System.console().readLine();
        }
    }

    public static void showui() {
    }
}
