package com.sun.pdfview.font;

import android.graphics.Matrix;
import android.graphics.Path;
import c.a.a.e.b;
import com.sun.pdfview.PDFObject;
import com.sun.pdfview.font.ttf.CMap;
import com.sun.pdfview.font.ttf.CmapTable;
import com.sun.pdfview.font.ttf.GlyfCompound;
import com.sun.pdfview.font.ttf.GlyfSimple;
import com.sun.pdfview.font.ttf.GlyfTable;
import com.sun.pdfview.font.ttf.HeadTable;
import com.sun.pdfview.font.ttf.TrueTypeFont;

public class TTFFont
  extends OutlineFont
{
  private TrueTypeFont font;
  private float unitsPerEm;
  
  public TTFFont(String paramString, PDFObject paramPDFObject, PDFFontDescriptor paramPDFFontDescriptor)
  {
    super(paramString, paramPDFObject, paramPDFFontDescriptor);
    paramPDFFontDescriptor.getFontName();
    Object localObject = paramPDFFontDescriptor.getFontFile2();
    int i;
    float f;
    if (localObject != null)
    {
      localObject = TrueTypeFont.parseFont(((PDFObject)localObject).getStreamBuffer());
      this.font = ((TrueTypeFont)localObject);
      localObject = this.font;
      String str = "head";
      localObject = (HeadTable)((TrueTypeFont)localObject).getTable(str);
      i = ((HeadTable)localObject).getUnitsPerEm();
      f = i;
      this.unitsPerEm = f;
    }
    for (;;)
    {
      return;
      i = 0;
      f = 0.0F;
      localObject = null;
      this.font = null;
    }
  }
  
  private void addOffCurvePoint(TTFFont.PointRec paramPointRec, TTFFont.RenderState paramRenderState)
  {
    TTFFont.PointRec localPointRec1 = paramRenderState.prevOff;
    if (localPointRec1 != null)
    {
      localPointRec1 = new com/sun/pdfview/font/TTFFont$PointRec;
      int i = paramPointRec.x;
      TTFFont.PointRec localPointRec2 = paramRenderState.prevOff;
      int j = localPointRec2.x;
      i = (i + j) / 2;
      j = paramPointRec.y;
      TTFFont.PointRec localPointRec3 = paramRenderState.prevOff;
      int k = localPointRec3.y;
      j = (j + k) / 2;
      k = 1;
      localPointRec1.<init>(this, i, j, k);
      addOnCurvePoint(localPointRec1, paramRenderState);
    }
    for (;;)
    {
      paramRenderState.prevOff = paramPointRec;
      return;
      localPointRec1 = paramRenderState.firstOn;
      if (localPointRec1 == null) {
        paramRenderState.firstOff = paramPointRec;
      }
    }
  }
  
  private void addOnCurvePoint(TTFFont.PointRec paramPointRec, TTFFont.RenderState paramRenderState)
  {
    Object localObject = paramRenderState.firstOn;
    int i;
    float f1;
    int j;
    float f2;
    if (localObject == null)
    {
      paramRenderState.firstOn = paramPointRec;
      localObject = paramRenderState.gp;
      i = paramPointRec.x;
      f1 = i;
      j = paramPointRec.y;
      f2 = j;
      ((Path)localObject).moveTo(f1, f2);
    }
    for (;;)
    {
      return;
      localObject = paramRenderState.prevOff;
      if (localObject != null)
      {
        localObject = paramRenderState.gp;
        TTFFont.PointRec localPointRec1 = paramRenderState.prevOff;
        i = localPointRec1.x;
        f1 = i;
        TTFFont.PointRec localPointRec2 = paramRenderState.prevOff;
        j = localPointRec2.y;
        f2 = j;
        int k = paramPointRec.x;
        float f3 = k;
        int m = paramPointRec.y;
        float f4 = m;
        ((Path)localObject).quadTo(f1, f2, f3, f4);
        localObject = null;
        paramRenderState.prevOff = null;
      }
      else
      {
        localObject = paramRenderState.gp;
        i = paramPointRec.x;
        f1 = i;
        j = paramPointRec.y;
        f2 = j;
        ((Path)localObject).lineTo(f1, f2);
      }
    }
  }
  
  /* Error */
  protected Path getOutline(char paramChar, float paramFloat)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 36	com/sun/pdfview/font/TTFFont:font	Lcom/sun/pdfview/font/ttf/TrueTypeFont;
    //   11: astore 5
    //   13: ldc 98
    //   15: astore 6
    //   17: aload 5
    //   19: aload 6
    //   21: invokevirtual 42	com/sun/pdfview/font/ttf/TrueTypeFont:getTable	(Ljava/lang/String;)Lcom/sun/pdfview/font/ttf/TrueTypeTable;
    //   24: astore 5
    //   26: aload 5
    //   28: checkcast 100	com/sun/pdfview/font/ttf/CmapTable
    //   31: astore 5
    //   33: aload 5
    //   35: ifnonnull +16 -> 51
    //   38: aload_0
    //   39: iload_1
    //   40: fload_2
    //   41: invokevirtual 104	com/sun/pdfview/font/TTFFont:getOutline	(IF)Landroid/graphics/Path;
    //   44: astore 5
    //   46: aload_0
    //   47: monitorexit
    //   48: aload 5
    //   50: areturn
    //   51: aload 5
    //   53: invokevirtual 108	com/sun/pdfview/font/ttf/CmapTable:getCMaps	()[Lcom/sun/pdfview/font/ttf/CMap;
    //   56: astore 6
    //   58: iconst_0
    //   59: istore 7
    //   61: aconst_null
    //   62: astore 5
    //   64: aload 6
    //   66: arraylength
    //   67: istore_3
    //   68: iload 7
    //   70: iload_3
    //   71: if_icmplt +20 -> 91
    //   74: iconst_0
    //   75: istore 7
    //   77: aconst_null
    //   78: astore 5
    //   80: aload_0
    //   81: iconst_0
    //   82: fload_2
    //   83: invokevirtual 104	com/sun/pdfview/font/TTFFont:getOutline	(IF)Landroid/graphics/Path;
    //   86: astore 5
    //   88: goto -42 -> 46
    //   91: aload 6
    //   93: iload 7
    //   95: aaload
    //   96: astore 4
    //   98: aload 4
    //   100: iload_1
    //   101: invokevirtual 114	com/sun/pdfview/font/ttf/CMap:map	(C)C
    //   104: istore_3
    //   105: iload_3
    //   106: ifeq +14 -> 120
    //   109: aload_0
    //   110: iload_3
    //   111: fload_2
    //   112: invokevirtual 104	com/sun/pdfview/font/TTFFont:getOutline	(IF)Landroid/graphics/Path;
    //   115: astore 5
    //   117: goto -71 -> 46
    //   120: iload 7
    //   122: iconst_1
    //   123: iadd
    //   124: istore 7
    //   126: goto -62 -> 64
    //   129: astore 5
    //   131: aload_0
    //   132: monitorexit
    //   133: aload 5
    //   135: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	this	TTFFont
    //   0	136	1	paramChar	char
    //   0	136	2	paramFloat	float
    //   1	110	3	i	int
    //   3	96	4	localObject1	Object
    //   11	105	5	localObject2	Object
    //   129	5	5	localObject3	Object
    //   15	77	6	localObject4	Object
    //   59	66	7	j	int
    // Exception table:
    //   from	to	target	type
    //   7	11	129	finally
    //   19	24	129	finally
    //   26	31	129	finally
    //   40	44	129	finally
    //   51	56	129	finally
    //   64	67	129	finally
    //   82	86	129	finally
    //   93	96	129	finally
    //   100	104	129	finally
    //   111	115	129	finally
  }
  
  /* Error */
  protected Path getOutline(int paramInt, float paramFloat)
  {
    // Byte code:
    //   0: ldc 116
    //   2: fstore_3
    //   3: aload_0
    //   4: monitorenter
    //   5: aload_0
    //   6: getfield 36	com/sun/pdfview/font/TTFFont:font	Lcom/sun/pdfview/font/ttf/TrueTypeFont;
    //   9: astore 4
    //   11: ldc 118
    //   13: astore 5
    //   15: aload 4
    //   17: aload 5
    //   19: invokevirtual 42	com/sun/pdfview/font/ttf/TrueTypeFont:getTable	(Ljava/lang/String;)Lcom/sun/pdfview/font/ttf/TrueTypeTable;
    //   22: astore 4
    //   24: aload 4
    //   26: checkcast 120	com/sun/pdfview/font/ttf/GlyfTable
    //   29: astore 4
    //   31: aload 4
    //   33: iload_1
    //   34: invokevirtual 124	com/sun/pdfview/font/ttf/GlyfTable:getGlyph	(I)Lcom/sun/pdfview/font/ttf/Glyf;
    //   37: astore 5
    //   39: aload 5
    //   41: instanceof 126
    //   44: istore 6
    //   46: iload 6
    //   48: ifeq +174 -> 222
    //   51: aload 5
    //   53: astore 7
    //   55: aload 5
    //   57: checkcast 126	com/sun/pdfview/font/ttf/GlyfSimple
    //   60: astore 7
    //   62: aload 7
    //   64: astore 4
    //   66: aload_0
    //   67: aload 7
    //   69: invokevirtual 130	com/sun/pdfview/font/TTFFont:renderSimpleGlyph	(Lcom/sun/pdfview/font/ttf/GlyfSimple;)Landroid/graphics/Path;
    //   72: astore 4
    //   74: aload 4
    //   76: astore 5
    //   78: aload_0
    //   79: getfield 36	com/sun/pdfview/font/TTFFont:font	Lcom/sun/pdfview/font/ttf/TrueTypeFont;
    //   82: astore 4
    //   84: ldc -124
    //   86: astore 8
    //   88: aload 4
    //   90: aload 8
    //   92: invokevirtual 42	com/sun/pdfview/font/ttf/TrueTypeFont:getTable	(Ljava/lang/String;)Lcom/sun/pdfview/font/ttf/TrueTypeTable;
    //   95: astore 4
    //   97: aload 4
    //   99: checkcast 134	com/sun/pdfview/font/ttf/HmtxTable
    //   102: astore 4
    //   104: aload 4
    //   106: iload_1
    //   107: invokevirtual 138	com/sun/pdfview/font/ttf/HmtxTable:getAdvance	(I)S
    //   110: istore 9
    //   112: iload 9
    //   114: i2f
    //   115: fstore 10
    //   117: aload_0
    //   118: getfield 50	com/sun/pdfview/font/TTFFont:unitsPerEm	F
    //   121: fstore 11
    //   123: fload 10
    //   125: fload 11
    //   127: fdiv
    //   128: fstore 10
    //   130: fload_2
    //   131: fload 10
    //   133: fdiv
    //   134: fstore 10
    //   136: new 140	android/graphics/Matrix
    //   139: astore 8
    //   141: aload 8
    //   143: invokespecial 143	android/graphics/Matrix:<init>	()V
    //   146: aload_0
    //   147: getfield 50	com/sun/pdfview/font/TTFFont:unitsPerEm	F
    //   150: fstore 12
    //   152: fload_3
    //   153: fload 12
    //   155: fdiv
    //   156: fstore 12
    //   158: aload_0
    //   159: getfield 50	com/sun/pdfview/font/TTFFont:unitsPerEm	F
    //   162: fstore 13
    //   164: fload_3
    //   165: fload 13
    //   167: fdiv
    //   168: fstore 13
    //   170: aload 8
    //   172: fload 12
    //   174: fload 13
    //   176: invokevirtual 146	android/graphics/Matrix:setScale	(FF)V
    //   179: new 140	android/graphics/Matrix
    //   182: astore 14
    //   184: aload 14
    //   186: invokespecial 143	android/graphics/Matrix:<init>	()V
    //   189: ldc 116
    //   191: fstore 13
    //   193: aload 14
    //   195: fload 10
    //   197: fload 13
    //   199: invokevirtual 146	android/graphics/Matrix:setScale	(FF)V
    //   202: aload 8
    //   204: aload 14
    //   206: invokevirtual 150	android/graphics/Matrix:preConcat	(Landroid/graphics/Matrix;)Z
    //   209: pop
    //   210: aload 5
    //   212: aload 8
    //   214: invokevirtual 154	android/graphics/Path:transform	(Landroid/graphics/Matrix;)V
    //   217: aload_0
    //   218: monitorexit
    //   219: aload 5
    //   221: areturn
    //   222: aload 5
    //   224: instanceof 156
    //   227: istore 6
    //   229: iload 6
    //   231: ifeq +27 -> 258
    //   234: aload 5
    //   236: checkcast 156	com/sun/pdfview/font/ttf/GlyfCompound
    //   239: astore 5
    //   241: aload_0
    //   242: aload 4
    //   244: aload 5
    //   246: invokevirtual 160	com/sun/pdfview/font/TTFFont:renderCompoundGlyph	(Lcom/sun/pdfview/font/ttf/GlyfTable;Lcom/sun/pdfview/font/ttf/GlyfCompound;)Landroid/graphics/Path;
    //   249: astore 4
    //   251: aload 4
    //   253: astore 5
    //   255: goto -177 -> 78
    //   258: new 85	android/graphics/Path
    //   261: astore 4
    //   263: aload 4
    //   265: invokespecial 161	android/graphics/Path:<init>	()V
    //   268: aload 4
    //   270: astore 5
    //   272: goto -194 -> 78
    //   275: astore 4
    //   277: aload_0
    //   278: monitorexit
    //   279: aload 4
    //   281: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	282	0	this	TTFFont
    //   0	282	1	paramInt	int
    //   0	282	2	paramFloat	float
    //   2	163	3	f1	float
    //   9	260	4	localObject1	Object
    //   275	5	4	localObject2	Object
    //   13	258	5	localObject3	Object
    //   44	186	6	bool	boolean
    //   53	15	7	localObject4	Object
    //   86	127	8	localObject5	Object
    //   110	3	9	i	int
    //   115	81	10	f2	float
    //   121	5	11	f3	float
    //   150	23	12	f4	float
    //   162	36	13	f5	float
    //   182	23	14	localMatrix	Matrix
    // Exception table:
    //   from	to	target	type
    //   5	9	275	finally
    //   17	22	275	finally
    //   24	29	275	finally
    //   33	37	275	finally
    //   55	60	275	finally
    //   67	72	275	finally
    //   78	82	275	finally
    //   90	95	275	finally
    //   97	102	275	finally
    //   106	110	275	finally
    //   117	121	275	finally
    //   136	139	275	finally
    //   141	146	275	finally
    //   146	150	275	finally
    //   158	162	275	finally
    //   174	179	275	finally
    //   179	182	275	finally
    //   184	189	275	finally
    //   197	202	275	finally
    //   204	210	275	finally
    //   212	217	275	finally
    //   234	239	275	finally
    //   244	249	275	finally
    //   258	261	275	finally
    //   263	268	275	finally
  }
  
  /* Error */
  protected Path getOutline(String paramString, float paramFloat)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 36	com/sun/pdfview/font/TTFFont:font	Lcom/sun/pdfview/font/ttf/TrueTypeFont;
    //   6: astore_3
    //   7: ldc -93
    //   9: astore 4
    //   11: aload_3
    //   12: aload 4
    //   14: invokevirtual 42	com/sun/pdfview/font/ttf/TrueTypeFont:getTable	(Ljava/lang/String;)Lcom/sun/pdfview/font/ttf/TrueTypeTable;
    //   17: astore_3
    //   18: aload_3
    //   19: checkcast 165	com/sun/pdfview/font/ttf/PostTable
    //   22: astore_3
    //   23: aload_3
    //   24: ifnull +35 -> 59
    //   27: aload_3
    //   28: aload_1
    //   29: invokevirtual 169	com/sun/pdfview/font/ttf/PostTable:getGlyphNameIndex	(Ljava/lang/String;)S
    //   32: istore 5
    //   34: iload 5
    //   36: ifeq +15 -> 51
    //   39: aload_0
    //   40: iload 5
    //   42: fload_2
    //   43: invokevirtual 104	com/sun/pdfview/font/TTFFont:getOutline	(IF)Landroid/graphics/Path;
    //   46: astore_3
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_3
    //   50: areturn
    //   51: iconst_0
    //   52: istore 5
    //   54: aconst_null
    //   55: astore_3
    //   56: goto -9 -> 47
    //   59: aload_1
    //   60: invokestatic 174	com/sun/pdfview/font/ttf/AdobeGlyphList:getGlyphNameIndex	(Ljava/lang/String;)Ljava/lang/Integer;
    //   63: astore_3
    //   64: aload_3
    //   65: ifnull +21 -> 86
    //   68: aload_3
    //   69: invokevirtual 180	java/lang/Integer:intValue	()I
    //   72: i2c
    //   73: istore 5
    //   75: aload_0
    //   76: iload 5
    //   78: fload_2
    //   79: invokevirtual 184	com/sun/pdfview/font/TTFFont:getOutlineFromCMaps	(CF)Landroid/graphics/Path;
    //   82: astore_3
    //   83: goto -36 -> 47
    //   86: iconst_0
    //   87: istore 5
    //   89: aconst_null
    //   90: astore_3
    //   91: goto -44 -> 47
    //   94: astore_3
    //   95: aload_0
    //   96: monitorexit
    //   97: aload_3
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	TTFFont
    //   0	99	1	paramString	String
    //   0	99	2	paramFloat	float
    //   6	85	3	localObject1	Object
    //   94	4	3	localObject2	Object
    //   9	4	4	str	String
    //   32	45	5	i	int
    //   87	1	5	j	int
    // Exception table:
    //   from	to	target	type
    //   2	6	94	finally
    //   12	17	94	finally
    //   18	22	94	finally
    //   28	32	94	finally
    //   42	46	94	finally
    //   59	63	94	finally
    //   68	72	94	finally
    //   78	82	94	finally
  }
  
  protected Path getOutlineFromCMaps(char paramChar, float paramFloat)
  {
    for (;;)
    {
      try
      {
        Object localObject1 = this.font;
        Object localObject4 = "cmap";
        localObject1 = ((TrueTypeFont)localObject1).getTable((String)localObject4);
        localObject1 = (CmapTable)localObject1;
        int i;
        if (localObject1 == null)
        {
          i = 0;
          localObject1 = null;
          return (Path)localObject1;
        }
        short s1 = 3;
        short s2 = 1;
        localObject4 = ((CmapTable)localObject1).getCMap(s1, s2);
        if (localObject4 == null)
        {
          s1 = 1;
          s2 = 0;
          localObject1 = ((CmapTable)localObject1).getCMap(s1, (short)0);
          i = ((CMap)localObject1).map(paramChar);
          if (i != 0)
          {
            localObject1 = getOutline(i, paramFloat);
          }
          else
          {
            i = 0;
            localObject1 = null;
          }
        }
        else
        {
          Object localObject3 = localObject4;
        }
      }
      finally {}
    }
  }
  
  protected Path renderCompoundGlyph(GlyfTable paramGlyfTable, GlyfCompound paramGlyfCompound)
  {
    Object localObject1 = new android/graphics/Path;
    ((Path)localObject1).<init>();
    int i = 0;
    Object localObject2 = null;
    int j = 0;
    RuntimeException localRuntimeException = null;
    i = paramGlyfCompound.getNumComponents();
    if (j >= i) {
      return (Path)localObject1;
    }
    i = paramGlyfCompound.getGlyphIndex(j);
    localObject2 = paramGlyfTable.getGlyph(i);
    boolean bool = localObject2 instanceof GlyfSimple;
    if (bool) {
      localObject2 = (GlyfSimple)localObject2;
    }
    for (localObject2 = renderSimpleGlyph((GlyfSimple)localObject2);; localObject2 = renderCompoundGlyph(paramGlyfTable, (GlyfCompound)localObject2))
    {
      float[] arrayOfFloat = paramGlyfCompound.getTransform(j);
      Matrix localMatrix = new android/graphics/Matrix;
      localMatrix.<init>();
      b.a(localMatrix, arrayOfFloat);
      ((Path)localObject1).addPath((Path)localObject2, localMatrix);
      i = j + 1;
      j = i;
      break;
      bool = localObject2 instanceof GlyfCompound;
      if (!bool) {
        break label155;
      }
      localObject2 = (GlyfCompound)localObject2;
    }
    label155:
    localRuntimeException = new java/lang/RuntimeException;
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>("Unsupported glyph type ");
    localObject2 = localObject2.getClass().getCanonicalName();
    localObject2 = (String)localObject2;
    localRuntimeException.<init>((String)localObject2);
    throw localRuntimeException;
  }
  
  protected Path renderSimpleGlyph(GlyfSimple paramGlyfSimple)
  {
    int i = 0;
    TTFFont.RenderState localRenderState = new com/sun/pdfview/font/TTFFont$RenderState;
    localRenderState.<init>(this);
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    localRenderState.gp = localPath;
    int j = 0;
    localPath = null;
    int k = paramGlyfSimple.getNumPoints();
    if (i >= k) {
      return localRenderState.gp;
    }
    TTFFont.PointRec localPointRec = new com/sun/pdfview/font/TTFFont$PointRec;
    localPointRec.<init>(this, paramGlyfSimple, i);
    boolean bool = localPointRec.onCurve;
    if (bool) {
      addOnCurvePoint(localPointRec, localRenderState);
    }
    for (;;)
    {
      k = paramGlyfSimple.getContourEndPoint(j);
      if (i == k)
      {
        j += 1;
        localPointRec = localRenderState.firstOff;
        if (localPointRec != null)
        {
          localPointRec = localRenderState.firstOff;
          addOffCurvePoint(localPointRec, localRenderState);
        }
        localPointRec = localRenderState.firstOn;
        if (localPointRec != null)
        {
          localPointRec = localRenderState.firstOn;
          addOnCurvePoint(localPointRec, localRenderState);
        }
        localRenderState.firstOn = null;
        localRenderState.firstOff = null;
        localRenderState.prevOff = null;
      }
      i += 1;
      break;
      addOffCurvePoint(localPointRec, localRenderState);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\TTFFont.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */