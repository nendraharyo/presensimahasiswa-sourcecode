package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import java.io.Serializable;

public class r
  implements Serializable
{
  private float a;
  private float b;
  
  public r() {}
  
  public r(float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
  }
  
  public float a()
  {
    return this.a;
  }
  
  public float b()
  {
    return this.b;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\r.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */