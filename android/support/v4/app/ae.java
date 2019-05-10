package android.support.v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.a.b;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class ae
  implements Iterable
{
  private static final ae.c a;
  private final ArrayList b;
  private final Context c;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/app/ae$b;
      ((ae.b)localObject).<init>();
    }
    for (a = (ae.c)localObject;; a = (ae.c)localObject)
    {
      return;
      localObject = new android/support/v4/app/ae$c;
      ((ae.c)localObject).<init>();
    }
  }
  
  private ae(Context paramContext)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.b = localArrayList;
    this.c = paramContext;
  }
  
  public static ae a(Context paramContext)
  {
    ae localae = new android/support/v4/app/ae;
    localae.<init>(paramContext);
    return localae;
  }
  
  public ae a(Activity paramActivity)
  {
    Object localObject1 = null;
    boolean bool = paramActivity instanceof ae.a;
    if (bool)
    {
      localObject1 = paramActivity;
      localObject1 = ((ae.a)paramActivity).getSupportParentActivityIntent();
    }
    if (localObject1 == null) {
      localObject1 = u.a((Activity)paramActivity);
    }
    for (Object localObject2 = localObject1;; localObject2 = localObject1)
    {
      if (localObject2 != null)
      {
        localObject1 = ((Intent)localObject2).getComponent();
        if (localObject1 == null)
        {
          localObject1 = this.c.getPackageManager();
          localObject1 = ((Intent)localObject2).resolveActivity((PackageManager)localObject1);
        }
        a((ComponentName)localObject1);
        a((Intent)localObject2);
      }
      return this;
    }
  }
  
  public ae a(ComponentName paramComponentName)
  {
    Object localObject1 = this.b;
    int i = ((ArrayList)localObject1).size();
    try
    {
      localObject1 = this.c;
      Object localObject2;
      for (localObject1 = u.a((Context)localObject1, paramComponentName); localObject1 != null; localObject1 = u.a((Context)localObject2, (ComponentName)localObject1))
      {
        localObject2 = this.b;
        ((ArrayList)localObject2).add(i, localObject1);
        localObject2 = this.c;
        localObject1 = ((Intent)localObject1).getComponent();
      }
      IllegalArgumentException localIllegalArgumentException;
      return this;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
      localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>(localNameNotFoundException);
      throw localIllegalArgumentException;
    }
  }
  
  public ae a(Intent paramIntent)
  {
    this.b.add(paramIntent);
    return this;
  }
  
  public void a()
  {
    a(null);
  }
  
  public void a(Bundle paramBundle)
  {
    Object localObject1 = this.b;
    boolean bool1 = ((ArrayList)localObject1).isEmpty();
    if (bool1)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("No intents added to TaskStackBuilder; cannot startActivities");
      throw ((Throwable)localObject1);
    }
    localObject1 = this.b;
    Object localObject2 = new Intent[this.b.size()];
    localObject1 = (Intent[])((ArrayList)localObject1).toArray((Object[])localObject2);
    localObject2 = new android/content/Intent;
    Intent localIntent = localObject1[0];
    ((Intent)localObject2).<init>(localIntent);
    int j = 268484608;
    localObject2 = ((Intent)localObject2).addFlags(j);
    localObject1[0] = localObject2;
    localObject2 = this.c;
    boolean bool2 = b.a((Context)localObject2, (Intent[])localObject1, paramBundle);
    if (!bool2)
    {
      localObject2 = new android/content/Intent;
      j = localObject1.length + -1;
      localObject1 = localObject1[j];
      ((Intent)localObject2).<init>((Intent)localObject1);
      int i = 268435456;
      ((Intent)localObject2).addFlags(i);
      localObject1 = this.c;
      ((Context)localObject1).startActivity((Intent)localObject2);
    }
  }
  
  public Iterator iterator()
  {
    return this.b.iterator();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\ae.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */