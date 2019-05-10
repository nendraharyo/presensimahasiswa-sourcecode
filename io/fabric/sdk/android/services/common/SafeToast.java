package io.fabric.sdk.android.services.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Toast;

public class SafeToast
  extends Toast
{
  public SafeToast(Context paramContext)
  {
    super(paramContext);
  }
  
  public static Toast makeText(Context paramContext, int paramInt1, int paramInt2)
  {
    CharSequence localCharSequence = paramContext.getResources().getText(paramInt1);
    return makeText(paramContext, localCharSequence, paramInt2);
  }
  
  public static Toast makeText(Context paramContext, CharSequence paramCharSequence, int paramInt)
  {
    Toast localToast = Toast.makeText(paramContext, paramCharSequence, paramInt);
    SafeToast localSafeToast = new io/fabric/sdk/android/services/common/SafeToast;
    localSafeToast.<init>(paramContext);
    View localView = localToast.getView();
    localSafeToast.setView(localView);
    int i = localToast.getDuration();
    localSafeToast.setDuration(i);
    return localSafeToast;
  }
  
  public void show()
  {
    Object localObject1 = Looper.myLooper();
    Object localObject2 = Looper.getMainLooper();
    if (localObject1 == localObject2) {
      super.show();
    }
    for (;;)
    {
      return;
      localObject1 = new android/os/Handler;
      localObject2 = Looper.getMainLooper();
      ((Handler)localObject1).<init>((Looper)localObject2);
      localObject2 = new io/fabric/sdk/android/services/common/SafeToast$1;
      ((SafeToast.1)localObject2).<init>(this);
      ((Handler)localObject1).post((Runnable)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\SafeToast.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */