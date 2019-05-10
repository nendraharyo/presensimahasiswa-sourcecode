package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.Freezable;

public abstract interface Moment
  extends Freezable
{
  public abstract String getId();
  
  public abstract ItemScope getResult();
  
  public abstract String getStartDate();
  
  public abstract ItemScope getTarget();
  
  public abstract String getType();
  
  public abstract boolean hasId();
  
  public abstract boolean hasResult();
  
  public abstract boolean hasStartDate();
  
  public abstract boolean hasTarget();
  
  public abstract boolean hasType();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\model\moments\Moment.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */