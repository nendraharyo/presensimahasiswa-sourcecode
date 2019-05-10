package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.v4.b.a.a;
import android.support.v4.b.a.c;
import android.support.v7.graphics.drawable.DrawableWrapper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class DrawableUtils
{
  public static final Rect INSETS_NONE;
  private static final String TAG = "DrawableUtils";
  private static final String VECTOR_DRAWABLE_CLAZZ_NAME = "android.graphics.drawable.VectorDrawable";
  private static Class sInsetsClazz;
  
  static
  {
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    INSETS_NONE = (Rect)localObject;
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    if (i >= j) {
      localObject = "android.graphics.Insets";
    }
    try
    {
      localObject = Class.forName((String)localObject);
      sInsetsClazz = (Class)localObject;
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
  }
  
  public static boolean canSafelyMutateDrawable(Drawable paramDrawable)
  {
    int i = 15;
    int j = Build.VERSION.SDK_INT;
    boolean bool2;
    Object localObject;
    if (j < i)
    {
      bool2 = paramDrawable instanceof InsetDrawable;
      if (bool2)
      {
        bool2 = false;
        localObject = null;
      }
    }
    for (;;)
    {
      return bool2;
      int k = Build.VERSION.SDK_INT;
      if (k < i)
      {
        boolean bool3 = paramDrawable instanceof GradientDrawable;
        if (bool3)
        {
          bool3 = false;
          localObject = null;
          continue;
        }
      }
      int m = Build.VERSION.SDK_INT;
      i = 17;
      if (m < i)
      {
        n = paramDrawable instanceof LayerDrawable;
        if (n != 0)
        {
          n = 0;
          localObject = null;
          continue;
        }
      }
      int n = paramDrawable instanceof DrawableContainer;
      if (n != 0)
      {
        localObject = ((Drawable)paramDrawable).getConstantState();
        boolean bool1 = localObject instanceof DrawableContainer.DrawableContainerState;
        if (bool1)
        {
          Drawable[] arrayOfDrawable = ((DrawableContainer.DrawableContainerState)localObject).getChildren();
          int i2 = arrayOfDrawable.length;
          n = 0;
          localObject = null;
          for (;;)
          {
            if (n >= i2) {
              break label245;
            }
            Drawable localDrawable = arrayOfDrawable[n];
            boolean bool5 = canSafelyMutateDrawable(localDrawable);
            if (!bool5)
            {
              n = 0;
              localObject = null;
              break;
            }
            int i1;
            n += 1;
          }
        }
      }
      else
      {
        bool4 = paramDrawable instanceof c;
        if (bool4)
        {
          paramDrawable = (c)paramDrawable;
          localObject = paramDrawable.a();
          bool4 = canSafelyMutateDrawable((Drawable)localObject);
          continue;
        }
        bool4 = paramDrawable instanceof DrawableWrapper;
        if (bool4)
        {
          paramDrawable = (DrawableWrapper)paramDrawable;
          localObject = paramDrawable.getWrappedDrawable();
          bool4 = canSafelyMutateDrawable((Drawable)localObject);
          continue;
        }
        bool4 = paramDrawable instanceof ScaleDrawable;
        if (bool4)
        {
          paramDrawable = (ScaleDrawable)paramDrawable;
          localObject = paramDrawable.getDrawable();
          bool4 = canSafelyMutateDrawable((Drawable)localObject);
          continue;
        }
      }
      label245:
      boolean bool4 = true;
    }
  }
  
  static void fixDrawable(Drawable paramDrawable)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i == j)
    {
      String str1 = "android.graphics.drawable.VectorDrawable";
      String str2 = paramDrawable.getClass().getName();
      boolean bool = str1.equals(str2);
      if (bool) {
        fixVectorDrawableTinting(paramDrawable);
      }
    }
  }
  
  private static void fixVectorDrawableTinting(Drawable paramDrawable)
  {
    int[] arrayOfInt1 = paramDrawable.getState();
    int[] arrayOfInt2;
    if (arrayOfInt1 != null)
    {
      int i = arrayOfInt1.length;
      if (i != 0) {}
    }
    else
    {
      arrayOfInt2 = ThemeUtils.CHECKED_STATE_SET;
      paramDrawable.setState(arrayOfInt2);
    }
    for (;;)
    {
      paramDrawable.setState(arrayOfInt1);
      return;
      arrayOfInt2 = ThemeUtils.EMPTY_STATE_SET;
      paramDrawable.setState(arrayOfInt2);
    }
  }
  
  public static Rect getOpticalBounds(Drawable paramDrawable)
  {
    Object localObject1 = sInsetsClazz;
    if (localObject1 != null) {}
    for (;;)
    {
      Object localObject5;
      Field localField;
      Object localObject2;
      try
      {
        localObject1 = a.h(paramDrawable);
        Object localObject3 = localObject1.getClass();
        Object localObject4 = "getOpticalInsets";
        localObject5 = null;
        localObject5 = new Class[0];
        localObject3 = ((Class)localObject3).getMethod((String)localObject4, (Class[])localObject5);
        int i = 0;
        localObject4 = null;
        localObject4 = new Object[0];
        localObject5 = ((Method)localObject3).invoke(localObject1, (Object[])localObject4);
        if (localObject5 != null)
        {
          localObject1 = new android/graphics/Rect;
          ((Rect)localObject1).<init>();
          localObject3 = sInsetsClazz;
          Field[] arrayOfField = ((Class)localObject3).getFields();
          int j = arrayOfField.length;
          i = 0;
          localObject4 = null;
          if (i < j)
          {
            localField = arrayOfField[i];
            String str1 = localField.getName();
            k = -1;
            int m = str1.hashCode();
            String str2;
            boolean bool;
            switch (m)
            {
            default: 
              switch (k)
              {
              default: 
                k = i + 1;
                i = k;
              }
              break;
            case 3317767: 
              str2 = "left";
              bool = str1.equals(str2);
              if (!bool) {
                continue;
              }
              k = 0;
              localObject3 = null;
              break;
            case 115029: 
              str2 = "top";
              bool = str1.equals(str2);
              if (!bool) {
                continue;
              }
              k = 1;
              break;
            case 108511772: 
              str2 = "right";
              bool = str1.equals(str2);
              if (!bool) {
                continue;
              }
              k = 2;
              break;
            case -1383228885: 
              str2 = "bottom";
              bool = str1.equals(str2);
              if (!bool) {
                continue;
              }
              k = 3;
              continue;
              k = localField.getInt(localObject5);
              ((Rect)localObject1).left = k;
              break;
            }
          }
        }
        else
        {
          localObject2 = INSETS_NONE;
        }
      }
      catch (Exception localException)
      {
        localObject2 = "DrawableUtils";
        localObject3 = "Couldn't obtain the optical insets. Ignoring.";
        Log.e((String)localObject2, (String)localObject3);
      }
      return (Rect)localObject2;
      int k = localField.getInt(localObject5);
      ((Rect)localObject2).top = k;
      continue;
      k = localField.getInt(localObject5);
      ((Rect)localObject2).right = k;
      continue;
      k = localField.getInt(localObject5);
      ((Rect)localObject2).bottom = k;
    }
  }
  
  public static PorterDuff.Mode parseTintMode(int paramInt, PorterDuff.Mode paramMode)
  {
    switch (paramInt)
    {
    }
    for (;;)
    {
      return paramMode;
      paramMode = PorterDuff.Mode.SRC_OVER;
      continue;
      paramMode = PorterDuff.Mode.SRC_IN;
      continue;
      paramMode = PorterDuff.Mode.SRC_ATOP;
      continue;
      paramMode = PorterDuff.Mode.MULTIPLY;
      continue;
      paramMode = PorterDuff.Mode.SCREEN;
      continue;
      paramMode = PorterDuff.Mode.ADD;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DrawableUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */