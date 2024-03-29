package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	
	@Test
	public void capitalizeに空白とaとxyzを代入() {
		String s = "a";
		String j = SnakeCamelUtil.capitalize(s);
		String expected = "A";
		assertThat(j, is(expected));
		s = "　";
		j = SnakeCamelUtil.capitalize(s);
		expected = "　";
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
	public void uncapitalizeにAとXyzを代入() {
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
	public void snakeToCamelcaseにabcとabc_defとabc_def_ghとabc__def___ghと_abc_def__を入れる() {
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
	public void camelToSnakecaseにAbcとAbcDefとAbcDefGhを入れる() {
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
