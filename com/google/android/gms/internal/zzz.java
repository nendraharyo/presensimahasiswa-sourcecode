package com.google.android.gms.internal;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public class zzz
  implements zzy
{
  private final zzz.zza zzaE;
  private final SSLSocketFactory zzaF;
  
  public zzz()
  {
    this(null);
  }
  
  public zzz(zzz.zza paramzza)
  {
    this(paramzza, null);
  }
  
  public zzz(zzz.zza paramzza, SSLSocketFactory paramSSLSocketFactory)
  {
    this.zzaE = paramzza;
    this.zzaF = paramSSLSocketFactory;
  }
  
  private HttpURLConnection zza(URL paramURL, zzk paramzzk)
  {
    HttpURLConnection localHttpURLConnection = zza(paramURL);
    int i = paramzzk.zzt();
    localHttpURLConnection.setConnectTimeout(i);
    localHttpURLConnection.setReadTimeout(i);
    localHttpURLConnection.setUseCaches(false);
    localHttpURLConnection.setDoInput(true);
    Object localObject1 = "https";
    Object localObject2 = paramURL.getProtocol();
    boolean bool = ((String)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzaF;
      if (localObject1 != null)
      {
        localObject1 = localHttpURLConnection;
        localObject1 = (HttpsURLConnection)localHttpURLConnection;
        localObject2 = this.zzaF;
        ((HttpsURLConnection)localObject1).setSSLSocketFactory((SSLSocketFactory)localObject2);
      }
    }
    return localHttpURLConnection;
  }
  
  private static HttpEntity zza(HttpURLConnection paramHttpURLConnection)
  {
    BasicHttpEntity localBasicHttpEntity = new org/apache/http/entity/BasicHttpEntity;
    localBasicHttpEntity.<init>();
    try
    {
      localObject = paramHttpURLConnection.getInputStream();
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        Object localObject;
        long l;
        InputStream localInputStream = paramHttpURLConnection.getErrorStream();
      }
    }
    localBasicHttpEntity.setContent((InputStream)localObject);
    l = paramHttpURLConnection.getContentLength();
    localBasicHttpEntity.setContentLength(l);
    localObject = paramHttpURLConnection.getContentEncoding();
    localBasicHttpEntity.setContentEncoding((String)localObject);
    localObject = paramHttpURLConnection.getContentType();
    localBasicHttpEntity.setContentType((String)localObject);
    return localBasicHttpEntity;
  }
  
  static void zza(HttpURLConnection paramHttpURLConnection, zzk paramzzk)
  {
    int i = paramzzk.getMethod();
    Object localObject1;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Unknown method type.");
      throw ((Throwable)localObject1);
    case -1: 
      localObject1 = paramzzk.zzm();
      if (localObject1 != null)
      {
        boolean bool = true;
        paramHttpURLConnection.setDoOutput(bool);
        paramHttpURLConnection.setRequestMethod("POST");
        Object localObject2 = paramzzk.zzl();
        paramHttpURLConnection.addRequestProperty("Content-Type", (String)localObject2);
        DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
        localObject2 = paramHttpURLConnection.getOutputStream();
        localDataOutputStream.<init>((OutputStream)localObject2);
        localDataOutputStream.write((byte[])localObject1);
        localDataOutputStream.close();
      }
      break;
    }
    for (;;)
    {
      return;
      localObject1 = "GET";
      paramHttpURLConnection.setRequestMethod((String)localObject1);
      continue;
      localObject1 = "DELETE";
      paramHttpURLConnection.setRequestMethod((String)localObject1);
      continue;
      localObject1 = "POST";
      paramHttpURLConnection.setRequestMethod((String)localObject1);
      zzb(paramHttpURLConnection, paramzzk);
      continue;
      localObject1 = "PUT";
      paramHttpURLConnection.setRequestMethod((String)localObject1);
      zzb(paramHttpURLConnection, paramzzk);
      continue;
      localObject1 = "HEAD";
      paramHttpURLConnection.setRequestMethod((String)localObject1);
      continue;
      localObject1 = "OPTIONS";
      paramHttpURLConnection.setRequestMethod((String)localObject1);
      continue;
      localObject1 = "TRACE";
      paramHttpURLConnection.setRequestMethod((String)localObject1);
      continue;
      localObject1 = "PATCH";
      paramHttpURLConnection.setRequestMethod((String)localObject1);
      zzb(paramHttpURLConnection, paramzzk);
    }
  }
  
  private static void zzb(HttpURLConnection paramHttpURLConnection, zzk paramzzk)
  {
    byte[] arrayOfByte = paramzzk.zzq();
    if (arrayOfByte != null)
    {
      boolean bool = true;
      paramHttpURLConnection.setDoOutput(bool);
      Object localObject = paramzzk.zzp();
      paramHttpURLConnection.addRequestProperty("Content-Type", (String)localObject);
      DataOutputStream localDataOutputStream = new java/io/DataOutputStream;
      localObject = paramHttpURLConnection.getOutputStream();
      localDataOutputStream.<init>((OutputStream)localObject);
      localDataOutputStream.write(arrayOfByte);
      localDataOutputStream.close();
    }
  }
  
  protected HttpURLConnection zza(URL paramURL)
  {
    return (HttpURLConnection)paramURL.openConnection();
  }
  
  public HttpResponse zza(zzk paramzzk, Map paramMap)
  {
    int i = 1;
    Object localObject1 = paramzzk.getUrl();
    Object localObject2 = new java/util/HashMap;
    ((HashMap)localObject2).<init>();
    Object localObject3 = paramzzk.getHeaders();
    ((HashMap)localObject2).putAll((Map)localObject3);
    ((HashMap)localObject2).putAll(paramMap);
    localObject3 = this.zzaE;
    if (localObject3 != null)
    {
      localObject3 = this.zzaE.zzh((String)localObject1);
      if (localObject3 == null)
      {
        localObject3 = new java/io/IOException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = "URL blocked by rewriter: " + (String)localObject1;
        ((IOException)localObject3).<init>((String)localObject1);
        throw ((Throwable)localObject3);
      }
    }
    else
    {
      localObject3 = localObject1;
    }
    localObject1 = new java/net/URL;
    ((URL)localObject1).<init>((String)localObject3);
    Object localObject4 = zza((URL)localObject1, paramzzk);
    localObject3 = ((HashMap)localObject2).keySet();
    Object localObject5 = ((Set)localObject3).iterator();
    boolean bool;
    for (;;)
    {
      bool = ((Iterator)localObject5).hasNext();
      if (!bool) {
        break;
      }
      localObject3 = (String)((Iterator)localObject5).next();
      localObject1 = (String)((HashMap)localObject2).get(localObject3);
      ((HttpURLConnection)localObject4).addRequestProperty((String)localObject3, (String)localObject1);
    }
    zza((HttpURLConnection)localObject4, paramzzk);
    localObject3 = new org/apache/http/ProtocolVersion;
    localObject1 = "HTTP";
    ((ProtocolVersion)localObject3).<init>((String)localObject1, i, i);
    int j = ((HttpURLConnection)localObject4).getResponseCode();
    int k = -1;
    if (j == k)
    {
      localObject3 = new java/io/IOException;
      ((IOException)localObject3).<init>("Could not retrieve response code from HttpUrlConnection.");
      throw ((Throwable)localObject3);
    }
    localObject1 = new org/apache/http/message/BasicStatusLine;
    k = ((HttpURLConnection)localObject4).getResponseCode();
    localObject5 = ((HttpURLConnection)localObject4).getResponseMessage();
    ((BasicStatusLine)localObject1).<init>((ProtocolVersion)localObject3, k, (String)localObject5);
    localObject2 = new org/apache/http/message/BasicHttpResponse;
    ((BasicHttpResponse)localObject2).<init>((StatusLine)localObject1);
    localObject3 = zza((HttpURLConnection)localObject4);
    ((BasicHttpResponse)localObject2).setEntity((HttpEntity)localObject3);
    localObject3 = ((HttpURLConnection)localObject4).getHeaderFields().entrySet();
    localObject4 = ((Set)localObject3).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject4).hasNext();
      if (!bool) {
        break;
      }
      localObject3 = (Map.Entry)((Iterator)localObject4).next();
      localObject1 = ((Map.Entry)localObject3).getKey();
      if (localObject1 != null)
      {
        localObject5 = new org/apache/http/message/BasicHeader;
        localObject1 = (String)((Map.Entry)localObject3).getKey();
        localObject3 = (List)((Map.Entry)localObject3).getValue();
        i = 0;
        localObject3 = (String)((List)localObject3).get(0);
        ((BasicHeader)localObject5).<init>((String)localObject1, (String)localObject3);
        ((BasicHttpResponse)localObject2).addHeader((Header)localObject5);
      }
    }
    return (HttpResponse)localObject2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */