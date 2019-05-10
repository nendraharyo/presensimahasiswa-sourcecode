package android.support.transition;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ag
  implements ai
{
  private static LayoutTransition a;
  private static Field b;
  private static boolean c;
  private static Method d;
  private static boolean e;
  
  private static void a(LayoutTransition paramLayoutTransition)
  {
    boolean bool1 = true;
    boolean bool2 = e;
    Class[] arrayOfClass;
    if (!bool2)
    {
      localObject1 = LayoutTransition.class;
      localObject2 = "cancel";
      arrayOfClass = null;
    }
    try
    {
      arrayOfClass = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredMethod((String)localObject2, arrayOfClass);
      d = (Method)localObject1;
      localObject1 = d;
      bool3 = true;
      ((Method)localObject1).setAccessible(bool3);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          localObject1 = d;
          boolean bool3 = false;
          localObject2 = null;
          localObject2 = new Object[0];
          ((Method)localObject1).invoke(paramLayoutTransition, (Object[])localObject2);
          return;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          String str1;
          String str2 = "ViewGroupUtilsApi14";
          localObject2 = "Failed to access cancel method by reflection";
          Log.i(str2, (String)localObject2);
          continue;
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          String str3 = "ViewGroupUtilsApi14";
          localObject2 = "Failed to invoke cancel method by reflection";
          Log.i(str3, (String)localObject2);
          continue;
        }
        localNoSuchMethodException = localNoSuchMethodException;
        str1 = "ViewGroupUtilsApi14";
        localObject2 = "Failed to access cancel method by reflection";
        Log.i(str1, (String)localObject2);
      }
    }
    e = bool1;
    localObject1 = d;
    if (localObject1 == null) {}
  }
  
  public ae a(ViewGroup paramViewGroup)
  {
    return ac.a(paramViewGroup);
  }
  
  public void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i = 1;
    boolean bool1 = false;
    LayoutTransition localLayoutTransition = null;
    Object localObject = a;
    int k;
    if (localObject == null)
    {
      localObject = new android/support/transition/ag$1;
      ((ag.1)localObject).<init>(this);
      a = (LayoutTransition)localObject;
      a.setAnimator(2, null);
      a.setAnimator(0, null);
      a.setAnimator(i, null);
      a.setAnimator(3, null);
      localObject = a;
      k = 4;
      ((LayoutTransition)localObject).setAnimator(k, null);
    }
    if (paramBoolean)
    {
      localLayoutTransition = paramViewGroup.getLayoutTransition();
      if (localLayoutTransition != null)
      {
        boolean bool2 = localLayoutTransition.isRunning();
        if (bool2) {
          a(localLayoutTransition);
        }
        localObject = a;
        if (localLayoutTransition != localObject)
        {
          int n = r.a.transition_layout_save;
          paramViewGroup.setTag(n, localLayoutTransition);
        }
      }
      localLayoutTransition = a;
      paramViewGroup.setLayoutTransition(localLayoutTransition);
    }
    for (;;)
    {
      return;
      paramViewGroup.setLayoutTransition(null);
      boolean bool3 = c;
      if (!bool3)
      {
        localObject = ViewGroup.class;
        str3 = "mLayoutSuppressed";
      }
      try
      {
        localObject = ((Class)localObject).getDeclaredField(str3);
        b = (Field)localObject;
        localObject = b;
        k = 1;
        ((Field)localObject).setAccessible(k);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          str1 = "ViewGroupUtilsApi14";
          str3 = "Failed to access mLayoutSuppressed field by reflection";
          Log.i(str1, str3);
        }
      }
      c = i;
      localObject = b;
      if (localObject != null) {}
      try
      {
        localObject = b;
        bool1 = ((Field)localObject).getBoolean(paramViewGroup);
        if (bool1)
        {
          localObject = b;
          int m = 0;
          str3 = null;
          ((Field)localObject).setBoolean(paramViewGroup, false);
        }
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        for (;;)
        {
          int j;
          int i1;
          String str1;
          String str2 = "ViewGroupUtilsApi14";
          str3 = "Failed to get mLayoutSuppressed field by reflection";
          Log.i(str2, str3);
        }
      }
      if (bool1) {
        paramViewGroup.requestLayout();
      }
      j = r.a.transition_layout_save;
      localLayoutTransition = (LayoutTransition)paramViewGroup.getTag(j);
      if (localLayoutTransition != null)
      {
        i1 = r.a.transition_layout_save;
        paramViewGroup.setTag(i1, null);
        paramViewGroup.setLayoutTransition(localLayoutTransition);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\ag.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */