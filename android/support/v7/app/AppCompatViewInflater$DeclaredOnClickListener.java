package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class AppCompatViewInflater$DeclaredOnClickListener
  implements View.OnClickListener
{
  private final View mHostView;
  private final String mMethodName;
  private Context mResolvedContext;
  private Method mResolvedMethod;
  
  public AppCompatViewInflater$DeclaredOnClickListener(View paramView, String paramString)
  {
    this.mHostView = paramView;
    this.mMethodName = paramString;
  }
  
  private void resolveMethod(Context paramContext, String paramString)
  {
    Object localObject1 = paramContext;
    Object localObject4;
    Object localObject5;
    while (localObject1 != null) {
      try
      {
        bool = ((Context)localObject1).isRestricted();
        if (!bool)
        {
          Object localObject2 = localObject1.getClass();
          localObject4 = this.mMethodName;
          int j = 1;
          localObject5 = new Class[j];
          Class localClass = View.class;
          localObject5[0] = localClass;
          localObject2 = ((Class)localObject2).getMethod((String)localObject4, (Class[])localObject5);
          if (localObject2 != null)
          {
            this.mResolvedMethod = ((Method)localObject2);
            this.mResolvedContext = ((Context)localObject1);
            return;
          }
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        boolean bool = localObject1 instanceof ContextWrapper;
        if (bool)
        {
          localObject1 = ((ContextWrapper)localObject1).getBaseContext();
        }
        else
        {
          k = 0;
          localObject1 = null;
        }
      }
    }
    localObject1 = this.mHostView;
    int k = ((View)localObject1).getId();
    int i = -1;
    if (k == i) {}
    Object localObject3;
    for (localObject1 = "";; localObject1 = (String)localObject3)
    {
      localObject3 = new java/lang/IllegalStateException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject4 = ((StringBuilder)localObject4).append("Could not find method ");
      localObject5 = this.mMethodName;
      localObject4 = ((StringBuilder)localObject4).append((String)localObject5).append("(View) in a parent or ancestor Context for android:onClick ").append("attribute defined on view ");
      localObject5 = this.mHostView.getClass();
      localObject1 = localObject5 + (String)localObject1;
      ((IllegalStateException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      localObject3 = ((StringBuilder)localObject3).append(" with id '");
      localObject4 = this.mHostView.getContext().getResources();
      localObject1 = ((Resources)localObject4).getResourceEntryName(k);
      localObject1 = ((StringBuilder)localObject3).append((String)localObject1);
      localObject3 = "'";
    }
  }
  
  public void onClick(View paramView)
  {
    Object localObject1 = this.mResolvedMethod;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = this.mHostView.getContext();
      localObject2 = this.mMethodName;
      resolveMethod((Context)localObject1, (String)localObject2);
    }
    try
    {
      localObject1 = this.mResolvedMethod;
      localObject2 = this.mResolvedContext;
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      arrayOfObject[0] = paramView;
      ((Method)localObject1).invoke(localObject2, arrayOfObject);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("Could not execute non-public method for android:onClick", localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      localObject2 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject2).<init>("Could not execute method for android:onClick", localInvocationTargetException);
      throw ((Throwable)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatViewInflater$DeclaredOnClickListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */