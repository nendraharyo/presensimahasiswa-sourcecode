package android.support.transition;

import android.support.v4.h.a;
import android.support.v4.view.r;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class w
{
  private static u a;
  private static ThreadLocal b;
  private static ArrayList c;
  
  static
  {
    Object localObject = new android/support/transition/e;
    ((e)localObject).<init>();
    a = (u)localObject;
    localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    b = (ThreadLocal)localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    c = (ArrayList)localObject;
  }
  
  static a a()
  {
    WeakReference localWeakReference = (WeakReference)b.get();
    Object localObject;
    if (localWeakReference != null)
    {
      localObject = localWeakReference.get();
      if (localObject != null) {}
    }
    else
    {
      localObject = new android/support/v4/h/a;
      ((a)localObject).<init>();
      localWeakReference = new java/lang/ref/WeakReference;
      localWeakReference.<init>(localObject);
      localObject = b;
      ((ThreadLocal)localObject).set(localWeakReference);
    }
    return (a)localWeakReference.get();
  }
  
  public static void a(ViewGroup paramViewGroup, u paramu)
  {
    Object localObject = c;
    boolean bool = ((ArrayList)localObject).contains(paramViewGroup);
    if (!bool)
    {
      bool = r.w(paramViewGroup);
      if (bool)
      {
        localObject = c;
        ((ArrayList)localObject).add(paramViewGroup);
        if (paramu == null) {
          paramu = a;
        }
        localObject = paramu.m();
        c(paramViewGroup, (u)localObject);
        t.a(paramViewGroup, null);
        b(paramViewGroup, (u)localObject);
      }
    }
  }
  
  private static void b(ViewGroup paramViewGroup, u paramu)
  {
    if ((paramu != null) && (paramViewGroup != null))
    {
      w.a locala = new android/support/transition/w$a;
      locala.<init>(paramu, paramViewGroup);
      paramViewGroup.addOnAttachStateChangeListener(locala);
      ViewTreeObserver localViewTreeObserver = paramViewGroup.getViewTreeObserver();
      localViewTreeObserver.addOnPreDrawListener(locala);
    }
  }
  
  private static void c(ViewGroup paramViewGroup, u paramu)
  {
    Object localObject = (ArrayList)a().get(paramViewGroup);
    boolean bool;
    if (localObject != null)
    {
      int i = ((ArrayList)localObject).size();
      if (i > 0)
      {
        Iterator localIterator = ((ArrayList)localObject).iterator();
        for (;;)
        {
          bool = localIterator.hasNext();
          if (!bool) {
            break;
          }
          localObject = (u)localIterator.next();
          ((u)localObject).d(paramViewGroup);
        }
      }
    }
    if (paramu != null)
    {
      bool = true;
      paramu.a(paramViewGroup, bool);
    }
    localObject = t.a(paramViewGroup);
    if (localObject != null) {
      ((t)localObject).a();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\w.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */