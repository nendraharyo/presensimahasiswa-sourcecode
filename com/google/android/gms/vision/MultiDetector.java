package com.google.android.gms.vision;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiDetector
  extends Detector
{
  private List zzbno;
  
  private MultiDetector()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzbno = localArrayList;
  }
  
  public SparseArray detect(Frame paramFrame)
  {
    Object localObject1 = new android/util/SparseArray;
    ((SparseArray)localObject1).<init>();
    Object localObject2 = this.zzbno;
    Iterator localIterator = ((List)localObject2).iterator();
    int i = localIterator.hasNext();
    if (i != 0)
    {
      SparseArray localSparseArray = ((Detector)localIterator.next()).detect(paramFrame);
      i = 0;
      localObject2 = null;
      for (;;)
      {
        int k = localSparseArray.size();
        if (i >= k) {
          break;
        }
        int m = localSparseArray.keyAt(i);
        Object localObject3 = ((SparseArray)localObject1).get(m);
        if (localObject3 != null)
        {
          localObject2 = new java/lang/IllegalStateException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = "Detection ID overlap for id = " + m + ".  " + "This means that one of the detectors is not using global IDs.";
          ((IllegalStateException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
        }
        localObject3 = localSparseArray.valueAt(i);
        ((SparseArray)localObject1).append(m, localObject3);
        int j;
        i += 1;
      }
    }
    return (SparseArray)localObject1;
  }
  
  public boolean isOperational()
  {
    Object localObject = this.zzbno;
    Iterator localIterator = ((List)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Detector)localIterator.next();
      bool = ((Detector)localObject).isOperational();
    } while (bool);
    boolean bool = false;
    localObject = null;
    for (;;)
    {
      return bool;
      bool = true;
    }
  }
  
  public void receiveFrame(Frame paramFrame)
  {
    Object localObject = this.zzbno;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Detector)localIterator.next();
      ((Detector)localObject).receiveFrame(paramFrame);
    }
  }
  
  public void release()
  {
    Object localObject = this.zzbno;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Detector)localIterator.next();
      ((Detector)localObject).release();
    }
    this.zzbno.clear();
  }
  
  public void setProcessor(Detector.Processor paramProcessor)
  {
    UnsupportedOperationException localUnsupportedOperationException = new java/lang/UnsupportedOperationException;
    localUnsupportedOperationException.<init>("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    throw localUnsupportedOperationException;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\MultiDetector.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */