package com.google.android.gms.internal;

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class zzw$zza
  extends HttpEntityEnclosingRequestBase
{
  public zzw$zza() {}
  
  public zzw$zza(String paramString)
  {
    URI localURI = URI.create(paramString);
    setURI(localURI);
  }
  
  public String getMethod()
  {
    return "PATCH";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzw$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */