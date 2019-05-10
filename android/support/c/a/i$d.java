package android.support.c.a;

import android.graphics.Path;
import android.support.v4.b.b;
import android.support.v4.b.b.b;

class i$d
{
  protected b.b[] m = null;
  String n;
  int o;
  
  public i$d() {}
  
  public i$d(d paramd)
  {
    Object localObject = paramd.n;
    this.n = ((String)localObject);
    int i = paramd.o;
    this.o = i;
    localObject = b.a(paramd.m);
    this.m = ((b.b[])localObject);
  }
  
  public void a(Path paramPath)
  {
    paramPath.reset();
    b.b[] arrayOfb = this.m;
    if (arrayOfb != null)
    {
      arrayOfb = this.m;
      b.b.a(arrayOfb, paramPath);
    }
  }
  
  public boolean a()
  {
    return false;
  }
  
  public b.b[] getPathData()
  {
    return this.m;
  }
  
  public String getPathName()
  {
    return this.n;
  }
  
  public void setPathData(b.b[] paramArrayOfb)
  {
    b.b[] arrayOfb = this.m;
    boolean bool = b.a(arrayOfb, paramArrayOfb);
    if (!bool)
    {
      arrayOfb = b.a(paramArrayOfb);
      this.m = arrayOfb;
    }
    for (;;)
    {
      return;
      arrayOfb = this.m;
      b.b(arrayOfb, paramArrayOfb);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\i$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */