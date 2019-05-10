package android.support.v7.media;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class MediaRouteSelector
{
  public static final MediaRouteSelector EMPTY;
  private static final String KEY_CONTROL_CATEGORIES = "controlCategories";
  private final Bundle mBundle;
  private List mControlCategories;
  
  static
  {
    MediaRouteSelector localMediaRouteSelector = new android/support/v7/media/MediaRouteSelector;
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    localMediaRouteSelector.<init>(localBundle, null);
    EMPTY = localMediaRouteSelector;
  }
  
  private MediaRouteSelector(Bundle paramBundle, List paramList)
  {
    this.mBundle = paramBundle;
    this.mControlCategories = paramList;
  }
  
  private void ensureControlCategories()
  {
    Object localObject = this.mControlCategories;
    if (localObject == null)
    {
      localObject = this.mBundle;
      String str = "controlCategories";
      localObject = ((Bundle)localObject).getStringArrayList(str);
      this.mControlCategories = ((List)localObject);
      localObject = this.mControlCategories;
      if (localObject != null)
      {
        localObject = this.mControlCategories;
        boolean bool = ((List)localObject).isEmpty();
        if (!bool) {}
      }
      else
      {
        localObject = Collections.emptyList();
        this.mControlCategories = ((List)localObject);
      }
    }
  }
  
  public static MediaRouteSelector fromBundle(Bundle paramBundle)
  {
    MediaRouteSelector localMediaRouteSelector;
    if (paramBundle != null)
    {
      localMediaRouteSelector = new android/support/v7/media/MediaRouteSelector;
      localMediaRouteSelector.<init>(paramBundle, null);
    }
    for (;;)
    {
      return localMediaRouteSelector;
      localMediaRouteSelector = null;
    }
  }
  
  public Bundle asBundle()
  {
    return this.mBundle;
  }
  
  public boolean contains(MediaRouteSelector paramMediaRouteSelector)
  {
    List localList1;
    boolean bool;
    if (paramMediaRouteSelector != null)
    {
      ensureControlCategories();
      paramMediaRouteSelector.ensureControlCategories();
      localList1 = this.mControlCategories;
      List localList2 = paramMediaRouteSelector.mControlCategories;
      bool = localList1.containsAll(localList2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList1 = null;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof MediaRouteSelector;
    List localList1;
    if (bool)
    {
      paramObject = (MediaRouteSelector)paramObject;
      ensureControlCategories();
      ((MediaRouteSelector)paramObject).ensureControlCategories();
      localList1 = this.mControlCategories;
      List localList2 = ((MediaRouteSelector)paramObject).mControlCategories;
      bool = localList1.equals(localList2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localList1 = null;
    }
  }
  
  public List getControlCategories()
  {
    ensureControlCategories();
    return this.mControlCategories;
  }
  
  public boolean hasControlCategory(String paramString)
  {
    Object localObject;
    int j;
    boolean bool;
    if (paramString != null)
    {
      ensureControlCategories();
      localObject = this.mControlCategories;
      int i = ((List)localObject).size();
      j = 0;
      if (j < i)
      {
        localObject = (String)this.mControlCategories.get(j);
        bool = ((String)localObject).equals(paramString);
        if (bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      int k = j + 1;
      j = k;
      break;
      k = 0;
      localObject = null;
    }
  }
  
  public int hashCode()
  {
    ensureControlCategories();
    return this.mControlCategories.hashCode();
  }
  
  public boolean isEmpty()
  {
    ensureControlCategories();
    return this.mControlCategories.isEmpty();
  }
  
  public boolean isValid()
  {
    ensureControlCategories();
    List localList = this.mControlCategories;
    boolean bool = localList.contains(null);
    if (bool)
    {
      bool = false;
      localList = null;
    }
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  public boolean matchesControlFilters(List paramList)
  {
    Object localObject;
    int k;
    int m;
    label61:
    boolean bool2;
    if (paramList != null)
    {
      ensureControlCategories();
      localObject = this.mControlCategories;
      int i = ((List)localObject).size();
      if (i != 0)
      {
        int j = paramList.size();
        k = 0;
        if (k < j)
        {
          localObject = (IntentFilter)paramList.get(k);
          if (localObject != null)
          {
            m = 0;
            if (m < i)
            {
              String str = (String)this.mControlCategories.get(m);
              boolean bool1 = ((IntentFilter)localObject).hasCategory(str);
              if (bool1) {
                bool2 = true;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool2;
      int n = m + 1;
      m = n;
      break label61;
      int i1 = k + 1;
      k = i1;
      break;
      i1 = 0;
      localObject = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("MediaRouteSelector{ ");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("controlCategories=");
    String str = Arrays.toString(getControlCategories().toArray());
    localStringBuilder2.append(str);
    localStringBuilder1.append(" }");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteSelector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */