package io.fabric.sdk.android.services.settings;

public class SessionSettingsData
{
  public final int identifierMask;
  public final int logBufferSize;
  public final int maxChainedExceptionDepth;
  public final int maxCompleteSessionsCount;
  public final int maxCustomExceptionEvents;
  public final int maxCustomKeyValuePairs;
  public final boolean sendSessionWithoutCrash;
  
  public SessionSettingsData(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean, int paramInt6)
  {
    this.logBufferSize = paramInt1;
    this.maxChainedExceptionDepth = paramInt2;
    this.maxCustomExceptionEvents = paramInt3;
    this.maxCustomKeyValuePairs = paramInt4;
    this.identifierMask = paramInt5;
    this.sendSessionWithoutCrash = paramBoolean;
    this.maxCompleteSessionsCount = paramInt6;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\settings\SessionSettingsData.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */