import java.util.Scanner;

interface MediaPlayer {


void play(String fileName);


}

class AudioPlayer implements MediaPlayer {
@Override
public void play(String fileName) {


    System.out.println("Playing Audio (MP3):" + fileName);
}

}

class VideoPlayer implements MediaPlayer{
@Override
public void play (String fileName)
{
System.out.println("Playing Video (MP4): " + fileName);
}
}

public class Interface\_pracice {


public static void main(String[] args)
{
    Scanner input =new Scanner(System.in);

    System.out.print("Enter Audio File Name: ");
    String audioFile = input.nextLine();

    System.out.print("Enter Video File Name: ");
    String videoFile = input.nextLine();

    System.out.println();


AudioPlayer audio = new AudioPlayer();
audio.play(audioFile);


    VideoPlayer video = new VideoPlayer();
    video.play(videoFile);


    input.close();
}

} 
