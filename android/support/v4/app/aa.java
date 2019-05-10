package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;
import android.os.Bundle;
import java.util.Set;

public final class aa
{
  private final String a;
  private final CharSequence b;
  private final CharSequence[] c;
  private final boolean d;
  private final Bundle e;
  private final Set f;
  
  static RemoteInput a(aa paramaa)
  {
    RemoteInput.Builder localBuilder = new android/app/RemoteInput$Builder;
    Object localObject = paramaa.a();
    localBuilder.<init>((String)localObject);
    localObject = paramaa.b();
    localBuilder = localBuilder.setLabel((CharSequence)localObject);
    localObject = paramaa.c();
    localBuilder = localBuilder.setChoices((CharSequence[])localObject);
    boolean bool = paramaa.e();
    localBuilder = localBuilder.setAllowFreeFormInput(bool);
    localObject = paramaa.f();
    return localBuilder.addExtras((Bundle)localObject).build();
  }
  
  static RemoteInput[] a(aa[] paramArrayOfaa)
  {
    int i;
    if (paramArrayOfaa == null) {
      i = 0;
    }
    RemoteInput[] arrayOfRemoteInput;
    for (Object localObject = null;; localObject = arrayOfRemoteInput)
    {
      return (RemoteInput[])localObject;
      arrayOfRemoteInput = new RemoteInput[paramArrayOfaa.length];
      i = 0;
      localObject = null;
      for (;;)
      {
        int j = paramArrayOfaa.length;
        if (i >= j) {
          break;
        }
        RemoteInput localRemoteInput = a(paramArrayOfaa[i]);
        arrayOfRemoteInput[i] = localRemoteInput;
        i += 1;
      }
    }
  }
  
  public String a()
  {
    return this.a;
  }
  
  public CharSequence b()
  {
    return this.b;
  }
  
  public CharSequence[] c()
  {
    return this.c;
  }
  
  public Set d()
  {
    return this.f;
  }
  
  public boolean e()
  {
    return this.d;
  }
  
  public Bundle f()
  {
    return this.e;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\aa.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */