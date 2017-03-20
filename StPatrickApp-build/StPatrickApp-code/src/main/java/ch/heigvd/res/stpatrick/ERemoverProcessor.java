package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Created by gothg on 20.03.2017.
 */
public class ERemoverProcessor implements IStreamProcessor {

   @Override
   public void process(Reader in, Writer out) throws IOException {
      BufferedReader br = new BufferedReader(in);
      BufferedWriter bw = new BufferedWriter(out);

      int c;
      StringBuilder s = new StringBuilder();
      do {
         c = br.read();
         if (c != 'E' && c != 'e')
            s.append((char)c);
      }while (c != -1);

      s.deleteCharAt(s.length() - 1);

      bw.write(s.toString());
      bw.close();
   }
}
