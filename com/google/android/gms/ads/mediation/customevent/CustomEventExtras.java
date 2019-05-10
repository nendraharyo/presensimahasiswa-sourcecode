package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

public final class CustomEventExtras
  implements NetworkExtras
{
  private final HashMap zzOv;
  
  public CustomEventExtras()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzOv = localHashMap;
  }
  
  public Object getExtra(String paramString)
  {
    return this.zzOv.get(paramString);
  }
  
  public void setExtra(String paramString, Object paramObject)
  {
    this.zzOv.put(paramString, paramObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\mediation\customevent\CustomEventExtras.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */