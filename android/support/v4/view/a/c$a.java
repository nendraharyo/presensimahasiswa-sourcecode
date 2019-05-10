package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

class c$a
  extends AccessibilityNodeProvider
{
  final c a;
  
  c$a(c paramc)
  {
    this.a = paramc;
  }
  
  public AccessibilityNodeInfo createAccessibilityNodeInfo(int paramInt)
  {
    Object localObject = this.a.a(paramInt);
    if (localObject == null) {}
    for (localObject = null;; localObject = ((b)localObject).a()) {
      return (AccessibilityNodeInfo)localObject;
    }
  }
  
  public List findAccessibilityNodeInfosByText(String paramString, int paramInt)
  {
    Object localObject = this.a;
    List localList = ((c)localObject).a(paramString, paramInt);
    int i;
    if (localList == null) {
      i = 0;
    }
    ArrayList localArrayList;
    for (localObject = null;; localObject = localArrayList)
    {
      return (List)localObject;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int j = localList.size();
      i = 0;
      localObject = null;
      for (int k = 0; k < j; k = i)
      {
        localObject = ((b)localList.get(k)).a();
        localArrayList.add(localObject);
        i = k + 1;
      }
    }
  }
  
  public boolean performAction(int paramInt1, int paramInt2, Bundle paramBundle)
  {
    return this.a.a(paramInt1, paramInt2, paramBundle);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\a\c$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */