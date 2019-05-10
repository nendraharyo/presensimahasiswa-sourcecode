package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Locale;
import java.util.Map;

public class zzbb
  extends zzak
{
  private static final String ID = zzad.zzbM.toString();
  
  public zzbb()
  {
    super(str, arrayOfString);
  }
  
  public boolean zzFW()
  {
    return false;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    Object localObject = Locale.getDefault();
    if (localObject == null) {
      localObject = zzdf.zzHF();
    }
    for (;;)
    {
      return (zzag.zza)localObject;
      localObject = ((Locale)localObject).getLanguage();
      if (localObject == null) {
        localObject = zzdf.zzHF();
      } else {
        localObject = zzdf.zzR(((String)localObject).toLowerCase());
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zzbb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */