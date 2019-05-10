package android.support.v4.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.a.a.a.b;
import android.support.v4.a.a.a.c;
import android.support.v4.f.b.b;
import java.io.File;
import java.io.InputStream;

class g
  implements c.a
{
  private a.c a(a.b paramb, int paramInt)
  {
    a.c[] arrayOfc = paramb.a();
    g.2 local2 = new android/support/v4/b/g$2;
    local2.<init>(this);
    return (a.c)a(arrayOfc, paramInt, local2);
  }
  
  private static Object a(Object[] paramArrayOfObject, int paramInt, g.a parama)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = paramInt & 0x1;
    int k;
    label38:
    int m;
    Object localObject1;
    int i2;
    label56:
    Object localObject2;
    int i5;
    if (j == 0)
    {
      j = 400;
      k = j;
      j = paramInt & 0x2;
      if (j == 0) {
        break label166;
      }
      j = i;
      m = 0;
      localObject1 = null;
      int n = -1 >>> 1;
      int i1 = paramArrayOfObject.length;
      i2 = 0;
      if (i2 >= i1) {
        break label178;
      }
      localObject2 = paramArrayOfObject[i2];
      int i3 = Math.abs(parama.b(localObject2) - k) * 2;
      int i4 = parama.a(localObject2);
      if (i4 != j) {
        break label172;
      }
      i5 = 0;
      localObject3 = null;
      label110:
      i5 += i3;
      if ((localObject1 != null) && (n <= i5)) {
        break label181;
      }
      n = i5;
    }
    label166:
    label172:
    label178:
    label181:
    for (Object localObject3 = localObject2;; localObject3 = localObject1)
    {
      m = i2 + 1;
      i2 = m;
      localObject1 = localObject3;
      break label56;
      j = 700;
      k = j;
      break;
      j = 0;
      break label38;
      i5 = i;
      break label110;
      return localObject1;
    }
  }
  
  public Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    Typeface localTypeface = null;
    File localFile = h.a(paramContext);
    if (localFile == null) {}
    for (;;)
    {
      return localTypeface;
      try
      {
        boolean bool = h.a(localFile, paramResources, paramInt1);
        if (!bool)
        {
          localFile.delete();
          continue;
        }
        String str = localFile.getPath();
        localTypeface = Typeface.createFromFile(str);
        localFile.delete();
      }
      catch (RuntimeException localRuntimeException)
      {
        localFile.delete();
      }
      finally
      {
        localFile.delete();
      }
    }
  }
  
  /* Error */
  public Typeface a(Context paramContext, android.os.CancellationSignal paramCancellationSignal, b.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_3
    //   4: arraylength
    //   5: istore 6
    //   7: iconst_1
    //   8: istore 7
    //   10: iload 6
    //   12: iload 7
    //   14: if_icmpge +6 -> 20
    //   17: aload 5
    //   19: areturn
    //   20: aload_0
    //   21: aload_3
    //   22: iload 4
    //   24: invokevirtual 73	android/support/v4/b/g:a	([Landroid/support/v4/f/b$b;I)Landroid/support/v4/f/b$b;
    //   27: astore 8
    //   29: aload_1
    //   30: invokevirtual 79	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   33: astore 9
    //   35: aload 8
    //   37: invokevirtual 84	android/support/v4/f/b$b:a	()Landroid/net/Uri;
    //   40: astore 8
    //   42: aload 9
    //   44: aload 8
    //   46: invokevirtual 90	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   49: astore 8
    //   51: aload_0
    //   52: aload_1
    //   53: aload 8
    //   55: invokevirtual 93	android/support/v4/b/g:a	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   58: astore 5
    //   60: aload 8
    //   62: invokestatic 96	android/support/v4/b/h:a	(Ljava/io/Closeable;)V
    //   65: goto -48 -> 17
    //   68: astore 8
    //   70: iconst_0
    //   71: istore 6
    //   73: aconst_null
    //   74: astore 8
    //   76: aload 8
    //   78: invokestatic 96	android/support/v4/b/h:a	(Ljava/io/Closeable;)V
    //   81: goto -64 -> 17
    //   84: astore 10
    //   86: iconst_0
    //   87: istore 6
    //   89: aconst_null
    //   90: astore 8
    //   92: aload 10
    //   94: astore 5
    //   96: aload 8
    //   98: invokestatic 96	android/support/v4/b/h:a	(Ljava/io/Closeable;)V
    //   101: aload 5
    //   103: athrow
    //   104: astore 5
    //   106: goto -10 -> 96
    //   109: astore 9
    //   111: goto -35 -> 76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	this	g
    //   0	114	1	paramContext	Context
    //   0	114	2	paramCancellationSignal	android.os.CancellationSignal
    //   0	114	3	paramArrayOfb	b.b[]
    //   0	114	4	paramInt	int
    //   1	101	5	localObject1	Object
    //   104	1	5	localObject2	Object
    //   5	83	6	i	int
    //   8	7	7	j	int
    //   27	34	8	localObject3	Object
    //   68	1	8	localIOException1	java.io.IOException
    //   74	23	8	localCloseable	java.io.Closeable
    //   33	10	9	localContentResolver	android.content.ContentResolver
    //   109	1	9	localIOException2	java.io.IOException
    //   84	9	10	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   29	33	68	java/io/IOException
    //   35	40	68	java/io/IOException
    //   44	49	68	java/io/IOException
    //   29	33	84	finally
    //   35	40	84	finally
    //   44	49	84	finally
    //   53	58	104	finally
    //   53	58	109	java/io/IOException
  }
  
  public Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt)
  {
    Object localObject = a(paramb, paramInt);
    if (localObject == null) {}
    int i;
    for (localObject = null;; localObject = c.a(paramContext, paramResources, i, (String)localObject, paramInt))
    {
      return (Typeface)localObject;
      i = ((a.c)localObject).d();
      localObject = ((a.c)localObject).a();
    }
  }
  
  protected Typeface a(Context paramContext, InputStream paramInputStream)
  {
    Typeface localTypeface = null;
    File localFile = h.a(paramContext);
    if (localFile == null) {}
    for (;;)
    {
      return localTypeface;
      try
      {
        boolean bool = h.a(localFile, paramInputStream);
        if (!bool)
        {
          localFile.delete();
          continue;
        }
        String str = localFile.getPath();
        localTypeface = Typeface.createFromFile(str);
        localFile.delete();
      }
      catch (RuntimeException localRuntimeException)
      {
        localFile.delete();
      }
      finally
      {
        localFile.delete();
      }
    }
  }
  
  protected b.b a(b.b[] paramArrayOfb, int paramInt)
  {
    g.1 local1 = new android/support/v4/b/g$1;
    local1.<init>(this);
    return (b.b)a(paramArrayOfb, paramInt, local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */