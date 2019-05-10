package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MediaRouteSelector$Builder
{
  private ArrayList mControlCategories;
  
  public MediaRouteSelector$Builder() {}
  
  public MediaRouteSelector$Builder(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("selector must not be null");
      throw ((Throwable)localObject);
    }
    MediaRouteSelector.access$000(paramMediaRouteSelector);
    Object localObject = MediaRouteSelector.access$100(paramMediaRouteSelector);
    boolean bool = ((List)localObject).isEmpty();
    if (!bool)
    {
      localObject = new java/util/ArrayList;
      List localList = MediaRouteSelector.access$100(paramMediaRouteSelector);
      ((ArrayList)localObject).<init>(localList);
      this.mControlCategories = ((ArrayList)localObject);
    }
  }
  
  public Builder addControlCategories(Collection paramCollection)
  {
    Object localObject;
    if (paramCollection == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("categories must not be null");
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
        localObject = (String)localIterator.next();
        addControlCategory((String)localObject);
      }
    }
    return this;
  }
  
  public Builder addControlCategory(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("category must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.mControlCategories;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.mControlCategories = ((ArrayList)localObject);
    }
    localObject = this.mControlCategories;
    boolean bool = ((ArrayList)localObject).contains(paramString);
    if (!bool)
    {
      localObject = this.mControlCategories;
      ((ArrayList)localObject).add(paramString);
    }
    return this;
  }
  
  public Builder addSelector(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("selector must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = paramMediaRouteSelector.getControlCategories();
    addControlCategories((Collection)localObject);
    return this;
  }
  
  public MediaRouteSelector build()
  {
    Object localObject = this.mControlCategories;
    if (localObject == null) {
      localObject = MediaRouteSelector.EMPTY;
    }
    for (;;)
    {
      return (MediaRouteSelector)localObject;
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      ArrayList localArrayList = this.mControlCategories;
      localBundle.putStringArrayList("controlCategories", localArrayList);
      localObject = new android/support/v7/media/MediaRouteSelector;
      localArrayList = this.mControlCategories;
      ((MediaRouteSelector)localObject).<init>(localBundle, localArrayList, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteSelector$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */