package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;

public class zzjt$zza
  extends MutableContextWrapper
{
  private Activity zzMM;
  private Context zzOg;
  private Context zzsa;
  
  public zzjt$zza(Context paramContext)
  {
    super(paramContext);
    setBaseContext(paramContext);
  }
  
  public Object getSystemService(String paramString)
  {
    return this.zzOg.getSystemService(paramString);
  }
  
  public void setBaseContext(Context paramContext)
  {
    Object localObject = paramContext.getApplicationContext();
    this.zzsa = ((Context)localObject);
    boolean bool = paramContext instanceof Activity;
    if (bool) {
      localObject = paramContext;
    }
    for (localObject = (Activity)paramContext;; localObject = null)
    {
      this.zzMM = ((Activity)localObject);
      this.zzOg = ((Context)paramContext);
      localObject = this.zzsa;
      super.setBaseContext((Context)localObject);
      return;
      bool = false;
    }
  }
  
  public void startActivity(Intent paramIntent)
  {
    Object localObject = this.zzMM;
    if (localObject != null)
    {
      boolean bool = zzne.isAtLeastL();
      if (!bool)
      {
        localObject = this.zzMM;
        ((Activity)localObject).startActivity(paramIntent);
      }
    }
    for (;;)
    {
      return;
      int i = 268435456;
      paramIntent.setFlags(i);
      localObject = this.zzsa;
      ((Context)localObject).startActivity(paramIntent);
    }
  }
  
  public Activity zzhP()
  {
    return this.zzMM;
  }
  
  public Context zzhQ()
  {
    return this.zzOg;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjt$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */