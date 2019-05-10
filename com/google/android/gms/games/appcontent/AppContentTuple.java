package com.google.android.gms.games.appcontent;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface AppContentTuple
  extends Parcelable, Freezable
{
  public abstract String getName();
  
  public abstract String getValue();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentTuple.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */