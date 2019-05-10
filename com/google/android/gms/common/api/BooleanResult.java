package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzx;

public class BooleanResult
  implements Result
{
  private final Status zzUX;
  private final boolean zzagf;
  
  public BooleanResult(Status paramStatus, boolean paramBoolean)
  {
    Status localStatus = (Status)zzx.zzb(paramStatus, "Status must not be null");
    this.zzUX = localStatus;
    this.zzagf = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {}
    for (;;)
    {
      return bool1;
      boolean bool2 = paramObject instanceof BooleanResult;
      if (!bool2)
      {
        bool1 = false;
      }
      else
      {
        paramObject = (BooleanResult)paramObject;
        Status localStatus1 = this.zzUX;
        Status localStatus2 = ((BooleanResult)paramObject).zzUX;
        bool2 = localStatus1.equals(localStatus2);
        if (bool2)
        {
          bool2 = this.zzagf;
          boolean bool3 = ((BooleanResult)paramObject).zzagf;
          if (bool2 == bool3) {}
        }
        else
        {
          bool1 = false;
        }
      }
    }
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public boolean getValue()
  {
    return this.zzagf;
  }
  
  public final int hashCode()
  {
    Status localStatus = this.zzUX;
    int i = (localStatus.hashCode() + 527) * 31;
    int j = this.zzagf;
    if (j != 0) {
      j = 1;
    }
    for (;;)
    {
      return j + i;
      int k = 0;
      localStatus = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\BooleanResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */