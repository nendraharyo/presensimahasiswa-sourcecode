package android.support.v7.widget;

import android.content.ComponentName;
import java.math.BigDecimal;

public final class ActivityChooserModel$HistoricalRecord
{
  public final ComponentName activity;
  public final long time;
  public final float weight;
  
  public ActivityChooserModel$HistoricalRecord(ComponentName paramComponentName, long paramLong, float paramFloat)
  {
    this.activity = paramComponentName;
    this.time = paramLong;
    this.weight = paramFloat;
  }
  
  public ActivityChooserModel$HistoricalRecord(String paramString, long paramLong, float paramFloat)
  {
    this(localComponentName, paramLong, paramFloat);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool1;
      if (paramObject == null)
      {
        bool1 = false;
      }
      else
      {
        Object localObject1 = getClass();
        Object localObject2 = paramObject.getClass();
        if (localObject1 != localObject2)
        {
          bool1 = false;
        }
        else
        {
          paramObject = (HistoricalRecord)paramObject;
          localObject1 = this.activity;
          if (localObject1 == null)
          {
            localObject1 = ((HistoricalRecord)paramObject).activity;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.activity;
            localObject2 = ((HistoricalRecord)paramObject).activity;
            bool2 = ((ComponentName)localObject1).equals(localObject2);
            if (!bool2)
            {
              bool1 = false;
              continue;
            }
          }
          long l1 = this.time;
          long l2 = ((HistoricalRecord)paramObject).time;
          boolean bool2 = l1 < l2;
          if (bool2)
          {
            bool1 = false;
          }
          else
          {
            float f1 = this.weight;
            int i = Float.floatToIntBits(f1);
            float f2 = ((HistoricalRecord)paramObject).weight;
            int j = Float.floatToIntBits(f2);
            if (i != j) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    ComponentName localComponentName = this.activity;
    int i;
    if (localComponentName == null)
    {
      i = 0;
      localComponentName = null;
    }
    for (;;)
    {
      i = (i + 31) * 31;
      long l1 = this.time;
      long l2 = this.time >>> 32;
      int j = (int)(l1 ^ l2);
      i = (i + j) * 31;
      j = Float.floatToIntBits(this.weight);
      return i + j;
      localComponentName = this.activity;
      i = localComponentName.hashCode();
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("[");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("; activity:");
    Object localObject = this.activity;
    localStringBuilder2.append(localObject);
    localStringBuilder2 = localStringBuilder1.append("; time:");
    long l = this.time;
    localStringBuilder2.append(l);
    localStringBuilder2 = localStringBuilder1.append("; weight:");
    localObject = new java/math/BigDecimal;
    double d = this.weight;
    ((BigDecimal)localObject).<init>(d);
    localStringBuilder2.append(localObject);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserModel$HistoricalRecord.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */