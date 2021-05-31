package com.koreait.java;

public abstract class Tv {
	private Speaker speaker;
	private String brand;
	private int inch;
	private int maxChannel;
	private int maxVolume;
	private int currentChannel;
	private int currentVolume;
//	public Tv() {
//		super();
//	}
	
	//생성자 특징 - 1. 리턴타입이 없음, 2. 클래스명과 이름이 같음
	//생성자는 오버로딩 가능? o
	//기본 생성자는 컴파일러가 자동으로 만들어줄때가 있는데 그때가 언제인가? -> 이때는 생성자가 하나도 없을때!
	
	
	protected Tv(Speaker speaker, String brand, int inch, int maxChannel, int maxVolume) {
		//super(); ->이게 생략되어있음
		this.speaker = speaker;
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
		this.currentChannel = 1;
	}
	

	public String getBrand() {
		return brand;
	}


	public int getCurrentChannel() {
		return currentChannel;
	}

	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	public int getInch() {
		return inch;
	}

	public int getMaxChannel() {
		return maxChannel;
	}

	public int getMaxVolume() {
		return maxVolume;
	}
	
	public void channelUp() {
		if(currentChannel == maxChannel) {
			currentChannel = 1;
		}else {
		currentChannel ++;
		}
		//삼항식쓸떄 !
		//currentChannel = currentChannel  == maxChannel ? 1: currentChannel + 1;
		System.out.println(currentChannel);
	}
	
	public void channelDown() {
		if(currentChannel == 1) {
		currentChannel =  maxChannel;
		}else {
			currentChannel--;
		}
	}
	
	public void volumeUp() {
		if(currentVolume < maxVolume) {
			currentVolume++; //이것만 누르면 화면에 볼륨이 올라가는것만 보이는것
			speaker.volumeUp();// 여기까지 꼭 해야 실제로 소리가 난다!!
		}
		System.out.println(currentVolume);
	}
	
	public void volumeDown() {
		if(currentVolume > 0) {
			currentVolume--;
			speaker.volumeDown();
			
		}
	}
	
	
	@Override
	public String toString() {
		return String.format("%s, %d인치, %d채널, %d볼륨", this.brand
				, inch, maxChannel, maxVolume);
	}
	
	
	
	
	
	
}
