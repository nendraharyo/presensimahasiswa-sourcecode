package io.fabric.sdk.android.services.common;

class AdvertisingInfo
{
  public final String advertisingId;
  public final boolean limitAdTrackingEnabled;
  
  AdvertisingInfo(String paramString, boolean paramBoolean)
  {
    this.advertisingId = paramString;
    this.limitAdTrackingEnabled = paramBoolean;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    Object localObject1;
    boolean bool2;
    do
    {
      for (;;)
      {
        return bool1;
        if (paramObject != null)
        {
          localObject1 = getClass();
          localObject2 = paramObject.getClass();
          if (localObject1 == localObject2) {}
        }
        else
        {
          bool1 = false;
          continue;
        }
        paramObject = (AdvertisingInfo)paramObject;
        bool2 = this.limitAdTrackingEnabled;
        boolean bool3 = ((AdvertisingInfo)paramObject).limitAdTrackingEnabled;
        if (bool2 == bool3) {
          break;
        }
        bool1 = false;
      }
      localObject1 = this.advertisingId;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.advertisingId;
      Object localObject2 = ((AdvertisingInfo)paramObject).advertisingId;
      bool2 = ((String)localObject1).equals(localObject2);
    } while (bool2);
    for (;;)
    {
      bool1 = false;
      break;
      localObject1 = ((AdvertisingInfo)paramObject).advertisingId;
      if (localObject1 == null) {
        break;
      }
    }
  }
  
  public int hashCode()
  {
    int i = 0;
    String str = this.advertisingId;
    int j;
    if (str != null)
    {
      str = this.advertisingId;
      j = str.hashCode();
    }
    for (;;)
    {
      j *= 31;
      boolean bool = this.limitAdTrackingEnabled;
      if (bool) {
        i = 1;
      }
      return j + i;
      j = 0;
      str = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\AdvertisingInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */