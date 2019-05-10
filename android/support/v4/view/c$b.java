package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

class c$b
  implements c.a
{
  private static final int j = ;
  private static final int k = ViewConfiguration.getTapTimeout();
  private static final int l = ViewConfiguration.getDoubleTapTimeout();
  final GestureDetector.OnGestureListener a;
  GestureDetector.OnDoubleTapListener b;
  boolean c;
  boolean d;
  MotionEvent e;
  private int f;
  private int g;
  private int h;
  private int i;
  private final Handler m;
  private boolean n;
  private boolean o;
  private boolean p;
  private MotionEvent q;
  private boolean r;
  private float s;
  private float t;
  private float u;
  private float v;
  private boolean w;
  private VelocityTracker x;
  
  c$b(Context paramContext, GestureDetector.OnGestureListener paramOnGestureListener, Handler paramHandler)
  {
    c.b.a locala;
    if (paramHandler != null)
    {
      locala = new android/support/v4/view/c$b$a;
      locala.<init>(this, paramHandler);
    }
    for (this.m = locala;; this.m = locala)
    {
      this.a = paramOnGestureListener;
      boolean bool = paramOnGestureListener instanceof GestureDetector.OnDoubleTapListener;
      if (bool)
      {
        paramOnGestureListener = (GestureDetector.OnDoubleTapListener)paramOnGestureListener;
        a(paramOnGestureListener);
      }
      a(paramContext);
      return;
      locala = new android/support/v4/view/c$b$a;
      locala.<init>(this);
    }
  }
  
  private void a(Context paramContext)
  {
    if (paramContext == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Context must not be null");
      throw ((Throwable)localObject);
    }
    Object localObject = this.a;
    if (localObject == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("OnGestureListener must not be null");
      throw ((Throwable)localObject);
    }
    this.w = true;
    localObject = ViewConfiguration.get(paramContext);
    int i1 = ((ViewConfiguration)localObject).getScaledTouchSlop();
    int i2 = ((ViewConfiguration)localObject).getScaledDoubleTapSlop();
    int i3 = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
    this.h = i3;
    int i4 = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
    this.i = i4;
    i4 = i1 * i1;
    this.f = i4;
    i4 = i2 * i2;
    this.g = i4;
  }
  
  private boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, MotionEvent paramMotionEvent3)
  {
    boolean bool1 = false;
    boolean bool2 = this.p;
    if (!bool2) {}
    for (;;)
    {
      return bool1;
      long l1 = paramMotionEvent3.getEventTime();
      long l2 = paramMotionEvent2.getEventTime();
      l1 -= l2;
      l2 = l;
      bool2 = l1 < l2;
      if (!bool2)
      {
        float f1 = paramMotionEvent1.getX();
        int i1 = (int)f1;
        int i2 = (int)paramMotionEvent3.getX();
        i1 -= i2;
        float f2 = paramMotionEvent1.getY();
        i2 = (int)f2;
        float f3 = paramMotionEvent3.getY();
        int i3 = (int)f3;
        i2 -= i3;
        i1 *= i1;
        i2 *= i2;
        i1 += i2;
        i2 = this.g;
        if (i1 < i2) {
          bool1 = true;
        }
      }
    }
  }
  
  private void b()
  {
    this.m.removeMessages(1);
    this.m.removeMessages(2);
    Handler localHandler = this.m;
    int i1 = 3;
    localHandler.removeMessages(i1);
    this.x.recycle();
    localHandler = null;
    this.x = null;
    this.r = false;
    this.c = false;
    this.o = false;
    this.p = false;
    this.d = false;
    boolean bool = this.n;
    if (bool) {
      this.n = false;
    }
  }
  
  private void c()
  {
    this.m.removeMessages(1);
    this.m.removeMessages(2);
    Handler localHandler = this.m;
    int i1 = 3;
    localHandler.removeMessages(i1);
    this.r = false;
    this.o = false;
    this.p = false;
    this.d = false;
    boolean bool = this.n;
    if (bool) {
      this.n = false;
    }
  }
  
  void a()
  {
    this.m.removeMessages(3);
    this.d = false;
    this.n = true;
    GestureDetector.OnGestureListener localOnGestureListener = this.a;
    MotionEvent localMotionEvent = this.e;
    localOnGestureListener.onLongPress(localMotionEvent);
  }
  
  public void a(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    this.b = paramOnDoubleTapListener;
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    int i1 = 0;
    float f1 = 0.0F;
    GestureDetector.OnGestureListener localOnGestureListener1 = null;
    int i2 = 2;
    int i3 = 3;
    int i4 = 1;
    float f2 = Float.MIN_VALUE;
    boolean bool1 = false;
    GestureDetector.OnGestureListener localOnGestureListener2 = null;
    int i5 = paramMotionEvent.getAction();
    Object localObject1 = this.x;
    if (localObject1 == null)
    {
      localObject1 = VelocityTracker.obtain();
      this.x = ((VelocityTracker)localObject1);
    }
    localObject1 = this.x;
    ((VelocityTracker)localObject1).addMovement(paramMotionEvent);
    int i6 = i5 & 0xFF;
    int i7 = 6;
    float f3 = 8.4E-45F;
    int i9;
    float f4;
    label108:
    int i10;
    int i12;
    Object localObject2;
    float f5;
    Object localObject3;
    int i15;
    Object localObject4;
    float f6;
    if (i6 == i7)
    {
      i9 = i4;
      f4 = f2;
      if (i9 == 0) {
        break label176;
      }
      i6 = paramMotionEvent.getActionIndex();
      i10 = paramMotionEvent.getPointerCount();
      i12 = 0;
      localObject2 = null;
      f5 = 0.0F;
      i7 = 0;
      localObject3 = null;
      f3 = 0.0F;
      i15 = 0;
      localObject4 = null;
      f6 = 0.0F;
      label141:
      if (i12 >= i10) {
        break label220;
      }
      if (i6 != i12) {
        break label187;
      }
    }
    MotionEvent localMotionEvent;
    label176:
    float f7;
    for (;;)
    {
      i12 += 1;
      break label141;
      i9 = 0;
      localMotionEvent = null;
      f4 = 0.0F;
      break;
      i6 = -1;
      f7 = 0.0F / 0.0F;
      break label108;
      label187:
      float f8 = paramMotionEvent.getX(i12);
      f6 += f8;
      f8 = paramMotionEvent.getY(i12);
      f3 += f8;
    }
    label220:
    if (i9 != 0)
    {
      i6 = i10 + -1;
      f5 = i6;
      f6 /= f5;
      f7 = i6;
      f3 /= f7;
      i6 = i5 & 0xFF;
    }
    boolean bool2;
    int i11;
    float f9;
    label1045:
    int i13;
    switch (i6)
    {
    case 4: 
    default: 
    case 5: 
    case 6: 
    case 0: 
    case 2: 
      for (;;)
      {
        return bool1;
        i6 = i10;
        break;
        this.s = f6;
        this.u = f6;
        this.t = f3;
        this.v = f3;
        c();
        continue;
        this.s = f6;
        this.u = f6;
        this.t = f3;
        this.v = f3;
        localObject1 = this.x;
        f3 = 1.401E-42F;
        i15 = this.i;
        f6 = i15;
        ((VelocityTracker)localObject1).computeCurrentVelocity(1000, f6);
        i7 = paramMotionEvent.getActionIndex();
        i6 = paramMotionEvent.getPointerId(i7);
        localObject4 = this.x;
        f6 = ((VelocityTracker)localObject4).getXVelocity(i6);
        localObject2 = this.x;
        f5 = ((VelocityTracker)localObject2).getYVelocity(i6);
        i6 = 0;
        localObject1 = null;
        f7 = 0.0F;
        if (i6 < i10)
        {
          if (i6 == i7) {}
          boolean bool4;
          do
          {
            i6 += 1;
            break;
            i9 = paramMotionEvent.getPointerId(i6);
            VelocityTracker localVelocityTracker1 = this.x;
            f2 = localVelocityTracker1.getXVelocity(i9) * f6;
            VelocityTracker localVelocityTracker2 = this.x;
            f4 = localVelocityTracker2.getYVelocity(i9) * f5 + f2;
            bool4 = f4 < 0.0F;
          } while (!bool4);
          localObject1 = this.x;
          ((VelocityTracker)localObject1).clear();
          continue;
          localObject1 = this.b;
          if (localObject1 != null)
          {
            localObject1 = this.m;
            bool2 = ((Handler)localObject1).hasMessages(i3);
            if (bool2)
            {
              localObject5 = this.m;
              ((Handler)localObject5).removeMessages(i3);
            }
            Object localObject5 = this.e;
            if (localObject5 != null)
            {
              localObject5 = this.q;
              if ((localObject5 != null) && (bool2))
              {
                localObject1 = this.e;
                localObject5 = this.q;
                bool2 = a((MotionEvent)localObject1, (MotionEvent)localObject5, paramMotionEvent);
                if (bool2)
                {
                  this.r = i4;
                  localObject1 = this.b;
                  localObject5 = this.e;
                  bool2 = ((GestureDetector.OnDoubleTapListener)localObject1).onDoubleTap((MotionEvent)localObject5) | false;
                  localObject5 = this.b;
                  boolean bool5 = ((GestureDetector.OnDoubleTapListener)localObject5).onDoubleTapEvent(paramMotionEvent);
                  bool2 |= bool5;
                }
              }
            }
          }
          for (;;)
          {
            this.s = f6;
            this.u = f6;
            this.t = f3;
            this.v = f3;
            localObject3 = this.e;
            if (localObject3 != null)
            {
              localObject3 = this.e;
              ((MotionEvent)localObject3).recycle();
            }
            localObject3 = MotionEvent.obtain(paramMotionEvent);
            this.e = ((MotionEvent)localObject3);
            this.o = i4;
            this.p = i4;
            this.c = i4;
            this.n = false;
            this.d = false;
            boolean bool3 = this.w;
            if (bool3)
            {
              this.m.removeMessages(i2);
              localObject3 = this.m;
              localObject4 = this.e;
              l1 = ((MotionEvent)localObject4).getDownTime();
              l2 = k;
              l1 += l2;
              i11 = j;
              l2 = i11;
              l1 += l2;
              ((Handler)localObject3).sendEmptyMessageAtTime(i2, l1);
            }
            localObject3 = this.m;
            localObject4 = this.e;
            long l1 = ((MotionEvent)localObject4).getDownTime();
            i11 = k;
            long l2 = i11;
            l1 += l2;
            ((Handler)localObject3).sendEmptyMessageAtTime(i4, l1);
            localObject3 = this.a;
            bool3 = ((GestureDetector.OnGestureListener)localObject3).onDown(paramMotionEvent);
            bool1 = bool2 | bool3;
            break;
            localObject1 = this.m;
            i11 = l;
            l2 = i11;
            ((Handler)localObject1).sendEmptyMessageDelayed(i3, l2);
            bool2 = false;
            localObject1 = null;
            f7 = 0.0F;
          }
          bool2 = this.n;
          if (!bool2)
          {
            f7 = this.s - f6;
            f9 = this.t - f3;
            bool6 = this.r;
            if (!bool6) {
              break label1045;
            }
            localObject1 = this.b;
            bool2 = ((GestureDetector.OnDoubleTapListener)localObject1).onDoubleTapEvent(paramMotionEvent);
            bool1 = false | bool2;
          }
        }
      }
      boolean bool6 = this.o;
      if (bool6)
      {
        f5 = this.u;
        f5 = f6 - f5;
        i13 = (int)f5;
        f1 = this.v;
        f1 = f3 - f1;
        i1 = (int)f1;
        i13 *= i13;
        i1 *= i1;
        i13 += i1;
        i1 = this.f;
        if (i13 <= i1) {
          break label1716;
        }
        localOnGestureListener1 = this.a;
        localMotionEvent = this.e;
        bool2 = localOnGestureListener1.onScroll(localMotionEvent, paramMotionEvent, f7, f9);
        this.s = f6;
        this.t = f3;
        this.o = false;
        this.m.removeMessages(i3);
        this.m.removeMessages(i4);
        localObject3 = this.m;
        ((Handler)localObject3).removeMessages(i2);
      }
      break;
    }
    for (;;)
    {
      int i8 = this.f;
      if (i13 > i8) {
        this.p = false;
      }
      bool1 = bool2;
      break;
      f5 = Math.abs(f7);
      i1 = 1065353216;
      f1 = 1.0F;
      boolean bool7 = f5 < f1;
      if (bool7)
      {
        f5 = Math.abs(f9);
        i1 = 1065353216;
        f1 = 1.0F;
        bool7 = f5 < f1;
        if (bool7) {
          break;
        }
      }
      localOnGestureListener2 = this.a;
      localObject2 = this.e;
      bool1 = localOnGestureListener2.onScroll((MotionEvent)localObject2, paramMotionEvent, f7, f9);
      this.s = f6;
      this.t = f3;
      break;
      this.c = false;
      localObject3 = MotionEvent.obtain(paramMotionEvent);
      bool2 = this.r;
      if (bool2)
      {
        localObject1 = this.b;
        bool2 = ((GestureDetector.OnDoubleTapListener)localObject1).onDoubleTapEvent(paramMotionEvent) | false;
      }
      for (;;)
      {
        localObject4 = this.q;
        if (localObject4 != null)
        {
          localObject4 = this.q;
          ((MotionEvent)localObject4).recycle();
        }
        this.q = ((MotionEvent)localObject3);
        localObject3 = this.x;
        if (localObject3 != null)
        {
          this.x.recycle();
          i8 = 0;
          f3 = 0.0F;
          localObject3 = null;
          this.x = null;
        }
        this.r = false;
        this.d = false;
        this.m.removeMessages(i4);
        localObject3 = this.m;
        ((Handler)localObject3).removeMessages(i2);
        bool1 = bool2;
        break;
        bool2 = this.n;
        if (bool2)
        {
          this.m.removeMessages(i3);
          this.n = false;
          bool2 = false;
          localObject1 = null;
          f7 = 0.0F;
        }
        else
        {
          bool2 = this.o;
          if (bool2)
          {
            localObject1 = this.a;
            bool2 = ((GestureDetector.OnGestureListener)localObject1).onSingleTapUp(paramMotionEvent);
            boolean bool8 = this.d;
            if (bool8)
            {
              localObject4 = this.b;
              if (localObject4 != null)
              {
                localObject4 = this.b;
                ((GestureDetector.OnDoubleTapListener)localObject4).onSingleTapConfirmed(paramMotionEvent);
              }
            }
          }
          else
          {
            localObject1 = this.x;
            int i16 = paramMotionEvent.getPointerId(0);
            i11 = 1000;
            f5 = this.i;
            ((VelocityTracker)localObject1).computeCurrentVelocity(i11, f5);
            f9 = ((VelocityTracker)localObject1).getYVelocity(i16);
            f7 = ((VelocityTracker)localObject1).getXVelocity(i16);
            f6 = Math.abs(f9);
            int i14 = this.h;
            f5 = i14;
            boolean bool9 = f6 < f5;
            if (!bool9)
            {
              f6 = Math.abs(f7);
              i14 = this.h;
              f5 = i14;
              bool9 = f6 < f5;
              if (!bool9) {}
            }
            else
            {
              localObject4 = this.a;
              localObject2 = this.e;
              bool2 = ((GestureDetector.OnGestureListener)localObject4).onFling((MotionEvent)localObject2, paramMotionEvent, f7, f9);
              continue;
              b();
              break;
            }
            bool2 = false;
            localObject1 = null;
            f7 = 0.0F;
          }
        }
      }
      label1716:
      bool2 = false;
      localObject1 = null;
      f7 = 0.0F;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\c$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */