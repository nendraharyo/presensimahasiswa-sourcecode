package com.google.android.gms.common.images;

public final class Size
{
  private final int zzoG;
  private final int zzoH;
  
  public Size(int paramInt1, int paramInt2)
  {
    this.zzoG = paramInt1;
    this.zzoH = paramInt2;
  }
  
  public static Size parseSize(String paramString)
  {
    Object localObject;
    if (paramString == null)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("string must not be null");
      throw ((Throwable)localObject);
    }
    int i = paramString.indexOf('*');
    if (i < 0) {
      i = paramString.indexOf('x');
    }
    if (i < 0) {
      throw zzcC(paramString);
    }
    try
    {
      Size localSize = new com/google/android/gms/common/images/Size;
      int j = 0;
      String str = null;
      str = paramString.substring(0, i);
      j = Integer.parseInt(str);
      i += 1;
      localObject = paramString.substring(i);
      i = Integer.parseInt((String)localObject);
      localSize.<init>(j, i);
      return localSize;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw zzcC(paramString);
    }
  }
  
  private static NumberFormatException zzcC(String paramString)
  {
    NumberFormatException localNumberFormatException = new java/lang/NumberFormatException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Invalid Size: \"" + paramString + "\"";
    localNumberFormatException.<init>((String)localObject);
    throw localNumberFormatException;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    if (paramObject == null) {}
    boolean bool3;
    do
    {
      for (;;)
      {
        return bool2;
        if (this != paramObject) {
          break;
        }
        bool2 = bool1;
      }
      bool3 = paramObject instanceof Size;
    } while (!bool3);
    paramObject = (Size)paramObject;
    int i = this.zzoG;
    int j = ((Size)paramObject).zzoG;
    if (i == j)
    {
      i = this.zzoH;
      j = ((Size)paramObject).zzoH;
      if (i != j) {}
    }
    for (;;)
    {
      bool2 = bool1;
      break;
      bool1 = false;
    }
  }
  
  public int getHeight()
  {
    return this.zzoH;
  }
  
  public int getWidth()
  {
    return this.zzoG;
  }
  
  public int hashCode()
  {
    int i = this.zzoH;
    int j = this.zzoG << 16;
    int k = this.zzoG >>> 16;
    j |= k;
    return i ^ j;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    int i = this.zzoG;
    localStringBuilder = localStringBuilder.append(i).append("x");
    i = this.zzoH;
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\images\Size.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */