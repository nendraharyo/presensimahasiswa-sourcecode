package android.support.v7.widget;

import android.content.pm.ResolveInfo;
import java.math.BigDecimal;

public final class ActivityChooserModel$ActivityResolveInfo
  implements Comparable
{
  public final ResolveInfo resolveInfo;
  public float weight;
  
  public ActivityChooserModel$ActivityResolveInfo(ResolveInfo paramResolveInfo)
  {
    this.resolveInfo = paramResolveInfo;
  }
  
  public int compareTo(ActivityResolveInfo paramActivityResolveInfo)
  {
    int i = Float.floatToIntBits(paramActivityResolveInfo.weight);
    int j = Float.floatToIntBits(this.weight);
    return i - j;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {}
    for (;;)
    {
      return bool;
      if (paramObject == null)
      {
        bool = false;
      }
      else
      {
        Class localClass1 = getClass();
        Class localClass2 = paramObject.getClass();
        if (localClass1 != localClass2)
        {
          bool = false;
        }
        else
        {
          paramObject = (ActivityResolveInfo)paramObject;
          float f1 = this.weight;
          int i = Float.floatToIntBits(f1);
          float f2 = ((ActivityResolveInfo)paramObject).weight;
          int j = Float.floatToIntBits(f2);
          if (i != j) {
            bool = false;
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    return Float.floatToIntBits(this.weight) + 31;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    localStringBuilder1.append("[");
    StringBuilder localStringBuilder2 = localStringBuilder1.append("resolveInfo:");
    Object localObject = this.resolveInfo.toString();
    localStringBuilder2.append((String)localObject);
    localStringBuilder2 = localStringBuilder1.append("; weight:");
    localObject = new java/math/BigDecimal;
    double d = this.weight;
    ((BigDecimal)localObject).<init>(d);
    localStringBuilder2.append(localObject);
    localStringBuilder1.append("]");
    return localStringBuilder1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserModel$ActivityResolveInfo.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */