package com.google.android.gms.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

class zzru
  implements zzrv
{
  private HttpURLConnection zzbmy;
  
  private InputStream zzd(HttpURLConnection paramHttpURLConnection)
  {
    int i = paramHttpURLConnection.getResponseCode();
    int j = 200;
    if (i == j) {
      return paramHttpURLConnection.getInputStream();
    }
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    String str = "Bad response: ";
    localObject1 = str + i;
    int k = 404;
    if (i == k)
    {
      localObject2 = new java/io/FileNotFoundException;
      ((FileNotFoundException)localObject2).<init>((String)localObject1);
      throw ((Throwable)localObject2);
    }
    Object localObject2 = new java/io/IOException;
    ((IOException)localObject2).<init>((String)localObject1);
    throw ((Throwable)localObject2);
  }
  
  private void zze(HttpURLConnection paramHttpURLConnection)
  {
    if (paramHttpURLConnection != null) {
      paramHttpURLConnection.disconnect();
    }
  }
  
  public void close()
  {
    HttpURLConnection localHttpURLConnection = this.zzbmy;
    zze(localHttpURLConnection);
  }
  
  public InputStream zzgI(String paramString)
  {
    HttpURLConnection localHttpURLConnection = zzgJ(paramString);
    this.zzbmy = localHttpURLConnection;
    localHttpURLConnection = this.zzbmy;
    return zzd(localHttpURLConnection);
  }
  
  HttpURLConnection zzgJ(String paramString)
  {
    int i = 20000;
    Object localObject = new java/net/URL;
    ((URL)localObject).<init>(paramString);
    localObject = (HttpURLConnection)((URL)localObject).openConnection();
    ((HttpURLConnection)localObject).setReadTimeout(i);
    ((HttpURLConnection)localObject).setConnectTimeout(i);
    return (HttpURLConnection)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzru.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */