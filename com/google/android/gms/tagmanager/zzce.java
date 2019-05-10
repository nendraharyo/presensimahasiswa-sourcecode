package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class zzce
  extends zzak
{
  private static final String ID = zzad.zzcf.toString();
  private static final String zzbka = zzae.zzdV.toString();
  private static final String zzbkb = zzae.zzdW.toString();
  private static final String zzbkc = zzae.zzfO.toString();
  private static final String zzbkd = zzae.zzfI.toString();
  
  public zzce()
  {
    super(str1, arrayOfString);
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject1 = zzbka;
    localObject1 = (zzag.zza)paramMap.get(localObject1);
    Object localObject2 = zzbkb;
    localObject2 = (zzag.zza)paramMap.get(localObject2);
    Object localObject3;
    if (localObject1 != null)
    {
      localObject3 = zzdf.zzHF();
      if ((localObject1 != localObject3) && (localObject2 != null))
      {
        localObject3 = zzdf.zzHF();
        if (localObject2 != localObject3) {
          break label66;
        }
      }
    }
    localObject1 = zzdf.zzHF();
    for (;;)
    {
      return (zzag.zza)localObject1;
      label66:
      int i = 64;
      localObject3 = zzbkc;
      localObject3 = zzdf.zzk((zzag.zza)paramMap.get(localObject3));
      boolean bool2 = ((Boolean)localObject3).booleanValue();
      int k;
      if (bool2)
      {
        k = 66;
        i = k;
      }
      int m = 1;
      float f = Float.MIN_VALUE;
      localObject3 = zzbkd;
      localObject3 = (zzag.zza)paramMap.get(localObject3);
      Object localObject4;
      if (localObject3 != null)
      {
        localObject3 = zzdf.zzi((zzag.zza)localObject3);
        localObject4 = zzdf.zzHA();
        if (localObject3 == localObject4)
        {
          localObject1 = zzdf.zzHF();
          continue;
        }
        k = ((Long)localObject3).intValue();
        if (k < 0) {
          localObject1 = zzdf.zzHF();
        }
      }
      else
      {
        k = m;
      }
      try
      {
        localObject4 = zzdf.zzg((zzag.zza)localObject1);
        localObject2 = zzdf.zzg((zzag.zza)localObject2);
        localObject1 = null;
        localObject2 = Pattern.compile((String)localObject2, i);
        localObject2 = ((Pattern)localObject2).matcher((CharSequence)localObject4);
        boolean bool1 = ((Matcher)localObject2).find();
        if (bool1)
        {
          int j = ((Matcher)localObject2).groupCount();
          if (j >= k) {
            localObject1 = ((Matcher)localObject2).group(k);
          }
        }
        if (localObject1 == null) {
          localObject1 = zzdf.zzHF();
        } else {
          localObject1 = zzdf.zzR(localObject1);
        }
      }
      catch (PatternSyntaxException localPatternSyntaxException)
      {
        zzag.zza localzza = zzdf.zzHF();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzce.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */