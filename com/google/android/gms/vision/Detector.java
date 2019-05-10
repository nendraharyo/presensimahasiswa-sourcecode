package com.google.android.gms.vision;

import android.util.SparseArray;

public abstract class Detector
{
  private Object zzbmY;
  private Detector.Processor zzbmZ;
  
  public Detector()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzbmY = localObject;
  }
  
  public abstract SparseArray detect(Frame paramFrame);
  
  public boolean isOperational()
  {
    return true;
  }
  
  public void receiveFrame(Frame paramFrame)
  {
    synchronized (this.zzbmY)
    {
      Object localObject2 = this.zzbmZ;
      if (localObject2 == null)
      {
        localObject2 = new java/lang/IllegalStateException;
        localObject5 = "Detector processor must first be set with setProcessor in order to receive detection results.";
        ((IllegalStateException)localObject2).<init>((String)localObject5);
        throw ((Throwable)localObject2);
      }
    }
    Object localObject4 = new com/google/android/gms/vision/Frame$Metadata;
    Object localObject5 = paramFrame.getMetadata();
    ((Frame.Metadata)localObject4).<init>((Frame.Metadata)localObject5);
    ((Frame.Metadata)localObject4).zzIf();
    localObject5 = detect(paramFrame);
    boolean bool = isOperational();
    Detector.Detections localDetections = new com/google/android/gms/vision/Detector$Detections;
    localDetections.<init>((SparseArray)localObject5, (Frame.Metadata)localObject4, bool);
    localObject4 = this.zzbmZ;
    ((Detector.Processor)localObject4).receiveDetections(localDetections);
  }
  
  public void release()
  {
    synchronized (this.zzbmY)
    {
      Detector.Processor localProcessor = this.zzbmZ;
      if (localProcessor != null)
      {
        localProcessor = this.zzbmZ;
        localProcessor.release();
        localProcessor = null;
        this.zzbmZ = null;
      }
      return;
    }
  }
  
  public boolean setFocus(int paramInt)
  {
    return true;
  }
  
  public void setProcessor(Detector.Processor paramProcessor)
  {
    this.zzbmZ = paramProcessor;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\Detector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */