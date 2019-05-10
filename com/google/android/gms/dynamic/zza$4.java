package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

class zza$4
  implements zza.zza
{
  zza$4(zza paramzza, FrameLayout paramFrameLayout, LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {}
  
  public int getState()
  {
    return 2;
  }
  
  public void zzb(LifecycleDelegate paramLifecycleDelegate)
  {
    this.zzavE.removeAllViews();
    FrameLayout localFrameLayout = this.zzavE;
    Object localObject = zza.zzb(this.zzavB);
    LayoutInflater localLayoutInflater = this.zzavF;
    ViewGroup localViewGroup = this.zzavG;
    Bundle localBundle = this.zzavD;
    localObject = ((LifecycleDelegate)localObject).onCreateView(localLayoutInflater, localViewGroup, localBundle);
    localFrameLayout.addView((View)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\dynamic\zza$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */