public class UIApplication {

    /**
     *  Create a user interface
     *  Create some data
     *
     *  Use user interface to show the data  
     */
    public static void run() {
        UIApplication userinterface = new UIApplication();
        UIPersondetails person = new UIPersondetails();

        userinterface.showui( person );
    }

    private void showui(UIPersondetails person) {
    }
}
