package com.google.ads.mediation;

import android.location.Location;
import com.google.ads.AdRequest.Gender;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class MediationAdRequest
{
  private final Date zzbf;
  private final AdRequest.Gender zzbg;
  private final Set zzbh;
  private final boolean zzbi;
  private final Location zzbj;
  
  public MediationAdRequest(Date paramDate, AdRequest.Gender paramGender, Set paramSet, boolean paramBoolean, Location paramLocation)
  {
    this.zzbf = paramDate;
    this.zzbg = paramGender;
    this.zzbh = paramSet;
    this.zzbi = paramBoolean;
    this.zzbj = paramLocation;
  }
  
  public Integer getAgeInYears()
  {
    int i = 5;
    int j = 1;
    int k = 2;
    Object localObject = this.zzbf;
    int m;
    if (localObject != null)
    {
      Calendar localCalendar1 = Calendar.getInstance();
      Calendar localCalendar2 = Calendar.getInstance();
      localObject = this.zzbf;
      localCalendar1.setTime((Date)localObject);
      m = localCalendar2.get(j);
      j = localCalendar1.get(j);
      m -= j;
      localObject = Integer.valueOf(m);
      j = localCalendar2.get(k);
      int n = localCalendar1.get(k);
      if (j >= n)
      {
        j = localCalendar2.get(k);
        n = localCalendar1.get(k);
        if (j == n)
        {
          int i1 = localCalendar2.get(i);
          int i2 = localCalendar1.get(i);
          if (i1 >= i2) {}
        }
      }
      else
      {
        m = ((Integer)localObject).intValue() + -1;
      }
    }
    for (localObject = Integer.valueOf(m);; localObject = null)
    {
      return (Integer)localObject;
      m = 0;
    }
  }
  
  public Date getBirthday()
  {
    return this.zzbf;
  }
  
  public AdRequest.Gender getGender()
  {
    return this.zzbg;
  }
  
  public Set getKeywords()
  {
    return this.zzbh;
  }
  
  public Location getLocation()
  {
    return this.zzbj;
  }
  
  public boolean isTesting()
  {
    return this.zzbi;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\MediationAdRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */