package com.sun.pdfview.decrypt;

import com.sun.pdfview.PDFStringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PDFPassword
{
  public static final PDFPassword EMPTY_PASSWORD;
  private static final PDFPassword.PasswordByteGenerator[] PASSWORD_BYTE_GENERATORS;
  private byte[] passwordBytes = null;
  private String passwordString = null;
  
  static
  {
    byte b = 63;
    Object localObject1 = new com/sun/pdfview/decrypt/PDFPassword;
    Object localObject2 = new byte[0];
    ((PDFPassword)localObject1).<init>((byte[])localObject2);
    EMPTY_PASSWORD = (PDFPassword)localObject1;
    localObject1 = new PDFPassword.PasswordByteGenerator[7];
    localObject2 = new com/sun/pdfview/decrypt/PDFPassword$PDFDocEncodingByteGenerator;
    ((PDFPassword.PDFDocEncodingByteGenerator)localObject2).<init>(null, null);
    localObject1[0] = localObject2;
    Object localObject3 = new com/sun/pdfview/decrypt/PDFPassword$PDFDocEncodingByteGenerator;
    Byte localByte = Byte.valueOf((byte)0);
    ((PDFPassword.PDFDocEncodingByteGenerator)localObject3).<init>(localByte, null);
    localObject1[1] = localObject3;
    localObject3 = new com/sun/pdfview/decrypt/PDFPassword$PDFDocEncodingByteGenerator;
    localByte = Byte.valueOf(b);
    ((PDFPassword.PDFDocEncodingByteGenerator)localObject3).<init>(localByte, null);
    localObject1[2] = localObject3;
    localObject3 = new com/sun/pdfview/decrypt/PDFPassword$1;
    ((PDFPassword.1)localObject3).<init>();
    localObject1[3] = localObject3;
    localObject3 = new com/sun/pdfview/decrypt/PDFPassword$IdentityEncodingByteGenerator;
    ((PDFPassword.IdentityEncodingByteGenerator)localObject3).<init>(null, null);
    localObject1[4] = localObject3;
    localObject3 = new com/sun/pdfview/decrypt/PDFPassword$IdentityEncodingByteGenerator;
    localByte = Byte.valueOf((byte)0);
    ((PDFPassword.IdentityEncodingByteGenerator)localObject3).<init>(localByte, null);
    localObject1[5] = localObject3;
    localObject3 = new com/sun/pdfview/decrypt/PDFPassword$IdentityEncodingByteGenerator;
    localByte = Byte.valueOf(b);
    ((PDFPassword.IdentityEncodingByteGenerator)localObject3).<init>(localByte, null);
    localObject1[6] = localObject3;
    PASSWORD_BYTE_GENERATORS = (PDFPassword.PasswordByteGenerator[])localObject1;
  }
  
  public PDFPassword(String paramString)
  {
    if (paramString != null) {}
    for (;;)
    {
      this.passwordString = paramString;
      return;
      paramString = "";
    }
  }
  
  public PDFPassword(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    for (;;)
    {
      this.passwordBytes = paramArrayOfByte;
      return;
      paramArrayOfByte = new byte[0];
    }
  }
  
  private static List generatePossiblePasswordBytes(String paramString)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    PDFPassword.PasswordByteGenerator[] arrayOfPasswordByteGenerator = PASSWORD_BYTE_GENERATORS;
    int i = arrayOfPasswordByteGenerator.length;
    byte[] arrayOfByte;
    int k;
    boolean bool1;
    float f1;
    int m;
    for (int j = 0;; j = m)
    {
      if (j >= i) {
        return localArrayList;
      }
      localObject = arrayOfPasswordByteGenerator[j];
      arrayOfByte = ((PDFPassword.PasswordByteGenerator)localObject).generateBytes(paramString);
      k = 0;
      bool1 = false;
      f1 = 0.0F;
      if (!bool1)
      {
        m = localArrayList.size();
        if (k < m) {
          break;
        }
      }
      if (!bool1) {
        localArrayList.add(arrayOfByte);
      }
      m = j + 1;
    }
    Object localObject = (byte[])localArrayList.get(k);
    boolean bool2 = Arrays.equals((byte[])localObject, arrayOfByte);
    if (bool2) {
      bool2 = true;
    }
    for (float f2 = Float.MIN_VALUE;; f2 = f1)
    {
      k += 1;
      bool1 = bool2;
      f1 = f2;
      break;
      bool2 = bool1;
    }
  }
  
  private boolean isAlphaNum7BitString(String paramString)
  {
    boolean bool1 = false;
    int i = 0;
    for (;;)
    {
      int j = paramString.length();
      if (i >= j) {
        bool1 = true;
      }
      boolean bool2;
      do
      {
        int k;
        do
        {
          return bool1;
          j = paramString.charAt(i);
          k = 127;
        } while (j >= k);
        bool2 = Character.isLetterOrDigit(j);
      } while (!bool2);
      i += 1;
    }
  }
  
  public static PDFPassword nonNullPassword(PDFPassword paramPDFPassword)
  {
    if (paramPDFPassword != null) {}
    for (;;)
    {
      return paramPDFPassword;
      paramPDFPassword = EMPTY_PASSWORD;
    }
  }
  
  List getPasswordBytes(boolean paramBoolean)
  {
    Object localObject = this.passwordBytes;
    if (localObject == null)
    {
      localObject = this.passwordString;
      if (localObject != null) {}
    }
    else
    {
      localObject = Collections.singletonList(this.passwordBytes);
    }
    for (;;)
    {
      return (List)localObject;
      localObject = this.passwordString;
      boolean bool = isAlphaNum7BitString((String)localObject);
      if (bool) {
        localObject = Collections.singletonList(PDFStringUtil.asBytes(this.passwordString));
      } else {
        localObject = generatePossiblePasswordBytes(this.passwordString);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\decrypt\PDFPassword.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */