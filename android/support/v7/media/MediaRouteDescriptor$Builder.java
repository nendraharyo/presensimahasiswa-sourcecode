package android.support.v7.media;

import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class MediaRouteDescriptor$Builder
{
  private final Bundle mBundle;
  private ArrayList mControlFilters;
  
  public MediaRouteDescriptor$Builder(MediaRouteDescriptor paramMediaRouteDescriptor)
  {
    if (paramMediaRouteDescriptor == null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("descriptor must not be null");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = new android/os/Bundle;
    Object localObject2 = MediaRouteDescriptor.access$000(paramMediaRouteDescriptor);
    ((Bundle)localObject1).<init>((Bundle)localObject2);
    this.mBundle = ((Bundle)localObject1);
    MediaRouteDescriptor.access$100(paramMediaRouteDescriptor);
    localObject1 = MediaRouteDescriptor.access$200(paramMediaRouteDescriptor);
    boolean bool = ((List)localObject1).isEmpty();
    if (!bool)
    {
      localObject1 = new java/util/ArrayList;
      localObject2 = MediaRouteDescriptor.access$200(paramMediaRouteDescriptor);
      ((ArrayList)localObject1).<init>((Collection)localObject2);
      this.mControlFilters = ((ArrayList)localObject1);
    }
  }
  
  public MediaRouteDescriptor$Builder(String paramString1, String paramString2)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    this.mBundle = localBundle;
    setId(paramString1);
    setName(paramString2);
  }
  
  public Builder addControlFilter(IntentFilter paramIntentFilter)
  {
    if (paramIntentFilter == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("filter must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.mControlFilters;
    if (localObject == null)
    {
      localObject = new java/util/ArrayList;
      ((ArrayList)localObject).<init>();
      this.mControlFilters = ((ArrayList)localObject);
    }
    localObject = this.mControlFilters;
    boolean bool = ((ArrayList)localObject).contains(paramIntentFilter);
    if (!bool)
    {
      localObject = this.mControlFilters;
      ((ArrayList)localObject).add(paramIntentFilter);
    }
    return this;
  }
  
  public Builder addControlFilters(Collection paramCollection)
  {
    Object localObject;
    if (paramCollection == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("filters must not be null");
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
        localObject = (IntentFilter)localIterator.next();
        addControlFilter((IntentFilter)localObject);
      }
    }
    return this;
  }
  
  public MediaRouteDescriptor build()
  {
    Object localObject1 = this.mControlFilters;
    if (localObject1 != null)
    {
      localObject1 = this.mBundle;
      localObject2 = "controlFilters";
      localArrayList = this.mControlFilters;
      ((Bundle)localObject1).putParcelableArrayList((String)localObject2, localArrayList);
    }
    localObject1 = new android/support/v7/media/MediaRouteDescriptor;
    Object localObject2 = this.mBundle;
    ArrayList localArrayList = this.mControlFilters;
    ((MediaRouteDescriptor)localObject1).<init>((Bundle)localObject2, localArrayList, null);
    return (MediaRouteDescriptor)localObject1;
  }
  
  public Builder setCanDisconnect(boolean paramBoolean)
  {
    this.mBundle.putBoolean("canDisconnect", paramBoolean);
    return this;
  }
  
  public Builder setConnecting(boolean paramBoolean)
  {
    this.mBundle.putBoolean("connecting", paramBoolean);
    return this;
  }
  
  public Builder setDescription(String paramString)
  {
    this.mBundle.putString("status", paramString);
    return this;
  }
  
  public Builder setEnabled(boolean paramBoolean)
  {
    this.mBundle.putBoolean("enabled", paramBoolean);
    return this;
  }
  
  public Builder setExtras(Bundle paramBundle)
  {
    this.mBundle.putBundle("extras", paramBundle);
    return this;
  }
  
  public Builder setId(String paramString)
  {
    this.mBundle.putString("id", paramString);
    return this;
  }
  
  public Builder setName(String paramString)
  {
    this.mBundle.putString("name", paramString);
    return this;
  }
  
  public Builder setPlaybackStream(int paramInt)
  {
    this.mBundle.putInt("playbackStream", paramInt);
    return this;
  }
  
  public Builder setPlaybackType(int paramInt)
  {
    this.mBundle.putInt("playbackType", paramInt);
    return this;
  }
  
  public Builder setPresentationDisplayId(int paramInt)
  {
    this.mBundle.putInt("presentationDisplayId", paramInt);
    return this;
  }
  
  public Builder setSettingsActivity(IntentSender paramIntentSender)
  {
    this.mBundle.putParcelable("settingsIntent", paramIntentSender);
    return this;
  }
  
  public Builder setVolume(int paramInt)
  {
    this.mBundle.putInt("volume", paramInt);
    return this;
  }
  
  public Builder setVolumeHandling(int paramInt)
  {
    this.mBundle.putInt("volumeHandling", paramInt);
    return this;
  }
  
  public Builder setVolumeMax(int paramInt)
  {
    this.mBundle.putInt("volumeMax", paramInt);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteDescriptor$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */