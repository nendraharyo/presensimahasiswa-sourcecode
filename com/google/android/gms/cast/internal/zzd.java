package com.google.android.gms.cast.internal;

import android.text.TextUtils;

public abstract class zzd
{
  protected final zzl zzadu;
  private final String zzadv;
  private zzn zzadw;
  
  protected zzd(String paramString1, String paramString2, String paramString3)
  {
    zzf.zzch(paramString1);
    this.zzadv = paramString1;
    zzl localzzl = new com/google/android/gms/cast/internal/zzl;
    localzzl.<init>(paramString2);
    this.zzadu = localzzl;
    setSessionLabel(paramString3);
  }
  
  public final String getNamespace()
  {
    return this.zzadv;
  }
  
  public void setSessionLabel(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    if (!bool)
    {
      zzl localzzl = this.zzadu;
      localzzl.zzcn(paramString);
    }
  }
  
  public final void zza(zzn paramzzn)
  {
    this.zzadw = paramzzn;
    zzn localzzn = this.zzadw;
    if (localzzn == null) {
      zzof();
    }
  }
  
  protected final void zza(String paramString1, long paramLong, String paramString2)
  {
    zzl localzzl = this.zzadu;
    Object localObject = new Object[2];
    localObject[0] = paramString1;
    localObject[1] = paramString2;
    localzzl.zza("Sending text message: %s to: %s", (Object[])localObject);
    zzn localzzn = this.zzadw;
    localObject = this.zzadv;
    localzzn.zza((String)localObject, paramString1, paramLong, paramString2);
  }
  
  public void zzb(long paramLong, int paramInt) {}
  
  public void zzcf(String paramString) {}
  
  public void zzof() {}
  
  protected final long zzog()
  {
    return this.zzadw.zznQ();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */