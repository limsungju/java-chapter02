package chapter02;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String conposer;
	private int year;
	private int track;

	public Song() {
		
	}

	public Song(String title, String album, String artist, String conposer, int year, int track) {
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.conposer = conposer;
		this.year = year;
		this.track = track;
		
		// some code1
		// some code2
		// some code3
	}

	public Song(String title, String artist) {
		//this.title = title;
		//this.artist = artist;
		this(title, null, artist, null, 0, 0);
		
		
		// some code1
		// some code2
		// some code3
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getConposer() {
		return conposer;
	}

	public void setConposer(String conposer) {
		this.conposer = conposer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public void show() {
		System.out.println(
				artist + " " + title + "(" + album + ", " + year + ", " + track + "번, " + conposer + "작곡" + ")");
	}

}
