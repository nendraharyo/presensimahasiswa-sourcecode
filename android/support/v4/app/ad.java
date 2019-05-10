package android.support.v4.app;

import android.app.Activity;
import android.arch.lifecycle.c;
import android.arch.lifecycle.c.b;
import android.arch.lifecycle.e;
import android.arch.lifecycle.f;
import android.os.Bundle;

public class ad
  extends Activity
  implements e
{
  private android.support.v4.h.m mExtraDataMap;
  private f mLifecycleRegistry;
  
  public ad()
  {
    Object localObject = new android/support/v4/h/m;
    ((android.support.v4.h.m)localObject).<init>();
    this.mExtraDataMap = ((android.support.v4.h.m)localObject);
    localObject = new android/arch/lifecycle/f;
    ((f)localObject).<init>(this);
    this.mLifecycleRegistry = ((f)localObject);
  }
  
  public ad.a getExtraData(Class paramClass)
  {
    return (ad.a)this.mExtraDataMap.get(paramClass);
  }
  
  public c getLifecycle()
  {
    return this.mLifecycleRegistry;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    android.arch.lifecycle.m.a(this);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    f localf = this.mLifecycleRegistry;
    c.b localb = c.b.c;
    localf.a(localb);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void putExtraData(ad.a parama)
  {
    android.support.v4.h.m localm = this.mExtraDataMap;
    Class localClass = parama.getClass();
    localm.put(localClass, parama);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\ad.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */