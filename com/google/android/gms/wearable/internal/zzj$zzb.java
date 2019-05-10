package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.CapabilityApi.CapabilityListener;
import com.google.android.gms.wearable.CapabilityInfo;

class zzj$zzb
  implements CapabilityApi.CapabilityListener
{
  final CapabilityApi.CapabilityListener zzbrQ;
  final String zzbrR;
  
  zzj$zzb(CapabilityApi.CapabilityListener paramCapabilityListener, String paramString)
  {
    this.zzbrQ = paramCapabilityListener;
    this.zzbrR = paramString;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    String str = null;
    if (this == paramObject) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      if (paramObject != null)
      {
        Object localObject1 = getClass();
        Object localObject2 = paramObject.getClass();
        if (localObject1 == localObject2)
        {
          paramObject = (zzb)paramObject;
          localObject1 = this.zzbrQ;
          localObject2 = ((zzb)paramObject).zzbrQ;
          boolean bool2 = localObject1.equals(localObject2);
          if (bool2)
          {
            str = this.zzbrR;
            localObject1 = ((zzb)paramObject).zzbrR;
            bool1 = str.equals(localObject1);
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    int i = this.zzbrQ.hashCode() * 31;
    int j = this.zzbrR.hashCode();
    return i + j;
  }
  
  public void onCapabilityChanged(CapabilityInfo paramCapabilityInfo)
  {
    this.zzbrQ.onCapabilityChanged(paramCapabilityInfo);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */