package android.support.v4.b;

import android.graphics.Path;
import java.util.ArrayList;

public class b
{
  private static int a(String paramString, int paramInt)
  {
    for (;;)
    {
      int i = paramString.length();
      if (paramInt < i)
      {
        i = paramString.charAt(paramInt);
        int j = i + -65;
        int k = i + -90;
        j *= k;
        if (j > 0)
        {
          j = i + -97;
          k = i + -122;
          j *= k;
          if (j > 0) {}
        }
        else
        {
          j = 101;
          if (i != j)
          {
            j = 69;
            if (i == j) {}
          }
        }
      }
      else
      {
        return paramInt;
      }
      paramInt += 1;
    }
  }
  
  public static Path a(String paramString)
  {
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    Object localObject2 = b(paramString);
    if (localObject2 != null) {}
    for (;;)
    {
      try
      {
        b.b.a((b.b[])localObject2, localPath);
        return localPath;
      }
      catch (RuntimeException localRuntimeException)
      {
        localObject2 = new java/lang/RuntimeException;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject3 = "Error in parsing " + paramString;
        ((RuntimeException)localObject2).<init>((String)localObject3, localRuntimeException);
        throw ((Throwable)localObject2);
      }
      Object localObject1 = null;
    }
  }
  
  private static void a(String paramString, int paramInt, b.a parama)
  {
    boolean bool = true;
    parama.b = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int m = paramInt;
    for (;;)
    {
      int n = paramString.length();
      if (m < n)
      {
        n = paramString.charAt(m);
        switch (n)
        {
        default: 
          i = 0;
        }
      }
      for (;;)
      {
        if (k == 0) {
          break label183;
        }
        parama.a = m;
        return;
        i = 0;
        k = bool;
        continue;
        if ((m == paramInt) || (i != 0)) {
          break;
        }
        parama.b = bool;
        i = 0;
        k = bool;
        continue;
        if (j == 0)
        {
          i = 0;
          j = bool;
        }
        else
        {
          parama.b = bool;
          i = 0;
          k = bool;
          continue;
          i = bool;
        }
      }
      label183:
      m += 1;
    }
  }
  
  private static void a(ArrayList paramArrayList, char paramChar, float[] paramArrayOfFloat)
  {
    b.b localb = new android/support/v4/b/b$b;
    localb.<init>(paramChar, paramArrayOfFloat);
    paramArrayList.add(localb);
  }
  
  public static boolean a(b.b[] paramArrayOfb1, b.b[] paramArrayOfb2)
  {
    boolean bool = false;
    if ((paramArrayOfb1 == null) || (paramArrayOfb2 == null)) {}
    for (;;)
    {
      return bool;
      int i = paramArrayOfb1.length;
      int j = paramArrayOfb2.length;
      if (i == j)
      {
        i = 0;
        for (;;)
        {
          j = paramArrayOfb1.length;
          if (i >= j) {
            break label108;
          }
          Object localObject1 = paramArrayOfb1[i];
          j = ((b.b)localObject1).a;
          Object localObject2 = paramArrayOfb2[i];
          int k = ((b.b)localObject2).a;
          if (j != k) {
            break;
          }
          localObject1 = paramArrayOfb1[i].b;
          j = localObject1.length;
          localObject2 = paramArrayOfb2[i].b;
          k = localObject2.length;
          if (j != k) {
            break;
          }
          i += 1;
        }
        label108:
        bool = true;
      }
    }
  }
  
  static float[] a(float[] paramArrayOfFloat, int paramInt1, int paramInt2)
  {
    Object localObject;
    if (paramInt1 > paramInt2)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int i = paramArrayOfFloat.length;
    if ((paramInt1 < 0) || (paramInt1 > i))
    {
      localObject = new java/lang/ArrayIndexOutOfBoundsException;
      ((ArrayIndexOutOfBoundsException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    int j = paramInt2 - paramInt1;
    i -= paramInt1;
    i = Math.min(j, i);
    float[] arrayOfFloat = new float[j];
    System.arraycopy(paramArrayOfFloat, paramInt1, arrayOfFloat, 0, i);
    return arrayOfFloat;
  }
  
  public static b.b[] a(b.b[] paramArrayOfb)
  {
    int i;
    if (paramArrayOfb == null) {
      i = 0;
    }
    b.b[] arrayOfb;
    for (Object localObject = null;; localObject = arrayOfb)
    {
      return (b.b[])localObject;
      arrayOfb = new b.b[paramArrayOfb.length];
      i = 0;
      localObject = null;
      for (;;)
      {
        int j = paramArrayOfb.length;
        if (i >= j) {
          break;
        }
        b.b localb1 = new android/support/v4/b/b$b;
        b.b localb2 = paramArrayOfb[i];
        localb1.<init>(localb2);
        arrayOfb[i] = localb1;
        i += 1;
      }
    }
  }
  
  public static void b(b.b[] paramArrayOfb1, b.b[] paramArrayOfb2)
  {
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfb2.length;
      if (i >= j) {
        break;
      }
      b.b localb = paramArrayOfb1[i];
      Object localObject = paramArrayOfb2[i];
      int k = ((b.b)localObject).a;
      localb.a = k;
      j = 0;
      localb = null;
      for (;;)
      {
        localObject = paramArrayOfb2[i].b;
        k = localObject.length;
        if (j >= k) {
          break;
        }
        localObject = paramArrayOfb1[i].b;
        float[] arrayOfFloat = paramArrayOfb2[i].b;
        float f = arrayOfFloat[j];
        localObject[j] = f;
        j += 1;
      }
      i += 1;
    }
  }
  
  public static b.b[] b(String paramString)
  {
    int i = 1;
    int j;
    if (paramString == null) {
      j = 0;
    }
    ArrayList localArrayList;
    for (Object localObject = null;; localObject = (b.b[])localArrayList.toArray((Object[])localObject))
    {
      return (b.b[])localObject;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      j = i;
      int n = 0;
      float[] arrayOfFloat1 = null;
      int k;
      for (;;)
      {
        int i1 = paramString.length();
        if (j >= i1) {
          break;
        }
        int i2 = a(paramString, j);
        localObject = paramString.substring(n, i2).trim();
        n = ((String)localObject).length();
        if (n > 0)
        {
          arrayOfFloat1 = c((String)localObject);
          j = ((String)localObject).charAt(0);
          a(localArrayList, j, arrayOfFloat1);
        }
        k = i2 + 1;
        n = i2;
      }
      k -= n;
      if (k == i)
      {
        k = paramString.length();
        if (n < k)
        {
          k = paramString.charAt(n);
          float[] arrayOfFloat2 = new float[0];
          a(localArrayList, k, arrayOfFloat2);
        }
      }
      int m = localArrayList.size();
      localObject = new b.b[m];
    }
  }
  
  private static float[] c(String paramString)
  {
    int i = 0;
    RuntimeException localRuntimeException = null;
    int j = paramString.charAt(0);
    int k = 122;
    float f1 = 1.71E-43F;
    float[] arrayOfFloat1;
    if (j != k)
    {
      j = paramString.charAt(0);
      k = 90;
      f1 = 1.26E-43F;
      if (j != k) {}
    }
    else
    {
      arrayOfFloat1 = new float[0];
      return arrayOfFloat1;
    }
    for (;;)
    {
      try
      {
        j = paramString.length();
        float[] arrayOfFloat2 = new float[j];
        j = 1;
        float f2 = Float.MIN_VALUE;
        b.a locala = new android/support/v4/b/b$a;
        locala.<init>();
        int m = paramString.length();
        k = j;
        f1 = f2;
        if (k < m)
        {
          a(paramString, k, locala);
          int n = locala.a;
          if (k < n)
          {
            j = i + 1;
            localObject = paramString.substring(k, n);
            f1 = Float.parseFloat((String)localObject);
            arrayOfFloat2[i] = f1;
            i = locala.b;
            if (i != 0)
            {
              k = n;
              i = j;
              continue;
            }
            k = n + 1;
            i = j;
          }
        }
        else
        {
          j = 0;
          f2 = 0.0F;
          arrayOfFloat1 = null;
          arrayOfFloat1 = a(arrayOfFloat2, 0, i);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        localRuntimeException = new java/lang/RuntimeException;
        Object localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = "error in parsing \"" + paramString + "\"";
        localRuntimeException.<init>((String)localObject, localNumberFormatException);
        throw localRuntimeException;
      }
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */