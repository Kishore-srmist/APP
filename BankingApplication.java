interface BasicSecurity {
    void login();
    void logout();
}

interface AdvancedSecurity extends BasicSecurity {
    void fingerprintAuthentication();
    void faceRecognition();
}

class BankingApplication implements AdvancedSecurity {

    public void login() {
        System.out.println("User logged in");
    }

    public void logout() {
        System.out.println("User logged out");
    }

    public void fingerprintAuthentication() {
        System.out.println("Fingerprint authentication successful");
    }

    public void faceRecognition() {
        System.out.println("Face recognition successful");
    }
}

public class BankingSecurity {
    public static void main(String[] args) {

        BankingApplication b = new BankingApplication();

        b.login();
        b.fingerprintAuthentication();
        b.faceRecognition();
        b.logout();
    }
}
