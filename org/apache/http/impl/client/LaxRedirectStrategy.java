package org.apache.http.impl.client;

public class LaxRedirectStrategy
  extends DefaultRedirectStrategy
{
  private static final String[] REDIRECT_METHODS;
  
  static
  {
    String[] arrayOfString = new String[3];
    arrayOfString[0] = "GET";
    arrayOfString[1] = "POST";
    arrayOfString[2] = "HEAD";
    REDIRECT_METHODS = arrayOfString;
  }
  
  protected boolean isRedirectable(String paramString)
  {
    boolean bool1 = false;
    String[] arrayOfString = REDIRECT_METHODS;
    int i = arrayOfString.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        String str = arrayOfString[j];
        boolean bool2 = str.equalsIgnoreCase(paramString);
        if (bool2) {
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      j += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\client\LaxRedirectStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */