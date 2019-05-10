package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.support.design.a.f;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.design.a.j;
import android.support.design.a.k;
import android.support.v4.a.b;
import android.support.v4.widget.m;
import android.support.v7.appcompat.R.color;
import android.support.v7.appcompat.R.style;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.DrawableUtils;
import android.support.v7.widget.TintTypedArray;
import android.support.v7.widget.WithHint;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class TextInputLayout
  extends LinearLayout
  implements WithHint
{
  private boolean A;
  private Drawable B;
  private Drawable C;
  private ColorStateList D;
  private boolean E;
  private PorterDuff.Mode F;
  private boolean G;
  private ColorStateList H;
  private ColorStateList I;
  private boolean J;
  private boolean K;
  private ValueAnimator L;
  private boolean M;
  private boolean N;
  private boolean O;
  EditText a;
  TextView b;
  boolean c;
  final d d;
  private final FrameLayout e;
  private CharSequence f;
  private boolean g;
  private CharSequence h;
  private Paint i;
  private final Rect j;
  private LinearLayout k;
  private int l;
  private Typeface m;
  private boolean n;
  private int o;
  private boolean p;
  private CharSequence q;
  private TextView r;
  private int s;
  private int t;
  private int u;
  private boolean v;
  private boolean w;
  private Drawable x;
  private CharSequence y;
  private CheckableImageButton z;
  
  public TextInputLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TextInputLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.j = ((Rect)localObject1);
    localObject1 = new android/support/design/widget/d;
    ((d)localObject1).<init>(this);
    this.d = ((d)localObject1);
    o.a(paramContext);
    setOrientation(i2);
    setWillNotDraw(false);
    setAddStatesFromChildren(i2);
    localObject1 = new android/widget/FrameLayout;
    ((FrameLayout)localObject1).<init>(paramContext);
    this.e = ((FrameLayout)localObject1);
    this.e.setAddStatesFromChildren(i2);
    localObject1 = this.e;
    addView((View)localObject1);
    localObject1 = this.d;
    Object localObject2 = a.b;
    ((d)localObject1).a((Interpolator)localObject2);
    localObject1 = this.d;
    localObject2 = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject2).<init>();
    ((d)localObject1).b((Interpolator)localObject2);
    this.d.b(8388659);
    localObject1 = a.k.TextInputLayout;
    int i3 = a.j.Widget_Design_TextInputLayout;
    localObject1 = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject1, paramInt, i3);
    i3 = a.k.TextInputLayout_hintEnabled;
    boolean bool1 = ((TintTypedArray)localObject1).getBoolean(i3, i2);
    this.g = bool1;
    int i4 = a.k.TextInputLayout_android_hint;
    localObject2 = ((TintTypedArray)localObject1).getText(i4);
    setHint((CharSequence)localObject2);
    i4 = a.k.TextInputLayout_hintAnimationEnabled;
    boolean bool2 = ((TintTypedArray)localObject1).getBoolean(i4, i2);
    this.K = bool2;
    int i5 = a.k.TextInputLayout_android_textColorHint;
    boolean bool3 = ((TintTypedArray)localObject1).hasValue(i5);
    if (bool3)
    {
      i6 = a.k.TextInputLayout_android_textColorHint;
      localObject2 = ((TintTypedArray)localObject1).getColorStateList(i6);
      this.I = ((ColorStateList)localObject2);
      this.H = ((ColorStateList)localObject2);
    }
    int i6 = a.k.TextInputLayout_hintTextAppearance;
    i6 = ((TintTypedArray)localObject1).getResourceId(i6, i1);
    if (i6 != i1)
    {
      i6 = a.k.TextInputLayout_hintTextAppearance;
      i6 = ((TintTypedArray)localObject1).getResourceId(i6, 0);
      setHintTextAppearance(i6);
    }
    i6 = a.k.TextInputLayout_errorTextAppearance;
    i6 = ((TintTypedArray)localObject1).getResourceId(i6, 0);
    this.o = i6;
    i6 = a.k.TextInputLayout_errorEnabled;
    boolean bool4 = ((TintTypedArray)localObject1).getBoolean(i6, false);
    int i7 = a.k.TextInputLayout_counterEnabled;
    boolean bool5 = ((TintTypedArray)localObject1).getBoolean(i7, false);
    int i8 = a.k.TextInputLayout_counterMaxLength;
    i8 = ((TintTypedArray)localObject1).getInt(i8, i1);
    setCounterMaxLength(i8);
    i8 = a.k.TextInputLayout_counterTextAppearance;
    i8 = ((TintTypedArray)localObject1).getResourceId(i8, 0);
    this.t = i8;
    i8 = a.k.TextInputLayout_counterOverflowTextAppearance;
    i8 = ((TintTypedArray)localObject1).getResourceId(i8, 0);
    this.u = i8;
    i8 = a.k.TextInputLayout_passwordToggleEnabled;
    boolean bool6 = ((TintTypedArray)localObject1).getBoolean(i8, false);
    this.w = bool6;
    int i9 = a.k.TextInputLayout_passwordToggleDrawable;
    Object localObject3 = ((TintTypedArray)localObject1).getDrawable(i9);
    this.x = ((Drawable)localObject3);
    i9 = a.k.TextInputLayout_passwordToggleContentDescription;
    localObject3 = ((TintTypedArray)localObject1).getText(i9);
    this.y = ((CharSequence)localObject3);
    i9 = a.k.TextInputLayout_passwordToggleTint;
    boolean bool7 = ((TintTypedArray)localObject1).hasValue(i9);
    if (bool7)
    {
      this.E = i2;
      i10 = a.k.TextInputLayout_passwordToggleTint;
      localObject3 = ((TintTypedArray)localObject1).getColorStateList(i10);
      this.D = ((ColorStateList)localObject3);
    }
    int i10 = a.k.TextInputLayout_passwordToggleTintMode;
    boolean bool8 = ((TintTypedArray)localObject1).hasValue(i10);
    if (bool8)
    {
      this.G = i2;
      int i11 = a.k.TextInputLayout_passwordToggleTintMode;
      i11 = ((TintTypedArray)localObject1).getInt(i11, i1);
      localObject3 = r.a(i11, null);
      this.F = ((PorterDuff.Mode)localObject3);
    }
    ((TintTypedArray)localObject1).recycle();
    setErrorEnabled(bool4);
    setCounterEnabled(bool5);
    h();
    int i12 = android.support.v4.view.r.d(this);
    if (i12 == 0) {
      android.support.v4.view.r.a(this, i2);
    }
    localObject1 = new android/support/design/widget/TextInputLayout$a;
    ((TextInputLayout.a)localObject1).<init>(this);
    android.support.v4.view.r.a(this, (android.support.v4.view.a)localObject1);
  }
  
  private void a()
  {
    Object localObject1 = (LinearLayout.LayoutParams)this.e.getLayoutParams();
    boolean bool = this.g;
    Paint localPaint;
    float f2;
    int i1;
    if (bool)
    {
      localPaint = this.i;
      if (localPaint == null)
      {
        localPaint = new android/graphics/Paint;
        localPaint.<init>();
        this.i = localPaint;
      }
      localPaint = this.i;
      Object localObject2 = this.d.b();
      localPaint.setTypeface((Typeface)localObject2);
      localPaint = this.i;
      localObject2 = this.d;
      float f1 = ((d)localObject2).e();
      localPaint.setTextSize(f1);
      localPaint = this.i;
      f2 = -localPaint.ascent();
      i1 = (int)f2;
    }
    for (;;)
    {
      int i2 = ((LinearLayout.LayoutParams)localObject1).topMargin;
      if (i1 != i2)
      {
        ((LinearLayout.LayoutParams)localObject1).topMargin = i1;
        localObject1 = this.e;
        ((FrameLayout)localObject1).requestLayout();
      }
      return;
      i1 = 0;
      f2 = 0.0F;
      localPaint = null;
    }
  }
  
  private static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    int i1 = 0;
    Object localObject = null;
    int i2 = paramViewGroup.getChildCount();
    for (int i3 = 0; i3 < i2; i3 = i1)
    {
      localObject = paramViewGroup.getChildAt(i3);
      ((View)localObject).setEnabled(paramBoolean);
      boolean bool = localObject instanceof ViewGroup;
      if (bool)
      {
        localObject = (ViewGroup)localObject;
        a((ViewGroup)localObject, paramBoolean);
      }
      i1 = i3 + 1;
    }
  }
  
  private void a(TextView paramTextView)
  {
    LinearLayout localLinearLayout = this.k;
    if (localLinearLayout != null)
    {
      localLinearLayout = this.k;
      localLinearLayout.removeView(paramTextView);
      int i1 = this.l + -1;
      this.l = i1;
      if (i1 == 0)
      {
        localLinearLayout = this.k;
        int i2 = 8;
        localLinearLayout.setVisibility(i2);
      }
    }
  }
  
  private void a(TextView paramTextView, int paramInt)
  {
    Object localObject1 = this.k;
    if (localObject1 == null)
    {
      localObject1 = new android/widget/LinearLayout;
      Object localObject2 = getContext();
      ((LinearLayout)localObject1).<init>((Context)localObject2);
      this.k = ((LinearLayout)localObject1);
      this.k.setOrientation(0);
      localObject1 = this.k;
      int i1 = -1;
      addView((View)localObject1, i1, -2);
      localObject1 = new android/support/v4/widget/m;
      localObject2 = getContext();
      ((m)localObject1).<init>((Context)localObject2);
      localObject2 = new android/widget/LinearLayout$LayoutParams;
      float f1 = 1.0F;
      ((LinearLayout.LayoutParams)localObject2).<init>(0, 0, f1);
      LinearLayout localLinearLayout = this.k;
      localLinearLayout.addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
      localObject1 = this.a;
      if (localObject1 != null) {
        b();
      }
    }
    this.k.setVisibility(0);
    this.k.addView(paramTextView, paramInt);
    int i2 = this.l + 1;
    this.l = i2;
  }
  
  private void a(CharSequence paramCharSequence, boolean paramBoolean)
  {
    long l1 = 200L;
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    int i2 = 0;
    Object localObject1 = null;
    float f2 = 1.0F;
    this.q = paramCharSequence;
    boolean bool2 = this.n;
    if (!bool2)
    {
      bool2 = TextUtils.isEmpty(paramCharSequence);
      if (bool2) {
        return;
      }
      setErrorEnabled(bool1);
    }
    bool2 = TextUtils.isEmpty(paramCharSequence);
    label67:
    Object localObject2;
    if (!bool2)
    {
      this.p = bool1;
      localObject2 = this.b.animate();
      ((ViewPropertyAnimator)localObject2).cancel();
      bool1 = this.p;
      if (!bool1) {
        break label256;
      }
      this.b.setText(paramCharSequence);
      localObject2 = this.b;
      ((TextView)localObject2).setVisibility(0);
      if (!paramBoolean) {
        break label240;
      }
      localObject2 = this.b;
      f1 = ((TextView)localObject2).getAlpha();
      bool1 = f1 < f2;
      if (!bool1)
      {
        localObject2 = this.b;
        ((TextView)localObject2).setAlpha(0.0F);
      }
      localObject2 = this.b.animate().alpha(f2).setDuration(l1);
      localObject1 = a.d;
      localObject2 = ((ViewPropertyAnimator)localObject2).setInterpolator((TimeInterpolator)localObject1);
      localObject1 = new android/support/design/widget/TextInputLayout$2;
      ((TextInputLayout.2)localObject1).<init>(this);
      localObject2 = ((ViewPropertyAnimator)localObject2).setListener((Animator.AnimatorListener)localObject1);
      ((ViewPropertyAnimator)localObject2).start();
    }
    for (;;)
    {
      c();
      a(paramBoolean);
      break;
      bool1 = false;
      localObject2 = null;
      f1 = 0.0F;
      break label67;
      label240:
      localObject2 = this.b;
      ((TextView)localObject2).setAlpha(f2);
      continue;
      label256:
      localObject2 = this.b;
      int i1 = ((TextView)localObject2).getVisibility();
      if (i1 == 0) {
        if (paramBoolean)
        {
          localObject2 = this.b.animate().alpha(0.0F).setDuration(l1);
          localObject1 = a.c;
          localObject2 = ((ViewPropertyAnimator)localObject2).setInterpolator((TimeInterpolator)localObject1);
          localObject1 = new android/support/design/widget/TextInputLayout$3;
          ((TextInputLayout.3)localObject1).<init>(this, paramCharSequence);
          localObject2 = ((ViewPropertyAnimator)localObject2).setListener((Animator.AnimatorListener)localObject1);
          ((ViewPropertyAnimator)localObject2).start();
        }
        else
        {
          this.b.setText(paramCharSequence);
          localObject2 = this.b;
          i2 = 4;
          ((TextView)localObject2).setVisibility(i2);
        }
      }
    }
  }
  
  private static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    boolean bool = false;
    int i1 = paramArrayOfInt.length;
    int i2 = 0;
    for (;;)
    {
      if (i2 < i1)
      {
        int i3 = paramArrayOfInt[i2];
        if (i3 == paramInt) {
          bool = true;
        }
      }
      else
      {
        return bool;
      }
      i2 += 1;
    }
  }
  
  private void b()
  {
    LinearLayout localLinearLayout = this.k;
    int i1 = android.support.v4.view.r.g(this.a);
    int i2 = android.support.v4.view.r.h(this.a);
    int i3 = this.a.getPaddingBottom();
    android.support.v4.view.r.a(localLinearLayout, i1, 0, i2, i3);
  }
  
  private void b(boolean paramBoolean)
  {
    boolean bool1 = this.w;
    int i1;
    boolean bool2;
    Object localObject;
    boolean bool3;
    PasswordTransformationMethod localPasswordTransformationMethod;
    if (bool1)
    {
      EditText localEditText = this.a;
      i1 = localEditText.getSelectionEnd();
      bool2 = f();
      if (!bool2) {
        break label104;
      }
      localObject = this.a;
      bool3 = false;
      localPasswordTransformationMethod = null;
      ((EditText)localObject).setTransformationMethod(null);
      bool2 = true;
    }
    for (this.A = bool2;; this.A = false)
    {
      localObject = this.z;
      bool3 = this.A;
      ((CheckableImageButton)localObject).setChecked(bool3);
      if (paramBoolean)
      {
        localObject = this.z;
        ((CheckableImageButton)localObject).jumpDrawablesToCurrentState();
      }
      localObject = this.a;
      ((EditText)localObject).setSelection(i1);
      return;
      label104:
      localObject = this.a;
      localPasswordTransformationMethod = PasswordTransformationMethod.getInstance();
      ((EditText)localObject).setTransformationMethod(localPasswordTransformationMethod);
      bool2 = false;
      localObject = null;
    }
  }
  
  private void c()
  {
    Object localObject1 = this.a;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.a.getBackground();
      if (localObject1 != null)
      {
        d();
        boolean bool1 = DrawableUtils.canSafelyMutateDrawable((Drawable)localObject1);
        if (bool1) {
          localObject1 = ((Drawable)localObject1).mutate();
        }
        bool1 = this.p;
        Object localObject2;
        PorterDuff.Mode localMode;
        if (bool1)
        {
          localObject2 = this.b;
          if (localObject2 != null)
          {
            int i1 = this.b.getCurrentTextColor();
            localMode = PorterDuff.Mode.SRC_IN;
            localObject2 = AppCompatDrawableManager.getPorterDuffColorFilter(i1, localMode);
            ((Drawable)localObject1).setColorFilter((ColorFilter)localObject2);
            continue;
          }
        }
        boolean bool2 = this.v;
        if (bool2)
        {
          localObject2 = this.r;
          if (localObject2 != null)
          {
            int i2 = this.r.getCurrentTextColor();
            localMode = PorterDuff.Mode.SRC_IN;
            localObject2 = AppCompatDrawableManager.getPorterDuffColorFilter(i2, localMode);
            ((Drawable)localObject1).setColorFilter((ColorFilter)localObject2);
            continue;
          }
        }
        android.support.v4.b.a.a.f((Drawable)localObject1);
        localObject1 = this.a;
        ((EditText)localObject1).refreshDrawableState();
      }
    }
  }
  
  private void c(boolean paramBoolean)
  {
    float f1 = 1.0F;
    Object localObject = this.L;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.L;
      bool = ((ValueAnimator)localObject).isRunning();
      if (bool)
      {
        localObject = this.L;
        ((ValueAnimator)localObject).cancel();
      }
    }
    if (paramBoolean)
    {
      bool = this.K;
      if (bool) {
        a(f1);
      }
    }
    for (;;)
    {
      this.J = false;
      return;
      localObject = this.d;
      ((d)localObject).b(f1);
    }
  }
  
  private void d()
  {
    int i1 = Build.VERSION.SDK_INT;
    int i2 = 21;
    if (i1 != i2)
    {
      i2 = 22;
      if (i1 == i2) {}
    }
    for (;;)
    {
      return;
      Object localObject = this.a.getBackground();
      if (localObject != null)
      {
        boolean bool2 = this.M;
        if (!bool2)
        {
          Drawable localDrawable = ((Drawable)localObject).getConstantState().newDrawable();
          boolean bool3 = localObject instanceof DrawableContainer;
          if (bool3)
          {
            localObject = (DrawableContainer)localObject;
            Drawable.ConstantState localConstantState = localDrawable.getConstantState();
            bool1 = e.a((DrawableContainer)localObject, localConstantState);
            this.M = bool1;
          }
          boolean bool1 = this.M;
          if (!bool1)
          {
            localObject = this.a;
            android.support.v4.view.r.a((View)localObject, localDrawable);
            bool1 = true;
            this.M = bool1;
          }
        }
      }
    }
  }
  
  private void d(boolean paramBoolean)
  {
    Object localObject = this.L;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.L;
      bool = ((ValueAnimator)localObject).isRunning();
      if (bool)
      {
        localObject = this.L;
        ((ValueAnimator)localObject).cancel();
      }
    }
    if (paramBoolean)
    {
      bool = this.K;
      if (bool) {
        a(0.0F);
      }
    }
    for (;;)
    {
      this.J = true;
      return;
      localObject = this.d;
      ((d)localObject).b(0.0F);
    }
  }
  
  private void e()
  {
    int i1 = 3;
    int i2 = 2;
    int i3 = 1;
    int i4 = 0;
    Object localObject1 = null;
    Object localObject2 = this.a;
    if (localObject2 == null) {}
    for (;;)
    {
      return;
      boolean bool1 = g();
      Object localObject3;
      Object localObject4;
      int i5;
      int i7;
      Object localObject5;
      if (bool1)
      {
        localObject2 = this.z;
        int i6;
        if (localObject2 == null)
        {
          localObject2 = LayoutInflater.from(getContext());
          i6 = a.h.design_text_input_password_icon;
          localObject3 = this.e;
          localObject2 = (CheckableImageButton)((LayoutInflater)localObject2).inflate(i6, (ViewGroup)localObject3, false);
          this.z = ((CheckableImageButton)localObject2);
          localObject2 = this.z;
          localObject4 = this.x;
          ((CheckableImageButton)localObject2).setImageDrawable((Drawable)localObject4);
          localObject2 = this.z;
          localObject4 = this.y;
          ((CheckableImageButton)localObject2).setContentDescription((CharSequence)localObject4);
          localObject2 = this.e;
          localObject4 = this.z;
          ((FrameLayout)localObject2).addView((View)localObject4);
          localObject2 = this.z;
          localObject4 = new android/support/design/widget/TextInputLayout$4;
          ((TextInputLayout.4)localObject4).<init>(this);
          ((CheckableImageButton)localObject2).setOnClickListener((View.OnClickListener)localObject4);
        }
        localObject2 = this.a;
        if (localObject2 != null)
        {
          localObject2 = this.a;
          i5 = android.support.v4.view.r.j((View)localObject2);
          if (i5 <= 0)
          {
            localObject2 = this.a;
            localObject4 = this.z;
            i6 = android.support.v4.view.r.j((View)localObject4);
            ((EditText)localObject2).setMinimumHeight(i6);
          }
        }
        this.z.setVisibility(0);
        localObject2 = this.z;
        boolean bool2 = this.A;
        ((CheckableImageButton)localObject2).setChecked(bool2);
        localObject2 = this.B;
        if (localObject2 == null)
        {
          localObject2 = new android/graphics/drawable/ColorDrawable;
          ((ColorDrawable)localObject2).<init>();
          this.B = ((Drawable)localObject2);
        }
        localObject2 = this.B;
        i7 = this.z.getMeasuredWidth();
        ((Drawable)localObject2).setBounds(0, 0, i7, i3);
        localObject2 = android.support.v4.widget.n.a(this.a);
        localObject4 = localObject2[i2];
        localObject3 = this.B;
        if (localObject4 != localObject3)
        {
          localObject4 = localObject2[i2];
          this.C = ((Drawable)localObject4);
        }
        localObject4 = this.a;
        localObject3 = localObject2[0];
        localObject1 = localObject2[i3];
        localObject5 = this.B;
        localObject2 = localObject2[i1];
        android.support.v4.widget.n.a((TextView)localObject4, (Drawable)localObject3, (Drawable)localObject1, (Drawable)localObject5, (Drawable)localObject2);
        localObject2 = this.z;
        localObject4 = this.a;
        i7 = ((EditText)localObject4).getPaddingLeft();
        localObject3 = this.a;
        int i8 = ((EditText)localObject3).getPaddingTop();
        localObject1 = this.a;
        i4 = ((EditText)localObject1).getPaddingRight();
        localObject5 = this.a;
        i3 = ((EditText)localObject5).getPaddingBottom();
        ((CheckableImageButton)localObject2).setPadding(i7, i8, i4, i3);
      }
      else
      {
        localObject2 = this.z;
        if (localObject2 != null)
        {
          localObject2 = this.z;
          i5 = ((CheckableImageButton)localObject2).getVisibility();
          if (i5 == 0)
          {
            localObject2 = this.z;
            i7 = 8;
            ((CheckableImageButton)localObject2).setVisibility(i7);
          }
        }
        localObject2 = this.B;
        if (localObject2 != null)
        {
          localObject2 = android.support.v4.widget.n.a(this.a);
          localObject4 = localObject2[i2];
          localObject3 = this.B;
          if (localObject4 == localObject3)
          {
            localObject4 = this.a;
            localObject3 = localObject2[0];
            localObject1 = localObject2[i3];
            localObject5 = this.C;
            localObject2 = localObject2[i1];
            android.support.v4.widget.n.a((TextView)localObject4, (Drawable)localObject3, (Drawable)localObject1, (Drawable)localObject5, (Drawable)localObject2);
            i5 = 0;
            localObject2 = null;
            this.B = null;
          }
        }
      }
    }
  }
  
  private boolean f()
  {
    Object localObject = this.a;
    boolean bool;
    if (localObject != null)
    {
      localObject = this.a.getTransformationMethod();
      bool = localObject instanceof PasswordTransformationMethod;
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private boolean g()
  {
    boolean bool = this.w;
    if (bool)
    {
      bool = f();
      if (!bool)
      {
        bool = this.A;
        if (!bool) {
          break label31;
        }
      }
    }
    label31:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  private void h()
  {
    Object localObject1 = this.x;
    if (localObject1 != null)
    {
      boolean bool = this.E;
      if (!bool)
      {
        bool = this.G;
        if (!bool) {}
      }
      else
      {
        localObject1 = android.support.v4.b.a.a.g(this.x).mutate();
        this.x = ((Drawable)localObject1);
        bool = this.E;
        Object localObject2;
        if (bool)
        {
          localObject1 = this.x;
          localObject2 = this.D;
          android.support.v4.b.a.a.a((Drawable)localObject1, (ColorStateList)localObject2);
        }
        bool = this.G;
        if (bool)
        {
          localObject1 = this.x;
          localObject2 = this.F;
          android.support.v4.b.a.a.a((Drawable)localObject1, (PorterDuff.Mode)localObject2);
        }
        localObject1 = this.z;
        if (localObject1 != null)
        {
          localObject1 = this.z.getDrawable();
          localObject2 = this.x;
          if (localObject1 != localObject2)
          {
            localObject1 = this.z;
            localObject2 = this.x;
            ((CheckableImageButton)localObject1).setImageDrawable((Drawable)localObject2);
          }
        }
      }
    }
  }
  
  private void setEditText(EditText paramEditText)
  {
    Object localObject1 = this.a;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("We already have an EditText, can only have one");
      throw ((Throwable)localObject1);
    }
    boolean bool1 = paramEditText instanceof n;
    if (!bool1)
    {
      localObject1 = "TextInputLayout";
      localObject2 = "EditText added is not a TextInputEditText. Please switch to using that class instead.";
      Log.i((String)localObject1, (String)localObject2);
    }
    this.a = ((EditText)paramEditText);
    bool1 = f();
    if (!bool1)
    {
      localObject1 = this.d;
      localObject2 = this.a.getTypeface();
      ((d)localObject1).a((Typeface)localObject2);
    }
    localObject1 = this.d;
    float f1 = this.a.getTextSize();
    ((d)localObject1).a(f1);
    int i1 = this.a.getGravity();
    Object localObject2 = this.d;
    int i3 = i1 & 0xFFFFFF8F | 0x30;
    ((d)localObject2).b(i3);
    this.d.a(i1);
    localObject1 = this.a;
    localObject2 = new android/support/design/widget/TextInputLayout$1;
    ((TextInputLayout.1)localObject2).<init>(this);
    ((EditText)localObject1).addTextChangedListener((TextWatcher)localObject2);
    localObject1 = this.H;
    if (localObject1 == null)
    {
      localObject1 = this.a.getHintTextColors();
      this.H = ((ColorStateList)localObject1);
    }
    boolean bool2 = this.g;
    if (bool2)
    {
      localObject1 = this.h;
      bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool2)
      {
        localObject1 = this.a.getHint();
        this.f = ((CharSequence)localObject1);
        localObject1 = this.f;
        setHint((CharSequence)localObject1);
        localObject1 = this.a;
        f1 = 0.0F;
        localObject2 = null;
        ((EditText)localObject1).setHint(null);
      }
    }
    localObject1 = this.r;
    if (localObject1 != null)
    {
      localObject1 = this.a.getText();
      int i2 = ((Editable)localObject1).length();
      a(i2);
    }
    localObject1 = this.k;
    if (localObject1 != null) {
      b();
    }
    e();
    a(false, true);
  }
  
  private void setHintInternal(CharSequence paramCharSequence)
  {
    this.h = paramCharSequence;
    this.d.a(paramCharSequence);
  }
  
  void a(float paramFloat)
  {
    Object localObject1 = this.d;
    float f1 = ((d)localObject1).d();
    boolean bool = f1 < paramFloat;
    if (!bool) {}
    for (;;)
    {
      return;
      localObject1 = this.L;
      if (localObject1 == null)
      {
        localObject1 = new android/animation/ValueAnimator;
        ((ValueAnimator)localObject1).<init>();
        this.L = ((ValueAnimator)localObject1);
        localObject1 = this.L;
        localObject2 = a.a;
        ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
        localObject1 = this.L;
        long l1 = 200L;
        ((ValueAnimator)localObject1).setDuration(l1);
        localObject1 = this.L;
        localObject2 = new android/support/design/widget/TextInputLayout$5;
        ((TextInputLayout.5)localObject2).<init>(this);
        ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
      }
      localObject1 = this.L;
      int i1 = 2;
      Object localObject2 = new float[i1];
      d locald = this.d;
      float f2 = locald.d();
      localObject2[0] = f2;
      int i2 = 1;
      localObject2[i2] = paramFloat;
      ((ValueAnimator)localObject1).setFloatValues((float[])localObject2);
      localObject1 = this.L;
      ((ValueAnimator)localObject1).start();
    }
  }
  
  void a(int paramInt)
  {
    int i1 = 1;
    boolean bool1 = this.v;
    int i2 = this.s;
    int i5 = -1;
    Object localObject1;
    String str;
    if (i2 == i5)
    {
      localObject1 = this.r;
      str = String.valueOf(paramInt);
      ((TextView)localObject1).setText(str);
      this.v = false;
      localObject1 = this.a;
      if (localObject1 != null)
      {
        boolean bool2 = this.v;
        if (bool1 != bool2)
        {
          a(false);
          c();
        }
      }
      return;
    }
    int i3 = this.s;
    label95:
    Object localObject2;
    if (paramInt > i3)
    {
      i3 = i1;
      this.v = i3;
      boolean bool3 = this.v;
      if (bool1 != bool3)
      {
        localObject2 = this.r;
        bool3 = this.v;
        if (!bool3) {
          break label231;
        }
      }
    }
    label231:
    for (int i4 = this.u;; i4 = this.t)
    {
      android.support.v4.widget.n.a((TextView)localObject2, i4);
      localObject1 = this.r;
      localObject2 = getContext();
      int i6 = a.i.character_counter_pattern;
      int i7 = 2;
      Object[] arrayOfObject = new Object[i7];
      Integer localInteger = Integer.valueOf(paramInt);
      arrayOfObject[0] = localInteger;
      int i8 = this.s;
      localInteger = Integer.valueOf(i8);
      arrayOfObject[i1] = localInteger;
      str = ((Context)localObject2).getString(i6, arrayOfObject);
      ((TextView)localObject1).setText(str);
      break;
      i4 = 0;
      localObject1 = null;
      break label95;
    }
  }
  
  void a(boolean paramBoolean)
  {
    a(paramBoolean, false);
  }
  
  void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    Object localObject1 = null;
    boolean bool3 = isEnabled();
    Object localObject2 = this.a;
    boolean bool4;
    boolean bool5;
    label83:
    ColorStateList localColorStateList;
    if (localObject2 != null)
    {
      localObject2 = this.a.getText();
      bool4 = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool4)
      {
        bool4 = bool1;
        int[] arrayOfInt = getDrawableState();
        bool5 = a(arrayOfInt, 16842908);
        Object localObject3 = getError();
        boolean bool6 = TextUtils.isEmpty((CharSequence)localObject3);
        if (bool6) {
          break label217;
        }
        localObject1 = this.H;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          localObject3 = this.H;
          ((d)localObject1).b((ColorStateList)localObject3);
        }
        if (!bool3) {
          break label222;
        }
        bool2 = this.v;
        if (!bool2) {
          break label222;
        }
        localObject1 = this.r;
        if (localObject1 == null) {
          break label222;
        }
        localObject1 = this.d;
        localColorStateList = this.r.getTextColors();
        ((d)localObject1).a(localColorStateList);
        label162:
        if (!bool4)
        {
          bool4 = isEnabled();
          if ((!bool4) || ((!bool5) && (!bool1))) {
            break label298;
          }
        }
        if (!paramBoolean2)
        {
          bool4 = this.J;
          if (!bool4) {}
        }
        else
        {
          c(paramBoolean1);
        }
      }
    }
    for (;;)
    {
      return;
      bool4 = false;
      localObject2 = null;
      break;
      label217:
      bool1 = false;
      break label83;
      label222:
      if ((bool3) && (bool5))
      {
        localObject1 = this.I;
        if (localObject1 != null)
        {
          localObject1 = this.d;
          localColorStateList = this.I;
          ((d)localObject1).a(localColorStateList);
          break label162;
        }
      }
      localObject1 = this.H;
      if (localObject1 == null) {
        break label162;
      }
      localObject1 = this.d;
      localColorStateList = this.H;
      ((d)localObject1).a(localColorStateList);
      break label162;
      label298:
      if (!paramBoolean2)
      {
        bool4 = this.J;
        if (bool4) {}
      }
      else
      {
        d(paramBoolean1);
      }
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramView instanceof EditText;
    if (bool)
    {
      Object localObject = new android/widget/FrameLayout$LayoutParams;
      ((FrameLayout.LayoutParams)localObject).<init>(paramLayoutParams);
      int i1 = ((FrameLayout.LayoutParams)localObject).gravity & 0xFFFFFF8F | 0x10;
      ((FrameLayout.LayoutParams)localObject).gravity = i1;
      FrameLayout localFrameLayout = this.e;
      localFrameLayout.addView((View)paramView, (ViewGroup.LayoutParams)localObject);
      localObject = this.e;
      ((FrameLayout)localObject).setLayoutParams(paramLayoutParams);
      a();
      paramView = (EditText)paramView;
      setEditText(paramView);
    }
    for (;;)
    {
      return;
      super.addView(paramView, paramInt, paramLayoutParams);
    }
  }
  
  /* Error */
  public void dispatchProvideAutofillStructure(android.view.ViewStructure paramViewStructure, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 733	android/support/design/widget/TextInputLayout:f	Ljava/lang/CharSequence;
    //   4: astore_3
    //   5: aload_3
    //   6: ifnull +12 -> 18
    //   9: aload_0
    //   10: getfield 377	android/support/design/widget/TextInputLayout:a	Landroid/widget/EditText;
    //   13: astore_3
    //   14: aload_3
    //   15: ifnonnull +10 -> 25
    //   18: aload_0
    //   19: aload_1
    //   20: iload_2
    //   21: invokespecial 854	android/widget/LinearLayout:dispatchProvideAutofillStructure	(Landroid/view/ViewStructure;I)V
    //   24: return
    //   25: aload_0
    //   26: getfield 377	android/support/design/widget/TextInputLayout:a	Landroid/widget/EditText;
    //   29: invokevirtual 731	android/widget/EditText:getHint	()Ljava/lang/CharSequence;
    //   32: astore_3
    //   33: aload_0
    //   34: getfield 377	android/support/design/widget/TextInputLayout:a	Landroid/widget/EditText;
    //   37: astore 4
    //   39: aload_0
    //   40: getfield 733	android/support/design/widget/TextInputLayout:f	Ljava/lang/CharSequence;
    //   43: astore 5
    //   45: aload 4
    //   47: aload 5
    //   49: invokevirtual 734	android/widget/EditText:setHint	(Ljava/lang/CharSequence;)V
    //   52: aload_0
    //   53: aload_1
    //   54: iload_2
    //   55: invokespecial 854	android/widget/LinearLayout:dispatchProvideAutofillStructure	(Landroid/view/ViewStructure;I)V
    //   58: aload_0
    //   59: getfield 377	android/support/design/widget/TextInputLayout:a	Landroid/widget/EditText;
    //   62: astore 4
    //   64: aload 4
    //   66: aload_3
    //   67: invokevirtual 734	android/widget/EditText:setHint	(Ljava/lang/CharSequence;)V
    //   70: goto -46 -> 24
    //   73: astore 4
    //   75: aload_0
    //   76: getfield 377	android/support/design/widget/TextInputLayout:a	Landroid/widget/EditText;
    //   79: aload_3
    //   80: invokevirtual 734	android/widget/EditText:setHint	(Ljava/lang/CharSequence;)V
    //   83: aload 4
    //   85: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	86	0	this	TextInputLayout
    //   0	86	1	paramViewStructure	android.view.ViewStructure
    //   0	86	2	paramInt	int
    //   4	76	3	localObject1	Object
    //   37	28	4	localEditText	EditText
    //   73	11	4	localObject2	Object
    //   43	5	5	localCharSequence	CharSequence
    // Exception table:
    //   from	to	target	type
    //   54	58	73	finally
  }
  
  protected void dispatchRestoreInstanceState(SparseArray paramSparseArray)
  {
    this.O = true;
    super.dispatchRestoreInstanceState(paramSparseArray);
    this.O = false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    boolean bool = this.g;
    if (bool)
    {
      d locald = this.d;
      locald.a(paramCanvas);
    }
  }
  
  protected void drawableStateChanged()
  {
    boolean bool1 = true;
    boolean bool2 = this.N;
    if (bool2) {
      return;
    }
    this.N = bool1;
    super.drawableStateChanged();
    int[] arrayOfInt = getDrawableState();
    boolean bool3 = android.support.v4.view.r.w(this);
    label48:
    d locald;
    if (bool3)
    {
      bool3 = isEnabled();
      if (bool3)
      {
        a(bool1);
        c();
        locald = this.d;
        if (locald == null) {
          break label107;
        }
        locald = this.d;
        bool1 = locald.a(arrayOfInt) | false;
      }
    }
    for (;;)
    {
      if (bool1) {
        invalidate();
      }
      this.N = false;
      break;
      bool1 = false;
      locald = null;
      break label48;
      label107:
      bool1 = false;
      locald = null;
    }
  }
  
  public int getCounterMaxLength()
  {
    return this.s;
  }
  
  public EditText getEditText()
  {
    return this.a;
  }
  
  public CharSequence getError()
  {
    boolean bool = this.n;
    if (bool) {}
    for (CharSequence localCharSequence = this.q;; localCharSequence = null)
    {
      return localCharSequence;
      bool = false;
    }
  }
  
  public CharSequence getHint()
  {
    boolean bool = this.g;
    if (bool) {}
    for (CharSequence localCharSequence = this.h;; localCharSequence = null)
    {
      return localCharSequence;
      bool = false;
    }
  }
  
  public CharSequence getPasswordVisibilityToggleContentDescription()
  {
    return this.y;
  }
  
  public Drawable getPasswordVisibilityToggleDrawable()
  {
    return this.x;
  }
  
  public Typeface getTypeface()
  {
    return this.m;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    boolean bool = this.g;
    if (bool)
    {
      Object localObject = this.a;
      if (localObject != null)
      {
        localObject = this.j;
        EditText localEditText1 = this.a;
        android.support.v4.widget.r.b(this, localEditText1, (Rect)localObject);
        int i2 = ((Rect)localObject).left;
        EditText localEditText2 = this.a;
        int i3 = localEditText2.getCompoundPaddingLeft();
        i2 += i3;
        i3 = ((Rect)localObject).right;
        int i4 = this.a.getCompoundPaddingRight();
        i3 -= i4;
        d locald = this.d;
        int i5 = ((Rect)localObject).top;
        int i6 = this.a.getCompoundPaddingTop();
        i5 += i6;
        int i1 = ((Rect)localObject).bottom;
        EditText localEditText3 = this.a;
        i6 = localEditText3.getCompoundPaddingBottom();
        i1 -= i6;
        locald.a(i2, i5, i3, i1);
        localObject = this.d;
        i4 = getPaddingTop();
        i5 = paramInt4 - paramInt2;
        i6 = getPaddingBottom();
        i5 -= i6;
        ((d)localObject).b(i2, i4, i3, i5);
        localObject = this.d;
        ((d)localObject).f();
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    e();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof TextInputLayout.SavedState;
    if (!bool) {
      super.onRestoreInstanceState(paramParcelable);
    }
    for (;;)
    {
      return;
      paramParcelable = (TextInputLayout.SavedState)paramParcelable;
      Object localObject = paramParcelable.getSuperState();
      super.onRestoreInstanceState((Parcelable)localObject);
      localObject = paramParcelable.a;
      setError((CharSequence)localObject);
      bool = paramParcelable.b;
      if (bool)
      {
        bool = true;
        b(bool);
      }
      requestLayout();
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    Object localObject = super.onSaveInstanceState();
    TextInputLayout.SavedState localSavedState = new android/support/design/widget/TextInputLayout$SavedState;
    localSavedState.<init>((Parcelable)localObject);
    boolean bool = this.p;
    if (bool)
    {
      localObject = getError();
      localSavedState.a = ((CharSequence)localObject);
    }
    bool = this.A;
    localSavedState.b = bool;
    return localSavedState;
  }
  
  public void setCounterEnabled(boolean paramBoolean)
  {
    boolean bool = this.c;
    Object localObject1;
    Object localObject3;
    int i2;
    if (bool != paramBoolean)
    {
      if (paramBoolean)
      {
        localObject1 = new android/support/v7/widget/AppCompatTextView;
        localObject3 = getContext();
        ((AppCompatTextView)localObject1).<init>((Context)localObject3);
        this.r = ((TextView)localObject1);
        localObject1 = this.r;
        i2 = a.f.textinput_counter;
        ((TextView)localObject1).setId(i2);
        localObject1 = this.m;
        if (localObject1 != null)
        {
          localObject1 = this.r;
          localObject3 = this.m;
          ((TextView)localObject1).setTypeface((Typeface)localObject3);
        }
        localObject1 = this.r;
        i2 = 1;
        ((TextView)localObject1).setMaxLines(i2);
      }
    }
    else
    {
      try
      {
        localObject1 = this.r;
        i2 = this.t;
        android.support.v4.widget.n.a((TextView)localObject1, i2);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localObject2 = this.r;
          i2 = R.style.TextAppearance_AppCompat_Caption;
          android.support.v4.widget.n.a((TextView)localObject2, i2);
          localObject2 = this.r;
          localObject3 = getContext();
          i3 = R.color.error_color_material;
          i2 = b.c((Context)localObject3, i3);
          ((TextView)localObject2).setTextColor(i2);
          continue;
          localObject2 = this.a.getText();
          i1 = ((Editable)localObject2).length();
          a(i1);
        }
      }
      localObject1 = this.r;
      i2 = -1;
      a((TextView)localObject1, i2);
      localObject1 = this.a;
      if (localObject1 == null)
      {
        bool = false;
        localObject1 = null;
        a(0);
      }
    }
    for (;;)
    {
      this.c = paramBoolean;
      return;
      int i3;
      Object localObject2 = this.r;
      a((TextView)localObject2);
      int i1 = 0;
      localObject2 = null;
      this.r = null;
    }
  }
  
  public void setCounterMaxLength(int paramInt)
  {
    int i1 = this.s;
    int i2;
    Object localObject;
    if (i1 != paramInt)
    {
      if (paramInt <= 0) {
        break label47;
      }
      this.s = paramInt;
      i2 = this.c;
      if (i2 != 0)
      {
        localObject = this.a;
        if (localObject != null) {
          break label57;
        }
        i2 = 0;
        localObject = null;
      }
    }
    for (;;)
    {
      a(i2);
      return;
      label47:
      int i3 = -1;
      this.s = i3;
      break;
      label57:
      localObject = this.a.getText();
      i3 = ((Editable)localObject).length();
    }
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    a(this, paramBoolean);
    super.setEnabled(paramBoolean);
  }
  
  public void setError(CharSequence paramCharSequence)
  {
    boolean bool = android.support.v4.view.r.w(this);
    Object localObject;
    if (bool)
    {
      bool = isEnabled();
      if (bool)
      {
        localObject = this.b;
        if (localObject != null)
        {
          localObject = this.b.getText();
          bool = TextUtils.equals((CharSequence)localObject, paramCharSequence);
          if (bool) {}
        }
        else
        {
          bool = true;
        }
      }
    }
    for (;;)
    {
      a(paramCharSequence, bool);
      return;
      bool = false;
      localObject = null;
    }
  }
  
  public void setErrorEnabled(boolean paramBoolean)
  {
    int i1 = 1;
    boolean bool = this.n;
    Object localObject1;
    Object localObject2;
    int i3;
    if (bool != paramBoolean)
    {
      localObject1 = this.b;
      if (localObject1 != null)
      {
        localObject1 = this.b.animate();
        ((ViewPropertyAnimator)localObject1).cancel();
      }
      if (!paramBoolean) {
        break label283;
      }
      localObject1 = new android/support/v7/widget/AppCompatTextView;
      localObject2 = getContext();
      ((AppCompatTextView)localObject1).<init>((Context)localObject2);
      this.b = ((TextView)localObject1);
      localObject1 = this.b;
      i3 = a.f.textinput_error;
      ((TextView)localObject1).setId(i3);
      localObject1 = this.m;
      if (localObject1 != null)
      {
        localObject1 = this.b;
        localObject2 = this.m;
        ((TextView)localObject1).setTypeface((Typeface)localObject2);
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = this.b;
        i3 = this.o;
        android.support.v4.widget.n.a((TextView)localObject1, i3);
        i2 = Build.VERSION.SDK_INT;
        i3 = 23;
        if (i2 < i3) {
          break label317;
        }
        localObject1 = this.b;
        localObject1 = ((TextView)localObject1).getTextColors();
        i2 = ((ColorStateList)localObject1).getDefaultColor();
        i3 = -65281;
        if (i2 != i3) {
          break label317;
        }
        i2 = i1;
      }
      catch (Exception localException)
      {
        int i4;
        i2 = i1;
        continue;
      }
      if (i2 != 0)
      {
        localObject1 = this.b;
        i3 = R.style.TextAppearance_AppCompat_Caption;
        android.support.v4.widget.n.a((TextView)localObject1, i3);
        localObject1 = this.b;
        localObject2 = getContext();
        i4 = R.color.error_color_material;
        i3 = b.c((Context)localObject2, i4);
        ((TextView)localObject1).setTextColor(i3);
      }
      localObject1 = this.b;
      i3 = 4;
      ((TextView)localObject1).setVisibility(i3);
      android.support.v4.view.r.b(this.b, i1);
      localObject1 = this.b;
      a((TextView)localObject1, 0);
      this.n = paramBoolean;
      return;
      label283:
      this.p = false;
      c();
      TextView localTextView = this.b;
      a(localTextView);
      int i2 = 0;
      localTextView = null;
      this.b = null;
      continue;
      label317:
      i2 = 0;
      localTextView = null;
    }
  }
  
  public void setErrorTextAppearance(int paramInt)
  {
    this.o = paramInt;
    TextView localTextView = this.b;
    if (localTextView != null)
    {
      localTextView = this.b;
      android.support.v4.widget.n.a(localTextView, paramInt);
    }
  }
  
  public void setHint(CharSequence paramCharSequence)
  {
    boolean bool = this.g;
    if (bool)
    {
      setHintInternal(paramCharSequence);
      int i1 = 2048;
      sendAccessibilityEvent(i1);
    }
  }
  
  public void setHintAnimationEnabled(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  public void setHintEnabled(boolean paramBoolean)
  {
    boolean bool1 = this.g;
    Object localObject;
    boolean bool2;
    CharSequence localCharSequence;
    if (paramBoolean != bool1)
    {
      this.g = paramBoolean;
      localObject = this.a.getHint();
      bool2 = this.g;
      if (bool2) {
        break label97;
      }
      localCharSequence = this.h;
      bool2 = TextUtils.isEmpty(localCharSequence);
      if (!bool2)
      {
        bool1 = TextUtils.isEmpty((CharSequence)localObject);
        if (bool1)
        {
          localObject = this.a;
          localCharSequence = this.h;
          ((EditText)localObject).setHint(localCharSequence);
        }
      }
      setHintInternal(null);
    }
    for (;;)
    {
      localObject = this.a;
      if (localObject != null) {
        a();
      }
      return;
      label97:
      bool2 = TextUtils.isEmpty((CharSequence)localObject);
      if (!bool2)
      {
        localCharSequence = this.h;
        bool2 = TextUtils.isEmpty(localCharSequence);
        if (bool2) {
          setHint((CharSequence)localObject);
        }
        localObject = this.a;
        ((EditText)localObject).setHint(null);
      }
    }
  }
  
  public void setHintTextAppearance(int paramInt)
  {
    this.d.c(paramInt);
    Object localObject = this.d.h();
    this.I = ((ColorStateList)localObject);
    localObject = this.a;
    if (localObject != null)
    {
      localObject = null;
      a(false);
      a();
    }
  }
  
  public void setPasswordVisibilityToggleContentDescription(int paramInt)
  {
    if (paramInt != 0) {}
    for (CharSequence localCharSequence = getResources().getText(paramInt);; localCharSequence = null)
    {
      setPasswordVisibilityToggleContentDescription(localCharSequence);
      return;
    }
  }
  
  public void setPasswordVisibilityToggleContentDescription(CharSequence paramCharSequence)
  {
    this.y = paramCharSequence;
    CheckableImageButton localCheckableImageButton = this.z;
    if (localCheckableImageButton != null)
    {
      localCheckableImageButton = this.z;
      localCheckableImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setPasswordVisibilityToggleDrawable(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = AppCompatResources.getDrawable(getContext(), paramInt);; localDrawable = null)
    {
      setPasswordVisibilityToggleDrawable(localDrawable);
      return;
    }
  }
  
  public void setPasswordVisibilityToggleDrawable(Drawable paramDrawable)
  {
    this.x = paramDrawable;
    CheckableImageButton localCheckableImageButton = this.z;
    if (localCheckableImageButton != null)
    {
      localCheckableImageButton = this.z;
      localCheckableImageButton.setImageDrawable(paramDrawable);
    }
  }
  
  public void setPasswordVisibilityToggleEnabled(boolean paramBoolean)
  {
    boolean bool = this.w;
    if (bool != paramBoolean)
    {
      this.w = paramBoolean;
      if (!paramBoolean)
      {
        bool = this.A;
        if (bool)
        {
          localEditText = this.a;
          if (localEditText != null)
          {
            localEditText = this.a;
            PasswordTransformationMethod localPasswordTransformationMethod = PasswordTransformationMethod.getInstance();
            localEditText.setTransformationMethod(localPasswordTransformationMethod);
          }
        }
      }
      bool = false;
      EditText localEditText = null;
      this.A = false;
      e();
    }
  }
  
  public void setPasswordVisibilityToggleTintList(ColorStateList paramColorStateList)
  {
    this.D = paramColorStateList;
    this.E = true;
    h();
  }
  
  public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode paramMode)
  {
    this.F = paramMode;
    this.G = true;
    h();
  }
  
  public void setTypeface(Typeface paramTypeface)
  {
    Object localObject = this.m;
    if (localObject != null)
    {
      localObject = this.m;
      boolean bool = ((Typeface)localObject).equals(paramTypeface);
      if (!bool) {}
    }
    else
    {
      localObject = this.m;
      if ((localObject != null) || (paramTypeface == null)) {
        return;
      }
    }
    this.m = paramTypeface;
    this.d.a(paramTypeface);
    localObject = this.r;
    if (localObject != null)
    {
      localObject = this.r;
      ((TextView)localObject).setTypeface(paramTypeface);
    }
    localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((TextView)localObject).setTypeface(paramTypeface);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\TextInputLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */