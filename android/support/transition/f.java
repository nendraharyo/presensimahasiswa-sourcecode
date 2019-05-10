package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

public class f
  extends u
{
  private static final String[] g;
  private static final Property h;
  private static final Property i;
  private static final Property j;
  private static final Property k;
  private static final Property l;
  private static final Property m;
  private static s q;
  private int[] n;
  private boolean o;
  private boolean p;
  
  static
  {
    Object localObject = new String[5];
    localObject[0] = "android:changeBounds:bounds";
    localObject[1] = "android:changeBounds:clip";
    localObject[2] = "android:changeBounds:parent";
    localObject[3] = "android:changeBounds:windowX";
    localObject[4] = "android:changeBounds:windowY";
    g = (String[])localObject;
    localObject = new android/support/transition/f$1;
    ((f.1)localObject).<init>(PointF.class, "boundsOrigin");
    h = (Property)localObject;
    localObject = new android/support/transition/f$3;
    ((f.3)localObject).<init>(PointF.class, "topLeft");
    i = (Property)localObject;
    localObject = new android/support/transition/f$4;
    ((f.4)localObject).<init>(PointF.class, "bottomRight");
    j = (Property)localObject;
    localObject = new android/support/transition/f$5;
    ((f.5)localObject).<init>(PointF.class, "bottomRight");
    k = (Property)localObject;
    localObject = new android/support/transition/f$6;
    ((f.6)localObject).<init>(PointF.class, "topLeft");
    l = (Property)localObject;
    localObject = new android/support/transition/f$7;
    ((f.7)localObject).<init>(PointF.class, "position");
    m = (Property)localObject;
    localObject = new android/support/transition/s;
    ((s)localObject).<init>();
    q = (s)localObject;
  }
  
  public f()
  {
    int[] arrayOfInt = new int[2];
    this.n = arrayOfInt;
    this.o = false;
    this.p = false;
  }
  
  private boolean a(View paramView1, View paramView2)
  {
    boolean bool1 = true;
    boolean bool2 = this.p;
    Object localObject;
    if (bool2)
    {
      localObject = b(paramView1, bool1);
      if (localObject != null) {
        break label38;
      }
      if (paramView1 != paramView2) {
        break label33;
      }
    }
    for (;;)
    {
      return bool1;
      label33:
      bool1 = false;
      continue;
      label38:
      localObject = ((aa)localObject).b;
      if (paramView2 != localObject) {
        bool1 = false;
      }
    }
  }
  
  private void d(aa paramaa)
  {
    Object localObject1 = paramaa.b;
    boolean bool1 = r.w((View)localObject1);
    if (!bool1)
    {
      int i1 = ((View)localObject1).getWidth();
      if (i1 == 0)
      {
        i1 = ((View)localObject1).getHeight();
        if (i1 == 0) {
          return;
        }
      }
    }
    Object localObject2 = paramaa.a;
    Object localObject3 = new android/graphics/Rect;
    int i2 = ((View)localObject1).getLeft();
    int i3 = ((View)localObject1).getTop();
    int i4 = ((View)localObject1).getRight();
    int i5 = ((View)localObject1).getBottom();
    ((Rect)localObject3).<init>(i2, i3, i4, i5);
    ((Map)localObject2).put("android:changeBounds:bounds", localObject3);
    localObject2 = paramaa.a;
    Object localObject4 = "android:changeBounds:parent";
    localObject3 = paramaa.b.getParent();
    ((Map)localObject2).put(localObject4, localObject3);
    boolean bool2 = this.p;
    if (bool2)
    {
      localObject2 = paramaa.b;
      localObject4 = this.n;
      ((View)localObject2).getLocationInWindow((int[])localObject4);
      localObject2 = paramaa.a;
      localObject3 = Integer.valueOf(this.n[0]);
      ((Map)localObject2).put("android:changeBounds:windowX", localObject3);
      localObject2 = paramaa.a;
      localObject4 = "android:changeBounds:windowY";
      localObject3 = this.n;
      i2 = 1;
      int i6 = localObject3[i2];
      localObject3 = Integer.valueOf(i6);
      ((Map)localObject2).put(localObject4, localObject3);
    }
    bool2 = this.o;
    if (bool2)
    {
      localObject2 = paramaa.a;
      localObject4 = "android:changeBounds:clip";
      localObject1 = r.y((View)localObject1);
      ((Map)localObject2).put(localObject4, localObject1);
    }
  }
  
  public Animator a(ViewGroup paramViewGroup, aa paramaa1, aa paramaa2)
  {
    int i1;
    float f1;
    if ((paramaa1 == null) || (paramaa2 == null))
    {
      i1 = 0;
      f1 = 0.0F;
    }
    Object localObject2;
    for (Object localObject1 = null;; localObject1 = null)
    {
      return (Animator)localObject1;
      localObject2 = paramaa1.a;
      localObject1 = paramaa2.a;
      localObject2 = (ViewGroup)((Map)localObject2).get("android:changeBounds:parent");
      localObject3 = "android:changeBounds:parent";
      localObject1 = (ViewGroup)((Map)localObject1).get(localObject3);
      if ((localObject2 != null) && (localObject1 != null)) {
        break;
      }
      i1 = 0;
      f1 = 0.0F;
    }
    Object localObject3 = paramaa2.b;
    boolean bool1 = a((View)localObject2, (View)localObject1);
    int i4;
    int i5;
    int i6;
    int i7;
    int i8;
    int i9;
    int i10;
    int i11;
    int i12;
    int i13;
    int i14;
    int i15;
    Object localObject4;
    label360:
    boolean bool5;
    float f2;
    float f3;
    float f4;
    float f5;
    label486:
    float f6;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    int i16;
    float f9;
    float f10;
    float f11;
    Object localObject8;
    Object localObject9;
    if (bool1)
    {
      localObject2 = (Rect)paramaa1.a.get("android:changeBounds:bounds");
      localObject1 = (Rect)paramaa2.a.get("android:changeBounds:bounds");
      i4 = ((Rect)localObject2).left;
      i5 = ((Rect)localObject1).left;
      i6 = ((Rect)localObject2).top;
      i7 = ((Rect)localObject1).top;
      i8 = ((Rect)localObject2).right;
      i9 = ((Rect)localObject1).right;
      i10 = ((Rect)localObject2).bottom;
      i11 = ((Rect)localObject1).bottom;
      i12 = i8 - i4;
      i13 = i10 - i6;
      i14 = i9 - i5;
      i15 = i11 - i7;
      localObject2 = (Rect)paramaa1.a.get("android:changeBounds:clip");
      localObject4 = (Rect)paramaa2.a.get("android:changeBounds:clip");
      i1 = 0;
      f1 = 0.0F;
      localObject1 = null;
      if (((i12 != 0) && (i13 != 0)) || ((i14 != 0) && (i15 != 0)))
      {
        if ((i4 != i5) || (i6 != i7))
        {
          i1 = 1;
          f1 = Float.MIN_VALUE;
        }
        if ((i8 != i9) || (i10 != i11)) {
          i1 += 1;
        }
      }
      if (localObject2 != null)
      {
        bool4 = ((Rect)localObject2).equals(localObject4);
        if (!bool4) {}
      }
      else
      {
        if ((localObject2 != null) || (localObject4 == null)) {
          break label360;
        }
      }
      i1 += 1;
      if (i1 <= 0) {
        break label1682;
      }
      bool5 = this.o;
      boolean bool4 = bool5;
      if (!bool5)
      {
        am.a((View)localObject3, i4, i6, i8, i10);
        int i2 = 2;
        f2 = 2.8E-45F;
        if (i1 == i2) {
          if (i12 == i14)
          {
            bool5 = i15;
            if (i13 == i15)
            {
              localObject2 = l();
              f1 = i4;
              f3 = i6;
              f4 = i5;
              f5 = i7;
              localObject2 = ((l)localObject2).a(f1, f3, f4, f5);
              localObject1 = m;
              localObject2 = h.a(localObject3, (Property)localObject1, (Path)localObject2);
              localObject1 = localObject2;
            }
          }
        }
        for (;;)
        {
          localObject2 = ((View)localObject3).getParent();
          boolean bool2 = localObject2 instanceof ViewGroup;
          if (!bool2) {
            break;
          }
          localObject2 = (ViewGroup)((View)localObject3).getParent();
          boolean bool6 = true;
          af.a((ViewGroup)localObject2, bool6);
          localObject3 = new android/support/transition/f$10;
          ((f.10)localObject3).<init>(this, (ViewGroup)localObject2);
          a((u.c)localObject3);
          break;
          localObject1 = new android/support/transition/f$a;
          ((f.a)localObject1).<init>((View)localObject3);
          localObject2 = l();
          f3 = i4;
          f6 = i6;
          f4 = i5;
          f5 = i7;
          localObject2 = ((l)localObject2).a(f3, f6, f4, f5);
          localObject4 = i;
          localObject4 = h.a(localObject1, (Property)localObject4, (Path)localObject2);
          localObject2 = l();
          f4 = i8;
          f5 = i10;
          float f7 = i9;
          float f8 = i11;
          localObject2 = ((l)localObject2).a(f4, f5, f7, f8);
          localObject5 = j;
          localObject5 = h.a(localObject1, (Property)localObject5, (Path)localObject2);
          localObject2 = new android/animation/AnimatorSet;
          ((AnimatorSet)localObject2).<init>();
          i7 = 2;
          f5 = 2.8E-45F;
          localObject6 = new Animator[i7];
          i9 = 0;
          f7 = 0.0F;
          localObject7 = null;
          localObject6[0] = localObject4;
          i16 = 1;
          f3 = Float.MIN_VALUE;
          localObject6[i16] = localObject5;
          ((AnimatorSet)localObject2).playTogether((Animator[])localObject6);
          localObject4 = new android/support/transition/f$8;
          ((f.8)localObject4).<init>(this, (f.a)localObject1);
          ((AnimatorSet)localObject2).addListener((Animator.AnimatorListener)localObject4);
          localObject1 = localObject2;
          continue;
          if ((i4 != i5) || (i6 != i7))
          {
            localObject2 = l();
            f1 = i4;
            f3 = i6;
            f4 = i5;
            f5 = i7;
            localObject2 = ((l)localObject2).a(f1, f3, f4, f5);
            localObject1 = l;
            localObject2 = h.a(localObject3, (Property)localObject1, (Path)localObject2);
            localObject1 = localObject2;
          }
          else
          {
            localObject2 = l();
            f1 = i8;
            f3 = i10;
            f4 = i9;
            f5 = i11;
            localObject2 = ((l)localObject2).a(f1, f3, f4, f5);
            localObject1 = k;
            localObject2 = h.a(localObject3, (Property)localObject1, (Path)localObject2);
            localObject1 = localObject2;
          }
        }
      }
      i1 = Math.max(i12, i14);
      bool5 = i15;
      i8 = Math.max(i13, i15);
      i1 += i4;
      i8 += i6;
      am.a((View)localObject3, i4, i6, i1, i8);
      i1 = 0;
      f1 = 0.0F;
      localObject1 = null;
      if ((i4 == i5) && (i6 == i7)) {
        break label1720;
      }
      localObject1 = l();
      f6 = i4;
      f9 = i6;
      f10 = i5;
      f11 = i7;
      localObject1 = ((l)localObject1).a(f6, f9, f10, f11);
      localObject8 = m;
      localObject1 = h.a(localObject3, (Property)localObject8, (Path)localObject1);
      localObject9 = localObject1;
    }
    for (;;)
    {
      if (localObject2 == null)
      {
        localObject2 = new android/graphics/Rect;
        i1 = 0;
        f1 = 0.0F;
        localObject1 = null;
        i4 = 0;
        f6 = 0.0F;
        ((Rect)localObject2).<init>(0, 0, i12, i13);
      }
      for (localObject8 = localObject2;; localObject8 = localObject2)
      {
        s locals;
        if (localObject4 == null)
        {
          localObject2 = new android/graphics/Rect;
          i1 = 0;
          f1 = 0.0F;
          localObject1 = null;
          i8 = 0;
          f10 = 0.0F;
          locals = null;
          bool5 = i15;
          ((Rect)localObject2).<init>(0, 0, i14, i15);
        }
        for (;;)
        {
          i1 = 0;
          f1 = 0.0F;
          localObject1 = null;
          boolean bool3 = ((Rect)localObject8).equals(localObject2);
          if (!bool3)
          {
            r.a((View)localObject3, (Rect)localObject8);
            locals = q;
            i10 = 2;
            f11 = 2.8E-45F;
            Object[] arrayOfObject = new Object[i10];
            i12 = 0;
            arrayOfObject[0] = localObject8;
            i4 = 1;
            f6 = Float.MIN_VALUE;
            arrayOfObject[i4] = localObject2;
            localObject8 = ObjectAnimator.ofObject(localObject3, "clipBounds", locals, arrayOfObject);
            localObject2 = new android/support/transition/f$9;
            localObject1 = this;
            ((f.9)localObject2).<init>(this, (View)localObject3, (Rect)localObject4, i5, i7, i9, i11);
            ((ObjectAnimator)localObject8).addListener((Animator.AnimatorListener)localObject2);
            localObject2 = localObject8;
          }
          for (;;)
          {
            localObject2 = z.a((Animator)localObject9, (Animator)localObject2);
            localObject1 = localObject2;
            break label486;
            localObject2 = paramaa1.a;
            localObject1 = "android:changeBounds:windowX";
            i1 = ((Integer)((Map)localObject2).get(localObject1)).intValue();
            localObject2 = paramaa1.a;
            localObject4 = "android:changeBounds:windowY";
            i16 = ((Integer)((Map)localObject2).get(localObject4)).intValue();
            localObject2 = paramaa2.a;
            localObject5 = "android:changeBounds:windowX";
            i5 = ((Integer)((Map)localObject2).get(localObject5)).intValue();
            localObject2 = paramaa2.a;
            localObject6 = "android:changeBounds:windowY";
            localObject2 = (Integer)((Map)localObject2).get(localObject6);
            int i3 = ((Integer)localObject2).intValue();
            if ((i1 != i5) || (i16 != i3))
            {
              localObject6 = this.n;
              paramViewGroup.getLocationInWindow((int[])localObject6);
              i7 = ((View)localObject3).getWidth();
              i9 = ((View)localObject3).getHeight();
              Object localObject10 = Bitmap.Config.ARGB_8888;
              localObject6 = Bitmap.createBitmap(i7, i9, (Bitmap.Config)localObject10);
              localObject7 = new android/graphics/Canvas;
              ((Canvas)localObject7).<init>((Bitmap)localObject6);
              ((View)localObject3).draw((Canvas)localObject7);
              localObject7 = new android/graphics/drawable/BitmapDrawable;
              ((BitmapDrawable)localObject7).<init>((Bitmap)localObject6);
              f6 = am.c((View)localObject3);
              i7 = 0;
              f5 = 0.0F;
              am.a((View)localObject3, 0.0F);
              am.a(paramViewGroup).a((Drawable)localObject7);
              localObject6 = l();
              i11 = this.n[0];
              f1 = i1 - i11;
              i11 = this.n[1];
              f3 = i16 - i11;
              localObject10 = this.n;
              localObject9 = null;
              i11 = localObject10[0];
              i5 -= i11;
              f4 = i5;
              localObject10 = this.n;
              i6 = 1;
              f9 = Float.MIN_VALUE;
              i11 = localObject10[i6];
              i3 -= i11;
              f2 = i3;
              localObject2 = ((l)localObject6).a(f1, f3, f4, f2);
              localObject2 = n.a(h, (Path)localObject2);
              i1 = 1;
              f1 = Float.MIN_VALUE;
              localObject1 = new PropertyValuesHolder[i1];
              i16 = 0;
              f3 = 0.0F;
              localObject1[0] = localObject2;
              localObject1 = ObjectAnimator.ofPropertyValuesHolder(localObject7, (PropertyValuesHolder[])localObject1);
              localObject4 = new android/support/transition/f$2;
              localObject5 = this;
              localObject6 = paramViewGroup;
              localObject10 = localObject3;
              ((f.2)localObject4).<init>(this, paramViewGroup, (BitmapDrawable)localObject7, (View)localObject3, f6);
              ((ObjectAnimator)localObject1).addListener((Animator.AnimatorListener)localObject4);
              break;
            }
            label1682:
            i1 = 0;
            f1 = 0.0F;
            localObject1 = null;
            break;
            i3 = 0;
            localObject2 = null;
            f2 = 0.0F;
          }
          localObject2 = localObject4;
        }
      }
      label1720:
      i6 = 0;
      localObject9 = null;
      f9 = 0.0F;
    }
  }
  
  public void a(aa paramaa)
  {
    d(paramaa);
  }
  
  public String[] a()
  {
    return g;
  }
  
  public void b(aa paramaa)
  {
    d(paramaa);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */