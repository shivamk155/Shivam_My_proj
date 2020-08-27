package bridge.pattern;

public class ArtistResource implements Resource {
    Artist artist; //Not part of the pattern but is required to complete the logic

    ArtistResource(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String snippet() {
        return "This song is sung by " + artist.getName();
    }

    @Override
    public String title() {
        return "This is Artist title:" + artist.getSongName();
    }

    @Override
    public String image() {
        return null;
    }

    @Override
    public String url() {
        return "www.Artist.com";
    }
}
