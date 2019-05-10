package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class MediaRouteProviderDescriptor
{
  private static final String KEY_ROUTES = "routes";
  private final Bundle mBundle;
  private List mRoutes;
  
  private MediaRouteProviderDescriptor(Bundle paramBundle, List paramList)
  {
    this.mBundle = paramBundle;
    this.mRoutes = paramList;
  }
  
  private void ensureRoutes()
  {
    Object localObject = this.mRoutes;
    String str;
    ArrayList localArrayList;
    boolean bool;
    if (localObject == null)
    {
      localObject = this.mBundle;
      str = "routes";
      localArrayList = ((Bundle)localObject).getParcelableArrayList(str);
      if (localArrayList != null)
      {
        bool = localArrayList.isEmpty();
        if (!bool) {
          break label48;
        }
      }
      localObject = Collections.emptyList();
      this.mRoutes = ((List)localObject);
    }
    for (;;)
    {
      return;
      label48:
      int j = localArrayList.size();
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>(j);
      this.mRoutes = ((List)localObject);
      bool = false;
      localObject = null;
      int k = 0;
      str = null;
      while (k < j)
      {
        List localList = this.mRoutes;
        localObject = MediaRouteDescriptor.fromBundle((Bundle)localArrayList.get(k));
        localList.add(localObject);
        int i = k + 1;
        k = i;
      }
    }
  }
  
  public static MediaRouteProviderDescriptor fromBundle(Bundle paramBundle)
  {
    MediaRouteProviderDescriptor localMediaRouteProviderDescriptor;
    if (paramBundle != null)
    {
      localMediaRouteProviderDescriptor = new android/support/v7/media/MediaRouteProviderDescriptor;
      localMediaRouteProviderDescriptor.<init>(paramBundle, null);
    }
    for (;;)
    {
      return localMediaRouteProviderDescriptor;
      localMediaRouteProviderDescriptor = null;
    }
  }
  
  public Bundle asBundle()
  {
    return this.mBundle;
  }
  
  public List getRoutes()
  {
    ensureRoutes();
    return this.mRoutes;
  }
  
  public boolean isValid()
  {
    ensureRoutes();
    Object localObject = this.mRoutes;
    int i = ((List)localObject).size();
    int j = 0;
    boolean bool;
    if (j < i)
    {
      localObject = (MediaRouteDescriptor)this.mRoutes.get(j);
      if (localObject != null)
      {
        bool = ((MediaRouteDescriptor)localObject).isValid();
        if (bool) {}
      }
      else
      {
        bool = false;
        localObject = null;
      }
    }
    for (;;)
    {
      return bool;
      int k = j + 1;
      j = k;
      break;
      k = 1;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("MediaRouteProviderDescriptor{ ");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("routes=");
    String str = Arrays.toString(getRoutes().toArray());
    localStringBuilder2.append(str);
    localStringBuilder2 = localStringBuilder1.append(", isValid=");
    boolean bool = isValid();
    localStringBuilder2.append(bool);
    localStringBuilder1.append(" }");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteProviderDescriptor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */