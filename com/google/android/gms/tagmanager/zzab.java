package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzab
  extends zzak
{
  private static final String ID = zzad.zzbC.toString();
  
  public zzab()
  {
    super(str, arrayOfString);
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject1 = Build.MANUFACTURER;
    String str = Build.MODEL;
    boolean bool = str.startsWith((String)localObject1);
    if (!bool)
    {
      Object localObject2 = "unknown";
      bool = ((String)localObject1).equals(localObject2);
      if (!bool)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
        localObject2 = " ";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
        str = str;
      }
    }
    return zzdf.zzR(str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */