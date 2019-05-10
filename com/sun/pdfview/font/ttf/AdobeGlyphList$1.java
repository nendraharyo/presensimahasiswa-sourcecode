package com.sun.pdfview.font.ttf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

class AdobeGlyphList$1
  implements Runnable
{
  AdobeGlyphList$1(AdobeGlyphList paramAdobeGlyphList) {}
  
  public void run()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject1 = getClass().getResourceAsStream("/com/sun/pdfview/font/ttf/resource/glyphlist.txt");
    BufferedReader localBufferedReader = new java/io/BufferedReader;
    Object localObject3 = new java/io/InputStreamReader;
    ((InputStreamReader)localObject3).<init>((InputStream)localObject1);
    localBufferedReader.<init>((Reader)localObject3);
    label46:
    label224:
    Object localObject2;
    label300:
    for (localObject1 = "";; localObject2 = localObject3)
    {
      if (localObject1 == null) {
        return;
      }
      for (;;)
      {
        String str;
        Object localObject5;
        try
        {
          localArrayList.clear();
          localObject1 = localBufferedReader.readLine();
          if (localObject1 == null) {
            break label46;
          }
          localObject3 = ((String)localObject1).trim();
          int i = ((String)localObject3).length();
          if (i <= 0) {
            break label300;
          }
          localObject1 = "#";
          boolean bool = ((String)localObject3).startsWith((String)localObject1);
          if (bool) {
            break label300;
          }
          localObject1 = new java/util/StringTokenizer;
          Object localObject4 = ";";
          ((StringTokenizer)localObject1).<init>((String)localObject3, (String)localObject4);
          str = ((StringTokenizer)localObject1).nextToken();
          localObject4 = new java/util/StringTokenizer;
          localObject1 = ((StringTokenizer)localObject1).nextToken();
          localObject5 = " ";
          ((StringTokenizer)localObject4).<init>((String)localObject1, (String)localObject5);
          bool = ((StringTokenizer)localObject4).hasMoreTokens();
          if (!bool)
          {
            j = localArrayList.size();
            localObject5 = new int[j];
            j = 0;
            localObject1 = null;
            k = 0;
            localObject4 = null;
            j = localArrayList.size();
            if (k < j) {
              break label224;
            }
            localObject1 = AdobeGlyphList.access$1();
            ((HashMap)localObject1).put(str, localObject5);
            localObject1 = localObject3;
            break;
          }
          localObject1 = ((StringTokenizer)localObject4).nextToken();
          localArrayList.add(localObject1);
          continue;
        }
        catch (IOException localIOException) {}
        localObject2 = localArrayList.get(k);
        localObject2 = (String)localObject2;
        int m = 16;
        int j = Integer.parseInt((String)localObject2, m);
        localObject5[k] = j;
        localObject2 = AdobeGlyphList.access$0();
        Integer localInteger = new java/lang/Integer;
        int n = localObject5[k];
        localInteger.<init>(n);
        ((HashMap)localObject2).put(localInteger, str);
        j = k + 1;
        int k = j;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\sun\pdfview\font\ttf\AdobeGlyphList$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */