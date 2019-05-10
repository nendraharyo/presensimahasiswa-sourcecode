package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;

public class zzk
{
  private final String zzuM;
  
  public zzk(String paramString)
  {
    this.zzuM = paramString;
  }
  
  public boolean zza(String paramString, int paramInt, Intent paramIntent)
  {
    boolean bool1 = false;
    if ((paramString == null) || (paramIntent == null)) {}
    for (;;)
    {
      return bool1;
      String str1 = zzr.zzbM().zze(paramIntent);
      String str2 = zzr.zzbM().zzf(paramIntent);
      if ((str1 != null) && (str2 != null))
      {
        String str3 = zzr.zzbM().zzaq(str1);
        boolean bool2 = paramString.equals(str3);
        if (!bool2)
        {
          str1 = "Developer payload not match.";
          zzin.zzaK(str1);
        }
        else
        {
          str3 = this.zzuM;
          if (str3 != null)
          {
            str3 = this.zzuM;
            boolean bool3 = zzl.zzc(str3, str1, str2);
            if (!bool3)
            {
              str1 = "Fail to verify signature.";
              zzin.zzaK(str1);
              continue;
            }
          }
          bool1 = true;
        }
      }
    }
  }
  
  public String zzfZ()
  {
    return zzr.zzbC().zzhs();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */