package com.sun.pdfview.font.ttf;

import java.util.HashMap;

public class AdobeGlyphList
{
  static Thread glyphLoaderThread = null;
  private static HashMap glyphToUnicodes;
  private static HashMap unicodeToGlyph;
  
  static
  {
    new AdobeGlyphList();
  }
  
  private AdobeGlyphList()
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>(i);
    glyphToUnicodes = (HashMap)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>(i);
    unicodeToGlyph = (HashMap)localObject;
    localObject = new java/lang/Thread;
    AdobeGlyphList.1 local1 = new com/sun/pdfview/font/ttf/AdobeGlyphList$1;
    local1.<init>(this);
    ((Thread)localObject).<init>(local1, "Adobe Glyph Loader Thread");
    glyphLoaderThread = (Thread)localObject;
    glyphLoaderThread.setDaemon(j);
    glyphLoaderThread.setPriority(j);
    glyphLoaderThread.start();
  }
  
  /* Error */
  public static String getGlyphName(int paramInt)
  {
    // Byte code:
    //   0: getstatic 11	com/sun/pdfview/font/ttf/AdobeGlyphList:glyphLoaderThread	Ljava/lang/Thread;
    //   3: astore_1
    //   4: aload_1
    //   5: ifnull +16 -> 21
    //   8: getstatic 11	com/sun/pdfview/font/ttf/AdobeGlyphList:glyphLoaderThread	Ljava/lang/Thread;
    //   11: astore_1
    //   12: aload_1
    //   13: invokevirtual 53	java/lang/Thread:isAlive	()Z
    //   16: istore_2
    //   17: iload_2
    //   18: ifne +25 -> 43
    //   21: getstatic 27	com/sun/pdfview/font/ttf/AdobeGlyphList:unicodeToGlyph	Ljava/util/HashMap;
    //   24: astore_1
    //   25: new 55	java/lang/Integer
    //   28: astore_3
    //   29: aload_3
    //   30: iload_0
    //   31: invokespecial 56	java/lang/Integer:<init>	(I)V
    //   34: aload_1
    //   35: aload_3
    //   36: invokevirtual 60	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   39: checkcast 62	java/lang/String
    //   42: areturn
    //   43: getstatic 25	com/sun/pdfview/font/ttf/AdobeGlyphList:glyphToUnicodes	Ljava/util/HashMap;
    //   46: astore_3
    //   47: aload_3
    //   48: monitorenter
    //   49: getstatic 25	com/sun/pdfview/font/ttf/AdobeGlyphList:glyphToUnicodes	Ljava/util/HashMap;
    //   52: astore_1
    //   53: ldc2_w 63
    //   56: lstore 4
    //   58: aload_1
    //   59: lload 4
    //   61: invokevirtual 70	java/lang/Object:wait	(J)V
    //   64: aload_3
    //   65: monitorexit
    //   66: goto -66 -> 0
    //   69: astore_1
    //   70: aload_3
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    //   74: astore_1
    //   75: goto -11 -> 64
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	paramInt	int
    //   3	56	1	localObject1	Object
    //   69	4	1	localObject2	Object
    //   74	1	1	localInterruptedException	InterruptedException
    //   16	2	2	bool	boolean
    //   56	4	4	l	long
    // Exception table:
    //   from	to	target	type
    //   49	52	69	finally
    //   59	64	69	finally
    //   64	66	69	finally
    //   70	72	69	finally
    //   49	52	74	java/lang/InterruptedException
    //   59	64	74	java/lang/InterruptedException
  }
  
  public static Integer getGlyphNameIndex(String paramString)
  {
    int[] arrayOfInt = getUnicodeValues(paramString);
    Integer localInteger;
    if (arrayOfInt == null) {
      localInteger = null;
    }
    for (;;)
    {
      return localInteger;
      localInteger = new java/lang/Integer;
      int i = arrayOfInt[0];
      localInteger.<init>(i);
    }
  }
  
  /* Error */
  public static int[] getUnicodeValues(String paramString)
  {
    // Byte code:
    //   0: getstatic 11	com/sun/pdfview/font/ttf/AdobeGlyphList:glyphLoaderThread	Ljava/lang/Thread;
    //   3: astore_1
    //   4: aload_1
    //   5: ifnull +16 -> 21
    //   8: getstatic 11	com/sun/pdfview/font/ttf/AdobeGlyphList:glyphLoaderThread	Ljava/lang/Thread;
    //   11: astore_1
    //   12: aload_1
    //   13: invokevirtual 53	java/lang/Thread:isAlive	()Z
    //   16: istore_2
    //   17: iload_2
    //   18: ifne +14 -> 32
    //   21: getstatic 25	com/sun/pdfview/font/ttf/AdobeGlyphList:glyphToUnicodes	Ljava/util/HashMap;
    //   24: aload_0
    //   25: invokevirtual 60	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   28: checkcast 78	[I
    //   31: areturn
    //   32: getstatic 25	com/sun/pdfview/font/ttf/AdobeGlyphList:glyphToUnicodes	Ljava/util/HashMap;
    //   35: astore_3
    //   36: aload_3
    //   37: monitorenter
    //   38: getstatic 25	com/sun/pdfview/font/ttf/AdobeGlyphList:glyphToUnicodes	Ljava/util/HashMap;
    //   41: astore_1
    //   42: ldc2_w 63
    //   45: lstore 4
    //   47: aload_1
    //   48: lload 4
    //   50: invokevirtual 70	java/lang/Object:wait	(J)V
    //   53: aload_3
    //   54: monitorexit
    //   55: goto -55 -> 0
    //   58: astore_1
    //   59: aload_3
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    //   63: astore_1
    //   64: goto -11 -> 53
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	67	0	paramString	String
    //   3	45	1	localObject1	Object
    //   58	4	1	localObject2	Object
    //   63	1	1	localInterruptedException	InterruptedException
    //   16	2	2	bool	boolean
    //   45	4	4	l	long
    // Exception table:
    //   from	to	target	type
    //   38	41	58	finally
    //   48	53	58	finally
    //   53	55	58	finally
    //   59	61	58	finally
    //   38	41	63	java/lang/InterruptedException
    //   48	53	63	java/lang/InterruptedException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\AdobeGlyphList.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */