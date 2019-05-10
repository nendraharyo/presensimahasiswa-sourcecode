package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

class Fragment$2
  extends j
{
  Fragment$2(Fragment paramFragment) {}
  
  public Fragment a(Context paramContext, String paramString, Bundle paramBundle)
  {
    return this.a.mHost.a(paramContext, paramString, paramBundle);
  }
  
  public View a(int paramInt)
  {
    Object localObject = this.a.mView;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Fragment does not have a view");
      throw ((Throwable)localObject);
    }
    return this.a.mView.findViewById(paramInt);
  }
  
  public boolean a()
  {
    View localView = this.a.mView;
    boolean bool;
    if (localView != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localView = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\Fragment$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */