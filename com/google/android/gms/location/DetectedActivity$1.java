package com.google.android.gms.location;

import java.util.Comparator;

final class DetectedActivity$1
  implements Comparator
{
  public int zza(DetectedActivity paramDetectedActivity1, DetectedActivity paramDetectedActivity2)
  {
    Integer localInteger1 = Integer.valueOf(paramDetectedActivity2.getConfidence());
    int i = paramDetectedActivity1.getConfidence();
    Integer localInteger2 = Integer.valueOf(i);
    int j = localInteger1.compareTo(localInteger2);
    if (j == 0)
    {
      localInteger1 = Integer.valueOf(paramDetectedActivity1.getType());
      i = paramDetectedActivity2.getType();
      localInteger2 = Integer.valueOf(i);
      j = localInteger1.compareTo(localInteger2);
    }
    return j;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\DetectedActivity$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */