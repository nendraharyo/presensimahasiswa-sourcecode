package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class zzab
  extends zzk
{
  private final zzm.zzb zzaG;
  
  public zzab(int paramInt, String paramString, zzm.zzb paramzzb, zzm.zza paramzza)
  {
    super(paramInt, paramString, paramzza);
    this.zzaG = paramzzb;
  }
  
  public zzab(String paramString, zzm.zzb paramzzb, zzm.zza paramzza)
  {
    this(0, paramString, paramzzb, paramzza);
  }
  
  protected zzm zza(zzi paramzzi)
  {
    try
    {
      str1 = new java/lang/String;
      localObject1 = paramzzi.data;
      Object localObject2 = paramzzi.zzA;
      localObject2 = zzx.zza((Map)localObject2);
      str1.<init>((byte[])localObject1, (String)localObject2);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        String str1;
        String str2 = new java/lang/String;
        Object localObject1 = paramzzi.data;
        str2.<init>((byte[])localObject1);
      }
    }
    localObject1 = zzx.zzb(paramzzi);
    return zzm.zza(str1, (zzb.zza)localObject1);
  }
  
  protected void zzi(String paramString)
  {
    this.zzaG.zzb(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */