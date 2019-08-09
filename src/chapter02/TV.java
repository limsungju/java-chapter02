package chapter02;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}

	public void power(boolean power) {
		if(power == true) {
			this.power = true;
			System.out.println("TV가 켜졌습니다.");
		} else {
			this.power = false;
			System.out.println("TV가 꺼졌습니다.");
		}
	}

	public void volume(int volume) {
		this.volume = volume;
		if(volume >= 100) {
			this.volume = 100;
		} else if (volume <= 0) {
			this.volume = 0;
		}
		System.out.println("TV 볼륨:" + this.volume);
	}

	public void volume(boolean volume) {
		if(volume == true) {
			this.volume = this.volume + 1;
			volume(this.volume);
		} else {
			this.volume = this.volume - 1;
			volume(this.volume);
		}
	}

	public void channel(int channel) {
		this.channel = channel;
		if(channel > 255) {
			this.channel = 255;
		} else if(channel < 1) {
			this.channel = 1;
		}
		System.out.println("TV 채널:" + this.channel);
	}

	public void channel(boolean channel) {
		if(channel == true) {
			this.channel = this.channel + 1;
			if(this.channel > 255) {
				this.channel = this.channel % 255;
			}
		} else {
			this.channel = this.channel - 1;
			if(this.channel < 1) {
				this.channel = 255;
			}
		}
		System.out.println("TV 채널:" + this.channel);
	}
	
	
	
	
}
