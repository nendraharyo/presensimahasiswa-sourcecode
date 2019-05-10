package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R.styleable;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

class AppCompatTextViewAutoSizeHelper
{
  private static final int DEFAULT_AUTO_SIZE_GRANULARITY_IN_PX = 1;
  private static final int DEFAULT_AUTO_SIZE_MAX_TEXT_SIZE_IN_SP = 112;
  private static final int DEFAULT_AUTO_SIZE_MIN_TEXT_SIZE_IN_SP = 12;
  private static final String TAG = "ACTVAutoSizeHelper";
  private static final RectF TEMP_RECTF;
  static final float UNSET_AUTO_SIZE_UNIFORM_CONFIGURATION_VALUE = -1.0F;
  private static final int VERY_WIDE = 1048576;
  private static ConcurrentHashMap sTextViewMethodByNameCache;
  private float mAutoSizeMaxTextSizeInPx;
  private float mAutoSizeMinTextSizeInPx;
  private float mAutoSizeStepGranularityInPx;
  private int[] mAutoSizeTextSizesInPx;
  private int mAutoSizeTextType = 0;
  private final Context mContext;
  private boolean mHasPresetAutoSizeValues;
  private boolean mNeedsAutoSizeText = false;
  private TextPaint mTempTextPaint;
  private final TextView mTextView;
  
  static
  {
    Object localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    TEMP_RECTF = (RectF)localObject;
    localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    sTextViewMethodByNameCache = (ConcurrentHashMap)localObject;
  }
  
  AppCompatTextViewAutoSizeHelper(TextView paramTextView)
  {
    this.mAutoSizeStepGranularityInPx = f;
    this.mAutoSizeMinTextSizeInPx = f;
    this.mAutoSizeMaxTextSizeInPx = f;
    Object localObject = new int[0];
    this.mAutoSizeTextSizesInPx = ((int[])localObject);
    this.mHasPresetAutoSizeValues = false;
    this.mTextView = paramTextView;
    localObject = this.mTextView.getContext();
    this.mContext = ((Context)localObject);
  }
  
  private int[] cleanupAutoSizePresetSizes(int[] paramArrayOfInt)
  {
    int i = 0;
    Integer localInteger1 = null;
    int j = paramArrayOfInt.length;
    if (j == 0) {}
    for (;;)
    {
      return paramArrayOfInt;
      Arrays.sort(paramArrayOfInt);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      int k = 0;
      while (k < j)
      {
        int m = paramArrayOfInt[k];
        if (m > 0)
        {
          Integer localInteger2 = Integer.valueOf(m);
          int n = Collections.binarySearch(localArrayList, localInteger2);
          if (n < 0)
          {
            Integer localInteger3 = Integer.valueOf(m);
            localArrayList.add(localInteger3);
          }
        }
        k += 1;
      }
      k = localArrayList.size();
      if (j != k)
      {
        j = localArrayList.size();
        paramArrayOfInt = new int[j];
        for (k = 0; k < j; k = i)
        {
          localInteger1 = (Integer)localArrayList.get(k);
          i = localInteger1.intValue();
          paramArrayOfInt[k] = i;
          i = k + 1;
        }
      }
    }
  }
  
  private void clearAutoSizeConfiguration()
  {
    float f = -1.0F;
    this.mAutoSizeTextType = 0;
    this.mAutoSizeMinTextSizeInPx = f;
    this.mAutoSizeMaxTextSizeInPx = f;
    this.mAutoSizeStepGranularityInPx = f;
    int[] arrayOfInt = new int[0];
    this.mAutoSizeTextSizesInPx = arrayOfInt;
    this.mNeedsAutoSizeText = false;
  }
  
  private StaticLayout createStaticLayoutForMeasuring(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt1, int paramInt2)
  {
    Object localObject1 = this.mTextView;
    Object localObject2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
    localObject1 = (TextDirectionHeuristic)invokeAndReturnWithDefault(localObject1, "getTextDirectionHeuristic", localObject2);
    int i = paramCharSequence.length();
    Object localObject3 = this.mTempTextPaint;
    StaticLayout.Builder localBuilder = StaticLayout.Builder.obtain(paramCharSequence, 0, i, (TextPaint)localObject3, paramInt1).setAlignment(paramAlignment);
    float f1 = this.mTextView.getLineSpacingExtra();
    localObject3 = this.mTextView;
    float f2 = ((TextView)localObject3).getLineSpacingMultiplier();
    localBuilder = localBuilder.setLineSpacing(f1, f2);
    boolean bool = this.mTextView.getIncludeFontPadding();
    localBuilder = localBuilder.setIncludePad(bool);
    int j = this.mTextView.getBreakStrategy();
    localBuilder = localBuilder.setBreakStrategy(j);
    localObject2 = this.mTextView;
    j = ((TextView)localObject2).getHyphenationFrequency();
    localBuilder = localBuilder.setHyphenationFrequency(j);
    j = -1;
    f1 = 0.0F / 0.0F;
    if (paramInt2 == j) {
      paramInt2 = -1 >>> 1;
    }
    return localBuilder.setMaxLines(paramInt2).setTextDirection((TextDirectionHeuristic)localObject1).build();
  }
  
  private StaticLayout createStaticLayoutForMeasuringPre23(CharSequence paramCharSequence, Layout.Alignment paramAlignment, int paramInt)
  {
    float f1 = 1.0F;
    Object localObject1 = null;
    boolean bool1 = true;
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    float f2;
    float f3;
    Object localObject2;
    if (i >= j)
    {
      f2 = this.mTextView.getLineSpacingMultiplier();
      f3 = this.mTextView.getLineSpacingExtra();
      localObject2 = this.mTextView;
    }
    for (boolean bool2 = ((TextView)localObject2).getIncludeFontPadding();; bool2 = ((Boolean)localObject2).booleanValue())
    {
      localObject2 = new android/text/StaticLayout;
      Object localObject3 = this.mTempTextPaint;
      localObject1 = paramCharSequence;
      i = paramInt;
      Object localObject4 = paramAlignment;
      ((StaticLayout)localObject2).<init>(paramCharSequence, (TextPaint)localObject3, paramInt, paramAlignment, f2, f3, bool2);
      return (StaticLayout)localObject2;
      Object localObject5 = this.mTextView;
      localObject4 = "getLineSpacingMultiplier";
      localObject2 = Float.valueOf(f1);
      f2 = ((Float)invokeAndReturnWithDefault(localObject5, (String)localObject4, localObject2)).floatValue();
      localObject2 = this.mTextView;
      localObject5 = "getLineSpacingExtra";
      localObject1 = Float.valueOf(0.0F);
      f3 = ((Float)invokeAndReturnWithDefault(localObject2, (String)localObject5, localObject1)).floatValue();
      localObject2 = this.mTextView;
      localObject1 = "getIncludeFontPadding";
      localObject3 = Boolean.valueOf(bool1);
      localObject2 = (Boolean)invokeAndReturnWithDefault(localObject2, (String)localObject1, localObject3);
    }
  }
  
  private int findLargestTextSizeWhichFits(RectF paramRectF)
  {
    Object localObject = this.mAutoSizeTextSizesInPx;
    int i = localObject.length;
    if (i == 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("No available text sizes to choose from.");
      throw ((Throwable)localObject);
    }
    int j = 0;
    int k = 1;
    i += -1;
    while (k <= i)
    {
      j = (k + i) / 2;
      int[] arrayOfInt = this.mAutoSizeTextSizesInPx;
      int m = arrayOfInt[j];
      boolean bool = suggestedSizeFitsInSpace(m, paramRectF);
      if (bool)
      {
        int n = j + 1;
        j = k;
        k = n;
      }
      else
      {
        i = j + -1;
        j = i;
      }
    }
    return this.mAutoSizeTextSizesInPx[j];
  }
  
  private Method getTextViewMethod(String paramString)
  {
    try
    {
      localObject1 = sTextViewMethodByNameCache;
      localObject1 = ((ConcurrentHashMap)localObject1).get(paramString);
      localObject1 = (Method)localObject1;
      if (localObject1 == null)
      {
        localObject1 = TextView.class;
        boolean bool = false;
        localObject3 = null;
        localObject3 = new Class[0];
        localObject1 = ((Class)localObject1).getDeclaredMethod(paramString, (Class[])localObject3);
        if (localObject1 != null)
        {
          bool = true;
          ((Method)localObject1).setAccessible(bool);
          localObject3 = sTextViewMethodByNameCache;
          ((ConcurrentHashMap)localObject3).put(paramString, localObject1);
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject1;
        Object localObject3 = "ACTVAutoSizeHelper";
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        localObject4 = ((StringBuilder)localObject4).append("Failed to retrieve TextView#").append(paramString);
        String str = "() method";
        localObject4 = str;
        Log.w((String)localObject3, (String)localObject4, localException);
        Object localObject2 = null;
      }
    }
    return (Method)localObject1;
  }
  
  private Object invokeAndReturnWithDefault(Object paramObject1, String paramString, Object paramObject2)
  {
    i = 0;
    try
    {
      Method localMethod = getTextViewMethod(paramString);
      localObject2 = null;
      localObject2 = new Object[0];
      paramObject2 = localMethod.invoke(paramObject1, (Object[])localObject2);
      if (paramObject2 != null) {}
    }
    catch (Exception localException)
    {
      for (;;)
      {
        i = 1;
        Object localObject2 = "ACTVAutoSizeHelper";
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str = "Failed to invoke TextView#";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject3 = ((StringBuilder)localObject3).append(paramString);
        str = "() method";
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject3 = ((StringBuilder)localObject3).toString();
        Log.w((String)localObject2, (String)localObject3, localException);
        if (0 != 0) {
          paramObject2 = null;
        }
      }
    }
    finally
    {
      if ((0 != 0) || (i == 0)) {
        break label126;
      }
    }
    return paramObject2;
  }
  
  private void setRawTextSize(float paramFloat)
  {
    Object localObject1 = null;
    Object localObject2 = this.mTextView.getPaint();
    float f = ((TextPaint)localObject2).getTextSize();
    boolean bool1 = paramFloat < f;
    boolean bool2;
    if (bool1)
    {
      localObject2 = this.mTextView.getPaint();
      ((TextPaint)localObject2).setTextSize(paramFloat);
      int i = Build.VERSION.SDK_INT;
      int j = 18;
      if (i < j) {
        break label182;
      }
      localObject2 = this.mTextView;
      bool2 = ((TextView)localObject2).isInLayout();
    }
    for (;;)
    {
      Object localObject3 = this.mTextView.getLayout();
      if (localObject3 != null)
      {
        this.mNeedsAutoSizeText = false;
        localObject1 = "nullLayouts";
      }
      try
      {
        localObject1 = getTextViewMethod((String)localObject1);
        if (localObject1 != null)
        {
          localObject3 = this.mTextView;
          localObject4 = null;
          localObject4 = new Object[0];
          ((Method)localObject1).invoke(localObject3, (Object[])localObject4);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localObject3 = "ACTVAutoSizeHelper";
          Object localObject4 = "Failed to invoke TextView#nullLayouts() method";
          Log.w((String)localObject3, (String)localObject4, localException);
          continue;
          localObject2 = this.mTextView;
          ((TextView)localObject2).forceLayout();
        }
      }
      if (!bool2)
      {
        localObject2 = this.mTextView;
        ((TextView)localObject2).requestLayout();
        localObject2 = this.mTextView;
        ((TextView)localObject2).invalidate();
        return;
      }
      label182:
      bool2 = false;
      localObject2 = null;
      f = 0.0F;
    }
  }
  
  private boolean setupAutoSizeText()
  {
    float f1 = 0.0F;
    int i = 1;
    boolean bool1 = supportsAutoSizeText();
    if (bool1)
    {
      int j = this.mAutoSizeTextType;
      if (j == i)
      {
        boolean bool2 = this.mHasPresetAutoSizeValues;
        int[] arrayOfInt1;
        int k;
        if (bool2)
        {
          arrayOfInt1 = this.mAutoSizeTextSizesInPx;
          k = arrayOfInt1.length;
          if (k != 0) {}
        }
        else
        {
          k = Math.round(this.mAutoSizeMinTextSizeInPx);
          float f2 = k;
          int m = i;
          float f4;
          int i1;
          for (;;)
          {
            float f3 = this.mAutoSizeStepGranularityInPx + f2;
            int n = Math.round(f3);
            f4 = this.mAutoSizeMaxTextSizeInPx;
            i1 = Math.round(f4);
            if (n > i1) {
              break;
            }
            m += 1;
            f3 = this.mAutoSizeStepGranularityInPx;
            f2 += f3;
          }
          int[] arrayOfInt2 = new int[m];
          f1 = this.mAutoSizeMinTextSizeInPx;
          k = 0;
          arrayOfInt1 = null;
          f2 = 0.0F;
          while (k < m)
          {
            i1 = Math.round(f1);
            arrayOfInt2[k] = i1;
            f4 = this.mAutoSizeStepGranularityInPx;
            f1 += f4;
            k += 1;
          }
          arrayOfInt1 = cleanupAutoSizePresetSizes(arrayOfInt2);
          this.mAutoSizeTextSizesInPx = arrayOfInt1;
        }
      }
    }
    for (this.mNeedsAutoSizeText = i;; this.mNeedsAutoSizeText = false) {
      return this.mNeedsAutoSizeText;
    }
  }
  
  private void setupAutoSizeUniformPresetSizes(TypedArray paramTypedArray)
  {
    int i = paramTypedArray.length();
    int[] arrayOfInt1 = new int[i];
    if (i > 0)
    {
      int j = 0;
      int[] arrayOfInt2 = null;
      while (j < i)
      {
        int k = paramTypedArray.getDimensionPixelSize(j, -1);
        arrayOfInt1[j] = k;
        j += 1;
      }
      arrayOfInt2 = cleanupAutoSizePresetSizes(arrayOfInt1);
      this.mAutoSizeTextSizesInPx = arrayOfInt2;
      setupAutoSizeUniformPresetSizesConfiguration();
    }
  }
  
  private boolean setupAutoSizeUniformPresetSizesConfiguration()
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int[] arrayOfInt = this.mAutoSizeTextSizesInPx;
    int j = arrayOfInt.length;
    int k;
    if (j > 0) {
      k = i;
    }
    for (float f2 = f1;; f2 = 0.0F)
    {
      this.mHasPresetAutoSizeValues = k;
      boolean bool = this.mHasPresetAutoSizeValues;
      if (bool)
      {
        this.mAutoSizeTextType = i;
        f2 = this.mAutoSizeTextSizesInPx[0];
        this.mAutoSizeMinTextSizeInPx = f2;
        arrayOfInt = this.mAutoSizeTextSizesInPx;
        i = j + -1;
        f2 = arrayOfInt[i];
        this.mAutoSizeMaxTextSizeInPx = f2;
        m = -1082130432;
        f2 = -1.0F;
        this.mAutoSizeStepGranularityInPx = f2;
      }
      return this.mHasPresetAutoSizeValues;
      int m = 0;
      arrayOfInt = null;
    }
  }
  
