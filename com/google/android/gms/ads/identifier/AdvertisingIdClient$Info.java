package com.google.android.gms.ads.identifier;

public final class AdvertisingIdClient$Info
{
  private final String zzpc;
  private final boolean zzpd;
  
  public AdvertisingIdClient$Info(String paramString, boolean paramBoolean)
  {
    this.zzpc = paramString;
    this.zzpd = paramBoolean;
  }
  
  public String getId()
  {
    return this.zzpc;
  }
  
  public boolean isLimitAdTrackingEnabled()
  {
    return this.zzpd;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("{");
    String str = this.zzpc;
    localStringBuilder = localStringBuilder.append(str).append("}");
    boolean bool = this.zzpd;
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\identifier\AdvertisingIdClient$Info.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */