package software.ulpgc.kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TsvFilePlatformLoader implements PlatformLoader{
    private final File file;

    public TsvFilePlatformLoader(File file) {
        this.file = file;
    }

    @Override
    public List<Platform> load() {
        try {
            return load(new FileReader(file));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    private List<Platform> load(FileReader fileReader) throws IOException{
        return load(new BufferedReader(fileReader));
    }

    private List<Platform> load(BufferedReader bufferedReader) throws IOException {
        bufferedReader.skip(1);
        List<Platform> platforms = new ArrayList<>();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null ) return  platforms;
            platforms.add(toPlatform(line));
        }
    }

    private Platform toPlatform(String line) {
        return toPlatform(line.split(","));

    }

    private Platform toPlatform(String[] split) {
        return new Platform(
                split[0],
                split[1],
                split[2],
                split[3],
                split[4],
                split[5],
                split[6],
                split[7],
                split[8]
        );
    }
}
