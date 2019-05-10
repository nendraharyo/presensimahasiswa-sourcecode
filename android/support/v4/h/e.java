package android.support.v4.h;

import android.util.Log;
import java.io.Writer;

public class e
  extends Writer
{
  private final String a;
  private StringBuilder b;
  
  public e(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(128);
    this.b = localStringBuilder;
    this.a = paramString;
  }
  
  private void a()
  {
    Object localObject = this.b;
    int i = ((StringBuilder)localObject).length();
    if (i > 0)
    {
      localObject = this.a;
      String str = this.b.toString();
      Log.d((String)localObject, str);
      localObject = this.b;
      str = null;
      StringBuilder localStringBuilder = this.b;
      int j = localStringBuilder.length();
      ((StringBuilder)localObject).delete(0, j);
    }
  }
  
  public void close()
  {
    a();
  }
  
  public void flush()
  {
    a();
  }
  
  public void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i = 0;
    if (i < paramInt2)
    {
      int j = paramInt1 + i;
      j = paramArrayOfChar[j];
      int k = 10;
      if (j == k) {
        a();
      }
      for (;;)
      {
        i += 1;
        break;
        StringBuilder localStringBuilder = this.b;
        localStringBuilder.append(j);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\h\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */