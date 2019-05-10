package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;
import java.util.List;

class MediaBrowserCompat$SearchResultReceiver
  extends ResultReceiver
{
  private final String d;
  private final Bundle e;
  private final MediaBrowserCompat.c f;
  
  protected void a(int paramInt, Bundle paramBundle)
  {
    Object localObject1;
    if (paramBundle != null)
    {
      localObject1 = MediaBrowserCompat.class.getClassLoader();
      paramBundle.setClassLoader((ClassLoader)localObject1);
    }
    boolean bool;
    Object localObject2;
    Object localObject3;
    if ((paramInt == 0) && (paramBundle != null))
    {
      localObject1 = "search_results";
      bool = paramBundle.containsKey((String)localObject1);
      if (bool) {}
    }
    else
    {
      localObject1 = this.f;
      localObject2 = this.d;
      localObject3 = this.e;
      ((MediaBrowserCompat.c)localObject1).a((String)localObject2, (Bundle)localObject3);
    }
    for (;;)
    {
      return;
      Object localObject4 = paramBundle.getParcelableArray("search_results");
      bool = false;
      localObject1 = null;
      if (localObject4 != null)
      {
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        int j = localObject4.length;
        bool = false;
        localObject1 = null;
        int k = 0;
        localObject3 = null;
        while (k < j)
        {
          localObject1 = (MediaBrowserCompat.MediaItem)localObject4[k];
          ((List)localObject2).add(localObject1);
          int i = k + 1;
          k = i;
        }
        localObject1 = localObject2;
      }
      localObject2 = this.f;
      localObject3 = this.d;
      localObject4 = this.e;
      ((MediaBrowserCompat.c)localObject2).a((String)localObject3, (Bundle)localObject4, (List)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\media\MediaBrowserCompat$SearchResultReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */