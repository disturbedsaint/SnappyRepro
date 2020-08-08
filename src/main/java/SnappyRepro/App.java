package SnappyRepro;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.xerial.snappy.Snappy;

public class App {
  public static void main(String[] args) throws IOException {
    ByteBuffer in = ByteBuffer.allocateDirect(100);
    ByteBuffer out = ByteBuffer.allocateDirect(100);

    in.put("Hello World!".getBytes(StandardCharsets.UTF_8));

    Snappy.compress(in, out);
  }
}
