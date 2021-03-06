package br.com.academiadev.reembolsoazul.reembolsoazul;

import org.junit.Assert;
import org.junit.Test;

import br.com.academiadev.reembolsoazul.util.ValidationsHelper;

public class ValidationTests {
	@Test
	public void emailValidationTest() {
		Assert.assertTrue(ValidationsHelper.emailValidation("bla@bla.com.br") == true);
		Assert.assertTrue(ValidationsHelper.emailValidation("a@b.cd") == true);
		Assert.assertTrue(ValidationsHelper.emailValidation("bla_bla.com.br") == false);
		Assert.assertTrue(ValidationsHelper.emailValidation("bla@bla.") == false);
		Assert.assertTrue(ValidationsHelper.emailValidation("@bla.com.br") == false);
		Assert.assertTrue(ValidationsHelper.emailValidation(null) == false);
		Assert.assertTrue(ValidationsHelper.emailValidation("") == false);
	}

	@Test
	public void passwordFormatValidationTest() {
		Assert.assertTrue(ValidationsHelper.passwordFormatValidation("1aA+1234") == true);
		Assert.assertTrue(ValidationsHelper.passwordFormatValidation("147z258Z369==") == true);
		Assert.assertTrue(ValidationsHelper.passwordFormatValidation("1aA+123") == false);
		Assert.assertTrue(ValidationsHelper.passwordFormatValidation("1aA+56789012345678901") == false);
		Assert.assertTrue(ValidationsHelper.passwordFormatValidation("1AA+1234") == false);
		Assert.assertTrue(ValidationsHelper.passwordFormatValidation("1aa+1234") == false);
		Assert.assertTrue(ValidationsHelper.passwordFormatValidation("1aAA1234") == false);
	}
}
