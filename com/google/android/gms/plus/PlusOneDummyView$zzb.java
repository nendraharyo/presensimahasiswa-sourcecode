package com.google.android.gms.plus;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class PlusOneDummyView$zzb
  implements PlusOneDummyView.zzd
{
  private Context mContext;
  
  private PlusOneDummyView$zzb(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public Drawable getDrawable(int paramInt)
  {
    for (;;)
    {
      try
      {
        localObject1 = this.mContext;
        Object localObject3 = "com.google.android.gms";
        int i = 4;
        localObject1 = ((Context)localObject1).createPackageContext((String)localObject3, i);
        localObject3 = ((Context)localObject1).getResources();
        String str1 = "com.google.android.gms";
        switch (paramInt)
        {
        default: 
          localObject1 = "ic_plusone_standard";
          String str2 = "drawable";
          j = ((Resources)localObject3).getIdentifier((String)localObject1, str2, str1);
          localObject1 = ((Resources)localObject3).getDrawable(j);
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject1;
        int j = 0;
        Object localObject2 = null;
        continue;
      }
      return (Drawable)localObject1;
      localObject1 = "ic_plusone_small";
      continue;
      localObject1 = "ic_plusone_medium";
      continue;
      localObject1 = "ic_plusone_tall";
    }
  }
  
  public boolean isValid()
  {
    try
    {
      Context localContext = this.mContext;
      String str = "com.google.android.gms";
      int i = 4;
      localContext = localContext.createPackageContext(str, i);
      localContext.getResources();
      bool = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        boolean bool = false;
        Object localObject = null;
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\PlusOneDummyView$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */