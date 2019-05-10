package com.google.android.gms.cast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zzne;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle
{
  public static final int COLOR_UNSPECIFIED = 0;
  public static final float DEFAULT_FONT_SCALE = 1.0F;
  public static final int EDGE_TYPE_DEPRESSED = 4;
  public static final int EDGE_TYPE_DROP_SHADOW = 2;
  public static final int EDGE_TYPE_NONE = 0;
  public static final int EDGE_TYPE_OUTLINE = 1;
  public static final int EDGE_TYPE_RAISED = 3;
  public static final int EDGE_TYPE_UNSPECIFIED = 255;
  public static final int FONT_FAMILY_CASUAL = 4;
  public static final int FONT_FAMILY_CURSIVE = 5;
  public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
  public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
  public static final int FONT_FAMILY_SANS_SERIF = 0;
  public static final int FONT_FAMILY_SERIF = 2;
  public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
  public static final int FONT_FAMILY_UNSPECIFIED = 255;
  public static final int FONT_STYLE_BOLD = 1;
  public static final int FONT_STYLE_BOLD_ITALIC = 3;
  public static final int FONT_STYLE_ITALIC = 2;
  public static final int FONT_STYLE_NORMAL = 0;
  public static final int FONT_STYLE_UNSPECIFIED = 255;
  public static final int WINDOW_TYPE_NONE = 0;
  public static final int WINDOW_TYPE_NORMAL = 1;
  public static final int WINDOW_TYPE_ROUNDED = 2;
  public static final int WINDOW_TYPE_UNSPECIFIED = 255;
  private JSONObject zzaaU;
  private float zzaco;
  private int zzacp;
  private int zzacq;
  private int zzacr;
  private int zzacs;
  private int zzact;
  private int zzacu;
  private String zzacv;
  private int zzacw;
  private int zzacx;
  private int zzxO;
  
  public TextTrackStyle()
  {
    clear();
  }
  
  private void clear()
  {
    int i = -1;
    this.zzaco = 1.0F;
    this.zzacp = 0;
    this.zzxO = 0;
    this.zzacq = i;
    this.zzacr = 0;
    this.zzacs = i;
    this.zzact = 0;
    this.zzacu = 0;
    this.zzacv = null;
    this.zzacw = i;
    this.zzacx = i;
    this.zzaaU = null;
  }
  
  public static TextTrackStyle fromSystemSettings(Context paramContext)
  {
    int i = 2;
    int j = 1;
    TextTrackStyle localTextTrackStyle = new com/google/android/gms/cast/TextTrackStyle;
    localTextTrackStyle.<init>();
    boolean bool1 = zzne.zzsk();
    if (!bool1)
    {
      localObject = localTextTrackStyle;
      return (TextTrackStyle)localObject;
    }
    Object localObject = (CaptioningManager)paramContext.getSystemService("captioning");
    float f = ((CaptioningManager)localObject).getFontScale();
    localTextTrackStyle.setFontScale(f);
    localObject = ((CaptioningManager)localObject).getUserStyle();
    int m = ((CaptioningManager.CaptionStyle)localObject).backgroundColor;
    localTextTrackStyle.setBackgroundColor(m);
    m = ((CaptioningManager.CaptionStyle)localObject).foregroundColor;
    localTextTrackStyle.setForegroundColor(m);
    m = ((CaptioningManager.CaptionStyle)localObject).edgeType;
    label121:
    Typeface localTypeface;
    boolean bool2;
    label170:
    int k;
    switch (m)
    {
    default: 
      localTextTrackStyle.setEdgeType(0);
      m = ((CaptioningManager.CaptionStyle)localObject).edgeColor;
      localTextTrackStyle.setEdgeColor(m);
      localObject = ((CaptioningManager.CaptionStyle)localObject).getTypeface();
      if (localObject != null)
      {
        localTypeface = Typeface.MONOSPACE;
        bool2 = localTypeface.equals(localObject);
        if (!bool2) {
          break label225;
        }
        localTextTrackStyle.setFontGenericFamily(j);
        bool2 = ((Typeface)localObject).isBold();
        bool1 = ((Typeface)localObject).isItalic();
        if ((!bool2) || (!bool1)) {
          break label287;
        }
        k = 3;
        localTextTrackStyle.setFontStyle(k);
      }
      break;
    }
    for (;;)
    {
      localObject = localTextTrackStyle;
      break;
      localTextTrackStyle.setEdgeType(j);
      break label121;
      localTextTrackStyle.setEdgeType(i);
      break label121;
      label225:
      localTypeface = Typeface.SANS_SERIF;
      bool2 = localTypeface.equals(localObject);
      if (bool2)
      {
        localTextTrackStyle.setFontGenericFamily(0);
        break label170;
      }
      localTypeface = Typeface.SERIF;
      bool2 = localTypeface.equals(localObject);
      if (bool2)
      {
        localTextTrackStyle.setFontGenericFamily(i);
        break label170;
      }
      localTextTrackStyle.setFontGenericFamily(0);
      break label170;
      label287:
      if (bool2) {
        localTextTrackStyle.setFontStyle(j);
      } else if (k != 0) {
        localTextTrackStyle.setFontStyle(i);
      } else {
        localTextTrackStyle.setFontStyle(0);
      }
    }
  }
  
  private String zzL(int paramInt)
  {
    Object[] arrayOfObject = new Object[4];
    Integer localInteger = Integer.valueOf(Color.red(paramInt));
    arrayOfObject[0] = localInteger;
    localInteger = Integer.valueOf(Color.green(paramInt));
    arrayOfObject[1] = localInteger;
    localInteger = Integer.valueOf(Color.blue(paramInt));
    arrayOfObject[2] = localInteger;
    localInteger = Integer.valueOf(Color.alpha(paramInt));
    arrayOfObject[3] = localInteger;
    return String.format("#%02X%02X%02X%02X", arrayOfObject);
  }
  
  private int zzcd(String paramString)
  {
    int i = 0;
    int j;
    int k;
    if (paramString != null)
    {
      j = paramString.length();
      k = 9;
      if (j == k)
      {
        j = paramString.charAt(0);
        k = 35;
        if (j == k)
        {
          j = 1;
          k = 3;
        }
      }
    }
    try
    {
      String str1 = paramString.substring(j, k);
      k = 16;
      j = Integer.parseInt(str1, k);
      k = 3;
      int m = 5;
      String str2 = paramString.substring(k, m);
      m = 16;
      k = Integer.parseInt(str2, m);
      m = 5;
      int n = 7;
      String str3 = paramString.substring(m, n);
      n = 16;
      m = Integer.parseInt(str3, n);
      n = 7;
      int i1 = 9;
      String str4 = paramString.substring(n, i1);
      i1 = 16;
      n = Integer.parseInt(str4, i1);
      i = Color.argb(n, j, k, m);
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;) {}
    }
    return i;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    boolean bool2 = false;
    if (this == paramObject) {
      bool2 = bool1;
    }
    Object localObject1;
    label52:
    Object localObject2;
    label69:
    do
    {
      do
      {
        return bool2;
        bool3 = paramObject instanceof TextTrackStyle;
      } while (!bool3);
      paramObject = (TextTrackStyle)paramObject;
      localObject1 = this.zzaaU;
      if (localObject1 != null) {
        break label332;
      }
      bool3 = bool1;
      f2 = f1;
      localObject2 = ((TextTrackStyle)paramObject).zzaaU;
      if (localObject2 != null) {
        break label344;
      }
      boolean bool5 = bool1;
      f3 = f1;
      if (bool3 != bool5) {
        break label354;
      }
      localObject1 = this.zzaaU;
      if (localObject1 == null) {
        break;
      }
      localObject1 = ((TextTrackStyle)paramObject).zzaaU;
      if (localObject1 == null) {
        break;
      }
      localObject1 = this.zzaaU;
      localObject2 = ((TextTrackStyle)paramObject).zzaaU;
      bool3 = zznb.zze(localObject1, localObject2);
    } while (!bool3);
    float f2 = this.zzaco;
    float f3 = ((TextTrackStyle)paramObject).zzaco;
    boolean bool3 = f2 < f3;
    int k;
    int j;
    if (!bool3)
    {
      int i = this.zzacp;
      k = ((TextTrackStyle)paramObject).zzacp;
      if (i == k)
      {
        i = this.zzxO;
        k = ((TextTrackStyle)paramObject).zzxO;
        if (i == k)
        {
          i = this.zzacq;
          k = ((TextTrackStyle)paramObject).zzacq;
          if (i == k)
          {
            i = this.zzacr;
            k = ((TextTrackStyle)paramObject).zzacr;
            if (i == k)
            {
              i = this.zzacs;
              k = ((TextTrackStyle)paramObject).zzacs;
              if (i == k)
              {
                i = this.zzacu;
                k = ((TextTrackStyle)paramObject).zzacu;
                if (i == k)
                {
                  localObject1 = this.zzacv;
                  localObject2 = ((TextTrackStyle)paramObject).zzacv;
                  boolean bool4 = zzf.zza(localObject1, localObject2);
                  if (bool4)
                  {
                    j = this.zzacw;
                    k = ((TextTrackStyle)paramObject).zzacw;
                    if (j == k)
                    {
                      j = this.zzacx;
                      k = ((TextTrackStyle)paramObject).zzacx;
                      if (j != k) {}
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      bool2 = bool1;
      break;
      label332:
      j = 0;
      localObject1 = null;
      f2 = 0.0F;
      break label52;
      label344:
      k = 0;
      localObject2 = null;
      f3 = 0.0F;
      break label69;
      label354:
      break;
      bool1 = false;
      f1 = 0.0F;
    }
  }
  
  public int getBackgroundColor()
  {
    return this.zzxO;
  }
  
  public JSONObject getCustomData()
  {
    return this.zzaaU;
  }
  
  public int getEdgeColor()
  {
    return this.zzacr;
  }
  
  public int getEdgeType()
  {
    return this.zzacq;
  }
  
  public String getFontFamily()
  {
    return this.zzacv;
  }
  
  public int getFontGenericFamily()
  {
    return this.zzacw;
  }
  
  public float getFontScale()
  {
    return this.zzaco;
  }
  
  public int getFontStyle()
  {
    return this.zzacx;
  }
  
  public int getForegroundColor()
  {
    return this.zzacp;
  }
  
  public int getWindowColor()
  {
    return this.zzact;
  }
  
  public int getWindowCornerRadius()
  {
    return this.zzacu;
  }
  
  public int getWindowType()
  {
    return this.zzacs;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[12];
    Object localObject = Float.valueOf(this.zzaco);
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzacp);
    arrayOfObject[1] = localObject;
    localObject = Integer.valueOf(this.zzxO);
    arrayOfObject[2] = localObject;
    localObject = Integer.valueOf(this.zzacq);
    arrayOfObject[3] = localObject;
    localObject = Integer.valueOf(this.zzacr);
    arrayOfObject[4] = localObject;
    localObject = Integer.valueOf(this.zzacs);
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(this.zzact);
    arrayOfObject[6] = localObject;
    localObject = Integer.valueOf(this.zzacu);
    arrayOfObject[7] = localObject;
    localObject = this.zzacv;
    arrayOfObject[8] = localObject;
    localObject = Integer.valueOf(this.zzacw);
    arrayOfObject[9] = localObject;
    localObject = Integer.valueOf(this.zzacx);
    arrayOfObject[10] = localObject;
    localObject = this.zzaaU;
    arrayOfObject[11] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.zzxO = paramInt;
  }
  
  public void setCustomData(JSONObject paramJSONObject)
  {
    this.zzaaU = paramJSONObject;
  }
  
  public void setEdgeColor(int paramInt)
  {
    this.zzacr = paramInt;
  }
  
  public void setEdgeType(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 4;
      if (paramInt <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("invalid edgeType");
      throw localIllegalArgumentException;
    }
    this.zzacq = paramInt;
  }
  
  public void setFontFamily(String paramString)
  {
    this.zzacv = paramString;
  }
  
  public void setFontGenericFamily(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 6;
      if (paramInt <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("invalid fontGenericFamily");
      throw localIllegalArgumentException;
    }
    this.zzacw = paramInt;
  }
  
  public void setFontScale(float paramFloat)
  {
    this.zzaco = paramFloat;
  }
  
  public void setFontStyle(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 3;
      if (paramInt <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("invalid fontStyle");
      throw localIllegalArgumentException;
    }
    this.zzacx = paramInt;
  }
  
  public void setForegroundColor(int paramInt)
  {
    this.zzacp = paramInt;
  }
  
  public void setWindowColor(int paramInt)
  {
    this.zzact = paramInt;
  }
  
  public void setWindowCornerRadius(int paramInt)
  {
    if (paramInt < 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("invalid windowCornerRadius");
      throw localIllegalArgumentException;
    }
    this.zzacu = paramInt;
  }
  
  public void setWindowType(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = 2;
      if (paramInt <= i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("invalid windowType");
      throw localIllegalArgumentException;
    }
    this.zzacs = paramInt;
  }
  
  public JSONObject toJson()
  {
    localJSONObject = new org/json/JSONObject;
    localJSONObject.<init>();
    Object localObject1 = "fontScale";
    for (;;)
    {
      try
      {
        f = this.zzaco;
        double d = f;
        localJSONObject.put((String)localObject1, d);
        i = this.zzacp;
        if (i != 0)
        {
          localObject1 = "foregroundColor";
          j = this.zzacp;
          localObject2 = zzL(j);
          localJSONObject.put((String)localObject1, localObject2);
        }
        i = this.zzxO;
        if (i != 0)
        {
          localObject1 = "backgroundColor";
          j = this.zzxO;
          localObject2 = zzL(j);
          localJSONObject.put((String)localObject1, localObject2);
        }
        i = this.zzacq;
        switch (i)
        {
        }
      }
      catch (JSONException localJSONException)
      {
        float f;
        int i;
        int j;
        continue;
        String str = "edgeType";
        Object localObject2 = "OUTLINE";
        localJSONObject.put(str, localObject2);
        continue;
        str = "edgeType";
        localObject2 = "DROP_SHADOW";
        localJSONObject.put(str, localObject2);
        continue;
        str = "edgeType";
        localObject2 = "RAISED";
        localJSONObject.put(str, localObject2);
        continue;
        str = "edgeType";
        localObject2 = "DEPRESSED";
        localJSONObject.put(str, localObject2);
        continue;
        str = "windowType";
        localObject2 = "NONE";
        localJSONObject.put(str, localObject2);
        continue;
        str = "windowType";
        localObject2 = "NORMAL";
        localJSONObject.put(str, localObject2);
        continue;
        str = "windowType";
        localObject2 = "ROUNDED_CORNERS";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontGenericFamily";
        localObject2 = "SANS_SERIF";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontGenericFamily";
        localObject2 = "MONOSPACED_SANS_SERIF";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontGenericFamily";
        localObject2 = "SERIF";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontGenericFamily";
        localObject2 = "MONOSPACED_SERIF";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontGenericFamily";
        localObject2 = "CASUAL";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontGenericFamily";
        localObject2 = "CURSIVE";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontGenericFamily";
        localObject2 = "SMALL_CAPITALS";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontStyle";
        localObject2 = "NORMAL";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontStyle";
        localObject2 = "BOLD";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontStyle";
        localObject2 = "ITALIC";
        localJSONObject.put(str, localObject2);
        continue;
        str = "fontStyle";
        localObject2 = "BOLD_ITALIC";
        localJSONObject.put(str, localObject2);
        continue;
      }
      i = this.zzacr;
      if (i != 0)
      {
        localObject1 = "edgeColor";
        j = this.zzacr;
        localObject2 = zzL(j);
        localJSONObject.put((String)localObject1, localObject2);
      }
      i = this.zzacs;
      switch (i)
      {
      default: 
        i = this.zzact;
        if (i != 0)
        {
          localObject1 = "windowColor";
          j = this.zzact;
          localObject2 = zzL(j);
          localJSONObject.put((String)localObject1, localObject2);
        }
        i = this.zzacs;
        j = 2;
        f = 2.8E-45F;
        if (i == j)
        {
          localObject1 = "windowRoundedCornerRadius";
          j = this.zzacu;
          localJSONObject.put((String)localObject1, j);
        }
        localObject1 = this.zzacv;
        if (localObject1 != null)
        {
          localObject1 = "fontFamily";
          localObject2 = this.zzacv;
          localJSONObject.put((String)localObject1, localObject2);
        }
        i = this.zzacw;
        switch (i)
        {
        default: 
          i = this.zzacx;
          switch (i)
          {
          default: 
            localObject1 = this.zzaaU;
            if (localObject1 != null)
            {
              localObject1 = "customData";
              localObject2 = this.zzaaU;
              localJSONObject.put((String)localObject1, localObject2);
            }
            return localJSONObject;
            localObject1 = "edgeType";
            localObject2 = "NONE";
            localJSONObject.put((String)localObject1, localObject2);
          }
          break;
        }
        break;
      }
    }
  }
  
  public void zzg(JSONObject paramJSONObject)
  {
    int i = 4;
    int j = 3;
    int k = 1;
    int m = 2;
    clear();
    double d1 = 1.0D;
    double d2 = paramJSONObject.optDouble("fontScale", d1);
    float f = (float)d2;
    this.zzaco = f;
    Object localObject = paramJSONObject.optString("foregroundColor");
    int n = zzcd((String)localObject);
    this.zzacp = n;
    localObject = paramJSONObject.optString("backgroundColor");
    n = zzcd((String)localObject);
    this.zzxO = n;
    localObject = "edgeType";
    boolean bool1 = paramJSONObject.has((String)localObject);
    String str;
    boolean bool6;
    label212:
    boolean bool3;
    if (bool1)
    {
      localObject = paramJSONObject.getString("edgeType");
      str = "NONE";
      bool6 = str.equals(localObject);
      if (bool6) {
        this.zzacq = 0;
      }
    }
    else
    {
      localObject = paramJSONObject.optString("edgeColor");
      int i1 = zzcd((String)localObject);
      this.zzacr = i1;
      localObject = "windowType";
      boolean bool2 = paramJSONObject.has((String)localObject);
      if (bool2)
      {
        localObject = paramJSONObject.getString("windowType");
        str = "NONE";
        bool6 = str.equals(localObject);
        if (!bool6) {
          break label518;
        }
        this.zzacs = 0;
      }
      localObject = paramJSONObject.optString("windowColor");
      int i2 = zzcd((String)localObject);
      this.zzact = i2;
      i2 = this.zzacs;
      if (i2 == m)
      {
        localObject = "windowRoundedCornerRadius";
        i2 = paramJSONObject.optInt((String)localObject, 0);
        this.zzacu = i2;
      }
      bool6 = false;
      str = null;
      localObject = paramJSONObject.optString("fontFamily", null);
      this.zzacv = ((String)localObject);
      localObject = "fontGenericFamily";
      bool3 = paramJSONObject.has((String)localObject);
      if (bool3)
      {
        localObject = paramJSONObject.getString("fontGenericFamily");
        str = "SANS_SERIF";
        bool6 = str.equals(localObject);
        if (!bool6) {
          break label574;
        }
        this.zzacw = 0;
      }
      label341:
      localObject = "fontStyle";
      bool3 = paramJSONObject.has((String)localObject);
      if (bool3)
      {
        localObject = paramJSONObject.getString("fontStyle");
        str = "NORMAL";
        bool6 = str.equals(localObject);
        if (!bool6) {
          break label755;
        }
        this.zzacx = 0;
      }
    }
    for (;;)
    {
      localObject = paramJSONObject.optJSONObject("customData");
      this.zzaaU = ((JSONObject)localObject);
      return;
      str = "OUTLINE";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        this.zzacq = k;
        break;
      }
      str = "DROP_SHADOW";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        this.zzacq = m;
        break;
      }
      str = "RAISED";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        this.zzacq = j;
        break;
      }
      str = "DEPRESSED";
      bool3 = str.equals(localObject);
      if (!bool3) {
        break;
      }
      this.zzacq = i;
      break;
      label518:
      str = "NORMAL";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        this.zzacs = k;
        break label212;
      }
      str = "ROUNDED_CORNERS";
      bool3 = str.equals(localObject);
      if (!bool3) {
        break label212;
      }
      this.zzacs = m;
      break label212;
      label574:
      str = "MONOSPACED_SANS_SERIF";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        this.zzacw = k;
        break label341;
      }
      str = "SERIF";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        this.zzacw = m;
        break label341;
      }
      str = "MONOSPACED_SERIF";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        this.zzacw = j;
        break label341;
      }
      str = "CASUAL";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        this.zzacw = i;
        break label341;
      }
      str = "CURSIVE";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        int i3 = 5;
        f = 7.0E-45F;
        this.zzacw = i3;
        break label341;
      }
      str = "SMALL_CAPITALS";
      boolean bool4 = str.equals(localObject);
      if (!bool4) {
        break label341;
      }
      int i4 = 6;
      f = 8.4E-45F;
      this.zzacw = i4;
      break label341;
      label755:
      str = "BOLD";
      bool6 = str.equals(localObject);
      if (bool6)
      {
        this.zzacx = k;
      }
      else
      {
        str = "ITALIC";
        bool6 = str.equals(localObject);
        if (bool6)
        {
          this.zzacx = m;
        }
        else
        {
          str = "BOLD_ITALIC";
          boolean bool5 = str.equals(localObject);
          if (bool5) {
            this.zzacx = j;
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\TextTrackStyle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */