package com.google.android.gms.internal;

import android.location.Location;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import java.util.Date;
import java.util.Set;

public final class zzfd
  implements MediationAdRequest
{
  private final int zzCH;
  private final Date zzbf;
  private final Set zzbh;
  private final boolean zzbi;
  private final Location zzbj;
  private final int zztT;
  private final boolean zzuf;
  
  public zzfd(Date paramDate, int paramInt1, Set paramSet, Location paramLocation, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    this.zzbf = paramDate;
    this.zztT = paramInt1;
    this.zzbh = paramSet;
    this.zzbj = paramLocation;
    this.zzbi = paramBoolean1;
    this.zzCH = paramInt2;
    this.zzuf = paramBoolean2;
  }
  
  public Date getBirthday()
  {
    return this.zzbf;
  }
  
  public int getGender()
  {
    return this.zztT;
  }
  
  public Set getKeywords()
  {
    return this.zzbh;
  }
  
  public Location getLocation()
  {
    return this.zzbj;
  }
  
  public boolean isDesignedForFamilies()
  {
    return this.zzuf;
  }
  
  public boolean isTesting()
  {
    return this.zzbi;
  }
  
  public int taggedForChildDirectedTreatment()
  {
    return this.zzCH;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzfd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */