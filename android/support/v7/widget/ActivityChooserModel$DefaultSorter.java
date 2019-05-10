package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class ActivityChooserModel$DefaultSorter
  implements ActivityChooserModel.ActivitySorter
{
  private static final float WEIGHT_DECAY_COEFFICIENT = 0.95F;
  private final Map mPackageNameToActivityMap;
  
  ActivityChooserModel$DefaultSorter()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.mPackageNameToActivityMap = localHashMap;
  }
  
  public void sort(Intent paramIntent, List paramList1, List paramList2)
  {
    Map localMap = this.mPackageNameToActivityMap;
    localMap.clear();
    int i = paramList1.size();
    int j = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    while (k < i)
    {
      localObject1 = (ActivityChooserModel.ActivityResolveInfo)paramList1.get(k);
      m = 0;
      ((ActivityChooserModel.ActivityResolveInfo)localObject1).weight = 0.0F;
      ComponentName localComponentName = new android/content/ComponentName;
      String str1 = ((ActivityChooserModel.ActivityResolveInfo)localObject1).resolveInfo.activityInfo.packageName;
      String str2 = ((ActivityChooserModel.ActivityResolveInfo)localObject1).resolveInfo.activityInfo.name;
      localComponentName.<init>(str1, str2);
      localMap.put(localComponentName, localObject1);
      j = k + 1;
      k = j;
    }
    j = paramList2.size() + -1;
    i = 1065353216;
    float f2 = 1.0F;
    int m = j;
    if (m >= 0)
    {
      localObject1 = (ActivityChooserModel.HistoricalRecord)paramList2.get(m);
      localObject2 = ((ActivityChooserModel.HistoricalRecord)localObject1).activity;
      localObject2 = (ActivityChooserModel.ActivityResolveInfo)localMap.get(localObject2);
      if (localObject2 == null) {
        break label256;
      }
      float f3 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).weight;
      f1 = ((ActivityChooserModel.HistoricalRecord)localObject1).weight * f2 + f3;
      ((ActivityChooserModel.ActivityResolveInfo)localObject2).weight = f1;
      j = 1064514355;
    }
    label256:
    for (f1 = 0.95F * f2;; f1 = f2)
    {
      k = m + -1;
      m = k;
      f2 = f1;
      break;
      Collections.sort(paramList1);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserModel$DefaultSorter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */