package android.support.v7.media;

import android.content.ComponentName;

public final class MediaRouteProvider$ProviderMetadata
{
  private final ComponentName mComponentName;
  
  MediaRouteProvider$ProviderMetadata(ComponentName paramComponentName)
  {
    if (paramComponentName == null)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("componentName must not be null");
      throw localIllegalArgumentException;
    }
    this.mComponentName = paramComponentName;
  }
  
  public ComponentName getComponentName()
  {
    return this.mComponentName;
  }
  
  public String getPackageName()
  {
    return this.mComponentName.getPackageName();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("ProviderMetadata{ componentName=");
    String str = this.mComponentName.flattenToShortString();
    return str + " }";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\media\MediaRouteProvider$ProviderMetadata.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */