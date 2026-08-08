import java.util.Scanner;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic(String songName);
}

class SmartPhone implements Camera, MusicPlayer {

    String phoneName;

    SmartPhone(String phoneName) {
        this.phoneName = phoneName;
    }

    public void takePhoto() {
        System.out.println(phoneName + " is taking a photo.");
    }

    public void playMusic(String songName) {
        System.out.println("Playing song: " + songName);
    }

    void displayInfo() {
        System.out.println("\nPhone: " + phoneName);
    }
}

public class SmartDevice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Phone Name: ");
        String phoneName = input.nextLine();

        System.out.print("Enter Song Name: ");
        String songName = input.nextLine();

        SmartPhone phone = new SmartPhone(phoneName);

        phone.displayInfo();
        phone.takePhoto();
        phone.playMusic(songName);

        input.close();
    }
}
