package com.google.gson.internal.bind.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils
{
  private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
  private static final String UTC_ID = "UTC";
  
  private static boolean checkOffset(String paramString, int paramInt, char paramChar)
  {
    int i = paramString.length();
    if (paramInt < i)
    {
      i = paramString.charAt(paramInt);
      if (i != paramChar) {}
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public static String format(Date paramDate)
  {
    TimeZone localTimeZone = TIMEZONE_UTC;
    return format(paramDate, false, localTimeZone);
  }
  
  public static String format(Date paramDate, boolean paramBoolean)
  {
    TimeZone localTimeZone = TIMEZONE_UTC;
    return format(paramDate, paramBoolean, localTimeZone);
  }
  
  public static String format(Date paramDate, boolean paramBoolean, TimeZone paramTimeZone)
  {
    int i = 60000;
    char c = ':';
    int j = 45;
    GregorianCalendar localGregorianCalendar = new java/util/GregorianCalendar;
    Object localObject = Locale.US;
    localGregorianCalendar.<init>(paramTimeZone, (Locale)localObject);
    localGregorianCalendar.setTime(paramDate);
    localObject = "yyyy-MM-ddThh:mm:ss";
    int k = ((String)localObject).length();
    label90:
    StringBuilder localStringBuilder;
    label396:
    int n;
    if (paramBoolean)
    {
      localObject = ".sss";
      int m = ((String)localObject).length();
      k += m;
      m = paramTimeZone.getRawOffset();
      if (m != 0) {
        break label463;
      }
      localObject = "Z";
      m = ((String)localObject).length();
      m += k;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>(m);
      m = localGregorianCalendar.get(1);
      int i1 = "yyyy".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append(j);
      m = localGregorianCalendar.get(2) + 1;
      i1 = "MM".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append(j);
      m = localGregorianCalendar.get(5);
      i1 = "dd".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append('T');
      m = localGregorianCalendar.get(11);
      i1 = "hh".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append(c);
      m = localGregorianCalendar.get(12);
      i1 = "mm".length();
      padInt(localStringBuilder, m, i1);
      localStringBuilder.append(c);
      m = localGregorianCalendar.get(13);
      String str = "ss";
      i1 = str.length();
      padInt(localStringBuilder, m, i1);
      if (paramBoolean)
      {
        localStringBuilder.append('.');
        m = localGregorianCalendar.get(14);
        str = "sss";
        i1 = str.length();
        padInt(localStringBuilder, m, i1);
      }
      long l = localGregorianCalendar.getTimeInMillis();
      m = paramTimeZone.getOffset(l);
      if (m == 0) {
        break label484;
      }
      int i2 = Math.abs(m / i / 60);
      i1 = Math.abs(m / i % 60);
      if (m >= 0) {
        break label477;
      }
      m = j;
      localStringBuilder.append(m);
      n = "hh".length();
      padInt(localStringBuilder, i2, n);
      localStringBuilder.append(c);
      localObject = "mm";
      n = ((String)localObject).length();
      padInt(localStringBuilder, i1, n);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      n = 0;
      localObject = null;
      break;
      label463:
      localObject = "+hh:mm";
      n = ((String)localObject).length();
      break label90;
      label477:
      n = 43;
      break label396;
      label484:
      n = 90;
      localStringBuilder.append(n);
    }
  }
  
  private static int indexOfNonDigit(String paramString, int paramInt)
  {
    int i = paramString.length();
    if (paramInt < i)
    {
      i = paramString.charAt(paramInt);
      int j = 48;
      if (i >= j)
      {
        j = 57;
        if (i <= j) {
          break label34;
        }
      }
    }
    for (;;)
    {
      return paramInt;
      label34:
      paramInt += 1;
      break;
      paramInt = paramString.length();
    }
  }
  
  private static void padInt(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    String str = Integer.toString(paramInt1);
    int i = str.length();
    i = paramInt2 - i;
    while (i > 0)
    {
      char c = '0';
      paramStringBuilder.append(c);
      i += -1;
    }
    paramStringBuilder.append(str);
  }
  
  public static Date parse(String paramString, ParsePosition paramParsePosition)
  {
    i = 43;
    j = 5;
    k = 45;
    m = 0;
    Object localObject1 = null;
    try
    {
      int n = paramParsePosition.getIndex();
      i6 = n + 4;
      i8 = parseInt(paramString, n, i6);
      n = 45;
      i1 = checkOffset(paramString, i6, n);
      if (i1 == 0) {
        break label1410;
      }
      i6 += 1;
      i1 = i6;
    }
    catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
    {
      int i8;
      int i9;
      int i10;
      for (;;)
      {
        int i6;
        int i1;
        char c1;
        int i2;
        char c2;
        boolean bool3;
        int i11;
        int i3;
        int i12;
        int i4;
        char c3;
        boolean bool4;
        int i15;
        int i17;
        int i18;
        char c4;
        boolean bool5;
        localObject6 = localIndexOutOfBoundsException;
        if (paramString != null) {
          break;
        }
        m = 0;
        localObject2 = null;
        localObject5 = ((Exception)localObject6).getMessage();
        if (localObject5 != null)
        {
          i13 = ((String)localObject5).isEmpty();
          if (i13 == 0) {}
        }
        else
        {
          localObject5 = new java/lang/StringBuilder;
          ((StringBuilder)localObject5).<init>();
          localObject5 = ((StringBuilder)localObject5).append("(");
          localObject7 = localObject6.getClass().getName();
          localObject5 = ((StringBuilder)localObject5).append((String)localObject7);
          localObject7 = ")";
          localObject5 = (String)localObject7;
        }
        localObject7 = new java/text/ParseException;
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject2 = "Failed to parse date [" + (String)localObject2 + "]: " + (String)localObject5;
        i7 = paramParsePosition.getIndex();
        ((ParseException)localObject7).<init>((String)localObject2, i7);
        ((ParseException)localObject7).initCause((Throwable)localObject6);
        throw ((Throwable)localObject7);
        m *= 10;
        continue;
        m *= 100;
      }
      m = paramString.charAt(i7);
      int i20 = 90;
      if (m != i20) {
        break label874;
      }
      Object localObject2 = TIMEZONE_UTC;
      i7 += 1;
      Object localObject8;
      boolean bool2;
      do
      {
        boolean bool1;
        do
        {
          localObject8 = new java/util/GregorianCalendar;
          ((GregorianCalendar)localObject8).<init>((TimeZone)localObject2);
          m = 0;
          localObject2 = null;
          ((Calendar)localObject8).setLenient(false);
          m = 1;
          ((Calendar)localObject8).set(m, i8);
          m = 2;
          i8 = i9 + -1;
          ((Calendar)localObject8).set(m, i8);
          m = 5;
          ((Calendar)localObject8).set(m, i10);
          m = 11;
          ((Calendar)localObject8).set(m, i19);
          m = 12;
          ((Calendar)localObject8).set(m, i16);
          m = 13;
          ((Calendar)localObject8).set(m, i13);
          m = 14;
          ((Calendar)localObject8).set(m, i5);
          paramParsePosition.setIndex(i7);
          localObject2 = ((Calendar)localObject8).getTime();
          break;
          if ((m != i) && (m != k)) {
            break label1199;
          }
          localObject2 = paramString.substring(i7);
          int i21 = ((String)localObject2).length();
          if (i21 >= j) {}
          for (;;)
          {
            i21 = ((String)localObject2).length();
            i7 += i21;
            localObject8 = "+0000";
            boolean bool6 = ((String)localObject8).equals(localObject2);
            if (!bool6)
            {
              localObject8 = "+00:00";
              bool6 = ((String)localObject8).equals(localObject2);
              if (!bool6) {
                break label1008;
              }
            }
            localObject2 = TIMEZONE_UTC;
            break;
            localObject8 = new java/lang/StringBuilder;
            ((StringBuilder)localObject8).<init>();
            localObject2 = ((StringBuilder)localObject8).append((String)localObject2);
            localObject8 = "00";
            localObject2 = ((StringBuilder)localObject2).append((String)localObject8);
            localObject2 = ((StringBuilder)localObject2).toString();
          }
          localObject8 = new java/lang/StringBuilder;
          ((StringBuilder)localObject8).<init>();
          str1 = "GMT";
          localObject8 = ((StringBuilder)localObject8).append(str1);
          localObject2 = ((StringBuilder)localObject8).append((String)localObject2);
          localObject8 = ((StringBuilder)localObject2).toString();
          localObject2 = TimeZone.getTimeZone((String)localObject8);
          str1 = ((TimeZone)localObject2).getID();
          bool1 = str1.equals(localObject8);
        } while (bool1);
        String str2 = ":";
        String str3 = "";
        String str1 = str1.replace(str2, str3);
        bool2 = str1.equals(localObject8);
      } while (bool2);
      localObject5 = new java/lang/IndexOutOfBoundsException;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject7 = "Mismatching time zone indicator: ";
      localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
      localObject6 = ((StringBuilder)localObject6).append((String)localObject8);
      localObject7 = " given, resolves to ";
      localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
      localObject2 = ((TimeZone)localObject2).getID();
      localObject2 = ((StringBuilder)localObject6).append((String)localObject2);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((IndexOutOfBoundsException)localObject5).<init>((String)localObject2);
      throw ((Throwable)localObject5);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        localObject6 = localNumberFormatException;
      }
      localObject5 = new java/lang/IndexOutOfBoundsException;
      localObject6 = new java/lang/StringBuilder;
      ((StringBuilder)localObject6).<init>();
      localObject7 = "Invalid time zone indicator '";
      localObject6 = ((StringBuilder)localObject6).append((String)localObject7);
      Object localObject3 = ((StringBuilder)localObject6).append(m);
      localObject6 = "'";
      localObject3 = ((StringBuilder)localObject3).append((String)localObject6);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((IndexOutOfBoundsException)localObject5).<init>((String)localObject3);
      throw ((Throwable)localObject5);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        Object localObject6 = localIllegalArgumentException;
        continue;
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        int i7 = 34;
        localObject4 = ((StringBuilder)localObject4).append(i7).append(paramString);
        Object localObject5 = "'";
        localObject4 = (String)localObject5;
        continue;
        int i19 = i13;
        int i13 = i7;
        i7 = i16;
        int i16 = i5;
        int i5 = 0;
        localObject6 = null;
        continue;
        i16 = i5;
        i19 = i13;
        i5 = 0;
        localObject6 = null;
        int i14 = 0;
        Object localObject7 = null;
        continue;
        i5 = i7;
        continue;
        i5 = 0;
        localObject6 = null;
        i14 = 0;
        localObject7 = null;
        i16 = 0;
        StringBuilder localStringBuilder = null;
        i19 = 0;
        continue;
        i5 = i7;
        continue;
        i5 = i7;
      }
    }
    i6 = i1 + 2;
    i9 = parseInt(paramString, i1, i6);
    c1 = '-';
    i2 = checkOffset(paramString, i6, c1);
    if (i2 != 0)
    {
      i6 += 1;
      i2 = i6;
      i6 = i2 + 2;
      i10 = parseInt(paramString, i2, i6);
      c2 = 'T';
      bool3 = checkOffset(paramString, i6, c2);
      if (!bool3)
      {
        i11 = paramString.length();
        if (i11 <= i6)
        {
          localObject1 = new java/util/GregorianCalendar;
          i3 = i9 + -1;
          ((GregorianCalendar)localObject1).<init>(i8, i3, i10);
          paramParsePosition.setIndex(i6);
          localObject1 = ((Calendar)localObject1).getTime();
          return (Date)localObject1;
        }
      }
      if (i3 != 0)
      {
        i3 = i6 + 1;
        i6 = i3 + 2;
        i12 = parseInt(paramString, i3, i6);
        i3 = 58;
        i4 = checkOffset(paramString, i6, i3);
        if (i4 != 0)
        {
          i6 += 1;
          i4 = i6;
          i6 = i4 + 2;
          i5 = parseInt(paramString, i4, i6);
          c3 = ':';
          bool4 = checkOffset(paramString, i6, c3);
          if (bool4) {
            i6 += 1;
          }
          i15 = paramString.length();
          if (i15 > i6)
          {
            i16 = paramString.charAt(i6);
            i17 = 90;
            if ((i16 != i17) && (i16 != i) && (i16 != k))
            {
              i16 = i6 + 2;
              i6 = parseInt(paramString, i6, i16);
              i17 = 59;
              if (i6 > i17)
              {
                i18 = 63;
                if (i6 < i18) {
                  i6 = 59;
                }
              }
              c4 = '.';
              bool5 = checkOffset(paramString, i16, c4);
              if (bool5)
              {
                i19 = i16 + 1;
                m = i19 + 1;
                i16 = indexOfNonDigit(paramString, m);
                m = i19 + 3;
                i20 = Math.min(i16, m);
                m = parseInt(paramString, i19, i20);
                i19 = i20 - i19;
                switch (i19)
                {
                default: 
                  i19 = i12;
                  i12 = i6;
                  i6 = i16;
                  i16 = i5;
                  i5 = m;
                  m = paramString.length();
                  if (m <= i6)
                  {
                    localObject1 = new java/lang/IllegalArgumentException;
                    localObject5 = "No time zone indicator";
                    ((IllegalArgumentException)localObject1).<init>((String)localObject5);
                    throw ((Throwable)localObject1);
                  }
                  break;
                }
              }
            }
          }
        }
      }
    }
  }
  
  private static int parseInt(String paramString, int paramInt1, int paramInt2)
  {
    int i = 10;
    if (paramInt1 >= 0)
    {
      j = paramString.length();
      if ((paramInt2 <= j) && (paramInt1 <= paramInt2)) {}
    }
    else
    {
      localNumberFormatException = new java/lang/NumberFormatException;
      localNumberFormatException.<init>(paramString);
      throw localNumberFormatException;
    }
    int j = 0;
    NumberFormatException localNumberFormatException = null;
    int k;
    Object localObject;
    String str;
    if (paramInt1 < paramInt2)
    {
      k = paramInt1 + 1;
      j = Character.digit(paramString.charAt(paramInt1), i);
      if (j < 0)
      {
        localNumberFormatException = new java/lang/NumberFormatException;
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append("Invalid number: ");
        str = paramString.substring(paramInt1, paramInt2);
        localObject = str;
        localNumberFormatException.<init>((String)localObject);
        throw localNumberFormatException;
      }
      j = -j;
    }
    for (;;)
    {
      if (k < paramInt2)
      {
        int m = k + 1;
        k = Character.digit(paramString.charAt(k), i);
        if (k < 0)
        {
          localNumberFormatException = new java/lang/NumberFormatException;
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>();
          localObject = ((StringBuilder)localObject).append("Invalid number: ");
          str = paramString.substring(paramInt1, paramInt2);
          localObject = str;
          localNumberFormatException.<init>((String)localObject);
          throw localNumberFormatException;
        }
        j = j * 10 - k;
        k = m;
      }
      else
      {
        return -j;
        k = paramInt1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\gson\internal\bin\\util\ISO8601Utils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */