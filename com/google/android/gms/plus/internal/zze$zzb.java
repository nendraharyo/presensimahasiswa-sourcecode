package com.google.android.gms.plus.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.People.LoadPeopleResult;
import com.google.android.gms.plus.model.people.PersonBuffer;

final class zze$zzb
  implements People.LoadPeopleResult
{
  private final Status zzUX;
  private final String zzbek;
  private final PersonBuffer zzben;
  
  public zze$zzb(Status paramStatus, DataHolder paramDataHolder, String paramString)
  {
    this.zzUX = paramStatus;
    this.zzbek = paramString;
    PersonBuffer localPersonBuffer;
    if (paramDataHolder != null)
    {
      localPersonBuffer = new com/google/android/gms/plus/model/people/PersonBuffer;
      localPersonBuffer.<init>(paramDataHolder);
    }
    for (;;)
    {
      this.zzben = localPersonBuffer;
      return;
      localPersonBuffer = null;
    }
  }
  
  public String getNextPageToken()
  {
    return this.zzbek;
  }
  
  public PersonBuffer getPersonBuffer()
  {
    return this.zzben;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void release()
  {
    PersonBuffer localPersonBuffer = this.zzben;
    if (localPersonBuffer != null)
    {
      localPersonBuffer = this.zzben;
      localPersonBuffer.release();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\zze$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */