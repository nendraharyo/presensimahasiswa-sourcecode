package com.google.android.gms.tagmanager;

import java.util.Map;

class Container$zzb
  implements zzt.zza
{
  private Container$zzb(Container paramContainer) {}
  
  public Object zzc(String paramString, Map paramMap)
  {
    Container.FunctionCallTagCallback localFunctionCallTagCallback = this.zzbhT.zzfQ(paramString);
    if (localFunctionCallTagCallback != null) {
      localFunctionCallTagCallback.execute(paramString, paramMap);
    }
    return zzdf.zzHE();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\Container$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */