package id.ac.ugm.presensi.presensimahasiswa.utils.Activities;

import android.util.Log;

class b$3
  implements Runnable
{
  b$3(b paramb, int paramInt, float paramFloat) {}
  
  public void run()
  {
    try
    {
      Object localObject = this.c;
      localObject = b.a((b)localObject);
      if (localObject != null)
      {
        localObject = this.c;
        int i = this.a;
        float f = this.b;
        b.a((b)localObject, i, f);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str1 = "PDFVIEWER";
        String str2 = localException.getMessage();
        Log.e(str1, str2, localException);
      }
    }
    b.a(this.c, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\Activities\b$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */