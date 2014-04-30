package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	@Test
	public void snakeToCamelcase��tw_cat_dogs_aplle������() {
		String s = "tw_cat_dogs_aplle";
		String j = SnakeCamelUtil.snakeToCamelcase(s);
		String expected = "TwCatDogsAplle";
		assertThat(j, is(expected));
		
	}
	@Test
	public void camelToSnakecase��TwCatDogsAplle������() {
		String s = "TwCatDogsAplle";
		String j = SnakeCamelUtil.camelToSnakecase(s);
		String expected = "tw_cat_dogs_aplle";
		assertThat(j, is(expected));
		
	}

}
