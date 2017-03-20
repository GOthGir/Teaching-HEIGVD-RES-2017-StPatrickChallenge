package ch.heigvd.res.stpatrick;

import java.io.Reader;
import java.io.Writer;

/**
 * Created by gothg on 20.03.2017.
 */
public class BasicStreamController implements IStreamDecoratorController {
   /**
    * The client calls this method to ask the class to decorate an existing
    * reader. In other words, the client tells "I have this reader, please add
    * some functionality to it".
    *
    * @param inputReader the existing reader
    * @return the decorated reader
    */
   public Reader decorateReader(Reader inputReader) {
      return null;
   }

   /**
    * The client calls this method to ask the class to decorate an existing
    * writer. In other words, the client tells "I have this writer, please add
    * some functionality to it".
    *
    * @param outputWriter the existing writer
    * @return the decorated writer
    */
   public Writer decorateWriter(Writer outputWriter) {
      return null;
   }
}
