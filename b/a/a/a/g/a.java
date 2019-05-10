package b.a.a.a.g;

import b.a.a.a.e;
import b.a.a.a.k;
import b.a.a.a.k.b;

public abstract class a
  implements k
{
  protected e a;
  protected e b;
  protected boolean c;
  
  public void a(e parame)
  {
    this.a = parame;
  }
  
  public void a(String paramString)
  {
    b localb = null;
    if (paramString != null)
    {
      localb = new b/a/a/a/k/b;
      String str = "Content-Type";
      localb.<init>(str, paramString);
    }
    a(localb);
  }
  
  public void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public void b(e parame)
  {
    this.b = parame;
  }
  
  public void consumeContent() {}
  
  public e getContentEncoding()
  {
    return this.b;
  }
  
  public e getContentType()
  {
    return this.a;
  }
  
  public boolean isChunked()
  {
    return this.c;
  }
  
  public String toString()
  {
    char c1 = ',';
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    char c2 = '[';
    localStringBuilder.append(c2);
    Object localObject = this.a;
    if (localObject != null)
    {
      localStringBuilder.append("Content-Type: ");
      localObject = this.a.d();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(c1);
    }
    localObject = this.b;
    if (localObject != null)
    {
      localStringBuilder.append("Content-Encoding: ");
      localObject = this.b.d();
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(c1);
    }
    long l1 = getContentLength();
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      localObject = "Content-Length: ";
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(l1);
      localStringBuilder.append(c1);
    }
    localStringBuilder.append("Chunked: ");
    bool = this.c;
    localStringBuilder.append(bool);
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\g\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */