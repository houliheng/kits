package io.github.rcarlosdasilva.kits.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.google.common.base.Optional;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StreamTest {

  @Ignore
  @Test
  public void test1() throws IOException {
    InputStream is = new FileInputStream("D:\\WinSCP.ini");
    OutputStream os = System.out;

    StreamHelper.io(is, os);

    is.close();
  }

  @Ignore
  @Test
  public void test2() throws IOException {
    Optional<File> in = FileHelper.from("D:\\ezs.sql");
    File out = new File("D:\\xyz.test.sql");

    StreamHelper.nio(in.get(), out);
  }

}
