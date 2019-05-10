package com.loopj.android.http;

import b.a.a.a.f.b;
import b.a.a.a.i.d.c;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class SerializableCookie
  implements Serializable
{
  private static final long serialVersionUID = 6374381828722046732L;
  private transient c clientCookie;
  private final transient b cookie;
  
  public SerializableCookie(b paramb)
  {
    this.cookie = paramb;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    Object localObject1 = (String)paramObjectInputStream.readObject();
    Object localObject2 = (String)paramObjectInputStream.readObject();
    c localc = new b/a/a/a/i/d/c;
    localc.<init>((String)localObject1, (String)localObject2);
    this.clientCookie = localc;
    localObject2 = this.clientCookie;
    localObject1 = (String)paramObjectInputStream.readObject();
    ((c)localObject2).c((String)localObject1);
    localObject2 = this.clientCookie;
    localObject1 = (String)paramObjectInputStream.readObject();
    ((c)localObject2).d((String)localObject1);
    localObject2 = this.clientCookie;
    localObject1 = (Date)paramObjectInputStream.readObject();
    ((c)localObject2).b((Date)localObject1);
    localObject2 = this.clientCookie;
    localObject1 = (String)paramObjectInputStream.readObject();
    ((c)localObject2).e((String)localObject1);
    localObject1 = this.clientCookie;
    int i = paramObjectInputStream.readInt();
    ((c)localObject1).a(i);
    localObject1 = this.clientCookie;
    boolean bool = paramObjectInputStream.readBoolean();
    ((c)localObject1).a(bool);
  }
  
  private void writeObject(ObjectOutputStream paramObjectOutputStream)
  {
    Object localObject = this.cookie.a();
    paramObjectOutputStream.writeObject(localObject);
    localObject = this.cookie.b();
    paramObjectOutputStream.writeObject(localObject);
    localObject = this.cookie.c();
    paramObjectOutputStream.writeObject(localObject);
    localObject = this.cookie.f();
    paramObjectOutputStream.writeObject(localObject);
    localObject = this.cookie.d();
    paramObjectOutputStream.writeObject(localObject);
    localObject = this.cookie.g();
    paramObjectOutputStream.writeObject(localObject);
    int i = this.cookie.j();
    paramObjectOutputStream.writeInt(i);
    boolean bool = this.cookie.i();
    paramObjectOutputStream.writeBoolean(bool);
  }
  
  public b getCookie()
  {
    Object localObject = this.cookie;
    c localc = this.clientCookie;
    if (localc != null) {
      localObject = this.clientCookie;
    }
    return (b)localObject;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\SerializableCookie.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */