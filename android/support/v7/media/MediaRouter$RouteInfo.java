package android.support.v7.media;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class MediaRouter$RouteInfo
{
  static final int CHANGE_GENERAL = 1;
  static final int CHANGE_PRESENTATION_DISPLAY = 4;
  static final int CHANGE_VOLUME = 2;
  public static final int PLAYBACK_TYPE_LOCAL = 0;
  public static final int PLAYBACK_TYPE_REMOTE = 1;
  public static final int PLAYBACK_VOLUME_FIXED = 0;
  public static final int PLAYBACK_VOLUME_VARIABLE = 1;
  private boolean mCanDisconnect;
  private boolean mConnecting;
  private final ArrayList mControlFilters;
  private String mDescription;
  private MediaRouteDescriptor mDescriptor;
  private final String mDescriptorId;
  private boolean mEnabled;
  private Bundle mExtras;
  private String mName;
  private int mPlaybackStream;
  private int mPlaybackType;
  private Display mPresentationDisplay;
  private int mPresentationDisplayId;
  private final MediaRouter.ProviderInfo mProvider;
  private IntentSender mSettingsIntent;
  private final String mUniqueId;
  private int mVolume;
  private int mVolumeHandling;
  private int mVolumeMax;
  
  MediaRouter$RouteInfo(MediaRouter.ProviderInfo paramProviderInfo, String paramString1, String paramString2)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mControlFilters = localArrayList;
    this.mPresentationDisplayId = -1;
    this.mProvider = paramProviderInfo;
    this.mDescriptorId = paramString1;
    this.mUniqueId = paramString2;
  }
  
  public boolean canDisconnect()
  {
    return this.mCanDisconnect;
  }
  
  public List getControlFilters()
  {
    return this.mControlFilters;
  }
  
  public String getDescription()
  {
    return this.mDescription;
  }
  
  String getDescriptorId()
  {
    return this.mDescriptorId;
  }
  
  public Bundle getExtras()
  {
    return this.mExtras;
  }
  
  public String getId()
  {
    return this.mUniqueId;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public int getPlaybackStream()
  {
    return this.mPlaybackStream;
  }
  
  public int getPlaybackType()
  {
    return this.mPlaybackType;
  }
  
  public Display getPresentationDisplay()
  {
    MediaRouter.checkCallingThread();
    int i = this.mPresentationDisplayId;
    if (i >= 0)
    {
      Object localObject = this.mPresentationDisplay;
      if (localObject == null)
      {
        localObject = MediaRouter.sGlobal;
        int j = this.mPresentationDisplayId;
        localObject = ((MediaRouter.GlobalMediaRouter)localObject).getDisplay(j);
        this.mPresentationDisplay = ((Display)localObject);
      }
    }
    return this.mPresentationDisplay;
  }
  
  public MediaRouter.ProviderInfo getProvider()
  {
    return this.mProvider;
  }
  
  MediaRouteProvider getProviderInstance()
  {
    return this.mProvider.getProviderInstance();
  }
  
  public IntentSender getSettingsIntent()
  {
    return this.mSettingsIntent;
  }
  
  public int getVolume()
  {
    return this.mVolume;
  }
  
  public int getVolumeHandling()
  {
    return this.mVolumeHandling;
  }
  
  public int getVolumeMax()
  {
    return this.mVolumeMax;
  }
  
  public boolean isConnecting()
  {
    return this.mConnecting;
  }
  
  public boolean isDefault()
  {
    MediaRouter.checkCallingThread();
    RouteInfo localRouteInfo = MediaRouter.sGlobal.getDefaultRoute();
    boolean bool;
    if (localRouteInfo == this) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRouteInfo = null;
    }
  }
  
  public boolean isEnabled()
  {
    return this.mEnabled;
  }
  
  public boolean isSelected()
  {
    MediaRouter.checkCallingThread();
    RouteInfo localRouteInfo = MediaRouter.sGlobal.getSelectedRoute();
    boolean bool;
    if (localRouteInfo == this) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRouteInfo = null;
    }
  }
  
  public boolean matchesSelector(MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("selector must not be null");
      throw ((Throwable)localObject);
    }
    MediaRouter.checkCallingThread();
    Object localObject = this.mControlFilters;
    return paramMediaRouteSelector.matchesControlFilters((List)localObject);
  }
  
  public void requestSetVolume(int paramInt)
  {
    MediaRouter.checkCallingThread();
    MediaRouter.GlobalMediaRouter localGlobalMediaRouter = MediaRouter.sGlobal;
    int i = this.mVolumeMax;
    int j = Math.max(0, paramInt);
    i = Math.min(i, j);
    localGlobalMediaRouter.requestSetVolume(this, i);
  }
  
  public void requestUpdateVolume(int paramInt)
  {
    
    if (paramInt != 0)
    {
      MediaRouter.GlobalMediaRouter localGlobalMediaRouter = MediaRouter.sGlobal;
      localGlobalMediaRouter.requestUpdateVolume(this, paramInt);
    }
  }
  
  public void select()
  {
    MediaRouter.checkCallingThread();
    MediaRouter.sGlobal.selectRoute(this);
  }
  
  public void sendControlRequest(Intent paramIntent, MediaRouter.ControlRequestCallback paramControlRequestCallback)
  {
    if (paramIntent == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("intent must not be null");
      throw localIllegalArgumentException;
    }
    MediaRouter.checkCallingThread();
    MediaRouter.sGlobal.sendControlRequest(this, paramIntent, paramControlRequestCallback);
  }
  
  public boolean supportsControlAction(String paramString1, String paramString2)
  {
    if (paramString1 == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("category must not be null");
      throw ((Throwable)localObject);
    }
    if (paramString2 == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("action must not be null");
      throw ((Throwable)localObject);
    }
    MediaRouter.checkCallingThread();
    Object localObject = this.mControlFilters;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    boolean bool2;
    if (j < i)
    {
      localObject = (IntentFilter)this.mControlFilters.get(j);
      boolean bool1 = ((IntentFilter)localObject).hasCategory(paramString1);
      if (bool1)
      {
        bool2 = ((IntentFilter)localObject).hasAction(paramString2);
        if (bool2) {
          bool2 = true;
        }
      }
    }
    for (;;)
    {
      return bool2;
      int k = j + 1;
      j = k;
      break;
      k = 0;
      localObject = null;
    }
  }
  
  public boolean supportsControlCategory(String paramString)
  {
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("category must not be null");
      throw ((Throwable)localObject);
    }
    MediaRouter.checkCallingThread();
    Object localObject = this.mControlFilters;
    int i = ((ArrayList)localObject).size();
    int j = 0;
    boolean bool;
    if (j < i)
    {
      localObject = (IntentFilter)this.mControlFilters.get(j);
      bool = ((IntentFilter)localObject).hasCategory(paramString);
      if (bool) {
        bool = true;
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
  
  public boolean supportsControlRequest(Intent paramIntent)
  {
    int i = 1;
    if (paramIntent == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("intent must not be null");
      throw ((Throwable)localObject);
    }
    MediaRouter.checkCallingThread();
    ContentResolver localContentResolver = MediaRouter.sGlobal.getContentResolver();
    Object localObject = this.mControlFilters;
    int j = ((ArrayList)localObject).size();
    int k = 0;
    int m;
    if (k < j)
    {
      localObject = (IntentFilter)this.mControlFilters.get(k);
      String str = "MediaRouter";
      m = ((IntentFilter)localObject).match(localContentResolver, paramIntent, i, str);
      if (m >= 0) {
        m = i;
      }
    }
    for (;;)
    {
      return m;
      int n = k + 1;
      k = n;
      break;
      n = 0;
      localObject = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("MediaRouter.RouteInfo{ uniqueId=");
    Object localObject = this.mUniqueId;
    localStringBuilder = localStringBuilder.append((String)localObject).append(", name=");
    localObject = this.mName;
    localStringBuilder = localStringBuilder.append((String)localObject).append(", description=");
    localObject = this.mDescription;
    localStringBuilder = localStringBuilder.append((String)localObject).append(", enabled=");
    boolean bool = this.mEnabled;
    localStringBuilder = localStringBuilder.append(bool).append(", connecting=");
    bool = this.mConnecting;
    localStringBuilder = localStringBuilder.append(bool).append(", canDisconnect=");
    bool = this.mCanDisconnect;
    localStringBuilder = localStringBuilder.append(bool).append(", playbackType=");
    int i = this.mPlaybackType;
    localStringBuilder = localStringBuilder.append(i).append(", playbackStream=");
    i = this.mPlaybackStream;
    localStringBuilder = localStringBuilder.append(i).append(", volumeHandling=");
    i = this.mVolumeHandling;
    localStringBuilder = localStringBuilder.append(i).append(", volume=");
    i = this.mVolume;
    localStringBuilder = localStringBuilder.append(i).append(", volumeMax=");
    i = this.mVolumeMax;
    localStringBuilder = localStringBuilder.append(i).append(", presentationDisplayId=");
    i = this.mPresentationDisplayId;
    localStringBuilder = localStringBuilder.append(i).append(", extras=");
    localObject = this.mExtras;
    localStringBuilder = localStringBuilder.append(localObject).append(", settingsIntent=");
    localObject = this.mSettingsIntent;
    localStringBuilder = localStringBuilder.append(localObject).append(", providerPackageName=");
    localObject = this.mProvider.getPackageName();
    return (String)localObject + " }";
  }
  
  int updateDescriptor(MediaRouteDescriptor paramMediaRouteDescriptor)
  {
    int i = 0;
    String str = null;
    Object localObject1 = this.mDescriptor;
    if (localObject1 != paramMediaRouteDescriptor)
    {
      this.mDescriptor = paramMediaRouteDescriptor;
      if (paramMediaRouteDescriptor != null)
      {
        localObject1 = this.mName;
        Object localObject2 = paramMediaRouteDescriptor.getName();
        boolean bool1 = MediaRouter.equal(localObject1, localObject2);
        if (!bool1)
        {
          str = paramMediaRouteDescriptor.getName();
          this.mName = str;
          i = 1;
        }
        localObject1 = this.mDescription;
        localObject2 = paramMediaRouteDescriptor.getDescription();
        bool1 = MediaRouter.equal(localObject1, localObject2);
        if (!bool1)
        {
          localObject1 = paramMediaRouteDescriptor.getDescription();
          this.mDescription = ((String)localObject1);
          i |= 0x1;
        }
        bool1 = this.mEnabled;
        boolean bool3 = paramMediaRouteDescriptor.isEnabled();
        if (bool1 != bool3)
        {
          bool1 = paramMediaRouteDescriptor.isEnabled();
          this.mEnabled = bool1;
          i |= 0x1;
        }
        bool1 = this.mConnecting;
        bool3 = paramMediaRouteDescriptor.isConnecting();
        if (bool1 != bool3)
        {
          bool1 = paramMediaRouteDescriptor.isConnecting();
          this.mConnecting = bool1;
          i |= 0x1;
        }
        localObject1 = this.mControlFilters;
        localObject2 = paramMediaRouteDescriptor.getControlFilters();
        bool1 = ((ArrayList)localObject1).equals(localObject2);
        if (!bool1)
        {
          this.mControlFilters.clear();
          localObject1 = this.mControlFilters;
          localObject2 = paramMediaRouteDescriptor.getControlFilters();
          ((ArrayList)localObject1).addAll((Collection)localObject2);
          i |= 0x1;
        }
        int j = this.mPlaybackType;
        int k = paramMediaRouteDescriptor.getPlaybackType();
        if (j != k)
        {
          j = paramMediaRouteDescriptor.getPlaybackType();
          this.mPlaybackType = j;
          i |= 0x1;
        }
        j = this.mPlaybackStream;
        k = paramMediaRouteDescriptor.getPlaybackStream();
        if (j != k)
        {
          j = paramMediaRouteDescriptor.getPlaybackStream();
          this.mPlaybackStream = j;
          i |= 0x1;
        }
        j = this.mVolumeHandling;
        k = paramMediaRouteDescriptor.getVolumeHandling();
        if (j != k)
        {
          j = paramMediaRouteDescriptor.getVolumeHandling();
          this.mVolumeHandling = j;
          i |= 0x3;
        }
        j = this.mVolume;
        k = paramMediaRouteDescriptor.getVolume();
        if (j != k)
        {
          j = paramMediaRouteDescriptor.getVolume();
          this.mVolume = j;
          i |= 0x3;
        }
        j = this.mVolumeMax;
        k = paramMediaRouteDescriptor.getVolumeMax();
        if (j != k)
        {
          j = paramMediaRouteDescriptor.getVolumeMax();
          this.mVolumeMax = j;
          i |= 0x3;
        }
        j = this.mPresentationDisplayId;
        k = paramMediaRouteDescriptor.getPresentationDisplayId();
        if (j != k)
        {
          j = paramMediaRouteDescriptor.getPresentationDisplayId();
          this.mPresentationDisplayId = j;
          j = 0;
          localObject1 = null;
          this.mPresentationDisplay = null;
          i |= 0x5;
        }
        localObject1 = this.mExtras;
        localObject2 = paramMediaRouteDescriptor.getExtras();
        boolean bool2 = MediaRouter.equal(localObject1, localObject2);
        if (!bool2)
        {
          localObject1 = paramMediaRouteDescriptor.getExtras();
          this.mExtras = ((Bundle)localObject1);
          i |= 0x1;
        }
        localObject1 = this.mSettingsIntent;
        localObject2 = paramMediaRouteDescriptor.getSettingsActivity();
        bool2 = MediaRouter.equal(localObject1, localObject2);
        if (!bool2)
        {
          localObject1 = paramMediaRouteDescriptor.getSettingsActivity();
          this.mSettingsIntent = ((IntentSender)localObject1);
          i |= 0x1;
        }
        bool2 = this.mCanDisconnect;
        boolean bool4 = paramMediaRouteDescriptor.canDisconnectAndKeepPlaying();
        if (bool2 != bool4)
        {
          bool2 = paramMediaRouteDescriptor.canDisconnectAndKeepPlaying();
          this.mCanDisconnect = bool2;
          i |= 0x5;
        }
      }
    }
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouter$RouteInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */