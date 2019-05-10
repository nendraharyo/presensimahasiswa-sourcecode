package org.apache.http.impl.conn;

import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SchemeSocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;

public final class SchemeRegistryFactory
{
  public static SchemeRegistry createDefault()
  {
    SchemeRegistry localSchemeRegistry = new org/apache/http/conn/scheme/SchemeRegistry;
    localSchemeRegistry.<init>();
    Scheme localScheme = new org/apache/http/conn/scheme/Scheme;
    Object localObject = PlainSocketFactory.getSocketFactory();
    localScheme.<init>("http", 80, (SchemeSocketFactory)localObject);
    localSchemeRegistry.register(localScheme);
    localScheme = new org/apache/http/conn/scheme/Scheme;
    localObject = SSLSocketFactory.getSocketFactory();
    localScheme.<init>("https", 443, (SchemeSocketFactory)localObject);
    localSchemeRegistry.register(localScheme);
    return localSchemeRegistry;
  }
  
  public static SchemeRegistry createSystemDefault()
  {
    SchemeRegistry localSchemeRegistry = new org/apache/http/conn/scheme/SchemeRegistry;
    localSchemeRegistry.<init>();
    Scheme localScheme = new org/apache/http/conn/scheme/Scheme;
    Object localObject = PlainSocketFactory.getSocketFactory();
    localScheme.<init>("http", 80, (SchemeSocketFactory)localObject);
    localSchemeRegistry.register(localScheme);
    localScheme = new org/apache/http/conn/scheme/Scheme;
    localObject = SSLSocketFactory.getSystemSocketFactory();
    localScheme.<init>("https", 443, (SchemeSocketFactory)localObject);
    localSchemeRegistry.register(localScheme);
    return localSchemeRegistry;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\impl\conn\SchemeRegistryFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */