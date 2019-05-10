package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class y
{
  private static final Object a;
  private static Field b;
  private static boolean c;
  private static final Object d;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    a = localObject;
    localObject = new java/lang/Object;
    localObject.<init>();
    d = localObject;
  }
  
  public static Bundle a(Notification.Builder paramBuilder, w.a parama)
  {
    int i = parama.a();
    Object localObject1 = parama.b();
    Object localObject2 = parama.c();
    paramBuilder.addAction(i, (CharSequence)localObject1, (PendingIntent)localObject2);
    Bundle localBundle = new android/os/Bundle;
    localObject1 = parama.d();
    localBundle.<init>((Bundle)localObject1);
    localObject1 = parama.f();
    if (localObject1 != null)
    {
      localObject1 = "android.support.remoteInputs";
      localObject2 = a(parama.f());
      localBundle.putParcelableArray((String)localObject1, (Parcelable[])localObject2);
    }
    localObject1 = parama.g();
    if (localObject1 != null)
    {
      localObject1 = "android.support.dataRemoteInputs";
      localObject2 = a(parama.g());
      localBundle.putParcelableArray((String)localObject1, (Parcelable[])localObject2);
    }
    boolean bool = parama.e();
    localBundle.putBoolean("android.support.allowGeneratedReplies", bool);
    return localBundle;
  }
  
  public static Bundle a(Notification paramNotification)
  {
    for (;;)
    {
      boolean bool1;
      Object localObject2;
      synchronized (a)
      {
        bool1 = c;
        if (bool1)
        {
          bool1 = false;
          localObject2 = null;
          return (Bundle)localObject2;
        }
      }
      try
      {
        localObject2 = b;
        if (localObject2 == null)
        {
          localObject2 = Notification.class;
          localObject5 = "extras";
          localObject2 = ((Class)localObject2).getDeclaredField((String)localObject5);
          localObject5 = Bundle.class;
          localObject6 = ((Field)localObject2).getType();
          boolean bool2 = ((Class)localObject5).isAssignableFrom((Class)localObject6);
          if (!bool2)
          {
            localObject2 = "NotificationCompat";
            localObject5 = "Notification.extras field is not of type Bundle";
            Log.e((String)localObject2, (String)localObject5);
            bool1 = true;
            c = bool1;
            bool1 = false;
            localObject2 = null;
            continue;
          }
          bool2 = true;
          ((Field)localObject2).setAccessible(bool2);
          b = (Field)localObject2;
        }
        localObject2 = b;
        localObject2 = ((Field)localObject2).get(paramNotification);
        localObject2 = (Bundle)localObject2;
        if (localObject2 == null)
        {
          localObject2 = new android/os/Bundle;
          ((Bundle)localObject2).<init>();
          localObject5 = b;
          ((Field)localObject5).set(paramNotification, localObject2);
        }
        continue;
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localObject5 = "NotificationCompat";
        localObject6 = "Unable to access notification extras";
        Log.e((String)localObject5, (String)localObject6, localIllegalAccessException);
        bool1 = true;
        c = bool1;
        bool1 = false;
        Object localObject4 = null;
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        for (;;)
        {
          Object localObject5 = "NotificationCompat";
          Object localObject6 = "Unable to access notification extras";
          Log.e((String)localObject5, (String)localObject6, localNoSuchFieldException);
        }
      }
    }
  }
  
  private static Bundle a(aa paramaa)
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    Object localObject1 = paramaa.a();
    localBundle.putString("resultKey", (String)localObject1);
    localObject1 = paramaa.b();
    localBundle.putCharSequence("label", (CharSequence)localObject1);
    localObject1 = paramaa.c();
    localBundle.putCharSequenceArray("choices", (CharSequence[])localObject1);
    boolean bool1 = paramaa.e();
    localBundle.putBoolean("allowFreeFormInput", bool1);
    localObject1 = paramaa.f();
    localBundle.putBundle("extras", (Bundle)localObject1);
    Object localObject2 = paramaa.d();
    if (localObject2 != null)
    {
      bool1 = ((Set)localObject2).isEmpty();
      if (!bool1)
      {
        localObject1 = new java/util/ArrayList;
        int i = ((Set)localObject2).size();
        ((ArrayList)localObject1).<init>(i);
        Iterator localIterator = ((Set)localObject2).iterator();
        for (;;)
        {
          boolean bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          localObject2 = (String)localIterator.next();
          ((ArrayList)localObject1).add(localObject2);
        }
        localObject2 = "allowedDataTypes";
        localBundle.putStringArrayList((String)localObject2, (ArrayList)localObject1);
      }
    }
    return localBundle;
  }
  
  public static SparseArray a(List paramList)
  {
    SparseArray localSparseArray = null;
    int i = 0;
    Bundle localBundle = null;
    int j = paramList.size();
    for (int k = 0; k < j; k = i)
    {
      localBundle = (Bundle)paramList.get(k);
      if (localBundle != null)
      {
        if (localSparseArray == null)
        {
          localSparseArray = new android/util/SparseArray;
          localSparseArray.<init>();
        }
        localSparseArray.put(k, localBundle);
      }
      i = k + 1;
    }
    return localSparseArray;
  }
  
  private static Bundle[] a(aa[] paramArrayOfaa)
  {
    int i;
    if (paramArrayOfaa == null) {
      i = 0;
    }
    Bundle[] arrayOfBundle;
    for (Object localObject = null;; localObject = arrayOfBundle)
    {
      return (Bundle[])localObject;
      arrayOfBundle = new Bundle[paramArrayOfaa.length];
      i = 0;
      localObject = null;
      for (;;)
      {
        int j = paramArrayOfaa.length;
        if (i >= j) {
          break;
        }
        Bundle localBundle = a(paramArrayOfaa[i]);
        arrayOfBundle[i] = localBundle;
        i += 1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\y.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */