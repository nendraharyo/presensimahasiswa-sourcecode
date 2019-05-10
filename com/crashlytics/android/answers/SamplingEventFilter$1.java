package com.crashlytics.android.answers;

import java.util.HashSet;

final class SamplingEventFilter$1
  extends HashSet
{
  SamplingEventFilter$1()
  {
    SessionEvent.Type localType = SessionEvent.Type.START;
    add(localType);
    localType = SessionEvent.Type.RESUME;
    add(localType);
    localType = SessionEvent.Type.PAUSE;
    add(localType);
    localType = SessionEvent.Type.STOP;
    add(localType);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\answers\SamplingEventFilter$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */