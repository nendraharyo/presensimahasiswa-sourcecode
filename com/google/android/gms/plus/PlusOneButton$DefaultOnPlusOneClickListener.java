package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class PlusOneButton$DefaultOnPlusOneClickListener
  implements View.OnClickListener, PlusOneButton.OnPlusOneClickListener
{
  private final PlusOneButton.OnPlusOneClickListener zzbee;
  
  public PlusOneButton$DefaultOnPlusOneClickListener(PlusOneButton paramPlusOneButton, PlusOneButton.OnPlusOneClickListener paramOnPlusOneClickListener)
  {
    this.zzbee = paramOnPlusOneClickListener;
  }
  
  public void onClick(View paramView)
  {
    Intent localIntent = (Intent)PlusOneButton.zza(this.zzbef).getTag();
    PlusOneButton.OnPlusOneClickListener localOnPlusOneClickListener = this.zzbee;
    if (localOnPlusOneClickListener != null)
    {
      localOnPlusOneClickListener = this.zzbee;
      localOnPlusOneClickListener.onPlusOneClick(localIntent);
    }
    for (;;)
    {
      return;
      onPlusOneClick(localIntent);
    }
  }
  
  public void onPlusOneClick(Intent paramIntent)
  {
    Object localObject = this.zzbef.getContext();
    boolean bool = localObject instanceof Activity;
    if ((bool) && (paramIntent != null))
    {
      localObject = (Activity)localObject;
      PlusOneButton localPlusOneButton = this.zzbef;
      int i = PlusOneButton.zzb(localPlusOneButton);
      ((Activity)localObject).startActivityForResult(paramIntent, i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\PlusOneButton$DefaultOnPlusOneClickListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */