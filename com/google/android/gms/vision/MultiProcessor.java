package com.google.android.gms.vision;

import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MultiProcessor
  implements Detector.Processor
{
  private int zzbne;
  private MultiProcessor.Factory zzbnq;
  private SparseArray zzbnr;
  
  private MultiProcessor()
  {
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.zzbnr = localSparseArray;
    this.zzbne = 3;
  }
  
  private void zza(Detector.Detections paramDetections)
  {
    SparseArray localSparseArray = paramDetections.getDetectedItems();
    int i = 0;
    for (;;)
    {
      int j = localSparseArray.size();
      if (i >= j) {
        break;
      }
      j = localSparseArray.keyAt(i);
      Object localObject1 = localSparseArray.valueAt(i);
      Object localObject2 = this.zzbnr.get(j);
      if (localObject2 == null)
      {
        localObject2 = new com/google/android/gms/vision/MultiProcessor$zza;
        ((MultiProcessor.zza)localObject2).<init>(this, null);
        Tracker localTracker = this.zzbnq.create(localObject1);
        MultiProcessor.zza.zza((MultiProcessor.zza)localObject2, localTracker);
        localTracker = MultiProcessor.zza.zza((MultiProcessor.zza)localObject2);
        localTracker.onNewItem(j, localObject1);
        localObject1 = this.zzbnr;
        ((SparseArray)localObject1).append(j, localObject2);
      }
      i += 1;
    }
  }
  
  private void zzb(Detector.Detections paramDetections)
  {
    SparseArray localSparseArray = paramDetections.getDetectedItems();
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    int i = 0;
    Object localObject = null;
    int k = 0;
    Iterator localIterator = null;
    localObject = this.zzbnr;
    i = ((SparseArray)localObject).size();
    if (k < i)
    {
      int m = this.zzbnr.keyAt(k);
      localObject = localSparseArray.get(m);
      if (localObject == null)
      {
        localObject = (MultiProcessor.zza)this.zzbnr.valueAt(k);
        MultiProcessor.zza.zzb((MultiProcessor.zza)localObject);
        int n = MultiProcessor.zza.zzc((MultiProcessor.zza)localObject);
        int i1 = this.zzbne;
        if (n < i1) {
          break label146;
        }
        MultiProcessor.zza.zza((MultiProcessor.zza)localObject).onDone();
        localObject = Integer.valueOf(m);
        localHashSet.add(localObject);
      }
      for (;;)
      {
        i = k + 1;
        k = i;
        break;
        label146:
        localObject = MultiProcessor.zza.zza((MultiProcessor.zza)localObject);
        ((Tracker)localObject).onMissing(paramDetections);
      }
    }
    localIterator = localHashSet.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Integer)localIterator.next();
      localSparseArray = this.zzbnr;
      int j = ((Integer)localObject).intValue();
      localSparseArray.delete(j);
    }
  }
  
  private void zzc(Detector.Detections paramDetections)
  {
    SparseArray localSparseArray1 = paramDetections.getDetectedItems();
    int j;
    for (int i = 0;; i = j)
    {
      j = localSparseArray1.size();
      if (i >= j) {
        break;
      }
      j = localSparseArray1.keyAt(i);
      Object localObject1 = localSparseArray1.valueAt(i);
      SparseArray localSparseArray2 = this.zzbnr;
      Object localObject2 = (MultiProcessor.zza)localSparseArray2.get(j);
      MultiProcessor.zza.zza((MultiProcessor.zza)localObject2, 0);
      localObject2 = MultiProcessor.zza.zza((MultiProcessor.zza)localObject2);
      ((Tracker)localObject2).onUpdate(paramDetections, localObject1);
      j = i + 1;
    }
  }
  
  public void receiveDetections(Detector.Detections paramDetections)
  {
    zza(paramDetections);
    zzb(paramDetections);
    zzc(paramDetections);
  }
  
  public void release()
  {
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = this.zzbnr;
      i = ((SparseArray)localObject).size();
      if (j >= i) {
        break;
      }
      localObject = MultiProcessor.zza.zza((MultiProcessor.zza)this.zzbnr.valueAt(j));
      ((Tracker)localObject).onDone();
      i = j + 1;
    }
    this.zzbnr.clear();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\MultiProcessor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */