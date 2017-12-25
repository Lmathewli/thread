package test.test04;

public class LoginServlet {
    private static String userNameRef;
    private static String passwordRef;
    
    public static void doPost(String userName, String password) {
        userNameRef = userName;
        if ("a".equals(userName)) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        passwordRef = password;
        System.out.println("username = " + userNameRef + " password=" + password);
    }
}
