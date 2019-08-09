package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public String status() {
		return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
	}
}
