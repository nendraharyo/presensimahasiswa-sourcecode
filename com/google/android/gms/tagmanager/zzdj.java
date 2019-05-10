package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzag.zza;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

class zzdj
{
  private static zzbw zza(zzbw paramzzbw)
  {
    try
    {
      Object localObject1 = paramzzbw.getObject();
      localObject1 = (zzag.zza)localObject1;
      localObject1 = zzdf.zzg((zzag.zza)localObject1);
      localObject2 = zzgA((String)localObject1);
      localObject1 = new com/google/android/gms/tagmanager/zzbw;
      localObject2 = zzdf.zzR(localObject2);
      boolean bool = paramzzbw.zzGP();
      ((zzbw)localObject1).<init>(localObject2, bool);
      paramzzbw = (zzbw)localObject1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        Object localObject2 = "Escape URI: unsupported encoding";
        zzbg.zzb((String)localObject2, localUnsupportedEncodingException);
      }
    }
    return paramzzbw;
  }
  
  private static zzbw zza(zzbw paramzzbw, int paramInt)
  {
    Object localObject = (zzag.zza)paramzzbw.getObject();
    boolean bool = zzn((zzag.zza)localObject);
    if (!bool)
    {
      localObject = "Escaping can only be applied to strings.";
      zzbg.e((String)localObject);
    }
    for (;;)
    {
      return paramzzbw;
      switch (paramInt)
      {
      default: 
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = "Unsupported Value Escaping: ";
        localObject = str + paramInt;
        zzbg.e((String)localObject);
        break;
      case 12: 
        paramzzbw = zza(paramzzbw);
      }
    }
  }
  
  static zzbw zza(zzbw paramzzbw, int... paramVarArgs)
  {
    int i = paramVarArgs.length;
    int j = 0;
    while (j < i)
    {
      int k = paramVarArgs[j];
      paramzzbw = zza(paramzzbw, k);
      j += 1;
    }
    return paramzzbw;
  }
  
  static String zzgA(String paramString)
  {
    return URLEncoder.encode(paramString, "UTF-8").replaceAll("\\+", "%20");
  }
  
  private static boolean zzn(zzag.zza paramzza)
  {
    return zzdf.zzl(paramzza) instanceof String;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzdj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */