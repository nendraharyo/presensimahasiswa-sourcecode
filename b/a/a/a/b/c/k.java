package b.a.a.a.b.c;

import b.a.a.a.ac;
import b.a.a.a.ae;
import b.a.a.a.b.a.a;
import b.a.a.a.k.m;
import b.a.a.a.l.f;
import java.net.URI;

public abstract class k
  extends b
  implements d, l
{
  private a config;
  private URI uri;
  private ac version;
  
  public a getConfig()
  {
    return this.config;
  }
  
  public abstract String getMethod();
  
  public ac getProtocolVersion()
  {
    ac localac = this.version;
    if (localac != null) {}
    for (localac = this.version;; localac = f.b(getParams())) {
      return localac;
    }
  }
  
  public ae getRequestLine()
  {
    String str1 = getMethod();
    ac localac = getProtocolVersion();
    Object localObject = getURI();
    String str2 = null;
    if (localObject != null) {
      str2 = ((URI)localObject).toASCIIString();
    }
    if (str2 != null)
    {
      int i = str2.length();
      if (i != 0) {}
    }
    else
    {
      str2 = "/";
    }
    localObject = new b/a/a/a/k/m;
    ((m)localObject).<init>(str1, str2, localac);
    return (ae)localObject;
  }
  
  public URI getURI()
  {
    return this.uri;
  }
  
  public void releaseConnection()
  {
    reset();
  }
  
  public void setConfig(a parama)
  {
    this.config = parama;
  }
  
  public void setProtocolVersion(ac paramac)
  {
    this.version = paramac;
  }
  
  public void setURI(URI paramURI)
  {
    this.uri = paramURI;
  }
  
  public void started() {}
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = getMethod();
    localStringBuilder = localStringBuilder.append((String)localObject).append(" ");
    localObject = getURI();
    localStringBuilder = localStringBuilder.append(localObject).append(" ");
    localObject = getProtocolVersion();
    return (String)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\b\c\k.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */