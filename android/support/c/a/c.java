package android.support.c.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class c
  extends h
  implements b
{
  final Drawable.Callback a;
  private c.a c;
  private Context d;
  private ArgbEvaluator e = null;
  private Animator.AnimatorListener f = null;
  private ArrayList g = null;
  
  c()
  {
    this(null, null, null);
  }
  
  private c(Context paramContext)
  {
    this(paramContext, null, null);
  }
  
  private c(Context paramContext, c.a parama, Resources paramResources)
  {
    Object localObject = new android/support/c/a/c$1;
    ((c.1)localObject).<init>(this);
    this.a = ((Drawable.Callback)localObject);
    this.d = paramContext;
    if (parama != null) {}
    for (this.c = parama;; this.c = ((c.a)localObject))
    {
      return;
      localObject = new android/support/c/a/c$a;
      Drawable.Callback localCallback = this.a;
      ((c.a)localObject).<init>(paramContext, parama, localCallback, paramResources);
    }
  }
  
  public static c a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    c localc = new android/support/c/a/c;
    localc.<init>(paramContext);
    localc.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localc;
  }
  
  private void a(Animator paramAnimator)
  {
    boolean bool1 = paramAnimator instanceof AnimatorSet;
    Object localObject;
    String str;
    if (bool1)
    {
      localObject = paramAnimator;
      localObject = (AnimatorSet)paramAnimator;
      ArrayList localArrayList = ((AnimatorSet)localObject).getChildAnimations();
      if (localArrayList != null)
      {
        bool1 = false;
        localObject = null;
        int j = 0;
        str = null;
        for (;;)
        {
          int i = localArrayList.size();
          if (j >= i) {
            break;
          }
          localObject = (Animator)localArrayList.get(j);
          a((Animator)localObject);
          i = j + 1;
          j = i;
        }
      }
    }
    boolean bool2 = paramAnimator instanceof ObjectAnimator;
    if (bool2)
    {
      paramAnimator = (ObjectAnimator)paramAnimator;
      localObject = paramAnimator.getPropertyName();
      str = "fillColor";
      boolean bool3 = str.equals(localObject);
      if (!bool3)
      {
        str = "strokeColor";
        bool2 = str.equals(localObject);
        if (!bool2) {}
      }
      else
      {
        localObject = this.e;
        if (localObject == null)
        {
          localObject = new android/animation/ArgbEvaluator;
          ((ArgbEvaluator)localObject).<init>();
          this.e = ((ArgbEvaluator)localObject);
        }
        localObject = this.e;
        paramAnimator.setEvaluator((TypeEvaluator)localObject);
      }
    }
  }
  
  private void a(String paramString, Animator paramAnimator)
  {
    Object localObject1 = this.c.b.a(paramString);
    paramAnimator.setTarget(localObject1);
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i < j) {
      a(paramAnimator);
    }
    localObject1 = c.a.a(this.c);
    if (localObject1 == null)
    {
      localObject1 = this.c;
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      c.a.a((c.a)localObject1, (ArrayList)localObject2);
      localObject1 = this.c;
      localObject2 = new android/support/v4/h/a;
      ((android.support.v4.h.a)localObject2).<init>();
      ((c.a)localObject1).d = ((android.support.v4.h.a)localObject2);
    }
    c.a.a(this.c).add(paramAnimator);
    this.c.d.put(paramAnimator, paramString);
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      android.support.v4.b.a.a.a(localDrawable, paramTheme);
    }
  }
  
  public boolean canApplyTheme()
  {
    Drawable localDrawable = this.b;
    boolean bool;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      bool = android.support.v4.b.a.a.d(localDrawable);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((Drawable)localObject).draw(paramCanvas);
    }
    for (;;)
    {
      return;
      this.c.b.draw(paramCanvas);
      localObject = this.c.c;
      boolean bool = ((AnimatorSet)localObject).isStarted();
      if (bool) {
        invalidateSelf();
      }
    }
  }
  
  public int getAlpha()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (int i = android.support.v4.b.a.a.c((Drawable)localObject);; i = ((i)localObject).getAlpha())
    {
      return i;
      localObject = this.c.b;
    }
  }
  
  public int getChangingConfigurations()
  {
    Drawable localDrawable = this.b;
    int i;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      i = localDrawable.getChangingConfigurations();
    }
    for (;;)
    {
      return i;
      i = super.getChangingConfigurations();
      c.a locala = this.c;
      int j = locala.a;
      i |= j;
    }
  }
  
  public Drawable.ConstantState getConstantState()
  {
    Object localObject = this.b;
    int i;
    if (localObject != null)
    {
      i = Build.VERSION.SDK_INT;
      int j = 24;
      if (i >= j)
      {
        localObject = new android/support/c/a/c$b;
        Drawable.ConstantState localConstantState = this.b.getConstantState();
        ((c.b)localObject).<init>(localConstantState);
      }
    }
    for (;;)
    {
      return (Drawable.ConstantState)localObject;
      i = 0;
      localObject = null;
    }
  }
  
  public int getIntrinsicHeight()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (int i = ((Drawable)localObject).getIntrinsicHeight();; i = ((i)localObject).getIntrinsicHeight())
    {
      return i;
      localObject = this.c.b;
    }
  }
  
  public int getIntrinsicWidth()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (int i = ((Drawable)localObject).getIntrinsicWidth();; i = ((i)localObject).getIntrinsicWidth())
    {
      return i;
      localObject = this.c.b;
    }
  }
  
  public int getOpacity()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (int i = ((Drawable)localObject).getOpacity();; i = ((i)localObject).getOpacity())
    {
      return i;
      localObject = this.c.b;
    }
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = 1;
    Object localObject1 = this.b;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject1, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    for (;;)
    {
      return;
      int j = paramXmlPullParser.getEventType();
      int k = paramXmlPullParser.getDepth() + 1;
      if (j != i)
      {
        int m = paramXmlPullParser.getDepth();
        if (m < k)
        {
          m = 3;
          if (j == m) {}
        }
        else
        {
          m = 2;
          Object localObject2;
          Object localObject3;
          Context localContext;
          if (j == m)
          {
            localObject1 = paramXmlPullParser.getName();
            localObject2 = "animated-vector";
            boolean bool2 = ((String)localObject2).equals(localObject1);
            if (!bool2) {
              break label237;
            }
            localObject1 = a.e;
            localObject1 = android.support.v4.a.a.c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject1);
            int n = ((TypedArray)localObject1).getResourceId(0, 0);
            if (n != 0)
            {
              localObject2 = i.a(paramResources, n, paramTheme);
              ((i)localObject2).a(false);
              localObject3 = this.a;
              ((i)localObject2).setCallback((Drawable.Callback)localObject3);
              localObject3 = this.c.b;
              if (localObject3 != null)
              {
                localObject3 = this.c.b;
                localContext = null;
                ((i)localObject3).setCallback(null);
              }
              localObject3 = this.c;
              ((c.a)localObject3).b = ((i)localObject2);
            }
            ((TypedArray)localObject1).recycle();
          }
          for (;;)
          {
            j = paramXmlPullParser.next();
            break;
            label237:
            localObject2 = "target";
            boolean bool1 = ((String)localObject2).equals(localObject1);
            if (bool1)
            {
              localObject1 = a.f;
              localObject1 = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject1);
              localObject2 = ((TypedArray)localObject1).getString(0);
              int i1 = ((TypedArray)localObject1).getResourceId(i, 0);
              if (i1 != 0)
              {
                localContext = this.d;
                if (localContext == null) {
                  break label335;
                }
                localContext = this.d;
                localObject3 = e.a(localContext, i1);
                a((String)localObject2, (Animator)localObject3);
              }
              ((TypedArray)localObject1).recycle();
            }
          }
          label335:
          ((TypedArray)localObject1).recycle();
          localObject1 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject1).<init>("Context can't be null when inflating animators");
          throw ((Throwable)localObject1);
        }
      }
      localObject1 = this.c;
      ((c.a)localObject1).a();
    }
  }
  
  public boolean isAutoMirrored()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (boolean bool = android.support.v4.b.a.a.b((Drawable)localObject);; bool = ((i)localObject).isAutoMirrored())
    {
      return bool;
      localObject = this.c.b;
    }
  }
  
  public boolean isRunning()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = (AnimatedVectorDrawable)this.b;
    }
    for (boolean bool = ((AnimatedVectorDrawable)localObject).isRunning();; bool = ((AnimatorSet)localObject).isRunning())
    {
      return bool;
      localObject = this.c.c;
    }
  }
  
  public boolean isStateful()
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (boolean bool = ((Drawable)localObject).isStateful();; bool = ((i)localObject).isStateful())
    {
      return bool;
      localObject = this.c.b;
    }
  }
  
  public Drawable mutate()
  {
    Drawable localDrawable = this.b;
    if (localDrawable != null)
    {
      localDrawable = this.b;
      localDrawable.mutate();
    }
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((Drawable)localObject).setBounds(paramRect);
    }
    for (;;)
    {
      return;
      localObject = this.c.b;
      ((i)localObject).setBounds(paramRect);
    }
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (boolean bool = ((Drawable)localObject).setLevel(paramInt);; bool = ((i)localObject).setLevel(paramInt))
    {
      return bool;
      localObject = this.c.b;
    }
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (boolean bool = ((Drawable)localObject).setState(paramArrayOfInt);; bool = ((i)localObject).setState(paramArrayOfInt))
    {
      return bool;
      localObject = this.c.b;
    }
  }
  
  public void setAlpha(int paramInt)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((Drawable)localObject).setAlpha(paramInt);
    }
    for (;;)
    {
      return;
      localObject = this.c.b;
      ((i)localObject).setAlpha(paramInt);
    }
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject, paramBoolean);
    }
    for (;;)
    {
      return;
      localObject = this.c.b;
      ((i)localObject).setAutoMirrored(paramBoolean);
    }
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      ((Drawable)localObject).setColorFilter(paramColorFilter);
    }
    for (;;)
    {
      return;
      localObject = this.c.b;
      ((i)localObject).setColorFilter(paramColorFilter);
    }
  }
  
  public void setTint(int paramInt)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject, paramInt);
    }
    for (;;)
    {
      return;
      localObject = this.c.b;
      ((i)localObject).setTint(paramInt);
    }
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject, paramColorStateList);
    }
    for (;;)
    {
      return;
      localObject = this.c.b;
      ((i)localObject).setTintList(paramColorStateList);
    }
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b;
      android.support.v4.b.a.a.a((Drawable)localObject, paramMode);
    }
    for (;;)
    {
      return;
      localObject = this.c.b;
      ((i)localObject).setTintMode(paramMode);
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Object localObject = this.b;
    if (localObject != null) {
      localObject = this.b;
    }
    for (boolean bool = ((Drawable)localObject).setVisible(paramBoolean1, paramBoolean2);; bool = super.setVisible(paramBoolean1, paramBoolean2))
    {
      return bool;
      localObject = this.c.b;
      ((i)localObject).setVisible(paramBoolean1, paramBoolean2);
    }
  }
  
  public void start()
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = (AnimatedVectorDrawable)this.b;
      ((AnimatedVectorDrawable)localObject).start();
    }
    for (;;)
    {
      return;
      localObject = this.c.c;
      boolean bool = ((AnimatorSet)localObject).isStarted();
      if (!bool)
      {
        localObject = this.c.c;
        ((AnimatorSet)localObject).start();
        invalidateSelf();
      }
    }
  }
  
  public void stop()
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = (AnimatedVectorDrawable)this.b;
      ((AnimatedVectorDrawable)localObject).stop();
    }
    for (;;)
    {
      return;
      localObject = this.c.c;
      ((AnimatorSet)localObject).end();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */