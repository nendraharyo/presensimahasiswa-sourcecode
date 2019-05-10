package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;

public class b$b
{
  final Object a;
  
  b$b(Object paramObject)
  {
    this.a = paramObject;
  }
  
  public static b a(int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    b localb;
    AccessibilityNodeInfo.CollectionInfo localCollectionInfo;
    if (i >= j)
    {
      localb = new android/support/v4/view/a/b$b;
      localCollectionInfo = AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean, paramInt3);
      localb.<init>(localCollectionInfo);
    }
    for (;;)
    {
      return localb;
      i = Build.VERSION.SDK_INT;
      j = 19;
      if (i >= j)
      {
        localb = new android/support/v4/view/a/b$b;
        localCollectionInfo = AccessibilityNodeInfo.CollectionInfo.obtain(paramInt1, paramInt2, paramBoolean);
        localb.<init>(localCollectionInfo);
      }
      else
      {
        localb = new android/support/v4/view/a/b$b;
        j = 0;
        localCollectionInfo = null;
        localb.<init>(null);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a\b$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */