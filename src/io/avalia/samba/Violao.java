package io.avalia.samba;

public class Violao implements IInstrument {

	@Override
	public String play() {
		return "plim";
	}

	@Override
	public int getSoundVolume() {
		return 10;
	}

	@Override
	public String getColor() {
		return "dark";
	}

}
