package android.support.v4.a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

public abstract class f
  extends BroadcastReceiver
{
  private static final String EXTRA_WAKE_LOCK_ID = "android.support.content.wakelockid";
  private static int mNextId = 1;
  private static final SparseArray sActiveWakeLocks;
  
  static
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    sActiveWakeLocks = localSparseArray;
  }
  
  public static boolean completeWakefulIntent(Intent paramIntent)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    Object localObject3 = "android.support.content.wakelockid";
    int i = paramIntent.getIntExtra((String)localObject3, 0);
    if (i == 0) {}
    for (;;)
    {
      return bool2;
      synchronized (sActiveWakeLocks)
      {
        localObject1 = sActiveWakeLocks;
        localObject1 = ((SparseArray)localObject1).get(i);
        localObject1 = (PowerManager.WakeLock)localObject1;
        if (localObject1 != null)
        {
          ((PowerManager.WakeLock)localObject1).release();
          localObject1 = sActiveWakeLocks;
          ((SparseArray)localObject1).remove(i);
          bool2 = bool1;
          continue;
        }
        localObject1 = "WakefulBroadcastReceiv.";
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        String str = "No active wake lock id #";
        localStringBuilder = localStringBuilder.append(str);
        localObject3 = localStringBuilder.append(i);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.w((String)localObject1, (String)localObject3);
        bool2 = bool1;
      }
    }
  }
  
  public static ComponentName startWakefulService(Context paramContext, Intent paramIntent)
  {
    synchronized (sActiveWakeLocks)
    {
      int i = mNextId;
      int j = mNextId + 1;
      mNextId = j;
      j = mNextId;
      if (j <= 0)
      {
        j = 1;
        mNextId = j;
      }
      Object localObject1 = "android.support.content.wakelockid";
      paramIntent.putExtra((String)localObject1, i);
      ComponentName localComponentName = paramContext.startService(paramIntent);
      if (localComponentName == null)
      {
        j = 0;
        localObject1 = null;
        return (ComponentName)localObject1;
      }
      localObject1 = "power";
      localObject1 = paramContext.getSystemService((String)localObject1);
      localObject1 = (PowerManager)localObject1;
      int k = 1;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str = "wake:";
      localObject3 = ((StringBuilder)localObject3).append(str);
      str = localComponentName.flattenToShortString();
      localObject3 = ((StringBuilder)localObject3).append(str);
      localObject3 = ((StringBuilder)localObject3).toString();
      localObject1 = ((PowerManager)localObject1).newWakeLock(k, (String)localObject3);
      k = 0;
      SparseArray localSparseArray2 = null;
      ((PowerManager.WakeLock)localObject1).setReferenceCounted(false);
      long l = 60000L;
      ((PowerManager.WakeLock)localObject1).acquire(l);
      localSparseArray2 = sActiveWakeLocks;
      localSparseArray2.put(i, localObject1);
      localObject1 = localComponentName;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\a\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */