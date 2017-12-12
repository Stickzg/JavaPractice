import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.mail.*;

public class EmailParser {

    public void walk( String path ) {

        File root = new File( path );
        File[] list = root.listFiles();

        if (list == null) return;

        for ( File f : list ) {
            if ( f.isDirectory() ) {
                walk( f.getAbsolutePath() );
                System.out.println( "Dir:" + f.getAbsoluteFile() );
            }
            else {
                if ( f.getAbsoluteFile().getPath().endsWith(".eml")) {
                    System.out.println("File:" + f.getAbsoluteFile());
                } else System.out.println("Not an email file");
            }
        }
    }


    private static final String IMPORTPATH = "./src/resources/resources/";

    public static void main(String[] args) {

        EmailParser emailParser = new EmailParser();
        emailParser.walk(IMPORTPATH);

    }
}

