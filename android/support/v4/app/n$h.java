package android.support.v4.app;

import java.util.ArrayList;

class n$h
  implements n.g
{
  final String a;
  final int b;
  final int c;
  
  n$h(n paramn, String paramString, int paramInt1, int paramInt2)
  {
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
  }
  
  public boolean a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    Object localObject = this.d.p;
    boolean bool;
    if (localObject != null)
    {
      int i = this.b;
      if (i < 0)
      {
        localObject = this.a;
        if (localObject == null)
        {
          localObject = this.d.p.peekChildFragmentManager();
          if (localObject != null)
          {
            bool = ((m)localObject).c();
            if (bool)
            {
              bool = false;
              localObject = null;
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      localObject = this.d;
      String str = this.a;
      int j = this.b;
      int k = this.c;
      bool = ((n)localObject).a(paramArrayList1, paramArrayList2, str, j, k);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */