package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.Color;
import android.support.v4.b.a;
import android.util.TypedValue;

class ThemeUtils
{
  static final int[] ACTIVATED_STATE_SET;
  static final int[] CHECKED_STATE_SET;
  static final int[] DISABLED_STATE_SET;
  static final int[] EMPTY_STATE_SET;
  static final int[] FOCUSED_STATE_SET;
  static final int[] NOT_PRESSED_OR_FOCUSED_STATE_SET;
  static final int[] PRESSED_STATE_SET;
  static final int[] SELECTED_STATE_SET;
  private static final int[] TEMP_ARRAY;
  private static final ThreadLocal TL_TYPED_VALUE;
  
  static
  {
    int i = 1;
    Object localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    TL_TYPED_VALUE = (ThreadLocal)localObject;
    localObject = new int[i];
    localObject[0] = -16842910;
    DISABLED_STATE_SET = (int[])localObject;
    localObject = new int[i];
    localObject[0] = 16842908;
    FOCUSED_STATE_SET = (int[])localObject;
    localObject = new int[i];
    localObject[0] = 16843518;
    ACTIVATED_STATE_SET = (int[])localObject;
    localObject = new int[i];
    localObject[0] = 16842919;
    PRESSED_STATE_SET = (int[])localObject;
    localObject = new int[i];
    localObject[0] = 16842912;
    CHECKED_STATE_SET = (int[])localObject;
    localObject = new int[i];
    localObject[0] = 16842913;
    SELECTED_STATE_SET = (int[])localObject;
    localObject = new int[2];
    Object tmp97_96 = localObject;
    tmp97_96[0] = -16842919;
    tmp97_96[1] = -16842908;
    NOT_PRESSED_OR_FOCUSED_STATE_SET = (int[])localObject;
    EMPTY_STATE_SET = new int[0];
    TEMP_ARRAY = new int[i];
  }
  
  public static ColorStateList createDisabledStateList(int paramInt1, int paramInt2)
  {
    int i = 2;
    int[][] arrayOfInt = new int[i][];
    int[] arrayOfInt1 = new int[i];
    int[] arrayOfInt2 = DISABLED_STATE_SET;
    arrayOfInt[0] = arrayOfInt2;
    arrayOfInt1[0] = paramInt2;
    int j = 1;
    arrayOfInt2 = EMPTY_STATE_SET;
    arrayOfInt[j] = arrayOfInt2;
    arrayOfInt1[j] = paramInt1;
    ColorStateList localColorStateList = new android/content/res/ColorStateList;
    localColorStateList.<init>(arrayOfInt, arrayOfInt1);
    return localColorStateList;
  }
  
  public static int getDisabledThemeAttrColor(Context paramContext, int paramInt)
  {
    Object localObject1 = getThemeAttrColorStateList(paramContext, paramInt);
    Object localObject2;
    int i;
    if (localObject1 != null)
    {
      boolean bool1 = ((ColorStateList)localObject1).isStateful();
      if (bool1)
      {
        localObject2 = DISABLED_STATE_SET;
        i = ((ColorStateList)localObject1).getDefaultColor();
      }
    }
    float f;
    for (int j = ((ColorStateList)localObject1).getColorForState((int[])localObject2, i);; j = getThemeAttrColor(paramContext, paramInt, f))
    {
      return j;
      localObject1 = getTypedValue();
      localObject2 = paramContext.getTheme();
      i = 16842803;
      boolean bool2 = true;
      ((Resources.Theme)localObject2).resolveAttribute(i, (TypedValue)localObject1, bool2);
      f = ((TypedValue)localObject1).getFloat();
    }
  }
  
  public static int getThemeAttrColor(Context paramContext, int paramInt)
  {
    TEMP_ARRAY[0] = paramInt;
    int[] arrayOfInt = TEMP_ARRAY;
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, null, arrayOfInt);
    int i = 0;
    arrayOfInt = null;
    try
    {
      i = localTintTypedArray.getColor(0, 0);
      return i;
    }
    finally
    {
      localTintTypedArray.recycle();
    }
  }
  
  static int getThemeAttrColor(Context paramContext, int paramInt, float paramFloat)
  {
    int i = getThemeAttrColor(paramContext, paramInt);
    int j = Math.round(Color.alpha(i) * paramFloat);
    return a.b(i, j);
  }
  
  public static ColorStateList getThemeAttrColorStateList(Context paramContext, int paramInt)
  {
    TEMP_ARRAY[0] = paramInt;
    Object localObject1 = TEMP_ARRAY;
    TintTypedArray localTintTypedArray = TintTypedArray.obtainStyledAttributes(paramContext, null, (int[])localObject1);
    localObject1 = null;
    try
    {
      localObject1 = localTintTypedArray.getColorStateList(0);
      return (ColorStateList)localObject1;
    }
    finally
    {
      localTintTypedArray.recycle();
    }
  }
  
  private static TypedValue getTypedValue()
  {
    TypedValue localTypedValue = (TypedValue)TL_TYPED_VALUE.get();
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      ThreadLocal localThreadLocal = TL_TYPED_VALUE;
      localThreadLocal.set(localTypedValue);
    }
    return localTypedValue;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ThemeUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */