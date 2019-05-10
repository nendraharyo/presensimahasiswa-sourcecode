package b.a.a.a.e.d;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;

public class g
{
  public static SSLContext a()
  {
    Object localObject = "TLS";
    try
    {
      localObject = SSLContext.getInstance((String)localObject);
      localh = null;
      str = null;
      ((SSLContext)localObject).init(null, null, null);
      return (SSLContext)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localh = new b/a/a/a/e/d/h;
      str = localNoSuchAlgorithmException.getMessage();
      localh.<init>(str, localNoSuchAlgorithmException);
      throw localh;
    }
    catch (KeyManagementException localKeyManagementException)
    {
      h localh = new b/a/a/a/e/d/h;
      String str = localKeyManagementException.getMessage();
      localh.<init>(str, localKeyManagementException);
      throw localh;
    }
  }
  
  public static f b()
  {
    f localf = new b/a/a/a/e/d/f;
    localf.<init>();
    return localf;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\d\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */