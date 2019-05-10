package com.sun.pdfview;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RectF;
import android.util.Log;
import c.a.a.d.c;
import com.sun.pdfview.colorspace.PDFColorSpace;
import com.sun.pdfview.font.PDFFont;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

public class PDFParser
  extends BaseWatchable
{
  public static final String DEBUG_DCTDECODE_DATA = "debugdctdecode";
  static final int PDF_CMDS_RANGE1_MAX = Integer.MAX_VALUE;
  static final int PDF_CMDS_RANGE1_MIN = 1;
  static final int PDF_CMDS_RANGE2_MAX = 0;
  static final int PDF_CMDS_RANGE2_MIN = 0;
  static final int PDF_CMDS_RANGE3_MAX = 0;
  static final int PDF_CMDS_RANGE3_MIN = 0;
  static final boolean RELEASE = true;
  private static final String TAG = "ANDPDF.pdfparser";
  public static int debuglevel = -1;
  private boolean catchexceptions;
  private int clip;
  private int cmdCnt;
  private PDFPage cmds;
  boolean errorwritten = false;
  private int loc;
  private c pageRef;
  private Stack parserStates;
  private Path path;
  private boolean resend = false;
  HashMap resources;
  private Stack stack;
  private PDFParser.ParserState state;
  byte[] stream;
  private PDFParser.Tok tok;
  
  public PDFParser(PDFPage paramPDFPage, byte[] paramArrayOfByte, HashMap paramHashMap)
  {
    Object localObject = new c/a/a/d/c;
    ((c)localObject).<init>(paramPDFPage);
    this.pageRef = ((c)localObject);
    this.resources = paramHashMap;
    if (paramHashMap == null)
    {
      localObject = new java/util/HashMap;
      ((HashMap)localObject).<init>();
      this.resources = ((HashMap)localObject);
    }
    this.stream = paramArrayOfByte;
    this.cmdCnt = 0;
  }
  
  public static void debug(String paramString, int paramInt)
  {
    int i = debuglevel;
    if (paramInt > i)
    {
      PrintStream localPrintStream = System.out;
      String str = escape(paramString);
      localPrintStream.println(str);
    }
  }
  
  private void doForm(PDFObject paramPDFObject)
  {
    int i = 1;
    Object localObject1 = null;
    Object localObject2 = (PDFPage)paramPDFObject.getCache();
    Object localObject3;
    PDFObject localPDFObject1;
    float f1;
    if (localObject2 == null)
    {
      localObject2 = "Matrix";
      localObject3 = paramPDFObject.getDictRef((String)localObject2);
      if (localObject3 == null)
      {
        localObject2 = new android/graphics/Matrix;
        ((Matrix)localObject2).<init>();
        localObject3 = paramPDFObject.getDictRef("BBox");
        localObject4 = new android/graphics/RectF;
        localPDFObject1 = ((PDFObject)localObject3).getAt(0);
        f1 = localPDFObject1.getFloatValue();
        PDFObject localPDFObject2 = ((PDFObject)localObject3).getAt(i);
        float f2 = localPDFObject2.getFloatValue();
        int j = 2;
        PDFObject localPDFObject3 = ((PDFObject)localObject3).getAt(j);
        float f3 = localPDFObject3.getFloatValue();
        int k = 3;
        float f4 = ((PDFObject)localObject3).getAt(k).getFloatValue();
        ((RectF)localObject4).<init>(f1, f2, f3, f4);
        localObject3 = new com/sun/pdfview/PDFPage;
        ((PDFPage)localObject3).<init>((RectF)localObject4, 0);
        ((PDFPage)localObject3).addXform((Matrix)localObject2);
        localObject2 = new java/util/HashMap;
        localObject1 = this.resources;
        ((HashMap)localObject2).<init>((Map)localObject1);
        localObject1 = paramPDFObject.getDictRef("Resources");
        if (localObject1 != null)
        {
          localObject1 = ((PDFObject)localObject1).getDictionary();
          ((HashMap)localObject2).putAll((Map)localObject1);
        }
        localObject1 = new com/sun/pdfview/PDFParser;
        localObject4 = paramPDFObject.getStream();
        ((PDFParser)localObject1).<init>((PDFPage)localObject3, (byte[])localObject4, (HashMap)localObject2);
        ((PDFParser)localObject1).go(i);
        paramPDFObject.setCache(localObject3);
        localObject2 = localObject3;
      }
    }
    else
    {
      this.cmds.addPush();
      this.cmds.addCommands((PDFPage)localObject2);
      this.cmds.addPop();
      return;
    }
    Object localObject4 = new float[6];
    int m = 0;
    localObject2 = null;
    for (;;)
    {
      int n = localObject4.length;
      if (m >= n)
      {
        localObject2 = new android/graphics/Matrix;
        ((Matrix)localObject2).<init>();
        c.a.a.e.b.a((Matrix)localObject2, (float[])localObject4);
        break;
      }
      localPDFObject1 = ((PDFObject)localObject3).getAt(m);
      f1 = localPDFObject1.getFloatValue();
      localObject4[m] = f1;
      m += 1;
    }
  }
  
  private void doImage(PDFObject paramPDFObject)
  {
    PDFPage localPDFPage = this.cmds;
    Object localObject = this.resources;
    localObject = PDFImage.createImage(paramPDFObject, (Map)localObject);
    localPDFPage.addImage((PDFImage)localObject);
  }
  
  private void doShader(PDFObject paramPDFObject) {}
  
  private void doXObject(PDFObject paramPDFObject)
  {
    String str = paramPDFObject.getDictRef("Subtype").getStringValue();
    if (str == null) {
      str = paramPDFObject.getDictRef("S").getStringValue();
    }
    Object localObject = "Image";
    boolean bool = str.equals(localObject);
    if (bool) {
      doImage(paramPDFObject);
    }
    for (;;)
    {
      return;
      localObject = "Form";
      bool = str.equals(localObject);
      if (!bool) {
        break;
      }
      doForm(paramPDFObject);
    }
    localObject = new com/sun/pdfview/PDFParseException;
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>("Unknown XObject subtype: ");
    str = str;
    ((PDFParseException)localObject).<init>(str);
    throw ((Throwable)localObject);
  }
  
  private String dump(Stack paramStack)
  {
    if (paramStack == null) {}
    for (Object localObject1 = "<null>";; localObject1 = "[]")
    {
      return (String)localObject1;
      int i = paramStack.size();
      if (i != 0) {
        break;
      }
    }
    String str = "";
    localObject1 = "[";
    Iterator localIterator = paramStack.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool)
      {
        localObject1 = new java/lang/StringBuilder;
        str = String.valueOf(str);
        ((StringBuilder)localObject1).<init>(str);
        str = "]";
        localObject1 = str;
        break;
      }
      Object localObject2 = localIterator.next();
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      str = String.valueOf(str);
      localStringBuilder.<init>(str);
      localObject1 = localStringBuilder.append((String)localObject1);
      str = dumpObj(localObject2);
      str = str;
      localObject1 = ",";
    }
  }
  
  private String dumpArray(Object[] paramArrayOfObject)
  {
    if (paramArrayOfObject == null) {}
    for (Object localObject1 = "<null>";; localObject1 = "[]")
    {
      return (String)localObject1;
      i = paramArrayOfObject.length;
      if (i != 0) {
        break;
      }
    }
    String str = "";
    Object localObject2 = "[";
    int j = paramArrayOfObject.length;
    int i = 0;
    localObject1 = null;
    for (;;)
    {
      if (i >= j)
      {
        localObject1 = new java/lang/StringBuilder;
        localObject2 = String.valueOf(str);
        ((StringBuilder)localObject1).<init>((String)localObject2);
        localObject2 = "]";
        localObject1 = (String)localObject2;
        break;
      }
      Object localObject3 = paramArrayOfObject[i];
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      str = String.valueOf(str);
      localStringBuilder.<init>(str);
      localObject2 = localStringBuilder.append((String)localObject2);
      str = dumpObj(localObject3);
      str = str;
      localObject2 = ",";
      i += 1;
    }
  }
  
  private String dumpObj(Object paramObject)
  {
    String str;
    if (paramObject == null) {
      str = "<null>";
    }
    for (;;)
    {
      return str;
      boolean bool = paramObject instanceof Object[];
      if (bool)
      {
        paramObject = (Object[])paramObject;
        str = dumpArray((Object[])paramObject);
      }
      else
      {
        str = paramObject.toString();
      }
    }
  }
  
  public static void emitDataFile(byte[] paramArrayOfByte, String paramString)
  {
    Object localObject = "DateFile";
    try
    {
      localObject = File.createTempFile((String)localObject, paramString);
      FileOutputStream localFileOutputStream = new java/io/FileOutputStream;
      localFileOutputStream.<init>((File)localObject);
      PrintStream localPrintStream = System.out;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      String str = "Write: ";
      localStringBuilder.<init>(str);
      localObject = ((File)localObject).getPath();
      localObject = localStringBuilder.append((String)localObject);
      localObject = ((StringBuilder)localObject).toString();
      localPrintStream.println((String)localObject);
      localFileOutputStream.write(paramArrayOfByte);
      localFileOutputStream.close();
      return;
    }
    catch (IOException localIOException)
    {
      for (;;) {}
    }
  }
  
  public static String escape(String paramString)
  {
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramString.length();
      if (i >= j) {
        return localStringBuffer.toString();
      }
      j = paramString.charAt(i);
      int k = 10;
      if (j != k)
      {
        int m = 32;
        if (j >= m)
        {
          int n = 127;
          if (j < n) {}
        }
        else
        {
          j = 63;
        }
      }
      localStringBuffer.append(j);
      i += 1;
    }
  }
  
  private PDFObject findResource(String paramString1, String paramString2)
  {
    if (paramString2 != null)
    {
      localObject1 = (PDFObject)this.resources.get(paramString2);
      if (localObject1 != null)
      {
        int i = ((PDFObject)localObject1).getType();
        int j = 6;
        if (i == j) {}
      }
      else
      {
        localObject1 = new com/sun/pdfview/PDFParseException;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>("No dictionary called ");
        localObject2 = paramString2 + " found in the resources";
        ((PDFParseException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    for (Object localObject1 = ((PDFObject)localObject1).getDictRef(paramString1);; localObject1 = (PDFObject)this.resources.get(paramString1)) {
      return (PDFObject)localObject1;
    }
  }
  
  private PDFFont getFontFrom(String paramString)
  {
    PDFObject localPDFObject = findResource(paramString, "Font");
    HashMap localHashMap = this.resources;
    return PDFFont.getFont(localPDFObject, localHashMap);
  }
  
  private PDFParser.Tok nextToken()
  {
    int i = 62;
    int j = 10;
    int k = 7;
    Object localObject1 = this.stream;
    int m = localObject1.length;
    boolean bool1 = this.resend;
    if (bool1)
    {
      this.resend = false;
      localObject1 = this.tok;
      return (PDFParser.Tok)localObject1;
    }
    localObject1 = new com/sun/pdfview/PDFParser$Tok;
    ((PDFParser.Tok)localObject1).<init>();
    this.tok = ((PDFParser.Tok)localObject1);
    for (;;)
    {
      int n = this.loc;
      if (n < m)
      {
        localObject1 = this.stream;
        i3 = this.loc;
        boolean bool2 = PDFFile.isWhiteSpace(localObject1[i3]);
        if (bool2) {}
      }
      else
      {
        i1 = this.loc;
        if (i1 < m) {
          break label156;
        }
        localObject1 = this.tok;
        m = -1;
        ((PDFParser.Tok)localObject1).type = m;
        localObject1 = this.tok;
        break;
      }
      i1 = this.loc + 1;
      this.loc = i1;
    }
    label156:
    localObject1 = this.stream;
    int i3 = this.loc;
    int i6 = i3 + 1;
    this.loc = i6;
    int i1 = localObject1[i3];
    i3 = 37;
    Object localObject2;
    int i4;
    if (i1 != i3) {
      switch (i1)
      {
      default: 
        if (i1 == i)
        {
          localObject2 = this.stream;
          i4 = this.loc;
          i6 = i4 + 1;
          this.loc = i6;
          m = localObject2[i4];
          if (m == i)
          {
            localObject1 = this.tok;
            ((PDFParser.Tok)localObject1).type = j;
          }
        }
        break;
      }
    }
    for (;;)
    {
      localObject1 = this.tok;
      break;
      Object localObject3 = new java/lang/StringBuffer;
      ((StringBuffer)localObject3).<init>();
      for (;;)
      {
        i6 = this.loc;
        if ((i6 >= m) || (i1 == j))
        {
          i4 = this.loc;
          if (i4 >= m) {
            break;
          }
          localObject1 = this.stream;
          i4 = this.loc;
          i6 = i4 + 1;
          this.loc = i6;
          i1 = localObject1[i4];
          i4 = 13;
          if (i1 != i4) {
            break;
          }
          localObject1 = this.stream;
          i5 = this.loc;
          i6 = i5 + 1;
          this.loc = i6;
          i1 = localObject1[i5];
          break;
        }
        i1 = (char)i1;
        ((StringBuffer)localObject3).append(i1);
        localObject1 = this.stream;
        i6 = this.loc;
        int i7 = i6 + 1;
        this.loc = i7;
        i2 = localObject1[i6];
      }
      localObject1 = this.tok;
      m = 9;
      ((PDFParser.Tok)localObject1).type = m;
      continue;
      localObject1 = this.tok;
      m = 8;
      ((PDFParser.Tok)localObject1).type = m;
      continue;
      this.tok.type = k;
      localObject1 = this.tok;
      localObject2 = readString();
      ((PDFParser.Tok)localObject1).name = ((String)localObject2);
      continue;
      localObject1 = this.tok;
      m = 5;
      ((PDFParser.Tok)localObject1).type = m;
      continue;
      localObject1 = this.tok;
      m = 4;
      ((PDFParser.Tok)localObject1).type = m;
      continue;
      localObject1 = this.stream;
      m = this.loc;
      int i5 = m + 1;
      this.loc = i5;
      int i2 = localObject1[m];
      m = 60;
      if (i2 == m)
      {
        localObject1 = this.tok;
        m = 11;
        ((PDFParser.Tok)localObject1).type = m;
      }
      else
      {
        i2 = this.loc + -1;
        this.loc = i2;
        this.tok.type = k;
        localObject1 = this.tok;
        localObject2 = readByteArray();
        ((PDFParser.Tok)localObject1).name = ((String)localObject2);
        continue;
        localObject1 = this.tok;
        m = 1;
        ((PDFParser.Tok)localObject1).type = m;
        localObject1 = this.tok;
        localObject2 = readName();
        ((PDFParser.Tok)localObject1).name = ((String)localObject2);
        continue;
        i2 = this.loc + -1;
        this.loc = i2;
        localObject1 = this.tok;
        m = 3;
        ((PDFParser.Tok)localObject1).type = m;
        localObject1 = this.tok;
        double d = readNum();
        ((PDFParser.Tok)localObject1).value = d;
        continue;
        m = 97;
        if (i2 >= m)
        {
          m = 122;
          if (i2 <= m) {}
        }
        else
        {
          m = 65;
          if (i2 >= m)
          {
            m = 90;
            if (i2 <= m) {}
          }
          else
          {
            m = 39;
            if (i2 != m)
            {
              m = 34;
              if (i2 != m) {
                break label1015;
              }
            }
          }
        }
        i2 = this.loc + -1;
        this.loc = i2;
        localObject1 = this.tok;
        m = 2;
        ((PDFParser.Tok)localObject1).type = m;
        localObject1 = this.tok;
        localObject2 = readName();
        ((PDFParser.Tok)localObject1).name = ((String)localObject2);
        continue;
        label1015:
        localObject2 = System.out;
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("Encountered character: ");
        localObject3 = ((StringBuilder)localObject3).append(i2);
        String str = " (";
        localObject3 = ((StringBuilder)localObject3).append(str);
        i2 = (char)i2;
        localObject1 = ((StringBuilder)localObject3).append(i2);
        localObject3 = ")";
        localObject1 = (String)localObject3;
        ((PrintStream)localObject2).println((String)localObject1);
        localObject1 = this.tok;
        ((PDFParser.Tok)localObject1).type = 0;
      }
    }
  }
  
  private PDFColorSpace parseColorSpace(PDFObject paramPDFObject)
  {
    if (paramPDFObject == null) {}
    for (Object localObject = this.state.fillCS;; localObject = PDFColorSpace.getColorSpace(paramPDFObject, (Map)localObject))
    {
      return (PDFColorSpace)localObject;
      localObject = this.resources;
    }
  }
  
  private void parseInlineImage()
  {
    int i = 2;
    int j = 1;
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    Object localObject2 = nextToken();
    int k = ((PDFParser.Tok)localObject2).type;
    Object localObject3;
    Object localObject4;
    int i3;
    int i4;
    if (k == i)
    {
      localObject3 = ((PDFParser.Tok)localObject2).name;
      localObject4 = "ID";
      boolean bool1 = ((String)localObject3).equals(localObject4);
      if (bool1)
      {
        localObject2 = this.stream;
        int m = this.loc;
        int i2 = localObject2[m];
        m = 13;
        if (i2 == m)
        {
          i2 = this.loc + 1;
          this.loc = i2;
        }
        localObject2 = this.stream;
        m = this.loc;
        i2 = localObject2[m];
        m = 10;
        if (i2 != m)
        {
          localObject2 = this.stream;
          m = this.loc;
          i2 = localObject2[m];
          m = 32;
          if (i2 != m) {}
        }
        else
        {
          i2 = this.loc + 1;
          this.loc = i2;
        }
        localObject2 = (PDFObject)((HashMap)localObject1).get("ImageMask");
        if (localObject2 != null)
        {
          boolean bool4 = ((PDFObject)localObject2).getBooleanValue();
          if (bool4)
          {
            localObject3 = new Double[i];
            localObject2 = new java/lang/Double;
            ((Double)localObject2).<init>(0.0D);
            localObject3[0] = localObject2;
            localObject2 = new java/lang/Double;
            double d = 1.0D;
            ((Double)localObject2).<init>(d);
            localObject3[j] = localObject2;
            localObject2 = (PDFObject)((HashMap)localObject1).get("Decode");
            if (localObject2 != null)
            {
              localObject4 = new java/lang/Double;
              PDFObject localPDFObject = ((PDFObject)localObject2).getAt(0);
              d = localPDFObject.getDoubleValue();
              ((Double)localObject4).<init>(d);
              localObject3[0] = localObject4;
              localObject4 = new java/lang/Double;
              localObject2 = ((PDFObject)localObject2).getAt(j);
              d = ((PDFObject)localObject2).getDoubleValue();
              ((Double)localObject4).<init>(d);
              localObject3[j] = localObject4;
            }
            localObject2 = "Decode";
            localObject4 = new com/sun/pdfview/PDFObject;
            ((PDFObject)localObject4).<init>(localObject3);
            ((HashMap)localObject1).put(localObject2, localObject4);
          }
        }
        localObject2 = new com/sun/pdfview/PDFObject;
        m = 0;
        localObject3 = null;
        i3 = 6;
        ((PDFObject)localObject2).<init>(null, i3, localObject1);
        i4 = this.loc;
      }
    }
    for (;;)
    {
      localObject3 = this.stream;
      i3 = this.loc;
      boolean bool2 = PDFFile.isWhiteSpace(localObject3[i3]);
      if (bool2)
      {
        localObject3 = this.stream;
        i3 = this.loc + 1;
        int n = localObject3[i3];
        i3 = 69;
        if (n == i3)
        {
          localObject3 = this.stream;
          i3 = this.loc + 2;
          n = localObject3[i3];
          i3 = 73;
          if (n == i3)
          {
            localObject3 = new byte[this.loc - i4];
            localObject4 = this.stream;
            i = this.loc - i4;
            System.arraycopy(localObject4, i4, localObject3, 0, i);
            localObject1 = c.a.a.b.b.d((byte[])localObject3);
            ((PDFObject)localObject2).setStream((c.a.a.b.b)localObject1);
            i4 = this.loc + 3;
            this.loc = i4;
            doImage((PDFObject)localObject2);
            return;
            localObject2 = ((PDFParser.Tok)localObject2).name;
            localObject3 = "BPC";
            boolean bool3 = ((String)localObject2).equals(localObject3);
            if (bool3) {
              localObject2 = "BitsPerComponent";
            }
            for (;;)
            {
              localObject3 = parseObject();
              localObject4 = new com/sun/pdfview/PDFObject;
              ((PDFObject)localObject4).<init>(localObject3);
              ((HashMap)localObject1).put(localObject2, localObject4);
              break;
              localObject3 = "CS";
              bool3 = ((String)localObject2).equals(localObject3);
              if (bool3)
              {
                localObject2 = "ColorSpace";
              }
              else
              {
                localObject3 = "D";
                bool3 = ((String)localObject2).equals(localObject3);
                if (bool3)
                {
                  localObject2 = "Decode";
                }
                else
                {
                  localObject3 = "DP";
                  bool3 = ((String)localObject2).equals(localObject3);
                  if (bool3)
                  {
                    localObject2 = "DecodeParms";
                  }
                  else
                  {
                    localObject3 = "F";
                    bool3 = ((String)localObject2).equals(localObject3);
                    if (bool3)
                    {
                      localObject2 = "Filter";
                    }
                    else
                    {
                      localObject3 = "H";
                      bool3 = ((String)localObject2).equals(localObject3);
                      if (bool3)
                      {
                        localObject2 = "Height";
                      }
                      else
                      {
                        localObject3 = "IM";
                        bool3 = ((String)localObject2).equals(localObject3);
                        if (bool3)
                        {
                          localObject2 = "ImageMask";
                        }
                        else
                        {
                          localObject3 = "W";
                          bool3 = ((String)localObject2).equals(localObject3);
                          if (bool3)
                          {
                            localObject2 = "Width";
                          }
                          else
                          {
                            localObject3 = "I";
                            bool3 = ((String)localObject2).equals(localObject3);
                            if (bool3) {
                              localObject2 = "Interpolate";
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
      int i1 = this.loc + 1;
      this.loc = i1;
    }
  }
  
  private Object parseObject()
  {
    int i = 0;
    Object localObject1 = null;
    Object localObject2 = nextToken();
    int j = ((PDFParser.Tok)localObject2).type;
    switch (j)
    {
    }
    for (;;)
    {
      return localObject1;
      localObject1 = new java/lang/Double;
      localObject2 = this.tok;
      double d = ((PDFParser.Tok)localObject2).value;
      ((Double)localObject1).<init>(d);
      continue;
      localObject2 = this.tok;
      localObject1 = ((PDFParser.Tok)localObject2).name;
      continue;
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      j = 0;
      Object localObject3 = null;
      for (;;)
      {
        localObject2 = parseObject();
        if (localObject2 == null)
        {
          localObject2 = this.tok;
          int k = ((PDFParser.Tok)localObject2).type;
          j = 10;
          if (k == j) {
            break;
          }
          localObject2 = new com/sun/pdfview/PDFParseException;
          ((PDFParseException)localObject2).<init>("Inline dict should have ended with '>>'");
          throw ((Throwable)localObject2);
        }
        if (localObject3 == null)
        {
          localObject2 = (String)localObject2;
          localObject3 = localObject2;
        }
        else
        {
          PDFObject localPDFObject = new com/sun/pdfview/PDFObject;
          localPDFObject.<init>(localObject2);
          localHashMap.put(localObject3, localPDFObject);
          j = 0;
          localObject3 = null;
        }
      }
      localObject1 = localHashMap;
      continue;
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      for (;;)
      {
        localObject3 = parseObject();
        if (localObject3 == null)
        {
          localObject3 = this.tok;
          j = ((PDFParser.Tok)localObject3).type;
          i = 8;
          if (j == i) {
            break;
          }
          localObject2 = new com/sun/pdfview/PDFParseException;
          ((PDFParseException)localObject2).<init>("Expected ']'");
          throw ((Throwable)localObject2);
        }
        ((ArrayList)localObject2).add(localObject3);
      }
      localObject1 = ((ArrayList)localObject2).toArray();
      continue;
      localObject1 = localObject2;
    }
  }
  
  private Object[] popArray()
  {
    Object localObject = this.stack.pop();
    boolean bool = localObject instanceof Object[];
    if (!bool)
    {
      PDFParseException localPDFParseException = new com/sun/pdfview/PDFParseException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("Expected an [array] here: ");
      localObject = localObject.toString();
      localObject = (String)localObject;
      localPDFParseException.<init>((String)localObject);
      throw localPDFParseException;
    }
    return (Object[])localObject;
  }
  
  private float popFloat()
  {
    Object localObject = this.stack.pop();
    boolean bool = localObject instanceof Double;
    if (bool) {
      return ((Double)localObject).floatValue();
    }
    localObject = new com/sun/pdfview/PDFParseException;
    ((PDFParseException)localObject).<init>("Expected a number here.");
    throw ((Throwable)localObject);
  }
  
  private float[] popFloat(int paramInt)
  {
    float[] arrayOfFloat = new float[paramInt];
    int i = paramInt + -1;
    for (;;)
    {
      if (i < 0) {
        return arrayOfFloat;
      }
      float f = popFloat();
      arrayOfFloat[i] = f;
      i += -1;
    }
  }
  
  private float[] popFloatArray()
  {
    Object localObject = this.stack.pop();
    boolean bool1 = localObject instanceof Object[];
    if (!bool1)
    {
      localObject = new com/sun/pdfview/PDFParseException;
      ((PDFParseException)localObject).<init>("Expected an [array] here.");
      throw ((Throwable)localObject);
    }
    localObject = (Object[])localObject;
    float[] arrayOfFloat = new float[localObject.length];
    bool1 = false;
    float f = 0.0F;
    Double localDouble = null;
    int j;
    for (int k = 0;; k = j)
    {
      int i = arrayOfFloat.length;
      if (k >= i) {
        return arrayOfFloat;
      }
      localDouble = localObject[k];
      boolean bool2 = localDouble instanceof Double;
      if (!bool2) {
        break;
      }
      localDouble = (Double)localObject[k];
      f = localDouble.floatValue();
      arrayOfFloat[k] = f;
      j = k + 1;
    }
    localObject = new com/sun/pdfview/PDFParseException;
    ((PDFParseException)localObject).<init>("This array doesn't consist only of floats.");
    throw ((Throwable)localObject);
  }
  
  private int popInt()
  {
    Object localObject = this.stack.pop();
    boolean bool = localObject instanceof Double;
    if (bool) {
      return ((Double)localObject).intValue();
    }
    localObject = new com/sun/pdfview/PDFParseException;
    ((PDFParseException)localObject).<init>("Expected a number here.");
    throw ((Throwable)localObject);
  }
  
  private PDFObject popObject()
  {
    Object localObject = this.stack.pop();
    boolean bool = localObject instanceof PDFObject;
    if (!bool)
    {
      PDFParseException localPDFParseException = new com/sun/pdfview/PDFParseException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("Expected a reference here: ");
      localObject = localObject.toString();
      localObject = (String)localObject;
      localPDFParseException.<init>((String)localObject);
      throw localPDFParseException;
    }
    return (PDFObject)localObject;
  }
  
  private String popString()
  {
    Object localObject = this.stack.pop();
    boolean bool = localObject instanceof String;
    if (!bool)
    {
      PDFParseException localPDFParseException = new com/sun/pdfview/PDFParseException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>("Expected string here: ");
      localObject = localObject.toString();
      localObject = (String)localObject;
      localPDFParseException.<init>((String)localObject);
      throw localPDFParseException;
    }
    return (String)localObject;
  }
  
  private void processBTCmd()
  {
    this.state.textFormat.reset();
  }
  
  private void processQCmd()
  {
    this.cmds.addPop();
    PDFParser.ParserState localParserState = (PDFParser.ParserState)this.parserStates.pop();
    this.state = localParserState;
  }
  
  private String readByteArray()
  {
    byte[] arrayOfByte = this.stream;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    int i = arrayOfByte.length;
    int j = 0;
    int m = 0;
    for (;;)
    {
      int n = this.loc;
      if (n < i)
      {
        n = this.loc;
        n = arrayOfByte[n];
        int i2 = 62;
        if (n != i2) {}
      }
      else
      {
        j = this.loc + 1;
        this.loc = j;
        return localStringBuffer.toString();
      }
      n = this.loc;
      n = (char)arrayOfByte[n];
      int i3 = 48;
      if (n >= i3)
      {
        int i4 = 57;
        if (n <= i4) {
          n = (byte)(n + -48);
        }
      }
      for (;;)
      {
        int i5 = m % 2;
        i5 = 1 - i5;
        n &= 0xF;
        int i6 = i5 << 2;
        n <<= i6;
        j = (char)(j | n);
        if (i5 == 0)
        {
          localStringBuffer.append(j);
          int k = 0;
        }
        m += 1;
        i1 = this.loc + 1;
        this.loc = i1;
        break;
        i5 = 97;
        if (i1 >= i5)
        {
          i5 = 102;
          if (i1 <= i5)
          {
            i1 = (byte)(i1 + -97 + 10);
            continue;
          }
        }
        i5 = 65;
        if (i1 < i5) {
          break label269;
        }
        i5 = 70;
        if (i1 > i5) {
          break label269;
        }
        i1 = (byte)(i1 + -65 + 10);
      }
      label269:
      int i1 = this.loc + 1;
      this.loc = i1;
    }
  }
  
  private String readName()
  {
    byte[] arrayOfByte = this.stream;
    int i = this.loc;
    for (;;)
    {
      int j = this.loc;
      int m = arrayOfByte.length;
      if (j < m)
      {
        j = this.loc;
        boolean bool = PDFFile.isRegularCharacter(arrayOfByte[j]);
        if (bool) {}
      }
      else
      {
        String str = new java/lang/String;
        m = this.loc - i;
        str.<init>(arrayOfByte, i, m);
        return str;
      }
      int k = this.loc + 1;
      this.loc = k;
    }
  }
  
  private double readNum()
  {
    byte[] arrayOfByte = this.stream;
    int i = this.loc;
    int j = i + 1;
    this.loc = j;
    j = arrayOfByte[i];
    i = 45;
    int k;
    int m;
    label47:
    double d1;
    label57:
    label78:
    double d2;
    label82:
    int n;
    int i1;
    int i2;
    if (j == i)
    {
      i = 1;
      k = i;
      i = 46;
      if (j != i) {
        break label157;
      }
      m = 1;
      if (m == 0) {
        break label163;
      }
      d1 = 0.1D;
      i = 48;
      if (j < i) {
        break label171;
      }
      i = 57;
      if (j > i) {
        break label171;
      }
      i = j + -48;
      d2 = i;
      n = this.loc;
      i1 = n + 1;
      this.loc = i1;
      n = arrayOfByte[n];
      i1 = 46;
      if (n != i1) {
        break label187;
      }
      if (m == 0) {
        break label176;
      }
      i2 = this.loc + -1;
    }
    for (this.loc = i2;; this.loc = i2)
    {
      if (k != 0) {
        d2 = -d2;
      }
      return d2;
      i = 0;
      k = 0;
      break;
      label157:
      m = 0;
      break label47;
      label163:
      d1 = 1.0D;
      break label57;
      label171:
      i = 0;
      break label78;
      label176:
      m = 1;
      d1 = 0.1D;
      break label82;
      label187:
      i1 = 48;
      if (n >= i1)
      {
        i1 = 57;
        if (n <= i1)
        {
          n += -48;
          if (m != 0)
          {
            d3 = n * d1;
            d2 += d3;
            d3 = 0.1D;
            d1 *= d3;
            break label82;
          }
          d2 *= 10.0D;
          double d3 = n;
          d2 += d3;
          break label82;
        }
      }
      i2 = this.loc + -1;
    }
  }
  
  private String readString()
  {
    int i = 56;
    int j = 48;
    byte[] arrayOfByte = this.stream;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    int k = arrayOfByte.length;
    int m = 0;
    int n = this.loc;
    if (n >= k) {}
    int i3;
    do
    {
      return localStringBuffer.toString();
      n = this.loc;
      int i2 = n + 1;
      this.loc = i2;
      n = arrayOfByte[n];
      i2 = 41;
      if (n != i2) {
        break;
      }
      i3 = m + -1;
    } while (m == 0);
    m = i3;
    for (;;)
    {
      n = (char)n;
      localStringBuffer.append(n);
      break;
      i3 = 40;
      if (n == i3)
      {
        m += 1;
      }
      else
      {
        int i4 = 92;
        if (n == i4)
        {
          int i1 = this.loc;
          int i5 = i1 + 1;
          this.loc = i5;
          i1 = arrayOfByte[i1];
          if ((i1 >= j) && (i1 < i))
          {
            i5 = 0;
            int i6 = i1;
            i1 = 0;
            for (;;)
            {
              if ((i6 >= j) && (i6 < i))
              {
                i7 = 3;
                if (i5 < i7) {}
              }
              else
              {
                i5 = this.loc + -1;
                this.loc = i5;
                break;
              }
              i6 = (i1 << 3) + i6 + -48;
              i1 = this.loc;
              int i7 = i1 + 1;
              this.loc = i7;
              i7 = arrayOfByte[i1];
              i5 += 1;
              i1 = i6;
              i6 = i7;
            }
          }
          i5 = 110;
          if (i1 == i5)
          {
            i1 = 10;
          }
          else
          {
            i5 = 114;
            if (i1 == i5)
            {
              i1 = 13;
            }
            else
            {
              i5 = 116;
              if (i1 == i5)
              {
                i1 = 9;
              }
              else
              {
                i5 = 98;
                if (i1 == i5)
                {
                  i1 = 8;
                }
                else
                {
                  i5 = 102;
                  if (i1 == i5) {
                    i1 = 12;
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static void setDebugLevel(int paramInt)
  {
    debuglevel = paramInt;
  }
  
  private void setGSState(String paramString)
  {
    int i = 1;
    int j = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    Object localObject2 = findResource(paramString, "ExtGState");
    Object localObject3 = ((PDFObject)localObject2).getDictRef("LW");
    Object localObject4;
    float f2;
    if (localObject3 != null)
    {
      localObject4 = this.cmds;
      f2 = ((PDFObject)localObject3).getFloatValue();
      ((PDFPage)localObject4).addStrokeWidth(f2);
    }
    localObject3 = ((PDFObject)localObject2).getDictRef("LC");
    int k;
    if (localObject3 != null)
    {
      localObject4 = this.cmds;
      k = ((PDFObject)localObject3).getIntValue();
      ((PDFPage)localObject4).addEndCap(k);
    }
    localObject3 = ((PDFObject)localObject2).getDictRef("LJ");
    if (localObject3 != null)
    {
      localObject4 = this.cmds;
      k = ((PDFObject)localObject3).getIntValue();
      ((PDFPage)localObject4).addLineJoin(k);
    }
    localObject3 = ((PDFObject)localObject2).getDictRef("Font");
    Object localObject5;
    if (localObject3 != null)
    {
      localObject4 = this.state.textFormat;
      localObject5 = ((PDFObject)localObject3).getAt(0).getStringValue();
      localObject5 = getFontFrom((String)localObject5);
      localObject3 = ((PDFObject)localObject3).getAt(i);
      f2 = ((PDFObject)localObject3).getFloatValue();
      ((PDFTextFormat)localObject4).setFont((PDFFont)localObject5, f2);
    }
    localObject3 = ((PDFObject)localObject2).getDictRef("ML");
    if (localObject3 != null)
    {
      localObject4 = this.cmds;
      f2 = ((PDFObject)localObject3).getFloatValue();
      ((PDFPage)localObject4).addMiterLimit(f2);
    }
    localObject3 = ((PDFObject)localObject2).getDictRef("D");
    if (localObject3 != null)
    {
      localObject4 = ((PDFObject)localObject3).getAt(0).getArray();
      int m = localObject4.length;
      localObject5 = new float[m];
    }
    for (;;)
    {
      int n = localObject4.length;
      if (j >= n)
      {
        localObject1 = this.cmds;
        localObject3 = ((PDFObject)localObject3).getAt(i);
        f2 = ((PDFObject)localObject3).getFloatValue();
        ((PDFPage)localObject1).addDash((float[])localObject5, f2);
        localObject1 = ((PDFObject)localObject2).getDictRef("CA");
        if (localObject1 != null)
        {
          localObject3 = this.cmds;
          f1 = ((PDFObject)localObject1).getFloatValue();
          ((PDFPage)localObject3).addStrokeAlpha(f1);
        }
        localObject1 = ((PDFObject)localObject2).getDictRef("ca");
        if (localObject1 != null)
        {
          localObject2 = this.cmds;
          f1 = ((PDFObject)localObject1).getFloatValue();
          ((PDFPage)localObject2).addFillAlpha(f1);
        }
        return;
      }
      Object localObject6 = localObject4[j];
      float f3 = ((PDFObject)localObject6).getFloatValue();
      localObject5[j] = f3;
      j += 1;
    }
  }
  
  private void throwback()
  {
    this.resend = true;
  }
  
  public void cleanup()
  {
    Object localObject = this.state;
    if (localObject != null)
    {
      localObject = this.state.textFormat;
      if (localObject != null)
      {
        localObject = this.state.textFormat;
        ((PDFTextFormat)localObject).flush();
      }
    }
    localObject = this.cmds;
    if (localObject != null)
    {
      localObject = this.cmds;
      ((PDFPage)localObject).finish();
    }
    this.stack = null;
    this.parserStates = null;
    this.state = null;
    this.path = null;
    this.cmds = null;
  }
  
  public String dumpStream()
  {
    String str = new java/lang/String;
    byte[] arrayOfByte = this.stream;
    str.<init>(arrayOfByte);
    return escape(str.replace('\r', '\n'));
  }
  
  public void dumpStreamToError()
  {
    boolean bool = this.errorwritten;
    if (bool) {}
    for (;;)
    {
      return;
      bool = true;
      this.errorwritten = bool;
      Object localObject1 = "PDFError";
      Object localObject2 = ".err";
      try
      {
        localObject1 = File.createTempFile((String)localObject1, (String)localObject2);
        localObject2 = new java/io/FileOutputStream;
        ((FileOutputStream)localObject2).<init>((File)localObject1);
        localObject1 = this.stream;
        ((FileOutputStream)localObject2).write((byte[])localObject1);
        ((FileOutputStream)localObject2).close();
      }
      catch (IOException localIOException) {}
    }
  }
  
  public int iterate()
  {
    int i = 4;
    float f1 = 5.6E-45F;
    int j = 2;
    float f2 = 2.8E-45F;
    int k = 1;
    float f3 = Float.MIN_VALUE;
    Object localObject1 = (PDFPage)this.pageRef.a();
    this.cmds = ((PDFPage)localObject1);
    localObject1 = this.cmds;
    Object localObject3;
    int m;
    if (localObject1 == null)
    {
      localObject1 = System.out;
      localObject3 = "Page gone.  Stopping";
      ((PrintStream)localObject1).println((String)localObject3);
      m = 5;
    }
    for (float f4 = 7.0E-45F;; f4 = 8.4E-45F)
    {
      return m;
      localObject1 = parseObject();
      if (localObject1 != null) {
        break;
      }
      m = 6;
    }
    int i1 = localObject1 instanceof PDFParser.Tok;
    String str;
    if (i1 != 0)
    {
      localObject1 = (PDFParser.Tok)localObject1;
      str = ((PDFParser.Tok)localObject1).name;
      try
      {
        m = str.length();
        if (m <= 0) {
          break label890;
        }
        m = 0;
        f4 = 0.0F;
        localObject1 = null;
        m = str.charAt(0);
        i1 = m;
        label157:
        m = str.length();
        if (m <= k) {
          break label902;
        }
        m = 1;
        f4 = Float.MIN_VALUE;
        m = str.charAt(m) << '\b';
        label190:
        int i2;
        i1 += m;
        m = str.length();
        if (m <= j) {
          break label914;
        }
        m = 2;
        f4 = 2.8E-45F;
        m = str.charAt(m) << '\020';
        label229:
        m += i2;
        switch (m)
        {
        default: 
          boolean bool = this.catchexceptions;
          if (!bool) {
            break label4356;
          }
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          label843:
          localObject3 = "ANDPDF.pdfparser";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>("cmd='");
          localObject4 = ((StringBuilder)localObject4).append(str).append(":");
          localObject5 = localException.getMessage();
          localObject4 = (String)localObject5;
          Log.e((String)localObject3, (String)localObject4, localException);
          continue;
          processQCmd();
          continue;
          int n = 6;
          f4 = 8.4E-45F;
          localObject2 = popFloat(n);
          localObject3 = new android/graphics/Matrix;
          ((Matrix)localObject3).<init>();
          c.a.a.e.b.a((Matrix)localObject3, (float[])localObject2);
          localObject2 = this.cmds;
          ((PDFPage)localObject2).addXform((Matrix)localObject3);
          continue;
          localObject2 = this.cmds;
          f5 = popFloat();
          ((PDFPage)localObject2).addStrokeWidth(f5);
          continue;
          localObject2 = this.cmds;
          i3 = popInt();
          ((PDFPage)localObject2).addEndCap(i3);
          continue;
          localObject2 = this.cmds;
          i3 = popInt();
          ((PDFPage)localObject2).addLineJoin(i3);
          continue;
          localObject2 = this.cmds;
          i3 = popInt();
          f5 = i3;
          ((PDFPage)localObject2).addMiterLimit(f5);
          continue;
          f4 = popFloat();
          localObject3 = popFloatArray();
          localObject4 = this.cmds;
          ((PDFPage)localObject4).addDash((float[])localObject3, f4);
          continue;
          popFloat();
          continue;
          localObject2 = popString();
          setGSState((String)localObject2);
          continue;
          f4 = popFloat();
          f5 = popFloat();
          localObject4 = this.path;
          ((Path)localObject4).moveTo(f5, f4);
          continue;
          f4 = popFloat();
          f5 = popFloat();
          localObject4 = this.path;
          ((Path)localObject4).lineTo(f5, f4);
          continue;
          n = 6;
          f4 = 8.4E-45F;
          arrayOfFloat = popFloat(n);
          localObject2 = this.path;
          i3 = 0;
          f5 = 0.0F;
          localObject3 = null;
          f5 = arrayOfFloat[0];
          k = 1;
          f3 = Float.MIN_VALUE;
          f3 = arrayOfFloat[k];
          j = 2;
          f2 = 2.8E-45F;
          f2 = arrayOfFloat[j];
          i4 = 3;
          f6 = 4.2E-45F;
          f6 = arrayOfFloat[i4];
          i5 = 4;
          f7 = 5.6E-45F;
          f7 = arrayOfFloat[i5];
          i6 = 5;
          f8 = arrayOfFloat[i6];
          ((Path)localObject2).cubicTo(f5, f3, f2, f6, f7, f8);
          continue;
          n = 4;
          f4 = 5.6E-45F;
          localObject2 = popFloat(n);
          localObject3 = this.path;
          k = 0;
          f3 = 0.0F;
          localObject4 = null;
          f3 = localObject2[0];
          j = 1;
          f2 = Float.MIN_VALUE;
          f2 = localObject2[j];
          i4 = 2;
          f6 = 2.8E-45F;
          f6 = localObject2[i4];
          i5 = 3;
          f7 = 4.2E-45F;
          f4 = localObject2[i5];
          ((Path)localObject3).quadTo(f3, f2, f6, f4);
          continue;
          n = 4;
          f4 = 5.6E-45F;
          arrayOfFloat = popFloat(n);
          localObject2 = this.path;
          i3 = 0;
          f5 = 0.0F;
          localObject3 = null;
          f5 = arrayOfFloat[0];
          k = 1;
          f3 = Float.MIN_VALUE;
          f3 = arrayOfFloat[k];
          j = 2;
          f2 = 2.8E-45F;
          f2 = arrayOfFloat[j];
          i4 = 3;
          f6 = 4.2E-45F;
          f6 = arrayOfFloat[i4];
          i5 = 2;
          f7 = 2.8E-45F;
          f7 = arrayOfFloat[i5];
          i6 = 3;
          f8 = arrayOfFloat[i6];
          ((Path)localObject2).cubicTo(f5, f3, f2, f6, f7, f8);
          continue;
          localObject2 = this.path;
          ((Path)localObject2).close();
          continue;
          n = 4;
          f4 = 5.6E-45F;
          localObject2 = popFloat(n);
          localObject3 = this.path;
          k = 0;
          f3 = 0.0F;
          localObject4 = null;
          f3 = localObject2[0];
          j = 1;
          f2 = Float.MIN_VALUE;
          f2 = localObject2[j];
          ((Path)localObject3).moveTo(f3, f2);
          localObject3 = this.path;
          k = 0;
          f3 = 0.0F;
          localObject4 = null;
          f3 = localObject2[0];
          j = 2;
          f2 = 2.8E-45F;
          f2 = localObject2[j];
          f3 += f2;
          j = 1;
          f2 = Float.MIN_VALUE;
          f2 = localObject2[j];
          ((Path)localObject3).lineTo(f3, f2);
          localObject3 = this.path;
          k = 0;
          f3 = 0.0F;
          localObject4 = null;
          f3 = localObject2[0];
          j = 2;
          f2 = 2.8E-45F;
          f2 = localObject2[j];
          f3 += f2;
          j = 1;
          f2 = Float.MIN_VALUE;
          f2 = localObject2[j];
          i4 = 3;
          f6 = 4.2E-45F;
          f6 = localObject2[i4];
          f2 += f6;
          ((Path)localObject3).lineTo(f3, f2);
          localObject3 = this.path;
          k = 0;
          f3 = 0.0F;
          localObject4 = null;
          f3 = localObject2[0];
          j = 1;
          f2 = Float.MIN_VALUE;
          f2 = localObject2[j];
          i4 = 3;
          f6 = 4.2E-45F;
          f4 = localObject2[i4] + f2;
          ((Path)localObject3).lineTo(f3, f4);
          localObject2 = this.path;
          ((Path)localObject2).close();
          continue;
          localObject2 = this.cmds;
          localObject3 = this.path;
          k = this.clip | 0x1;
          ((PDFPage)localObject2).addPath((Path)localObject3, k);
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.clip = 0;
          localObject2 = new android/graphics/Path;
          ((Path)localObject2).<init>();
          this.path = ((Path)localObject2);
          continue;
          localObject2 = this.path;
          ((Path)localObject2).close();
          localObject2 = this.cmds;
          localObject3 = this.path;
          k = this.clip | 0x1;
          ((PDFPage)localObject2).addPath((Path)localObject3, k);
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.clip = 0;
          localObject2 = new android/graphics/Path;
          ((Path)localObject2).<init>();
          this.path = ((Path)localObject2);
          continue;
          localObject2 = this.cmds;
          localObject3 = this.path;
          k = this.clip | 0x2;
          ((PDFPage)localObject2).addPath((Path)localObject3, k);
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.clip = 0;
          localObject2 = new android/graphics/Path;
          ((Path)localObject2).<init>();
          this.path = ((Path)localObject2);
          continue;
          localObject2 = this.path;
          localObject3 = Path.FillType.EVEN_ODD;
          ((Path)localObject2).setFillType((Path.FillType)localObject3);
          localObject2 = this.cmds;
          localObject3 = this.path;
          k = this.clip | 0x2;
          ((PDFPage)localObject2).addPath((Path)localObject3, k);
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.clip = 0;
          localObject2 = new android/graphics/Path;
          ((Path)localObject2).<init>();
          this.path = ((Path)localObject2);
          continue;
          localObject2 = this.cmds;
          localObject3 = this.path;
          k = this.clip | 0x3;
          ((PDFPage)localObject2).addPath((Path)localObject3, k);
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.clip = 0;
          localObject2 = new android/graphics/Path;
          ((Path)localObject2).<init>();
          this.path = ((Path)localObject2);
          continue;
          localObject2 = this.path;
          localObject3 = Path.FillType.EVEN_ODD;
          ((Path)localObject2).setFillType((Path.FillType)localObject3);
          localObject2 = this.cmds;
          localObject3 = this.path;
          k = this.clip | 0x3;
          ((PDFPage)localObject2).addPath((Path)localObject3, k);
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.clip = 0;
          localObject2 = new android/graphics/Path;
          ((Path)localObject2).<init>();
          this.path = ((Path)localObject2);
          continue;
          localObject2 = this.path;
          ((Path)localObject2).close();
          localObject2 = this.cmds;
          localObject3 = this.path;
          k = this.clip | 0x3;
          ((PDFPage)localObject2).addPath((Path)localObject3, k);
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.clip = 0;
          localObject2 = new android/graphics/Path;
          ((Path)localObject2).<init>();
          this.path = ((Path)localObject2);
          continue;
          localObject2 = this.path;
          ((Path)localObject2).close();
          localObject2 = this.path;
          localObject3 = Path.FillType.EVEN_ODD;
          ((Path)localObject2).setFillType((Path.FillType)localObject3);
          localObject2 = this.cmds;
          localObject3 = this.path;
          k = this.clip | 0x3;
          ((PDFPage)localObject2).addPath((Path)localObject3, k);
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.clip = 0;
          localObject2 = new android/graphics/Path;
          ((Path)localObject2).<init>();
          this.path = ((Path)localObject2);
          continue;
          n = this.clip;
          if (n != 0)
          {
            localObject2 = this.cmds;
            localObject3 = this.path;
            k = this.clip;
            ((PDFPage)localObject2).addPath((Path)localObject3, k);
          }
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.clip = 0;
          localObject2 = new android/graphics/Path;
          ((Path)localObject2).<init>();
          this.path = ((Path)localObject2);
          continue;
          n = 4;
          f4 = 5.6E-45F;
          this.clip = n;
          continue;
          localObject2 = this.path;
          localObject3 = Path.FillType.EVEN_ODD;
          ((Path)localObject2).setFillType((Path.FillType)localObject3);
          n = 4;
          f4 = 5.6E-45F;
          this.clip = n;
          continue;
          localObject2 = popString();
          localObject3 = "Shading";
          localObject2 = findResource((String)localObject2, (String)localObject3);
          doShader((PDFObject)localObject2);
          continue;
          localObject2 = this.state;
          localObject3 = new com/sun/pdfview/PDFObject;
          localObject4 = this.stack;
          localObject4 = ((Stack)localObject4).pop();
          ((PDFObject)localObject3).<init>(localObject4);
          localObject3 = parseColorSpace((PDFObject)localObject3);
          ((PDFParser.ParserState)localObject2).strokeCS = ((PDFColorSpace)localObject3);
          continue;
          localObject2 = this.state;
          localObject3 = new com/sun/pdfview/PDFObject;
          localObject4 = this.stack;
          localObject4 = ((Stack)localObject4).pop();
          ((PDFObject)localObject3).<init>(localObject4);
          localObject3 = parseColorSpace((PDFObject)localObject3);
          ((PDFParser.ParserState)localObject2).fillCS = ((PDFColorSpace)localObject3);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).strokeCS;
          n = ((PDFColorSpace)localObject2).getNumComponents();
          localObject3 = this.cmds;
          localObject4 = this.state;
          localObject4 = ((PDFParser.ParserState)localObject4).strokeCS;
          localObject2 = popFloat(n);
          localObject2 = ((PDFColorSpace)localObject4).getPaint((float[])localObject2);
          ((PDFPage)localObject3).addStrokePaint((PDFPaint)localObject2);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).strokeCS;
          n = ((PDFColorSpace)localObject2).getNumComponents();
          localObject3 = this.cmds;
          localObject4 = this.state;
          localObject4 = ((PDFParser.ParserState)localObject4).strokeCS;
          localObject2 = popFloat(n);
          localObject2 = ((PDFColorSpace)localObject4).getPaint((float[])localObject2);
          ((PDFPage)localObject3).addStrokePaint((PDFPaint)localObject2);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).fillCS;
          n = ((PDFColorSpace)localObject2).getNumComponents();
          localObject3 = this.cmds;
          localObject4 = this.state;
          localObject4 = ((PDFParser.ParserState)localObject4).fillCS;
          localObject2 = popFloat(n);
          localObject2 = ((PDFColorSpace)localObject4).getFillPaint((float[])localObject2);
          ((PDFPage)localObject3).addFillPaint((PDFPaint)localObject2);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).fillCS;
          n = ((PDFColorSpace)localObject2).getNumComponents();
          localObject3 = this.cmds;
          localObject4 = this.state;
          localObject4 = ((PDFParser.ParserState)localObject4).fillCS;
          localObject2 = popFloat(n);
          localObject2 = ((PDFColorSpace)localObject4).getFillPaint((float[])localObject2);
          ((PDFPage)localObject3).addFillPaint((PDFPaint)localObject2);
          continue;
          localObject2 = this.state;
          i3 = 0;
          f5 = 0.0F;
          localObject3 = null;
          localObject3 = PDFColorSpace.getColorSpace(0);
          ((PDFParser.ParserState)localObject2).strokeCS = ((PDFColorSpace)localObject3);
          localObject2 = this.cmds;
          localObject3 = this.state;
          localObject3 = ((PDFParser.ParserState)localObject3).strokeCS;
          k = 1;
          f3 = Float.MIN_VALUE;
          localObject4 = popFloat(k);
          localObject3 = ((PDFColorSpace)localObject3).getPaint((float[])localObject4);
          ((PDFPage)localObject2).addStrokePaint((PDFPaint)localObject3);
          continue;
          localObject2 = this.state;
          i3 = 0;
          f5 = 0.0F;
          localObject3 = null;
          localObject3 = PDFColorSpace.getColorSpace(0);
          ((PDFParser.ParserState)localObject2).fillCS = ((PDFColorSpace)localObject3);
          localObject2 = this.cmds;
          localObject3 = this.state;
          localObject3 = ((PDFParser.ParserState)localObject3).fillCS;
          k = 1;
          f3 = Float.MIN_VALUE;
          localObject4 = popFloat(k);
          localObject3 = ((PDFColorSpace)localObject3).getFillPaint((float[])localObject4);
          ((PDFPage)localObject2).addFillPaint((PDFPaint)localObject3);
          continue;
          localObject2 = this.state;
          i3 = 1;
          f5 = Float.MIN_VALUE;
          localObject3 = PDFColorSpace.getColorSpace(i3);
          ((PDFParser.ParserState)localObject2).strokeCS = ((PDFColorSpace)localObject3);
          localObject2 = this.cmds;
          localObject3 = this.state;
          localObject3 = ((PDFParser.ParserState)localObject3).strokeCS;
          k = 3;
          f3 = 4.2E-45F;
          localObject4 = popFloat(k);
          localObject3 = ((PDFColorSpace)localObject3).getPaint((float[])localObject4);
          ((PDFPage)localObject2).addStrokePaint((PDFPaint)localObject3);
          continue;
          localObject2 = this.state;
          i3 = 1;
          f5 = Float.MIN_VALUE;
          localObject3 = PDFColorSpace.getColorSpace(i3);
          ((PDFParser.ParserState)localObject2).fillCS = ((PDFColorSpace)localObject3);
          localObject2 = this.cmds;
          localObject3 = this.state;
          localObject3 = ((PDFParser.ParserState)localObject3).fillCS;
          k = 3;
          f3 = 4.2E-45F;
          localObject4 = popFloat(k);
          localObject3 = ((PDFColorSpace)localObject3).getFillPaint((float[])localObject4);
          ((PDFPage)localObject2).addFillPaint((PDFPaint)localObject3);
          continue;
          localObject2 = this.state;
          i3 = 2;
          f5 = 2.8E-45F;
          localObject3 = PDFColorSpace.getColorSpace(i3);
          ((PDFParser.ParserState)localObject2).strokeCS = ((PDFColorSpace)localObject3);
          localObject2 = this.cmds;
          localObject3 = this.state;
          localObject3 = ((PDFParser.ParserState)localObject3).strokeCS;
          k = 4;
          f3 = 5.6E-45F;
          localObject4 = popFloat(k);
          localObject3 = ((PDFColorSpace)localObject3).getPaint((float[])localObject4);
          ((PDFPage)localObject2).addStrokePaint((PDFPaint)localObject3);
          continue;
          localObject2 = this.state;
          i3 = 2;
          f5 = 2.8E-45F;
          localObject3 = PDFColorSpace.getColorSpace(i3);
          ((PDFParser.ParserState)localObject2).fillCS = ((PDFColorSpace)localObject3);
          localObject2 = this.cmds;
          localObject3 = this.state;
          localObject3 = ((PDFParser.ParserState)localObject3).fillCS;
          k = 4;
          f3 = 5.6E-45F;
          localObject4 = popFloat(k);
          localObject3 = ((PDFColorSpace)localObject3).getFillPaint((float[])localObject4);
          ((PDFPage)localObject2).addFillPaint((PDFPaint)localObject3);
          continue;
          localObject2 = popString();
          localObject3 = "XObject";
          localObject2 = findResource((String)localObject2, (String)localObject3);
          doXObject((PDFObject)localObject2);
          continue;
          processBTCmd();
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          ((PDFTextFormat)localObject2).end();
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          f5 = popFloat();
          ((PDFTextFormat)localObject2).setCharSpacing(f5);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          f5 = popFloat();
          ((PDFTextFormat)localObject2).setWordSpacing(f5);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          f5 = popFloat();
          ((PDFTextFormat)localObject2).setHorizontalScale(f5);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          f5 = popFloat();
          ((PDFTextFormat)localObject2).setLeading(f5);
          continue;
          f4 = popFloat();
          localObject3 = popString();
          localObject4 = this.state;
          localObject4 = ((PDFParser.ParserState)localObject4).textFormat;
          localObject3 = getFontFrom((String)localObject3);
          ((PDFTextFormat)localObject4).setFont((PDFFont)localObject3, f4);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          i3 = popInt();
          ((PDFTextFormat)localObject2).setMode(i3);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          f5 = popFloat();
          ((PDFTextFormat)localObject2).setRise(f5);
          continue;
          f4 = popFloat();
          f5 = popFloat();
          localObject4 = this.state;
          localObject4 = ((PDFParser.ParserState)localObject4).textFormat;
          ((PDFTextFormat)localObject4).carriageReturn(f5, f4);
          continue;
          f4 = popFloat();
          f5 = popFloat();
          localObject4 = this.state;
          localObject4 = ((PDFParser.ParserState)localObject4).textFormat;
          f2 = -f4;
          ((PDFTextFormat)localObject4).setLeading(f2);
          localObject4 = this.state;
          localObject4 = ((PDFParser.ParserState)localObject4).textFormat;
          ((PDFTextFormat)localObject4).carriageReturn(f5, f4);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          i3 = 6;
          f5 = 8.4E-45F;
          localObject3 = popFloat(i3);
          ((PDFTextFormat)localObject2).setMatrix((float[])localObject3);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          ((PDFTextFormat)localObject2).carriageReturn();
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          localObject3 = this.cmds;
          localObject4 = popString();
          ((PDFTextFormat)localObject2).doText((PDFPage)localObject3, (String)localObject4);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          ((PDFTextFormat)localObject2).carriageReturn();
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          localObject3 = this.cmds;
          localObject4 = popString();
          ((PDFTextFormat)localObject2).doText((PDFPage)localObject3, (String)localObject4);
          continue;
          localObject2 = popString();
          f5 = popFloat();
          f3 = popFloat();
          localObject5 = this.state;
          localObject5 = ((PDFParser.ParserState)localObject5).textFormat;
          ((PDFTextFormat)localObject5).setWordSpacing(f3);
          localObject4 = this.state;
          localObject4 = ((PDFParser.ParserState)localObject4).textFormat;
          ((PDFTextFormat)localObject4).setCharSpacing(f5);
          localObject3 = this.state;
          localObject3 = ((PDFParser.ParserState)localObject3).textFormat;
          localObject4 = this.cmds;
          ((PDFTextFormat)localObject3).doText((PDFPage)localObject4, (String)localObject2);
          continue;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).textFormat;
          localObject3 = this.cmds;
          localObject4 = popArray();
          ((PDFTextFormat)localObject2).doText((PDFPage)localObject3, (Object[])localObject4);
          continue;
          parseInlineImage();
          continue;
          n = 1;
          f4 = Float.MIN_VALUE;
          this.catchexceptions = n;
          continue;
          n = 0;
          f4 = 0.0F;
          localObject2 = null;
          this.catchexceptions = false;
          continue;
          popString();
          continue;
          localObject2 = this.stack;
          ((Stack)localObject2).pop();
          popString();
          continue;
          popString();
          continue;
          localObject2 = this.stack;
          ((Stack)localObject2).pop();
          popString();
          continue;
          n = 2;
          f4 = 2.8E-45F;
          popFloat(n);
          continue;
          n = 6;
          f4 = 8.4E-45F;
          popFloat(n);
          continue;
          processQCmd();
          processBTCmd();
          continue;
          processQCmd();
          localObject3 = this.parserStates;
          localObject2 = this.state;
          localObject2 = ((PDFParser.ParserState)localObject2).clone();
          localObject2 = (PDFParser.ParserState)localObject2;
          ((Stack)localObject3).push(localObject2);
          localObject2 = this.cmds;
          ((PDFPage)localObject2).addPush();
        }
        localObject2 = new com/sun/pdfview/PDFParseException;
        localObject3 = new java/lang/StringBuilder;
        localObject4 = "Unknown command: ";
        ((StringBuilder)localObject3).<init>((String)localObject4);
        localObject3 = ((StringBuilder)localObject3).append(str);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((PDFParseException)localObject2).<init>((String)localObject3);
        throw ((Throwable)localObject2);
      }
      localObject1 = this.stack;
      n = ((Stack)localObject1).size();
      if (n != 0)
      {
        localObject1 = this.stack;
        ((Stack)localObject1).setSize(0);
      }
    }
    for (;;)
    {
      localObject1 = null;
      this.cmds = null;
      n = i;
      f4 = f1;
      break;
      label890:
      int i3 = 0;
      localObject3 = null;
      float f5 = 0.0F;
      break label157;
      label902:
      n = 0;
      localObject1 = null;
      f4 = 0.0F;
      break label190;
      label914:
      n = 0;
      localObject1 = null;
      f4 = 0.0F;
      break label229;
      localObject3 = this.parserStates;
      localObject1 = this.state;
      localObject1 = ((PDFParser.ParserState)localObject1).clone();
      localObject1 = (PDFParser.ParserState)localObject1;
      ((Stack)localObject3).push(localObject1);
      localObject1 = this.cmds;
      ((PDFPage)localObject1).addPush();
      break label843;
      Object localObject4;
      Object localObject5;
      Object localObject2;
      float[] arrayOfFloat;
      int i4;
      float f6;
      int i5;
      float f7;
      int i6;
      float f8;
      label4356:
      localObject3 = this.stack;
      ((Stack)localObject3).push(localObject2);
    }
  }
  
  public void setup()
  {
    Object localObject1 = new java/util/Stack;
    ((Stack)localObject1).<init>();
    this.stack = ((Stack)localObject1);
    localObject1 = new java/util/Stack;
    ((Stack)localObject1).<init>();
    this.parserStates = ((Stack)localObject1);
    localObject1 = new com/sun/pdfview/PDFParser$ParserState;
    ((PDFParser.ParserState)localObject1).<init>(this);
    this.state = ((PDFParser.ParserState)localObject1);
    localObject1 = new android/graphics/Path;
    ((Path)localObject1).<init>();
    this.path = ((Path)localObject1);
    this.loc = 0;
    this.clip = 0;
    localObject1 = this.state;
    Object localObject2 = PDFColorSpace.getColorSpace(0);
    ((PDFParser.ParserState)localObject1).fillCS = ((PDFColorSpace)localObject2);
    localObject1 = this.state;
    localObject2 = PDFColorSpace.getColorSpace(0);
    ((PDFParser.ParserState)localObject1).strokeCS = ((PDFColorSpace)localObject2);
    localObject1 = this.state;
    localObject2 = new com/sun/pdfview/PDFTextFormat;
    ((PDFTextFormat)localObject2).<init>();
    ((PDFParser.ParserState)localObject1).textFormat = ((PDFTextFormat)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\PDFParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */