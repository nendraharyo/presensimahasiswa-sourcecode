package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class PlusOneDummyView$zzc
  implements PlusOneDummyView.zzd
{
  private Context mContext;
  
  private PlusOneDummyView$zzc(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public Drawable getDrawable(int paramInt)
  {
    String str1;
    switch (paramInt)
    {
    default: 
      str1 = "ic_plusone_standard_off_client";
    }
    for (;;)
    {
      Resources localResources = this.mContext.getResources();
      String str2 = this.mContext.getPackageName();
      int i = localResources.getIdentifier(str1, "drawable", str2);
      return this.mContext.getResources().getDrawable(i);
      str1 = "ic_plusone_small_off_client";
      continue;
      str1 = "ic_plusone_medium_off_client";
      continue;
      str1 = "ic_plusone_tall_off_client";
    }
  }
  
  public boolean isValid()
  {
    Resources localResources1 = this.mContext.getResources();
    Object localObject = this.mContext.getPackageName();
    int i = localResources1.getIdentifier("ic_plusone_small_off_client", "drawable", (String)localObject);
    Resources localResources2 = this.mContext.getResources();
    String str1 = this.mContext.getPackageName();
    int k = localResources2.getIdentifier("ic_plusone_medium_off_client", "drawable", str1);
    Resources localResources3 = this.mContext.getResources();
    String str2 = this.mContext.getPackageName();
    int m = localResources3.getIdentifier("ic_plusone_tall_off_client", "drawable", str2);
    localObject = this.mContext.getResources();
    str1 = "ic_plusone_standard_off_client";
    str2 = "drawable";
    String str3 = this.mContext.getPackageName();
    int n = ((Resources)localObject).getIdentifier(str1, str2, str3);
    if ((i != 0) && (k != 0) && (m != 0) && (n != 0)) {
      i = 1;
    }
    for (;;)
    {
      return i;
      int j = 0;
      localResources1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\PlusOneDummyView$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */