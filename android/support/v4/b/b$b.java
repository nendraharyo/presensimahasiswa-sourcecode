package android.support.v4.b;

import android.graphics.Path;
import android.util.Log;

public class b$b
{
  public char a;
  public float[] b;
  
  b$b(char paramChar, float[] paramArrayOfFloat)
  {
    this.a = paramChar;
    this.b = paramArrayOfFloat;
  }
  
  b$b(b paramb)
  {
    char c = paramb.a;
    this.a = c;
    float[] arrayOfFloat = paramb.b;
    int i = paramb.b.length;
    arrayOfFloat = b.a(arrayOfFloat, 0, i);
    this.b = arrayOfFloat;
  }
  
  private static void a(Path paramPath, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, double paramDouble7, double paramDouble8, double paramDouble9)
  {
    int i = (int)Math.ceil(Math.abs(4.0D * paramDouble9 / 3.141592653589793D));
    int j = i;
    double d1 = Math.cos(paramDouble7);
    double d2 = Math.sin(paramDouble7);
    double d3 = Math.cos(paramDouble8);
    double d4 = Math.sin(paramDouble8);
    double d5 = paramDouble3;
    double d6 = -paramDouble3 * d1 * d4;
    double d7 = paramDouble4 * d2 * d3;
    d6 -= d7;
    d7 = -paramDouble3 * d2;
    d4 *= d7;
    d7 = paramDouble4 * d1;
    d3 *= d7;
    d4 += d3;
    d3 = i;
    double d8 = paramDouble9 / d3;
    int k = 0;
    int m = 0;
    d3 = d4;
    d4 = d6;
    for (;;)
    {
      i = j;
      if (m >= j) {
        break;
      }
      double d9 = paramDouble8 + d8;
      d6 = Math.sin(d9);
      double d10 = Math.cos(d9);
      double d11 = paramDouble3 * d1 * d10 + paramDouble1;
      double d12 = paramDouble4 * d2 * d6;
      double d13 = d11 - d12;
      d11 = paramDouble3 * d2 * d10 + paramDouble2;
      d12 = paramDouble4 * d1 * d6 + d11;
      d5 = paramDouble3;
      d11 = -paramDouble3 * d1 * d6;
      double d14 = paramDouble4 * d2 * d10;
      d11 -= d14;
      d5 = -paramDouble3;
      d14 = d5;
      d14 = d5 * d2;
      d6 *= d14;
      d14 = paramDouble4 * d1;
      d10 = d10 * d14 + d6;
      d6 = Math.tan((d9 - paramDouble8) / 2.0D);
      d14 = Math.sin(d9 - paramDouble8);
      double d15 = 3.0D * d6;
      d6 = (Math.sqrt(d6 * d15 + 4.0D) - 1.0D) * d14 / 3.0D;
      d4 = d4 * d6 + paramDouble5;
      d3 *= d6;
      d14 = paramDouble6 + d3;
      d3 = d6 * d11;
      double d16 = d13 - d3;
      d3 = d6 * d10;
      d6 = d12 - d3;
      paramPath.rLineTo(0.0F, 0.0F);
      float f1 = (float)d4;
      d5 = d14;
      float f2 = (float)d14;
      d5 = d16;
      float f3 = (float)d16;
      float f4 = (float)d6;
      d5 = d13;
      float f5 = (float)d13;
      d5 = d12;
      float f6 = (float)d12;
      paramPath.cubicTo(f1, f2, f3, f4, f5, f6);
      k = m + 1;
      m = k;
      d4 = d11;
      paramDouble8 = d9;
      paramDouble6 = d12;
      paramDouble5 = d13;
      d3 = d10;
    }
  }
  
  private static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
  {
    double d1 = Math.toRadians(paramFloat7);
    double d2 = Math.cos(d1);
    double d3 = Math.sin(d1);
    double d4 = paramFloat1 * d2;
    double d5 = paramFloat2 * d3;
    d4 += d5;
    d5 = paramFloat5;
    double d6 = d4 / d5;
    d4 = -paramFloat1 * d3;
    d5 = paramFloat2 * d2;
    d4 += d5;
    d5 = paramFloat6;
    double d7 = d4 / d5;
    d4 = paramFloat3 * d2;
    d5 = paramFloat4 * d3;
    d4 += d5;
    d5 = paramFloat5;
    double d8 = d4 / d5;
    float f1 = -paramFloat3;
    d4 = f1 * d3;
    d5 = paramFloat4 * d2;
    d4 += d5;
    d5 = paramFloat6;
    double d9 = d4 / d5;
    d4 = d6 - d8;
    d5 = d7 - d9;
    double d10 = (d6 + d8) / 2.0D;
    double d11 = (d7 + d9) / 2.0D;
    double d12 = d4 * d4;
    double d13 = d5 * d5;
    d12 += d13;
    d13 = 0.0D;
    boolean bool1 = d12 < d13;
    Object localObject1;
    Object localObject2;
    if (!bool1)
    {
      localObject1 = "PathParser";
      localObject2 = " Points are coincident";
      Log.w((String)localObject1, (String)localObject2);
    }
    for (;;)
    {
      return;
      d13 = 1.0D / d12 - 0.25D;
      double d14 = 0.0D;
      boolean bool2 = d13 < d14;
      if (!bool2) {
        break;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "Points are too far apart ";
      localObject2 = str + d12;
      Log.w("PathParser", (String)localObject2);
      d4 = Math.sqrt(d12);
      d5 = 1.99999D;
      d4 /= d5;
      f1 = (float)d4;
      float f2 = paramFloat5 * f1;
      float f3 = paramFloat6 * f1;
      localObject1 = paramPath;
      a(paramPath, paramFloat1, paramFloat2, paramFloat3, paramFloat4, f2, f3, paramFloat7, paramBoolean1, paramBoolean2);
    }
    d12 = Math.sqrt(d13);
    d4 *= d12;
    d5 *= d12;
    label422:
    boolean bool3;
    if (paramBoolean1 == paramBoolean2)
    {
      d5 = d10 - d5;
      d4 += d11;
      d7 -= d4;
      d6 -= d5;
      d10 = Math.atan2(d7, d6);
      d6 = d9 - d4;
      d7 = d8 - d5;
      d9 = Math.atan2(d6, d7) - d10;
      d6 = 0.0D;
      bool3 = d9 < d6;
      if (bool3) {
        break label648;
      }
      bool3 = true;
      label489:
      if (paramBoolean2 != bool3)
      {
        d6 = 0.0D;
        bool3 = d9 < d6;
        if (!bool3) {
          break label654;
        }
        d6 = 6.283185307179586D;
      }
    }
    for (d9 -= d6;; d9 += d6)
    {
      d6 = paramFloat5 * d5;
      d5 = paramFloat6;
      d4 *= d5;
      d5 = d6 * d2;
      d7 = d4 * d3;
      d5 -= d7;
      d6 *= d3;
      d4 *= d2;
      d6 += d4;
      d2 = paramFloat5;
      d3 = paramFloat6;
      d7 = paramFloat1;
      d8 = paramFloat2;
      localObject2 = paramPath;
      a(paramPath, d5, d6, d2, d3, d7, d8, d1, d10, d9);
      break;
      d5 += d10;
      d4 = d11 - d4;
      break label422;
      label648:
      bool3 = false;
      break label489;
      label654:
      d6 = 6.283185307179586D;
    }
  }
  
  private static void a(Path paramPath, float[] paramArrayOfFloat1, char paramChar1, char paramChar2, float[] paramArrayOfFloat2)
  {
    char c1 = '\002';
    float f1 = 2.8E-45F;
    float f2 = paramArrayOfFloat1[0];
    float f3 = paramArrayOfFloat1[1];
    float f4 = paramArrayOfFloat1[2];
    char c2 = '\003';
    float f5 = paramArrayOfFloat1[c2];
    float f6 = paramArrayOfFloat1[4];
    char c3 = '\005';
    float f7 = paramArrayOfFloat1[c3];
    char c4;
    char c5;
    float f8;
    float f9;
    float f10;
    float f11;
    label245:
    char c6;
    int i1;
    switch (paramChar2)
    {
    default: 
      c4 = c1;
      c1 = '\000';
      f1 = 0.0F;
      c5 = '\000';
      f8 = f7;
      f9 = f6;
      f10 = f3;
      f11 = f2;
      c3 = paramArrayOfFloat2.length;
      if (c5 < c3) {
        switch (paramChar2)
        {
        default: 
          f7 = f8;
          f6 = f9;
          f3 = f4;
          f2 = f10;
          f1 = f11;
          f4 = f5;
        }
      }
      break;
    case 'Z': 
    case 'z': 
    case 'L': 
    case 'M': 
    case 'T': 
    case 'l': 
    case 'm': 
    case 't': 
    case 'H': 
    case 'V': 
    case 'h': 
    case 'v': 
    case 'C': 
    case 'c': 
    case 'Q': 
    case 'S': 
    case 'q': 
    case 's': 
    case 'A': 
    case 'a': 
      for (;;)
      {
        c2 = c5 + c4;
        c5 = c2;
        f8 = f7;
        f9 = f6;
        f10 = f2;
        f11 = f1;
        paramChar1 = paramChar2;
        f5 = f4;
        f4 = f3;
        break label245;
        paramPath.close();
        paramPath.moveTo(f6, f7);
        f5 = f7;
        f4 = f6;
        f3 = f7;
        f2 = f6;
        c4 = c1;
        break;
        c1 = '\002';
        f1 = 2.8E-45F;
        c4 = c1;
        break;
        c1 = '\001';
        f1 = Float.MIN_VALUE;
        c4 = c1;
        break;
        c1 = '\006';
        f1 = 8.4E-45F;
        c4 = c1;
        break;
        c1 = '\004';
        f1 = 5.6E-45F;
        c4 = c1;
        break;
        c1 = '\007';
        f1 = 9.8E-45F;
        c4 = c1;
        break;
        c3 = c5 + '\000';
        f7 = paramArrayOfFloat2[c3];
        f6 = f11 + f7;
        c3 = c5 + '\001';
        f7 = paramArrayOfFloat2[c3] + f10;
        int n;
        if (c5 > 0)
        {
          c6 = c5 + '\000';
          f3 = paramArrayOfFloat2[c6];
          n = c5 + '\001';
          f2 = paramArrayOfFloat2[n];
          paramPath.rLineTo(f3, f2);
          f3 = f4;
          f2 = f7;
          f1 = f6;
          f7 = f8;
          f6 = f9;
          f4 = f5;
        }
        else
        {
          c6 = c5 + '\000';
          f3 = paramArrayOfFloat2[c6];
          n = c5 + '\001';
          f2 = paramArrayOfFloat2[n];
          paramPath.rMoveTo(f3, f2);
          f3 = f4;
          f2 = f7;
          f1 = f6;
          f4 = f5;
          continue;
          c3 = c5 + '\000';
          f6 = paramArrayOfFloat2[c3];
          c3 = c5 + '\001';
          f7 = paramArrayOfFloat2[c3];
          if (c5 > 0)
          {
            c6 = c5 + '\000';
            f3 = paramArrayOfFloat2[c6];
            n = c5 + '\001';
            f2 = paramArrayOfFloat2[n];
            paramPath.lineTo(f3, f2);
            f3 = f4;
            f2 = f7;
            f1 = f6;
            f7 = f8;
            f6 = f9;
            f4 = f5;
          }
          else
          {
            c6 = c5 + '\000';
            f3 = paramArrayOfFloat2[c6];
            n = c5 + '\001';
            f2 = paramArrayOfFloat2[n];
            paramPath.moveTo(f3, f2);
            f3 = f4;
            f2 = f7;
            f1 = f6;
            f4 = f5;
            continue;
            c3 = c5 + '\000';
            f7 = paramArrayOfFloat2[c3];
            i1 = c5 + '\001';
            f6 = paramArrayOfFloat2[i1];
            paramPath.rLineTo(f7, f6);
            c3 = c5 + '\000';
            f7 = paramArrayOfFloat2[c3];
            f6 = f11 + f7;
            c3 = c5 + '\001';
            f7 = paramArrayOfFloat2[c3] + f10;
            f3 = f4;
            f2 = f7;
            f1 = f6;
            f7 = f8;
            f6 = f9;
            f4 = f5;
            continue;
            c3 = c5 + '\000';
            f7 = paramArrayOfFloat2[c3];
            i1 = c5 + '\001';
            f6 = paramArrayOfFloat2[i1];
            paramPath.lineTo(f7, f6);
            c3 = c5 + '\000';
            f6 = paramArrayOfFloat2[c3];
            c3 = c5 + '\001';
            f7 = paramArrayOfFloat2[c3];
            f3 = f4;
            f2 = f7;
            f1 = f6;
            f7 = f8;
            f6 = f9;
            f4 = f5;
            continue;
            c3 = c5 + '\000';
            f7 = paramArrayOfFloat2[c3];
            i1 = 0;
            paramPath.rLineTo(f7, 0.0F);
            c3 = c5 + '\000';
            f7 = paramArrayOfFloat2[c3];
            f6 = f11 + f7;
            f7 = f8;
            f3 = f4;
            f2 = f10;
            f1 = f6;
            f4 = f5;
            f6 = f9;
            continue;
            c3 = c5 + '\000';
            f7 = paramArrayOfFloat2[c3];
            paramPath.lineTo(f7, f10);
            c3 = c5 + '\000';
            f6 = paramArrayOfFloat2[c3];
            f7 = f8;
            f3 = f4;
            f2 = f10;
            f1 = f6;
            f4 = f5;
            f6 = f9;
            continue;
            i1 = c5 + '\000';
            f6 = paramArrayOfFloat2[i1];
            paramPath.rLineTo(0.0F, f6);
            c3 = c5 + '\000';
            f7 = paramArrayOfFloat2[c3] + f10;
            f6 = f9;
            f3 = f4;
            f2 = f7;
            f1 = f11;
            f4 = f5;
            f7 = f8;
            continue;
            c3 = c5 + '\000';
            f7 = paramArrayOfFloat2[c3];
            paramPath.lineTo(f11, f7);
            c3 = c5 + '\000';
            f7 = paramArrayOfFloat2[c3];
            f6 = f9;
            f3 = f4;
            f2 = f7;
            f1 = f11;
            f4 = f5;
            f7 = f8;
            continue;
            c2 = c5 + '\000';
            f7 = paramArrayOfFloat2[c2];
            c2 = c5 + '\001';
            f4 = paramArrayOfFloat2[c2];
            c2 = c5 + '\002';
            f6 = paramArrayOfFloat2[c2];
            c2 = c5 + '\003';
            f3 = paramArrayOfFloat2[c2];
            c2 = c5 + '\004';
            f2 = paramArrayOfFloat2[c2];
            c2 = c5 + '\005';
            f1 = paramArrayOfFloat2[c2];
            paramPath.rCubicTo(f7, f4, f6, f3, f2, f1);
            c2 = c5 + '\002';
            f5 = paramArrayOfFloat2[c2];
            f4 = f11 + f5;
            c2 = c5 + '\003';
            f5 = paramArrayOfFloat2[c2] + f10;
            c3 = c5 + '\004';
            f7 = paramArrayOfFloat2[c3];
            f6 = f11 + f7;
            c3 = c5 + '\005';
            f7 = paramArrayOfFloat2[c3] + f10;
            f3 = f4;
            f2 = f7;
            f1 = f6;
            f7 = f8;
            f6 = f9;
            f4 = f5;
            continue;
            c2 = c5 + '\000';
            f7 = paramArrayOfFloat2[c2];
            c2 = c5 + '\001';
            f4 = paramArrayOfFloat2[c2];
            c2 = c5 + '\002';
            f6 = paramArrayOfFloat2[c2];
            c2 = c5 + '\003';
            f3 = paramArrayOfFloat2[c2];
            c2 = c5 + '\004';
            f2 = paramArrayOfFloat2[c2];
            c2 = c5 + '\005';
            f1 = paramArrayOfFloat2[c2];
            paramPath.cubicTo(f7, f4, f6, f3, f2, f1);
            c2 = c5 + '\004';
            f6 = paramArrayOfFloat2[c2];
            c2 = c5 + '\005';
            f7 = paramArrayOfFloat2[c2];
            c2 = c5 + '\002';
            f4 = paramArrayOfFloat2[c2];
            c2 = c5 + '\003';
            f5 = paramArrayOfFloat2[c2];
            f3 = f4;
            f2 = f7;
            f1 = f6;
            f7 = f8;
            f6 = f9;
            f4 = f5;
          }
        }
      }
      i1 = 0;
      f6 = 0.0F;
      c3 = '\000';
      f7 = 0.0F;
      c6 = 'c';
      f3 = 1.39E-43F;
      if (paramChar1 != c6)
      {
        c6 = 's';
        f3 = 1.61E-43F;
        if (paramChar1 != c6)
        {
          c6 = 'C';
          f3 = 9.4E-44F;
          if (paramChar1 != c6)
          {
            c6 = 'S';
            f3 = 1.16E-43F;
            if (paramChar1 != c6) {
              break label3375;
            }
          }
        }
      }
      f7 = f11 - f4;
      f4 = f10 - f5;
    }
    for (;;)
    {
      c2 = c5 + '\000';
      f6 = paramArrayOfFloat2[c2];
      c2 = c5 + '\001';
      f3 = paramArrayOfFloat2[c2];
      c2 = c5 + '\002';
      f2 = paramArrayOfFloat2[c2];
      c2 = c5 + '\003';
      f1 = paramArrayOfFloat2[c2];
      paramPath.rCubicTo(f7, f4, f6, f3, f2, f1);
      c2 = c5 + '\000';
      f5 = paramArrayOfFloat2[c2];
      f4 = f11 + f5;
      c2 = c5 + '\001';
      f5 = paramArrayOfFloat2[c2] + f10;
      c3 = c5 + '\002';
      f7 = paramArrayOfFloat2[c3];
      f6 = f11 + f7;
      c3 = c5 + '\003';
      f7 = paramArrayOfFloat2[c3] + f10;
      f3 = f4;
      f2 = f7;
      f1 = f6;
      f7 = f8;
      f6 = f9;
      f4 = f5;
      break;
      c3 = 'c';
      f7 = 1.39E-43F;
      if (paramChar1 != c3)
      {
        c3 = 's';
        f7 = 1.61E-43F;
        if (paramChar1 != c3)
        {
          c3 = 'C';
          f7 = 9.4E-44F;
          if (paramChar1 != c3)
          {
            c3 = 'S';
            f7 = 1.16E-43F;
            if (paramChar1 != c3) {
              break label3364;
            }
          }
        }
      }
      c3 = 1073741824;
      f7 = 2.0F * f11 - f4;
      int i2 = 1073741824;
      f4 = 2.0F * f10 - f5;
      for (;;)
      {
        c2 = c5 + '\000';
        f6 = paramArrayOfFloat2[c2];
        c2 = c5 + '\001';
        f3 = paramArrayOfFloat2[c2];
        c2 = c5 + '\002';
        f2 = paramArrayOfFloat2[c2];
        c2 = c5 + '\003';
        f1 = paramArrayOfFloat2[c2];
        paramPath.cubicTo(f7, f4, f6, f3, f2, f1);
        c2 = c5 + '\000';
        f4 = paramArrayOfFloat2[c2];
        c2 = c5 + '\001';
        f5 = paramArrayOfFloat2[c2];
        c3 = c5 + '\002';
        f6 = paramArrayOfFloat2[c3];
        c3 = c5 + '\003';
        f7 = paramArrayOfFloat2[c3];
        f3 = f4;
        f2 = f7;
        f1 = f6;
        f7 = f8;
        f6 = f9;
        f4 = f5;
        break;
        c2 = c5 + '\000';
        f5 = paramArrayOfFloat2[c2];
        c3 = c5 + '\001';
        f7 = paramArrayOfFloat2[c3];
        i2 = c5 + '\002';
        f4 = paramArrayOfFloat2[i2];
        i1 = c5 + '\003';
        f6 = paramArrayOfFloat2[i1];
        paramPath.rQuadTo(f5, f7, f4, f6);
        c2 = c5 + '\000';
        f5 = paramArrayOfFloat2[c2];
        f4 = f11 + f5;
        c2 = c5 + '\001';
        f5 = paramArrayOfFloat2[c2] + f10;
        c3 = c5 + '\002';
        f7 = paramArrayOfFloat2[c3];
        f6 = f11 + f7;
        c3 = c5 + '\003';
        f7 = paramArrayOfFloat2[c3] + f10;
        f3 = f4;
        f2 = f7;
        f1 = f6;
        f7 = f8;
        f6 = f9;
        f4 = f5;
        break;
        c2 = c5 + '\000';
        f5 = paramArrayOfFloat2[c2];
        c3 = c5 + '\001';
        f7 = paramArrayOfFloat2[c3];
        i2 = c5 + '\002';
        f4 = paramArrayOfFloat2[i2];
        i1 = c5 + '\003';
        f6 = paramArrayOfFloat2[i1];
        paramPath.quadTo(f5, f7, f4, f6);
        c2 = c5 + '\000';
        f4 = paramArrayOfFloat2[c2];
        c2 = c5 + '\001';
        f5 = paramArrayOfFloat2[c2];
        c3 = c5 + '\002';
        f6 = paramArrayOfFloat2[c3];
        c3 = c5 + '\003';
        f7 = paramArrayOfFloat2[c3];
        f3 = f4;
        f2 = f7;
        f1 = f6;
        f7 = f8;
        f6 = f9;
        f4 = f5;
        break;
        i1 = 0;
        f6 = 0.0F;
        c3 = '\000';
        f7 = 0.0F;
        c6 = 'q';
        f3 = 1.58E-43F;
        if (paramChar1 != c6)
        {
          c6 = 't';
          f3 = 1.63E-43F;
          if (paramChar1 != c6)
          {
            c6 = 'Q';
            f3 = 1.14E-43F;
            if (paramChar1 != c6)
            {
              c6 = 'T';
              f3 = 1.18E-43F;
              if (paramChar1 != c6) {
                break label3349;
              }
            }
          }
        }
        f7 = f11 - f4;
        f5 = f10 - f5;
        for (;;)
        {
          i2 = c5 + '\000';
          f4 = paramArrayOfFloat2[i2];
          i1 = c5 + '\001';
          f6 = paramArrayOfFloat2[i1];
          paramPath.rQuadTo(f7, f5, f4, f6);
          f4 = f11 + f7;
          f5 += f10;
          c3 = c5 + '\000';
          f7 = paramArrayOfFloat2[c3];
          f6 = f11 + f7;
          c3 = c5 + '\001';
          f7 = paramArrayOfFloat2[c3] + f10;
          f3 = f4;
          f2 = f7;
          f1 = f6;
          f7 = f8;
          f6 = f9;
          f4 = f5;
          break;
          c3 = 'q';
          f7 = 1.58E-43F;
          if (paramChar1 != c3)
          {
            c3 = 't';
            f7 = 1.63E-43F;
            if (paramChar1 != c3)
            {
              c3 = 'Q';
              f7 = 1.14E-43F;
              if (paramChar1 != c3)
              {
                c3 = 'T';
                f7 = 1.18E-43F;
                if (paramChar1 != c3) {
                  break label2755;
                }
              }
            }
          }
          f11 = 2.0F * f11 - f4;
          c3 = 1073741824;
          f7 = 2.0F * f10;
          f10 = f7 - f5;
          label2755:
          c2 = c5 + '\000';
          f5 = paramArrayOfFloat2[c2];
          c3 = c5 + '\001';
          f7 = paramArrayOfFloat2[c3];
          paramPath.quadTo(f11, f10, f5, f7);
          c2 = c5 + '\000';
          f6 = paramArrayOfFloat2[c2];
          c2 = c5 + '\001';
          f7 = paramArrayOfFloat2[c2];
          f4 = f10;
          f3 = f11;
          f2 = f7;
          f1 = f6;
          f7 = f8;
          f6 = f9;
          break;
          c2 = c5 + '\005';
          f6 = paramArrayOfFloat2[c2] + f11;
          c2 = c5 + '\006';
          f3 = paramArrayOfFloat2[c2] + f10;
          c2 = c5 + '\000';
          f2 = paramArrayOfFloat2[c2];
          c2 = c5 + '\001';
          f1 = paramArrayOfFloat2[c2];
          c2 = c5 + '\002';
          float f12 = paramArrayOfFloat2[c2];
          c2 = c5 + '\003';
          f5 = paramArrayOfFloat2[c2];
          c3 = '\000';
          f7 = 0.0F;
          boolean bool1 = f5 < 0.0F;
          boolean bool5;
          if (bool1)
          {
            bool5 = true;
            label2951:
            int i = c5 + '\004';
            f5 = paramArrayOfFloat2[i];
            c3 = '\000';
            f7 = 0.0F;
            boolean bool2 = f5 < 0.0F;
            if (!bool2) {
              break label3084;
            }
          }
          label3084:
          for (boolean bool6 = true;; bool6 = false)
          {
            f7 = f11;
            f4 = f10;
            a(paramPath, f11, f10, f6, f3, f2, f1, f12, bool5, bool6);
            j = c5 + '\005';
            f5 = paramArrayOfFloat2[j];
            f4 = f11 + f5;
            j = c5 + '\006';
            f5 = paramArrayOfFloat2[j] + f10;
            f7 = f8;
            f6 = f9;
            f3 = f4;
            f2 = f5;
            f1 = f4;
            f4 = f5;
            break;
            bool5 = false;
            break label2951;
          }
          int j = c5 + '\005';
          f6 = paramArrayOfFloat2[j];
          j = c5 + '\006';
          f3 = paramArrayOfFloat2[j];
          j = c5 + '\000';
          f2 = paramArrayOfFloat2[j];
          j = c5 + '\001';
          f1 = paramArrayOfFloat2[j];
          j = c5 + '\002';
          f12 = paramArrayOfFloat2[j];
          j = c5 + '\003';
          f5 = paramArrayOfFloat2[j];
          c3 = '\000';
          f7 = 0.0F;
          boolean bool3 = f5 < 0.0F;
          if (bool3)
          {
            bool5 = true;
            label3189:
            int k = c5 + '\004';
            f5 = paramArrayOfFloat2[k];
            c3 = '\000';
            f7 = 0.0F;
            boolean bool4 = f5 < 0.0F;
            if (!bool4) {
              break label3312;
            }
          }
          label3312:
          for (bool6 = true;; bool6 = false)
          {
            f7 = f11;
            f4 = f10;
            a(paramPath, f11, f10, f6, f3, f2, f1, f12, bool5, bool6);
            m = c5 + '\005';
            f4 = paramArrayOfFloat2[m];
            m = c5 + '\006';
            f5 = paramArrayOfFloat2[m];
            f7 = f8;
            f6 = f9;
            f3 = f4;
            f2 = f5;
            f1 = f4;
            f4 = f5;
            break;
            bool5 = false;
            break label3189;
          }
          paramArrayOfFloat1[0] = f11;
          paramArrayOfFloat1[1] = f10;
          paramArrayOfFloat1[2] = f4;
          paramArrayOfFloat1[3] = f5;
          paramArrayOfFloat1[4] = f9;
          paramArrayOfFloat1[5] = f8;
          return;
          label3349:
          int m = 0;
          f5 = 0.0F;
          c3 = '\000';
          f7 = 0.0F;
        }
        label3364:
        f4 = f10;
        f7 = f11;
      }
      label3375:
      i2 = 0;
      f4 = 0.0F;
      c3 = '\000';
      f7 = 0.0F;
    }
  }
  
  public static void a(b[] paramArrayOfb, Path paramPath)
  {
    float[] arrayOfFloat1 = new float[6];
    char c = 'm';
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfb.length;
      if (i >= j) {
        break;
      }
      b localb1 = paramArrayOfb[i];
      j = localb1.a;
      float[] arrayOfFloat2 = paramArrayOfb[i].b;
      a(paramPath, arrayOfFloat1, c, j, arrayOfFloat2);
      b localb2 = paramArrayOfb[i];
      c = localb2.a;
      i += 1;
    }
  }
  
  public void a(b paramb1, b paramb2, float paramFloat)
  {
    int i = 0;
    for (;;)
    {
      float[] arrayOfFloat1 = paramb1.b;
      int j = arrayOfFloat1.length;
      if (i >= j) {
        break;
      }
      arrayOfFloat1 = this.b;
      float[] arrayOfFloat2 = paramb1.b;
      float f1 = arrayOfFloat2[i];
      float f2 = 1.0F - paramFloat;
      f1 *= f2;
      float[] arrayOfFloat3 = paramb2.b;
      f2 = arrayOfFloat3[i] * paramFloat;
      f1 += f2;
      arrayOfFloat1[i] = f1;
      i += 1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\b$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */