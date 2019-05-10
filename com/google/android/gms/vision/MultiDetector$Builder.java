package com.google.android.gms.vision;

import java.util.List;

public class MultiDetector$Builder
{
  private MultiDetector zzbnp;
  
  public MultiDetector$Builder()
  {
    MultiDetector localMultiDetector = new com/google/android/gms/vision/MultiDetector;
    localMultiDetector.<init>(null);
    this.zzbnp = localMultiDetector;
  }
  
  public Builder add(Detector paramDetector)
  {
    MultiDetector.zza(this.zzbnp).add(paramDetector);
    return this;
  }
  
  public MultiDetector build()
  {
    Object localObject = MultiDetector.zza(this.zzbnp);
    int i = ((List)localObject).size();
    if (i == 0)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>("No underlying detectors added to MultiDetector.");
      throw ((Throwable)localObject);
    }
    return this.zzbnp;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\MultiDetector$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */