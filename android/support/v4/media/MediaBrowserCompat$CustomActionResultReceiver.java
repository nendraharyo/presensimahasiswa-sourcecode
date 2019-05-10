package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import android.util.Log;

class MediaBrowserCompat$CustomActionResultReceiver
  extends ResultReceiver
{
  private final String d;
  private final Bundle e;
  private final MediaBrowserCompat.a f;
  
  protected void a(int paramInt, Bundle paramBundle)
  {
    Object localObject1 = this.f;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      Object localObject2;
      Object localObject3;
      switch (paramInt)
      {
      default: 
        localObject1 = "MediaBrowserCompat";
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("Unknown result code: ").append(paramInt).append(" (extras=");
        localObject3 = this.e;
        localObject2 = ((StringBuilder)localObject2).append(localObject3).append(", resultData=").append(paramBundle);
        localObject3 = ")";
        localObject2 = (String)localObject3;
        Log.w((String)localObject1, (String)localObject2);
        break;
      case 1: 
        localObject1 = this.f;
        localObject2 = this.d;
        localObject3 = this.e;
        ((MediaBrowserCompat.a)localObject1).a((String)localObject2, (Bundle)localObject3, paramBundle);
        break;
      case 0: 
        localObject1 = this.f;
        localObject2 = this.d;
        localObject3 = this.e;
        ((MediaBrowserCompat.a)localObject1).b((String)localObject2, (Bundle)localObject3, paramBundle);
        break;
      case -1: 
        localObject1 = this.f;
        localObject2 = this.d;
        localObject3 = this.e;
        ((MediaBrowserCompat.a)localObject1).c((String)localObject2, (Bundle)localObject3, paramBundle);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\MediaBrowserCompat$CustomActionResultReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */