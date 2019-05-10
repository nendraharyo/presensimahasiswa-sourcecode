package org.apache.http.util;

public final class TextUtils
{
  public static boolean isBlank(CharSequence paramCharSequence)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramCharSequence == null) {
      bool2 = bool1;
    }
    for (;;)
    {
      return bool2;
      int i = 0;
      for (;;)
      {
        int j = paramCharSequence.length();
        if (i >= j) {
          break label52;
        }
        boolean bool3 = Character.isWhitespace(paramCharSequence.charAt(i));
        if (!bool3) {
          break;
        }
        i += 1;
      }
      label52:
      bool2 = bool1;
    }
  }
  
  public static boolean isEmpty(CharSequence paramCharSequence)
  {
    boolean bool = true;
    if (paramCharSequence == null) {}
    for (;;)
    {
      return bool;
      int i = paramCharSequence.length();
      if (i != 0) {
        bool = false;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\htt\\util\TextUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */