package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import java.io.Serializable;

public class c
  implements Serializable
{
  public static final c a;
  public static final c b;
  public static final c c;
  private Paint.Cap d;
  private Paint.Join e;
  private float f;
  private float[] g;
  private float h;
  
  static
  {
    int i = 2;
    float f1 = 1.0F;
    c localc = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/c;
    Paint.Cap localCap = Paint.Cap.BUTT;
    Paint.Join localJoin = Paint.Join.MITER;
    localc.<init>(localCap, localJoin, 4.0F, null, 0.0F);
    a = localc;
    localc = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/c;
    localCap = Paint.Cap.ROUND;
    localJoin = Paint.Join.BEVEL;
    float[] arrayOfFloat = new float[i];
    float[] tmp53_51 = arrayOfFloat;
    tmp53_51[0] = 10.0F;
    tmp53_51[1] = 10.0F;
    localc.<init>(localCap, localJoin, 10.0F, arrayOfFloat, f1);
    b = localc;
    localc = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/c;
    localCap = Paint.Cap.ROUND;
    localJoin = Paint.Join.BEVEL;
    arrayOfFloat = new float[i];
    float[] tmp98_96 = arrayOfFloat;
    tmp98_96[0] = 2.0F;
    tmp98_96[1] = 10.0F;
    localc.<init>(localCap, localJoin, 5.0F, arrayOfFloat, f1);
    c = localc;
  }
  
  public c(Paint.Cap paramCap, Paint.Join paramJoin, float paramFloat1, float[] paramArrayOfFloat, float paramFloat2)
  {
    this.d = paramCap;
    this.e = paramJoin;
    this.f = paramFloat1;
    this.g = paramArrayOfFloat;
  }
  
  public Paint.Cap a()
  {
    return this.d;
  }
  
  public Paint.Join b()
  {
    return this.e;
  }
  
  public float c()
  {
    return this.f;
  }
  
  public float[] d()
  {
    return this.g;
  }
  
  public float e()
  {
    return this.h;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */