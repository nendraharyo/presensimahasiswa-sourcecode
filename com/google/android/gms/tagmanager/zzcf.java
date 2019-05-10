package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzae;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

class zzcf
  extends zzcz
{
  private static final String ID = zzad.zzcy.toString();
  private static final String zzbkc = zzae.zzfO.toString();
  
  public zzcf()
  {
    super(str);
  }
  
  protected boolean zza(String paramString1, String paramString2, Map paramMap)
  {
    int i = 64;
    Object localObject1 = zzbkc;
    localObject1 = zzdf.zzk((zzag.zza)paramMap.get(localObject1));
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (bool1) {}
    boolean bool2;
    for (int j = 66;; bool2 = i)
    {
      try
      {
        localObject1 = Pattern.compile(paramString2, j);
        localObject1 = ((Pattern)localObject1).matcher(paramString1);
        bool2 = ((Matcher)localObject1).find();
      }
      catch (PatternSyntaxException localPatternSyntaxException)
      {
        for (;;)
        {
          bool2 = false;
          Object localObject2 = null;
        }
      }
      return bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzcf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */