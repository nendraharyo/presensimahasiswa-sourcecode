package com.google.android.gms.vision;

import android.util.SparseArray;

public class Detector$Detections
{
  private SparseArray zzbna;
  private Frame.Metadata zzbnb;
  private boolean zzbnc;
  
  public Detector$Detections(SparseArray paramSparseArray, Frame.Metadata paramMetadata, boolean paramBoolean)
  {
    this.zzbna = paramSparseArray;
    this.zzbnb = paramMetadata;
    this.zzbnc = paramBoolean;
  }
  
  public boolean detectorIsOperational()
  {
    return this.zzbnc;
  }
  
  public SparseArray getDetectedItems()
  {
    return this.zzbna;
  }
  
  public Frame.Metadata getFrameMetadata()
  {
    return this.zzbnb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\Detector$Detections.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */