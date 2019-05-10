package io.fabric.sdk.android.services.common;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.lang.reflect.Method;

final class FirebaseAppImpl
  implements FirebaseApp
{
  private static final String FIREBASE_APP_CLASS = "com.google.firebase.FirebaseApp";
  private static final String GET_INSTANCE_METHOD = "getInstance";
  private static final String IS_DATA_COLLECTION_ENABLED_METHOD = "isDataCollectionDefaultEnabled";
  private final Object firebaseAppInstance;
  private final Method isDataCollectionDefaultEnabledMethod;
  
  private FirebaseAppImpl(Class paramClass, Object paramObject)
  {
    this.firebaseAppInstance = paramObject;
    Class[] arrayOfClass = new Class[0];
    Method localMethod = paramClass.getDeclaredMethod("isDataCollectionDefaultEnabled", arrayOfClass);
    this.isDataCollectionDefaultEnabledMethod = localMethod;
  }
  
  public static FirebaseApp getInstance(Context paramContext)
  {
    try
    {
      localObject1 = paramContext.getClassLoader();
      localObject2 = "com.google.firebase.FirebaseApp";
      localObject2 = ((ClassLoader)localObject1).loadClass((String)localObject2);
      localObject1 = "getInstance";
      localObject3 = null;
      localObject3 = new Class[0];
      localObject1 = ((Class)localObject2).getDeclaredMethod((String)localObject1, (Class[])localObject3);
      localObject3 = null;
      localObject3 = new Object[0];
      localObject3 = ((Method)localObject1).invoke(localObject2, (Object[])localObject3);
      localObject1 = new io/fabric/sdk/android/services/common/FirebaseAppImpl;
      ((FirebaseAppImpl)localObject1).<init>((Class)localObject2, localObject3);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Object localObject1;
        Logger localLogger = Fabric.getLogger();
        localObject2 = "Fabric";
        localObject3 = "Could not find class: com.google.firebase.FirebaseApp";
        localLogger.d((String)localObject2, (String)localObject3);
        localLogger = null;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        localObject2 = Fabric.getLogger();
        localObject3 = "Fabric";
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        String str2 = "Could not find method: ";
        localObject4 = ((StringBuilder)localObject4).append(str2);
        String str1 = localNoSuchMethodException.getMessage();
        str1 = str1;
        ((Logger)localObject2).d((String)localObject3, str1);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2 = Fabric.getLogger();
        Object localObject3 = "Fabric";
        Object localObject4 = "Unexpected error loading FirebaseApp instance.";
        ((Logger)localObject2).d((String)localObject3, (String)localObject4, localException);
      }
    }
    return (FirebaseApp)localObject1;
  }
  
  public boolean isDataCollectionDefaultEnabled()
  {
    try
    {
      Object localObject1 = this.isDataCollectionDefaultEnabledMethod;
      localObject3 = this.firebaseAppInstance;
      localObject4 = null;
      localObject4 = new Object[0];
      localObject1 = ((Method)localObject1).invoke(localObject3, (Object[])localObject4);
      localObject1 = (Boolean)localObject1;
      bool = ((Boolean)localObject1).booleanValue();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject3 = Fabric.getLogger();
        Object localObject4 = "Fabric";
        String str = "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.";
        ((Logger)localObject3).d((String)localObject4, str, localException);
        boolean bool = false;
        Object localObject2 = null;
      }
    }
    return bool;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\common\FirebaseAppImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */