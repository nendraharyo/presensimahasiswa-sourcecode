package android.support.v7.media;

import android.content.IntentSender;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class MediaRouteDescriptor
{
  private static final String KEY_CAN_DISCONNECT = "canDisconnect";
  private static final String KEY_CONNECTING = "connecting";
  private static final String KEY_CONTROL_FILTERS = "controlFilters";
  private static final String KEY_DESCRIPTION = "status";
  private static final String KEY_ENABLED = "enabled";
  private static final String KEY_EXTRAS = "extras";
  private static final String KEY_ID = "id";
  private static final String KEY_NAME = "name";
  private static final String KEY_PLAYBACK_STREAM = "playbackStream";
  private static final String KEY_PLAYBACK_TYPE = "playbackType";
  private static final String KEY_PRESENTATION_DISPLAY_ID = "presentationDisplayId";
  private static final String KEY_SETTINGS_INTENT = "settingsIntent";
  private static final String KEY_VOLUME = "volume";
  private static final String KEY_VOLUME_HANDLING = "volumeHandling";
  private static final String KEY_VOLUME_MAX = "volumeMax";
  private final Bundle mBundle;
  private List mControlFilters;
  
  private MediaRouteDescriptor(Bundle paramBundle, List paramList)
  {
    this.mBundle = paramBundle;
    this.mControlFilters = paramList;
  }
  
  private void ensureControlFilters()
  {
    Object localObject = this.mControlFilters;
    if (localObject == null)
    {
      localObject = this.mBundle;
      String str = "controlFilters";
      localObject = ((Bundle)localObject).getParcelableArrayList(str);
      this.mControlFilters = ((List)localObject);
      localObject = this.mControlFilters;
      if (localObject == null)
      {
        localObject = Collections.emptyList();
        this.mControlFilters = ((List)localObject);
      }
    }
  }
  
  public static MediaRouteDescriptor fromBundle(Bundle paramBundle)
  {
    MediaRouteDescriptor localMediaRouteDescriptor;
    if (paramBundle != null)
    {
      localMediaRouteDescriptor = new android/support/v7/media/MediaRouteDescriptor;
      localMediaRouteDescriptor.<init>(paramBundle, null);
    }
    for (;;)
    {
      return localMediaRouteDescriptor;
      localMediaRouteDescriptor = null;
    }
  }
  
  public Bundle asBundle()
  {
    return this.mBundle;
  }
  
  public boolean canDisconnectAndKeepPlaying()
  {
    return this.mBundle.getBoolean("canDisconnect", false);
  }
  
  public List getControlFilters()
  {
    ensureControlFilters();
    return this.mControlFilters;
  }
  
  public String getDescription()
  {
    return this.mBundle.getString("status");
  }
  
  public Bundle getExtras()
  {
    return this.mBundle.getBundle("extras");
  }
  
  public String getId()
  {
    return this.mBundle.getString("id");
  }
  
  public String getName()
  {
    return this.mBundle.getString("name");
  }
  
  public int getPlaybackStream()
  {
    return this.mBundle.getInt("playbackStream", -1);
  }
  
  public int getPlaybackType()
  {
    return this.mBundle.getInt("playbackType", 1);
  }
  
  public int getPresentationDisplayId()
  {
    return this.mBundle.getInt("presentationDisplayId", -1);
  }
  
  public IntentSender getSettingsActivity()
  {
    return (IntentSender)this.mBundle.getParcelable("settingsIntent");
  }
  
  public int getVolume()
  {
    return this.mBundle.getInt("volume");
  }
  
  public int getVolumeHandling()
  {
    return this.mBundle.getInt("volumeHandling", 0);
  }
  
  public int getVolumeMax()
  {
    return this.mBundle.getInt("volumeMax");
  }
  
  public boolean isConnecting()
  {
    return this.mBundle.getBoolean("connecting", false);
  }
  
  public boolean isEnabled()
  {
    return this.mBundle.getBoolean("enabled", true);
  }
  
  public boolean isValid()
  {
    ensureControlFilters();
    Object localObject = getId();
    boolean bool = TextUtils.isEmpty((CharSequence)localObject);
    if (!bool)
    {
      localObject = getName();
      bool = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool)
      {
        localObject = this.mControlFilters;
        bool = ((List)localObject).contains(null);
        if (!bool) {
          break label55;
        }
      }
    }
    bool = false;
    localObject = null;
    for (;;)
    {
      return bool;
      label55:
      bool = true;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("MediaRouteDescriptor{ ");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("id=");
    Object localObject = getId();
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", name=");
    localObject = getName();
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", description=");
    localObject = getDescription();
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", isEnabled=");
    boolean bool1 = isEnabled();
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", isConnecting=");
    bool1 = isConnecting();
    localStringBuilder2.append(bool1);
    localStringBuilder2 = localStringBuilder1.append(", controlFilters=");
    localObject = Arrays.toString(getControlFilters().toArray());
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append(", playbackType=");
    int i = getPlaybackType();
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(", playbackStream=");
    i = getPlaybackStream();
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(", volume=");
    i = getVolume();
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(", volumeMax=");
    i = getVolumeMax();
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(", volumeHandling=");
    i = getVolumeHandling();
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(", presentationDisplayId=");
    i = getPresentationDisplayId();
    localStringBuilder2.append(i);
    localStringBuilder2 = localStringBuilder1.append(", extras=");
    localObject = getExtras();
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append(", isValid=");
    boolean bool2 = isValid();
    localStringBuilder2.append(bool2);
    localStringBuilder1.append(" }");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteDescriptor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */