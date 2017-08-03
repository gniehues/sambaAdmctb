package io.avalia.samba;

public class Apito implements IInstrument {

	@Override
	public String play() {
		return "piii";
	}

	@Override
	public int getSoundVolume() {
		return 8;
	}

	@Override
	public String getColor() {
		return "green";
	}

}
