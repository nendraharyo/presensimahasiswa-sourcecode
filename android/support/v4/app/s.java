package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.view.r;
import android.support.v4.view.t;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public abstract class s
{
  static String a(Map paramMap, String paramString)
  {
    Object localObject1 = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    boolean bool1;
    boolean bool2;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = ((Map.Entry)localObject1).getValue();
      bool2 = paramString.equals(localObject2);
    } while (!bool2);
    for (localObject1 = (String)((Map.Entry)localObject1).getKey();; localObject1 = null)
    {
      return (String)localObject1;
      bool1 = false;
    }
  }
  
  protected static void a(List paramList, View paramView)
  {
    int i = paramList.size();
    boolean bool1 = a(paramList, paramView, i);
    if (bool1) {
      return;
    }
    paramList.add(paramView);
    int j;
    for (int k = i;; k = j)
    {
      j = paramList.size();
      if (k >= j) {
        break;
      }
      Object localObject = (View)paramList.get(k);
      int m = localObject instanceof ViewGroup;
      if (m != 0)
      {
        localObject = (ViewGroup)localObject;
        int i1 = ((ViewGroup)localObject).getChildCount();
        m = 0;
        while (m < i1)
        {
          View localView = ((ViewGroup)localObject).getChildAt(m);
          boolean bool2 = a(paramList, localView, i);
          if (!bool2) {
            paramList.add(localView);
          }
          int n;
          m += 1;
        }
      }
      j = k + 1;
    }
  }
  
  protected static boolean a(List paramList)
  {
    if (paramList != null)
    {
      bool = paramList.isEmpty();
      if (!bool) {
        break label19;
      }
    }
    label19:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private static boolean a(List paramList, View paramView, int paramInt)
  {
    boolean bool = false;
    int i = 0;
    for (;;)
    {
      if (i < paramInt)
      {
        Object localObject = paramList.get(i);
        if (localObject == paramView) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      i += 1;
    }
  }
  
  public abstract Object a(Object paramObject1, Object paramObject2, Object paramObject3);
  
  ArrayList a(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = paramArrayList.size();
    int j = 0;
    View localView = null;
    for (int k = 0; k < i; k = j)
    {
      localView = (View)paramArrayList.get(k);
      String str = r.m(localView);
      localArrayList.add(str);
      str = null;
      r.a(localView, null);
      j = k + 1;
    }
    return localArrayList;
  }
  
  protected void a(View paramView, Rect paramRect)
  {
    int i = 1;
    int[] arrayOfInt = new int[2];
    paramView.getLocationOnScreen(arrayOfInt);
    int j = arrayOfInt[0];
    int k = arrayOfInt[i];
    int m = arrayOfInt[0];
    int n = paramView.getWidth();
    m += n;
    int i1 = arrayOfInt[i];
    n = paramView.getHeight();
    i1 += n;
    paramRect.set(j, k, m, i1);
  }
  
  void a(View paramView, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, Map paramMap)
  {
    int i = paramArrayList2.size();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int j = 0;
    if (j < i)
    {
      localObject1 = (View)paramArrayList1.get(j);
      localObject2 = r.m((View)localObject1);
      localArrayList.add(localObject2);
      if (localObject2 == null) {}
      label151:
      for (;;)
      {
        int k = j + 1;
        j = k;
        break;
        r.a((View)localObject1, null);
        localObject1 = (String)paramMap.get(localObject2);
        int m = 0;
        for (;;)
        {
          if (m >= i) {
            break label151;
          }
          Object localObject3 = paramArrayList3.get(m);
          boolean bool = ((String)localObject1).equals(localObject3);
          if (bool)
          {
            localObject1 = (View)paramArrayList2.get(m);
            r.a((View)localObject1, (String)localObject2);
            break;
          }
          m += 1;
        }
      }
    }
    Object localObject1 = new android/support/v4/app/s$1;
    Object localObject2 = paramArrayList1;
    ((s.1)localObject1).<init>(this, i, paramArrayList2, paramArrayList3, paramArrayList1, localArrayList);
    z.a(paramView, (Runnable)localObject1);
  }
  
  void a(View paramView, ArrayList paramArrayList, Map paramMap)
  {
    s.2 local2 = new android/support/v4/app/s$2;
    local2.<init>(this, paramArrayList, paramMap);
    z.a(paramView, local2);
  }
  
  public abstract void a(ViewGroup paramViewGroup, Object paramObject);
  
  void a(ViewGroup paramViewGroup, ArrayList paramArrayList, Map paramMap)
  {
    s.3 local3 = new android/support/v4/app/s$3;
    local3.<init>(this, paramArrayList, paramMap);
    z.a(paramViewGroup, local3);
  }
  
  public abstract void a(Object paramObject, Rect paramRect);
  
  public abstract void a(Object paramObject, View paramView);
  
  public abstract void a(Object paramObject, View paramView, ArrayList paramArrayList);
  
  public abstract void a(Object paramObject1, Object paramObject2, ArrayList paramArrayList1, Object paramObject3, ArrayList paramArrayList2, Object paramObject4, ArrayList paramArrayList3);
  
  public abstract void a(Object paramObject, ArrayList paramArrayList);
  
  public abstract void a(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2);
  
  void a(ArrayList paramArrayList, View paramView)
  {
    int i = paramView.getVisibility();
    int j;
    if (i == 0)
    {
      j = paramView instanceof ViewGroup;
      if (j == 0) {
        break label74;
      }
      paramView = (ViewGroup)paramView;
      j = t.a(paramView);
      if (j == 0) {
        break label39;
      }
      paramArrayList.add(paramView);
    }
    for (;;)
    {
      return;
      label39:
      int m = paramView.getChildCount();
      j = 0;
      while (j < m)
      {
        View localView = paramView.getChildAt(j);
        a(paramArrayList, localView);
        int k;
        j += 1;
      }
      continue;
      label74:
      paramArrayList.add(paramView);
    }
  }
  
  void a(Map paramMap, View paramView)
  {
    int i = paramView.getVisibility();
    if (i == 0)
    {
      String str = r.m(paramView);
      if (str != null) {
        paramMap.put(str, paramView);
      }
      int j = paramView instanceof ViewGroup;
      if (j != 0)
      {
        paramView = (ViewGroup)paramView;
        int m = paramView.getChildCount();
        j = 0;
        str = null;
        while (j < m)
        {
          View localView = paramView.getChildAt(j);
          a(paramMap, localView);
          int k;
          j += 1;
        }
      }
    }
  }
  
  public abstract boolean a(Object paramObject);
  
  public abstract Object b(Object paramObject);
  
  public abstract Object b(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public abstract void b(Object paramObject, View paramView);
  
  public abstract void b(Object paramObject, View paramView, ArrayList paramArrayList);
  
  public abstract void b(Object paramObject, ArrayList paramArrayList1, ArrayList paramArrayList2);
  
  public abstract Object c(Object paramObject);
  
  public abstract void c(Object paramObject, View paramView);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */