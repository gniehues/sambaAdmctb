package io.avalia.samba;

import org.junit.Assert;
import org.junit.Test;

/**
 * *** IMPORTANT WARNING : DO NOT EDIT THIS FILE ***
 * 
 * This file is used to specify what you have to implement. To check your work,
 * we will run our own copy of the automated tests. If you change this file,
 * then you will introduce a change of specification!!!
 * 
 * @author Olivier Liechti
 */
public class ApitoTest {
	
	@Test
	public void aApitoShouldMakePiii() {
		IInstrument apito = new Apito();
		String sound = apito.play();
		Assert.assertEquals("piii", sound);
	}

	@Test
	public void aApitoShouldBeLouderThanATrumpet() {
		IInstrument apito = new Apito();
		IInstrument trumpet = new Trumpet();
		int apitoVolume = apito.getSoundVolume();
		int trumpetVolume = trumpet.getSoundVolume();
		Assert.assertTrue(apitoVolume > trumpetVolume);
	}

	@Test
	public void aApitoShouldBeGreen() {
		IInstrument trumpet = new Apito();
		String color = trumpet.getColor();
		Assert.assertEquals("green", color);
	}

}