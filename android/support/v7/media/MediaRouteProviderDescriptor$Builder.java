package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MediaRouteProviderDescriptor$Builder
{
  private final Bundle mBundle;
  private ArrayList mRoutes;
  
  public MediaRouteProviderDescriptor$Builder()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.mBundle = localBundle;
  }
  
  public MediaRouteProviderDescriptor$Builder(MediaRouteProviderDescriptor paramMediaRouteProviderDescriptor)
  {
    if (paramMediaRouteProviderDescriptor == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("descriptor must not be null");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new android/os/Bundle;
    Object localObject2 = MediaRouteProviderDescriptor.access$000(paramMediaRouteProviderDescriptor);
    ((Bundle)localObject1).<init>((Bundle)localObject2);
    this.mBundle = ((Bundle)localObject1);
    MediaRouteProviderDescriptor.access$100(paramMediaRouteProviderDescriptor);
    localObject1 = MediaRouteProviderDescriptor.access$200(paramMediaRouteProviderDescriptor);
    boolean bool = ((List)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = new java/util/ArrayList;
      localObject2 = MediaRouteProviderDescriptor.access$200(paramMediaRouteProviderDescriptor);
      ((ArrayList)localObject1).<init>((Collection)localObject2);
      this.mRoutes = ((ArrayList)localObject1);
    }
  }
  
  public Builder addRoute(MediaRouteDescriptor paramMediaRouteDescriptor)
  {
    if (paramMediaRouteDescriptor == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("route must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.mRoutes;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.mRoutes = ((ArrayList)localObject);
    }
    boolean bool;
    do
    {
      this.mRoutes.add(paramMediaRouteDescriptor);
      return this;
      localObject = this.mRoutes;
      bool = ((ArrayList)localObject).contains(paramMediaRouteDescriptor);
    } while (!bool);
    localObject = new java/lang/IllegalArgumentException;
    ((IllegalArgumentException)localObject).<init>("route descriptor already added");
    throw ((Throwable)localObject);
  }
  
  public Builder addRoutes(Collection paramCollection)
  {
    Object localObject;
    if (paramCollection == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("routes must not be null");
      throw ((Throwable)localObject);
    }
    boolean bool = paramCollection.isEmpty();
    if (!bool)
    {
      Iterator localIterator = paramCollection.iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (MediaRouteDescriptor)localIterator.next();
        addRoute((MediaRouteDescriptor)localObject);
      }
    }
    return this;
  }
  
  public MediaRouteProviderDescriptor build()
  {
    Object localObject1 = this.mRoutes;
    if (localObject1 != null)
    {
      int i = this.mRoutes.size();
      ArrayList localArrayList1 = new java/util/ArrayList;
      localArrayList1.<init>(i);
      int j = 0;
      localObject1 = null;
      int k = 0;
      localObject2 = null;
      while (k < i)
      {
        localObject1 = ((MediaRouteDescriptor)this.mRoutes.get(k)).asBundle();
        localArrayList1.add(localObject1);
        j = k + 1;
        k = j;
      }
      localObject1 = this.mBundle;
      localObject2 = "routes";
      ((Bundle)localObject1).putParcelableArrayList((String)localObject2, localArrayList1);
    }
    localObject1 = new android/support/v7/media/MediaRouteProviderDescriptor;
    Object localObject2 = this.mBundle;
    ArrayList localArrayList2 = this.mRoutes;
    ((MediaRouteProviderDescriptor)localObject1).<init>((Bundle)localObject2, localArrayList2, null);
    return (MediaRouteProviderDescriptor)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteProviderDescriptor$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */