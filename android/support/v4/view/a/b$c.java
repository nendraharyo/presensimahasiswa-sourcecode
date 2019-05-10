package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;

public class b$c
{
  final Object a;
  
  b$c(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public static c a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    c localc;
    AccessibilityNodeInfo.CollectionItemInfo localCollectionItemInfo;
    if (i >= j)
    {
      localc = new android/support/v4/view/a/b$c;
      localCollectionItemInfo = AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1, paramBoolean2);
      localc.<init>(localCollectionItemInfo);
    }
    for (;;)
    {
      return localc;
      i = Build.VERSION.SDK_INT;
      j = 19;
      if (i >= j)
      {
        localc = new android/support/v4/view/a/b$c;
        localCollectionItemInfo = AccessibilityNodeInfo.CollectionItemInfo.obtain(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean1);
        localc.<init>(localCollectionItemInfo);
      }
      else
      {
        localc = new android/support/v4/view/a/b$c;
        j = 0;
        localCollectionItemInfo = null;
        localc.<init>(null);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a\b$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */