package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.RectF;
import android.view.MotionEvent;

public class x
  implements j
{
  private g a;
  private float b;
  private float c;
  private float d;
  private float e;
  private RectF f;
  private m g;
  private ae h;
  private i i;
  
  public x(i parami, a parama)
  {
    Object localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.f = ((RectF)localObject);
    this.i = parami;
    localObject = this.i.getZoomRectangle();
    this.f = ((RectF)localObject);
    boolean bool1 = parama instanceof z;
    if (bool1)
    {
      localObject = parama;
      localObject = ((z)parama).a();
    }
    for (this.a = ((g)localObject);; this.a = ((g)localObject))
    {
      localObject = this.a;
      bool1 = ((g)localObject).G();
      if (bool1)
      {
        localObject = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/m;
        ((m)localObject).<init>((a)parama);
        this.g = ((m)localObject);
      }
      localObject = this.a;
      bool1 = ((g)localObject).C();
      if (bool1)
      {
        localObject = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/ae;
        boolean bool2 = true;
        float f1 = 1.0F;
        ((ae)localObject).<init>((a)parama, bool2, f1);
        this.h = ((ae)localObject);
      }
      return;
      localObject = parama;
      localObject = ((t)parama).a();
    }
  }
  
  private void a(float paramFloat, int paramInt)
  {
    float f1 = Math.max(paramFloat, 0.9F);
    int j = 1066192077;
    float f2 = 1.1F;
    f1 = Math.min(f1, f2);
    ae localae1 = this.h;
    if (localae1 != null)
    {
      double d1 = f1;
      double d2 = 0.9D;
      boolean bool = d1 < d2;
      if (bool)
      {
        d1 = f1;
        d2 = 1.1D;
        bool = d1 < d2;
        if (bool)
        {
          localae1 = this.h;
          localae1.a(f1);
          ae localae2 = this.h;
          localae2.b(paramInt);
        }
      }
    }
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    int j = paramMotionEvent.getAction();
    Object localObject1 = this.a;
    int i2;
    float f1;
    float f2;
    Object localObject2;
    float f3;
    int i5;
    float f4;
    float f5;
    float f6;
    float f7;
    float f8;
    float f9;
    float f10;
    double d1;
    double d2;
    int i6;
    label405:
    int n;
    if (localObject1 != null)
    {
      i2 = 2;
      f1 = 2.8E-45F;
      if (j == i2)
      {
        f2 = this.b;
        i2 = 0;
        f1 = 0.0F;
        localObject1 = null;
        boolean bool1 = f2 < 0.0F;
        if (bool1)
        {
          f2 = this.c;
          i2 = 0;
          f1 = 0.0F;
          localObject1 = null;
          bool1 = f2 < 0.0F;
          if (bool1) {
            break label998;
          }
        }
        f1 = paramMotionEvent.getX(0);
        f2 = 0.0F;
        localObject2 = null;
        f3 = paramMotionEvent.getY(0);
        int k = paramMotionEvent.getPointerCount();
        i5 = 1;
        f4 = Float.MIN_VALUE;
        if (k > i5)
        {
          f2 = this.d;
          i5 = 0;
          f4 = 0.0F;
          int m = f2 < 0.0F;
          if (m < 0)
          {
            f2 = this.e;
            i5 = 0;
            f4 = 0.0F;
            m = f2 < 0.0F;
            if (m < 0) {}
          }
          else
          {
            localObject2 = this.a;
            m = ((g)localObject2).C();
            if (m != 0)
            {
              f4 = paramMotionEvent.getX(1);
              m = 1;
              f5 = paramMotionEvent.getY(m);
              f2 = Math.abs(f1 - f4);
              f6 = Math.abs(f3 - f5);
              f7 = this.b;
              f8 = this.d;
              f7 = Math.abs(f7 - f8);
              f8 = this.c;
              f9 = this.e;
              f8 = Math.abs(f8 - f9);
              f9 = this.c;
              f9 = Math.abs(f3 - f9);
              f10 = this.b;
              f10 = Math.abs(f1 - f10);
              f9 /= f10;
              f10 = this.e;
              f10 = Math.abs(f5 - f10);
              float f11 = this.d;
              f11 = Math.abs(f4 - f11);
              f10 /= f11;
              d1 = f9;
              d2 = 0.25D;
              boolean bool3 = d1 < d2;
              if (!bool3)
              {
                d1 = f10;
                d2 = 0.25D;
                bool3 = d1 < d2;
                if (!bool3)
                {
                  f2 /= f7;
                  i6 = 1;
                  f6 = Float.MIN_VALUE;
                  a(f2, i6);
                  this.d = f4;
                  this.e = f5;
                  this.b = f1;
                  this.c = f3;
                  localObject2 = this.i;
                  ((i)localObject2).d();
                  n = 1;
                  f2 = Float.MIN_VALUE;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return n;
      d1 = f9;
      d2 = 3.73D;
      boolean bool4 = d1 < d2;
      if (!bool4)
      {
        double d3 = f10;
        d1 = 3.73D;
        bool4 = d3 < d1;
        if (!bool4)
        {
          f2 = f6 / f8;
          i6 = 2;
          f6 = 2.8E-45F;
          a(f2, i6);
          break;
        }
      }
      f9 = this.b;
      f9 = Math.abs(f1 - f9);
      f10 = this.c;
      f10 = Math.abs(f3 - f10);
      bool4 = f9 < f10;
      if (!bool4) {}
      for (f2 /= f7;; f2 = f6 / f8)
      {
        i6 = 0;
        f6 = 0.0F;
        a(f2, 0);
        break;
      }
      localObject2 = this.a;
      n = ((g)localObject2).G();
      if (n == 0) {
        break label405;
      }
      localObject2 = this.g;
      f4 = this.b;
      f5 = this.c;
      ((m)localObject2).a(f4, f5, f1, f3);
      this.d = 0.0F;
      n = 0;
      f2 = 0.0F;
      localObject2 = null;
      this.e = 0.0F;
      break label405;
      if (n == 0)
      {
        f2 = paramMotionEvent.getX(0);
        this.b = f2;
        n = 0;
        f2 = paramMotionEvent.getY(0);
        this.c = f2;
        localObject2 = this.a;
        if (localObject2 != null)
        {
          localObject2 = this.a;
          n = ((g)localObject2).C();
          if (n != 0)
          {
            localObject2 = this.f;
            f1 = this.b;
            f3 = this.c;
            n = ((RectF)localObject2).contains(f1, f3);
            if (n != 0)
            {
              f2 = this.b;
              localObject1 = this.f;
              f1 = ((RectF)localObject1).left;
              RectF localRectF = this.f;
              f3 = localRectF.width();
              i5 = 1077936128;
              f4 = 3.0F;
              f3 /= f4;
              f1 += f3;
              n = f2 < f1;
              if (n < 0)
              {
                localObject2 = this.i;
                ((i)localObject2).a();
              }
              for (;;)
              {
                n = 1;
                f2 = Float.MIN_VALUE;
                break;
                f2 = this.b;
                localObject1 = this.f;
                f1 = ((RectF)localObject1).left;
                localRectF = this.f;
                f3 = localRectF.width() * 2.0F;
                i5 = 1077936128;
                f4 = 3.0F;
                f3 /= f4;
                f1 += f3;
                n = f2 < f1;
                if (n < 0)
                {
                  localObject2 = this.i;
                  ((i)localObject2).b();
                }
                else
                {
                  localObject2 = this.i;
                  ((i)localObject2).c();
                }
              }
            }
          }
        }
      }
      else
      {
        i2 = 1;
        f1 = Float.MIN_VALUE;
        if (n != i2)
        {
          int i3 = 6;
          f1 = 8.4E-45F;
          if (n != i3) {}
        }
        else
        {
          this.b = 0.0F;
          this.c = 0.0F;
          this.d = 0.0F;
          localObject1 = null;
          this.e = 0.0F;
          int i4 = 6;
          f1 = 8.4E-45F;
          if (n == i4)
          {
            this.b = -1.0F;
            int i1 = -1082130432;
            f2 = -1.0F;
            this.c = f2;
          }
        }
      }
      label998:
      localObject2 = this.a;
      boolean bool2 = ((g)localObject2).H();
      if (!bool2)
      {
        bool2 = true;
        f2 = Float.MIN_VALUE;
      }
      else
      {
        bool2 = false;
        f2 = 0.0F;
        localObject2 = null;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\x.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */