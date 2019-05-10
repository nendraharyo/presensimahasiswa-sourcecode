package com.bumptech.glide.util;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import com.bumptech.glide.load.model.Model;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public final class Util
{
  private static final int HASH_ACCUMULATOR = 17;
  private static final int HASH_MULTIPLIER = 31;
  private static final char[] HEX_CHAR_ARRAY = "0123456789abcdef".toCharArray();
  private static final char[] SHA_256_CHARS = new char[64];
  
  public static void assertBackgroundThread()
  {
    boolean bool = isOnBackgroundThread();
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("You must call this method on a background thread");
      throw localIllegalArgumentException;
    }
  }
  
  public static void assertMainThread()
  {
    boolean bool = isOnMainThread();
    if (!bool)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("You must call this method on the main thread");
      throw localIllegalArgumentException;
    }
  }
  
  public static boolean bothModelsNullEquivalentOrEquals(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null) {
      if (paramObject2 == null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      bool = paramObject1 instanceof Model;
      if (bool)
      {
        paramObject1 = (Model)paramObject1;
        bool = ((Model)paramObject1).isEquivalentTo(paramObject2);
      }
      else
      {
        bool = paramObject1.equals(paramObject2);
      }
    }
  }
  
  public static boolean bothNullOrEqual(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null) {
      if (paramObject2 == null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      bool = paramObject1.equals(paramObject2);
    }
  }
  
  private static String bytesToHex(byte[] paramArrayOfByte, char[] paramArrayOfChar)
  {
    int i = 0;
    String str = null;
    for (;;)
    {
      int j = paramArrayOfByte.length;
      if (i >= j) {
        break;
      }
      j = paramArrayOfByte[i] & 0xFF;
      int k = i * 2;
      char[] arrayOfChar = HEX_CHAR_ARRAY;
      int m = j >>> 4;
      int n = arrayOfChar[m];
      paramArrayOfChar[k] = n;
      k = i * 2 + 1;
      arrayOfChar = HEX_CHAR_ARRAY;
      j &= 0xF;
      j = arrayOfChar[j];
      paramArrayOfChar[k] = j;
      i += 1;
    }
    str = new java/lang/String;
    str.<init>(paramArrayOfChar);
    return str;
  }
  
  public static Queue createQueue(int paramInt)
  {
    ArrayDeque localArrayDeque = new java/util/ArrayDeque;
    localArrayDeque.<init>(paramInt);
    return localArrayDeque;
  }
  
  public static int getBitmapByteSize(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    int i = paramInt1 * paramInt2;
    int j = getBytesPerPixel(paramConfig);
    return i * j;
  }
  
  public static int getBitmapByteSize(Bitmap paramBitmap)
  {
    boolean bool = paramBitmap.isRecycled();
    if (bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Cannot obtain size for recycled Bitmap: ").append(paramBitmap).append("[");
      int j = paramBitmap.getWidth();
      localObject = ((StringBuilder)localObject).append(j).append("x");
      j = paramBitmap.getHeight();
      localObject = ((StringBuilder)localObject).append(j).append("] ");
      Bitmap.Config localConfig = paramBitmap.getConfig();
      localObject = localConfig;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    int i = Build.VERSION.SDK_INT;
    int k = 19;
    if (i >= k) {}
    for (;;)
    {
      try
      {
        i = paramBitmap.getAllocationByteCount();
        return i;
      }
      catch (NullPointerException localNullPointerException) {}
      i = paramBitmap.getHeight();
      k = paramBitmap.getRowBytes();
      i *= k;
    }
  }
  
  private static int getBytesPerPixel(Bitmap.Config paramConfig)
  {
    if (paramConfig == null) {
      paramConfig = Bitmap.Config.ARGB_8888;
    }
    int[] arrayOfInt = Util.1.$SwitchMap$android$graphics$Bitmap$Config;
    int i = paramConfig.ordinal();
    int j = arrayOfInt[i];
    switch (j)
    {
    default: 
      j = 4;
    }
    for (;;)
    {
      return j;
      j = 1;
      continue;
      j = 2;
      continue;
      j = 8;
    }
  }
  
  public static int getSize(Bitmap paramBitmap)
  {
    return getBitmapByteSize(paramBitmap);
  }
  
  public static List getSnapshot(Collection paramCollection)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramCollection.size();
    localArrayList.<init>(i);
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = localIterator.next();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public static int hashCode(float paramFloat)
  {
    return hashCode(paramFloat, 17);
  }
  
  public static int hashCode(float paramFloat, int paramInt)
  {
    return hashCode(Float.floatToIntBits(paramFloat), paramInt);
  }
  
  public static int hashCode(int paramInt)
  {
    return hashCode(paramInt, 17);
  }
  
  public static int hashCode(int paramInt1, int paramInt2)
  {
    return paramInt2 * 31 + paramInt1;
  }
  
  public static int hashCode(Object paramObject, int paramInt)
  {
    if (paramObject == null) {}
    for (int i = 0;; i = paramObject.hashCode()) {
      return hashCode(i, paramInt);
    }
  }
  
  public static int hashCode(boolean paramBoolean)
  {
    return hashCode(paramBoolean, 17);
  }
  
  public static int hashCode(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {}
    for (int i = 1;; i = 0) {
      return hashCode(i, paramInt);
    }
  }
  
  public static boolean isOnBackgroundThread()
  {
    boolean bool = isOnMainThread();
    if (!bool) {}
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static boolean isOnMainThread()
  {
    Looper localLooper1 = Looper.myLooper();
    Looper localLooper2 = Looper.getMainLooper();
    boolean bool;
    if (localLooper1 == localLooper2) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLooper1 = null;
    }
  }
  
  private static boolean isValidDimension(int paramInt)
  {
    if (paramInt <= 0)
    {
      i = -1 << -1;
      if (paramInt != i) {
        break label17;
      }
    }
    label17:
    for (int i = 1;; i = 0) {
      return i;
    }
  }
  
  public static boolean isValidDimensions(int paramInt1, int paramInt2)
  {
    boolean bool = isValidDimension(paramInt1);
    if (bool)
    {
      bool = isValidDimension(paramInt2);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public static String sha256BytesToHex(byte[] paramArrayOfByte)
  {
    synchronized (SHA_256_CHARS)
    {
      Object localObject1 = SHA_256_CHARS;
      localObject1 = bytesToHex(paramArrayOfByte, (char[])localObject1);
      return (String)localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\Util.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */