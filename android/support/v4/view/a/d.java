package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityRecord;

public class d
{
  private final AccessibilityRecord a;
  
  public static void a(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    if (i >= j) {
      paramAccessibilityRecord.setMaxScrollX(paramInt);
    }
  }
  
  public static void b(AccessibilityRecord paramAccessibilityRecord, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 15;
    if (i >= j) {
      paramAccessibilityRecord.setMaxScrollY(paramInt);
    }
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
          paramObject = (d)paramObject;
          localObject1 = this.a;
          if (localObject1 == null)
          {
            localObject1 = ((d)paramObject).a;
            if (localObject1 != null) {
              bool1 = false;
            }
          }
          else
          {
            localObject1 = this.a;
            localObject2 = ((d)paramObject).a;
            boolean bool2 = localObject1.equals(localObject2);
            if (!bool2) {
              bool1 = false;
            }
          }
        }
      }
    }
  }
  
  public int hashCode()
  {
    AccessibilityRecord localAccessibilityRecord = this.a;
    int i;
    if (localAccessibilityRecord == null)
    {
      i = 0;
      localAccessibilityRecord = null;
    }
    for (;;)
    {
      return i;
      localAccessibilityRecord = this.a;
      i = localAccessibilityRecord.hashCode();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */