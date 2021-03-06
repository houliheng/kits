package io.github.rcarlosdasilva.kits.convert;

import java.nio.charset.Charset;

import org.junit.Assert;
import org.junit.Test;

public class CharsetConverterTest {

  @Test
  public void test() {
    String charsetName = "GBK";
    Charset defaultCharset = Charset.defaultCharset();
    CharsetConverter converter = new CharsetConverter();

    Assert.assertEquals(defaultCharset, converter.convert("none"));
    Assert.assertNull(converter.convert("none", null));
    Assert.assertEquals(charsetName, converter.convert(charsetName).name());
  }

}
