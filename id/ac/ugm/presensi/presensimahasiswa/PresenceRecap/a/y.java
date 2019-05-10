package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.RectF;
import android.view.MotionEvent;

public class y
  implements j
{
  private g a;
  private float b;
  private float c;
  private RectF d;
  private m e;
  private i f;
  
  public y(i parami, a parama)
  {
    Object localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.d = ((RectF)localObject);
    this.f = parami;
    localObject = this.f.getZoomRectangle();
    this.d = ((RectF)localObject);
    boolean bool = parama instanceof z;
    if (bool)
    {
      localObject = parama;
      localObject = ((z)parama).a();
    }
    for (this.a = ((g)localObject);; this.a = ((g)localObject))
    {
      localObject = this.a;
      bool = ((g)localObject).G();
      if (bool)
      {
        localObject = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/m;
        ((m)localObject).<init>((a)parama);
        this.e = ((m)localObject);
      }
      return;
      localObject = parama;
      localObject = ((t)parama).a();
    }
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    float f1 = 3.0F;
    boolean bool1 = true;
    boolean bool2 = false;
    float f2 = 0.0F;
    Object localObject1 = null;
    int i = paramMotionEvent.getAction();
    Object localObject2 = this.a;
    float f3;
    float f4;
    boolean bool3;
    float f5;
    Object localObject3;
    if (localObject2 != null)
    {
      int j = 2;
      f3 = 2.8E-45F;
      if (i == j)
      {
        f4 = this.b;
        bool3 = f4 < 0.0F;
        if (bool3)
        {
          f4 = this.c;
          bool3 = f4 < 0.0F;
          if (bool3) {
            break label430;
          }
        }
        f4 = paramMotionEvent.getX();
        f3 = paramMotionEvent.getY();
        localObject1 = this.a;
        bool2 = ((g)localObject1).G();
        if (bool2)
        {
          localObject1 = this.e;
          f5 = this.b;
          f1 = this.c;
          ((m)localObject1).a(f5, f1, f4, f3);
        }
        this.b = f4;
        this.c = f3;
        localObject3 = this.f;
        ((i)localObject3).d();
      }
    }
    for (;;)
    {
      return bool1;
      if (!bool3)
      {
        f4 = paramMotionEvent.getX();
        this.b = f4;
        f4 = paramMotionEvent.getY();
        this.c = f4;
        localObject3 = this.a;
        if (localObject3 != null)
        {
          localObject3 = this.a;
          bool3 = ((g)localObject3).C();
          if (bool3)
          {
            localObject3 = this.d;
            f3 = this.b;
            f2 = this.c;
            bool3 = ((RectF)localObject3).contains(f3, f2);
            if (bool3)
            {
              f4 = this.b;
              localObject2 = this.d;
              f3 = ((RectF)localObject2).left;
              localObject1 = this.d;
              f2 = ((RectF)localObject1).width() / f1;
              f3 += f2;
              bool3 = f4 < f3;
              if (bool3)
              {
                localObject3 = this.f;
                ((i)localObject3).a();
                continue;
              }
              f4 = this.b;
              localObject2 = this.d;
              f3 = ((RectF)localObject2).left;
              localObject1 = this.d;
              f2 = ((RectF)localObject1).width();
              f5 = 2.0F;
              f2 = f2 * f5 / f1;
              f3 += f2;
              bool3 = f4 < f3;
              if (bool3)
              {
                localObject3 = this.f;
                ((i)localObject3).b();
                continue;
              }
              localObject3 = this.f;
              ((i)localObject3).c();
            }
          }
        }
      }
      else if (bool3 == bool1)
      {
        this.b = 0.0F;
        this.c = 0.0F;
      }
      label430:
      localObject3 = this.a;
      bool3 = ((g)localObject3).H();
      if (bool3) {
        bool1 = false;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */