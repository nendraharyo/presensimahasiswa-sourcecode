package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;

public abstract interface zzc
  extends IInterface
{
  public abstract Bundle getArguments();
  
  public abstract int getId();
  
  public abstract boolean getRetainInstance();
  
  public abstract String getTag();
  
  public abstract int getTargetRequestCode();
  
  public abstract boolean getUserVisibleHint();
  
  public abstract zzd getView();
  
  public abstract boolean isAdded();
  
  public abstract boolean isDetached();
  
  public abstract boolean isHidden();
  
  public abstract boolean isInLayout();
  
  public abstract boolean isRemoving();
  
  public abstract boolean isResumed();
  
  public abstract boolean isVisible();
  
  public abstract void setHasOptionsMenu(boolean paramBoolean);
  
  public abstract void setMenuVisibility(boolean paramBoolean);
  
  public abstract void setRetainInstance(boolean paramBoolean);
  
  public abstract void setUserVisibleHint(boolean paramBoolean);
  
  public abstract void startActivity(Intent paramIntent);
  
  public abstract void startActivityForResult(Intent paramIntent, int paramInt);
  
  public abstract void zzn(zzd paramzzd);
  
  public abstract void zzo(zzd paramzzd);
  
  public abstract zzd zztV();
  
  public abstract zzc zztW();
  
  public abstract zzd zztX();
  
  public abstract zzc zztY();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */