package io.fabric.sdk.android;

public class KitInfo
{
  private final String buildType;
  private final String identifier;
  private final String version;
  
  public KitInfo(String paramString1, String paramString2, String paramString3)
  {
    this.identifier = paramString1;
    this.version = paramString2;
    this.buildType = paramString3;
  }
  
  public String getBuildType()
  {
    return this.buildType;
  }
  
  public String getIdentifier()
  {
    return this.identifier;
  }
  
  public String getVersion()
  {
    return this.version;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\KitInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */