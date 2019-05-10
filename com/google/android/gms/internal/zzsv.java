package com.google.android.gms.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzsv
{
  private static void zza(String paramString, Object paramObject, StringBuffer paramStringBuffer1, StringBuffer paramStringBuffer2)
  {
    String str1 = null;
    if (paramObject == null) {
      return;
    }
    boolean bool1 = paramObject instanceof zzsu;
    int m;
    Object localObject1;
    Class localClass;
    Object localObject3;
    int i5;
    label376:
    String str2;
    if (bool1)
    {
      m = paramStringBuffer1.length();
      if (paramString != null)
      {
        localObject1 = paramStringBuffer2.append(paramStringBuffer1);
        localObject2 = zzgP(paramString);
        localObject1 = ((StringBuffer)localObject1).append((String)localObject2);
        localObject2 = " <\n";
        ((StringBuffer)localObject1).append((String)localObject2);
        localObject1 = "  ";
        paramStringBuffer1.append((String)localObject1);
      }
      localClass = paramObject.getClass();
      Field[] arrayOfField = localClass.getFields();
      int n = arrayOfField.length;
      int i2 = 0;
      Method[] arrayOfMethod = null;
      if (i2 < n)
      {
        localObject1 = arrayOfField[i2];
        int i3 = ((Field)localObject1).getModifiers();
        localObject3 = ((Field)localObject1).getName();
        Object localObject4 = "cachedSize";
        boolean bool6 = ((String)localObject4).equals(localObject3);
        if (bool6) {}
        for (;;)
        {
          int i = i2 + 1;
          i2 = i;
          break;
          bool6 = i3 & 0x1;
          boolean bool7 = true;
          if (bool6 == bool7)
          {
            i3 &= 0x8;
            int i6 = 8;
            if (i3 != i6)
            {
              localObject2 = "_";
              int i4 = ((String)localObject3).startsWith((String)localObject2);
              if (i4 == 0)
              {
                localObject2 = "_";
                i4 = ((String)localObject3).endsWith((String)localObject2);
                if (i4 == 0)
                {
                  localObject2 = ((Field)localObject1).getType();
                  localObject4 = ((Field)localObject1).get(paramObject);
                  boolean bool2 = ((Class)localObject2).isArray();
                  if (bool2)
                  {
                    localObject1 = ((Class)localObject2).getComponentType();
                    localObject2 = Byte.TYPE;
                    if (localObject1 == localObject2)
                    {
                      zza((String)localObject3, localObject4, paramStringBuffer1, paramStringBuffer2);
                    }
                    else
                    {
                      if (localObject4 == null)
                      {
                        bool2 = false;
                        localObject1 = null;
                      }
                      for (;;)
                      {
                        i4 = 0;
                        localObject2 = null;
                        while (i4 < bool2)
                        {
                          Object localObject5 = Array.get(localObject4, i4);
                          zza((String)localObject3, localObject5, paramStringBuffer1, paramStringBuffer2);
                          i4 += 1;
                        }
                        break;
                        int j = Array.getLength(localObject4);
                      }
                    }
                  }
                  else
                  {
                    zza((String)localObject3, localObject4, paramStringBuffer1, paramStringBuffer2);
                  }
                }
              }
            }
          }
        }
      }
      arrayOfMethod = localClass.getMethods();
      int i7 = arrayOfMethod.length;
      i5 = 0;
      Object localObject2 = null;
      if (i5 < i7)
      {
        localObject1 = arrayOfMethod[i5].getName();
        str2 = "set";
        boolean bool5 = ((String)localObject1).startsWith(str2);
        if (bool5)
        {
          int i1 = 3;
          str2 = ((String)localObject1).substring(i1);
        }
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject3 = "has";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).append(str2);
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject3 = null;
        localObject3 = new Class[0];
        localObject1 = localClass.getMethod((String)localObject1, (Class[])localObject3);
        localObject3 = new Object[0];
        localObject1 = (Boolean)((Method)localObject1).invoke(paramObject, (Object[])localObject3);
        boolean bool3 = ((Boolean)localObject1).booleanValue();
        if (bool3) {
          continue;
        }
      }
      catch (NoSuchMethodException localNoSuchMethodException2)
      {
        int k;
        boolean bool4;
        continue;
      }
      k = i5 + 1;
      i5 = k;
      break label376;
      try
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject3 = "get";
        localObject1 = ((StringBuilder)localObject1).append((String)localObject3);
        localObject1 = ((StringBuilder)localObject1).append(str2);
        localObject1 = ((StringBuilder)localObject1).toString();
        localObject3 = null;
        localObject3 = new Class[0];
        localObject1 = localClass.getMethod((String)localObject1, (Class[])localObject3);
        localObject3 = new Object[0];
        localObject1 = ((Method)localObject1).invoke(paramObject, (Object[])localObject3);
        zza(str2, localObject1, paramStringBuffer1, paramStringBuffer2);
      }
      catch (NoSuchMethodException localNoSuchMethodException1) {}
      if (paramString == null) {
        break;
      }
      paramStringBuffer1.setLength(m);
      localObject1 = paramStringBuffer2.append(paramStringBuffer1);
      str1 = ">\n";
      ((StringBuffer)localObject1).append(str1);
      break;
      localObject1 = zzgP(paramString);
      localObject1 = paramStringBuffer2.append(paramStringBuffer1).append((String)localObject1);
      str1 = ": ";
      ((StringBuffer)localObject1).append(str1);
      bool4 = paramObject instanceof String;
      if (bool4)
      {
        paramObject = (String)paramObject;
        localObject1 = zzbZ((String)paramObject);
        localObject1 = paramStringBuffer2.append("\"").append((String)localObject1);
        str1 = "\"";
        ((StringBuffer)localObject1).append(str1);
        localObject1 = "\n";
        paramStringBuffer2.append((String)localObject1);
        break;
      }
      bool4 = paramObject instanceof byte[];
      if (bool4)
      {
        paramObject = (byte[])paramObject;
        zza((byte[])paramObject, paramStringBuffer2);
      }
      else
      {
        paramStringBuffer2.append(paramObject);
      }
    }
  }
  
  private static void zza(byte[] paramArrayOfByte, StringBuffer paramStringBuffer)
  {
    int i = 92;
    int j = 34;
    String str;
    if (paramArrayOfByte == null)
    {
      str = "\"\"";
      paramStringBuffer.append(str);
    }
    for (;;)
    {
      return;
      paramStringBuffer.append(j);
      int k = 0;
      str = null;
      int m = paramArrayOfByte.length;
      if (k < m)
      {
        m = paramArrayOfByte[k] & 0xFF;
        Object localObject1;
        char c1;
        if ((m == i) || (m == j))
        {
          localObject1 = paramStringBuffer.append(i);
          c1 = (char)m;
          ((StringBuffer)localObject1).append(c1);
        }
        for (;;)
        {
          k += 1;
          break;
          char c2 = ' ';
          if (c1 >= c2)
          {
            c2 = '';
            if (c1 < c2)
            {
              c1 = (char)c1;
              paramStringBuffer.append(c1);
              continue;
            }
          }
          localObject1 = "\\%03o";
          int n = 1;
          Object[] arrayOfObject = new Object[n];
          Object localObject2 = Integer.valueOf(c1);
          arrayOfObject[0] = localObject2;
          localObject2 = String.format((String)localObject1, arrayOfObject);
          paramStringBuffer.append((String)localObject2);
        }
      }
      paramStringBuffer.append(j);
    }
  }
  
  private static String zzbZ(String paramString)
  {
    int i = 200;
    Object localObject = "http";
    boolean bool = paramString.startsWith((String)localObject);
    if (!bool)
    {
      int j = paramString.length();
      if (j > i)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        String str = paramString.substring(0, i);
        localObject = ((StringBuilder)localObject).append(str);
        str = "[...]";
        localObject = ((StringBuilder)localObject).append(str);
        paramString = ((StringBuilder)localObject).toString();
      }
    }
    return zzcU(paramString);
  }
  
  private static String zzcU(String paramString)
  {
    int i = paramString.length();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>(i);
    int j = 0;
    if (j < i)
    {
      char c1 = paramString.charAt(j);
      char c2 = ' ';
      if (c1 >= c2)
      {
        c2 = '~';
        if (c1 <= c2)
        {
          c2 = '"';
          if (c1 != c2)
          {
            c2 = '\'';
            if (c1 != c2) {
              localStringBuilder.append(c1);
            }
          }
        }
      }
      for (;;)
      {
        j += 1;
        break;
        String str = "\\u%04x";
        int k = 1;
        Object[] arrayOfObject = new Object[k];
        Object localObject = Integer.valueOf(c1);
        arrayOfObject[0] = localObject;
        localObject = String.format(str, arrayOfObject);
        localStringBuilder.append((String)localObject);
      }
    }
    return localStringBuilder.toString();
  }
  
  public static String zzf(zzsu paramzzsu)
  {
    Object localObject1;
    if (paramzzsu == null) {
      localObject1 = "";
    }
    for (;;)
    {
      return (String)localObject1;
      localObject1 = new java/lang/StringBuffer;
      ((StringBuffer)localObject1).<init>();
      StringBuilder localStringBuilder = null;
      try
      {
        localObject2 = new java/lang/StringBuffer;
        ((StringBuffer)localObject2).<init>();
        zza(null, paramzzsu, (StringBuffer)localObject2, (StringBuffer)localObject1);
        localObject1 = ((StringBuffer)localObject1).toString();
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject2 = "Error printing proto: ";
        localStringBuilder = localStringBuilder.append((String)localObject2);
        String str1 = localIllegalAccessException.getMessage();
        str1 = str1;
      }
      catch (InvocationTargetException localInvocationTargetException)
      {
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        Object localObject2 = "Error printing proto: ";
        localStringBuilder = localStringBuilder.append((String)localObject2);
        String str2 = localInvocationTargetException.getMessage();
        str2 = str2;
      }
    }
  }
  
  private static String zzgP(String paramString)
  {
    StringBuffer localStringBuffer1 = new java/lang/StringBuffer;
    localStringBuffer1.<init>();
    int i = 0;
    int j = paramString.length();
    if (i < j)
    {
      j = paramString.charAt(i);
      char c1;
      if (i == 0)
      {
        c1 = Character.toLowerCase(j);
        localStringBuffer1.append(c1);
      }
      for (;;)
      {
        i += 1;
        break;
        boolean bool = Character.isUpperCase(c1);
        if (bool)
        {
          char c2 = '_';
          StringBuffer localStringBuffer2 = localStringBuffer1.append(c2);
          c1 = Character.toLowerCase(c1);
          localStringBuffer2.append(c1);
        }
        else
        {
          localStringBuffer1.append(c1);
        }
      }
    }
    return localStringBuffer1.toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */