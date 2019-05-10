package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;

public abstract interface Cast$ApplicationConnectionResult
  extends Result
{
  public abstract ApplicationMetadata getApplicationMetadata();
  
  public abstract String getApplicationStatus();
  
  public abstract String getSessionId();
  
  public abstract boolean getWasLaunched();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$ApplicationConnectionResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */