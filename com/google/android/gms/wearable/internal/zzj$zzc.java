package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityInfo;
import java.util.Set;

public class zzj$zzc
  implements CapabilityInfo
{
  private final String mName;
  private final Set zzbrS;
  
  public zzj$zzc(CapabilityInfo paramCapabilityInfo)
  {
    this(str, localSet);
  }
  
  public zzj$zzc(String paramString, Set paramSet)
  {
    this.mName = paramString;
    this.zzbrS = paramSet;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public Set getNodes()
  {
    return this.zzbrS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */