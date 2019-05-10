package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

public class i
  extends View
{
  private static final int j;
  private a a;
  private g b;
  private Rect c;
  private Handler d;
  private RectF e;
  private Bitmap f;
  private Bitmap g;
  private Bitmap h;
  private int i;
  private ae k;
  private ae l;
  private h m;
  private Paint n;
  private j o;
  private float p;
  private float q;
  private boolean r;
  
  static
  {
    int i1 = 150;
    j = Color.argb(175, i1, i1, i1);
  }
  
  public i(Context paramContext, a parama)
  {
    super(paramContext);
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.c = ((Rect)localObject1);
    localObject1 = new android/graphics/RectF;
    ((RectF)localObject1).<init>();
    this.e = ((RectF)localObject1);
    this.i = 50;
    localObject1 = new android/graphics/Paint;
    ((Paint)localObject1).<init>();
    this.n = ((Paint)localObject1);
    this.a = parama;
    localObject1 = new android/os/Handler;
    ((Handler)localObject1).<init>();
    this.d = ((Handler)localObject1);
    localObject1 = this.a;
    boolean bool1 = localObject1 instanceof z;
    if (bool1) {
      localObject1 = ((z)this.a).a();
    }
    for (this.b = ((g)localObject1);; this.b = ((g)localObject1))
    {
      localObject1 = this.b;
      bool1 = ((g)localObject1).D();
      if (bool1)
      {
        localObject1 = BitmapFactory.decodeStream(i.class.getResourceAsStream("image/zoom_in.png"));
        this.f = ((Bitmap)localObject1);
        localObject1 = BitmapFactory.decodeStream(i.class.getResourceAsStream("image/zoom_out.png"));
        this.g = ((Bitmap)localObject1);
        localObject2 = "image/zoom-1.png";
        localObject1 = BitmapFactory.decodeStream(i.class.getResourceAsStream((String)localObject2));
        this.h = ((Bitmap)localObject1);
      }
      localObject1 = this.b;
      bool1 = localObject1 instanceof ab;
      if (bool1)
      {
        localObject1 = (ab)this.b;
        int i2 = ((ab)localObject1).Z();
        if (i2 == 0)
        {
          localObject1 = (ab)this.b;
          localObject2 = this.n;
          int i4 = ((Paint)localObject2).getColor();
          ((ab)localObject1).o(i4);
        }
      }
      localObject1 = this.b;
      boolean bool2 = ((g)localObject1).C();
      if (bool2)
      {
        localObject1 = this.b;
        bool2 = ((g)localObject1).D();
        if (bool2) {}
      }
      else
      {
        localObject1 = this.b;
        bool2 = ((g)localObject1).E();
        if (!bool2) {
          break label417;
        }
      }
      localObject1 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/ae;
      Object localObject2 = this.a;
      float f1 = this.b.F();
      ((ae)localObject1).<init>((a)localObject2, true, f1);
      this.k = ((ae)localObject1);
      localObject1 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/ae;
      localObject2 = this.a;
      g localg = this.b;
      f1 = localg.F();
      ((ae)localObject1).<init>((a)localObject2, false, f1);
      this.l = ((ae)localObject1);
      localObject1 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/h;
      localObject2 = this.a;
      ((h)localObject1).<init>((a)localObject2);
      this.m = ((h)localObject1);
      try
      {
        label417:
        localObject1 = Build.VERSION.SDK;
        localObject1 = Integer.valueOf((String)localObject1);
        i3 = ((Integer)localObject1).intValue();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          int i3 = i1;
          continue;
          x localx = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/x;
          a locala = this.a;
          localx.<init>(this, locala);
          this.o = localx;
        }
      }
      if (i3 >= i1) {
        break;
      }
      localObject1 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/y;
      locala = this.a;
      ((y)localObject1).<init>(this, locala);
      this.o = ((j)localObject1);
      return;
      localObject1 = ((t)this.a).a();
    }
  }
  
  public void a()
  {
    ae localae = this.k;
    if (localae != null)
    {
      localae = this.k;
      localae.b(0);
      d();
    }
  }
  
  public void b()
  {
    ae localae = this.l;
    if (localae != null)
    {
      localae = this.l;
      localae.b(0);
      d();
    }
  }
  
  public void c()
  {
    Object localObject = this.m;
    if (localObject != null)
    {
      this.m.a();
      localObject = this.k;
      ((ae)localObject).a();
      d();
    }
  }
  
  public void d()
  {
    Handler localHandler = this.d;
    i.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/i$1;
    local1.<init>(this);
    localHandler.post(local1);
  }
  
  public a getChart()
  {
    return this.a;
  }
  
  public v getCurrentSeriesAndPoint()
  {
    a locala = this.a;
    r localr = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/r;
    float f1 = this.p;
    float f2 = this.q;
    localr.<init>(f1, f2);
    return locala.a(localr);
  }
  
  protected RectF getZoomRectangle()
  {
    return this.e;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    int i1 = 0;
    float f1 = 0.0F;
    super.onDraw(paramCanvas);
    Object localObject1 = this.c;
    paramCanvas.getClipBounds((Rect)localObject1);
    int i2 = this.c.top;
    localObject1 = this.c;
    int i3 = ((Rect)localObject1).left;
    int i5 = this.c.width();
    int i6 = this.c.height();
    Object localObject2 = this.b;
    boolean bool2 = ((g)localObject2).L();
    float f2;
    if (bool2)
    {
      i5 = getMeasuredWidth();
      i6 = getMeasuredHeight();
      i2 = 0;
      f2 = 0.0F;
    }
    for (;;)
    {
      localObject1 = this.a;
      Paint localPaint1 = this.n;
      localObject2 = paramCanvas;
      ((a)localObject1).a(paramCanvas, i1, i2, i5, i6, localPaint1);
      localObject1 = this.b;
      int i4;
      if (localObject1 != null)
      {
        localObject1 = this.b;
        boolean bool1 = ((g)localObject1).C();
        if (bool1)
        {
          localObject1 = this.b;
          bool1 = ((g)localObject1).D();
          if (bool1)
          {
            localObject1 = this.n;
            int i7 = j;
            ((Paint)localObject1).setColor(i7);
            i4 = this.i;
            i7 = Math.min(i5, i6) / 7;
            i4 = Math.max(i4, i7);
            this.i = i4;
            localObject1 = this.e;
            i7 = i1 + i5;
            int i8 = this.i * 3;
            float f3 = i7 - i8;
            float f4 = i2 + i6;
            float f5 = this.i * 0.775F;
            f4 -= f5;
            int i9 = i1 + i5;
            f5 = i9;
            int i10 = i2 + i6;
            float f6 = i10;
            ((RectF)localObject1).set(f3, f4, f5, f6);
            localObject1 = this.e;
            f3 = this.i / 3;
            f4 = this.i / 3;
            Paint localPaint2 = this.n;
            paramCanvas.drawRoundRect((RectF)localObject1, f3, f4, localPaint2);
            i4 = i2 + i6;
            float f7 = i4;
            i7 = this.i;
            f3 = i7 * 0.625F;
            f7 -= f3;
            localObject2 = this.f;
            f2 = i1 + i5;
            float f8 = this.i * 2.75F;
            f2 -= f8;
            paramCanvas.drawBitmap((Bitmap)localObject2, f2, f7, null);
            localObject2 = this.g;
            f2 = i1 + i5;
            i6 = this.i;
            f8 = i6;
            i8 = 1071644672;
            f4 = 1.75F;
            f8 *= f4;
            f2 -= f8;
            paramCanvas.drawBitmap((Bitmap)localObject2, f2, f7, null);
            localObject2 = this.h;
            i1 += i5;
            f1 = i1;
            i2 = this.i;
            f2 = i2;
            i5 = 1061158912;
            float f9 = 0.75F;
            f2 *= f9;
            f1 -= f2;
            paramCanvas.drawBitmap((Bitmap)localObject2, f1, f7, null);
          }
        }
      }
      this.r = true;
      return;
      i1 = i4;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    float f1;
    if (i1 == 0)
    {
      f1 = paramMotionEvent.getX();
      this.p = f1;
      f1 = paramMotionEvent.getY();
      this.q = f1;
    }
    Object localObject = this.b;
    boolean bool;
    if (localObject != null)
    {
      bool = this.r;
      if (bool)
      {
        localObject = this.b;
        bool = ((g)localObject).G();
        if (!bool)
        {
          localObject = this.b;
          bool = ((g)localObject).C();
          if (!bool) {}
        }
        else
        {
          localObject = this.o;
          bool = ((j)localObject).a(paramMotionEvent);
          if (bool)
          {
            bool = true;
            f1 = Float.MIN_VALUE;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = super.onTouchEvent(paramMotionEvent);
    }
  }
  
  public void setZoomRate(float paramFloat)
  {
    ae localae = this.k;
    if (localae != null)
    {
      localae = this.l;
      if (localae != null)
      {
        this.k.a(paramFloat);
        localae = this.l;
        localae.a(paramFloat);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */