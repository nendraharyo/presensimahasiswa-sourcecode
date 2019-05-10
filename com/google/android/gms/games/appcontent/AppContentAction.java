package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import java.util.List;

public abstract interface AppContentAction
  extends Parcelable, Freezable
{
  public abstract Bundle getExtras();
  
  public abstract String getId();
  
  public abstract String getType();
  
  public abstract AppContentAnnotation zzvO();
  
  public abstract List zzvP();
  
  public abstract String zzvQ();
  
  public abstract String zzvR();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentAction.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */