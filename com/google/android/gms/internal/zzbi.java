package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class zzbi
{
  private static boolean zza(Character.UnicodeBlock paramUnicodeBlock)
  {
    Character.UnicodeBlock localUnicodeBlock = Character.UnicodeBlock.BOPOMOFO;
    if (paramUnicodeBlock != localUnicodeBlock)
    {
      localUnicodeBlock = Character.UnicodeBlock.BOPOMOFO_EXTENDED;
      if (paramUnicodeBlock != localUnicodeBlock)
      {
        localUnicodeBlock = Character.UnicodeBlock.CJK_COMPATIBILITY;
        if (paramUnicodeBlock != localUnicodeBlock)
        {
          localUnicodeBlock = Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS;
          if (paramUnicodeBlock != localUnicodeBlock)
          {
            localUnicodeBlock = Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT;
            if (paramUnicodeBlock != localUnicodeBlock)
            {
              localUnicodeBlock = Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS;
              if (paramUnicodeBlock != localUnicodeBlock)
              {
                localUnicodeBlock = Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A;
                if (paramUnicodeBlock != localUnicodeBlock)
                {
                  localUnicodeBlock = Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B;
                  if (paramUnicodeBlock != localUnicodeBlock)
                  {
                    localUnicodeBlock = Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS;
                    if (paramUnicodeBlock != localUnicodeBlock)
                    {
                      localUnicodeBlock = Character.UnicodeBlock.HANGUL_JAMO;
                      if (paramUnicodeBlock != localUnicodeBlock)
                      {
                        localUnicodeBlock = Character.UnicodeBlock.HANGUL_SYLLABLES;
                        if (paramUnicodeBlock != localUnicodeBlock)
                        {
                          localUnicodeBlock = Character.UnicodeBlock.HIRAGANA;
                          if (paramUnicodeBlock != localUnicodeBlock)
                          {
                            localUnicodeBlock = Character.UnicodeBlock.KATAKANA;
                            if (paramUnicodeBlock != localUnicodeBlock)
                            {
                              localUnicodeBlock = Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS;
                              if (paramUnicodeBlock != localUnicodeBlock) {
                                break label130;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label130:
      bool = false;
      localUnicodeBlock = null;
    }
  }
  
  static boolean zzi(int paramInt)
  {
    boolean bool = Character.isLetter(paramInt);
    Character.UnicodeBlock localUnicodeBlock;
    if (bool)
    {
      localUnicodeBlock = Character.UnicodeBlock.of(paramInt);
      bool = zza(localUnicodeBlock);
      if (!bool)
      {
        bool = zzj(paramInt);
        if (!bool) {}
      }
      else
      {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localUnicodeBlock = null;
    }
  }
  
  private static boolean zzj(int paramInt)
  {
    int i = 65382;
    if (paramInt >= i)
    {
      i = (char)-99;
      if (paramInt <= i) {}
    }
    else
    {
      i = (char)-95;
      if (paramInt < i) {
        break label39;
      }
      i = (char)-36;
      if (paramInt > i) {
        break label39;
      }
    }
    label39:
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public static int zzx(String paramString)
  {
    Object localObject = "UTF-8";
    try
    {
      localObject = paramString.getBytes((String)localObject);
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        int i;
        byte[] arrayOfByte = paramString.getBytes();
      }
    }
    i = localObject.length;
    return zznd.zza((byte[])localObject, 0, i, 0);
  }
  
  public static String[] zzy(String paramString)
  {
    String str1 = null;
    if (paramString == null)
    {
      i = 0;
      f1 = 0.0F;
      arrayOfString = null;
      return arrayOfString;
    }
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    char[] arrayOfChar = paramString.toCharArray();
    int j = paramString.length();
    int k = 0;
    String str2 = null;
    float f2 = 0.0F;
    int i = 0;
    String[] arrayOfString = null;
    float f1 = 0.0F;
    int m = 0;
    label57:
    int n;
    int i1;
    boolean bool;
    if (m < j)
    {
      n = Character.codePointAt(arrayOfChar, m);
      i1 = Character.charCount(n);
      bool = zzi(n);
      if (bool)
      {
        if (k != 0)
        {
          str2 = new java/lang/String;
          n = m - i;
          str2.<init>(arrayOfChar, i, n);
          localArrayList.add(str2);
        }
        str2 = new java/lang/String;
        str2.<init>(arrayOfChar, m, i1);
        localArrayList.add(str2);
        k = i;
        i = 0;
        arrayOfString = null;
        f1 = 0.0F;
      }
    }
    for (;;)
    {
      m += i1;
      int i3 = i;
      i = k;
      k = i3;
      f2 = f1;
      break label57;
      bool = Character.isLetterOrDigit(n);
      if (!bool)
      {
        int i2 = Character.getType(n);
        int i4 = 6;
        if (i2 != i4)
        {
          n = Character.getType(n);
          i2 = 8;
          if (n != i2) {
            break label258;
          }
        }
      }
      if (k == 0) {
        i = m;
      }
      f2 = Float.MIN_VALUE;
      i3 = 1;
      k = i;
      i = i3;
      f1 = f2;
      continue;
      label258:
      if (k != 0)
      {
        str2 = new java/lang/String;
        n = m - i;
        str2.<init>(arrayOfChar, i, n);
        localArrayList.add(str2);
        k = i;
        i = 0;
        arrayOfString = null;
        f1 = 0.0F;
        continue;
        if (k != 0)
        {
          str1 = new java/lang/String;
          m -= i;
          str1.<init>(arrayOfChar, i, m);
          localArrayList.add(str1);
        }
        i = localArrayList.size();
        arrayOfString = new String[i];
        arrayOfString = (String[])localArrayList.toArray(arrayOfString);
        break;
      }
      i3 = k;
      k = i;
      i = i3;
      f1 = f2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */