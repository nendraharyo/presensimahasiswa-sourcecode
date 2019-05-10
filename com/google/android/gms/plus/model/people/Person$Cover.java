package com.google.android.gms.plus.model.people;

import com.google.android.gms.common.data.Freezable;

public abstract interface Person$Cover
  extends Freezable
{
  public abstract Person.Cover.CoverInfo getCoverInfo();
  
  public abstract Person.Cover.CoverPhoto getCoverPhoto();
  
  public abstract int getLayout();
  
  public abstract boolean hasCoverInfo();
  
  public abstract boolean hasCoverPhoto();
  
  public abstract boolean hasLayout();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\model\people\Person$Cover.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */