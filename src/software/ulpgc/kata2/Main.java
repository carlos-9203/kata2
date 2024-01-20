package software.ulpgc.kata2;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PlatformLoader loader = new TsvFilePlatformLoader(new File("dato.csv"));
        List<Platform> platforms = loader.load();
        Map<String,Integer> chart = new HashMap<>();
        for (Platform platform : platforms){
            String publisher = platform.getPublisher();
            chart.put(publisher, chart.getOrDefault(publisher,0)+1);
        }
        for (String key : chart.keySet()){
            System.out.println(key + " : " + chart.get(key));
        }
    }
}
