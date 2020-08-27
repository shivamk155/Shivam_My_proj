package bridge.pattern;

public class Artist {

    Artist(String name, String songName) {
        this.name = name;
        this.songName = songName;
    }

    private String name;
    private String songName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
