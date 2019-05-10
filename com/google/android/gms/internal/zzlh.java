package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.zzd;
import com.google.android.gms.common.internal.zzx;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class zzlh
  extends zzlg
{
  public static final List zzYf = Collections.singletonList("email");
  private Class zzYg;
  private Class zzYh;
  private Object zzYi;
  private Object zzYj;
  
  public zzlh(Activity paramActivity, List paramList)
  {
    super(paramActivity, localList, paramList);
  }
  
  /* Error */
  public static void zzag(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 40	com/google/android/gms/common/internal/zzx:zzz	(Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: ldc 42
    //   7: astore_1
    //   8: aload_1
    //   9: invokestatic 48	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   12: astore_1
    //   13: ldc 50
    //   15: astore_2
    //   16: iconst_2
    //   17: istore_3
    //   18: iload_3
    //   19: anewarray 44	java/lang/Class
    //   22: astore 4
    //   24: iconst_0
    //   25: istore 5
    //   27: aconst_null
    //   28: astore 6
    //   30: ldc 53
    //   32: astore 7
    //   34: aload 4
    //   36: iconst_0
    //   37: aload 7
    //   39: aastore
    //   40: iconst_1
    //   41: istore 5
    //   43: getstatic 59	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   46: astore 7
    //   48: aload 4
    //   50: iload 5
    //   52: aload 7
    //   54: aastore
    //   55: aload_1
    //   56: aload_2
    //   57: aload 4
    //   59: invokevirtual 63	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   62: astore_1
    //   63: aconst_null
    //   64: astore_2
    //   65: iconst_2
    //   66: istore_3
    //   67: iload_3
    //   68: anewarray 65	java/lang/Object
    //   71: astore 4
    //   73: iconst_0
    //   74: istore 5
    //   76: aconst_null
    //   77: astore 6
    //   79: aload_0
    //   80: invokevirtual 69	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   83: astore 7
    //   85: aload 4
    //   87: iconst_0
    //   88: aload 7
    //   90: aastore
    //   91: iconst_1
    //   92: istore 5
    //   94: ldc 70
    //   96: istore 8
    //   98: iload 8
    //   100: invokestatic 75	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   103: astore 7
    //   105: aload 4
    //   107: iload 5
    //   109: aload 7
    //   111: aastore
    //   112: aload_1
    //   113: aconst_null
    //   114: aload 4
    //   116: invokevirtual 81	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   119: pop
    //   120: ldc 83
    //   122: astore_1
    //   123: aload_1
    //   124: invokestatic 48	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   127: astore_1
    //   128: ldc 85
    //   130: astore_2
    //   131: iconst_0
    //   132: istore_3
    //   133: aconst_null
    //   134: astore 4
    //   136: iconst_0
    //   137: anewarray 44	java/lang/Class
    //   140: astore 4
    //   142: aload_1
    //   143: aload_2
    //   144: aload 4
    //   146: invokevirtual 63	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   149: astore_2
    //   150: iconst_0
    //   151: istore_3
    //   152: aconst_null
    //   153: astore 4
    //   155: iconst_0
    //   156: istore 5
    //   158: aconst_null
    //   159: astore 6
    //   161: iconst_0
    //   162: anewarray 65	java/lang/Object
    //   165: astore 6
    //   167: aload_2
    //   168: aconst_null
    //   169: aload 6
    //   171: invokevirtual 81	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   174: astore_2
    //   175: ldc 87
    //   177: astore 4
    //   179: iconst_0
    //   180: istore 5
    //   182: aconst_null
    //   183: astore 6
    //   185: iconst_0
    //   186: anewarray 44	java/lang/Class
    //   189: astore 6
    //   191: aload_1
    //   192: aload 4
    //   194: aload 6
    //   196: invokevirtual 63	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   199: astore_1
    //   200: iconst_0
    //   201: istore_3
    //   202: aconst_null
    //   203: astore 4
    //   205: iconst_0
    //   206: anewarray 65	java/lang/Object
    //   209: astore 4
    //   211: aload_1
    //   212: aload_2
    //   213: aload 4
    //   215: invokevirtual 81	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   218: pop
    //   219: return
    //   220: astore_1
    //   221: ldc 89
    //   223: astore_2
    //   224: ldc 91
    //   226: astore 4
    //   228: aload_2
    //   229: aload 4
    //   231: aload_1
    //   232: invokestatic 97	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   235: pop
    //   236: new 99	java/lang/IllegalStateException
    //   239: astore_1
    //   240: ldc 101
    //   242: astore_2
    //   243: aload_1
    //   244: aload_2
    //   245: invokespecial 104	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   248: aload_1
    //   249: athrow
    //   250: astore_1
    //   251: ldc 106
    //   253: astore_1
    //   254: aload_1
    //   255: invokestatic 48	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   258: astore_1
    //   259: ldc 108
    //   261: astore_2
    //   262: iconst_0
    //   263: istore_3
    //   264: aconst_null
    //   265: astore 4
    //   267: iconst_0
    //   268: anewarray 44	java/lang/Class
    //   271: astore 4
    //   273: aload_1
    //   274: aload_2
    //   275: aload 4
    //   277: invokevirtual 63	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   280: astore_2
    //   281: iconst_0
    //   282: istore_3
    //   283: aconst_null
    //   284: astore 4
    //   286: iconst_0
    //   287: istore 5
    //   289: aconst_null
    //   290: astore 6
    //   292: iconst_0
    //   293: anewarray 65	java/lang/Object
    //   296: astore 6
    //   298: aload_2
    //   299: aconst_null
    //   300: aload 6
    //   302: invokevirtual 81	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   305: astore_2
    //   306: aload_2
    //   307: ifnull -88 -> 219
    //   310: ldc 110
    //   312: astore 4
    //   314: iconst_0
    //   315: istore 5
    //   317: aconst_null
    //   318: astore 6
    //   320: iconst_0
    //   321: anewarray 44	java/lang/Class
    //   324: astore 6
    //   326: aload_1
    //   327: aload 4
    //   329: aload 6
    //   331: invokevirtual 63	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   334: astore_1
    //   335: iconst_0
    //   336: istore_3
    //   337: aconst_null
    //   338: astore 4
    //   340: iconst_0
    //   341: anewarray 65	java/lang/Object
    //   344: astore 4
    //   346: aload_1
    //   347: aload_2
    //   348: aload 4
    //   350: invokevirtual 81	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   353: pop
    //   354: goto -135 -> 219
    //   357: astore_1
    //   358: ldc 89
    //   360: ldc 91
    //   362: aload_1
    //   363: invokestatic 97	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   366: pop
    //   367: new 99	java/lang/IllegalStateException
    //   370: astore_1
    //   371: aload_1
    //   372: ldc 101
    //   374: invokespecial 104	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   377: aload_1
    //   378: athrow
    //   379: astore_1
    //   380: goto -22 -> 358
    //   383: astore_1
    //   384: goto -26 -> 358
    //   387: astore_1
    //   388: goto -30 -> 358
    //   391: astore_1
    //   392: goto -171 -> 221
    //   395: astore_1
    //   396: goto -175 -> 221
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	399	0	paramContext	Context
    //   7	205	1	localObject1	Object
    //   220	12	1	localIllegalAccessException1	IllegalAccessException
    //   239	10	1	localIllegalStateException1	IllegalStateException
    //   250	1	1	localClassNotFoundException1	ClassNotFoundException
    //   253	94	1	localObject2	Object
    //   357	6	1	localClassNotFoundException2	ClassNotFoundException
    //   370	8	1	localIllegalStateException2	IllegalStateException
    //   379	1	1	localIllegalAccessException2	IllegalAccessException
    //   383	1	1	localNoSuchMethodException1	NoSuchMethodException
    //   387	1	1	localInvocationTargetException1	InvocationTargetException
    //   391	1	1	localNoSuchMethodException2	NoSuchMethodException
    //   395	1	1	localInvocationTargetException2	InvocationTargetException
    //   15	333	2	localObject3	Object
    //   17	320	3	i	int
    //   22	327	4	localObject4	Object
    //   25	291	5	j	int
    //   28	302	6	localObject5	Object
    //   32	78	7	localObject6	Object
    //   96	3	8	k	int
    // Exception table:
    //   from	to	target	type
    //   18	22	220	java/lang/IllegalAccessException
    //   37	40	220	java/lang/IllegalAccessException
    //   43	46	220	java/lang/IllegalAccessException
    //   52	55	220	java/lang/IllegalAccessException
    //   57	62	220	java/lang/IllegalAccessException
    //   67	71	220	java/lang/IllegalAccessException
    //   79	83	220	java/lang/IllegalAccessException
    //   88	91	220	java/lang/IllegalAccessException
    //   98	103	220	java/lang/IllegalAccessException
    //   109	112	220	java/lang/IllegalAccessException
    //   114	120	220	java/lang/IllegalAccessException
    //   123	127	220	java/lang/IllegalAccessException
    //   136	140	220	java/lang/IllegalAccessException
    //   144	149	220	java/lang/IllegalAccessException
    //   161	165	220	java/lang/IllegalAccessException
    //   169	174	220	java/lang/IllegalAccessException
    //   185	189	220	java/lang/IllegalAccessException
    //   194	199	220	java/lang/IllegalAccessException
    //   205	209	220	java/lang/IllegalAccessException
    //   213	219	220	java/lang/IllegalAccessException
    //   8	12	250	java/lang/ClassNotFoundException
    //   18	22	250	java/lang/ClassNotFoundException
    //   37	40	250	java/lang/ClassNotFoundException
    //   43	46	250	java/lang/ClassNotFoundException
    //   52	55	250	java/lang/ClassNotFoundException
    //   57	62	250	java/lang/ClassNotFoundException
    //   67	71	250	java/lang/ClassNotFoundException
    //   79	83	250	java/lang/ClassNotFoundException
    //   88	91	250	java/lang/ClassNotFoundException
    //   98	103	250	java/lang/ClassNotFoundException
    //   109	112	250	java/lang/ClassNotFoundException
    //   114	120	250	java/lang/ClassNotFoundException
    //   123	127	250	java/lang/ClassNotFoundException
    //   136	140	250	java/lang/ClassNotFoundException
    //   144	149	250	java/lang/ClassNotFoundException
    //   161	165	250	java/lang/ClassNotFoundException
    //   169	174	250	java/lang/ClassNotFoundException
    //   185	189	250	java/lang/ClassNotFoundException
    //   194	199	250	java/lang/ClassNotFoundException
    //   205	209	250	java/lang/ClassNotFoundException
    //   213	219	250	java/lang/ClassNotFoundException
    //   231	236	250	java/lang/ClassNotFoundException
    //   236	239	250	java/lang/ClassNotFoundException
    //   244	248	250	java/lang/ClassNotFoundException
    //   248	250	250	java/lang/ClassNotFoundException
    //   254	258	357	java/lang/ClassNotFoundException
    //   267	271	357	java/lang/ClassNotFoundException
    //   275	280	357	java/lang/ClassNotFoundException
    //   292	296	357	java/lang/ClassNotFoundException
    //   300	305	357	java/lang/ClassNotFoundException
    //   320	324	357	java/lang/ClassNotFoundException
    //   329	334	357	java/lang/ClassNotFoundException
    //   340	344	357	java/lang/ClassNotFoundException
    //   348	354	357	java/lang/ClassNotFoundException
    //   254	258	379	java/lang/IllegalAccessException
    //   267	271	379	java/lang/IllegalAccessException
    //   275	280	379	java/lang/IllegalAccessException
    //   292	296	379	java/lang/IllegalAccessException
    //   300	305	379	java/lang/IllegalAccessException
    //   320	324	379	java/lang/IllegalAccessException
    //   329	334	379	java/lang/IllegalAccessException
    //   340	344	379	java/lang/IllegalAccessException
    //   348	354	379	java/lang/IllegalAccessException
    //   254	258	383	java/lang/NoSuchMethodException
    //   267	271	383	java/lang/NoSuchMethodException
    //   275	280	383	java/lang/NoSuchMethodException
    //   292	296	383	java/lang/NoSuchMethodException
    //   300	305	383	java/lang/NoSuchMethodException
    //   320	324	383	java/lang/NoSuchMethodException
    //   329	334	383	java/lang/NoSuchMethodException
    //   340	344	383	java/lang/NoSuchMethodException
    //   348	354	383	java/lang/NoSuchMethodException
    //   254	258	387	java/lang/reflect/InvocationTargetException
    //   267	271	387	java/lang/reflect/InvocationTargetException
    //   275	280	387	java/lang/reflect/InvocationTargetException
    //   292	296	387	java/lang/reflect/InvocationTargetException
    //   300	305	387	java/lang/reflect/InvocationTargetException
    //   320	324	387	java/lang/reflect/InvocationTargetException
    //   329	334	387	java/lang/reflect/InvocationTargetException
    //   340	344	387	java/lang/reflect/InvocationTargetException
    //   348	354	387	java/lang/reflect/InvocationTargetException
    //   18	22	391	java/lang/NoSuchMethodException
    //   37	40	391	java/lang/NoSuchMethodException
    //   43	46	391	java/lang/NoSuchMethodException
    //   52	55	391	java/lang/NoSuchMethodException
    //   57	62	391	java/lang/NoSuchMethodException
    //   67	71	391	java/lang/NoSuchMethodException
    //   79	83	391	java/lang/NoSuchMethodException
    //   88	91	391	java/lang/NoSuchMethodException
    //   98	103	391	java/lang/NoSuchMethodException
    //   109	112	391	java/lang/NoSuchMethodException
    //   114	120	391	java/lang/NoSuchMethodException
    //   123	127	391	java/lang/NoSuchMethodException
    //   136	140	391	java/lang/NoSuchMethodException
    //   144	149	391	java/lang/NoSuchMethodException
    //   161	165	391	java/lang/NoSuchMethodException
    //   169	174	391	java/lang/NoSuchMethodException
    //   185	189	391	java/lang/NoSuchMethodException
    //   194	199	391	java/lang/NoSuchMethodException
    //   205	209	391	java/lang/NoSuchMethodException
    //   213	219	391	java/lang/NoSuchMethodException
    //   18	22	395	java/lang/reflect/InvocationTargetException
    //   37	40	395	java/lang/reflect/InvocationTargetException
    //   43	46	395	java/lang/reflect/InvocationTargetException
    //   52	55	395	java/lang/reflect/InvocationTargetException
    //   57	62	395	java/lang/reflect/InvocationTargetException
    //   67	71	395	java/lang/reflect/InvocationTargetException
    //   79	83	395	java/lang/reflect/InvocationTargetException
    //   88	91	395	java/lang/reflect/InvocationTargetException
    //   98	103	395	java/lang/reflect/InvocationTargetException
    //   109	112	395	java/lang/reflect/InvocationTargetException
    //   114	120	395	java/lang/reflect/InvocationTargetException
    //   123	127	395	java/lang/reflect/InvocationTargetException
    //   136	140	395	java/lang/reflect/InvocationTargetException
    //   144	149	395	java/lang/reflect/InvocationTargetException
    //   161	165	395	java/lang/reflect/InvocationTargetException
    //   169	174	395	java/lang/reflect/InvocationTargetException
    //   185	189	395	java/lang/reflect/InvocationTargetException
    //   194	199	395	java/lang/reflect/InvocationTargetException
    //   205	209	395	java/lang/reflect/InvocationTargetException
    //   213	219	395	java/lang/reflect/InvocationTargetException
  }
  
  private void zznv()
  {
    int i = 2;
    int j = 1;
    Object localObject1 = this.zzYj;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (localObject1 != null)
    {
      localObject1 = Class.forName("com.facebook.login.LoginManager");
      localObject2 = new Class[i];
      localObject2[0] = Activity.class;
      localObject2[j] = Collection.class;
      localObject1 = ((Class)localObject1).getDeclaredMethod("logInWithReadPermissions", (Class[])localObject2);
      localObject3 = this.zzYj;
      localObject2 = new Object[i];
      localObject4 = this.mActivity;
      localObject2[0] = localObject4;
      localObject4 = new java/util/ArrayList;
      localObject5 = zzns();
      ((ArrayList)localObject4).<init>((Collection)localObject5);
      localObject2[j] = localObject4;
      ((Method)localObject1).invoke(localObject3, (Object[])localObject2);
    }
    for (;;)
    {
      return;
      localObject1 = Class.forName("com.facebook.Session$OpenRequest");
      localObject3 = new Class[j];
      localObject3[0] = Activity.class;
      localObject3 = ((Class)localObject1).getConstructor((Class[])localObject3);
      localObject2 = new Object[j];
      localObject4 = this.mActivity;
      localObject2[0] = localObject4;
      localObject3 = ((Constructor)localObject3).newInstance((Object[])localObject2);
      localObject4 = new Class[j];
      localObject4[0] = List.class;
      localObject2 = ((Class)localObject1).getDeclaredMethod("setPermissions", (Class[])localObject4);
      localObject4 = new Object[j];
      localObject5 = new java/util/ArrayList;
      Object localObject6 = zzns();
      ((ArrayList)localObject5).<init>((Collection)localObject6);
      localObject4[0] = localObject5;
      ((Method)localObject2).invoke(localObject3, (Object[])localObject4);
      localObject4 = new Class[j];
      localObject5 = Integer.TYPE;
      localObject4[0] = localObject5;
      localObject2 = ((Class)localObject1).getDeclaredMethod("setRequestCode", (Class[])localObject4);
      localObject4 = new Object[j];
      i = 64206;
      localObject5 = Integer.valueOf(i);
      localObject4[0] = localObject5;
      ((Method)localObject2).invoke(localObject3, (Object[])localObject4);
      localObject2 = Class.forName("com.facebook.Session");
      localObject4 = Class.forName("com.facebook.Session$StatusCallback");
      localObject6 = new Class[j];
      localObject6[0] = localObject4;
      localObject4 = ((Class)localObject1).getDeclaredMethod("setCallback", (Class[])localObject6);
      localObject5 = new Object[j];
      localObject6 = zznw();
      localObject5[0] = localObject6;
      ((Method)localObject4).invoke(localObject3, (Object[])localObject5);
      localObject4 = new Class[j];
      localObject4[0] = Context.class;
      localObject4 = ((Class)localObject2).getConstructor((Class[])localObject4);
      localObject5 = new Object[j];
      localObject6 = this.mActivity;
      localObject5[0] = localObject6;
      localObject4 = ((Constructor)localObject4).newInstance((Object[])localObject5);
      localObject6 = new Class[j];
      localObject6[0] = localObject2;
      localObject5 = ((Class)localObject2).getDeclaredMethod("setActiveSession", (Class[])localObject6);
      Object[] arrayOfObject = new Object[j];
      arrayOfObject[0] = localObject4;
      ((Method)localObject5).invoke(null, arrayOfObject);
      localObject5 = "openForRead";
      localObject6 = new Class[j];
      localObject6[0] = localObject1;
      localObject1 = ((Class)localObject2).getDeclaredMethod((String)localObject5, (Class[])localObject6);
      localObject2 = new Object[j];
      localObject2[0] = localObject3;
      ((Method)localObject1).invoke(localObject4, (Object[])localObject2);
    }
  }
  
  private Object zznw()
  {
    Class localClass = Class.forName("com.facebook.Session");
    Object localObject = Class.forName("com.facebook.Session$StatusCallback");
    ClassLoader localClassLoader = ((Class)localObject).getClassLoader();
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = localObject;
    localObject = new com/google/android/gms/internal/zzlh$1;
    ((zzlh.1)localObject).<init>(this, localClass);
    return Proxy.newProxyInstance(localClassLoader, arrayOfClass, (InvocationHandler)localObject);
  }
  
  public void zza(zzlf.zza paramzza)
  {
    RuntimeException localRuntimeException = null;
    zzlf.zza localzza = (zzlf.zza)zzx.zzz(paramzza);
    zzb(null, null, localzza);
    try
    {
      zznv();
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localClassNotFoundException);
      throw localRuntimeException;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;) {}
    }
  }
  
  public void zza(String paramString, zzlf.zza paramzza)
  {
    String str = (String)zzx.zzz(paramString);
    Object localObject = (zzlf.zza)zzx.zzz(paramzza);
    zzb(str, null, (zzlf.zza)localObject);
    try
    {
      zznv();
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localClassNotFoundException);
      throw ((Throwable)localObject);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;) {}
    }
  }
  
  public void zza(String paramString1, String paramString2, zzlf.zza paramzza)
  {
    String str = (String)zzx.zzz(paramString1);
    Object localObject = (String)zzx.zzz(paramString2);
    zzlf.zza localzza = (zzlf.zza)zzx.zzz(paramzza);
    zzb(str, (String)localObject, localzza);
    try
    {
      zznv();
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localClassNotFoundException);
      throw ((Throwable)localObject);
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;) {}
    }
  }
  
  public boolean zza(int paramInt1, int paramInt2, Intent paramIntent, zzlf.zza paramzza)
  {
    int i = 0;
    Object localObject1 = null;
    zzb(paramzza);
    int j = 64206;
    Object localObject2;
    if (paramInt1 != j)
    {
      localObject2 = this.zzYg;
      if (localObject2 == null)
      {
        j = 0;
        localObject2 = null;
      }
    }
    for (;;)
    {
      return j;
      localObject2 = this.zzYg;
      if (localObject2 != null)
      {
        localObject2 = this.zzYh;
        if (localObject2 != null)
        {
          localObject2 = this.zzYi;
          if (localObject2 == null) {}
        }
      }
      try
      {
        localObject2 = this.zzYg;
        localObject4 = "isFacebookRequestCode";
        k = 1;
        localObject5 = new Class[k];
        m = 0;
        localObject6 = null;
        localObject7 = Integer.TYPE;
        localObject5[0] = localObject7;
        localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject4, (Class[])localObject5);
        int n = 0;
        localObject4 = null;
        k = 1;
        localObject5 = new Object[k];
        m = 0;
        localObject6 = null;
        localObject7 = Integer.valueOf(paramInt1);
        localObject5[0] = localObject7;
        localObject2 = ((Method)localObject2).invoke(null, (Object[])localObject5);
        localObject2 = (Boolean)localObject2;
        bool = ((Boolean)localObject2).booleanValue();
        if (!bool)
        {
          bool = false;
          localObject2 = null;
          continue;
        }
        localObject2 = this.zzYh;
        localObject1 = "onActivityResult";
        n = 3;
        localObject4 = new Class[n];
        k = 0;
        localObject5 = null;
        localObject6 = Integer.TYPE;
        localObject4[0] = localObject6;
        k = 1;
        localObject6 = Integer.TYPE;
        localObject4[k] = localObject6;
        k = 2;
        localObject6 = Intent.class;
        localObject4[k] = localObject6;
        localObject2 = ((Class)localObject2).getDeclaredMethod((String)localObject1, (Class[])localObject4);
        localObject1 = this.zzYi;
        n = 3;
        localObject4 = new Object[n];
        k = 0;
        localObject5 = null;
        localObject6 = Integer.valueOf(paramInt1);
        localObject4[0] = localObject6;
        k = 1;
        localObject6 = Integer.valueOf(paramInt2);
        localObject4[k] = localObject6;
        k = 2;
        localObject4[k] = paramIntent;
        localObject2 = ((Method)localObject2).invoke(localObject1, (Object[])localObject4);
        localObject2 = (Boolean)localObject2;
        bool = ((Boolean)localObject2).booleanValue();
      }
      catch (IllegalAccessException localIllegalAccessException1)
      {
        Object localObject4;
        int k;
        Object localObject5;
        int m;
        Object localObject6;
        Object localObject7;
        boolean bool;
        localObject1 = new java/lang/RuntimeException;
        ((RuntimeException)localObject1).<init>(localIllegalAccessException1);
        throw ((Throwable)localObject1);
        Object localObject3 = "com.facebook.Session";
        try
        {
          localObject3 = Class.forName((String)localObject3);
          localObject4 = "getActiveSession";
          k = 0;
          localObject5 = null;
          localObject5 = new Class[0];
          localObject4 = ((Class)localObject3).getDeclaredMethod((String)localObject4, (Class[])localObject5);
          k = 0;
          localObject5 = null;
          m = 0;
          localObject6 = null;
          localObject6 = new Object[0];
          localObject4 = ((Method)localObject4).invoke(null, (Object[])localObject6);
          localObject5 = "onActivityResult";
          m = 4;
          localObject6 = new Class[m];
          int i1 = 0;
          localObject7 = null;
          Class localClass = Activity.class;
          localObject6[0] = localClass;
          i1 = 1;
          localClass = Integer.TYPE;
          localObject6[i1] = localClass;
          i1 = 2;
          localClass = Integer.TYPE;
          localObject6[i1] = localClass;
          i1 = 3;
          localClass = Intent.class;
          localObject6[i1] = localClass;
          localObject3 = ((Class)localObject3).getDeclaredMethod((String)localObject5, (Class[])localObject6);
          if (localObject4 == null)
          {
            bool = false;
            localObject3 = null;
            continue;
          }
          i = 4;
          localObject1 = new Object[i];
          k = 0;
          localObject5 = null;
          localObject6 = this.mActivity;
          localObject1[0] = localObject6;
          k = 1;
          localObject6 = Integer.valueOf(paramInt1);
          localObject1[k] = localObject6;
          k = 2;
          localObject6 = Integer.valueOf(paramInt2);
          localObject1[k] = localObject6;
          k = 3;
          localObject1[k] = paramIntent;
          localObject3 = ((Method)localObject3).invoke(localObject4, (Object[])localObject1);
          localObject3 = (Boolean)localObject3;
          bool = ((Boolean)localObject3).booleanValue();
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          localObject1 = new java/lang/RuntimeException;
          ((RuntimeException)localObject1).<init>(localClassNotFoundException);
          throw ((Throwable)localObject1);
        }
        catch (IllegalAccessException localIllegalAccessException2)
        {
          for (;;) {}
        }
        catch (NoSuchMethodException localNoSuchMethodException1)
        {
          for (;;) {}
        }
        catch (InvocationTargetException localInvocationTargetException1)
        {
          for (;;) {}
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        for (;;) {}
      }
      catch (InvocationTargetException localInvocationTargetException2)
      {
        for (;;) {}
      }
    }
  }
  
  public zzd zzmU()
  {
    return zzd.zzXi;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlh.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */