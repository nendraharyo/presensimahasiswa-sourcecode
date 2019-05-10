package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.SafetyNetApi.SafeBrowsingResult;

class zzre$zzd
  implements SafetyNetApi.SafeBrowsingResult
{
  private Status zzUX;
  private final SafeBrowsingData zzbgF;
  private String zzbgv;
  
  public zzre$zzd(Status paramStatus, SafeBrowsingData paramSafeBrowsingData)
  {
    this.zzUX = paramStatus;
    this.zzbgF = paramSafeBrowsingData;
    boolean bool = false;
    this.zzbgv = null;
    Object localObject = this.zzbgF;
    if (localObject != null)
    {
      localObject = this.zzbgF.getMetadata();
      this.zzbgv = ((String)localObject);
    }
    for (;;)
    {
      return;
      localObject = this.zzUX;
      bool = ((Status)localObject).isSuccess();
      if (bool)
      {
        localObject = new com/google/android/gms/common/api/Status;
        int i = 8;
        ((Status)localObject).<init>(i);
        this.zzUX = ((Status)localObject);
      }
    }
  }
  
  public String getMetadata()
  {
    return this.zzbgv;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzre$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */