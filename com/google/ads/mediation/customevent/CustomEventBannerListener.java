package com.google.ads.mediation.customevent;

import android.view.View;

public abstract interface CustomEventBannerListener
  extends CustomEventListener
{
  public abstract void onClick();
  
  public abstract void onReceivedAd(View paramView);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\ads\mediation\customevent\CustomEventBannerListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */