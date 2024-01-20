package software.ulpgc.kata2;

public class Platform {
    private final String platform;
    private final String genre;
    private final String publisher;
    private final String naSales;
    private  final String euSales;
    private final String jpSales;
    private final String otherSales;
    private final String globalSales;
    private final String criticScoreClass;

    public Platform(String platform, String genre, String publisher, String naSales, String euSales, String jpSales, String otherSales, String globalSales, String criticScoreClass) {
        this.platform = platform;
        this.genre = genre;
        this.publisher = publisher;
        this.naSales = naSales;
        this.euSales = euSales;
        this.jpSales = jpSales;
        this.otherSales = otherSales;
        this.globalSales = globalSales;
        this.criticScoreClass = criticScoreClass;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getNaSales() {
        return naSales;
    }

    public String getEuSales() {
        return euSales;
    }

    public String getJpSales() {
        return jpSales;
    }

    public String getOtherSales() {
        return otherSales;
    }

    public String getGlobalSales() {
        return globalSales;
    }

    public String getCriticScoreClass() {
        return criticScoreClass;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "platform='" + platform + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", naSales='" + naSales + '\'' +
                ", euSales='" + euSales + '\'' +
                ", jpSales='" + jpSales + '\'' +
                ", otherSales='" + otherSales + '\'' +
                ", globalSales='" + globalSales + '\'' +
                ", criticScoreClass='" + criticScoreClass + '\'' +
                '}';
    }
}
