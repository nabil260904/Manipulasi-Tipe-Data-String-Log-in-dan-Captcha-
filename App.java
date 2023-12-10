import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String username = "admin";
        String password = "admin";
        String captcha = generateCaptcha();

        System.out.println("Welcome! Please login.");
// scanner untuk ambil input dari user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Input password: ");
        String inputPassword = scanner.nextLine();
        System.out.println("CAPTCHA: " + captcha);
        System.out.print("verify that you are human!: ");
        String inputCaptcha = scanner.nextLine();
        scanner.close();

        if (checkCaptcha(inputCaptcha, captcha) && checkLogin(inputUsername, inputPassword, username, password)) {
            System.out.println("Login Success!");
        } else {
            System.out.println("Login Failed. Try Again.");
        }
    }

    public static boolean checkLogin(String inputUsername, String inputPassword, String username, String password) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }

    public static String generateCaptcha() {
        return "mMUuHhOoYoO";
    }

    public static boolean checkCaptcha(String inputCaptcha, String captcha) {
        return captcha.equalsIgnoreCase(inputCaptcha);
    }
}