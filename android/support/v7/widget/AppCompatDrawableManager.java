package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.c.a.i;
import android.support.v4.a.b;
import android.support.v4.h.f;
import android.support.v4.h.n;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.color;
import android.support.v7.appcompat.R.drawable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class AppCompatDrawableManager
{
  private static final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY;
  private static final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED;
  private static final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL;
  private static final AppCompatDrawableManager.ColorFilterLruCache COLOR_FILTER_CACHE;
  private static final boolean DEBUG = false;
  private static final PorterDuff.Mode DEFAULT_MODE;
  private static AppCompatDrawableManager INSTANCE;
  private static final String PLATFORM_VD_CLAZZ = "android.graphics.drawable.VectorDrawable";
  private static final String SKIP_DRAWABLE_TAG = "appcompat_skip_skip";
  private static final String TAG = "AppCompatDrawableManag";
  private static final int[] TINT_CHECKABLE_BUTTON_LIST;
  private static final int[] TINT_COLOR_CONTROL_NORMAL;
  private static final int[] TINT_COLOR_CONTROL_STATE_LIST;
  private android.support.v4.h.a mDelegates;
  private final Object mDrawableCacheLock;
  private final WeakHashMap mDrawableCaches;
  private boolean mHasCheckedVectorDrawableSetup;
  private n mKnownDrawableIdTags;
  private WeakHashMap mTintLists;
  private TypedValue mTypedValue;
  
  static
  {
    int i = 6;
    int j = 3;
    int k = 2;
    int m = 1;
    DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    Object localObject = new android/support/v7/widget/AppCompatDrawableManager$ColorFilterLruCache;
    ((AppCompatDrawableManager.ColorFilterLruCache)localObject).<init>(i);
    COLOR_FILTER_CACHE = (AppCompatDrawableManager.ColorFilterLruCache)localObject;
    localObject = new int[j];
    int n = R.drawable.abc_textfield_search_default_mtrl_alpha;
    localObject[0] = n;
    n = R.drawable.abc_textfield_default_mtrl_alpha;
    localObject[m] = n;
    n = R.drawable.abc_ab_share_pack_mtrl_alpha;
    localObject[k] = n;
    COLORFILTER_TINT_COLOR_CONTROL_NORMAL = (int[])localObject;
    localObject = new int[7];
    n = R.drawable.abc_ic_commit_search_api_mtrl_alpha;
    localObject[0] = n;
    n = R.drawable.abc_seekbar_tick_mark_material;
    localObject[m] = n;
    n = R.drawable.abc_ic_menu_share_mtrl_alpha;
    localObject[k] = n;
    n = R.drawable.abc_ic_menu_copy_mtrl_am_alpha;
    localObject[j] = n;
    int i1 = R.drawable.abc_ic_menu_cut_mtrl_alpha;
    localObject[4] = i1;
    i1 = R.drawable.abc_ic_menu_selectall_mtrl_alpha;
    localObject[5] = i1;
    n = R.drawable.abc_ic_menu_paste_mtrl_am_alpha;
    localObject[i] = n;
    TINT_COLOR_CONTROL_NORMAL = (int[])localObject;
    localObject = new int[10];
    n = R.drawable.abc_textfield_activated_mtrl_alpha;
    localObject[0] = n;
    n = R.drawable.abc_textfield_search_activated_mtrl_alpha;
    localObject[m] = n;
    n = R.drawable.abc_cab_background_top_mtrl_alpha;
    localObject[k] = n;
    n = R.drawable.abc_text_cursor_material;
    localObject[j] = n;
    i1 = R.drawable.abc_text_select_handle_left_mtrl_dark;
    localObject[4] = i1;
    i1 = R.drawable.abc_text_select_handle_middle_mtrl_dark;
    localObject[5] = i1;
    n = R.drawable.abc_text_select_handle_right_mtrl_dark;
    localObject[i] = n;
    i1 = R.drawable.abc_text_select_handle_left_mtrl_light;
    localObject[7] = i1;
    i1 = R.drawable.abc_text_select_handle_middle_mtrl_light;
    localObject[8] = i1;
    i1 = R.drawable.abc_text_select_handle_right_mtrl_light;
    localObject[9] = i1;
    COLORFILTER_COLOR_CONTROL_ACTIVATED = (int[])localObject;
    localObject = new int[j];
    n = R.drawable.abc_popup_background_mtrl_mult;
    localObject[0] = n;
    n = R.drawable.abc_cab_background_internal_bg;
    localObject[m] = n;
    n = R.drawable.abc_menu_hardkey_panel_mtrl_mult;
    localObject[k] = n;
    COLORFILTER_COLOR_BACKGROUND_MULTIPLY = (int[])localObject;
    localObject = new int[k];
    n = R.drawable.abc_tab_indicator_material;
    localObject[0] = n;
    n = R.drawable.abc_textfield_search_material;
    localObject[m] = n;
    TINT_COLOR_CONTROL_STATE_LIST = (int[])localObject;
    localObject = new int[k];
    n = R.drawable.abc_btn_check_material;
    localObject[0] = n;
    n = R.drawable.abc_btn_radio_material;
    localObject[m] = n;
    TINT_CHECKABLE_BUTTON_LIST = (int[])localObject;
  }
  
  public AppCompatDrawableManager()
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.mDrawableCacheLock = localObject;
    localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>(0);
    this.mDrawableCaches = ((WeakHashMap)localObject);
  }
  
  private void addDelegate(String paramString, AppCompatDrawableManager.InflateDelegate paramInflateDelegate)
  {
    android.support.v4.h.a locala = this.mDelegates;
    if (locala == null)
    {
      locala = new android/support/v4/h/a;
      locala.<init>();
      this.mDelegates = locala;
    }
    this.mDelegates.put(paramString, paramInflateDelegate);
  }
  
  private boolean addDrawableToCache(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    Drawable.ConstantState localConstantState = paramDrawable.getConstantState();
    if (localConstantState != null) {}
    for (;;)
    {
      synchronized (this.mDrawableCacheLock)
      {
        Object localObject2 = this.mDrawableCaches;
        localObject2 = ((WeakHashMap)localObject2).get(paramContext);
        localObject2 = (f)localObject2;
        if (localObject2 == null)
        {
          localObject2 = new android/support/v4/h/f;
          ((f)localObject2).<init>();
          localObject5 = this.mDrawableCaches;
          ((WeakHashMap)localObject5).put(paramContext, localObject2);
        }
        Object localObject5 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject5).<init>(localConstantState);
        ((f)localObject2).b(paramLong, localObject5);
        bool = true;
        return bool;
      }
      boolean bool = false;
      Object localObject4 = null;
    }
  }
  
  private void addTintListToCache(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    Object localObject = this.mTintLists;
    if (localObject == null)
    {
      localObject = new java/util/WeakHashMap;
      ((WeakHashMap)localObject).<init>();
      this.mTintLists = ((WeakHashMap)localObject);
    }
    localObject = (n)this.mTintLists.get(paramContext);
    if (localObject == null)
    {
      localObject = new android/support/v4/h/n;
      ((n)localObject).<init>();
      WeakHashMap localWeakHashMap = this.mTintLists;
      localWeakHashMap.put(paramContext, localObject);
    }
    ((n)localObject).c(paramInt, paramColorStateList);
  }
  
  private static boolean arrayContains(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool = false;
    int i = paramArrayOfInt.length;
    int j = 0;
    for (;;)
    {
      if (j < i)
      {
        int k = paramArrayOfInt[j];
        if (k == paramInt) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      j += 1;
    }
  }
  
  private void checkVectorDrawableSetup(Context paramContext)
  {
    boolean bool1 = this.mHasCheckedVectorDrawableSetup;
    if (bool1) {}
    boolean bool2;
    do
    {
      return;
      this.mHasCheckedVectorDrawableSetup = true;
      int i = R.drawable.abc_vector_test;
      localObject = getDrawable(paramContext, i);
      if (localObject == null) {
        break;
      }
      bool2 = isVectorDrawable((Drawable)localObject);
    } while (bool2);
    this.mHasCheckedVectorDrawableSetup = false;
    Object localObject = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject).<init>("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    throw ((Throwable)localObject);
  }
  
  private ColorStateList createBorderlessButtonColorStateList(Context paramContext)
  {
    return createButtonColorStateList(paramContext, 0);
  }
  
  private ColorStateList createButtonColorStateList(Context paramContext, int paramInt)
  {
    int i = 4;
    int[][] arrayOfInt = new int[i][];
    int[] arrayOfInt1 = new int[i];
    int j = R.attr.colorControlHighlight;
    j = ThemeUtils.getThemeAttrColor(paramContext, j);
    int k = R.attr.colorButtonNormal;
    k = ThemeUtils.getDisabledThemeAttrColor(paramContext, k);
    int[] arrayOfInt2 = ThemeUtils.DISABLED_STATE_SET;
    arrayOfInt[0] = arrayOfInt2;
    arrayOfInt1[0] = k;
    int m = 1;
    int[] arrayOfInt3 = ThemeUtils.PRESSED_STATE_SET;
    arrayOfInt[m] = arrayOfInt3;
    k = android.support.v4.b.a.a(j, paramInt);
    arrayOfInt1[m] = k;
    m = 2;
    arrayOfInt3 = ThemeUtils.FOCUSED_STATE_SET;
    arrayOfInt[m] = arrayOfInt3;
    j = android.support.v4.b.a.a(j, paramInt);
    arrayOfInt1[m] = j;
    m = 3;
    int[] arrayOfInt4 = ThemeUtils.EMPTY_STATE_SET;
    arrayOfInt[m] = arrayOfInt4;
    arrayOfInt1[m] = paramInt;
    ColorStateList localColorStateList = new android/content/res/ColorStateList;
    localColorStateList.<init>(arrayOfInt, arrayOfInt1);
    return localColorStateList;
  }
  
  private static long createCacheKey(TypedValue paramTypedValue)
  {
    long l1 = paramTypedValue.assetCookie << 32;
    long l2 = paramTypedValue.data;
    return l1 | l2;
  }
  
  private ColorStateList createColoredButtonColorStateList(Context paramContext)
  {
    int i = R.attr.colorAccent;
    i = ThemeUtils.getThemeAttrColor(paramContext, i);
    return createButtonColorStateList(paramContext, i);
  }
  
  private ColorStateList createDefaultButtonColorStateList(Context paramContext)
  {
    int i = R.attr.colorButtonNormal;
    i = ThemeUtils.getThemeAttrColor(paramContext, i);
    return createButtonColorStateList(paramContext, i);
  }
  
  private Drawable createDrawableIfNeeded(Context paramContext, int paramInt)
  {
    boolean bool = true;
    Object localObject = this.mTypedValue;
    if (localObject == null)
    {
      localObject = new android/util/TypedValue;
      ((TypedValue)localObject).<init>();
      this.mTypedValue = ((TypedValue)localObject);
    }
    TypedValue localTypedValue = this.mTypedValue;
    paramContext.getResources().getValue(paramInt, localTypedValue, bool);
    long l = createCacheKey(localTypedValue);
    localObject = getCachedDrawable(paramContext, l);
    if (localObject != null) {}
    for (;;)
    {
      return (Drawable)localObject;
      int i = R.drawable.abc_cab_background_top_material;
      if (paramInt == i)
      {
        localObject = new android/graphics/drawable/LayerDrawable;
        i = 2;
        Drawable[] arrayOfDrawable = new Drawable[i];
        int j = R.drawable.abc_cab_background_internal_bg;
        Drawable localDrawable1 = getDrawable(paramContext, j);
        arrayOfDrawable[0] = localDrawable1;
        int k = R.drawable.abc_cab_background_top_mtrl_alpha;
        Drawable localDrawable2 = getDrawable(paramContext, k);
        arrayOfDrawable[bool] = localDrawable2;
        ((LayerDrawable)localObject).<init>(arrayOfDrawable);
      }
      if (localObject != null)
      {
        int m = localTypedValue.changingConfigurations;
        ((Drawable)localObject).setChangingConfigurations(m);
        addDrawableToCache(paramContext, l, (Drawable)localObject);
      }
    }
  }
  
  private ColorStateList createSwitchThumbColorStateList(Context paramContext)
  {
    int i = 3;
    int j = 2;
    int k = 1;
    int[][] arrayOfInt = new int[i][];
    int[] arrayOfInt1 = new int[i];
    int m = R.attr.colorSwitchThumbNormal;
    Object localObject = ThemeUtils.getThemeAttrColorStateList(paramContext, m);
    if (localObject != null)
    {
      boolean bool = ((ColorStateList)localObject).isStateful();
      if (bool)
      {
        int[] arrayOfInt2 = ThemeUtils.DISABLED_STATE_SET;
        arrayOfInt[0] = arrayOfInt2;
        arrayOfInt2 = arrayOfInt[0];
        int n = ((ColorStateList)localObject).getColorForState(arrayOfInt2, 0);
        arrayOfInt1[0] = n;
        arrayOfInt2 = ThemeUtils.CHECKED_STATE_SET;
        arrayOfInt[k] = arrayOfInt2;
        n = R.attr.colorControlActivated;
        n = ThemeUtils.getThemeAttrColor(paramContext, n);
        arrayOfInt1[k] = n;
        arrayOfInt2 = ThemeUtils.EMPTY_STATE_SET;
        arrayOfInt[j] = arrayOfInt2;
        m = ((ColorStateList)localObject).getDefaultColor();
        arrayOfInt1[j] = m;
      }
    }
    for (;;)
    {
      localObject = new android/content/res/ColorStateList;
      ((ColorStateList)localObject).<init>(arrayOfInt, arrayOfInt1);
      return (ColorStateList)localObject;
      localObject = ThemeUtils.DISABLED_STATE_SET;
      arrayOfInt[0] = localObject;
      m = R.attr.colorSwitchThumbNormal;
      m = ThemeUtils.getDisabledThemeAttrColor(paramContext, m);
      arrayOfInt1[0] = m;
      localObject = ThemeUtils.CHECKED_STATE_SET;
      arrayOfInt[k] = localObject;
      m = R.attr.colorControlActivated;
      m = ThemeUtils.getThemeAttrColor(paramContext, m);
      arrayOfInt1[k] = m;
      localObject = ThemeUtils.EMPTY_STATE_SET;
      arrayOfInt[j] = localObject;
      m = R.attr.colorSwitchThumbNormal;
      m = ThemeUtils.getThemeAttrColor(paramContext, m);
      arrayOfInt1[j] = m;
    }
  }
  
  private static PorterDuffColorFilter createTintFilter(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt)
  {
    int i;
    if ((paramColorStateList == null) || (paramMode == null)) {
      i = 0;
    }
    for (PorterDuffColorFilter localPorterDuffColorFilter = null;; localPorterDuffColorFilter = getPorterDuffColorFilter(i, paramMode))
    {
      return localPorterDuffColorFilter;
      i = paramColorStateList.getColorForState(paramArrayOfInt, 0);
    }
  }
  
  public static AppCompatDrawableManager get()
  {
    AppCompatDrawableManager localAppCompatDrawableManager = INSTANCE;
    if (localAppCompatDrawableManager == null)
    {
      localAppCompatDrawableManager = new android/support/v7/widget/AppCompatDrawableManager;
      localAppCompatDrawableManager.<init>();
      INSTANCE = localAppCompatDrawableManager;
      localAppCompatDrawableManager = INSTANCE;
      installDefaultInflateDelegates(localAppCompatDrawableManager);
    }
    return INSTANCE;
  }
  
  private Drawable getCachedDrawable(Context paramContext, long paramLong)
  {
    for (;;)
    {
      synchronized (this.mDrawableCacheLock)
      {
        Object localObject2 = this.mDrawableCaches;
        localObject2 = ((WeakHashMap)localObject2).get(paramContext);
        localObject2 = (f)localObject2;
        if (localObject2 == null)
        {
          localObject2 = null;
          return (Drawable)localObject2;
        }
        Object localObject5 = ((f)localObject2).a(paramLong);
        localObject5 = (WeakReference)localObject5;
        if (localObject5 == null) {
          break label118;
        }
        localObject5 = ((WeakReference)localObject5).get();
        localObject5 = (Drawable.ConstantState)localObject5;
        if (localObject5 != null)
        {
          localObject2 = paramContext.getResources();
          localObject2 = ((Drawable.ConstantState)localObject5).newDrawable((Resources)localObject2);
        }
      }
      ((f)localObject3).b(paramLong);
      label118:
      Object localObject4 = null;
    }
  }
  
  public static PorterDuffColorFilter getPorterDuffColorFilter(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuffColorFilter localPorterDuffColorFilter = COLOR_FILTER_CACHE.get(paramInt, paramMode);
    if (localPorterDuffColorFilter == null)
    {
      localPorterDuffColorFilter = new android/graphics/PorterDuffColorFilter;
      localPorterDuffColorFilter.<init>(paramInt, paramMode);
      AppCompatDrawableManager.ColorFilterLruCache localColorFilterLruCache = COLOR_FILTER_CACHE;
      localColorFilterLruCache.put(paramInt, paramMode, localPorterDuffColorFilter);
    }
    return localPorterDuffColorFilter;
  }
  
  private ColorStateList getTintListFromCache(Context paramContext, int paramInt)
  {
    Object localObject = this.mTintLists;
    if (localObject != null)
    {
      localObject = (n)this.mTintLists.get(paramContext);
      if (localObject != null) {
        localObject = (ColorStateList)((n)localObject).a(paramInt);
      }
    }
    for (;;)
    {
      return (ColorStateList)localObject;
      localObject = null;
      continue;
      localObject = null;
    }
  }
  
  static PorterDuff.Mode getTintMode(int paramInt)
  {
    PorterDuff.Mode localMode = null;
    int i = R.drawable.abc_switch_thumb_material;
    if (paramInt == i) {
      localMode = PorterDuff.Mode.MULTIPLY;
    }
    return localMode;
  }
  
  private static void installDefaultInflateDelegates(AppCompatDrawableManager paramAppCompatDrawableManager)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 24;
    if (i < j)
    {
      Object localObject = new android/support/v7/widget/AppCompatDrawableManager$VdcInflateDelegate;
      ((AppCompatDrawableManager.VdcInflateDelegate)localObject).<init>();
      paramAppCompatDrawableManager.addDelegate("vector", (AppCompatDrawableManager.InflateDelegate)localObject);
      String str = "animated-vector";
      localObject = new android/support/v7/widget/AppCompatDrawableManager$AvdcInflateDelegate;
      ((AppCompatDrawableManager.AvdcInflateDelegate)localObject).<init>();
      paramAppCompatDrawableManager.addDelegate(str, (AppCompatDrawableManager.InflateDelegate)localObject);
    }
  }
  
  private static boolean isVectorDrawable(Drawable paramDrawable)
  {
    boolean bool = paramDrawable instanceof i;
    String str1;
    if (!bool)
    {
      str1 = "android.graphics.drawable.VectorDrawable";
      String str2 = paramDrawable.getClass().getName();
      bool = str1.equals(str2);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      str1 = null;
    }
  }
  
  private Drawable loadDrawableFromDelegates(Context paramContext, int paramInt)
  {
    Object localObject1 = null;
    int i = 2;
    int j = 1;
    Object localObject2 = this.mDelegates;
    Object localObject4;
    if (localObject2 != null)
    {
      localObject2 = this.mDelegates;
      boolean bool1 = ((android.support.v4.h.a)localObject2).isEmpty();
      if (!bool1)
      {
        localObject2 = this.mKnownDrawableIdTags;
        if (localObject2 != null)
        {
          localObject2 = (String)this.mKnownDrawableIdTags.a(paramInt);
          localObject4 = "appcompat_skip_skip";
          boolean bool3 = ((String)localObject4).equals(localObject2);
          if (!bool3)
          {
            if (localObject2 == null) {
              break label129;
            }
            localObject4 = this.mDelegates;
            localObject2 = ((android.support.v4.h.a)localObject4).get(localObject2);
            if (localObject2 != null) {
              break label129;
            }
          }
          bool1 = false;
          localObject2 = null;
        }
      }
    }
    for (;;)
    {
      return (Drawable)localObject2;
      localObject2 = new android/support/v4/h/n;
      ((n)localObject2).<init>();
      this.mKnownDrawableIdTags = ((n)localObject2);
      label129:
      localObject2 = this.mTypedValue;
      if (localObject2 == null)
      {
        localObject2 = new android/util/TypedValue;
        ((TypedValue)localObject2).<init>();
        this.mTypedValue = ((TypedValue)localObject2);
      }
      localObject4 = this.mTypedValue;
      localObject2 = paramContext.getResources();
      ((Resources)localObject2).getValue(paramInt, (TypedValue)localObject4, j);
      long l = createCacheKey((TypedValue)localObject4);
      localObject1 = getCachedDrawable(paramContext, l);
      if (localObject1 != null)
      {
        localObject2 = localObject1;
      }
      else
      {
        Object localObject5 = ((TypedValue)localObject4).string;
        Object localObject6;
        if (localObject5 != null)
        {
          localObject5 = ((TypedValue)localObject4).string.toString();
          localObject6 = ".xml";
          boolean bool4 = ((String)localObject5).endsWith((String)localObject6);
          if (bool4) {
            try
            {
              localObject5 = ((Resources)localObject2).getXml(paramInt);
              localObject6 = Xml.asAttributeSet((XmlPullParser)localObject5);
              int k;
              do
              {
                k = ((XmlPullParser)localObject5).next();
              } while ((k != i) && (k != j));
              if (k != i)
              {
                localObject2 = new org/xmlpull/v1/XmlPullParserException;
                localObject4 = "No start tag found";
                ((XmlPullParserException)localObject2).<init>((String)localObject4);
                throw ((Throwable)localObject2);
              }
            }
            catch (Exception localException)
            {
              localObject4 = "AppCompatDrawableManag";
              localObject5 = "Exception while inflating drawable";
              Log.e((String)localObject4, (String)localObject5, localException);
            }
          }
        }
        for (Object localObject3 = localObject1;; localObject3 = localObject1)
        {
          if (localObject3 != null) {
            break label466;
          }
          localObject1 = this.mKnownDrawableIdTags;
          localObject4 = "appcompat_skip_skip";
          ((n)localObject1).c(paramInt, localObject4);
          break;
          localObject3 = ((XmlPullParser)localObject5).getName();
          Object localObject7 = this.mKnownDrawableIdTags;
          ((n)localObject7).c(paramInt, localObject3);
          localObject7 = this.mDelegates;
          localObject3 = ((android.support.v4.h.a)localObject7).get(localObject3);
          localObject3 = (AppCompatDrawableManager.InflateDelegate)localObject3;
          if (localObject3 != null)
          {
            localObject7 = paramContext.getTheme();
            localObject1 = ((AppCompatDrawableManager.InflateDelegate)localObject3).createFromXmlInner(paramContext, (XmlPullParser)localObject5, (AttributeSet)localObject6, (Resources.Theme)localObject7);
          }
          if (localObject1 != null)
          {
            int m = ((TypedValue)localObject4).changingConfigurations;
            ((Drawable)localObject1).setChangingConfigurations(m);
            bool2 = addDrawableToCache(paramContext, l, (Drawable)localObject1);
            if (!bool2) {}
          }
        }
        label466:
        continue;
        boolean bool2 = false;
        localObject3 = null;
      }
    }
  }
  
  private void removeDelegate(String paramString, AppCompatDrawableManager.InflateDelegate paramInflateDelegate)
  {
    Object localObject = this.mDelegates;
    if (localObject != null)
    {
      localObject = this.mDelegates.get(paramString);
      if (localObject == paramInflateDelegate)
      {
        localObject = this.mDelegates;
        ((android.support.v4.h.a)localObject).remove(paramString);
      }
    }
  }
  
  private static void setPorterDuffColorFilter(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    boolean bool = DrawableUtils.canSafelyMutateDrawable(paramDrawable);
    if (bool) {
      paramDrawable = paramDrawable.mutate();
    }
    if (paramMode == null) {
      paramMode = DEFAULT_MODE;
    }
    PorterDuffColorFilter localPorterDuffColorFilter = getPorterDuffColorFilter(paramInt, paramMode);
    paramDrawable.setColorFilter(localPorterDuffColorFilter);
  }
  
  private Drawable tintDrawable(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    int i = 16908303;
    int j = 16908301;
    int k = 16908288;
    Object localObject = getTintList(paramContext, paramInt);
    int m;
    if (localObject != null)
    {
      m = DrawableUtils.canSafelyMutateDrawable(paramDrawable);
      if (m != 0) {
        paramDrawable = paramDrawable.mutate();
      }
      paramDrawable = android.support.v4.b.a.a.g(paramDrawable);
      android.support.v4.b.a.a.a(paramDrawable, (ColorStateList)localObject);
      localObject = getTintMode(paramInt);
      if (localObject != null) {
        android.support.v4.b.a.a.a(paramDrawable, (PorterDuff.Mode)localObject);
      }
    }
    for (;;)
    {
      return paramDrawable;
      int i1 = R.drawable.abc_seekbar_track_material;
      Drawable localDrawable;
      int i2;
      PorterDuff.Mode localMode1;
      int n;
      PorterDuff.Mode localMode2;
      if (paramInt == i1)
      {
        localObject = paramDrawable;
        localObject = (LayerDrawable)paramDrawable;
        localDrawable = ((LayerDrawable)localObject).findDrawableByLayerId(m);
        i2 = R.attr.colorControlNormal;
        i2 = ThemeUtils.getThemeAttrColor(paramContext, i2);
        localMode1 = DEFAULT_MODE;
        setPorterDuffColorFilter(localDrawable, i2, localMode1);
        localDrawable = ((LayerDrawable)localObject).findDrawableByLayerId(i);
        i2 = R.attr.colorControlNormal;
        i2 = ThemeUtils.getThemeAttrColor(paramContext, i2);
        localMode1 = DEFAULT_MODE;
        setPorterDuffColorFilter(localDrawable, i2, localMode1);
        localObject = ((LayerDrawable)localObject).findDrawableByLayerId(j);
        n = R.attr.colorControlActivated;
        n = ThemeUtils.getThemeAttrColor(paramContext, n);
        localMode2 = DEFAULT_MODE;
        setPorterDuffColorFilter((Drawable)localObject, n, localMode2);
      }
      else
      {
        i1 = R.drawable.abc_ratingbar_material;
        if (paramInt != i1)
        {
          i1 = R.drawable.abc_ratingbar_indicator_material;
          if (paramInt != i1)
          {
            i1 = R.drawable.abc_ratingbar_small_material;
            if (paramInt != i1) {
              break label370;
            }
          }
        }
        localObject = paramDrawable;
        localObject = (LayerDrawable)paramDrawable;
        localDrawable = ((LayerDrawable)localObject).findDrawableByLayerId(n);
        i2 = R.attr.colorControlNormal;
        i2 = ThemeUtils.getDisabledThemeAttrColor(paramContext, i2);
        localMode1 = DEFAULT_MODE;
        setPorterDuffColorFilter(localDrawable, i2, localMode1);
        localDrawable = ((LayerDrawable)localObject).findDrawableByLayerId(i);
        i2 = R.attr.colorControlActivated;
        i2 = ThemeUtils.getThemeAttrColor(paramContext, i2);
        localMode1 = DEFAULT_MODE;
        setPorterDuffColorFilter(localDrawable, i2, localMode1);
        localObject = ((LayerDrawable)localObject).findDrawableByLayerId(j);
        n = R.attr.colorControlActivated;
        n = ThemeUtils.getThemeAttrColor(paramContext, n);
        localMode2 = DEFAULT_MODE;
        setPorterDuffColorFilter((Drawable)localObject, n, localMode2);
        continue;
        label370:
        boolean bool = tintDrawableUsingColorFilter(paramContext, paramInt, paramDrawable);
        if ((!bool) && (paramBoolean)) {
          paramDrawable = null;
        }
      }
    }
  }
  
  static void tintDrawable(Drawable paramDrawable, TintInfo paramTintInfo, int[] paramArrayOfInt)
  {
    boolean bool1 = DrawableUtils.canSafelyMutateDrawable(paramDrawable);
    Object localObject1;
    Object localObject2;
    if (bool1)
    {
      localObject1 = paramDrawable.mutate();
      if (localObject1 != paramDrawable)
      {
        localObject1 = "AppCompatDrawableManag";
        localObject2 = "Mutated drawable is not the same instance as the input.";
        Log.d((String)localObject1, (String)localObject2);
        return;
      }
    }
    bool1 = paramTintInfo.mHasTintList;
    if (!bool1)
    {
      bool1 = paramTintInfo.mHasTintMode;
      if (!bool1) {}
    }
    else
    {
      bool1 = paramTintInfo.mHasTintList;
      if (bool1)
      {
        localObject1 = paramTintInfo.mTintList;
        label72:
        boolean bool2 = paramTintInfo.mHasTintMode;
        if (!bool2) {
          break label134;
        }
        localObject2 = paramTintInfo.mTintMode;
        label89:
        localObject1 = createTintFilter((ColorStateList)localObject1, (PorterDuff.Mode)localObject2, paramArrayOfInt);
        paramDrawable.setColorFilter((ColorFilter)localObject1);
      }
    }
    for (;;)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 23;
      if (i > j) {
        break;
      }
      paramDrawable.invalidateSelf();
      break;
      i = 0;
      localObject1 = null;
      break label72;
      label134:
      localObject2 = DEFAULT_MODE;
      break label89;
      paramDrawable.clearColorFilter();
    }
  }
  
  static boolean tintDrawableUsingColorFilter(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    int i = 16842801;
    float f1 = 2.3693695E-38F;
    int j = -1;
    float f2 = 0.0F / 0.0F;
    boolean bool1 = false;
    PorterDuffColorFilter localPorterDuffColorFilter = null;
    boolean bool2 = true;
    PorterDuff.Mode localMode = DEFAULT_MODE;
    Object localObject1 = COLORFILTER_TINT_COLOR_CONTROL_NORMAL;
    boolean bool3 = arrayContains((int[])localObject1, paramInt);
    int m;
    Object localObject2;
    boolean bool6;
    if (bool3)
    {
      m = R.attr.colorControlNormal;
      localObject2 = localMode;
      bool6 = bool2;
      i = j;
      f1 = f2;
    }
    for (;;)
    {
      if (bool6)
      {
        bool1 = DrawableUtils.canSafelyMutateDrawable(paramDrawable);
        if (bool1) {
          paramDrawable = paramDrawable.mutate();
        }
        int k = ThemeUtils.getThemeAttrColor(paramContext, m);
        localPorterDuffColorFilter = getPorterDuffColorFilter(k, (PorterDuff.Mode)localObject2);
        paramDrawable.setColorFilter(localPorterDuffColorFilter);
        if (i != j) {
          paramDrawable.setAlpha(i);
        }
      }
      for (;;)
      {
        return bool2;
        localObject1 = COLORFILTER_COLOR_CONTROL_ACTIVATED;
        boolean bool4 = arrayContains((int[])localObject1, paramInt);
        if (bool4)
        {
          int n = R.attr.colorControlActivated;
          localObject2 = localMode;
          bool6 = bool2;
          i = j;
          f1 = f2;
          break;
        }
        localObject1 = COLORFILTER_COLOR_BACKGROUND_MULTIPLY;
        boolean bool5 = arrayContains((int[])localObject1, paramInt);
        if (bool5)
        {
          localObject1 = PorterDuff.Mode.MULTIPLY;
          bool6 = bool2;
          localObject2 = localObject1;
          bool5 = i;
          i = j;
          f1 = f2;
          break;
        }
        i1 = R.drawable.abc_list_divider_mtrl_alpha;
        if (paramInt == i1)
        {
          i1 = 16842800;
          f1 = 40.8F;
          i = Math.round(f1);
          localObject2 = localMode;
          bool6 = bool2;
          break;
        }
        i1 = R.drawable.abc_dialog_material_background;
        if (paramInt != i1) {
          break label288;
        }
        i1 = i;
        localObject2 = localMode;
        bool6 = bool2;
        i = j;
        f1 = f2;
        break;
        bool2 = false;
      }
      label288:
      i = j;
      f1 = f2;
      int i1 = 0;
      localObject1 = null;
      localObject2 = localMode;
      bool6 = false;
      localMode = null;
    }
  }
  
  public Drawable getDrawable(Context paramContext, int paramInt)
  {
    return getDrawable(paramContext, paramInt, false);
  }
  
  Drawable getDrawable(Context paramContext, int paramInt, boolean paramBoolean)
  {
    checkVectorDrawableSetup(paramContext);
    Drawable localDrawable = loadDrawableFromDelegates(paramContext, paramInt);
    if (localDrawable == null) {
      localDrawable = createDrawableIfNeeded(paramContext, paramInt);
    }
    if (localDrawable == null) {
      localDrawable = b.a(paramContext, paramInt);
    }
    if (localDrawable != null) {
      localDrawable = tintDrawable(paramContext, paramInt, paramBoolean, localDrawable);
    }
    if (localDrawable != null) {
      DrawableUtils.fixDrawable(localDrawable);
    }
    return localDrawable;
  }
  
  ColorStateList getTintList(Context paramContext, int paramInt)
  {
    ColorStateList localColorStateList = getTintListFromCache(paramContext, paramInt);
    int i;
    int k;
    if (localColorStateList == null)
    {
      i = R.drawable.abc_edit_text_material;
      if (paramInt != i) {
        break label47;
      }
      k = R.color.abc_tint_edittext;
      localColorStateList = AppCompatResources.getColorStateList(paramContext, k);
    }
    for (;;)
    {
      if (localColorStateList != null) {
        addTintListToCache(paramContext, paramInt, localColorStateList);
      }
      return localColorStateList;
      label47:
      i = R.drawable.abc_switch_track_mtrl_alpha;
      if (paramInt == i)
      {
        k = R.color.abc_tint_switch_track;
        localColorStateList = AppCompatResources.getColorStateList(paramContext, k);
      }
      else
      {
        i = R.drawable.abc_switch_thumb_material;
        if (paramInt == i)
        {
          localColorStateList = createSwitchThumbColorStateList(paramContext);
        }
        else
        {
          i = R.drawable.abc_btn_default_mtrl_shape;
          if (paramInt == i)
          {
            localColorStateList = createDefaultButtonColorStateList(paramContext);
          }
          else
          {
            i = R.drawable.abc_btn_borderless_material;
            if (paramInt == i)
            {
              localColorStateList = createBorderlessButtonColorStateList(paramContext);
            }
            else
            {
              i = R.drawable.abc_btn_colored_material;
              if (paramInt == i)
              {
                localColorStateList = createColoredButtonColorStateList(paramContext);
              }
              else
              {
                i = R.drawable.abc_spinner_mtrl_am_alpha;
                if (paramInt != i)
                {
                  i = R.drawable.abc_spinner_textfield_background_material;
                  if (paramInt != i) {}
                }
                else
                {
                  k = R.color.abc_tint_spinner;
                  localColorStateList = AppCompatResources.getColorStateList(paramContext, k);
                  continue;
                }
                int[] arrayOfInt = TINT_COLOR_CONTROL_NORMAL;
                boolean bool = arrayContains(arrayOfInt, paramInt);
                if (bool)
                {
                  k = R.attr.colorControlNormal;
                  localColorStateList = ThemeUtils.getThemeAttrColorStateList(paramContext, k);
                }
                else
                {
                  arrayOfInt = TINT_COLOR_CONTROL_STATE_LIST;
                  bool = arrayContains(arrayOfInt, paramInt);
                  if (bool)
                  {
                    k = R.color.abc_tint_default;
                    localColorStateList = AppCompatResources.getColorStateList(paramContext, k);
                  }
                  else
                  {
                    arrayOfInt = TINT_CHECKABLE_BUTTON_LIST;
                    bool = arrayContains(arrayOfInt, paramInt);
                    if (bool)
                    {
                      k = R.color.abc_tint_btn_checkable;
                      localColorStateList = AppCompatResources.getColorStateList(paramContext, k);
                    }
                    else
                    {
                      int j = R.drawable.abc_seekbar_thumb_material;
                      if (paramInt == j)
                      {
                        k = R.color.abc_tint_seek_thumb;
                        localColorStateList = AppCompatResources.getColorStateList(paramContext, k);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void onConfigurationChanged(Context paramContext)
  {
    synchronized (this.mDrawableCacheLock)
    {
      Object localObject2 = this.mDrawableCaches;
      localObject2 = ((WeakHashMap)localObject2).get(paramContext);
      localObject2 = (f)localObject2;
      if (localObject2 != null) {
        ((f)localObject2).c();
      }
      return;
    }
  }
  
  Drawable onDrawableLoadedFromResources(Context paramContext, VectorEnabledTintResources paramVectorEnabledTintResources, int paramInt)
  {
    Drawable localDrawable = loadDrawableFromDelegates(paramContext, paramInt);
    if (localDrawable == null) {
      localDrawable = paramVectorEnabledTintResources.superGetDrawable(paramInt);
    }
    if (localDrawable != null) {}
    for (localDrawable = tintDrawable(paramContext, paramInt, false, localDrawable);; localDrawable = null) {
      return localDrawable;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatDrawableManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */