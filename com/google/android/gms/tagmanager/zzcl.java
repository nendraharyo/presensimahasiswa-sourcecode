package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.internal.zzrv;
import com.google.android.gms.internal.zzrw;
import java.io.FileNotFoundException;
import java.io.IOException;

class zzcl
  implements Runnable
{
  private final Context mContext;
  private final String zzbhM;
  private volatile String zzbij;
  private final zzrw zzbke;
  private final String zzbkf;
  private zzbf zzbkg;
  private volatile zzs zzbkh;
  private volatile String zzbki;
  
  zzcl(Context paramContext, String paramString, zzrw paramzzrw, zzs paramzzs)
  {
    this.mContext = paramContext;
    this.zzbke = paramzzrw;
    this.zzbhM = paramString;
    this.zzbkh = paramzzs;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "/r?id=" + paramString;
    this.zzbkf = ((String)localObject);
    localObject = this.zzbkf;
    this.zzbij = ((String)localObject);
    this.zzbki = null;
  }
  
  public zzcl(Context paramContext, String paramString, zzs paramzzs)
  {
    this(paramContext, paramString, localzzrw, paramzzs);
  }
  
  private boolean zzGX()
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
  
  private void zzGY()
  {
    boolean bool = zzGX();
    Object localObject1;
    Object localObject4;
    if (!bool)
    {
      localObject1 = this.zzbkg;
      localObject4 = zzbf.zza.zzbju;
      ((zzbf)localObject1).zza((zzbf.zza)localObject4);
    }
    for (;;)
    {
      return;
      zzbg.v("Start loading resource from network ...");
      localObject4 = zzGZ();
      localObject1 = this.zzbke;
      zzrv localzzrv = ((zzrw)localObject1).zzIa();
      try
      {
        localObject1 = localzzrv.zzgI((String)localObject4);
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        int i;
        localFileNotFoundException = localFileNotFoundException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject5 = "No data is retrieved from the given url: ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject5);
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject4 = ". Make sure container_id: ";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject4 = this.zzbhM;
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject4 = " is correct.";
        localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
        localObject2 = ((StringBuilder)localObject2).toString();
        zzbg.zzaK((String)localObject2);
        localObject2 = this.zzbkg;
        localObject4 = zzbf.zza.zzbjw;
        ((zzbf)localObject2).zza((zzbf.zza)localObject4);
        localzzrv.close();
      }
      catch (IOException localIOException1)
      {
        Object localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        String str = "Error when loading resources from url: ";
        localObject5 = ((StringBuilder)localObject5).append(str);
        localObject4 = ((StringBuilder)localObject5).append((String)localObject4);
        localObject5 = " ";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject5 = localIOException1.getMessage();
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        zzbg.zzd((String)localObject4, localIOException1);
        zzbf localzzbf1 = this.zzbkg;
        localObject4 = zzbf.zza.zzbjv;
        localzzbf1.zza((zzbf.zza)localObject4);
        localzzrv.close();
        continue;
        zzbf localzzbf2;
      }
      finally
      {
        localzzrv.close();
      }
    }
  }
  
  public void run()
  {
    Object localObject = this.zzbkg;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("callback must be set before execute");
      throw ((Throwable)localObject);
    }
    this.zzbkg.zzGk();
    zzGY();
  }
  
  String zzGZ()
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    Object localObject2 = this.zzbkh.zzGm();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
    localObject2 = this.zzbij;
    localObject1 = (String)localObject2 + "&v=a65833898";
    localObject2 = this.zzbki;
    if (localObject2 != null)
    {
      localObject2 = this.zzbki.trim();
      localObject3 = "";
      bool = ((String)localObject2).equals(localObject3);
      if (!bool)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1).append("&pv=");
        localObject2 = this.zzbki;
        localObject1 = (String)localObject2;
      }
    }
    localObject2 = zzcb.zzGU().zzGV();
    Object localObject3 = zzcb.zza.zzbjW;
    boolean bool = ((zzcb.zza)localObject2).equals(localObject3);
    if (bool)
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = "&gtm_debug=x";
      localObject1 = (String)localObject2;
    }
    return (String)localObject1;
  }
  
  void zza(zzbf paramzzbf)
  {
    this.zzbkg = paramzzbf;
  }
  
  void zzfW(String paramString)
  {
    Object localObject;
    if (paramString == null) {
      localObject = this.zzbkf;
    }
    for (this.zzbij = ((String)localObject);; this.zzbij = paramString)
    {
      return;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "Setting CTFE URL path: ";
      localObject = str + paramString;
      zzbg.zzaI((String)localObject);
    }
  }
  
  void zzgl(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    zzbg.zzaI("Setting previous container version: " + paramString);
    this.zzbki = paramString;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */