package org.apache.http.conn.ssl;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.apache.http.util.Args;

public final class PrivateKeyDetails
{
  private final X509Certificate[] certChain;
  private final String type;
  
  public PrivateKeyDetails(String paramString, X509Certificate[] paramArrayOfX509Certificate)
  {
    String str = (String)Args.notNull(paramString, "Private key type");
    this.type = str;
    this.certChain = paramArrayOfX509Certificate;
  }
  
  public X509Certificate[] getCertChain()
  {
    return this.certChain;
  }
  
  public String getType()
  {
    return this.type;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.type;
    localStringBuilder = localStringBuilder.append(str).append(':');
    str = Arrays.toString(this.certChain);
    return str;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\conn\ssl\PrivateKeyDetails.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */