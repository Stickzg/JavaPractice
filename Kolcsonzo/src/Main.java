import com.flowacademy.kolcsonzo.Exceptions.HibasKolcsonzesException;
import com.flowacademy.kolcsonzo.OktatoVideo;
import com.flowacademy.kolcsonzo.Video;
import com.flowacademy.kolcsonzo.Videoteka;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String SERIALIZEPATH = "./data/videoTeka.ser";

    private static void serializeTeka(Videoteka videoteka ) {
        try {
            FileOutputStream fileOut = new FileOutputStream(SERIALIZEPATH);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.close();
            fileOut.close();
            System.out.println("Succesfull serialization");

        } catch (IOException e) {
            System.out.println("Task failed successfully!");
            e.fillInStackTrace();
        }

    }

    private static final String INPUTPATH = "./data/input.txt";

    public static void main(String[] args) {
        BufferedReader br;
        List<Video> videok = new ArrayList<>();
        List<OktatoVideo> oktatoVideok = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(INPUTPATH));


            String line;
            int stepper = 0;

            while((line = br.readLine()) != null) {
                if ( stepper > 0 ) {
                    String[] splittedline = line.split(";");
                    String cim = splittedline[0];
                    String kolcsonzes = splittedline[1];
                    if ( splittedline.length == 3 ) {
                        int korhatar = Integer.parseInt(splittedline[2]);
                        videok.add(new Video(cim, kolcsonzes, korhatar));
                    } else if ( splittedline.length == 2 ) {
                        oktatoVideok.add(new OktatoVideo(cim, kolcsonzes));
                    }
                }
                stepper++;
            }
            br.close();
        } catch (IOException e) {
            e.fillInStackTrace();
        }

        Videoteka videoteka = new Videoteka();

        for (Video video : videok) {
            videoteka.hozzaAd(video);
        }

        for (OktatoVideo oktatoVideo: oktatoVideok) {
            videoteka.hozzaAd(oktatoVideo);
        }

        try {
            videoteka.keres(false, "Mátrix").kikolcsonoz(20,2);
        } catch (HibasKolcsonzesException e) {
            e.fillInStackTrace();
        }

        serializeTeka(videoteka);

    }

}
