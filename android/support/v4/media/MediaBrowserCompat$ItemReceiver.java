package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;

class MediaBrowserCompat$ItemReceiver
  extends ResultReceiver
{
  private final String d;
  private final MediaBrowserCompat.b e;
  
  protected void a(int paramInt, Bundle paramBundle)
  {
    Object localObject1;
    if (paramBundle != null)
    {
      localObject1 = MediaBrowserCompat.class.getClassLoader();
      paramBundle.setClassLoader((ClassLoader)localObject1);
    }
    Object localObject2;
    if ((paramInt == 0) && (paramBundle != null))
    {
      localObject1 = "media_item";
      boolean bool1 = paramBundle.containsKey((String)localObject1);
      if (bool1) {}
    }
    else
    {
      localObject1 = this.e;
      localObject2 = this.d;
      ((MediaBrowserCompat.b)localObject1).a((String)localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = paramBundle.getParcelable("media_item");
      if (localObject1 != null)
      {
        boolean bool2 = localObject1 instanceof MediaBrowserCompat.MediaItem;
        if (!bool2) {}
      }
      else
      {
        localObject2 = this.e;
        localObject1 = (MediaBrowserCompat.MediaItem)localObject1;
        ((MediaBrowserCompat.b)localObject2).a((MediaBrowserCompat.MediaItem)localObject1);
        continue;
      }
      localObject1 = this.e;
      localObject2 = this.d;
      ((MediaBrowserCompat.b)localObject1).a((String)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\MediaBrowserCompat$ItemReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */