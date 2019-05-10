package io.fabric.sdk.android.services.network;

import java.security.PrivilegedAction;

final class HttpRequest$1
  implements PrivilegedAction
{
  HttpRequest$1(String paramString1, String paramString2) {}
  
  public String run()
  {
    String str1 = this.val$name;
    String str2 = this.val$value;
    return System.setProperty(str1, str2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\HttpRequest$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */