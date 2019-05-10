package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;

public class zzo
  extends FrameLayout
  implements View.OnClickListener
{
  private final ImageButton zzEW;
  private final zzs zzEX;
  
  public zzo(Context paramContext, int paramInt, zzs paramzzs)
  {
    super(paramContext);
    this.zzEX = paramzzs;
    setOnClickListener(this);
    ImageButton localImageButton1 = new android/widget/ImageButton;
    localImageButton1.<init>(paramContext);
    this.zzEW = localImageButton1;
    this.zzEW.setImageResource(17301527);
    this.zzEW.setBackgroundColor(0);
    this.zzEW.setOnClickListener(this);
    this.zzEW.setPadding(0, 0, 0, 0);
    this.zzEW.setContentDescription("Interstitial close button");
    int i = zzn.zzcS().zzb(paramContext, paramInt);
    ImageButton localImageButton2 = this.zzEW;
    FrameLayout.LayoutParams localLayoutParams = new android/widget/FrameLayout$LayoutParams;
    localLayoutParams.<init>(i, i, 17);
    addView(localImageButton2, localLayoutParams);
  }
  
  public void onClick(View paramView)
  {
    zzs localzzs = this.zzEX;
    if (localzzs != null)
    {
      localzzs = this.zzEX;
      localzzs.zzfm();
    }
  }
  
  public void zza(boolean paramBoolean1, boolean paramBoolean2)
  {
    ImageButton localImageButton;
    int i;
    if (paramBoolean2) {
      if (paramBoolean1)
      {
        localImageButton = this.zzEW;
        i = 4;
        localImageButton.setVisibility(i);
      }
    }
    for (;;)
    {
      return;
      localImageButton = this.zzEW;
      i = 8;
      localImageButton.setVisibility(i);
      continue;
      localImageButton = this.zzEW;
      i = 0;
      localImageButton.setVisibility(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */