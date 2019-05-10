package android.support.v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.b.a.a;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.text.AllCapsTransformationMethod;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.List;

public class SwitchCompat
  extends CompoundButton
{
  private static final String ACCESSIBILITY_EVENT_CLASS_NAME = "android.widget.Switch";
  private static final int[] CHECKED_STATE_SET;
  private static final int MONOSPACE = 3;
  private static final int SANS = 1;
  private static final int SERIF = 2;
  private static final int THUMB_ANIMATION_DURATION = 250;
  private static final Property THUMB_POS;
  private static final int TOUCH_MODE_DOWN = 1;
  private static final int TOUCH_MODE_DRAGGING = 2;
  private static final int TOUCH_MODE_IDLE;
  private boolean mHasThumbTint = false;
  private boolean mHasThumbTintMode = false;
  private boolean mHasTrackTint = false;
  private boolean mHasTrackTintMode = false;
  private int mMinFlingVelocity;
  private Layout mOffLayout;
  private Layout mOnLayout;
  ObjectAnimator mPositionAnimator;
  private boolean mShowText;
  private boolean mSplitTrack;
  private int mSwitchBottom;
  private int mSwitchHeight;
  private int mSwitchLeft;
  private int mSwitchMinWidth;
  private int mSwitchPadding;
  private int mSwitchRight;
  private int mSwitchTop;
  private TransformationMethod mSwitchTransformationMethod;
  private int mSwitchWidth;
  private final Rect mTempRect;
  private ColorStateList mTextColors;
  private CharSequence mTextOff;
  private CharSequence mTextOn;
  private final TextPaint mTextPaint;
  private Drawable mThumbDrawable;
  private float mThumbPosition;
  private int mThumbTextPadding;
  private ColorStateList mThumbTintList = null;
  private PorterDuff.Mode mThumbTintMode = null;
  private int mThumbWidth;
  private int mTouchMode;
  private int mTouchSlop;
  private float mTouchX;
  private float mTouchY;
  private Drawable mTrackDrawable;
  private ColorStateList mTrackTintList = null;
  private PorterDuff.Mode mTrackTintMode = null;
  private VelocityTracker mVelocityTracker;
  
  static
  {
    Object localObject = new android/support/v7/widget/SwitchCompat$1;
    ((SwitchCompat.1)localObject).<init>(Float.class, "thumbPos");
    THUMB_POS = (Property)localObject;
    localObject = new int[1];
    localObject[0] = 16842912;
    CHECKED_STATE_SET = (int[])localObject;
  }
  
  public SwitchCompat(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject1 = VelocityTracker.obtain();
    this.mVelocityTracker = ((VelocityTracker)localObject1);
    localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mTempRect = ((Rect)localObject1);
    localObject1 = new android/text/TextPaint;
    ((TextPaint)localObject1).<init>(j);
    this.mTextPaint = ((TextPaint)localObject1);
    localObject1 = getResources();
    Object localObject2 = this.mTextPaint;
    float f = ((Resources)localObject1).getDisplayMetrics().density;
    ((TextPaint)localObject2).density = f;
    localObject1 = R.styleable.SwitchCompat;
    localObject1 = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject1, paramInt, 0);
    int k = R.styleable.SwitchCompat_android_thumb;
    localObject2 = ((TintTypedArray)localObject1).getDrawable(k);
    this.mThumbDrawable = ((Drawable)localObject2);
    localObject2 = this.mThumbDrawable;
    if (localObject2 != null)
    {
      localObject2 = this.mThumbDrawable;
      ((Drawable)localObject2).setCallback(this);
    }
    k = R.styleable.SwitchCompat_track;
    localObject2 = ((TintTypedArray)localObject1).getDrawable(k);
    this.mTrackDrawable = ((Drawable)localObject2);
    localObject2 = this.mTrackDrawable;
    if (localObject2 != null)
    {
      localObject2 = this.mTrackDrawable;
      ((Drawable)localObject2).setCallback(this);
    }
    k = R.styleable.SwitchCompat_android_textOn;
    localObject2 = ((TintTypedArray)localObject1).getText(k);
    this.mTextOn = ((CharSequence)localObject2);
    k = R.styleable.SwitchCompat_android_textOff;
    localObject2 = ((TintTypedArray)localObject1).getText(k);
    this.mTextOff = ((CharSequence)localObject2);
    k = R.styleable.SwitchCompat_showText;
    boolean bool1 = ((TintTypedArray)localObject1).getBoolean(k, j);
    this.mShowText = bool1;
    int m = R.styleable.SwitchCompat_thumbTextPadding;
    m = ((TintTypedArray)localObject1).getDimensionPixelSize(m, 0);
    this.mThumbTextPadding = m;
    m = R.styleable.SwitchCompat_switchMinWidth;
    m = ((TintTypedArray)localObject1).getDimensionPixelSize(m, 0);
    this.mSwitchMinWidth = m;
    m = R.styleable.SwitchCompat_switchPadding;
    m = ((TintTypedArray)localObject1).getDimensionPixelSize(m, 0);
    this.mSwitchPadding = m;
    m = R.styleable.SwitchCompat_splitTrack;
    boolean bool2 = ((TintTypedArray)localObject1).getBoolean(m, false);
    this.mSplitTrack = bool2;
    int n = R.styleable.SwitchCompat_thumbTint;
    localObject2 = ((TintTypedArray)localObject1).getColorStateList(n);
    if (localObject2 != null)
    {
      this.mThumbTintList = ((ColorStateList)localObject2);
      this.mHasThumbTint = j;
    }
    n = R.styleable.SwitchCompat_thumbTintMode;
    n = ((TintTypedArray)localObject1).getInt(n, i);
    localObject2 = DrawableUtils.parseTintMode(n, null);
    PorterDuff.Mode localMode = this.mThumbTintMode;
    if (localMode != localObject2)
    {
      this.mThumbTintMode = ((PorterDuff.Mode)localObject2);
      this.mHasThumbTintMode = j;
    }
    boolean bool3 = this.mHasThumbTint;
    if (!bool3)
    {
      bool3 = this.mHasThumbTintMode;
      if (!bool3) {}
    }
    else
    {
      applyThumbTint();
    }
    int i1 = R.styleable.SwitchCompat_trackTint;
    localObject2 = ((TintTypedArray)localObject1).getColorStateList(i1);
    if (localObject2 != null)
    {
      this.mTrackTintList = ((ColorStateList)localObject2);
      this.mHasTrackTint = j;
    }
    i1 = R.styleable.SwitchCompat_trackTintMode;
    i1 = ((TintTypedArray)localObject1).getInt(i1, i);
    localObject2 = DrawableUtils.parseTintMode(i1, null);
    localMode = this.mTrackTintMode;
    if (localMode != localObject2)
    {
      this.mTrackTintMode = ((PorterDuff.Mode)localObject2);
      this.mHasTrackTintMode = j;
    }
    boolean bool4 = this.mHasTrackTint;
    if (!bool4)
    {
      bool4 = this.mHasTrackTintMode;
      if (!bool4) {}
    }
    else
    {
      applyTrackTint();
    }
    int i2 = R.styleable.SwitchCompat_switchTextAppearance;
    i2 = ((TintTypedArray)localObject1).getResourceId(i2, 0);
    if (i2 != 0) {
      setSwitchTextAppearance(paramContext, i2);
    }
    ((TintTypedArray)localObject1).recycle();
    localObject1 = ViewConfiguration.get(paramContext);
    i2 = ((ViewConfiguration)localObject1).getScaledTouchSlop();
    this.mTouchSlop = i2;
    int i3 = ((ViewConfiguration)localObject1).getScaledMinimumFlingVelocity();
    this.mMinFlingVelocity = i3;
    refreshDrawableState();
    boolean bool5 = isChecked();
    setChecked(bool5);
  }
  
  private void animateThumbToCheckedState(boolean paramBoolean)
  {
    boolean bool = true;
    int i;
    float f;
    if (paramBoolean)
    {
      i = 1065353216;
      f = 1.0F;
    }
    for (;;)
    {
      Property localProperty = THUMB_POS;
      float[] arrayOfFloat = new float[bool];
      arrayOfFloat[0] = f;
      ObjectAnimator localObjectAnimator = ObjectAnimator.ofFloat(this, localProperty, arrayOfFloat);
      this.mPositionAnimator = localObjectAnimator;
      localObjectAnimator = this.mPositionAnimator;
      long l = 250L;
      localObjectAnimator.setDuration(l);
      i = Build.VERSION.SDK_INT;
      int j = 18;
      if (i >= j)
      {
        localObjectAnimator = this.mPositionAnimator;
        localObjectAnimator.setAutoCancel(bool);
      }
      this.mPositionAnimator.start();
      return;
      i = 0;
      f = 0.0F;
      localObjectAnimator = null;
    }
  }
  
  private void applyThumbTint()
  {
    Drawable localDrawable = this.mThumbDrawable;
    if (localDrawable != null)
    {
      boolean bool = this.mHasThumbTint;
      if (!bool)
      {
        bool = this.mHasThumbTintMode;
        if (!bool) {}
      }
      else
      {
        localDrawable = this.mThumbDrawable.mutate();
        this.mThumbDrawable = localDrawable;
        bool = this.mHasThumbTint;
        Object localObject;
        if (bool)
        {
          localDrawable = this.mThumbDrawable;
          localObject = this.mThumbTintList;
          a.a(localDrawable, (ColorStateList)localObject);
        }
        bool = this.mHasThumbTintMode;
        if (bool)
        {
          localDrawable = this.mThumbDrawable;
          localObject = this.mThumbTintMode;
          a.a(localDrawable, (PorterDuff.Mode)localObject);
        }
        localDrawable = this.mThumbDrawable;
        bool = localDrawable.isStateful();
        if (bool)
        {
          localDrawable = this.mThumbDrawable;
          localObject = getDrawableState();
          localDrawable.setState((int[])localObject);
        }
      }
    }
  }
  
  private void applyTrackTint()
  {
    Drawable localDrawable = this.mTrackDrawable;
    if (localDrawable != null)
    {
      boolean bool = this.mHasTrackTint;
      if (!bool)
      {
        bool = this.mHasTrackTintMode;
        if (!bool) {}
      }
      else
      {
        localDrawable = this.mTrackDrawable.mutate();
        this.mTrackDrawable = localDrawable;
        bool = this.mHasTrackTint;
        Object localObject;
        if (bool)
        {
          localDrawable = this.mTrackDrawable;
          localObject = this.mTrackTintList;
          a.a(localDrawable, (ColorStateList)localObject);
        }
        bool = this.mHasTrackTintMode;
        if (bool)
        {
          localDrawable = this.mTrackDrawable;
          localObject = this.mTrackTintMode;
          a.a(localDrawable, (PorterDuff.Mode)localObject);
        }
        localDrawable = this.mTrackDrawable;
        bool = localDrawable.isStateful();
        if (bool)
        {
          localDrawable = this.mTrackDrawable;
          localObject = getDrawableState();
          localDrawable.setState((int[])localObject);
        }
      }
    }
  }
  
  private void cancelPositionAnimator()
  {
    ObjectAnimator localObjectAnimator = this.mPositionAnimator;
    if (localObjectAnimator != null)
    {
      localObjectAnimator = this.mPositionAnimator;
      localObjectAnimator.cancel();
    }
  }
  
  private void cancelSuperTouch(MotionEvent paramMotionEvent)
  {
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    localMotionEvent.setAction(3);
    super.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  private static float constrain(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool = paramFloat1 < paramFloat2;
    if (bool) {}
    for (;;)
    {
      return paramFloat2;
      bool = paramFloat1 < paramFloat3;
      if (bool) {
        paramFloat2 = paramFloat3;
      } else {
        paramFloat2 = paramFloat1;
      }
    }
  }
  
  private boolean getTargetCheckedState()
  {
    float f1 = this.mThumbPosition;
    float f2 = 0.5F;
    boolean bool = f1 < f2;
    if (bool) {
      bool = true;
    }
    for (f1 = Float.MIN_VALUE;; f1 = 0.0F)
    {
      return bool;
      bool = false;
    }
  }
  
  private int getThumbOffset()
  {
    boolean bool = ViewUtils.isLayoutRtl(this);
    float f1;
    if (bool)
    {
      int i = 1065353216;
      f1 = this.mThumbPosition;
    }
    for (float f2 = 1.0F - f1;; f2 = this.mThumbPosition)
    {
      f1 = getThumbScrollRange();
      return (int)(f2 * f1 + 0.5F);
    }
  }
  
  private int getThumbScrollRange()
  {
    Object localObject = this.mTrackDrawable;
    int m;
    if (localObject != null)
    {
      Rect localRect = this.mTempRect;
      this.mTrackDrawable.getPadding(localRect);
      localObject = this.mThumbDrawable;
      if (localObject != null)
      {
        localObject = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
        int i = this.mSwitchWidth;
        int j = this.mThumbWidth;
        i -= j;
        j = localRect.left;
        i -= j;
        int k = localRect.right;
        k = i - k;
        i = ((Rect)localObject).left;
        k -= i;
        m = ((Rect)localObject).right;
        m = k - m;
      }
    }
    for (;;)
    {
      return m;
      localObject = DrawableUtils.INSETS_NONE;
      break;
      m = 0;
      localObject = null;
    }
  }
  
  private boolean hitThumb(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    Drawable localDrawable1 = this.mThumbDrawable;
    if (localDrawable1 == null) {}
    for (;;)
    {
      return bool1;
      int i = getThumbOffset();
      Drawable localDrawable2 = this.mThumbDrawable;
      Rect localRect1 = this.mTempRect;
      localDrawable2.getPadding(localRect1);
      int j = this.mSwitchTop;
      int k = this.mTouchSlop;
      j -= k;
      k = this.mSwitchLeft;
      i += k;
      k = this.mTouchSlop;
      i -= k;
      k = this.mThumbWidth + i;
      int m = this.mTempRect.left;
      k += m;
      Rect localRect2 = this.mTempRect;
      m = localRect2.right;
      k += m;
      m = this.mTouchSlop;
      k += m;
      m = this.mSwitchBottom;
      int n = this.mTouchSlop;
      m += n;
      float f = i;
      boolean bool2 = paramFloat1 < f;
      if (bool2)
      {
        f = k;
        bool2 = paramFloat1 < f;
        if (bool2)
        {
          f = j;
          bool2 = paramFloat2 < f;
          if (bool2)
          {
            f = m;
            bool2 = paramFloat2 < f;
            if (bool2) {
              bool1 = true;
            }
          }
        }
      }
    }
  }
  
  private Layout makeLayout(CharSequence paramCharSequence)
  {
    Object localObject = this.mSwitchTransformationMethod;
    CharSequence localCharSequence;
    TextPaint localTextPaint1;
    TextPaint localTextPaint2;
    float f;
    int i;
    if (localObject != null)
    {
      localObject = this.mSwitchTransformationMethod;
      localCharSequence = ((TransformationMethod)localObject).getTransformation(paramCharSequence, this);
      localObject = new android/text/StaticLayout;
      localTextPaint1 = this.mTextPaint;
      if (localCharSequence == null) {
        break label92;
      }
      localTextPaint2 = this.mTextPaint;
      f = Layout.getDesiredWidth(localCharSequence, localTextPaint2);
      double d = Math.ceil(f);
      i = (int)d;
    }
    for (;;)
    {
      Layout.Alignment localAlignment = Layout.Alignment.ALIGN_NORMAL;
      ((StaticLayout)localObject).<init>(localCharSequence, localTextPaint1, i, localAlignment, 1.0F, 0.0F, true);
      return (Layout)localObject;
      localCharSequence = paramCharSequence;
      break;
      label92:
      i = 0;
      f = 0.0F;
      localTextPaint2 = null;
    }
  }
  
  private void setSwitchTypefaceByIndex(int paramInt1, int paramInt2)
  {
    Typeface localTypeface = null;
    switch (paramInt1)
    {
    }
    for (;;)
    {
      setSwitchTypeface(localTypeface, paramInt2);
      return;
      localTypeface = Typeface.SANS_SERIF;
      continue;
      localTypeface = Typeface.SERIF;
      continue;
      localTypeface = Typeface.MONOSPACE;
    }
  }
  
  private void stopDrag(MotionEvent paramMotionEvent)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    this.mTouchMode = 0;
    int j = paramMotionEvent.getAction();
    boolean bool1;
    float f2;
    int k;
    VelocityTracker localVelocityTracker;
    if (j == i)
    {
      bool1 = isEnabled();
      if (bool1)
      {
        bool1 = i;
        f2 = f1;
        k = isChecked();
        if (!bool1) {
          break label192;
        }
        this.mVelocityTracker.computeCurrentVelocity(1000);
        localVelocityTracker = this.mVelocityTracker;
        f2 = localVelocityTracker.getXVelocity();
        float f3 = Math.abs(f2);
        int m = this.mMinFlingVelocity;
        float f4 = m;
        boolean bool2 = f3 < f4;
        if (!bool2) {
          break label184;
        }
        bool2 = ViewUtils.isLayoutRtl(this);
        if (!bool2) {
          break label166;
        }
        bool1 = f2 < 0.0F;
        if (!bool1) {
          break label159;
        }
      }
    }
    for (;;)
    {
      if (i != k) {
        playSoundEffect(0);
      }
      setChecked(i);
      cancelSuperTouch(paramMotionEvent);
      return;
      bool1 = false;
      localVelocityTracker = null;
      f2 = 0.0F;
      break;
      label159:
      i = 0;
      f1 = 0.0F;
      continue;
      label166:
      bool1 = f2 < 0.0F;
      if (!bool1)
      {
        i = 0;
        f1 = 0.0F;
        continue;
        label184:
        i = getTargetCheckedState();
        continue;
        label192:
        i = k;
      }
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = this.mTempRect;
    int i = this.mSwitchLeft;
    int j = this.mSwitchTop;
    int k = this.mSwitchRight;
    int m = this.mSwitchBottom;
    int n = getThumbOffset();
    int i1 = i + n;
    Object localObject = this.mThumbDrawable;
    int i2;
    if (localObject != null)
    {
      localObject = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
      Drawable localDrawable1 = this.mTrackDrawable;
      if (localDrawable1 == null) {
        break label438;
      }
      localDrawable1 = this.mTrackDrawable;
      localDrawable1.getPadding(localRect);
      i2 = localRect.left + i1;
      if (localObject == null) {
        break label427;
      }
      i1 = ((Rect)localObject).left;
      int i3 = localRect.left;
      if (i1 > i3)
      {
        i1 = ((Rect)localObject).left;
        i3 = localRect.left;
        i1 -= i3;
        i += i1;
      }
      i1 = ((Rect)localObject).top;
      i3 = localRect.top;
      if (i1 <= i3) {
        break label420;
      }
      i1 = ((Rect)localObject).top;
      i3 = localRect.top;
      i1 = i1 - i3 + j;
      label186:
      i3 = ((Rect)localObject).right;
      int i4 = localRect.right;
      if (i3 > i4)
      {
        i3 = ((Rect)localObject).right;
        i4 = localRect.right;
        i3 -= i4;
        k -= i3;
      }
      i3 = ((Rect)localObject).bottom;
      i4 = localRect.bottom;
      if (i3 <= i4) {
        break label413;
      }
      n = ((Rect)localObject).bottom;
      i3 = localRect.bottom;
      n -= i3;
      n = m - n;
      label280:
      Drawable localDrawable2 = this.mTrackDrawable;
      localDrawable2.setBounds(i, i1, k, n);
    }
    label413:
    label420:
    label427:
    label438:
    for (n = i2;; n = i1)
    {
      Drawable localDrawable3 = this.mThumbDrawable;
      if (localDrawable3 != null)
      {
        localDrawable3 = this.mThumbDrawable;
        localDrawable3.getPadding(localRect);
        i = localRect.left;
        i = n - i;
        i1 = this.mThumbWidth;
        n += i1;
        i1 = localRect.right;
        n += i1;
        this.mThumbDrawable.setBounds(i, j, n, m);
        Drawable localDrawable4 = getBackground();
        if (localDrawable4 != null) {
          a.a(localDrawable4, i, j, n, m);
        }
      }
      super.draw(paramCanvas);
      return;
      localObject = DrawableUtils.INSETS_NONE;
      break;
      n = m;
      break label280;
      i1 = j;
      break label186;
      n = m;
      i1 = j;
      break label280;
    }
  }
  
  public void drawableHotspotChanged(float paramFloat1, float paramFloat2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i >= j) {
      super.drawableHotspotChanged(paramFloat1, paramFloat2);
    }
    Drawable localDrawable = this.mThumbDrawable;
    if (localDrawable != null)
    {
      localDrawable = this.mThumbDrawable;
      a.a(localDrawable, paramFloat1, paramFloat2);
    }
    localDrawable = this.mTrackDrawable;
    if (localDrawable != null)
    {
      localDrawable = this.mTrackDrawable;
      a.a(localDrawable, paramFloat1, paramFloat2);
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    boolean bool1 = false;
    Drawable localDrawable = this.mThumbDrawable;
    boolean bool2;
    if (localDrawable != null)
    {
      bool2 = localDrawable.isStateful();
      if (bool2)
      {
        boolean bool3 = localDrawable.setState(arrayOfInt);
        bool1 = false | bool3;
      }
    }
    localDrawable = this.mTrackDrawable;
    if (localDrawable != null)
    {
      bool2 = localDrawable.isStateful();
      if (bool2)
      {
        boolean bool4 = localDrawable.setState(arrayOfInt);
        bool1 |= bool4;
      }
    }
    if (bool1) {
      invalidate();
    }
  }
  
  public int getCompoundPaddingLeft()
  {
    boolean bool1 = ViewUtils.isLayoutRtl(this);
    int i;
    if (!bool1) {
      i = super.getCompoundPaddingLeft();
    }
    for (;;)
    {
      return i;
      i = super.getCompoundPaddingLeft();
      int j = this.mSwitchWidth;
      i += j;
      CharSequence localCharSequence = getText();
      boolean bool2 = TextUtils.isEmpty(localCharSequence);
      if (!bool2)
      {
        int k = this.mSwitchPadding;
        i += k;
      }
    }
  }
  
  public int getCompoundPaddingRight()
  {
    boolean bool1 = ViewUtils.isLayoutRtl(this);
    int i;
    if (bool1) {
      i = super.getCompoundPaddingRight();
    }
    for (;;)
    {
      return i;
      i = super.getCompoundPaddingRight();
      int j = this.mSwitchWidth;
      i += j;
      CharSequence localCharSequence = getText();
      boolean bool2 = TextUtils.isEmpty(localCharSequence);
      if (!bool2)
      {
        int k = this.mSwitchPadding;
        i += k;
      }
    }
  }
  
  public boolean getShowText()
  {
    return this.mShowText;
  }
  
  public boolean getSplitTrack()
  {
    return this.mSplitTrack;
  }
  
  public int getSwitchMinWidth()
  {
    return this.mSwitchMinWidth;
  }
  
  public int getSwitchPadding()
  {
    return this.mSwitchPadding;
  }
  
  public CharSequence getTextOff()
  {
    return this.mTextOff;
  }
  
  public CharSequence getTextOn()
  {
    return this.mTextOn;
  }
  
  public Drawable getThumbDrawable()
  {
    return this.mThumbDrawable;
  }
  
  public int getThumbTextPadding()
  {
    return this.mThumbTextPadding;
  }
  
  public ColorStateList getThumbTintList()
  {
    return this.mThumbTintList;
  }
  
  public PorterDuff.Mode getThumbTintMode()
  {
    return this.mThumbTintMode;
  }
  
  public Drawable getTrackDrawable()
  {
    return this.mTrackDrawable;
  }
  
  public ColorStateList getTrackTintList()
  {
    return this.mTrackTintList;
  }
  
  public PorterDuff.Mode getTrackTintMode()
  {
    return this.mTrackTintMode;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Object localObject = this.mThumbDrawable;
    if (localObject != null)
    {
      localObject = this.mThumbDrawable;
      ((Drawable)localObject).jumpToCurrentState();
    }
    localObject = this.mTrackDrawable;
    if (localObject != null)
    {
      localObject = this.mTrackDrawable;
      ((Drawable)localObject).jumpToCurrentState();
    }
    localObject = this.mPositionAnimator;
    if (localObject != null)
    {
      localObject = this.mPositionAnimator;
      boolean bool = ((ObjectAnimator)localObject).isStarted();
      if (bool)
      {
        this.mPositionAnimator.end();
        bool = false;
        localObject = null;
        this.mPositionAnimator = null;
      }
    }
  }
  
  protected int[] onCreateDrawableState(int paramInt)
  {
    int i = paramInt + 1;
    int[] arrayOfInt1 = super.onCreateDrawableState(i);
    boolean bool = isChecked();
    if (bool)
    {
      int[] arrayOfInt2 = CHECKED_STATE_SET;
      mergeDrawableStates(arrayOfInt1, arrayOfInt2);
    }
    return arrayOfInt1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    Object localObject1 = this.mTempRect;
    Object localObject2 = this.mTrackDrawable;
    int i;
    int j;
    int k;
    int m;
    if (localObject2 != null)
    {
      ((Drawable)localObject2).getPadding((Rect)localObject1);
      i = this.mSwitchTop;
      j = this.mSwitchBottom;
      k = ((Rect)localObject1).top;
      i += k;
      k = ((Rect)localObject1).bottom;
      j -= k;
      Drawable localDrawable = this.mThumbDrawable;
      int i1;
      Object localObject3;
      if (localObject2 != null)
      {
        boolean bool1 = this.mSplitTrack;
        if ((!bool1) || (localDrawable == null)) {
          break label387;
        }
        Rect localRect = DrawableUtils.getOpticalBounds(localDrawable);
        localDrawable.copyBounds((Rect)localObject1);
        int n = ((Rect)localObject1).left;
        i1 = localRect.left;
        n += i1;
        ((Rect)localObject1).left = n;
        n = ((Rect)localObject1).right;
        m = localRect.right;
        m = n - m;
        ((Rect)localObject1).right = m;
        m = paramCanvas.save();
        localObject3 = Region.Op.DIFFERENCE;
        paramCanvas.clipRect((Rect)localObject1, (Region.Op)localObject3);
        ((Drawable)localObject2).draw(paramCanvas);
        paramCanvas.restoreToCount(m);
      }
      label184:
      m = paramCanvas.save();
      if (localDrawable != null) {
        localDrawable.draw(paramCanvas);
      }
      boolean bool2 = getTargetCheckedState();
      if (!bool2) {
        break label395;
      }
      localObject1 = this.mOnLayout;
      localObject2 = localObject1;
      label219:
      if (localObject2 != null)
      {
        localObject1 = getDrawableState();
        localObject3 = this.mTextColors;
        if (localObject3 != null)
        {
          localObject3 = this.mTextPaint;
          ColorStateList localColorStateList = this.mTextColors;
          i1 = localColorStateList.getColorForState((int[])localObject1, 0);
          ((TextPaint)localObject3).setColor(i1);
        }
        localObject3 = this.mTextPaint;
        ((TextPaint)localObject3).drawableState = ((int[])localObject1);
        if (localDrawable == null) {
          break label405;
        }
        localObject1 = localDrawable.getBounds();
        k = ((Rect)localObject1).left;
      }
    }
    label387:
    label395:
    label405:
    for (int i2 = ((Rect)localObject1).right + k;; i2 = getWidth())
    {
      i2 /= 2;
      k = ((Layout)localObject2).getWidth() / 2;
      i2 -= k;
      i = (i + j) / 2;
      j = ((Layout)localObject2).getHeight() / 2;
      i -= j;
      float f1 = i2;
      float f2 = i;
      paramCanvas.translate(f1, f2);
      ((Layout)localObject2).draw(paramCanvas);
      paramCanvas.restoreToCount(m);
      return;
      ((Rect)localObject1).setEmpty();
      break;
      ((Drawable)localObject2).draw(paramCanvas);
      break label184;
      localObject1 = this.mOffLayout;
      localObject2 = localObject1;
      break label219;
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("android.widget.Switch");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    Object localObject1 = "android.widget.Switch";
    paramAccessibilityNodeInfo.setClassName((CharSequence)localObject1);
    boolean bool1 = isChecked();
    Object localObject2;
    if (bool1)
    {
      localObject1 = this.mTextOn;
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2)
      {
        localObject2 = paramAccessibilityNodeInfo.getText();
        boolean bool3 = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool3) {
          break label70;
        }
        paramAccessibilityNodeInfo.setText((CharSequence)localObject1);
      }
    }
    for (;;)
    {
      return;
      localObject1 = this.mTextOff;
      break;
      label70:
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localObject2 = localStringBuilder.append((CharSequence)localObject2);
      char c = ' ';
      localObject2 = ((StringBuilder)localObject2).append(c);
      ((StringBuilder)localObject2).append((CharSequence)localObject1);
      paramAccessibilityNodeInfo.setText(localStringBuilder);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 0;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    Drawable localDrawable = this.mThumbDrawable;
    Rect localRect1;
    int j;
    int m;
    if (localDrawable != null)
    {
      localRect1 = this.mTempRect;
      localDrawable = this.mTrackDrawable;
      if (localDrawable != null)
      {
        localDrawable = this.mTrackDrawable;
        localDrawable.getPadding(localRect1);
        localDrawable = this.mThumbDrawable;
        Rect localRect2 = DrawableUtils.getOpticalBounds(localDrawable);
        j = localRect2.left;
        int k = localRect1.left;
        j -= k;
        j = Math.max(0, j);
        m = localRect2.right;
        int n = localRect1.right;
        n = m - n;
        i = Math.max(0, n);
      }
    }
    for (;;)
    {
      boolean bool = ViewUtils.isLayoutRtl(this);
      int i1;
      if (bool)
      {
        i1 = getPaddingLeft() + j;
        m = this.mSwitchWidth + i1;
        j = m - j - i;
        i = i1;
        label170:
        i1 = getGravity() & 0x70;
        switch (i1)
        {
        default: 
          m = getPaddingTop();
          i1 = this.mSwitchHeight + m;
        }
      }
      for (;;)
      {
        this.mSwitchLeft = i;
        this.mSwitchTop = m;
        this.mSwitchBottom = i1;
        this.mSwitchRight = j;
        return;
        localRect1.setEmpty();
        break;
        i1 = getWidth();
        m = getPaddingRight();
        i1 = i1 - m - i;
        m = this.mSwitchWidth;
        m = i1 - m;
        j += m;
        i += j;
        j = i1;
        break label170;
        i1 = getPaddingTop();
        m = getHeight();
        i1 += m;
        m = getPaddingBottom();
        i1 = (i1 - m) / 2;
        m = this.mSwitchHeight / 2;
        m = i1 - m;
        i1 = this.mSwitchHeight + m;
        continue;
        i1 = getHeight();
        m = getPaddingBottom();
        i1 -= m;
        m = this.mSwitchHeight;
        m = i1 - m;
      }
      j = 0;
      localDrawable = null;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 0;
    Drawable localDrawable1 = null;
    boolean bool1 = this.mShowText;
    if (bool1)
    {
      localObject1 = this.mOnLayout;
      if (localObject1 == null)
      {
        localObject1 = this.mTextOn;
        localObject1 = makeLayout((CharSequence)localObject1);
        this.mOnLayout = ((Layout)localObject1);
      }
      localObject1 = this.mOffLayout;
      if (localObject1 == null)
      {
        localObject1 = this.mTextOff;
        localObject1 = makeLayout((CharSequence)localObject1);
        this.mOffLayout = ((Layout)localObject1);
      }
    }
    Object localObject2 = this.mTempRect;
    Object localObject1 = this.mThumbDrawable;
    int j;
    int k;
    Layout localLayout1;
    int m;
    int n;
    label216:
    Drawable localDrawable2;
    if (localObject1 != null)
    {
      this.mThumbDrawable.getPadding((Rect)localObject2);
      j = this.mThumbDrawable.getIntrinsicWidth();
      k = ((Rect)localObject2).left;
      j -= k;
      k = ((Rect)localObject2).right;
      k = j - k;
      localObject1 = this.mThumbDrawable;
      j = ((Drawable)localObject1).getIntrinsicHeight();
      boolean bool2 = this.mShowText;
      if (!bool2) {
        break label432;
      }
      localLayout1 = this.mOnLayout;
      m = localLayout1.getWidth();
      Layout localLayout2 = this.mOffLayout;
      n = localLayout2.getWidth();
      m = Math.max(m, n);
      n = this.mThumbTextPadding * 2;
      m += n;
      k = Math.max(m, k);
      this.mThumbWidth = k;
      localDrawable2 = this.mTrackDrawable;
      if (localDrawable2 == null) {
        break label441;
      }
      this.mTrackDrawable.getPadding((Rect)localObject2);
      localDrawable1 = this.mTrackDrawable;
      i = localDrawable1.getIntrinsicHeight();
    }
    for (;;)
    {
      m = ((Rect)localObject2).left;
      k = ((Rect)localObject2).right;
      localObject2 = this.mThumbDrawable;
      if (localObject2 != null)
      {
        localObject2 = DrawableUtils.getOpticalBounds(this.mThumbDrawable);
        n = ((Rect)localObject2).left;
        m = Math.max(m, n);
        i1 = ((Rect)localObject2).right;
        k = Math.max(k, i1);
      }
      int i1 = this.mSwitchMinWidth;
      n = this.mThumbWidth * 2;
      m += n;
      k += m;
      k = Math.max(i1, k);
      j = Math.max(i, j);
      this.mSwitchWidth = k;
      this.mSwitchHeight = j;
      super.onMeasure(paramInt1, paramInt2);
      i = getMeasuredHeight();
      if (i < j)
      {
        i = getMeasuredWidthAndState();
        setMeasuredDimension(i, j);
      }
      return;
      j = 0;
      localObject1 = null;
      k = 0;
      localDrawable2 = null;
      break;
      label432:
      m = 0;
      localLayout1 = null;
      break label216;
      label441:
      ((Rect)localObject2).setEmpty();
    }
  }
  
  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    boolean bool = isChecked();
    if (bool) {}
    for (CharSequence localCharSequence = this.mTextOn;; localCharSequence = this.mTextOff)
    {
      if (localCharSequence != null)
      {
        List localList = paramAccessibilityEvent.getText();
        localList.add(localCharSequence);
      }
      return;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = 2;
    int j = 1065353216;
    float f1 = 1.0F;
    int k = 1;
    float f2 = Float.MIN_VALUE;
    VelocityTracker localVelocityTracker = this.mVelocityTracker;
    localVelocityTracker.addMovement(paramMotionEvent);
    int m = paramMotionEvent.getActionMasked();
    switch (m)
    {
    }
    for (;;)
    {
      boolean bool2 = super.onTouchEvent(paramMotionEvent);
      for (;;)
      {
        return bool2;
        f3 = paramMotionEvent.getX();
        f1 = paramMotionEvent.getY();
        boolean bool4 = isEnabled();
        if (!bool4) {
          break;
        }
        bool4 = hitThumb(f3, f1);
        if (!bool4) {
          break;
        }
        this.mTouchMode = k;
        this.mTouchX = f3;
        this.mTouchY = f1;
        break;
        int n = this.mTouchMode;
        float f4;
        float f5;
        switch (n)
        {
        case 0: 
        default: 
          break;
        case 1: 
          f3 = paramMotionEvent.getX();
          f1 = paramMotionEvent.getY();
          f4 = this.mTouchX;
          f4 = Math.abs(f3 - f4);
          int i2 = this.mTouchSlop;
          f5 = i2;
          bool4 = f4 < f5;
          if (!bool4)
          {
            f4 = this.mTouchY;
            f4 = Math.abs(f1 - f4);
            i2 = this.mTouchSlop;
            f5 = i2;
            bool4 = f4 < f5;
            if (!bool4) {
              break;
            }
          }
          this.mTouchMode = i;
          ViewParent localViewParent = getParent();
          localViewParent.requestDisallowInterceptTouchEvent(k);
          this.mTouchX = f3;
          this.mTouchY = f1;
          n = k;
          f3 = f2;
          break;
        case 2: 
          f4 = paramMotionEvent.getX();
          n = getThumbScrollRange();
          f5 = this.mTouchX;
          f5 = f4 - f5;
          if (n != 0)
          {
            f3 = n;
            f3 = f5 / f3;
          }
          for (;;)
          {
            boolean bool5 = ViewUtils.isLayoutRtl(this);
            if (bool5) {
              f3 = -f3;
            }
            f5 = this.mThumbPosition;
            f3 = constrain(f3 + f5, 0.0F, f1);
            f1 = this.mThumbPosition;
            boolean bool1 = f3 < f1;
            if (bool1)
            {
              this.mTouchX = f4;
              setThumbPosition(f3);
            }
            n = k;
            f3 = f2;
            break;
            boolean bool3 = f5 < 0.0F;
            if (bool3)
            {
              bool3 = bool1;
              f3 = f1;
            }
            else
            {
              i1 = -1082130432;
              f3 = -1.0F;
            }
          }
          i1 = this.mTouchMode;
          if (i1 != i) {
            break label492;
          }
          stopDrag(paramMotionEvent);
          super.onTouchEvent(paramMotionEvent);
          i1 = k;
          f3 = f2;
        }
      }
      label492:
      int i1 = 0;
      float f3 = 0.0F;
      this.mTouchMode = 0;
      localVelocityTracker = this.mVelocityTracker;
      localVelocityTracker.clear();
    }
  }
  
  public void setChecked(boolean paramBoolean)
  {
    super.setChecked(paramBoolean);
    boolean bool1 = isChecked();
    IBinder localIBinder = getWindowToken();
    if (localIBinder != null)
    {
      boolean bool2 = r.w(this);
      if (bool2)
      {
        animateThumbToCheckedState(bool1);
        return;
      }
    }
    cancelPositionAnimator();
    int i;
    if (bool1) {
      i = 1065353216;
    }
    for (float f = 1.0F;; f = 0.0F)
    {
      setThumbPosition(f);
      break;
      i = 0;
    }
  }
  
  public void setShowText(boolean paramBoolean)
  {
    boolean bool = this.mShowText;
    if (bool != paramBoolean)
    {
      this.mShowText = paramBoolean;
      requestLayout();
    }
  }
  
  public void setSplitTrack(boolean paramBoolean)
  {
    this.mSplitTrack = paramBoolean;
    invalidate();
  }
  
  public void setSwitchMinWidth(int paramInt)
  {
    this.mSwitchMinWidth = paramInt;
    requestLayout();
  }
  
  public void setSwitchPadding(int paramInt)
  {
    this.mSwitchPadding = paramInt;
    requestLayout();
  }
  
  public void setSwitchTextAppearance(Context paramContext, int paramInt)
  {
    int i = -1;
    Object localObject1 = R.styleable.TextAppearance;
    localObject1 = TintTypedArray.obtainStyledAttributes(paramContext, paramInt, (int[])localObject1);
    int j = R.styleable.TextAppearance_android_textColor;
    Object localObject2 = ((TintTypedArray)localObject1).getColorStateList(j);
    float f3;
    boolean bool1;
    if (localObject2 != null)
    {
      this.mTextColors = ((ColorStateList)localObject2);
      j = R.styleable.TextAppearance_android_textSize;
      j = ((TintTypedArray)localObject1).getDimensionPixelSize(j, 0);
      if (j != 0)
      {
        float f1 = j;
        TextPaint localTextPaint = this.mTextPaint;
        float f2 = localTextPaint.getTextSize();
        boolean bool2 = f1 < f2;
        if (bool2)
        {
          localObject3 = this.mTextPaint;
          f3 = j;
          ((TextPaint)localObject3).setTextSize(f3);
          requestLayout();
        }
      }
      j = R.styleable.TextAppearance_android_typeface;
      j = ((TintTypedArray)localObject1).getInt(j, i);
      int k = R.styleable.TextAppearance_android_textStyle;
      k = ((TintTypedArray)localObject1).getInt(k, i);
      setSwitchTypefaceByIndex(j, k);
      j = R.styleable.TextAppearance_textAllCaps;
      bool1 = ((TintTypedArray)localObject1).getBoolean(j, false);
      if (!bool1) {
        break label216;
      }
      localObject2 = new android/support/v7/text/AllCapsTransformationMethod;
      Object localObject3 = getContext();
      ((AllCapsTransformationMethod)localObject2).<init>((Context)localObject3);
    }
    for (this.mSwitchTransformationMethod = ((TransformationMethod)localObject2);; this.mSwitchTransformationMethod = null)
    {
      ((TintTypedArray)localObject1).recycle();
      return;
      localObject2 = getTextColors();
      this.mTextColors = ((ColorStateList)localObject2);
      break;
      label216:
      bool1 = false;
      f3 = 0.0F;
      localObject2 = null;
    }
  }
  
  public void setSwitchTypeface(Typeface paramTypeface)
  {
    Object localObject = this.mTextPaint.getTypeface();
    if (localObject != null)
    {
      localObject = this.mTextPaint.getTypeface();
      boolean bool = ((Typeface)localObject).equals(paramTypeface);
      if (!bool) {}
    }
    else
    {
      localObject = this.mTextPaint.getTypeface();
      if ((localObject != null) || (paramTypeface == null)) {
        return;
      }
    }
    localObject = this.mTextPaint;
    ((TextPaint)localObject).setTypeface(paramTypeface);
    requestLayout();
    invalidate();
  }
  
  public void setSwitchTypeface(Typeface paramTypeface, int paramInt)
  {
    boolean bool = false;
    TextPaint localTextPaint1 = null;
    Object localObject;
    int i;
    label37:
    float f;
    if (paramInt > 0) {
      if (paramTypeface == null)
      {
        localObject = Typeface.defaultFromStyle(paramInt);
        setSwitchTypeface((Typeface)localObject);
        if (localObject == null) {
          break label115;
        }
        i = ((Typeface)localObject).getStyle();
        i = (i ^ 0xFFFFFFFF) & paramInt;
        TextPaint localTextPaint2 = this.mTextPaint;
        int j = i & 0x1;
        if (j != 0) {
          bool = true;
        }
        localTextPaint2.setFakeBoldText(bool);
        localTextPaint1 = this.mTextPaint;
        i &= 0x2;
        if (i == 0) {
          break label127;
        }
        i = -1098907648;
        f = -0.25F;
        label97:
        localTextPaint1.setTextSkewX(f);
      }
    }
    for (;;)
    {
      return;
      localObject = Typeface.create(paramTypeface, paramInt);
      break;
      label115:
      i = 0;
      localObject = null;
      f = 0.0F;
      break label37;
      label127:
      i = 0;
      localObject = null;
      f = 0.0F;
      break label97;
      this.mTextPaint.setFakeBoldText(false);
      localObject = this.mTextPaint;
      ((TextPaint)localObject).setTextSkewX(0.0F);
      setSwitchTypeface(paramTypeface);
    }
  }
  
  public void setTextOff(CharSequence paramCharSequence)
  {
    this.mTextOff = paramCharSequence;
    requestLayout();
  }
  
  public void setTextOn(CharSequence paramCharSequence)
  {
    this.mTextOn = paramCharSequence;
    requestLayout();
  }
  
  public void setThumbDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.mThumbDrawable;
    if (localDrawable != null)
    {
      localDrawable = this.mThumbDrawable;
      localDrawable.setCallback(null);
    }
    this.mThumbDrawable = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    requestLayout();
  }
  
  void setThumbPosition(float paramFloat)
  {
    this.mThumbPosition = paramFloat;
    invalidate();
  }
  
  public void setThumbResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    setThumbDrawable(localDrawable);
  }
  
  public void setThumbTextPadding(int paramInt)
  {
    this.mThumbTextPadding = paramInt;
    requestLayout();
  }
  
  public void setThumbTintList(ColorStateList paramColorStateList)
  {
    this.mThumbTintList = paramColorStateList;
    this.mHasThumbTint = true;
    applyThumbTint();
  }
  
  public void setThumbTintMode(PorterDuff.Mode paramMode)
  {
    this.mThumbTintMode = paramMode;
    this.mHasThumbTintMode = true;
    applyThumbTint();
  }
  
  public void setTrackDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.mTrackDrawable;
    if (localDrawable != null)
    {
      localDrawable = this.mTrackDrawable;
      localDrawable.setCallback(null);
    }
    this.mTrackDrawable = paramDrawable;
    if (paramDrawable != null) {
      paramDrawable.setCallback(this);
    }
    requestLayout();
  }
  
  public void setTrackResource(int paramInt)
  {
    Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);
    setTrackDrawable(localDrawable);
  }
  
  public void setTrackTintList(ColorStateList paramColorStateList)
  {
    this.mTrackTintList = paramColorStateList;
    this.mHasTrackTint = true;
    applyTrackTint();
  }
  
  public void setTrackTintMode(PorterDuff.Mode paramMode)
  {
    this.mTrackTintMode = paramMode;
    this.mHasTrackTintMode = true;
    applyTrackTint();
  }
  
  public void toggle()
  {
    boolean bool = isChecked();
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      setChecked(bool);
      return;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    boolean bool = super.verifyDrawable(paramDrawable);
    Drawable localDrawable;
    if (!bool)
    {
      localDrawable = this.mThumbDrawable;
      if (paramDrawable != localDrawable)
      {
        localDrawable = this.mTrackDrawable;
        if (paramDrawable != localDrawable) {
          break label34;
        }
      }
    }
    bool = true;
    for (;;)
    {
      return bool;
      label34:
      bool = false;
      localDrawable = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SwitchCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */