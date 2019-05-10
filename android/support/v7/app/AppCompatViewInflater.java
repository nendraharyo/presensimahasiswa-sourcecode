package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.h.a;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.AppCompatCheckedTextView;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatMultiAutoCompleteTextView;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatRatingBar;
import android.support.v7.widget.AppCompatSeekBar;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.TintContextWrapper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

public class AppCompatViewInflater
{
  private static final String LOG_TAG = "AppCompatViewInflater";
  private static final String[] sClassPrefixList;
  private static final Map sConstructorMap;
  private static final Class[] sConstructorSignature;
  private static final int[] sOnClickAttrs;
  private final Object[] mConstructorArgs;
  
  static
  {
    int i = 2;
    int j = 1;
    Object localObject = new Class[i];
    localObject[0] = Context.class;
    localObject[j] = AttributeSet.class;
    sConstructorSignature = (Class[])localObject;
    localObject = new int[j];
    localObject[0] = 16843375;
    sOnClickAttrs = (int[])localObject;
    localObject = new String[3];
    localObject[0] = "android.widget.";
    localObject[j] = "android.view.";
    localObject[i] = "android.webkit.";
    sClassPrefixList = (String[])localObject;
    localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    sConstructorMap = (Map)localObject;
  }
  
  public AppCompatViewInflater()
  {
    Object[] arrayOfObject = new Object[2];
    this.mConstructorArgs = arrayOfObject;
  }
  
  private void checkOnClickListener(View paramView, AttributeSet paramAttributeSet)
  {
    Object localObject1 = paramView.getContext();
    boolean bool1 = localObject1 instanceof ContextWrapper;
    boolean bool2;
    if (bool1)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 15;
      if (i < j) {
        break label44;
      }
      bool2 = r.A(paramView);
      if (bool2) {
        break label44;
      }
    }
    for (;;)
    {
      return;
      label44:
      Object localObject2 = sOnClickAttrs;
      localObject1 = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, (int[])localObject2);
      bool2 = false;
      localObject2 = ((TypedArray)localObject1).getString(0);
      if (localObject2 != null)
      {
        AppCompatViewInflater.DeclaredOnClickListener localDeclaredOnClickListener = new android/support/v7/app/AppCompatViewInflater$DeclaredOnClickListener;
        localDeclaredOnClickListener.<init>(paramView, (String)localObject2);
        paramView.setOnClickListener(localDeclaredOnClickListener);
      }
      ((TypedArray)localObject1).recycle();
    }
  }
  
  private View createViewByPrefix(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject1 = (Constructor)sConstructorMap.get(paramString1);
    if (localObject1 == null) {}
    for (;;)
    {
      try
      {
        Object localObject3 = paramContext.getClassLoader();
        if (paramString2 == null) {
          continue;
        }
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append(paramString2);
        localObject1 = ((StringBuilder)localObject1).append(paramString1);
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject1 = ((ClassLoader)localObject3).loadClass((String)localObject1);
        localObject3 = View.class;
        localObject1 = ((Class)localObject1).asSubclass((Class)localObject3);
        localObject3 = sConstructorSignature;
        localObject1 = ((Class)localObject1).getConstructor((Class[])localObject3);
        localObject3 = sConstructorMap;
        ((Map)localObject3).put(paramString1, localObject1);
        boolean bool = true;
        ((Constructor)localObject1).setAccessible(bool);
        localObject3 = this.mConstructorArgs;
        localObject1 = ((Constructor)localObject1).newInstance((Object[])localObject3);
        localObject1 = (View)localObject1;
      }
      catch (Exception localException)
      {
        Object localObject2 = null;
        continue;
      }
      return (View)localObject1;
      localObject1 = paramString1;
    }
  }
  
  private View createViewFromTag(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    i = 1;
    Object localObject1 = "view";
    boolean bool = paramString.equals(localObject1);
    if (bool)
    {
      localObject1 = "class";
      paramString = paramAttributeSet.getAttributeValue(null, (String)localObject1);
    }
    for (;;)
    {
      try
      {
        localObject1 = this.mConstructorArgs;
        k = 0;
        arrayOfObject = null;
        localObject1[0] = paramContext;
        localObject1 = this.mConstructorArgs;
        k = 1;
        localObject1[k] = paramAttributeSet;
        j = -1;
        k = 46;
        k = paramString.indexOf(k);
        if (j != k) {
          continue;
        }
        k = 0;
        arrayOfObject = null;
        localObject1 = sClassPrefixList;
        j = localObject1.length;
        if (k >= j) {
          continue;
        }
        localObject1 = sClassPrefixList;
        localObject1 = localObject1[k];
        localObject1 = createViewByPrefix(paramContext, paramString, (String)localObject1);
        if (localObject1 == null) {
          continue;
        }
        this.mConstructorArgs[0] = null;
        arrayOfObject = this.mConstructorArgs;
        arrayOfObject[i] = null;
      }
      catch (Exception localException)
      {
        int k;
        Object[] arrayOfObject;
        this.mConstructorArgs[0] = null;
        this.mConstructorArgs[i] = null;
        int j = 0;
        Object localObject2 = null;
        continue;
      }
      finally
      {
        this.mConstructorArgs[0] = null;
        this.mConstructorArgs[i] = null;
      }
      return (View)localObject1;
      j = k + 1;
      k = j;
      continue;
      this.mConstructorArgs[0] = null;
      this.mConstructorArgs[i] = null;
      j = 0;
      localObject1 = null;
      continue;
      j = 0;
      localObject1 = null;
      localObject1 = createViewByPrefix(paramContext, paramString, null);
      this.mConstructorArgs[0] = null;
      arrayOfObject = this.mConstructorArgs;
      arrayOfObject[i] = null;
    }
  }
  
  private static Context themifyContext(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 0;
    String str1 = null;
    Object localObject = R.styleable.View;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject, 0, 0);
    int j;
    if (paramBoolean1)
    {
      j = R.styleable.View_android_theme;
      j = localTypedArray.getResourceId(j, 0);
    }
    for (;;)
    {
      if ((paramBoolean2) && (j == 0))
      {
        j = R.styleable.View_theme;
        j = localTypedArray.getResourceId(j, 0);
        if (j != 0)
        {
          str1 = "AppCompatViewInflater";
          String str2 = "app:theme is now deprecated. Please move to using android:theme instead.";
          Log.i(str1, str2);
        }
      }
      i = j;
      localTypedArray.recycle();
      if (j != 0)
      {
        boolean bool = paramContext instanceof ContextThemeWrapper;
        if (bool)
        {
          localObject = paramContext;
          localObject = (ContextThemeWrapper)paramContext;
          k = ((ContextThemeWrapper)localObject).getThemeResId();
          if (k == i) {}
        }
        else
        {
          localObject = new android/support/v7/view/ContextThemeWrapper;
          ((ContextThemeWrapper)localObject).<init>((Context)paramContext, i);
          paramContext = (Context)localObject;
        }
      }
      return (Context)paramContext;
      int k = 0;
      localObject = null;
    }
  }
  
  private void verifyNotNull(View paramView, String paramString)
  {
    if (paramView == null)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = getClass().getName();
      localObject = str + " asked to inflate view for <" + paramString + ">, but returned null";
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
  }
  
  protected AppCompatAutoCompleteTextView createAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatAutoCompleteTextView localAppCompatAutoCompleteTextView = new android/support/v7/widget/AppCompatAutoCompleteTextView;
    localAppCompatAutoCompleteTextView.<init>(paramContext, paramAttributeSet);
    return localAppCompatAutoCompleteTextView;
  }
  
  protected AppCompatButton createButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatButton localAppCompatButton = new android/support/v7/widget/AppCompatButton;
    localAppCompatButton.<init>(paramContext, paramAttributeSet);
    return localAppCompatButton;
  }
  
  protected AppCompatCheckBox createCheckBox(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatCheckBox localAppCompatCheckBox = new android/support/v7/widget/AppCompatCheckBox;
    localAppCompatCheckBox.<init>(paramContext, paramAttributeSet);
    return localAppCompatCheckBox;
  }
  
  protected AppCompatCheckedTextView createCheckedTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatCheckedTextView localAppCompatCheckedTextView = new android/support/v7/widget/AppCompatCheckedTextView;
    localAppCompatCheckedTextView.<init>(paramContext, paramAttributeSet);
    return localAppCompatCheckedTextView;
  }
  
  protected AppCompatEditText createEditText(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatEditText localAppCompatEditText = new android/support/v7/widget/AppCompatEditText;
    localAppCompatEditText.<init>(paramContext, paramAttributeSet);
    return localAppCompatEditText;
  }
  
  protected AppCompatImageButton createImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatImageButton localAppCompatImageButton = new android/support/v7/widget/AppCompatImageButton;
    localAppCompatImageButton.<init>(paramContext, paramAttributeSet);
    return localAppCompatImageButton;
  }
  
  protected AppCompatImageView createImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatImageView localAppCompatImageView = new android/support/v7/widget/AppCompatImageView;
    localAppCompatImageView.<init>(paramContext, paramAttributeSet);
    return localAppCompatImageView;
  }
  
  protected AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatMultiAutoCompleteTextView localAppCompatMultiAutoCompleteTextView = new android/support/v7/widget/AppCompatMultiAutoCompleteTextView;
    localAppCompatMultiAutoCompleteTextView.<init>(paramContext, paramAttributeSet);
    return localAppCompatMultiAutoCompleteTextView;
  }
  
  protected AppCompatRadioButton createRadioButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatRadioButton localAppCompatRadioButton = new android/support/v7/widget/AppCompatRadioButton;
    localAppCompatRadioButton.<init>(paramContext, paramAttributeSet);
    return localAppCompatRadioButton;
  }
  
  protected AppCompatRatingBar createRatingBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatRatingBar localAppCompatRatingBar = new android/support/v7/widget/AppCompatRatingBar;
    localAppCompatRatingBar.<init>(paramContext, paramAttributeSet);
    return localAppCompatRatingBar;
  }
  
  protected AppCompatSeekBar createSeekBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatSeekBar localAppCompatSeekBar = new android/support/v7/widget/AppCompatSeekBar;
    localAppCompatSeekBar.<init>(paramContext, paramAttributeSet);
    return localAppCompatSeekBar;
  }
  
  protected AppCompatSpinner createSpinner(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatSpinner localAppCompatSpinner = new android/support/v7/widget/AppCompatSpinner;
    localAppCompatSpinner.<init>(paramContext, paramAttributeSet);
    return localAppCompatSpinner;
  }
  
  protected AppCompatTextView createTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppCompatTextView localAppCompatTextView = new android/support/v7/widget/AppCompatTextView;
    localAppCompatTextView.<init>(paramContext, paramAttributeSet);
    return localAppCompatTextView;
  }
  
  protected View createView(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    return null;
  }
  
  final View createView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4)
  {
    if ((paramBoolean1) && (paramView != null)) {}
    for (Object localObject1 = paramView.getContext();; localObject1 = paramContext)
    {
      if ((paramBoolean2) || (paramBoolean3)) {
        localObject1 = themifyContext((Context)localObject1, paramAttributeSet, paramBoolean2, paramBoolean3);
      }
      if (paramBoolean4) {
        localObject1 = TintContextWrapper.wrap((Context)localObject1);
      }
      int i = -1;
      int j = paramString.hashCode();
      Object localObject2;
      switch (j)
      {
      default: 
        switch (i)
        {
        default: 
          localObject2 = createView((Context)localObject1, paramString, paramAttributeSet);
          label255:
          if ((localObject2 != null) || (paramContext == localObject1)) {}
          break;
        }
        break;
      }
      for (localObject1 = createViewFromTag((Context)localObject1, paramString, paramAttributeSet);; localObject1 = localObject2)
      {
        if (localObject1 != null) {
          checkOnClickListener((View)localObject1, paramAttributeSet);
        }
        return (View)localObject1;
        String str = "TextView";
        boolean bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 0;
        localObject2 = null;
        break;
        str = "ImageView";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 1;
        break;
        str = "Button";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 2;
        break;
        str = "EditText";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 3;
        break;
        str = "Spinner";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 4;
        break;
        str = "ImageButton";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 5;
        break;
        str = "CheckBox";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 6;
        break;
        str = "RadioButton";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 7;
        break;
        str = "CheckedTextView";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 8;
        break;
        str = "AutoCompleteTextView";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 9;
        break;
        str = "MultiAutoCompleteTextView";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 10;
        break;
        str = "RatingBar";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 11;
        break;
        str = "SeekBar";
        bool = paramString.equals(str);
        if (!bool) {
          break;
        }
        i = 12;
        break;
        localObject2 = createTextView((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createImageView((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createButton((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createEditText((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createSpinner((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createImageButton((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createCheckBox((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createRadioButton((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createCheckedTextView((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createAutoCompleteTextView((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createMultiAutoCompleteTextView((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createRatingBar((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
        localObject2 = createSeekBar((Context)localObject1, paramAttributeSet);
        verifyNotNull((View)localObject2, paramString);
        break label255;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatViewInflater.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */