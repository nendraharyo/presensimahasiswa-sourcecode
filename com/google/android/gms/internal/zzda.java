package com.google.android.gms.internal;

import java.util.Map;

public final class zzda
  implements zzdf
{
  private final zzdb zzyW;
  
  public zzda(zzdb paramzzdb)
  {
    this.zzyW = paramzzdb;
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    String str1 = (String)paramMap.get("name");
    if (str1 == null)
    {
      str1 = "App event with no name parameter.";
      zzin.zzaK(str1);
    }
    for (;;)
    {
      return;
      zzdb localzzdb = this.zzyW;
      String str2 = (String)paramMap.get("info");
      localzzdb.onAppEvent(str1, str2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzda.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */