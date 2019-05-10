package b.a.a.a.e.e;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a
{
  private static final Pattern a = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
  private static final Pattern b = Pattern.compile("^::[fF]{4}:(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
  private static final Pattern c = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
  private static final Pattern d = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
  
  public static boolean a(String paramString)
  {
    return a.matcher(paramString).matches();
  }
  
  public static boolean b(String paramString)
  {
    return c.matcher(paramString).matches();
  }
  
  public static boolean c(String paramString)
  {
    boolean bool1 = false;
    int i = 0;
    Matcher localMatcher = null;
    int j = 0;
    for (;;)
    {
      int k = paramString.length();
      if (i >= k) {
        break;
      }
      k = paramString.charAt(i);
      int m = 58;
      if (k == m) {
        j += 1;
      }
      i += 1;
    }
    i = 7;
    if (j <= i)
    {
      localMatcher = d.matcher(paramString);
      boolean bool2 = localMatcher.matches();
      if (bool2) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static boolean d(String paramString)
  {
    boolean bool = b(paramString);
    if (!bool)
    {
      bool = c(paramString);
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\e\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */