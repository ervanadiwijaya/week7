import java.util.Scanner;

class User {
    String nama, email, telpon;

    public User(String u_nama, String u_email, String u_telpon) {
        nama = u_nama;
        email = u_email;
        telpon = u_telpon;
    }
}

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("");
        greet("robot", "1999"); // change it as you need

        System.out.print("namamu dong: ");
        String name = scanner.nextLine();

        System.out.print("email mu: ");
        String email = scanner.nextLine();

        System.out.print("no telpon mu: ");
        String telpon = scanner.nextLine();

        User user = new User(name, email, telpon);

        System.out.println("");
        System.out.println("Hallo " + user.nama);
        System.out.println("");

        System.out.println("");
        guessAge();
        System.out.println("");
        count();
        System.out.println("");
        test();
        System.out.println("");
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hallo, namaku " + assistantName + ".");
        System.out.println("Aku dibuat pada tahun " + birthYear + ".");
        System.out.println("Aku mau tau tentang mu.");
    }

    static void guessAge() {
        System.out.println("Ijikan aku menebak umur mu.");
        System.out.println("Katakan sisa bagi umurmu dari 3, 5, dan 7");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Umur kamu adalah " + age + "; itu waktu yang bagus untuk belajar pemrograman");
    }

    static void count() {
        System.out.println("Aku akan buktikan bahwa aku dapat menghitung.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Ayo uji pengetahuan pemrogramanmu");
        System.out.println("Kenapa kita menggunakan methods?");
        System.out.println("1. Untuk mengulang sebuah statement berulang kali.");
        System.out.println("2. Untuk menguraikan sebuah program menjadi beberapa bagian.");
        System.out.println("3. Untuk menentukan waktu eksekusi sebuah program");
        System.out.println("4. Untuk menghentikan eksekusi sebuah program.");
        while (true) {
            int ans = scanner.nextInt();
            if (ans == 2) {
                break; // if true, stop the loop
            } else {
                System.out.println("Coba lagi");
            }
        }
    }

    static void end() {
        System.out.println("Selamat, semoga harimu menyenangkan");
    }
}
