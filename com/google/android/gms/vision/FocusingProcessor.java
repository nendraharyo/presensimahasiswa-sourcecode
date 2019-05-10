package com.google.android.gms.vision;

import android.util.Log;
import android.util.SparseArray;

public abstract class FocusingProcessor
  implements Detector.Processor
{
  private Detector zzbmN;
  private Tracker zzbnd;
  private int zzbne = 3;
  private boolean zzbnf = false;
  private int zzbng;
  private int zzbnh = 0;
  
  public FocusingProcessor(Detector paramDetector, Tracker paramTracker)
  {
    this.zzbmN = paramDetector;
    this.zzbnd = paramTracker;
  }
  
  public void receiveDetections(Detector.Detections paramDetections)
  {
    int i = 0;
    StringBuilder localStringBuilder = null;
    Object localObject1 = paramDetections.getDetectedItems();
    int j = ((SparseArray)localObject1).size();
    if (j == 0)
    {
      int m = this.zzbnh;
      j = this.zzbne;
      if (m == j)
      {
        localObject1 = this.zzbnd;
        ((Tracker)localObject1).onDone();
        this.zzbnf = false;
        m = this.zzbnh + 1;
        this.zzbnh = m;
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.zzbnd;
      ((Tracker)localObject1).onMissing(paramDetections);
      break;
      this.zzbnh = 0;
      boolean bool = this.zzbnf;
      int k;
      Object localObject2;
      if (bool)
      {
        k = this.zzbng;
        localObject2 = ((SparseArray)localObject1).get(k);
        if (localObject2 != null)
        {
          localObject1 = this.zzbnd;
          ((Tracker)localObject1).onUpdate(paramDetections, localObject2);
        }
        else
        {
          localObject2 = this.zzbnd;
          ((Tracker)localObject2).onDone();
          this.zzbnf = false;
        }
      }
      else
      {
        k = selectFocus(paramDetections);
        localObject1 = ((SparseArray)localObject1).get(k);
        if (localObject1 == null)
        {
          localObject1 = "FocusingProcessor";
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          String str = "Invalid focus selected: ";
          localStringBuilder = localStringBuilder.append(str);
          localObject2 = k;
          Log.w((String)localObject1, (String)localObject2);
        }
        else
        {
          this.zzbnf = true;
          this.zzbng = k;
          localObject2 = this.zzbmN;
          i = this.zzbng;
          ((Detector)localObject2).setFocus(i);
          localObject2 = this.zzbnd;
          i = this.zzbng;
          ((Tracker)localObject2).onNewItem(i, localObject1);
          localObject2 = this.zzbnd;
          ((Tracker)localObject2).onUpdate(paramDetections, localObject1);
        }
      }
    }
  }
  
  public void release()
  {
    this.zzbnd.onDone();
  }
  
  public abstract int selectFocus(Detector.Detections paramDetections);
  
  protected void zzkq(int paramInt)
  {
    if (paramInt < 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Invalid max gap: " + paramInt;
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    this.zzbne = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\FocusingProcessor.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */