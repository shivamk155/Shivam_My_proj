package bridge.pattern;

public class BridgePatternUser {
    public static void main(String[] args) {
        Book half_blood_prince = new Book("J. K. Rowling", "Half Blood Prince", 100);
        Book soccers_stone = new Book("J. K. Rowling", "Soccer's stone", 80);

        Artist diljit_dosanjh = new Artist("Diljit Dosanjh", "Veer Vaar");
        Artist neha_kakker = new Artist("Neha Kakkar", "Janam Janam");

        Resource dil = new ArtistResource(diljit_dosanjh);
        Resource neha = new ArtistResource(neha_kakker);

        View long_view_dil = new LongView(dil);
        View short_view_neha = new ShortView(neha);

        System.out.println("Artist resources");
        System.out.println(long_view_dil.show());
        System.out.println(short_view_neha.show());

        Resource hmp = new BookResource(half_blood_prince);
        Resource ss = new BookResource(soccers_stone);

        View long_view_hbp = new LongView(hmp);
        View short_view_ss = new ShortView(ss);

        System.out.println("Book resources");
        System.out.println(long_view_hbp.show());
        System.out.println(short_view_ss.show());

    }
}
