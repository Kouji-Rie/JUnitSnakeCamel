package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	
	@Test
	public void capitalize‚É‹ó”’‚Æa‚Æxyz‚ğ‘ã“ü() {
		String s = "a";
		String j = SnakeCamelUtil.capitalize(s);
		String expected = "A";
		assertThat(j, is(expected));
		s = "@";
		j = SnakeCamelUtil.capitalize(s);
		expected = "@";
		assertThat(j, is(expected));
		s = "a";
		j = SnakeCamelUtil.capitalize(s);
		expected = "A";
		assertThat(j, is(expected));
		s = "xyz";
		j = SnakeCamelUtil.capitalize(s);
		expected = "Xyz";
		assertThat(j, is(expected));
	}
	
	@Test
	public void uncapitalize‚ÉA‚ÆXyz‚ğ‘ã“ü() {
		String s = "A";
		String j = SnakeCamelUtil.uncapitalize(s);
		String expected = "a";
		assertThat(j, is(expected));
		s = "Xyz";
		j = SnakeCamelUtil.uncapitalize(s);
		expected = "xyz";
		assertThat(j, is(expected));
	}
	

	@Test
	public void snakeToCamelcase‚Éabc‚Æabc_def‚Æabc_def_gh‚Æabc__def___gh‚Æ_abc_def__‚ğ“ü‚ê‚é() {
		String s = "abc";
		String j = SnakeCamelUtil.snakeToCamelcase(s);
		String expected = "Abc";
		assertThat(j, is(expected));
		s = "abc_def";
		j = SnakeCamelUtil.snakeToCamelcase(s);
		expected = "AbcDef";
		assertThat(j, is(expected));
		s = "abc_def_gh";
		j = SnakeCamelUtil.snakeToCamelcase(s);
		expected = "AbcDefGh";
		assertThat(j, is(expected));
		s = "abc__def___gh";
		j = SnakeCamelUtil.snakeToCamelcase(s);
		expected = "AbcDefGh";
		assertThat(j, is(expected));
		s = "_abc_def__";
		j = SnakeCamelUtil.snakeToCamelcase(s);
		expected = "AbcDef";
		assertThat(j, is(expected));
	}
	
	@Test
	public void camelToSnakecase‚ÉAbc‚ÆAbcDef‚ÆAbcDefGh‚ğ“ü‚ê‚é() {
		String s = "Abc";
		String j = SnakeCamelUtil.camelToSnakecase(s);
		String expected = "abc";
		assertThat(j, is(expected));
		s = "AbcDef";
		j = SnakeCamelUtil.camelToSnakecase(s);
		expected = "abc_def";
		assertThat(j, is(expected));
		s = "AbcDefGh";
		j = SnakeCamelUtil.camelToSnakecase(s);
		expected = "abc_def_gh";
		assertThat(j, is(expected));
		
	}

}
