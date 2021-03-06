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
public class ViolaoTest {
	
	@Test
	public void aViolaoShouldMakeplim() {
		IInstrument violao = new Violao();
		String sound = violao.play();
		Assert.assertEquals("plim", sound);
	}

	@Test
	public void aViolaoShouldBeLouderThanATrumpet() {
		IInstrument violao = new Violao();
		IInstrument trumpet = new Trumpet();
		int violaoVolume = violao.getSoundVolume();
		int trumpetVolume = trumpet.getSoundVolume();
		Assert.assertTrue(violaoVolume > trumpetVolume);
	}

	@Test
	public void aViolaoShouldBeDark() {
		IInstrument trumpet = new Violao();
		String color = trumpet.getColor();
		Assert.assertEquals("dark", color);
	}

}
