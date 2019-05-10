package com.google.android.gms.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

class zzcb
{
  private static zzcb zzbjQ;
  private volatile String zzbhM;
  private volatile zzcb.zza zzbjR;
  private volatile String zzbjS;
  private volatile String zzbjT;
  
  zzcb()
  {
    clear();
  }
  
  static zzcb zzGU()
  {
    synchronized (zzcb.class)
    {
      zzcb localzzcb = zzbjQ;
      if (localzzcb == null)
      {
        localzzcb = new com/google/android/gms/tagmanager/zzcb;
        localzzcb.<init>();
        zzbjQ = localzzcb;
      }
      localzzcb = zzbjQ;
      return localzzcb;
    }
  }
  
  private String zzgk(String paramString)
  {
    return paramString.split("&")[0].split("=")[1];
  }
  
  private String zzq(Uri paramUri)
  {
    return paramUri.getQuery().replace("&gtm_debug=x", "");
  }
  
  void clear()
  {
    zzcb.zza localzza = zzcb.zza.zzbjU;
    this.zzbjR = localzza;
    this.zzbjS = null;
    this.zzbhM = null;
    this.zzbjT = null;
  }
  
  String getContainerId()
  {
    return this.zzbhM;
  }
  
  zzcb.zza zzGV()
  {
    return this.zzbjR;
  }
  
  String zzGW()
  {
    return this.zzbjS;
  }
  
  boolean zzp(Uri paramUri)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    String str;
    boolean bool3;
    try
    {
      localObject2 = paramUri.toString();
      str = "UTF-8";
      localObject2 = URLDecoder.decode((String)localObject2, str);
      str = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$";
      bool3 = ((String)localObject2).matches(str);
      if (!bool3) {
        break label272;
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str = "Container preview url: ";
      localObject1 = ((StringBuilder)localObject1).append(str);
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      zzbg.v((String)localObject1);
      localObject1 = ".*?&gtm_debug=x$";
      bool2 = ((String)localObject2).matches((String)localObject1);
      if (!bool2) {
        break label251;
      }
      localObject1 = zzcb.zza.zzbjW;
      this.zzbjR = ((zzcb.zza)localObject1);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        bool1 = false;
        localObject3 = null;
        continue;
        localObject1 = zzcb.zza.zzbjV;
        this.zzbjR = ((zzcb.zza)localObject1);
      }
    }
    finally {}
    localObject1 = zzq(paramUri);
    this.zzbjT = ((String)localObject1);
    localObject1 = this.zzbjR;
    Object localObject2 = zzcb.zza.zzbjV;
    if (localObject1 != localObject2)
    {
      localObject1 = this.zzbjR;
      localObject2 = zzcb.zza.zzbjW;
      if (localObject1 != localObject2) {}
    }
    else
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = "/r?";
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject2 = this.zzbjT;
      localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
      localObject1 = ((StringBuilder)localObject1).toString();
      this.zzbjS = ((String)localObject1);
    }
    localObject1 = this.zzbjT;
    localObject1 = zzgk((String)localObject1);
    this.zzbhM = ((String)localObject1);
    for (;;)
    {
      return bool1;
      Object localObject3;
      label251:
      label272:
      str = "^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$";
      bool3 = ((String)localObject2).matches(str);
      Object localObject5;
      if (bool3)
      {
        localObject2 = paramUri.getQuery();
        localObject2 = zzgk((String)localObject2);
        str = this.zzbhM;
        boolean bool4 = ((String)localObject2).equals(str);
        if (bool4)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = "Exit preview mode for container: ";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = this.zzbhM;
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          localObject1 = ((StringBuilder)localObject1).toString();
          zzbg.v((String)localObject1);
          localObject1 = zzcb.zza.zzbjU;
          this.zzbjR = ((zzcb.zza)localObject1);
          bool2 = false;
          localObject1 = null;
          this.zzbjS = null;
        }
        else
        {
          bool1 = false;
          localObject5 = null;
        }
      }
      else
      {
        localObject5 = new java/lang/StringBuilder;
        ((StringBuilder)localObject5).<init>();
        str = "Invalid preview uri: ";
        localObject5 = ((StringBuilder)localObject5).append(str);
        localObject5 = ((StringBuilder)localObject5).append((String)localObject2);
        localObject5 = ((StringBuilder)localObject5).toString();
        zzbg.zzaK((String)localObject5);
        bool1 = false;
        localObject5 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */