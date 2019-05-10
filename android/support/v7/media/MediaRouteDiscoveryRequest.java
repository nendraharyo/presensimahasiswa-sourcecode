package android.support.v7.media;

import android.os.Bundle;

public final class MediaRouteDiscoveryRequest
{
  private static final String KEY_ACTIVE_SCAN = "activeScan";
  private static final String KEY_SELECTOR = "selector";
  private final Bundle mBundle;
  private MediaRouteSelector mSelector;
  
  private MediaRouteDiscoveryRequest(Bundle paramBundle)
  {
    this.mBundle = paramBundle;
  }
  
  public MediaRouteDiscoveryRequest(MediaRouteSelector paramMediaRouteSelector, boolean paramBoolean)
  {
    if (paramMediaRouteSelector == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("selector must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = new android/os/Bundle;
    ((Bundle)localObject).<init>();
    this.mBundle = ((Bundle)localObject);
    this.mSelector = paramMediaRouteSelector;
    localObject = this.mBundle;
    Bundle localBundle = paramMediaRouteSelector.asBundle();
    ((Bundle)localObject).putBundle("selector", localBundle);
    this.mBundle.putBoolean("activeScan", paramBoolean);
  }
  
  private void ensureSelector()
  {
    Object localObject = this.mSelector;
    if (localObject == null)
    {
      localObject = this.mBundle;
      String str = "selector";
      localObject = MediaRouteSelector.fromBundle(((Bundle)localObject).getBundle(str));
      this.mSelector = ((MediaRouteSelector)localObject);
      localObject = this.mSelector;
      if (localObject == null)
      {
        localObject = MediaRouteSelector.EMPTY;
        this.mSelector = ((MediaRouteSelector)localObject);
      }
    }
  }
  
  public static MediaRouteDiscoveryRequest fromBundle(Bundle paramBundle)
  {
    MediaRouteDiscoveryRequest localMediaRouteDiscoveryRequest;
    if (paramBundle != null)
    {
      localMediaRouteDiscoveryRequest = new android/support/v7/media/MediaRouteDiscoveryRequest;
      localMediaRouteDiscoveryRequest.<init>(paramBundle);
    }
    for (;;)
    {
      return localMediaRouteDiscoveryRequest;
      localMediaRouteDiscoveryRequest = null;
    }
  }
  
  public Bundle asBundle()
  {
    return this.mBundle;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof MediaRouteDiscoveryRequest;
    if (bool2)
    {
      paramObject = (MediaRouteDiscoveryRequest)paramObject;
      MediaRouteSelector localMediaRouteSelector1 = getSelector();
      MediaRouteSelector localMediaRouteSelector2 = ((MediaRouteDiscoveryRequest)paramObject).getSelector();
      bool2 = localMediaRouteSelector1.equals(localMediaRouteSelector2);
      if (bool2)
      {
        bool2 = isActiveScan();
        boolean bool3 = ((MediaRouteDiscoveryRequest)paramObject).isActiveScan();
        if (bool2 == bool3) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public MediaRouteSelector getSelector()
  {
    ensureSelector();
    return this.mSelector;
  }
  
  public int hashCode()
  {
    MediaRouteSelector localMediaRouteSelector = getSelector();
    int i = localMediaRouteSelector.hashCode();
    int j = isActiveScan();
    if (j != 0) {
      j = 1;
    }
    for (;;)
    {
      return j ^ i;
      int k = 0;
      localMediaRouteSelector = null;
    }
  }
  
  public boolean isActiveScan()
  {
    return this.mBundle.getBoolean("activeScan");
  }
  
  public boolean isValid()
  {
    ensureSelector();
    return this.mSelector.isValid();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    StringBuilder localStringBuilder2 = localStringBuilder1.append("DiscoveryRequest{ selector=");
    MediaRouteSelector localMediaRouteSelector = getSelector();
    localStringBuilder2.append(localMediaRouteSelector);
    localStringBuilder2 = localStringBuilder1.append(", activeScan=");
    boolean bool = isActiveScan();
    localStringBuilder2.append(bool);
    localStringBuilder2 = localStringBuilder1.append(", isValid=");
    bool = isValid();
    localStringBuilder2.append(bool);
    localStringBuilder1.append(" }");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteDiscoveryRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */