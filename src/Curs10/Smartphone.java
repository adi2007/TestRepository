package Curs10;

public class Smartphone {
	  // Composition:
	  private Screen theScreen;
	  private Case theCase;
	  private Speaker theSpeaker;
	  private Microphone theMicrophone;
	  
	  public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, int microMaxVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theCase = new Case();
		this.theSpeaker = new Speaker(speakerMaxVol);
		this.theMicrophone = new Microphone(microMaxVol);
	  }
	 
	  public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol, 
              int speakerCrtVol, int microMaxVol, int microCrtVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
	    this.theCase = new Case();
		this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
		this.theMicrophone = new Microphone(microMaxVol, speakerCrtVol);
	  }
	  
	  public void pressVolumeUp() {
		  System.out.println("class Smartphone: delegate to Case ->");
		  this.theCase.pressVolumeUp();
		  System.out.println("class Smartphone: delegate to Speaker ->");
		  System.out.println("Did Speaker increase volume? " + this.theSpeaker.increaseVolume());
	  }
	  
	  public void pressVolumeDown() {
		  System.out.println("class Smartphone: delegate to Case ->");
		  this.theCase.pressVolumeDown();
		  System.out.println("class Smartphone: delegate to Speaker ->");
		  System.out.println("Did Speaker decrease volume? " + this.theSpeaker.decreaseVolume());
	  }
	  
	  public void setPixel(int index, String color) {
		  this.theScreen.setPixel(index, color);
	  }
	  
	  public void colorScreen(String color) {
		  this.theScreen.colorScreen(color);
	  }
	  
	  public void increaseMicrophoneVolume() {
		  this.theMicrophone.increaseVolume();
	  }
	  
	  public void decreaseMicrophoneVolume() {
		  this.theMicrophone.decreaseVolume();
	  }
	  
	  public void muteMicrophone() {
		  this.theMicrophone.muteMicrophone();
	  }
	  
	  public void setSilenceMode() {
		  this.theSpeaker.setSilenceMode();
	  }
	}