  private boolean suggestedSizeFitsInSpace(int paramInt, RectF paramRectF)
  {
    int i = -1;
    Object localObject1 = this.mTextView.getText();
    Object localObject2 = this.mTextView.getTransformationMethod();
    if (localObject2 != null)
    {
      TextView localTextView = this.mTextView;
      localObject2 = ((TransformationMethod)localObject2).getTransformation((CharSequence)localObject1, localTextView);
      if (localObject2 != null) {
        localObject1 = localObject2;
      }
    }
    int j = Build.VERSION.SDK_INT;
    int k = 16;
    label113:
    float f1;
    int n;
    label226:
    int m;
    float f2;
    if (j >= k)
    {
      localObject2 = this.mTextView;
      j = ((TextView)localObject2).getMaxLines();
      k = j;
      localObject2 = this.mTempTextPaint;
      if (localObject2 != null) {
        break label296;
      }
      localObject2 = new android/text/TextPaint;
      ((TextPaint)localObject2).<init>();
      this.mTempTextPaint = ((TextPaint)localObject2);
      localObject2 = this.mTempTextPaint;
      Object localObject3 = this.mTextView.getPaint();
      ((TextPaint)localObject2).set((TextPaint)localObject3);
      localObject2 = this.mTempTextPaint;
      f1 = paramInt;
      ((TextPaint)localObject2).setTextSize(f1);
      localObject2 = this.mTextView;
      localObject3 = "getLayoutAlignment";
      Layout.Alignment localAlignment = Layout.Alignment.ALIGN_NORMAL;
      localObject2 = (Layout.Alignment)invokeAndReturnWithDefault(localObject2, (String)localObject3, localAlignment);
      n = Build.VERSION.SDK_INT;
      int i1 = 23;
      if (n < i1) {
        break label310;
      }
      f1 = paramRectF.right;
      n = Math.round(f1);
      localObject2 = createStaticLayoutForMeasuring((CharSequence)localObject1, (Layout.Alignment)localObject2, n, k);
      if (k == i) {
        break label338;
      }
      i = ((StaticLayout)localObject2).getLineCount();
      if (i <= k)
      {
        m = ((StaticLayout)localObject2).getLineCount() + -1;
        m = ((StaticLayout)localObject2).getLineEnd(m);
        int i2 = ((CharSequence)localObject1).length();
        if (m == i2) {
          break label338;
        }
      }
      j = 0;
      localObject2 = null;
      f2 = 0.0F;
    }
    for (;;)
    {
      return j;
      m = i;
      break;
      label296:
      localObject2 = this.mTempTextPaint;
      ((TextPaint)localObject2).reset();
      break label113;
      label310:
      f1 = paramRectF.right;
      n = Math.round(f1);
      localObject2 = createStaticLayoutForMeasuringPre23((CharSequence)localObject1, (Layout.Alignment)localObject2, n);
      break label226;
      label338:
      f2 = ((StaticLayout)localObject2).getHeight();
      float f3 = paramRectF.bottom;
      boolean bool = f2 < f3;
      if (bool)
      {
        bool = false;
        localObject2 = null;
        f2 = 0.0F;
      }
      else
      {
        bool = true;
        f2 = Float.MIN_VALUE;
      }
    }
  }
  
  private boolean supportsAutoSizeText()
  {
    TextView localTextView = this.mTextView;
    boolean bool = localTextView instanceof AppCompatEditText;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localTextView = null;
    }
  }
  
  private void validateAndSetAutoSizeTextTypeUniformConfiguration(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    Object localObject = null;
    boolean bool = paramFloat1 < 0.0F;
    IllegalArgumentException localIllegalArgumentException;
    if (!bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Minimum auto-size text size (" + paramFloat1 + "px) is less or equal to (0px)";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    bool = paramFloat2 < paramFloat1;
    if (!bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "Maximum auto-size text size (" + paramFloat2 + "px) is less or equal to minimum auto-size " + "text size (" + paramFloat1 + "px)";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    bool = paramFloat3 < 0.0F;
    if (!bool)
    {
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = "The auto-size step granularity (" + paramFloat3 + "px) is less or equal to (0px)";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    this.mAutoSizeTextType = 1;
    this.mAutoSizeMinTextSizeInPx = paramFloat1;
    this.mAutoSizeMaxTextSizeInPx = paramFloat2;
    this.mAutoSizeStepGranularityInPx = paramFloat3;
    this.mHasPresetAutoSizeValues = false;
  }
  
  void autoSizeText()
  {
    int i = 0;
    ??? = null;
    boolean bool1 = isAutoSizeEnabled();
    if (!bool1) {}
    for (;;)
    {
      return;
      bool1 = this.mNeedsAutoSizeText;
      Object localObject2;
      Object localObject4;
      int k;
      float f1;
      int m;
      if (bool1)
      {
        localObject2 = this.mTextView;
        int j = ((TextView)localObject2).getMeasuredHeight();
        if (j <= 0) {
          continue;
        }
        localObject2 = this.mTextView;
        j = ((TextView)localObject2).getMeasuredWidth();
        if (j <= 0) {
          continue;
        }
        localObject2 = this.mTextView;
        localObject4 = "getHorizontallyScrolling";
        ??? = Boolean.valueOf(false);
        localObject2 = (Boolean)invokeAndReturnWithDefault(localObject2, (String)localObject4, ???);
        boolean bool2 = ((Boolean)localObject2).booleanValue();
        if (!bool2) {
          break label277;
        }
        k = 1048576;
        f1 = 1.469368E-39F;
        localObject4 = this.mTextView;
        m = ((TextView)localObject4).getHeight();
        i = this.mTextView.getCompoundPaddingBottom();
        m -= i;
        ??? = this.mTextView;
        i = ((TextView)???).getCompoundPaddingTop();
        m -= i;
        if ((k <= 0) || (m <= 0)) {
          continue;
        }
      }
      synchronized (TEMP_RECTF)
      {
        RectF localRectF = TEMP_RECTF;
        localRectF.setEmpty();
        localRectF = TEMP_RECTF;
        f1 = k;
        localRectF.right = f1;
        localObject2 = TEMP_RECTF;
        float f2 = m;
        ((RectF)localObject2).bottom = f2;
        localObject2 = TEMP_RECTF;
        k = findLargestTextSizeWhichFits((RectF)localObject2);
        f1 = k;
        localObject4 = this.mTextView;
        f2 = ((TextView)localObject4).getTextSize();
        boolean bool3 = f1 < f2;
        if (bool3)
        {
          bool3 = false;
          f2 = 0.0F;
          localObject4 = null;
          setTextSizeInternal(0, f1);
        }
        k = 1;
        f1 = Float.MIN_VALUE;
        this.mNeedsAutoSizeText = k;
        continue;
        label277:
        localObject2 = this.mTextView;
        k = ((TextView)localObject2).getMeasuredWidth();
        int n = this.mTextView.getTotalPaddingLeft();
        k -= n;
        localObject4 = this.mTextView;
        n = ((TextView)localObject4).getTotalPaddingRight();
        k -= n;
      }
    }
  }
  
  int getAutoSizeMaxTextSize()
  {
    return Math.round(this.mAutoSizeMaxTextSizeInPx);
  }
  
  int getAutoSizeMinTextSize()
  {
    return Math.round(this.mAutoSizeMinTextSizeInPx);
  }
  
  int getAutoSizeStepGranularity()
  {
    return Math.round(this.mAutoSizeStepGranularityInPx);
  }
  
  int[] getAutoSizeTextAvailableSizes()
  {
    return this.mAutoSizeTextSizesInPx;
  }
  
  int getAutoSizeTextType()
  {
    return this.mAutoSizeTextType;
  }
  
  boolean isAutoSizeEnabled()
  {
    boolean bool = supportsAutoSizeText();
    if (bool)
    {
      i = this.mAutoSizeTextType;
      if (i == 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    int i = 2;
    int j = -1082130432;
    float f1 = -1.0F;
    Context localContext = this.mContext;
    int[] arrayOfInt = R.styleable.AppCompatTextView;
    Object localObject = localContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt, 0);
    int m = R.styleable.AppCompatTextView_autoSizeTextType;
    boolean bool1 = ((TypedArray)localObject).hasValue(m);
    if (bool1)
    {
      n = R.styleable.AppCompatTextView_autoSizeTextType;
      n = ((TypedArray)localObject).getInt(n, 0);
      this.mAutoSizeTextType = n;
    }
    int n = R.styleable.AppCompatTextView_autoSizeStepGranularity;
    boolean bool2 = ((TypedArray)localObject).hasValue(n);
    int i1;
    if (bool2) {
      i1 = R.styleable.AppCompatTextView_autoSizeStepGranularity;
    }
    for (float f2 = ((TypedArray)localObject).getDimension(i1, f1);; f2 = f1)
    {
      int i2 = R.styleable.AppCompatTextView_autoSizeMinTextSize;
      boolean bool3 = ((TypedArray)localObject).hasValue(i2);
      int i3;
      if (bool3) {
        i3 = R.styleable.AppCompatTextView_autoSizeMinTextSize;
      }
      int k;
      for (float f3 = ((TypedArray)localObject).getDimension(i3, f1);; f3 = f1)
      {
        int i4 = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
        boolean bool4 = ((TypedArray)localObject).hasValue(i4);
        int i5;
        if (bool4) {
          i5 = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
        }
        for (float f4 = ((TypedArray)localObject).getDimension(i5, f1);; f4 = f1)
        {
          int i6 = R.styleable.AppCompatTextView_autoSizePresetSizes;
          boolean bool5 = ((TypedArray)localObject).hasValue(i6);
          int i7;
          if (bool5)
          {
            i7 = R.styleable.AppCompatTextView_autoSizePresetSizes;
            i7 = ((TypedArray)localObject).getResourceId(i7, 0);
            if (i7 > 0)
            {
              Resources localResources = ((TypedArray)localObject).getResources();
              TypedArray localTypedArray = localResources.obtainTypedArray(i7);
              setupAutoSizeUniformPresetSizes(localTypedArray);
              localTypedArray.recycle();
            }
          }
          ((TypedArray)localObject).recycle();
          boolean bool7 = supportsAutoSizeText();
          if (bool7)
          {
            int i8 = this.mAutoSizeTextType;
            i7 = 1;
            if (i8 == i7)
            {
              boolean bool8 = this.mHasPresetAutoSizeValues;
              if (!bool8)
              {
                localObject = this.mContext.getResources().getDisplayMetrics();
                boolean bool6 = f3 < f1;
                if (!bool6)
                {
                  i3 = 1094713344;
                  f3 = TypedValue.applyDimension(i, 12.0F, (DisplayMetrics)localObject);
                }
                bool6 = f4 < f1;
                if (!bool6)
                {
                  i5 = 1121976320;
                  f4 = TypedValue.applyDimension(i, 112.0F, (DisplayMetrics)localObject);
                }
                k = f2 < f1;
                if (k == 0)
                {
                  i1 = 1065353216;
                  f2 = 1.0F;
                }
                validateAndSetAutoSizeTextTypeUniformConfiguration(f3, f4, f2);
              }
              setupAutoSizeText();
            }
          }
          for (;;)
          {
            return;
            this.mAutoSizeTextType = 0;
          }
          i5 = k;
        }
        i3 = k;
      }
      i1 = k;
    }
  }
  
  void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = supportsAutoSizeText();
    if (bool)
    {
      DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
      float f1 = paramInt1;
      f1 = TypedValue.applyDimension(paramInt4, f1, localDisplayMetrics);
      float f2 = paramInt2;
      f2 = TypedValue.applyDimension(paramInt4, f2, localDisplayMetrics);
      float f3 = paramInt3;
      float f4 = TypedValue.applyDimension(paramInt4, f3, localDisplayMetrics);
      validateAndSetAutoSizeTextTypeUniformConfiguration(f1, f2, f4);
      bool = setupAutoSizeText();
      if (bool) {
        autoSizeText();
      }
    }
  }
  
  void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    int i = 0;
    Object localObject1 = null;
    boolean bool = supportsAutoSizeText();
    if (bool)
    {
      int j = paramArrayOfInt.length;
      if (j > 0)
      {
        Object localObject2 = new int[j];
        if (paramInt == 0) {
          localObject2 = Arrays.copyOf(paramArrayOfInt, j);
        }
        for (;;)
        {
          localObject2 = cleanupAutoSizePresetSizes((int[])localObject2);
          this.mAutoSizeTextSizesInPx = ((int[])localObject2);
          bool = setupAutoSizeUniformPresetSizesConfiguration();
          if (bool) {
            break;
          }
          localObject2 = new java/lang/IllegalArgumentException;
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject1 = ((StringBuilder)localObject1).append("None of the preset sizes is valid: ");
          String str = Arrays.toString(paramArrayOfInt);
          localObject1 = str;
          ((IllegalArgumentException)localObject2).<init>((String)localObject1);
          throw ((Throwable)localObject2);
          DisplayMetrics localDisplayMetrics = this.mContext.getResources().getDisplayMetrics();
          while (i < j)
          {
            float f = paramArrayOfInt[i];
            f = TypedValue.applyDimension(paramInt, f, localDisplayMetrics);
            int k = Math.round(f);
            localObject2[i] = k;
            i += 1;
          }
        }
      }
      this.mHasPresetAutoSizeValues = false;
      bool = setupAutoSizeText();
      if (bool) {
        autoSizeText();
      }
    }
  }
  
  void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    int i = 2;
    boolean bool = supportsAutoSizeText();
    Object localObject1;
    if (bool) {
      switch (paramInt)
      {
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Unknown auto-size text type: " + paramInt;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      case 0: 
        clearAutoSizeConfiguration();
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.mContext.getResources().getDisplayMetrics();
      float f1 = TypedValue.applyDimension(i, 12.0F, (DisplayMetrics)localObject1);
      float f2 = TypedValue.applyDimension(i, 112.0F, (DisplayMetrics)localObject1);
      float f3 = 1.0F;
      validateAndSetAutoSizeTextTypeUniformConfiguration(f1, f2, f3);
      bool = setupAutoSizeText();
      if (bool) {
        autoSizeText();
      }
    }
  }
  
  void setTextSizeInternal(int paramInt, float paramFloat)
  {
    Object localObject = this.mContext;
    if (localObject == null) {}
    for (localObject = Resources.getSystem();; localObject = this.mContext.getResources())
    {
      localObject = ((Resources)localObject).getDisplayMetrics();
      float f = TypedValue.applyDimension(paramInt, paramFloat, (DisplayMetrics)localObject);
      setRawTextSize(f);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatTextViewAutoSizeHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */