package com.google.android.gms.vision.face;

import android.util.SparseArray;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Detector.Detections;
import com.google.android.gms.vision.FocusingProcessor;
import com.google.android.gms.vision.Tracker;

public class LargestFaceFocusingProcessor
  extends FocusingProcessor
{
  public LargestFaceFocusingProcessor(Detector paramDetector, Tracker paramTracker)
  {
    super(paramDetector, paramTracker);
  }
  
  public int selectFocus(Detector.Detections paramDetections)
  {
    int i = 0;
    float f1 = 0.0F;
    SparseArray localSparseArray = paramDetections.getDetectedItems();
    int j = localSparseArray.size();
    if (j == 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("No faces for selectFocus.");
      throw ((Throwable)localObject);
    }
    int k = localSparseArray.keyAt(0);
    Object localObject = (Face)localSparseArray.valueAt(0);
    f1 = ((Face)localObject).getWidth();
    j = 1;
    float f2 = Float.MIN_VALUE;
    int m = k;
    float f3 = f1;
    i = j;
    f1 = f2;
    for (;;)
    {
      j = localSparseArray.size();
      if (i >= j) {
        break;
      }
      int n = localSparseArray.keyAt(i);
      localObject = (Face)localSparseArray.valueAt(i);
      f2 = ((Face)localObject).getWidth();
      boolean bool = f2 < f3;
      if (bool)
      {
        f3 = f2;
        m = n;
      }
      j = i + 1;
      i = j;
    }
    return m;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\LargestFaceFocusingProcessor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */