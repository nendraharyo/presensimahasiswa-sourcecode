package com.crashlytics.android.answers;

import java.util.Set;

class SamplingEventFilter
  implements EventFilter
{
  static final Set EVENTS_TYPE_TO_SAMPLE;
  final int samplingRate;
  
  static
  {
    SamplingEventFilter.1 local1 = new com/crashlytics/android/answers/SamplingEventFilter$1;
    local1.<init>();
    EVENTS_TYPE_TO_SAMPLE = local1;
  }
  
  public SamplingEventFilter(int paramInt)
  {
    this.samplingRate = paramInt;
  }
  
  public boolean skipEvent(SessionEvent paramSessionEvent)
  {
    int i = 1;
    Object localObject1 = EVENTS_TYPE_TO_SAMPLE;
    Object localObject2 = paramSessionEvent.type;
    boolean bool = ((Set)localObject1).contains(localObject2);
    int j;
    if (bool)
    {
      localObject1 = paramSessionEvent.sessionEventMetadata.betaDeviceToken;
      if (localObject1 == null)
      {
        bool = i;
        localObject2 = paramSessionEvent.sessionEventMetadata.installationId;
        j = ((String)localObject2).hashCode();
        int k = this.samplingRate;
        j = Math.abs(j % k);
        if (j == 0) {
          break label102;
        }
        j = i;
        label82:
        if ((!bool) || (j == 0)) {
          break label111;
        }
      }
    }
    for (;;)
    {
      return i;
      bool = false;
      localObject1 = null;
      break;
      label102:
      j = 0;
      localObject2 = null;
      break label82;
      label111:
      i = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SamplingEventFilter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */