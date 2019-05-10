package android.support.v7.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

final class AppCompatDelegateImplV14$AutoNightModeManager
{
  private BroadcastReceiver mAutoTimeChangeReceiver;
  private IntentFilter mAutoTimeChangeReceiverFilter;
  private boolean mIsNight;
  private TwilightManager mTwilightManager;
  
  AppCompatDelegateImplV14$AutoNightModeManager(AppCompatDelegateImplV14 paramAppCompatDelegateImplV14, TwilightManager paramTwilightManager)
  {
    this.mTwilightManager = paramTwilightManager;
    boolean bool = paramTwilightManager.isNight();
    this.mIsNight = bool;
  }
  
  final void cleanup()
  {
    Object localObject = this.mAutoTimeChangeReceiver;
    if (localObject != null)
    {
      localObject = this.this$0.mContext;
      BroadcastReceiver localBroadcastReceiver = this.mAutoTimeChangeReceiver;
      ((Context)localObject).unregisterReceiver(localBroadcastReceiver);
      localObject = null;
      this.mAutoTimeChangeReceiver = null;
    }
  }
  
  final void dispatchTimeChanged()
  {
    Object localObject = this.mTwilightManager;
    boolean bool1 = ((TwilightManager)localObject).isNight();
    boolean bool2 = this.mIsNight;
    if (bool1 != bool2)
    {
      this.mIsNight = bool1;
      localObject = this.this$0;
      ((AppCompatDelegateImplV14)localObject).applyDayNight();
    }
  }
  
  final int getApplyableNightMode()
  {
    TwilightManager localTwilightManager = this.mTwilightManager;
    boolean bool = localTwilightManager.isNight();
    this.mIsNight = bool;
    bool = this.mIsNight;
    if (bool) {}
    for (int i = 2;; i = 1) {
      return i;
    }
  }
  
  final void setup()
  {
    cleanup();
    Object localObject1 = this.mAutoTimeChangeReceiver;
    if (localObject1 == null)
    {
      localObject1 = new android/support/v7/app/AppCompatDelegateImplV14$AutoNightModeManager$1;
      ((AppCompatDelegateImplV14.AutoNightModeManager.1)localObject1).<init>(this);
      this.mAutoTimeChangeReceiver = ((BroadcastReceiver)localObject1);
    }
    localObject1 = this.mAutoTimeChangeReceiverFilter;
    if (localObject1 == null)
    {
      localObject1 = new android/content/IntentFilter;
      ((IntentFilter)localObject1).<init>();
      this.mAutoTimeChangeReceiverFilter = ((IntentFilter)localObject1);
      this.mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIME_SET");
      this.mAutoTimeChangeReceiverFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
      localObject1 = this.mAutoTimeChangeReceiverFilter;
      localObject2 = "android.intent.action.TIME_TICK";
      ((IntentFilter)localObject1).addAction((String)localObject2);
    }
    localObject1 = this.this$0.mContext;
    Object localObject2 = this.mAutoTimeChangeReceiver;
    IntentFilter localIntentFilter = this.mAutoTimeChangeReceiverFilter;
    ((Context)localObject1).registerReceiver((BroadcastReceiver)localObject2, localIntentFilter);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV14$AutoNightModeManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */