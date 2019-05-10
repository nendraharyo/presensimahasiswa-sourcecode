package b.a.a.a.i.a;

import java.io.UnsupportedEncodingException;

class j$f
  extends j.d
{
  protected byte[] a;
  protected String b;
  protected byte[] c;
  protected int d;
  
  j$f(String paramString)
  {
    super(paramString, 2);
    Object localObject1 = new byte[8];
    this.a = ((byte[])localObject1);
    localObject1 = this.a;
    int j = 24;
    a((byte[])localObject1, j);
    int k = a(i);
    this.d = k;
    k = this.d & 0x1;
    Object localObject2;
    String str;
    if (k == 0)
    {
      localObject1 = new b/a/a/a/i/a/i;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("NTLM type 2 message indicates no support for Unicode. Flags are: ");
      str = Integer.toString(this.d);
      localObject2 = str;
      ((i)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.b = null;
    k = a();
    if (k >= i)
    {
      k = 12;
      localObject1 = b(k);
      j = localObject1.length;
      if (j == 0) {}
    }
    try
    {
      localObject2 = new java/lang/String;
      str = "UnicodeLittleUnmarked";
      ((String)localObject2).<init>((byte[])localObject1, str);
      this.b = ((String)localObject2);
      this.c = null;
      k = a();
      j = 48;
      if (k >= j)
      {
        k = 40;
        localObject1 = b(k);
        j = localObject1.length;
        if (j != 0) {
          this.c = ((byte[])localObject1);
        }
      }
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      localObject2 = new b/a/a/a/i/a/i;
      str = localUnsupportedEncodingException.getMessage();
      ((i)localObject2).<init>(str, localUnsupportedEncodingException);
      throw ((Throwable)localObject2);
    }
  }
  
  byte[] c()
  {
    return this.a;
  }
  
  String d()
  {
    return this.b;
  }
  
  byte[] e()
  {
    return this.c;
  }
  
  int f()
  {
    return this.d;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\i\a\j$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */