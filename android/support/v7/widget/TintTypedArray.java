package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.a.a.b;
import android.support.v4.a.a.b.a;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.util.TypedValue;

public class TintTypedArray
{
  private final Context mContext;
  private TypedValue mTypedValue;
  private final TypedArray mWrapped;
  
  private TintTypedArray(Context paramContext, TypedArray paramTypedArray)
  {
    this.mContext = paramContext;
    this.mWrapped = paramTypedArray;
  }
  
  public static TintTypedArray obtainStyledAttributes(Context paramContext, int paramInt, int[] paramArrayOfInt)
  {
    TintTypedArray localTintTypedArray = new android/support/v7/widget/TintTypedArray;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramInt, paramArrayOfInt);
    localTintTypedArray.<init>(paramContext, localTypedArray);
    return localTintTypedArray;
  }
  
  public static TintTypedArray obtainStyledAttributes(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    TintTypedArray localTintTypedArray = new android/support/v7/widget/TintTypedArray;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt);
    localTintTypedArray.<init>(paramContext, localTypedArray);
    return localTintTypedArray;
  }
  
  public static TintTypedArray obtainStyledAttributes(Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    TintTypedArray localTintTypedArray = new android/support/v7/widget/TintTypedArray;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt1, paramInt2);
    localTintTypedArray.<init>(paramContext, localTypedArray);
    return localTintTypedArray;
  }
  
  public boolean getBoolean(int paramInt, boolean paramBoolean)
  {
    return this.mWrapped.getBoolean(paramInt, paramBoolean);
  }
  
  public int getChangingConfigurations()
  {
    return this.mWrapped.getChangingConfigurations();
  }
  
  public int getColor(int paramInt1, int paramInt2)
  {
    return this.mWrapped.getColor(paramInt1, paramInt2);
  }
  
  public ColorStateList getColorStateList(int paramInt)
  {
    Object localObject = this.mWrapped;
    boolean bool = ((TypedArray)localObject).hasValue(paramInt);
    if (bool)
    {
      localObject = this.mWrapped;
      Context localContext = null;
      int i = ((TypedArray)localObject).getResourceId(paramInt, 0);
      if (i != 0)
      {
        localContext = this.mContext;
        localObject = AppCompatResources.getColorStateList(localContext, i);
        if (localObject == null) {}
      }
    }
    for (;;)
    {
      return (ColorStateList)localObject;
      localObject = this.mWrapped.getColorStateList(paramInt);
    }
  }
  
  public float getDimension(int paramInt, float paramFloat)
  {
    return this.mWrapped.getDimension(paramInt, paramFloat);
  }
  
  public int getDimensionPixelOffset(int paramInt1, int paramInt2)
  {
    return this.mWrapped.getDimensionPixelOffset(paramInt1, paramInt2);
  }
  
  public int getDimensionPixelSize(int paramInt1, int paramInt2)
  {
    return this.mWrapped.getDimensionPixelSize(paramInt1, paramInt2);
  }
  
  public Drawable getDrawable(int paramInt)
  {
    Object localObject = this.mWrapped;
    boolean bool = ((TypedArray)localObject).hasValue(paramInt);
    Context localContext;
    int i;
    if (bool)
    {
      localObject = this.mWrapped;
      localContext = null;
      i = ((TypedArray)localObject).getResourceId(paramInt, 0);
      if (i != 0) {
        localContext = this.mContext;
      }
    }
    for (localObject = AppCompatResources.getDrawable(localContext, i);; localObject = this.mWrapped.getDrawable(paramInt)) {
      return (Drawable)localObject;
    }
  }
  
  public Drawable getDrawableIfKnown(int paramInt)
  {
    Object localObject = this.mWrapped;
    boolean bool1 = ((TypedArray)localObject).hasValue(paramInt);
    AppCompatDrawableManager localAppCompatDrawableManager;
    int i;
    Context localContext;
    boolean bool2;
    if (bool1)
    {
      localObject = this.mWrapped;
      localAppCompatDrawableManager = null;
      i = ((TypedArray)localObject).getResourceId(paramInt, 0);
      if (i != 0)
      {
        localAppCompatDrawableManager = AppCompatDrawableManager.get();
        localContext = this.mContext;
        bool2 = true;
      }
    }
    for (localObject = localAppCompatDrawableManager.getDrawable(localContext, i, bool2);; localObject = null)
    {
      return (Drawable)localObject;
      i = 0;
    }
  }
  
  public float getFloat(int paramInt, float paramFloat)
  {
    return this.mWrapped.getFloat(paramInt, paramFloat);
  }
  
  public Typeface getFont(int paramInt1, int paramInt2, b.a parama)
  {
    Object localObject1 = this.mWrapped;
    Object localObject2 = null;
    int i = ((TypedArray)localObject1).getResourceId(paramInt1, 0);
    if (i == 0) {
      i = 0;
    }
    TypedValue localTypedValue;
    for (localObject1 = null;; localObject1 = b.a((Context)localObject2, i, localTypedValue, paramInt2, parama))
    {
      return (Typeface)localObject1;
      localObject2 = this.mTypedValue;
      if (localObject2 == null)
      {
        localObject2 = new android/util/TypedValue;
        ((TypedValue)localObject2).<init>();
        this.mTypedValue = ((TypedValue)localObject2);
      }
      localObject2 = this.mContext;
      localTypedValue = this.mTypedValue;
    }
  }
  
  public float getFraction(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
  {
    return this.mWrapped.getFraction(paramInt1, paramInt2, paramInt3, paramFloat);
  }
  
  public int getIndex(int paramInt)
  {
    return this.mWrapped.getIndex(paramInt);
  }
  
  public int getIndexCount()
  {
    return this.mWrapped.getIndexCount();
  }
  
  public int getInt(int paramInt1, int paramInt2)
  {
    return this.mWrapped.getInt(paramInt1, paramInt2);
  }
  
  public int getInteger(int paramInt1, int paramInt2)
  {
    return this.mWrapped.getInteger(paramInt1, paramInt2);
  }
  
  public int getLayoutDimension(int paramInt1, int paramInt2)
  {
    return this.mWrapped.getLayoutDimension(paramInt1, paramInt2);
  }
  
  public int getLayoutDimension(int paramInt, String paramString)
  {
    return this.mWrapped.getLayoutDimension(paramInt, paramString);
  }
  
  public String getNonResourceString(int paramInt)
  {
    return this.mWrapped.getNonResourceString(paramInt);
  }
  
  public String getPositionDescription()
  {
    return this.mWrapped.getPositionDescription();
  }
  
  public int getResourceId(int paramInt1, int paramInt2)
  {
    return this.mWrapped.getResourceId(paramInt1, paramInt2);
  }
  
  public Resources getResources()
  {
    return this.mWrapped.getResources();
  }
  
  public String getString(int paramInt)
  {
    return this.mWrapped.getString(paramInt);
  }
  
  public CharSequence getText(int paramInt)
  {
    return this.mWrapped.getText(paramInt);
  }
  
  public CharSequence[] getTextArray(int paramInt)
  {
    return this.mWrapped.getTextArray(paramInt);
  }
  
  public int getType(int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j) {
      localObject = this.mWrapped;
    }
    for (i = ((TypedArray)localObject).getType(paramInt);; i = ((TypedValue)localObject).type)
    {
      return i;
      localObject = this.mTypedValue;
      if (localObject == null)
      {
        localObject = new android/util/TypedValue;
        ((TypedValue)localObject).<init>();
        this.mTypedValue = ((TypedValue)localObject);
      }
      localObject = this.mWrapped;
      TypedValue localTypedValue = this.mTypedValue;
      ((TypedArray)localObject).getValue(paramInt, localTypedValue);
      localObject = this.mTypedValue;
    }
  }
  
  public boolean getValue(int paramInt, TypedValue paramTypedValue)
  {
    return this.mWrapped.getValue(paramInt, paramTypedValue);
  }
  
  public boolean hasValue(int paramInt)
  {
    return this.mWrapped.hasValue(paramInt);
  }
  
  public int length()
  {
    return this.mWrapped.length();
  }
  
  public TypedValue peekValue(int paramInt)
  {
    return this.mWrapped.peekValue(paramInt);
  }
  
  public void recycle()
  {
    this.mWrapped.recycle();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\TintTypedArray.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */