public class Application {

    /**
     *  Create a user interface
     *  Create some data
     *
     *  Use user interface to show the data  
     */
    public void run() {
        Userinterface userinterface = new Userinterface();
        Person person = new Person();

        userinterface.showui( person );
    }
}
