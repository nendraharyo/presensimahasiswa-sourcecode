package com.google.android.gms.vision.face;

import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Tracker;

public class LargestFaceFocusingProcessor$Builder
{
  private LargestFaceFocusingProcessor zzbnO;
  
  public LargestFaceFocusingProcessor$Builder(Detector paramDetector, Tracker paramTracker)
  {
    LargestFaceFocusingProcessor localLargestFaceFocusingProcessor = new com/google/android/gms/vision/face/LargestFaceFocusingProcessor;
    localLargestFaceFocusingProcessor.<init>(paramDetector, paramTracker);
    this.zzbnO = localLargestFaceFocusingProcessor;
  }
  
  public LargestFaceFocusingProcessor build()
  {
    return this.zzbnO;
  }
  
  public Builder setMaxGapFrames(int paramInt)
  {
    LargestFaceFocusingProcessor.zza(this.zzbnO, paramInt);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\LargestFaceFocusingProcessor$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */