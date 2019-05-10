package org.apache.http.impl.cookie;

import java.util.Collections;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.CookieOrigin;

public class IgnoreSpec
  extends CookieSpecBase
{
  public List formatCookies(List paramList)
  {
    return Collections.emptyList();
  }
  
  public int getVersion()
  {
    return 0;
  }
  
  public Header getVersionHeader()
  {
    return null;
  }
  
  public List parse(Header paramHeader, CookieOrigin paramCookieOrigin)
  {
    return Collections.emptyList();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\cookie\IgnoreSpec.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */