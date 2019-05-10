package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public abstract interface Person$Name
  extends Freezable
{
  public abstract String getFamilyName();
  
  public abstract String getFormatted();
  
  public abstract String getGivenName();
  
  public abstract String getHonorificPrefix();
  
  public abstract String getHonorificSuffix();
  
  public abstract String getMiddleName();
  
  public abstract boolean hasFamilyName();
  
  public abstract boolean hasFormatted();
  
  public abstract boolean hasGivenName();
  
  public abstract boolean hasHonorificPrefix();
  
  public abstract boolean hasHonorificSuffix();
  
  public abstract boolean hasMiddleName();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\model\people\Person$Name.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */