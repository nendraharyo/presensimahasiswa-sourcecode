package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.zzx;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class zzq
  extends zzz
{
  public zzq(zzw paramzzw)
  {
    super(paramzzw);
  }
  
  private byte[] zzc(HttpURLConnection paramHttpURLConnection)
  {
    InputStream localInputStream = null;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      localInputStream = paramHttpURLConnection.getInputStream();
      int i = 1024;
      byte[] arrayOfByte2 = new byte[i];
      for (;;)
      {
        int j = localInputStream.read(arrayOfByte2);
        if (j <= 0) {
          break;
        }
        localByteArrayOutputStream.write(arrayOfByte2, 0, j);
      }
      arrayOfByte1 = ((ByteArrayOutputStream)localObject).toByteArray();
    }
    finally
    {
      if (localInputStream != null) {
        localInputStream.close();
      }
    }
    byte[] arrayOfByte1;
    if (localInputStream != null) {
      localInputStream.close();
    }
    return arrayOfByte1;
  }
  
  public void zza(String paramString, URL paramURL, Map paramMap, zzq.zza paramzza)
  {
    zzjk();
    zzjv();
    zzx.zzz(paramURL);
    zzx.zzz(paramzza);
    zzv localzzv = zzCn();
    zzq.zzc localzzc = new com/google/android/gms/measurement/internal/zzq$zzc;
    localzzc.<init>(this, paramString, paramURL, null, paramMap, paramzza);
    localzzv.zzh(localzzc);
  }
  
  public void zza(String paramString, URL paramURL, byte[] paramArrayOfByte, Map paramMap, zzq.zza paramzza)
  {
    zzjk();
    zzjv();
    zzx.zzz(paramURL);
    zzx.zzz(paramArrayOfByte);
    zzx.zzz(paramzza);
    zzv localzzv = zzCn();
    zzq.zzc localzzc = new com/google/android/gms/measurement/internal/zzq$zzc;
    localzzc.<init>(this, paramString, paramURL, paramArrayOfByte, paramMap, paramzza);
    localzzv.zzh(localzzc);
  }
  
  protected HttpURLConnection zzc(URL paramURL)
  {
    Object localObject = paramURL.openConnection();
    boolean bool = localObject instanceof HttpURLConnection;
    if (!bool)
    {
      localObject = new java/io/IOException;
      ((IOException)localObject).<init>("Failed to obtain HTTP connection");
      throw ((Throwable)localObject);
    }
    localObject = (HttpURLConnection)localObject;
    ((HttpURLConnection)localObject).setDefaultUseCaches(false);
    int i = (int)zzCp().zzBO();
    ((HttpURLConnection)localObject).setConnectTimeout(i);
    i = (int)zzCp().zzBP();
    ((HttpURLConnection)localObject).setReadTimeout(i);
    ((HttpURLConnection)localObject).setInstanceFollowRedirects(false);
    ((HttpURLConnection)localObject).setDoInput(true);
    return (HttpURLConnection)localObject;
  }
  
  protected void zziJ() {}
  
  public boolean zzlB()
  {
    zzjv();
    Object localObject1 = (ConnectivityManager)getContext().getSystemService("connectivity");
    try
    {
      localObject1 = ((ConnectivityManager)localObject1).getActiveNetworkInfo();
    }
    catch (SecurityException localSecurityException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject2 = null;
        continue;
        bool = false;
        localObject2 = null;
      }
    }
    if (localObject1 != null)
    {
      bool = ((NetworkInfo)localObject1).isConnected();
      if (bool)
      {
        bool = true;
        return bool;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */