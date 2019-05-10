package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;

class zzcx
  implements zzac
{
  private final Context mContext;
  private final zzcx.zzb zzblh;
  private final zzcx.zza zzbli;
  private final String zzzN;
  
  zzcx(Context paramContext, zzcx.zza paramzza)
  {
    this(local1, paramContext, paramzza);
  }
  
  zzcx(zzcx.zzb paramzzb, Context paramContext, zzcx.zza paramzza)
  {
    this.zzblh = paramzzb;
    Object localObject = paramContext.getApplicationContext();
    this.mContext = ((Context)localObject);
    this.zzbli = paramzza;
    String str1 = Build.VERSION.RELEASE;
    String str2 = zzc(Locale.getDefault());
    String str3 = Build.MODEL;
    String str4 = Build.ID;
    localObject = this;
    localObject = zza("GoogleTagManager", "4.00", str1, str2, str3, str4);
    this.zzzN = ((String)localObject);
  }
  
  static String zzc(Locale paramLocale)
  {
    Object localObject1 = null;
    if (paramLocale == null) {}
    for (;;)
    {
      return (String)localObject1;
      Object localObject2 = paramLocale.getLanguage();
      if (localObject2 != null)
      {
        localObject2 = paramLocale.getLanguage();
        int i = ((String)localObject2).length();
        if (i != 0)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = paramLocale.getLanguage().toLowerCase();
          ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = paramLocale.getCountry();
          if (localObject2 != null)
          {
            localObject2 = paramLocale.getCountry();
            i = ((String)localObject2).length();
            if (i != 0)
            {
              localObject2 = ((StringBuilder)localObject1).append("-");
              String str = paramLocale.getCountry().toLowerCase();
              ((StringBuilder)localObject2).append(str);
            }
          }
          localObject1 = ((StringBuilder)localObject1).toString();
        }
      }
    }
  }
  
  public void zzE(List paramList)
  {
    int i = paramList.size();
    int j = Math.min(i, 40);
    int k = 1;
    float f1 = Float.MIN_VALUE;
    int m = 0;
    if (m < j)
    {
      zzaq localzzaq = (zzaq)paramList.get(m);
      Object localObject1 = zzd(localzzaq);
      if (localObject1 == null)
      {
        zzbg.zzaK("No destination: discarding hit.");
        localObject1 = this.zzbli;
        ((zzcx.zza)localObject1).zzb(localzzaq);
        i = k;
      }
      for (float f2 = f1;; f2 = f1)
      {
        for (;;)
        {
          m += 1;
          k = i;
          f1 = f2;
          break;
          try
          {
            localObject4 = this.zzblh;
            localObject4 = ((zzcx.zzb)localObject4).zzd((URL)localObject1);
            if (k != 0) {}
            try
            {
              localObject1 = this.mContext;
              zzbl.zzbb((Context)localObject1);
              k = 0;
              Object localObject5 = null;
              f1 = 0.0F;
              localObject1 = "User-Agent";
              localObject6 = this.zzzN;
              ((HttpURLConnection)localObject4).setRequestProperty((String)localObject1, (String)localObject6);
              int n = ((HttpURLConnection)localObject4).getResponseCode();
              int i1 = 200;
              if (n != i1)
              {
                localObject6 = new java/lang/StringBuilder;
                ((StringBuilder)localObject6).<init>();
                String str = "Bad response: ";
                localObject6 = ((StringBuilder)localObject6).append(str);
                localObject1 = ((StringBuilder)localObject6).append(n);
                localObject1 = ((StringBuilder)localObject1).toString();
                zzbg.zzaK((String)localObject1);
                localObject1 = this.zzbli;
                ((zzcx.zza)localObject1).zzc(localzzaq);
              }
              for (;;)
              {
                ((HttpURLConnection)localObject4).disconnect();
                i = k;
                f2 = f1;
                break;
                localObject1 = this.zzbli;
                ((zzcx.zza)localObject1).zza(localzzaq);
              }
              float f3;
              localObject4 = new java/lang/StringBuilder;
            }
            finally
            {
              n = k;
              f3 = f1;
              localObject5 = localObject2;
              try
              {
                ((HttpURLConnection)localObject4).disconnect();
                throw ((Throwable)localObject2);
              }
              catch (IOException localIOException2)
              {
                k = n;
                f1 = f3;
                localObject3 = localIOException2;
              }
            }
          }
          catch (IOException localIOException1)
          {
            Object localObject4;
            Object localObject6;
            Object localObject3;
            for (;;) {}
          }
        }
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Exception sending hit: ");
        localObject6 = localObject3.getClass().getSimpleName();
        localObject4 = (String)localObject6;
        zzbg.zzaK((String)localObject4);
        zzbg.zzaK(((IOException)localObject3).getMessage());
        localObject3 = this.zzbli;
        ((zzcx.zza)localObject3).zzc(localzzaq);
        i = k;
      }
    }
  }
  
  public boolean zzGw()
  {
    Object localObject = this.mContext;
    String str = "connectivity";
    localObject = ((ConnectivityManager)((Context)localObject).getSystemService(str)).getActiveNetworkInfo();
    boolean bool;
    if (localObject != null)
    {
      bool = ((NetworkInfo)localObject).isConnected();
      if (bool) {}
    }
    else
    {
      zzbg.v("...no network connectivity");
      bool = false;
      localObject = null;
    }
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  String zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    Object[] arrayOfObject = new Object[6];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = paramString3;
    arrayOfObject[3] = paramString4;
    arrayOfObject[4] = paramString5;
    arrayOfObject[5] = paramString6;
    return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", arrayOfObject);
  }
  
  URL zzd(zzaq paramzzaq)
  {
    String str = paramzzaq.zzGF();
    try
    {
      localURL = new java/net/URL;
      localURL.<init>(str);
    }
    catch (MalformedURLException localMalformedURLException)
    {
      for (;;)
      {
        URL localURL;
        zzbg.e("Error trying to parse the GTM url.");
        Object localObject = null;
      }
    }
    return localURL;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcx.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */