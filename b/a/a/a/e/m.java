package b.a.a.a.e;

import b.a.a.a.n;
import b.a.a.a.o.a;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class m
  extends InetSocketAddress
{
  private final n a;
  
  public m(n paramn, InetAddress paramInetAddress, int paramInt)
  {
    super(paramInetAddress, paramInt);
    a.a(paramn, "HTTP host");
    this.a = paramn;
  }
  
  public n a()
  {
    return this.a;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = this.a.a();
    localStringBuilder = localStringBuilder.append(str).append(":");
    int i = getPort();
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\b\a\a\a\e\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */