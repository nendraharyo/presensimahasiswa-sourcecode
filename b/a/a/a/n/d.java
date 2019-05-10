package b.a.a.a.n;

import b.a.a.a.c;
import java.nio.charset.Charset;

public final class d
{
  public static final Charset a = c.c;
  public static final Charset b = c.b;
  
  public static boolean a(char paramChar)
  {
    char c = ' ';
    if (paramChar != c)
    {
      c = '\t';
      if (paramChar != c)
      {
        c = '\r';
        if (paramChar != c)
        {
          c = '\n';
          if (paramChar != c) {
            break label36;
          }
        }
      }
    }
    label36:
    for (c = '\001';; c = '\000') {
      return c;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\n\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */