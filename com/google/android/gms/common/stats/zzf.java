package com.google.android.gms.common.stats;

public abstract class zzf
{
  public abstract int getEventType();
  
  public abstract long getTimeMillis();
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    long l = getTimeMillis();
    localStringBuilder = localStringBuilder.append(l).append("\t");
    int i = getEventType();
    localStringBuilder = localStringBuilder.append(i).append("\t");
    l = zzrL();
    localStringBuilder = localStringBuilder.append(l);
    String str = zzrO();
    return str;
  }
  
  public abstract long zzrL();
  
  public abstract String zzrO();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */