package com.sun.pdfview;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class PDFStringUtil
{
  static final char[] PDF_DOC_ENCODING_MAP;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    int n = (char)-3;
    char[] arrayOfChar = new char['Ā'];
    arrayOfChar[m] = m;
    arrayOfChar[k] = k;
    arrayOfChar[j] = j;
    arrayOfChar[i] = i;
    arrayOfChar[5] = '\005';
    arrayOfChar[6] = '\006';
    arrayOfChar[7] = '\007';
    arrayOfChar[8] = '\b';
    arrayOfChar[9] = '\t';
    arrayOfChar[10] = '\n';
    arrayOfChar[11] = '\013';
    arrayOfChar[12] = '\f';
    arrayOfChar[13] = '\r';
    arrayOfChar[14] = '\016';
    arrayOfChar[15] = '\017';
    arrayOfChar[16] = '\020';
    arrayOfChar[17] = '\021';
    arrayOfChar[18] = '\022';
    arrayOfChar[19] = '\023';
    arrayOfChar[20] = '\024';
    arrayOfChar[21] = '\025';
    arrayOfChar[22] = '\026';
    arrayOfChar[23] = '\027';
    arrayOfChar[24] = '˘';
    arrayOfChar[25] = 'ˇ';
    arrayOfChar[26] = 'ˆ';
    arrayOfChar[27] = '˙';
    arrayOfChar[28] = '˝';
    arrayOfChar[29] = '˛';
    arrayOfChar[30] = '˚';
    arrayOfChar[31] = '˜';
    arrayOfChar[32] = ' ';
    arrayOfChar[33] = '!';
    arrayOfChar[34] = '"';
    arrayOfChar[35] = '#';
    arrayOfChar[36] = '$';
    arrayOfChar[37] = '%';
    arrayOfChar[38] = '&';
    arrayOfChar[39] = '\'';
    arrayOfChar[40] = '(';
    arrayOfChar[41] = ')';
    arrayOfChar[42] = '*';
    arrayOfChar[43] = '+';
    arrayOfChar[44] = ',';
    arrayOfChar[45] = '-';
    arrayOfChar[46] = '.';
    arrayOfChar[47] = '/';
    arrayOfChar[48] = '0';
    arrayOfChar[49] = '1';
    arrayOfChar[50] = '2';
    arrayOfChar[51] = '3';
    arrayOfChar[52] = '4';
    arrayOfChar[53] = '5';
    arrayOfChar[54] = '6';
    arrayOfChar[55] = '7';
    arrayOfChar[56] = '8';
    arrayOfChar[57] = '9';
    arrayOfChar[58] = ':';
    arrayOfChar[59] = ';';
    arrayOfChar[60] = '<';
    arrayOfChar[61] = '=';
    arrayOfChar[62] = '>';
    arrayOfChar[63] = '?';
    arrayOfChar[64] = '@';
    arrayOfChar[65] = 'A';
    arrayOfChar[66] = 'B';
    arrayOfChar[67] = 'C';
    arrayOfChar[68] = 'D';
    arrayOfChar[69] = 'E';
    arrayOfChar[70] = 'F';
    arrayOfChar[71] = 'G';
    arrayOfChar[72] = 'H';
    arrayOfChar[73] = 'I';
    arrayOfChar[74] = 'J';
    arrayOfChar[75] = 'K';
    arrayOfChar[76] = 'L';
    arrayOfChar[77] = 'M';
    arrayOfChar[78] = 'N';
    arrayOfChar[79] = 'O';
    arrayOfChar[80] = 'P';
    arrayOfChar[81] = 'Q';
    arrayOfChar[82] = 'R';
    arrayOfChar[83] = 'S';
    arrayOfChar[84] = 'T';
    arrayOfChar[85] = 'U';
    arrayOfChar[86] = 'V';
    arrayOfChar[87] = 'W';
    arrayOfChar[88] = 'X';
    arrayOfChar[89] = 'Y';
    arrayOfChar[90] = 'Z';
    arrayOfChar[91] = '[';
    arrayOfChar[92] = '\\';
    arrayOfChar[93] = ']';
    arrayOfChar[94] = '^';
    arrayOfChar[95] = '_';
    arrayOfChar[96] = '`';
    arrayOfChar[97] = 'a';
    arrayOfChar[98] = 'b';
    arrayOfChar[99] = 'c';
    arrayOfChar[100] = 'd';
    arrayOfChar[101] = 'e';
    arrayOfChar[102] = 'f';
    arrayOfChar[103] = 'g';
    arrayOfChar[104] = 'h';
    arrayOfChar[105] = 'i';
    arrayOfChar[106] = 'j';
    arrayOfChar[107] = 'k';
    arrayOfChar[108] = 'l';
    arrayOfChar[109] = 'm';
    arrayOfChar[110] = 'n';
    arrayOfChar[111] = 'o';
    arrayOfChar[112] = 'p';
    arrayOfChar[113] = 'q';
    arrayOfChar[114] = 'r';
    arrayOfChar[115] = 's';
    arrayOfChar[116] = 't';
    arrayOfChar[117] = 'u';
    arrayOfChar[118] = 'v';
    arrayOfChar[119] = 'w';
    arrayOfChar[120] = 'x';
    arrayOfChar[121] = 'y';
    arrayOfChar[122] = 'z';
    arrayOfChar[123] = '{';
    arrayOfChar[124] = '|';
    arrayOfChar[125] = '}';
    arrayOfChar[126] = '~';
    arrayOfChar[127] = n;
    arrayOfChar[''] = '•';
    arrayOfChar[''] = '†';
    arrayOfChar[''] = '‡';
    arrayOfChar[''] = '…';
    arrayOfChar[''] = '—';
    arrayOfChar[''] = '–';
    arrayOfChar[''] = 'ƒ';
    arrayOfChar[''] = '⁄';
    arrayOfChar[''] = '‹';
    arrayOfChar[''] = '›';
    arrayOfChar[''] = '−';
    arrayOfChar[''] = '‰';
    arrayOfChar[''] = '„';
    arrayOfChar[''] = '“';
    arrayOfChar[''] = '”';
    arrayOfChar[''] = '‘';
    arrayOfChar[''] = '’';
    arrayOfChar[''] = '‚';
    arrayOfChar[''] = '™';
    arrayOfChar[''] = 64257;
    arrayOfChar[''] = 64258;
    arrayOfChar[''] = 'Ł';
    arrayOfChar[''] = 'Œ';
    arrayOfChar[''] = 'Š';
    arrayOfChar[''] = 'Ÿ';
    arrayOfChar[''] = 'Ž';
    arrayOfChar[''] = 'ı';
    arrayOfChar[''] = 'ł';
    arrayOfChar[''] = 'œ';
    arrayOfChar[''] = 'š';
    arrayOfChar[''] = 'ž';
    arrayOfChar[''] = n;
    arrayOfChar[' '] = '€';
    arrayOfChar['¡'] = '¡';
    arrayOfChar['¢'] = '¢';
    arrayOfChar['£'] = '£';
    arrayOfChar['¤'] = '¤';
    arrayOfChar['¥'] = '¥';
    arrayOfChar['¦'] = '¦';
    arrayOfChar['§'] = '§';
    arrayOfChar['¨'] = '¨';
    arrayOfChar['©'] = '©';
    arrayOfChar['ª'] = 'ª';
    arrayOfChar['«'] = '«';
    arrayOfChar['¬'] = '¬';
    arrayOfChar['­'] = n;
    arrayOfChar['®'] = '®';
    arrayOfChar['¯'] = '¯';
    arrayOfChar['°'] = '°';
    arrayOfChar['±'] = '±';
    arrayOfChar['²'] = '²';
    arrayOfChar['³'] = '³';
    arrayOfChar['´'] = '´';
    arrayOfChar['µ'] = 'µ';
    arrayOfChar['¶'] = '¶';
    arrayOfChar['·'] = '·';
    arrayOfChar['¸'] = '¸';
    arrayOfChar['¹'] = '¹';
    arrayOfChar['º'] = 'º';
    arrayOfChar['»'] = '»';
    arrayOfChar['¼'] = '¼';
    arrayOfChar['½'] = '½';
    arrayOfChar['¾'] = '¾';
    arrayOfChar['¿'] = '¿';
    arrayOfChar['À'] = 'À';
    arrayOfChar['Á'] = 'Á';
    arrayOfChar['Â'] = 'Â';
    arrayOfChar['Ã'] = 'Ã';
    arrayOfChar['Ä'] = 'Ä';
    arrayOfChar['Å'] = 'Å';
    arrayOfChar['Æ'] = 'Æ';
    arrayOfChar['Ç'] = 'Ç';
    arrayOfChar['È'] = 'È';
    arrayOfChar['É'] = 'É';
    arrayOfChar['Ê'] = 'Ê';
    arrayOfChar['Ë'] = 'Ë';
    arrayOfChar['Ì'] = 'Ì';
    arrayOfChar['Í'] = 'Í';
    arrayOfChar['Î'] = 'Î';
    arrayOfChar['Ï'] = 'Ï';
    arrayOfChar['Ð'] = 'Ð';
    arrayOfChar['Ñ'] = 'Ñ';
    arrayOfChar['Ò'] = 'Ò';
    arrayOfChar['Ó'] = 'Ó';
    arrayOfChar['Ô'] = 'Ô';
    arrayOfChar['Õ'] = 'Õ';
    arrayOfChar['Ö'] = 'Ö';
    arrayOfChar['×'] = '×';
    arrayOfChar['Ø'] = 'Ø';
    arrayOfChar['Ù'] = 'Ù';
    arrayOfChar['Ú'] = 'Ú';
    arrayOfChar['Û'] = 'Û';
    arrayOfChar['Ü'] = 'Ü';
    arrayOfChar['Ý'] = 'Ý';
    arrayOfChar['Þ'] = 'Þ';
    arrayOfChar['ß'] = 'ß';
    arrayOfChar['à'] = 'à';
    arrayOfChar['á'] = 'á';
    arrayOfChar['â'] = 'â';
    arrayOfChar['ã'] = 'ã';
    arrayOfChar['ä'] = 'ä';
    arrayOfChar['å'] = 'å';
    arrayOfChar['æ'] = 'æ';
    arrayOfChar['ç'] = 'ç';
    arrayOfChar['è'] = 'è';
    arrayOfChar['é'] = 'é';
    arrayOfChar['ê'] = 'ê';
    arrayOfChar['ë'] = 'ë';
    arrayOfChar['ì'] = 'ì';
    arrayOfChar['í'] = 'í';
    arrayOfChar['î'] = 'î';
    arrayOfChar['ï'] = 'ï';
    arrayOfChar['ð'] = 'ð';
    arrayOfChar['ñ'] = 'ñ';
    arrayOfChar['ò'] = 'ò';
    arrayOfChar['ó'] = 'ó';
    arrayOfChar['ô'] = 'ô';
    arrayOfChar['õ'] = 'õ';
    arrayOfChar['ö'] = 'ö';
    arrayOfChar['÷'] = '÷';
    arrayOfChar['ø'] = 'ø';
    arrayOfChar['ù'] = 'ù';
    arrayOfChar['ú'] = 'ú';
    arrayOfChar['û'] = 'û';
    arrayOfChar['ü'] = 'ü';
    arrayOfChar['ý'] = 'ý';
    arrayOfChar['þ'] = 'þ';
    arrayOfChar['ÿ'] = 'ÿ';
    PDF_DOC_ENCODING_MAP = arrayOfChar;
  }
  
  public static String asBasicString(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    return asBasicString(paramArrayOfByte, 0, i);
  }
  
  public static String asBasicString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    char[] arrayOfChar = new char[paramInt2];
    int i = 0;
    String str = null;
    for (;;)
    {
      int j = arrayOfChar.length;
      if (i >= j)
      {
        str = new java/lang/String;
        str.<init>(arrayOfChar);
        return str;
      }
      j = i + paramInt1;
      j = (char)paramArrayOfByte[j];
      arrayOfChar[i] = j;
      i += 1;
    }
  }
  
  public static byte[] asBytes(String paramString)
  {
    byte[] arrayOfByte = new byte[paramString.length()];
    int i = 0;
    for (;;)
    {
      int j = arrayOfByte.length;
      if (i >= j) {
        return arrayOfByte;
      }
      j = (byte)paramString.charAt(i);
      arrayOfByte[i] = j;
      i += 1;
    }
  }
  
  public static String asPDFDocEncoded(String paramString)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    int i = paramString.length();
    localStringBuilder.<init>(i);
    i = 0;
    for (;;)
    {
      int j = paramString.length();
      if (i >= j) {
        return localStringBuilder.toString();
      }
      char[] arrayOfChar = PDF_DOC_ENCODING_MAP;
      int k = paramString.charAt(i) & 0xFF;
      j = arrayOfChar[k];
      localStringBuilder.append(j);
      i += 1;
    }
  }
  
  public static String asTextString(String paramString)
  {
    int i;
    String str;
    if (paramString == null)
    {
      i = 0;
      str = null;
    }
    for (;;)
    {
      return str;
      i = paramString.length();
      int j = 2;
      if (i >= j)
      {
        str = null;
        i = paramString.charAt(0);
        j = 254;
        if (i == j)
        {
          i = paramString.charAt(1);
          j = 255;
          if (i == j)
          {
            str = asUTF16BEEncoded(paramString);
            continue;
          }
        }
      }
      str = asPDFDocEncoded(paramString);
    }
  }
  
  public static String asUTF16BEEncoded(String paramString)
  {
    try
    {
      String str1 = new java/lang/String;
      byte[] arrayOfByte = asBytes(paramString);
      int i = 2;
      int j = paramString.length() + -2;
      String str2 = "UTF-16BE";
      str1.<init>(arrayOfByte, i, j, str2);
      return str1;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("No UTF-16BE charset!");
      throw localRuntimeException;
    }
  }
  
  public byte[] toPDFDocEncoded(String paramString)
  {
    PDFDocCharsetEncoder localPDFDocCharsetEncoder = new com/sun/pdfview/PDFDocCharsetEncoder;
    localPDFDocCharsetEncoder.<init>();
    CharBuffer localCharBuffer = CharBuffer.wrap(paramString);
    return localPDFDocCharsetEncoder.encode(localCharBuffer).array();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFStringUtil.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */