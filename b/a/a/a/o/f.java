package b.a.a.a.o;

import b.a.a.a.k;
import java.io.InputStream;

public final class f
{
  public static void a(k paramk)
  {
    if (paramk == null) {}
    for (;;)
    {
      return;
      boolean bool = paramk.isStreaming();
      if (bool)
      {
        InputStream localInputStream = paramk.getContent();
        if (localInputStream != null) {
          localInputStream.close();
        }
      }
    }
  }
  
  public static byte[] b(k paramk)
  {
    int i = 4096;
    boolean bool1 = false;
    c localc = null;
    a.a(paramk, "Entity");
    InputStream localInputStream = paramk.getContent();
    byte[] arrayOfByte1;
    if (localInputStream == null)
    {
      i = 0;
      arrayOfByte1 = null;
      return arrayOfByte1;
    }
    for (;;)
    {
      int j;
      try
      {
        long l1 = paramk.getContentLength();
        long l2 = 2147483647L;
        boolean bool2 = l1 < l2;
        if (!bool2) {
          bool1 = true;
        }
        String str = "HTTP entity too large to be buffered in memory";
        a.a(bool1, str);
        l1 = paramk.getContentLength();
        j = (int)l1;
        if (j >= 0) {
          break label165;
        }
        localc = new b/a/a/a/o/c;
        localc.<init>(i);
        i = 4096;
        arrayOfByte1 = new byte[i];
        int k = localInputStream.read(arrayOfByte1);
        int m = -1;
        if (k != m)
        {
          m = 0;
          localc.a(arrayOfByte1, 0, k);
          continue;
        }
        byte[] arrayOfByte2 = localc.b();
      }
      finally
      {
        localInputStream.close();
      }
      localInputStream.close();
      break;
      label165:
      i = j;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\o\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */