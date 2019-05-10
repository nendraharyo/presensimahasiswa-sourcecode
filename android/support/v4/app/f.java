package android.support.v4.app;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

abstract class f
  extends e
{
  boolean mStartedActivityFromFragment;
  
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    boolean bool = this.mStartedActivityFromFragment;
    if (!bool)
    {
      int i = -1;
      if (paramInt != i) {
        checkForValidRequestCode(paramInt);
      }
    }
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    boolean bool = this.mStartedIntentSenderFromFragment;
    if (!bool)
    {
      int i = -1;
      if (paramInt1 != i) {
        checkForValidRequestCode(paramInt1);
      }
    }
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */