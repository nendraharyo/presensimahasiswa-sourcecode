package android.support.v4.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

class u$b
  extends u.a
{
  public void a(ViewParent paramViewParent, View paramView)
  {
    try
    {
      paramViewParent.onStopNestedScroll(paramView);
      return;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("ViewParent ").append(paramViewParent).append(" does not implement interface ");
        String str2 = "method onStopNestedScroll";
        localObject = str2;
        Log.e(str1, (String)localObject, localAbstractMethodError);
      }
    }
  }
  
  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("ViewParent ").append(paramViewParent).append(" does not implement interface ");
        String str2 = "method onNestedScroll";
        localObject = str2;
        Log.e(str1, (String)localObject, localAbstractMethodError);
      }
    }
  }
  
  public void a(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    try
    {
      paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
      return;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("ViewParent ").append(paramViewParent).append(" does not implement interface ");
        String str2 = "method onNestedPreScroll";
        localObject = str2;
        Log.e(str1, (String)localObject, localAbstractMethodError);
      }
    }
  }
  
  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
  {
    try
    {
      bool = paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("ViewParent ").append(paramViewParent).append(" does not implement interface ");
        String str2 = "method onNestedPreFling";
        localObject2 = str2;
        Log.e(str1, (String)localObject2, localAbstractMethodError);
        boolean bool = false;
        Object localObject1 = null;
      }
    }
    return bool;
  }
  
  public boolean a(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    try
    {
      bool = paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("ViewParent ").append(paramViewParent).append(" does not implement interface ");
        String str2 = "method onNestedFling";
        localObject2 = str2;
        Log.e(str1, (String)localObject2, localAbstractMethodError);
        boolean bool = false;
        Object localObject1 = null;
      }
    }
    return bool;
  }
  
  public boolean a(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    try
    {
      bool = paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("ViewParent ").append(paramViewParent).append(" does not implement interface ");
        String str2 = "method onStartNestedScroll";
        localObject2 = str2;
        Log.e(str1, (String)localObject2, localAbstractMethodError);
        boolean bool = false;
        Object localObject1 = null;
      }
    }
    return bool;
  }
  
  public void b(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
  {
    try
    {
      paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
      return;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      for (;;)
      {
        String str1 = "ViewParentCompat";
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("ViewParent ").append(paramViewParent).append(" does not implement interface ");
        String str2 = "method onNestedScrollAccepted";
        localObject = str2;
        Log.e(str1, (String)localObject, localAbstractMethodError);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\vie\\u$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */