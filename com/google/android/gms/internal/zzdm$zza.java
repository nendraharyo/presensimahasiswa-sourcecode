package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class zzdm$zza
  extends zzim
{
  private final String zzF;
  private final zzjp zzpD;
  private final String zzzE = "play.google.com";
  private final String zzzF = "market";
  private final int zzzG = 10;
  
  public zzdm$zza(zzjp paramzzjp, String paramString)
  {
    this.zzpD = paramzzjp;
    this.zzF = paramString;
  }
  
  public void onStop() {}
  
  public Intent zzT(String paramString)
  {
    Uri localUri = Uri.parse(paramString);
    Intent localIntent = new android/content/Intent;
    localIntent.<init>("android.intent.action.VIEW");
    localIntent.addFlags(268435456);
    localIntent.setData(localUri);
    return localIntent;
  }
  
  public void zzbr()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = this.zzF;
    int j = 10;
    int m;
    if (i < j) {
      m = i + 1;
    }
    for (;;)
    {
      try
      {
        localObject1 = new java/net/URL;
        ((URL)localObject1).<init>((String)localObject2);
        localObject3 = "play.google.com";
        localObject6 = ((URL)localObject1).getHost();
        bool1 = ((String)localObject3).equalsIgnoreCase((String)localObject6);
        if (!bool1) {
          continue;
        }
        localObject1 = localObject2;
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException1)
      {
        Object localObject3;
        boolean bool1;
        localObject1 = localObject2;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject6 = "Error while parsing ping URL: ";
        localObject2 = (String)localObject6 + (String)localObject1;
        zzin.zzd((String)localObject2, localIndexOutOfBoundsException1);
        continue;
      }
      catch (IOException localIOException1)
      {
        localObject1 = localObject2;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject6 = "Error while pinging URL: ";
        localObject2 = (String)localObject6 + (String)localObject1;
        zzin.zzd((String)localObject2, localIOException1);
        continue;
      }
      catch (RuntimeException localRuntimeException1)
      {
        localObject1 = localObject2;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject6 = "Error while pinging URL: ";
        localObject2 = (String)localObject6 + (String)localObject1;
        zzin.zzd((String)localObject2, localRuntimeException1);
        continue;
        Object localObject5 = localObject6;
        continue;
      }
      localObject1 = zzT((String)localObject1);
      localObject3 = zzr.zzbC();
      localObject2 = this.zzpD.getContext();
      ((zzir)localObject3).zzb((Context)localObject2, (Intent)localObject1);
      return;
      localObject3 = "market";
      localObject6 = ((URL)localObject1).getProtocol();
      bool1 = ((String)localObject3).equalsIgnoreCase((String)localObject6);
      if (bool1)
      {
        localObject1 = localObject2;
      }
      else
      {
        localObject1 = ((URL)localObject1).openConnection();
        localObject1 = (HttpURLConnection)localObject1;
        try
        {
          localObject3 = zzr.zzbC();
          localObject6 = this.zzpD;
          localObject6 = ((zzjp)localObject6).getContext();
          Object localObject7 = this.zzpD;
          localObject7 = ((zzjp)localObject7).zzhX();
          localObject7 = ((VersionInfoParcel)localObject7).afmaVersion;
          int n = 0;
          String str = null;
          ((zzir)localObject3).zza((Context)localObject6, (String)localObject7, false, (HttpURLConnection)localObject1);
          int k = ((HttpURLConnection)localObject1).getResponseCode();
          localObject7 = ((HttpURLConnection)localObject1).getHeaderFields();
          localObject6 = "";
          n = 300;
          if (k >= n)
          {
            n = 399;
            if (k <= n)
            {
              k = 0;
              localObject3 = null;
              str = "Location";
              boolean bool2 = ((Map)localObject7).containsKey(str);
              if (bool2)
              {
                localObject3 = "Location";
                localObject3 = ((Map)localObject7).get(localObject3);
                localObject3 = (List)localObject3;
                if (localObject3 == null) {
                  continue;
                }
                int i1 = ((List)localObject3).size();
                if (i1 <= 0) {
                  continue;
                }
                boolean bool3 = false;
                localObject6 = null;
                localObject3 = ((List)localObject3).get(0);
                localObject3 = (String)localObject3;
                bool3 = TextUtils.isEmpty((CharSequence)localObject3);
                if (bool3)
                {
                  localObject3 = "Arrived at landing page, this ideally should not happen. Will open it in browser.";
                  zzin.zzaK((String)localObject3);
                  ((HttpURLConnection)localObject1).disconnect();
                  localObject1 = localObject2;
                }
              }
              else
              {
                str = "location";
                bool2 = ((Map)localObject7).containsKey(str);
                if (!bool2) {
                  continue;
                }
                localObject3 = "location";
                localObject3 = ((Map)localObject7).get(localObject3);
                localObject3 = (List)localObject3;
                continue;
              }
            }
          }
        }
        finally
        {
          try
          {
            ((HttpURLConnection)localObject1).disconnect();
            i = m;
            localObject2 = localObject3;
          }
          catch (RuntimeException localRuntimeException2)
          {
            localObject1 = localRuntimeException1;
            localObject5 = localRuntimeException2;
            continue;
          }
          catch (IOException localIOException2)
          {
            localObject1 = localObject5;
            localObject5 = localIOException2;
            continue;
          }
          catch (IndexOutOfBoundsException localIndexOutOfBoundsException2)
          {
            localObject1 = localObject5;
            localObject5 = localIndexOutOfBoundsException2;
            continue;
          }
          localObject4 = finally;
          ((HttpURLConnection)localObject1).disconnect();
        }
        localObject1 = localObject2;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzdm$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */