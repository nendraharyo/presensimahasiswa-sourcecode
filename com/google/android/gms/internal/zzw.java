package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class zzw
  implements zzy
{
  protected final HttpClient zzaD;
  
  public zzw(HttpClient paramHttpClient)
  {
    this.zzaD = paramHttpClient;
  }
  
  private static void zza(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, zzk paramzzk)
  {
    byte[] arrayOfByte = paramzzk.zzq();
    if (arrayOfByte != null)
    {
      ByteArrayEntity localByteArrayEntity = new org/apache/http/entity/ByteArrayEntity;
      localByteArrayEntity.<init>(arrayOfByte);
      paramHttpEntityEnclosingRequestBase.setEntity(localByteArrayEntity);
    }
  }
  
  private static void zza(HttpUriRequest paramHttpUriRequest, Map paramMap)
  {
    Object localObject = paramMap.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      String str = (String)paramMap.get(localObject);
      paramHttpUriRequest.setHeader((String)localObject, str);
    }
  }
  
  static HttpUriRequest zzb(zzk paramzzk, Map paramMap)
  {
    int i = paramzzk.getMethod();
    Object localObject1;
    Object localObject2;
    Object localObject3;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Unknown request method.");
      throw ((Throwable)localObject1);
    case -1: 
      localObject2 = paramzzk.zzm();
      if (localObject2 != null)
      {
        localObject1 = new org/apache/http/client/methods/HttpPost;
        localObject3 = paramzzk.getUrl();
        ((HttpPost)localObject1).<init>((String)localObject3);
        String str = paramzzk.zzl();
        ((HttpPost)localObject1).addHeader("Content-Type", str);
        localObject3 = new org/apache/http/entity/ByteArrayEntity;
        ((ByteArrayEntity)localObject3).<init>((byte[])localObject2);
        ((HttpPost)localObject1).setEntity((HttpEntity)localObject3);
      }
      break;
    }
    for (;;)
    {
      return (HttpUriRequest)localObject1;
      localObject1 = new org/apache/http/client/methods/HttpGet;
      localObject2 = paramzzk.getUrl();
      ((HttpGet)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpGet;
      localObject2 = paramzzk.getUrl();
      ((HttpGet)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpDelete;
      localObject2 = paramzzk.getUrl();
      ((HttpDelete)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpPost;
      localObject2 = paramzzk.getUrl();
      ((HttpPost)localObject1).<init>((String)localObject2);
      localObject2 = "Content-Type";
      localObject3 = paramzzk.zzp();
      ((HttpPost)localObject1).addHeader((String)localObject2, (String)localObject3);
      zza((HttpEntityEnclosingRequestBase)localObject1, paramzzk);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpPut;
      localObject2 = paramzzk.getUrl();
      ((HttpPut)localObject1).<init>((String)localObject2);
      localObject2 = "Content-Type";
      localObject3 = paramzzk.zzp();
      ((HttpPut)localObject1).addHeader((String)localObject2, (String)localObject3);
      zza((HttpEntityEnclosingRequestBase)localObject1, paramzzk);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpHead;
      localObject2 = paramzzk.getUrl();
      ((HttpHead)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpOptions;
      localObject2 = paramzzk.getUrl();
      ((HttpOptions)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new org/apache/http/client/methods/HttpTrace;
      localObject2 = paramzzk.getUrl();
      ((HttpTrace)localObject1).<init>((String)localObject2);
      continue;
      localObject1 = new com/google/android/gms/internal/zzw$zza;
      localObject2 = paramzzk.getUrl();
      ((zzw.zza)localObject1).<init>((String)localObject2);
      localObject2 = "Content-Type";
      localObject3 = paramzzk.zzp();
      ((zzw.zza)localObject1).addHeader((String)localObject2, (String)localObject3);
      zza((HttpEntityEnclosingRequestBase)localObject1, paramzzk);
    }
  }
  
  public HttpResponse zza(zzk paramzzk, Map paramMap)
  {
    HttpUriRequest localHttpUriRequest = zzb(paramzzk, paramMap);
    zza(localHttpUriRequest, paramMap);
    Object localObject = paramzzk.getHeaders();
    zza(localHttpUriRequest, (Map)localObject);
    zza(localHttpUriRequest);
    localObject = localHttpUriRequest.getParams();
    int i = paramzzk.zzt();
    HttpConnectionParams.setConnectionTimeout((HttpParams)localObject, 5000);
    HttpConnectionParams.setSoTimeout((HttpParams)localObject, i);
    return this.zzaD.execute(localHttpUriRequest);
  }
  
  protected void zza(HttpUriRequest paramHttpUriRequest) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */