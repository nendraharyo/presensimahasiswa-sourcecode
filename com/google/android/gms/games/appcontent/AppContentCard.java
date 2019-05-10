package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public abstract interface AppContentCard
  extends Parcelable, Freezable
{
  public abstract List getActions();
  
  public abstract String getDescription();
  
  public abstract Bundle getExtras();
  
  public abstract String getId();
  
  public abstract String getTitle();
  
  public abstract String getType();
  
  public abstract List zzvP();
  
  public abstract String zzvQ();
  
  public abstract List zzwa();
  
  public abstract int zzwb();
  
  public abstract String zzwc();
  
  public abstract int zzwd();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentCard.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */