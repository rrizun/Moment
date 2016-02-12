package moment;

import java.io.*;
import java.util.*;

import javax.script.*;

/**
 * http://momentjs.com
 */
public class Moment {
  private final ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
  /**
   * ctor
   */
  public Moment() throws Exception {
    final InputStream in = Moment.class.getResourceAsStream("moment.min.js");
    try {
      engine.eval(new InputStreamReader(in));
    } finally {
      in.close();
    }
  }
  /**
   * fromNow
   * 
   * @param date
   * @return
   * @throws Exception
   */
  public String fromNow(Date date) throws Exception {
    return String.class.cast(engine.eval(String.format("new moment(%s).fromNow()", date.getTime())));
  }
}
