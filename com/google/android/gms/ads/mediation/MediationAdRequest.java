package com.google.android.gms.ads.mediation;

import android.location.Location;
import java.util.Date;
import java.util.Set;

public abstract interface MediationAdRequest
{
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
  public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = 255;
  
  public abstract Date getBirthday();
  
  public abstract int getGender();
  
  public abstract Set getKeywords();
  
  public abstract Location getLocation();
  
  public abstract boolean isDesignedForFamilies();
  
  public abstract boolean isTesting();
  
  public abstract int taggedForChildDirectedTreatment();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\mediation\MediationAdRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */