package android.support.v4.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.support.v4.a.a.a.b;
import android.support.v4.a.a.a.c;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class f
  extends d
{
  private static final Class a;
  private static final Constructor b;
  private static final Method c;
  private static final Method d;
  private static final Method e;
  private static final Method f;
  private static final Method g;
  
  static
  {
    Object localObject1 = null;
    Object localObject2 = "android.graphics.FontFamily";
    try
    {
      Class localClass1 = Class.forName((String)localObject2);
      i = 0;
      localObject2 = null;
      localObject2 = new Class[0];
      localObject4 = localClass1.getConstructor((Class[])localObject2);
      localObject2 = "addFontFromAssetManager";
      j = 8;
      localObject5 = new Class[j];
      k = 0;
      localObject6 = null;
      localObject7 = AssetManager.class;
      localObject5[0] = localObject7;
      k = 1;
      localObject7 = String.class;
      localObject5[k] = localObject7;
      k = 2;
      localObject7 = Integer.TYPE;
      localObject5[k] = localObject7;
      k = 3;
      localObject7 = Boolean.TYPE;
      localObject5[k] = localObject7;
      k = 4;
      localObject7 = Integer.TYPE;
      localObject5[k] = localObject7;
      k = 5;
      localObject7 = Integer.TYPE;
      localObject5[k] = localObject7;
      k = 6;
      localObject7 = Integer.TYPE;
      localObject5[k] = localObject7;
      k = 7;
      localObject7 = FontVariationAxis[].class;
      localObject5[k] = localObject7;
      localObject8 = localClass1.getMethod((String)localObject2, (Class[])localObject5);
      localObject2 = "addFontFromBuffer";
      j = 5;
      localObject5 = new Class[j];
      k = 0;
      localObject6 = null;
      localObject7 = ByteBuffer.class;
      localObject5[0] = localObject7;
      k = 1;
      localObject7 = Integer.TYPE;
      localObject5[k] = localObject7;
      k = 2;
      localObject7 = FontVariationAxis[].class;
      localObject5[k] = localObject7;
      k = 3;
      localObject7 = Integer.TYPE;
      localObject5[k] = localObject7;
      k = 4;
      localObject7 = Integer.TYPE;
      localObject5[k] = localObject7;
      localObject7 = localClass1.getMethod((String)localObject2, (Class[])localObject5);
      localObject2 = "freeze";
      j = 0;
      localObject5 = null;
      localObject5 = new Class[0];
      localObject6 = localClass1.getMethod((String)localObject2, (Class[])localObject5);
      localObject2 = "abortCreation";
      j = 0;
      localObject5 = null;
      localObject5 = new Class[0];
      localObject5 = localClass1.getMethod((String)localObject2, (Class[])localObject5);
      i = 1;
      localObject2 = Array.newInstance(localClass1, i);
      Class localClass2 = Typeface.class;
      String str = "createFromFamiliesWithDefault";
      int m = 3;
      Class[] arrayOfClass = new Class[m];
      Class localClass3 = null;
      localObject2 = localObject2.getClass();
      arrayOfClass[0] = localObject2;
      i = 1;
      localClass3 = Integer.TYPE;
      arrayOfClass[i] = localClass3;
      i = 2;
      localClass3 = Integer.TYPE;
      arrayOfClass[i] = localClass3;
      localObject2 = localClass2.getDeclaredMethod(str, arrayOfClass);
      boolean bool = true;
      ((Method)localObject2).setAccessible(bool);
      localObject1 = localObject5;
      localObject5 = localObject6;
      localObject6 = localObject7;
      localObject7 = localObject8;
      localObject8 = localObject4;
      localObject4 = localClass1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;)
      {
        Object localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        localObject6 = ((StringBuilder)localObject6).append("Unable to collect necessary methods for class ");
        Object localObject7 = localClassNotFoundException.getClass().getName();
        localObject6 = (String)localObject7;
        Log.e("TypefaceCompatApi26Impl", (String)localObject6, localClassNotFoundException);
        int i = 0;
        Object localObject3 = null;
        int j = 0;
        Object localObject5 = null;
        int k = 0;
        localObject6 = null;
        localObject7 = null;
        Object localObject8 = null;
        Object localObject4 = null;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;) {}
    }
    b = (Constructor)localObject8;
    a = (Class)localObject4;
    c = (Method)localObject7;
    d = (Method)localObject6;
    e = (Method)localObject5;
    f = (Method)localObject1;
    g = (Method)localObject2;
  }
  
  private static Typeface a(Object paramObject)
  {
    try
    {
      Object localObject1 = a;
      int i = 1;
      localObject1 = Array.newInstance((Class)localObject1, i);
      i = 0;
      localObject2 = null;
      Array.set(localObject1, 0, paramObject);
      localObject2 = g;
      int j = 3;
      Object[] arrayOfObject = new Object[j];
      int k = 0;
      Integer localInteger = null;
      arrayOfObject[0] = localObject1;
      int m = 1;
      k = -1;
      localInteger = Integer.valueOf(k);
      arrayOfObject[m] = localInteger;
      m = 2;
      k = -1;
      localInteger = Integer.valueOf(k);
      arrayOfObject[m] = localInteger;
      localObject1 = ((Method)localObject2).invoke(null, arrayOfObject);
      return (Typeface)localObject1;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  private static boolean a()
  {
    Object localObject = c;
    if (localObject == null)
    {
      localObject = "TypefaceCompatApi26Impl";
      String str = "Unable to collect necessary private methods. Fallback to legacy implementation.";
      Log.w((String)localObject, str);
    }
    localObject = c;
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  private static boolean a(Context paramContext, Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      Object localObject1 = c;
      int i = 8;
      localObject2 = new Object[i];
      int j = 0;
      Object localObject3 = paramContext.getAssets();
      localObject2[0] = localObject3;
      j = 1;
      localObject2[j] = paramString;
      j = 2;
      localObject3 = null;
      localObject3 = Integer.valueOf(0);
      localObject2[j] = localObject3;
      j = 3;
      localObject3 = null;
      localObject3 = Boolean.valueOf(false);
      localObject2[j] = localObject3;
      j = 4;
      localObject3 = Integer.valueOf(paramInt1);
      localObject2[j] = localObject3;
      j = 5;
      localObject3 = Integer.valueOf(paramInt2);
      localObject2[j] = localObject3;
      j = 6;
      localObject3 = Integer.valueOf(paramInt3);
      localObject2[j] = localObject3;
      j = 7;
      localObject3 = null;
      localObject2[j] = null;
      localObject1 = ((Method)localObject1).invoke(paramObject, (Object[])localObject2);
      localObject1 = (Boolean)localObject1;
      return ((Boolean)localObject1).booleanValue();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  private static boolean a(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      Object localObject1 = d;
      int i = 5;
      localObject2 = new Object[i];
      int j = 0;
      localObject2[0] = paramByteBuffer;
      j = 1;
      Integer localInteger = Integer.valueOf(paramInt1);
      localObject2[j] = localInteger;
      j = 2;
      localInteger = null;
      localObject2[j] = null;
      j = 3;
      localInteger = Integer.valueOf(paramInt2);
      localObject2[j] = localInteger;
      j = 4;
      localInteger = Integer.valueOf(paramInt3);
      localObject2[j] = localInteger;
      localObject1 = ((Method)localObject1).invoke(paramObject, (Object[])localObject2);
      localObject1 = (Boolean)localObject1;
      return ((Boolean)localObject1).booleanValue();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  private static Object b()
  {
    try
    {
      Constructor localConstructor = b;
      localObject = null;
      localObject = new Object[0];
      return localConstructor.newInstance((Object[])localObject);
    }
    catch (InstantiationException localInstantiationException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localInstantiationException);
      throw ((Throwable)localObject);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  private static boolean b(Object paramObject)
  {
    try
    {
      Object localObject1 = e;
      localObject2 = null;
      localObject2 = new Object[0];
      localObject1 = ((Method)localObject1).invoke(paramObject, (Object[])localObject2);
      localObject1 = (Boolean)localObject1;
      return ((Boolean)localObject1).booleanValue();
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject2 = new java/lang/RuntimeException;
      ((RuntimeException)localObject2).<init>(localIllegalAccessException);
      throw ((Throwable)localObject2);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  private static void c(Object paramObject)
  {
    try
    {
      Method localMethod = f;
      localObject = null;
      localObject = new Object[0];
      localMethod.invoke(paramObject, (Object[])localObject);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      Object localObject = new java/lang/RuntimeException;
      ((RuntimeException)localObject).<init>(localIllegalAccessException);
      throw ((Throwable)localObject);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
  }
  
  public Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    int i = -1;
    boolean bool = a();
    Object localObject1;
    if (!bool) {
      localObject1 = super.a(paramContext, paramResources, paramInt1, paramString, paramInt2);
    }
    for (;;)
    {
      return (Typeface)localObject1;
      Object localObject2 = b();
      localObject1 = paramContext;
      bool = a(paramContext, localObject2, paramString, 0, i, i);
      if (!bool)
      {
        c(localObject2);
        bool = false;
        localObject1 = null;
      }
      else
      {
        bool = b(localObject2);
        if (!bool)
        {
          bool = false;
          localObject1 = null;
        }
        else
        {
          localObject1 = a(localObject2);
        }
      }
    }
  }
  
  /* Error */
  public Typeface a(Context paramContext, android.os.CancellationSignal paramCancellationSignal, android.support.v4.f.b.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aload_3
    //   1: arraylength
    //   2: istore 5
    //   4: iconst_1
    //   5: istore 6
    //   7: ldc 32
    //   9: fstore 7
    //   11: iload 5
    //   13: iload 6
    //   15: if_icmpge +15 -> 30
    //   18: iconst_0
    //   19: istore 5
    //   21: fconst_0
    //   22: fstore 8
    //   24: aconst_null
    //   25: astore 9
    //   27: aload 9
    //   29: areturn
    //   30: invokestatic 181	android/support/v4/b/f:a	()Z
    //   33: istore 5
    //   35: iload 5
    //   37: ifne +261 -> 298
    //   40: aload_0
    //   41: aload_3
    //   42: iload 4
    //   44: invokevirtual 202	android/support/v4/b/f:a	([Landroid/support/v4/f/b$b;I)Landroid/support/v4/f/b$b;
    //   47: astore 9
    //   49: aload_1
    //   50: invokevirtual 206	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   53: astore 10
    //   55: aload 9
    //   57: invokevirtual 211	android/support/v4/f/b$b:a	()Landroid/net/Uri;
    //   60: astore 11
    //   62: ldc -43
    //   64: astore 12
    //   66: aload 10
    //   68: aload 11
    //   70: aload 12
    //   72: aload_2
    //   73: invokevirtual 219	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   76: astore 11
    //   78: iconst_0
    //   79: istore 6
    //   81: fconst_0
    //   82: fstore 7
    //   84: aconst_null
    //   85: astore 10
    //   87: aload 11
    //   89: ifnonnull +62 -> 151
    //   92: iconst_0
    //   93: istore 5
    //   95: fconst_0
    //   96: fstore 8
    //   98: aconst_null
    //   99: astore 9
    //   101: aload 11
    //   103: ifnull -76 -> 27
    //   106: iconst_0
    //   107: ifeq +36 -> 143
    //   110: aload 11
    //   112: invokevirtual 224	android/os/ParcelFileDescriptor:close	()V
    //   115: goto -88 -> 27
    //   118: astore 11
    //   120: aconst_null
    //   121: aload 11
    //   123: invokevirtual 229	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   126: goto -99 -> 27
    //   129: astore 9
    //   131: iconst_0
    //   132: istore 5
    //   134: fconst_0
    //   135: fstore 8
    //   137: aconst_null
    //   138: astore 9
    //   140: goto -113 -> 27
    //   143: aload 11
    //   145: invokevirtual 224	android/os/ParcelFileDescriptor:close	()V
    //   148: goto -121 -> 27
    //   151: new 231	android/graphics/Typeface$Builder
    //   154: astore 12
    //   156: aload 11
    //   158: invokevirtual 235	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   161: astore 13
    //   163: aload 12
    //   165: aload 13
    //   167: invokespecial 238	android/graphics/Typeface$Builder:<init>	(Ljava/io/FileDescriptor;)V
    //   170: aload 9
    //   172: invokevirtual 241	android/support/v4/f/b$b:c	()I
    //   175: istore 14
    //   177: aload 12
    //   179: iload 14
    //   181: invokevirtual 245	android/graphics/Typeface$Builder:setWeight	(I)Landroid/graphics/Typeface$Builder;
    //   184: astore 12
    //   186: aload 9
    //   188: invokevirtual 247	android/support/v4/f/b$b:d	()Z
    //   191: istore 5
    //   193: aload 12
    //   195: iload 5
    //   197: invokevirtual 251	android/graphics/Typeface$Builder:setItalic	(Z)Landroid/graphics/Typeface$Builder;
    //   200: astore 9
    //   202: aload 9
    //   204: invokevirtual 255	android/graphics/Typeface$Builder:build	()Landroid/graphics/Typeface;
    //   207: astore 9
    //   209: aload 11
    //   211: ifnull -184 -> 27
    //   214: iconst_0
    //   215: ifeq +22 -> 237
    //   218: aload 11
    //   220: invokevirtual 224	android/os/ParcelFileDescriptor:close	()V
    //   223: goto -196 -> 27
    //   226: astore 11
    //   228: aconst_null
    //   229: aload 11
    //   231: invokevirtual 229	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   234: goto -207 -> 27
    //   237: aload 11
    //   239: invokevirtual 224	android/os/ParcelFileDescriptor:close	()V
    //   242: goto -215 -> 27
    //   245: astore 9
    //   247: aload 9
    //   249: athrow
    //   250: astore 15
    //   252: aload 9
    //   254: astore 10
    //   256: aload 15
    //   258: astore 9
    //   260: aload 11
    //   262: ifnull +13 -> 275
    //   265: aload 10
    //   267: ifnull +23 -> 290
    //   270: aload 11
    //   272: invokevirtual 224	android/os/ParcelFileDescriptor:close	()V
    //   275: aload 9
    //   277: athrow
    //   278: astore 11
    //   280: aload 10
    //   282: aload 11
    //   284: invokevirtual 229	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   287: goto -12 -> 275
    //   290: aload 11
    //   292: invokevirtual 224	android/os/ParcelFileDescriptor:close	()V
    //   295: goto -20 -> 275
    //   298: aload_1
    //   299: aload_3
    //   300: aload_2
    //   301: invokestatic 260	android/support/v4/f/b:a	(Landroid/content/Context;[Landroid/support/v4/f/b$b;Landroid/os/CancellationSignal;)Ljava/util/Map;
    //   304: astore 12
    //   306: invokestatic 187	android/support/v4/b/f:b	()Ljava/lang/Object;
    //   309: astore 13
    //   311: iconst_0
    //   312: istore 6
    //   314: fconst_0
    //   315: fstore 7
    //   317: aconst_null
    //   318: astore 10
    //   320: aload_3
    //   321: arraylength
    //   322: istore 16
    //   324: iconst_0
    //   325: istore 5
    //   327: fconst_0
    //   328: fstore 8
    //   330: aconst_null
    //   331: astore 9
    //   333: iconst_0
    //   334: istore 17
    //   336: aconst_null
    //   337: astore 11
    //   339: iload 17
    //   341: iload 16
    //   343: if_icmpge +152 -> 495
    //   346: aload_3
    //   347: iload 17
    //   349: aaload
    //   350: astore 18
    //   352: aload 18
    //   354: invokevirtual 211	android/support/v4/f/b$b:a	()Landroid/net/Uri;
    //   357: astore 9
    //   359: aload 12
    //   361: aload 9
    //   363: invokeinterface 266 2 0
    //   368: checkcast 58	java/nio/ByteBuffer
    //   371: astore 9
    //   373: aload 9
    //   375: ifnonnull +28 -> 403
    //   378: iload 6
    //   380: istore 5
    //   382: fload 7
    //   384: fstore 8
    //   386: iload 17
    //   388: iconst_1
    //   389: iadd
    //   390: istore 17
    //   392: iload 5
    //   394: istore 6
    //   396: fload 8
    //   398: fstore 7
    //   400: goto -61 -> 339
    //   403: aload 18
    //   405: invokevirtual 268	android/support/v4/f/b$b:b	()I
    //   408: istore 19
    //   410: aload 18
    //   412: invokevirtual 241	android/support/v4/f/b$b:c	()I
    //   415: istore 20
    //   417: aload 18
    //   419: invokevirtual 247	android/support/v4/f/b$b:d	()Z
    //   422: istore 6
    //   424: iload 6
    //   426: ifeq +47 -> 473
    //   429: iconst_1
    //   430: istore 6
    //   432: ldc 32
    //   434: fstore 7
    //   436: aload 13
    //   438: aload 9
    //   440: iload 19
    //   442: iload 20
    //   444: iload 6
    //   446: invokestatic 271	android/support/v4/b/f:a	(Ljava/lang/Object;Ljava/nio/ByteBuffer;III)Z
    //   449: istore 5
    //   451: iload 5
    //   453: ifne +32 -> 485
    //   456: aload 13
    //   458: invokestatic 193	android/support/v4/b/f:c	(Ljava/lang/Object;)V
    //   461: iconst_0
    //   462: istore 5
    //   464: fconst_0
    //   465: fstore 8
    //   467: aconst_null
    //   468: astore 9
    //   470: goto -443 -> 27
    //   473: iconst_0
    //   474: istore 6
    //   476: fconst_0
    //   477: fstore 7
    //   479: aconst_null
    //   480: astore 10
    //   482: goto -46 -> 436
    //   485: iconst_1
    //   486: istore 5
    //   488: ldc 32
    //   490: fstore 8
    //   492: goto -106 -> 386
    //   495: iload 6
    //   497: ifne +20 -> 517
    //   500: aload 13
    //   502: invokestatic 193	android/support/v4/b/f:c	(Ljava/lang/Object;)V
    //   505: iconst_0
    //   506: istore 5
    //   508: fconst_0
    //   509: fstore 8
    //   511: aconst_null
    //   512: astore 9
    //   514: goto -487 -> 27
    //   517: aload 13
    //   519: invokestatic 196	android/support/v4/b/f:b	(Ljava/lang/Object;)Z
    //   522: istore 5
    //   524: iload 5
    //   526: ifne +15 -> 541
    //   529: iconst_0
    //   530: istore 5
    //   532: fconst_0
    //   533: fstore 8
    //   535: aconst_null
    //   536: astore 9
    //   538: goto -511 -> 27
    //   541: aload 13
    //   543: invokestatic 199	android/support/v4/b/f:a	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   546: iload 4
    //   548: invokestatic 275	android/graphics/Typeface:create	(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;
    //   551: astore 9
    //   553: goto -526 -> 27
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	556	0	this	f
    //   0	556	1	paramContext	Context
    //   0	556	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	556	3	paramArrayOfb	android.support.v4.f.b.b[]
    //   0	556	4	paramInt	int
    //   2	18	5	i	int
    //   33	498	5	j	int
    //   5	390	6	k	int
    //   422	23	6	m	int
    //   474	22	6	n	int
    //   9	469	7	f1	float
    //   22	512	8	f2	float
    //   25	75	9	localObject1	Object
    //   129	1	9	localIOException	java.io.IOException
    //   138	70	9	localObject2	Object
    //   245	8	9	localObject3	Object
    //   258	294	9	localObject4	Object
    //   53	428	10	localObject5	Object
    //   60	51	11	localObject6	Object
    //   118	101	11	localThrowable1	Throwable
    //   226	45	11	localThrowable2	Throwable
    //   278	13	11	localThrowable3	Throwable
    //   337	1	11	localObject7	Object
    //   64	296	12	localObject8	Object
    //   161	381	13	localObject9	Object
    //   175	5	14	i1	int
    //   250	7	15	localObject10	Object
    //   322	22	16	i2	int
    //   334	57	17	i3	int
    //   350	68	18	localb	android.support.v4.f.b.b
    //   408	33	19	i4	int
    //   415	28	20	i5	int
    // Exception table:
    //   from	to	target	type
    //   110	115	118	finally
    //   55	60	129	java/io/IOException
    //   72	76	129	java/io/IOException
    //   121	126	129	java/io/IOException
    //   143	148	129	java/io/IOException
    //   229	234	129	java/io/IOException
    //   237	242	129	java/io/IOException
    //   275	278	129	java/io/IOException
    //   282	287	129	java/io/IOException
    //   290	295	129	java/io/IOException
    //   218	223	226	finally
    //   151	154	245	finally
    //   156	161	245	finally
    //   165	170	245	finally
    //   170	175	245	finally
    //   179	184	245	finally
    //   186	191	245	finally
    //   195	200	245	finally
    //   202	207	245	finally
    //   247	250	250	finally
    //   270	275	278	finally
  }
  
  public Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt)
  {
    boolean bool1 = a();
    Object localObject1;
    if (!bool1) {
      localObject1 = super.a(paramContext, paramb, paramResources, paramInt);
    }
    for (;;)
    {
      return (Typeface)localObject1;
      Object localObject2 = b();
      a.c[] arrayOfc = paramb.a();
      int j = arrayOfc.length;
      label129:
      int i;
      for (int k = 0;; k = i)
      {
        if (k >= j) {
          break label142;
        }
        localObject1 = arrayOfc[k];
        String str = ((a.c)localObject1).a();
        int m = ((a.c)localObject1).b();
        bool1 = ((a.c)localObject1).c();
        if (bool1) {}
        for (int n = 1;; n = 0)
        {
          localObject1 = paramContext;
          bool1 = a(paramContext, localObject2, str, 0, m, n);
          if (bool1) {
            break label129;
          }
          c(localObject2);
          bool1 = false;
          localObject1 = null;
          break;
        }
        i = k + 1;
      }
      label142:
      boolean bool2 = b(localObject2);
      if (!bool2)
      {
        bool2 = false;
        localObject1 = null;
      }
      else
      {
        localObject1 = a(localObject2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */