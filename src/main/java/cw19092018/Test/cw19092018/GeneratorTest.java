package cw19092018;

import org.junit.Test;

import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.junit.MatcherAssert.assertThat;

class GeneratorTest {
    @Test
    public void generate1() {
        assertThat(new Generator().generate(10, 5), hasSize(10));
    }
    @Test
    public void generate2() {
        assertThat(new Generator().generate(10, 5), everyItem(greaterThanOrEqualTo(5)));
    }
}