package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public abstract class z
  extends a
{
  protected aa a;
  protected ab b;
  protected transient Paint c;
  private float d;
  private float e;
  private r f;
  private Rect g;
  private final Map h;
  private Map i;
  
  protected z()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.h = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.i = localHashMap;
  }
  
  private int a(Paint.Align paramAlign)
  {
    int j = 4;
    Paint.Align localAlign = Paint.Align.LEFT;
    if (paramAlign == localAlign) {
      j = -j;
    }
    return j;
  }
  
  private List a(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramList);
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Double localDouble = (Double)localIterator.next();
      boolean bool2 = localDouble.isNaN();
      if (bool2) {
        localArrayList.remove(localDouble);
      }
    }
    return localArrayList;
  }
  
  private void a(Canvas paramCanvas, float paramFloat, boolean paramBoolean)
  {
    float f1 = 1.0F;
    float f2;
    float f3;
    r localr1;
    if (paramBoolean)
    {
      f2 = this.d;
      f2 = f1 / f2;
      f3 = this.d;
      paramCanvas.scale(f2, f3);
      f2 = this.e;
      f3 = -this.e;
      paramCanvas.translate(f2, f3);
      f2 = -paramFloat;
      localr1 = this.f;
      f3 = localr1.a();
      r localr2 = this.f;
      f1 = localr2.b();
      paramCanvas.rotate(f2, f3, f1);
    }
    for (;;)
    {
      return;
      r localr3 = this.f;
      f2 = localr3.a();
      localr1 = this.f;
      f3 = localr1.b();
      paramCanvas.rotate(paramFloat, f2, f3);
      f2 = -this.e;
      f3 = this.e;
      paramCanvas.translate(f2, f3);
      f2 = this.d;
      f3 = this.d;
      f3 = f1 / f3;
      paramCanvas.scale(f2, f3);
    }
  }
  
  private void a(Paint.Cap paramCap, Paint.Join paramJoin, float paramFloat, Paint.Style paramStyle, PathEffect paramPathEffect, Paint paramPaint)
  {
    paramPaint.setStrokeCap(paramCap);
    paramPaint.setStrokeJoin(paramJoin);
    paramPaint.setStrokeMiter(paramFloat);
    paramPaint.setPathEffect(paramPathEffect);
    paramPaint.setStyle(paramStyle);
  }
  
  public ab a()
  {
    return this.b;
  }
  
  public v a(r paramr)
  {
    Object localObject1 = this.i;
    int k;
    int m;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.i;
      int j = ((Map)localObject1).size();
      k = j + -1;
      if (k >= 0)
      {
        m = 0;
        localObject1 = this.i;
        localObject2 = Integer.valueOf(k);
        localObject1 = ((Map)localObject1).get(localObject2);
        if (localObject1 != null)
        {
          localObject1 = this.i;
          localObject2 = Integer.valueOf(k);
          localObject1 = (List)((Map)localObject1).get(localObject2);
          localObject2 = ((List)localObject1).iterator();
          label91:
          boolean bool1 = ((Iterator)localObject2).hasNext();
          if (bool1)
          {
            localObject1 = (f)((Iterator)localObject2).next();
            if (localObject1 != null)
            {
              RectF localRectF = ((f)localObject1).a();
              if (localRectF != null)
              {
                float f1 = paramr.a();
                float f2 = paramr.b();
                boolean bool2 = localRectF.contains(f1, f2);
                if (bool2)
                {
                  localObject2 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/v;
                  double d1 = ((f)localObject1).b();
                  double d2 = ((f)localObject1).c();
                  ((v)localObject2).<init>(k, m, d1, d2);
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return (v)localObject2;
      m += 1;
      break label91;
      k += -1;
      break;
      localObject2 = super.a(paramr);
    }
  }
  
  protected List a(double paramDouble1, double paramDouble2, int paramInt)
  {
    return l.a(paramDouble1, paramDouble2, paramInt);
  }
  
  protected Map a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, int paramInt)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    int j = 0;
    while (j < paramInt)
    {
      Integer localInteger = Integer.valueOf(j);
      double d1 = paramArrayOfDouble1[j];
      double d2 = paramArrayOfDouble2[j];
      int k = this.b.U();
      List localList = l.a(d1, d2, k);
      localList = a(localList);
      localHashMap.put(localInteger, localList);
      j += 1;
    }
    return localHashMap;
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint paramPaint)
  {
    Object localObject1 = this;
    boolean bool1 = this.b.z();
    localObject1 = paramPaint;
    paramPaint.setAntiAlias(bool1);
    localObject1 = this;
    Object localObject2 = this.b;
    int i3 = paramInt4 / 5;
    Object localObject5 = this.b;
    float f1 = ((ab)localObject5).R();
    int i9 = a((g)localObject2, i3, f1);
    int[] arrayOfInt = this.b.K();
    int j = arrayOfInt[1];
    int i10 = paramInt1 + j;
    j = arrayOfInt[0];
    int i11 = paramInt2 + j;
    j = paramInt1 + paramInt3;
    float f2 = 4.2E-45F;
    i3 = arrayOfInt[3];
    int i12 = j - i3;
    int i14 = this.a.a();
    int i15 = i14;
    String[] arrayOfString = new String[i14];
    j = 0;
    float f3 = 0.0F;
    localObject2 = null;
    Object localObject6;
    for (;;)
    {
      i15 = i14;
      if (j >= i14) {
        break;
      }
      localObject1 = this;
      localObject6 = this.a.a(j).b();
      arrayOfString[j] = localObject6;
      j += 1;
    }
    localObject1 = this;
    localObject2 = this.b;
    boolean bool2 = ((ab)localObject2).u();
    float f4;
    int i17;
    int i19;
    Object localObject7;
    if (bool2)
    {
      localObject2 = this.b;
      bool2 = ((ab)localObject2).t();
      if (bool2)
      {
        localObject5 = this.b;
        boolean bool10 = true;
        f4 = Float.MIN_VALUE;
        localObject2 = this;
        localObject6 = paramCanvas;
        i17 = paramInt2;
        i19 = paramInt4;
        localObject7 = paramPaint;
        i9 = a(paramCanvas, (g)localObject5, arrayOfString, i10, i12, paramInt2, paramInt3, paramInt4, i9, paramPaint, bool10);
      }
    }
    for (int i20 = i9;; i20 = i9)
    {
      int k = paramInt2 + paramInt4;
      f2 = 2.8E-45F;
      i3 = arrayOfInt[2];
      k = k - i3 - i20;
      localObject1 = this;
      localObject6 = this.g;
      if (localObject6 == null)
      {
        localObject6 = new android/graphics/Rect;
        ((Rect)localObject6).<init>();
        this.g = ((Rect)localObject6);
      }
      localObject1 = this;
      localObject6 = this.g;
      i15 = i11;
      ((Rect)localObject6).set(i10, i11, i12, k);
      Object localObject8 = this.b;
      Object localObject9 = null;
      int i21 = 0;
      Object localObject10 = this;
      Object localObject11 = paramCanvas;
      i9 = paramInt1;
      int i22 = paramInt2;
      int i16 = paramInt3;
      int i24 = paramInt4;
      a((g)localObject8, paramCanvas, paramInt1, paramInt2, paramInt3, paramInt4, paramPaint, false, 0);
      localObject6 = paramPaint.getTypeface();
      int i4;
      int i25;
      if (localObject6 != null)
      {
        localObject6 = this.b.x();
        boolean bool5;
        if (localObject6 != null)
        {
          localObject6 = paramPaint.getTypeface();
          localObject5 = this.b.x();
          bool5 = ((Typeface)localObject6).equals(localObject5);
          if (bool5) {}
        }
        else
        {
          localObject6 = paramPaint.getTypeface().toString();
          localObject1 = this;
          localObject5 = this.b.v();
          bool5 = ((String)localObject6).equals(localObject5);
          if (bool5)
          {
            localObject6 = paramPaint.getTypeface();
            i4 = ((Typeface)localObject6).getStyle();
            localObject5 = this.b;
            i25 = ((ab)localObject5).w();
            if (i4 == i25) {
              break label586;
            }
          }
        }
      }
      localObject1 = this;
      localObject6 = this.b.x();
      label586:
      ab.a locala;
      int i26;
      if (localObject6 != null)
      {
        localObject6 = this.b.x();
        localObject1 = paramPaint;
        paramPaint.setTypeface((Typeface)localObject6);
        localObject1 = this;
        locala = this.b.O();
        localObject6 = ab.a.b;
        localObject1 = locala;
        if (locala != localObject6) {
          break label6814;
        }
        i12 -= i20;
        i4 = i20 + -20;
        i26 = k + i4;
      }
      label2496:
      label2574:
      label3777:
      label4476:
      int i13;
      for (int i27 = i12;; i27 = i13)
      {
        int i28 = locala.a();
        k = 90;
        f3 = 1.26E-43F;
        i15 = i28;
        if (i28 == k)
        {
          k = 1;
          f3 = Float.MIN_VALUE;
        }
        int n;
        for (int i29 = k;; i29 = 0)
        {
          i15 = paramInt4;
          f3 = paramInt4;
          i15 = paramInt3;
          f2 = paramInt3;
          f3 /= f2;
          localObject1 = this;
          this.d = f3;
          f3 = Math.abs(paramInt3 - paramInt4) / 2;
          this.e = f3;
          f3 = this.d;
          i4 = 1065353216;
          f2 = 1.0F;
          int m = f3 < f2;
          if (m < 0)
          {
            f3 = this.e;
            i4 = -1082130432;
            f2 = -1.0F;
            f3 *= f2;
            this.e = f3;
          }
          localObject2 = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/r;
          i4 = (paramInt1 + paramInt3) / 2;
          f2 = i4;
          i25 = (paramInt2 + paramInt4) / 2;
          f1 = i25;
          ((r)localObject2).<init>(f2, f1);
          localObject1 = this;
          this.f = ((r)localObject2);
          if (i29 != 0)
          {
            i15 = i28;
            f3 = i28;
            i4 = 0;
            f2 = 0.0F;
            localObject6 = null;
            a(paramCanvas, f3, false);
          }
          i4 = -2147483647;
          f2 = -1.4E-45F;
          m = 0;
          f3 = 0.0F;
          localObject2 = null;
          for (;;)
          {
            i15 = i14;
            if (m >= i14) {
              break;
            }
            localObject1 = this;
            localObject5 = this.a.a(m);
            i25 = ((ac)localObject5).a();
            i4 = Math.max(i4, i25);
            m += 1;
          }
          localObject6 = this.b.v();
          localObject5 = this.b;
          i25 = ((ab)localObject5).w();
          localObject6 = Typeface.create((String)localObject6, i25);
          localObject1 = paramPaint;
          paramPaint.setTypeface((Typeface)localObject6);
          break;
          n = 0;
          f3 = 0.0F;
          localObject2 = null;
        }
        int i30 = i4 + 1;
        if (i30 < 0) {}
        label4830:
        label5032:
        label5176:
        label5390:
        label5909:
        label6010:
        int i2;
        label6154:
        label6439:
        label6574:
        label6586:
        label6706:
        label6812:
        for (;;)
        {
          return;
          i15 = i30;
          double[] arrayOfDouble1 = new double[i30];
          double[] arrayOfDouble2 = new double[i30];
          double[] arrayOfDouble3 = new double[i30];
          localObject1 = new double[i30];
          Object localObject12 = localObject1;
          localObject5 = new boolean[i30];
          Object localObject13 = new boolean[i30];
          localObject10 = new boolean[i30];
          localObject8 = new boolean[i30];
          n = 0;
          f3 = 0.0F;
          localObject2 = null;
          double d1;
          float f5;
          for (;;)
          {
            i15 = i30;
            if (n >= i30) {
              break;
            }
            localObject1 = this;
            d1 = this.b.f(n);
            arrayOfDouble1[n] = d1;
            d1 = this.b.h(n);
            arrayOfDouble2[n] = d1;
            d1 = this.b.j(n);
            arrayOfDouble3[n] = d1;
            d1 = this.b.l(n);
            localObject12[n] = d1;
            i5 = this.b.g(n);
            localObject5[n] = i5;
            i5 = this.b.i(n);
            localObject13[n] = i5;
            i5 = this.b.k(n);
            localObject10[n] = i5;
            i5 = this.b.m(n);
            localObject8[n] = i5;
            localObject6 = this.h;
            localObject11 = Integer.valueOf(n);
            localObject6 = ((Map)localObject6).get(localObject11);
            if (localObject6 == null)
            {
              localObject6 = this.h;
              localObject11 = Integer.valueOf(n);
              i9 = 4;
              f5 = 5.6E-45F;
              localObject14 = new double[i9];
              ((Map)localObject6).put(localObject11, localObject14);
            }
            n += 1;
          }
          double[] arrayOfDouble4 = new double[i30];
          localObject1 = new double[i30];
          Object localObject15 = localObject1;
          n = 0;
          f3 = 0.0F;
          localObject2 = null;
          int i5 = 0;
          localObject6 = null;
          f2 = 0.0F;
          i15 = i14;
          double d2;
          float f6;
          double d3;
          float f7;
          if (i5 < i14)
          {
            localObject1 = this;
            localObject2 = this.a;
            localObject11 = ((aa)localObject2).a(i5);
            i9 = ((ac)localObject11).a();
            n = ((ac)localObject11).d();
            if (n == 0) {}
            for (;;)
            {
              n = i5 + 1;
              i5 = n;
              break;
              n = localObject5[i9];
              if (n == 0)
              {
                d2 = ((ac)localObject11).e();
                d2 = Math.min(arrayOfDouble1[i9], d2);
                arrayOfDouble1[i9] = d2;
                localObject2 = this.h;
                localObject7 = Integer.valueOf(i9);
                localObject2 = (double[])((Map)localObject2).get(localObject7);
                i22 = 0;
                f6 = 0.0F;
                localObject7 = null;
                d3 = arrayOfDouble1[i9];
                localObject2[0] = d3;
              }
              n = localObject13[i9];
              if (n == 0)
              {
                d2 = ((ac)localObject11).g();
                d2 = Math.max(arrayOfDouble2[i9], d2);
                arrayOfDouble2[i9] = d2;
                localObject1 = this;
                localObject2 = this.h;
                localObject7 = Integer.valueOf(i9);
                localObject2 = (double[])((Map)localObject2).get(localObject7);
                i22 = 1;
                f6 = Float.MIN_VALUE;
                d3 = arrayOfDouble2[i9];
                localObject2[i22] = d3;
              }
              n = localObject10[i9];
              if (n == 0)
              {
                d2 = ((ac)localObject11).f();
                d3 = arrayOfDouble3[i9];
                f3 = (float)d2;
                d2 = f3;
                d2 = Math.min(d3, d2);
                arrayOfDouble3[i9] = d2;
                localObject1 = this;
                localObject2 = this.h;
                localObject7 = Integer.valueOf(i9);
                localObject2 = (double[])((Map)localObject2).get(localObject7);
                i22 = 2;
                f6 = 2.8E-45F;
                d3 = arrayOfDouble3[i9];
                localObject2[i22] = d3;
              }
              n = localObject8[i9];
              if (n == 0)
              {
                d2 = ((ac)localObject11).h();
                d3 = localObject12[i9];
                f3 = (float)d2;
                d2 = f3;
                d2 = Math.max(d3, d2);
                localObject12[i9] = d2;
                localObject1 = this;
                localObject2 = this.h;
                localObject11 = Integer.valueOf(i9);
                localObject2 = (double[])((Map)localObject2).get(localObject11);
                i19 = 3;
                f7 = 4.2E-45F;
                d2 = localObject12[i9];
                localObject2[i19] = d2;
              }
            }
          }
          n = 0;
          f3 = 0.0F;
          localObject2 = null;
          double d4;
          for (;;)
          {
            i15 = i30;
            if (n >= i30) {
              break;
            }
            d4 = arrayOfDouble2[n];
            d1 = arrayOfDouble1[n];
            d4 -= d1;
            d1 = 0.0D;
            boolean bool6 = d4 < d1;
            if (bool6)
            {
              int i6 = i27 - i10;
              d4 = i6;
              d1 = arrayOfDouble2[n];
              d2 = arrayOfDouble1[n];
              d1 -= d2;
              d4 /= d1;
              arrayOfDouble4[n] = d4;
            }
            d4 = localObject12[n];
            d1 = arrayOfDouble3[n];
            d4 -= d1;
            d1 = 0.0D;
            boolean bool7 = d4 < d1;
            if (bool7)
            {
              i7 = i26 - i11;
              d4 = i7;
              d1 = localObject12[n];
              d2 = arrayOfDouble3[n];
              d1 -= d2;
              f2 = (float)(d4 / d1);
              d4 = f2;
              localObject15[n] = d4;
            }
            if (n > 0)
            {
              d4 = arrayOfDouble4[0];
              arrayOfDouble4[n] = d4;
              d4 = arrayOfDouble1[0];
              arrayOfDouble1[n] = d4;
              i7 = 0;
              f2 = 0.0F;
              localObject6 = null;
              d4 = arrayOfDouble2[0];
              arrayOfDouble2[n] = d4;
            }
            n += 1;
          }
          n = 0;
          localObject2 = null;
          f3 = 0.0F;
          int i7 = 0;
          localObject6 = null;
          f2 = 0.0F;
          i15 = i14;
          if (i7 < i14)
          {
            localObject1 = this;
            localObject5 = this.a.a(i7);
            i25 = ((ac)localObject5).d();
            if (i25 == 0) {}
            for (;;)
            {
              i7 += 1;
              break;
              n = 1;
              f3 = Float.MIN_VALUE;
            }
          }
          localObject1 = this;
          localObject6 = this.b;
          boolean bool8 = ((ab)localObject6).k();
          int i31;
          int i32;
          boolean bool9;
          double d5;
          float f8;
          double d6;
          int i33;
          if ((bool8) && (n != 0))
          {
            n = 1;
            f3 = Float.MIN_VALUE;
            i25 = n;
            f1 = f3;
            localObject1 = this;
            i31 = this.b.o();
            localObject2 = this.b;
            i32 = ((ab)localObject2).p();
            if ((i31 != 0) || (i32 != 0))
            {
              d4 = arrayOfDouble1[0];
              n = 0;
              f3 = 0.0F;
              d1 = arrayOfDouble2[0];
              localObject1 = this;
              i22 = this.b.S();
              localObject13 = this;
              localObject2 = a(d4, d1, i22);
              localObject8 = a((List)localObject2);
              localObject2 = a(arrayOfDouble3, (double[])localObject12, i30);
              localObject6 = this.b;
              bool8 = ((ab)localObject6).l();
              localObject13 = this.b;
              bool9 = ((ab)localObject13).m();
              localObject10 = this.b;
              i19 = 0;
              f7 = 0.0F;
              localObject11 = null;
              ((ab)localObject10).a(false);
              localObject10 = this.c;
              if (localObject10 == null)
              {
                localObject10 = new android/graphics/Paint;
                i19 = 1;
                f7 = Float.MIN_VALUE;
                ((Paint)localObject10).<init>(i19);
                this.c = ((Paint)localObject10);
              }
              localObject1 = this;
              localObject11 = this.b.T();
              d3 = arrayOfDouble4[0];
              d5 = arrayOfDouble1[0];
              i17 = 0;
              f8 = 0.0F;
              d6 = arrayOfDouble2[0];
              localObject10 = this;
              localObject14 = paramCanvas;
              localObject7 = paramPaint;
              i16 = i10;
              i24 = i11;
              a((List)localObject8, (Double[])localObject11, paramCanvas, paramPaint, i10, i11, i26, d3, d5, d6);
              localObject8 = localObject2;
              localObject11 = paramCanvas;
              localObject14 = paramPaint;
              i22 = i30;
              i24 = i27;
              localObject9 = localObject15;
              a((Map)localObject2, paramCanvas, paramPaint, i30, i10, i27, i26, (double[])localObject15, arrayOfDouble3);
              localObject2 = this.b;
              ((ab)localObject2).a(bool8, bool9);
            }
            localObject2 = new java/util/HashMap;
            ((HashMap)localObject2).<init>();
            localObject1 = this;
            this.i = ((Map)localObject2);
            i33 = 0;
            i15 = i33;
            if (i33 >= i14) {
              break label3777;
            }
            localObject1 = this;
            localObject2 = this.a;
            localObject13 = ((aa)localObject2).a(i33);
            i24 = ((ac)localObject13).a();
            n = ((ac)localObject13).d();
            if (n != 0) {
              break label2574;
            }
          }
          Object localObject16;
          float f9;
          int i8;
          float f10;
          boolean bool11;
          for (;;)
          {
            i33 += 1;
            break label2496;
            n = 0;
            f3 = 0.0F;
            localObject2 = null;
            i25 = 0;
            localObject5 = null;
            f1 = 0.0F;
            break;
            localObject16 = (ad)this.b.a(i33);
            ArrayList localArrayList = new java/util/ArrayList;
            localArrayList.<init>();
            localObject17 = new java/util/ArrayList;
            ((ArrayList)localObject17).<init>();
            i15 = i26;
            f3 = i26;
            d4 = i26;
            d1 = localObject15[i24];
            d2 = arrayOfDouble3[i24];
            d1 *= d2;
            d4 += d1;
            f2 = (float)d4;
            f9 = Math.min(f3, f2);
            LinkedList localLinkedList = new java/util/LinkedList;
            localLinkedList.<init>();
            localObject2 = this.i;
            localObject6 = Integer.valueOf(i33);
            localObject1 = localLinkedList;
            ((Map)localObject2).put(localObject6, localLinkedList);
            boolean bool12;
            int i34;
            for (;;)
            {
              boolean bool3;
              double d7;
              try
              {
                d4 = arrayOfDouble1[i24];
                d1 = arrayOfDouble2[i24];
                bool12 = ((ad)localObject16).h();
                localObject2 = ((ac)localObject13).a(d4, d1, bool12);
                i34 = -1;
                localObject2 = ((SortedMap)localObject2).entrySet();
                Iterator localIterator = ((Set)localObject2).iterator();
                bool3 = localIterator.hasNext();
                if (!bool3) {
                  break;
                }
                localObject2 = localIterator.next();
                localObject2 = (Map.Entry)localObject2;
                localObject6 = ((Map.Entry)localObject2).getKey();
                localObject6 = (Double)localObject6;
                d4 = ((Double)localObject6).doubleValue();
                localObject6 = ((Map.Entry)localObject2).getValue();
                localObject6 = (Double)localObject6;
                d1 = ((Double)localObject6).doubleValue();
                if (i34 < 0)
                {
                  localObject1 = this;
                  bool8 = a(d1);
                  if (bool8)
                  {
                    bool8 = c();
                    if (!bool8) {}
                  }
                  else
                  {
                    i34 = ((ac)localObject13).a(d4);
                  }
                }
                localObject6 = ((Map.Entry)localObject2).getKey();
                localObject1 = localObject17;
                ((List)localObject17).add(localObject6);
                localObject2 = ((Map.Entry)localObject2).getValue();
                ((List)localObject17).add(localObject2);
                localObject1 = this;
                bool3 = a(d1);
                if (!bool3)
                {
                  d7 = i10;
                  d2 = arrayOfDouble4[i24];
                  d3 = arrayOfDouble1[i24];
                  d4 = (d4 - d3) * d2;
                  d7 += d4;
                  f3 = (float)d7;
                  localObject2 = Float.valueOf(f3);
                  localObject1 = localArrayList;
                  localArrayList.add(localObject2);
                  i15 = i26;
                  d7 = i26;
                  d4 = localObject15[i24];
                  d2 = arrayOfDouble3[i24];
                  d1 -= d2;
                  d4 *= d1;
                  d7 -= d4;
                  f3 = (float)d7;
                  localObject2 = Float.valueOf(f3);
                  localArrayList.add(localObject2);
                  continue;
                }
                bool3 = c();
              }
              finally {}
              if (bool3)
              {
                d7 = i10;
                d1 = arrayOfDouble4[i24];
                d2 = arrayOfDouble1[i24];
                d4 = (d4 - d2) * d1;
                d7 += d4;
                f3 = (float)d7;
                localObject4 = Float.valueOf(f3);
                localObject1 = localArrayList;
                localArrayList.add(localObject4);
                i15 = i26;
                d7 = i26;
                d4 = localObject15[i24];
                d1 = -arrayOfDouble3[i24];
                d4 *= d1;
                d7 -= d4;
                f3 = (float)d7;
                localObject4 = Float.valueOf(f3);
                localArrayList.add(localObject4);
              }
              else
              {
                i1 = localArrayList.size();
                if (i1 > 0)
                {
                  localObject9 = this;
                  localObject18 = paramCanvas;
                  a((ac)localObject13, paramCanvas, paramPaint, localArrayList, (ad)localObject16, f9, i33, locala, i34);
                  localObject10 = this;
                  localObject8 = localArrayList;
                  localObject11 = localObject17;
                  f5 = f9;
                  bool12 = i33;
                  i16 = i34;
                  localObject4 = a(localArrayList, (List)localObject17, f9, i33, i34);
                  localObject4 = Arrays.asList((Object[])localObject4);
                  localObject1 = localLinkedList;
                  localLinkedList.addAll((Collection)localObject4);
                  localArrayList.clear();
                  ((List)localObject17).clear();
                  i34 = -1;
                }
                i1 = 0;
                f3 = 0.0F;
                localObject4 = null;
                localObject1 = localLinkedList;
                localLinkedList.add(null);
              }
            }
            i8 = ((ac)localObject13).c();
            if (i8 > 0)
            {
              i1 = ((ad)localObject16).t();
              localObject1 = paramPaint;
              paramPaint.setColor(i1);
              f3 = ((ad)localObject16).r();
              paramPaint.setTextSize(f3);
              localObject4 = ((ad)localObject16).s();
              paramPaint.setTextAlign((Paint.Align)localObject4);
              localObject9 = new android/graphics/Rect;
              ((Rect)localObject9).<init>();
              i1 = 0;
              f3 = 0.0F;
              localObject4 = null;
              while (i1 < i8)
              {
                d4 = i10;
                d1 = arrayOfDouble4[i24];
                d2 = ((ac)localObject13).b(i1);
                d5 = arrayOfDouble1[i24];
                d2 -= d5;
                d1 *= d2;
                f5 = (float)(d4 + d1);
                i15 = i26;
                d4 = i26;
                d2 = localObject15[i24];
                d5 = ((ac)localObject13).c(i1);
                double d8 = arrayOfDouble3[i24];
                d5 -= d8;
                d2 *= d5;
                d4 -= d2;
                f6 = (float)d4;
                localObject10 = ((ac)localObject13).d(i1);
                f10 = 0.0F;
                localObject8 = null;
                localObject11 = ((ac)localObject13).d(i1);
                i19 = ((String)localObject11).length();
                localObject1 = paramPaint;
                paramPaint.getTextBounds((String)localObject10, 0, i19, (Rect)localObject9);
                f8 = ((Rect)localObject9).width() + f5;
                bool11 = f5 < f8;
                if (bool11)
                {
                  f8 = paramCanvas.getHeight();
                  bool11 = f6 < f8;
                  if (bool11)
                  {
                    localObject11 = ((ac)localObject13).d(i1);
                    localObject10 = this;
                    localObject8 = paramCanvas;
                    localObject19 = paramPaint;
                    a(paramCanvas, (String)localObject11, f5, f6, paramPaint);
                  }
                }
                i1 += 1;
              }
            }
            i1 = localArrayList.size();
            if (i1 > 0)
            {
              localObject9 = this;
              localObject18 = paramCanvas;
              a((ac)localObject13, paramCanvas, paramPaint, localArrayList, (ad)localObject16, f9, i33, locala, i34);
              localObject10 = this;
              localObject8 = localArrayList;
              localObject11 = localObject17;
              f5 = f9;
              bool12 = i33;
              i16 = i34;
              localObject4 = a(localArrayList, (List)localObject17, f9, i33, i34);
              localObject4 = Arrays.asList((Object[])localObject4);
              localObject1 = localLinkedList;
              localLinkedList.addAll((Collection)localObject4);
            }
          }
          localObject1 = this;
          localObject7 = this.b;
          i21 = paramInt4 - i26;
          boolean bool15 = true;
          float f11 = Float.MIN_VALUE;
          int i35 = this.b.Z();
          Object localObject14 = this;
          Object localObject19 = paramCanvas;
          i24 = paramInt1;
          Object localObject18 = paramPaint;
          a((g)localObject7, paramCanvas, paramInt1, i26, paramInt3, i21, paramPaint, bool15, i35);
          ab localab = this.b;
          int i1 = 0;
          f3 = 0.0F;
          int i36 = arrayOfInt[0];
          boolean bool16 = true;
          localObject1 = this;
          int i37 = this.b.Z();
          Object localObject17 = paramCanvas;
          int i38 = paramInt3;
          a(localab, paramCanvas, paramInt1, paramInt2, paramInt3, i36, paramPaint, bool16, i37);
          Object localObject4 = ab.a.a;
          localObject1 = locala;
          boolean bool13;
          boolean bool14;
          float f12;
          if (locala == localObject4)
          {
            localObject1 = this;
            localab = this.b;
            i38 = i10 - paramInt1;
            i36 = paramInt4 - paramInt2;
            localObject1 = this;
            i37 = this.b.Z();
            a(localab, paramCanvas, paramInt1, paramInt2, i38, i36, paramPaint, true, i37);
            localab = this.b;
            i1 = 3;
            f3 = 4.2E-45F;
            i38 = arrayOfInt[i1];
            i36 = paramInt4 - paramInt2;
            bool16 = true;
            localObject1 = this;
            localObject4 = this.b;
            i37 = ((ab)localObject4).Z();
            a(localab, paramCanvas, i27, paramInt2, i38, i36, paramPaint, bool16, i37);
            localObject1 = this;
            bool13 = this.b.n();
            localObject4 = this.b;
            bool14 = ((ab)localObject4).s();
            if (i25 == 0) {
              break label5909;
            }
            d4 = arrayOfDouble1[0];
            i1 = 0;
            f3 = 0.0F;
            d1 = arrayOfDouble2[0];
            int i23 = this.b.S();
            localObject13 = this;
            localObject4 = a(d4, d1, i23);
            localObject8 = a((List)localObject4);
            localObject4 = a(arrayOfDouble3, (double[])localObject12, i30);
            if (i25 != 0)
            {
              i8 = this.b.af();
              localObject1 = paramPaint;
              paramPaint.setColor(i8);
              localObject1 = this;
              f2 = this.b.i();
              localObject1 = paramPaint;
              paramPaint.setTextSize(f2);
              localObject1 = this;
              localObject6 = this.b.ag();
              localObject1 = paramPaint;
              paramPaint.setTextAlign((Paint.Align)localObject6);
            }
            localObject1 = this;
            localObject6 = this.b;
            bool9 = false;
            f12 = 0.0F;
            localObject13 = null;
            ((ab)localObject6).d(false);
            localObject11 = this.b.T();
            d3 = arrayOfDouble4[0];
            d5 = arrayOfDouble1[0];
            i8 = 0;
            f2 = 0.0F;
            localObject6 = null;
            d6 = arrayOfDouble2[0];
            localObject10 = this;
            localObject14 = paramCanvas;
            localObject7 = paramPaint;
            i16 = i10;
            i24 = i11;
            a((List)localObject8, (Double[])localObject11, paramCanvas, paramPaint, i10, i11, i26, d3, d5, d6);
            localObject8 = localObject4;
            localObject11 = paramCanvas;
            localObject14 = paramPaint;
            i23 = i30;
            i24 = i27;
            localObject9 = localObject15;
            a((Map)localObject4, paramCanvas, paramPaint, i30, i10, i27, i26, (double[])localObject15, arrayOfDouble3);
            localObject4 = this.b;
            i15 = i31;
            ((ab)localObject4).b(i31);
            localObject4 = this.b;
            i15 = i32;
            ((ab)localObject4).c(i32);
            if (i25 != 0)
            {
              i1 = this.b.h();
              localObject1 = paramPaint;
              paramPaint.setColor(i1);
              i1 = 0;
              f3 = 0.0F;
              localObject4 = null;
              i8 = 0;
              localObject6 = null;
              f2 = 0.0F;
            }
          }
          else
          {
            for (;;)
            {
              i15 = i30;
              if (i8 >= i30) {
                break label5390;
              }
              localObject1 = this;
              localObject19 = this.b.u(i8);
              Double[] arrayOfDouble = this.b.n(i8);
              localObject1 = arrayOfDouble;
              i15 = arrayOfDouble.length;
              i14 = i15;
              i1 = 0;
              f3 = 0.0F;
              localObject4 = null;
              i15 = i14;
              if (i1 < i14)
              {
                localObject13 = arrayOfDouble[i1];
                d4 = arrayOfDouble3[i8];
                d1 = ((Double)localObject13).doubleValue();
                bool11 = d4 < d1;
                float f13;
                if (!bool11)
                {
                  d4 = ((Double)localObject13).doubleValue();
                  d1 = localObject12[i8];
                  bool11 = d4 < d1;
                  if (!bool11)
                  {
                    i15 = i26;
                    d4 = i26;
                    d1 = localObject15[i8];
                    d3 = ((Double)localObject13).doubleValue();
                    d5 = arrayOfDouble3[i8];
                    d3 -= d5;
                    d1 *= d3;
                    d4 -= d1;
                    f10 = (float)d4;
                    localObject1 = this;
                    localObject10 = this.b;
                    localObject18 = ((ab)localObject10).a((Double)localObject13, i8);
                    i13 = this.b.s(i8);
                    localObject1 = paramPaint;
                    paramPaint.setColor(i13);
                    localObject1 = this;
                    localObject13 = this.b.t(i8);
                    localObject1 = paramPaint;
                    paramPaint.setTextAlign((Paint.Align)localObject13);
                    localObject13 = ab.a.a;
                    localObject1 = locala;
                    if (locala != localObject13) {
                      break label5176;
                    }
                    localObject13 = Paint.Align.LEFT;
                    if (localObject19 != localObject13) {
                      break label5032;
                    }
                    if (bool13)
                    {
                      localObject1 = this;
                      i13 = a((Paint.Align)localObject19) + i10;
                      f8 = i13;
                      f7 = i10;
                      localObject13 = paramCanvas;
                      f5 = f10;
                      localObject7 = paramPaint;
                      paramCanvas.drawLine(f8, f10, f7, f10, paramPaint);
                    }
                    f12 = i10;
                    localObject1 = this;
                    localObject10 = this.b;
                    f8 = ((ab)localObject10).ai();
                    f11 = f12 - f8;
                    f12 = this.b.aj();
                    f13 = f10 - f12;
                    localObject13 = this.b;
                    f9 = ((ab)localObject13).ad();
                    localObject9 = this;
                    localObject16 = paramPaint;
                    a(paramCanvas, (String)localObject18, f11, f13, paramPaint, f9);
                    if (bool14)
                    {
                      localObject1 = this;
                      i13 = this.b.p(i8);
                      localObject1 = paramPaint;
                      paramPaint.setColor(i13);
                      f8 = i10;
                      i15 = i27;
                      f7 = i27;
                      localObject13 = paramCanvas;
                      f5 = f10;
                      localObject7 = paramPaint;
                      paramCanvas.drawLine(f8, f10, f7, f10, paramPaint);
                    }
                  }
                }
                for (;;)
                {
                  i1 += 1;
                  break label4476;
                  localObject4 = ab.a.b;
                  if (locala != localObject4) {
                    break;
                  }
                  localObject1 = this;
                  localab = this.b;
                  i38 = paramInt3 - i27;
                  i36 = paramInt4 - paramInt2;
                  localObject1 = this;
                  i37 = this.b.Z();
                  a(localab, paramCanvas, i27, paramInt2, i38, i36, paramPaint, true, i37);
                  localab = this.b;
                  i38 = i10 - paramInt1;
                  i36 = paramInt4 - paramInt2;
                  bool16 = true;
                  localObject1 = this;
                  localObject4 = this.b;
                  i37 = ((ab)localObject4).Z();
                  a(localab, paramCanvas, paramInt1, paramInt2, i38, i36, paramPaint, bool16, i37);
                  break;
                  if (bool13)
                  {
                    i15 = i27;
                    f8 = i27;
                    localObject1 = this;
                    i13 = a((Paint.Align)localObject19) + i27;
                    f7 = i13;
                    localObject13 = paramCanvas;
                    f5 = f10;
                    localObject7 = paramPaint;
                    paramCanvas.drawLine(f8, f10, f7, f10, paramPaint);
                  }
                  i15 = i27;
                  f12 = i27;
                  localObject1 = this;
                  localObject10 = this.b;
                  f8 = ((ab)localObject10).ai();
                  f11 = f12 - f8;
                  f12 = this.b.aj();
                  f13 = f10 - f12;
                  localObject13 = this.b;
                  f9 = ((ab)localObject13).ad();
                  localObject9 = this;
                  localObject16 = paramPaint;
                  a(paramCanvas, (String)localObject18, f11, f13, paramPaint, f9);
                  break label4830;
                  if (bool13)
                  {
                    localObject1 = this;
                    i13 = a((Paint.Align)localObject19);
                    i13 = i27 - i13;
                    f8 = i13;
                    i15 = i27;
                    f7 = i27;
                    localObject13 = paramCanvas;
                    f5 = f10;
                    localObject7 = paramPaint;
                    paramCanvas.drawLine(f8, f10, f7, f10, paramPaint);
                  }
                  i13 = i27 + 10;
                  float f14 = i13;
                  f11 = f14;
                  localObject1 = this;
                  f12 = this.b.aj();
                  f13 = f10 - f12;
                  localObject13 = this.b;
                  f9 = ((ab)localObject13).ad();
                  localObject9 = this;
                  localObject16 = paramPaint;
                  a(paramCanvas, (String)localObject18, f14, f13, paramPaint, f9);
                  if (bool14)
                  {
                    i13 = this.b.p(i8);
                    localObject1 = paramPaint;
                    paramPaint.setColor(i13);
                    i15 = i27;
                    f8 = i27;
                    f7 = i10;
                    localObject13 = paramCanvas;
                    f5 = f10;
                    localObject7 = paramPaint;
                    paramCanvas.drawLine(f8, f10, f7, f10, paramPaint);
                  }
                }
              }
              i1 = i8 + 1;
              i8 = i1;
            }
          }
          int i18;
          if (i25 != 0)
          {
            localObject1 = this;
            i1 = this.b.h();
            localObject1 = paramPaint;
            paramPaint.setColor(i1);
            localObject1 = this;
            f2 = this.b.R();
            localObject1 = paramPaint;
            paramPaint.setTextSize(f2);
            localObject4 = Paint.Align.CENTER;
            paramPaint.setTextAlign((Paint.Align)localObject4);
            localObject4 = ab.a.a;
            localObject1 = locala;
            if (locala == localObject4)
            {
              localObject1 = this;
              localObject8 = this.b.P();
              f7 = paramInt3 / 2 + paramInt1;
              i15 = i26;
              f3 = i26;
              f1 = this.b.i() * 4.0F;
              i13 = 1077936128;
              f12 = 3.0F;
              f1 /= f12;
              f3 += f1;
              localObject5 = this.b;
              f1 = ((ab)localObject5).ah();
              f5 = f3 + f1 + f2;
              i16 = 0;
              f4 = 0.0F;
              localObject19 = null;
              localObject13 = this;
              localObject10 = paramCanvas;
              localObject7 = paramPaint;
              a(paramCanvas, (String)localObject8, f7, f5, paramPaint, 0.0F);
              i1 = 0;
              f3 = 0.0F;
              localObject4 = null;
              i15 = i30;
              if (i1 < i30)
              {
                localObject1 = this;
                localObject5 = this.b.u(i1);
                localObject13 = Paint.Align.LEFT;
                if (localObject5 == localObject13)
                {
                  localObject5 = this.b;
                  localObject8 = ((ab)localObject5).e(i1);
                  i15 = paramInt1;
                  f1 = paramInt1;
                  f7 = f1 + f2;
                  i25 = paramInt4 / 2 + paramInt2;
                  f5 = i25;
                  i16 = -1028390912;
                  f4 = -90.0F;
                  localObject13 = this;
                  localObject10 = paramCanvas;
                  localObject7 = paramPaint;
                  a(paramCanvas, (String)localObject8, f7, f5, paramPaint, f4);
                }
                for (;;)
                {
                  i1 += 1;
                  break;
                  localObject5 = this.b;
                  localObject8 = ((ab)localObject5).e(i1);
                  f7 = paramInt1 + paramInt3;
                  i25 = paramInt4 / 2 + paramInt2;
                  f5 = i25;
                  i16 = -1028390912;
                  f4 = -90.0F;
                  localObject13 = this;
                  localObject10 = paramCanvas;
                  localObject7 = paramPaint;
                  a(paramCanvas, (String)localObject8, f7, f5, paramPaint, f4);
                }
              }
              localObject1 = this;
              f3 = this.b.b();
              localObject1 = paramPaint;
              paramPaint.setTextSize(f3);
              localObject1 = this;
              localObject4 = this.b;
              localObject8 = ((ab)localObject4).a();
              i1 = paramInt3 / 2 + paramInt1;
              f7 = i1;
              i15 = paramInt2;
              f3 = paramInt2;
              localObject6 = this.b;
              f2 = ((ab)localObject6).b();
              f5 = f3 + f2;
              i16 = 0;
              f4 = 0.0F;
              localObject19 = null;
              localObject13 = this;
              localObject10 = paramCanvas;
              localObject7 = paramPaint;
              a(paramCanvas, (String)localObject8, f7, f5, paramPaint, 0.0F);
            }
          }
          else
          {
            localObject4 = ab.a.a;
            localObject1 = locala;
            if (locala != localObject4) {
              break label6439;
            }
            localObject1 = this;
            localObject5 = this.b;
            f3 = this.b.ah();
            i1 = (int)f3;
            i18 = paramInt2 + i1;
            i16 = 0;
            f4 = 0.0F;
            localObject19 = null;
            localObject4 = this;
            localObject6 = paramCanvas;
            i13 = i27;
            i19 = paramInt4;
            i9 = i20;
            localObject7 = paramPaint;
            a(paramCanvas, (g)localObject5, arrayOfString, i10, i27, i18, paramInt3, paramInt4, i20, paramPaint, false);
            localObject1 = this;
            localObject4 = this.b;
            boolean bool4 = ((ab)localObject4).j();
            if (!bool4) {
              break label6706;
            }
            i2 = this.b.g();
            localObject1 = paramPaint;
            paramPaint.setColor(i2);
            f8 = i10;
            i15 = i26;
            f10 = i26;
            i15 = i27;
            f7 = i27;
            i15 = i26;
            f5 = i26;
            localObject13 = paramCanvas;
            localObject7 = paramPaint;
            paramCanvas.drawLine(f8, f10, f7, f5, paramPaint);
            localObject1 = this;
            i2 = this.b.f();
            localObject1 = paramPaint;
            paramPaint.setColor(i2);
            i2 = 0;
            f3 = 0.0F;
            localObject4 = null;
            i18 = 0;
            localObject10 = null;
            f8 = 0.0F;
            i8 = 0;
            localObject6 = null;
            f2 = 0.0F;
            i15 = i30;
            if ((i8 >= i30) || (i18 != 0)) {
              break label6586;
            }
            localObject1 = this;
            localObject4 = this.b.u(i8);
            localObject5 = Paint.Align.RIGHT;
            if (localObject4 != localObject5) {
              break label6574;
            }
            i2 = 1;
            f3 = Float.MIN_VALUE;
          }
          for (;;)
          {
            i8 += 1;
            i18 = i2;
            f8 = f3;
            break label6154;
            localObject4 = ab.a.b;
            if (locala != localObject4) {
              break;
            }
            localObject1 = this;
            localObject8 = this.b.P();
            f7 = paramInt3 / 2 + paramInt1;
            f3 = paramInt2 + paramInt4 - f2;
            localObject5 = this.b;
            f1 = ((ab)localObject5).ah();
            f5 = f3 + f1;
            localObject13 = this;
            localObject10 = paramCanvas;
            localObject7 = paramPaint;
            a(paramCanvas, (String)localObject8, f7, f5, paramPaint, -90.0F);
            localObject8 = this.b.Q();
            f7 = i27 + 20;
            f5 = paramInt4 / 2 + paramInt2;
            a(paramCanvas, (String)localObject8, f7, f5, paramPaint, 0.0F);
            f3 = this.b.b();
            localObject1 = paramPaint;
            paramPaint.setTextSize(f3);
            localObject1 = this;
            localObject4 = this.b;
            localObject8 = ((ab)localObject4).a();
            i15 = paramInt1;
            f3 = paramInt1;
            f7 = f3 + f2;
            i2 = paramInt4 / 2 + i11;
            f5 = i2;
            i16 = 0;
            f4 = 0.0F;
            localObject19 = null;
            a(paramCanvas, (String)localObject8, f7, f5, paramPaint, 0.0F);
            break;
            localObject4 = ab.a.b;
            if (locala != localObject4) {
              break label6010;
            }
            i15 = i28;
            f3 = i28;
            localObject1 = this;
            a(paramCanvas, f3, true);
            localObject5 = this.b;
            i2 = (int)this.b.ah();
            i18 = paramInt2 + i2;
            i16 = 0;
            f4 = 0.0F;
            localObject19 = null;
            localObject4 = this;
            localObject6 = paramCanvas;
            i13 = i27;
            i19 = paramInt4;
            i9 = i20;
            localObject7 = paramPaint;
            a(paramCanvas, (g)localObject5, arrayOfString, i10, i27, i18, paramInt3, paramInt4, i20, paramPaint, false);
            f3 = i28;
            i8 = 0;
            f2 = 0.0F;
            localObject6 = null;
            a(paramCanvas, f3, false);
            break label6010;
            i2 = 0;
            f3 = 0.0F;
            localObject4 = null;
          }
          localObject4 = ab.a.a;
          localObject1 = locala;
          float f15;
          float f16;
          if (locala == localObject4)
          {
            f2 = i10;
            i15 = i11;
            f1 = i11;
            f15 = i10;
            i15 = i26;
            f16 = i26;
            localObject4 = paramCanvas;
            localObject13 = paramPaint;
            paramCanvas.drawLine(f2, f1, f15, f16, paramPaint);
            if (i18 != 0)
            {
              i15 = i27;
              f2 = i27;
              i15 = i11;
              f1 = i11;
              i15 = i27;
              f15 = i27;
              i15 = i26;
              f16 = i26;
              paramCanvas.drawLine(f2, f1, f15, f16, paramPaint);
            }
          }
          for (;;)
          {
            if (i29 == 0) {
              break label6812;
            }
            i15 = i28;
            f3 = i28;
            i8 = 1;
            f2 = Float.MIN_VALUE;
            localObject1 = this;
            a(paramCanvas, f3, i8);
            break;
            localObject4 = ab.a.b;
            if (locala == localObject4)
            {
              i15 = i27;
              f2 = i27;
              i15 = i11;
              f1 = i11;
              i15 = i27;
              f15 = i27;
              i15 = i26;
              f16 = i26;
              localObject4 = paramCanvas;
              localObject13 = paramPaint;
              paramCanvas.drawLine(f2, f1, f15, f16, paramPaint);
            }
          }
        }
        label6814:
        i26 = i2;
      }
    }
  }
  
  public abstract void a(Canvas paramCanvas, Paint paramPaint, List paramList, ad paramad, float paramFloat, int paramInt1, int paramInt2);
  
  protected void a(Canvas paramCanvas, ac paramac, ad paramad, Paint paramPaint, List paramList, int paramInt1, int paramInt2)
  {
    int j = paramList.size();
    int i1 = 2;
    float f1 = 2.8E-45F;
    float f3;
    Object localObject;
    int i2;
    float f4;
    double d1;
    String str;
    float f5;
    int n;
    if (j > i1)
    {
      float f2 = ((Float)paramList.get(0)).floatValue();
      f1 = ((Float)paramList.get(1)).floatValue();
      j = 0;
      f3 = 0.0F;
      localObject = null;
      i2 = 0;
      j = paramList.size();
      if (i2 < j)
      {
        j = 2;
        f3 = 2.8E-45F;
        int i3;
        int k;
        if (i2 == j)
        {
          f4 = ((Float)paramList.get(2)).floatValue();
          localObject = (Float)paramList.get(0);
          f3 = ((Float)localObject).floatValue();
          f3 = Math.abs(f4 - f3);
          i3 = paramad.n();
          f4 = i3;
          boolean bool1 = f3 < f4;
          if (!bool1)
          {
            f4 = ((Float)paramList.get(3)).floatValue();
            localObject = (Float)paramList.get(1);
            f3 = ((Float)localObject).floatValue();
            f3 = Math.abs(f4 - f3);
            i3 = paramad.n();
            f4 = i3;
            bool1 = f3 < f4;
            if (!bool1) {}
          }
          else
          {
            localObject = paramad.i();
            d1 = paramac.a(paramInt2);
            str = a((NumberFormat)localObject, d1);
            f4 = ((Float)paramList.get(0)).floatValue();
            f3 = ((Float)paramList.get(1)).floatValue();
            f1 = paramad.q();
            f5 = f3 - f1;
            localObject = this;
            a(paramCanvas, str, f4, f5, paramPaint, 0.0F);
            localObject = paramad.i();
            i1 = paramInt2 + 1;
            d1 = paramac.a(i1);
            str = a((NumberFormat)localObject, d1);
            f4 = ((Float)paramList.get(2)).floatValue();
            f3 = ((Float)paramList.get(3)).floatValue();
            f1 = paramad.q();
            f5 = f3 - f1;
            localObject = this;
            a(paramCanvas, str, f4, f5, paramPaint, 0.0F);
            f2 = ((Float)paramList.get(2)).floatValue();
            k = 3;
            f3 = 4.2E-45F;
            localObject = (Float)paramList.get(k);
            f1 = ((Float)localObject).floatValue();
          }
        }
        for (;;)
        {
          k = i2 + 2;
          i2 = k;
          break;
          k = 2;
          f3 = 2.8E-45F;
          if (i2 > k)
          {
            localObject = (Float)paramList.get(i2);
            f3 = Math.abs(((Float)localObject).floatValue() - f2);
            i3 = paramad.n();
            f4 = i3;
            boolean bool2 = f3 < f4;
            if (!bool2)
            {
              int m = i2 + 1;
              localObject = (Float)paramList.get(m);
              f3 = Math.abs(((Float)localObject).floatValue() - f1);
              i3 = paramad.n();
              f4 = i3;
              boolean bool3 = f3 < f4;
              if (!bool3) {}
            }
            else
            {
              localObject = paramad.i();
              i1 = i2 / 2 + paramInt2;
              d1 = paramac.a(i1);
              str = a((NumberFormat)localObject, d1);
              f4 = ((Float)paramList.get(i2)).floatValue();
              n = i2 + 1;
              f3 = ((Float)paramList.get(n)).floatValue();
              f1 = paramad.q();
              f5 = f3 - f1;
              localObject = this;
              a(paramCanvas, str, f4, f5, paramPaint, 0.0F);
              f2 = ((Float)paramList.get(i2)).floatValue();
              n = i2 + 1;
              localObject = (Float)paramList.get(n);
              f1 = ((Float)localObject).floatValue();
            }
          }
        }
      }
    }
    else
    {
      n = 0;
      f3 = 0.0F;
      localObject = null;
      for (i2 = 0;; i2 = n)
      {
        n = paramList.size();
        if (i2 >= n) {
          break;
        }
        localObject = paramad.i();
        i1 = i2 / 2 + paramInt2;
        d1 = paramac.a(i1);
        str = a((NumberFormat)localObject, d1);
        f4 = ((Float)paramList.get(i2)).floatValue();
        n = i2 + 1;
        f3 = ((Float)paramList.get(n)).floatValue();
        f1 = paramad.q();
        f5 = f3 - f1;
        localObject = this;
        a(paramCanvas, str, f4, f5, paramPaint, 0.0F);
        n = i2 + 2;
      }
    }
  }
  
  protected void a(Canvas paramCanvas, String paramString, float paramFloat1, float paramFloat2, Paint paramPaint, float paramFloat3)
  {
    ab.a locala = this.b.O();
    int j = -locala.a();
    float f1 = j + paramFloat3;
    boolean bool = f1 < 0.0F;
    if (bool) {
      paramCanvas.rotate(f1, paramFloat1, paramFloat2);
    }
    a(paramCanvas, paramString, paramFloat1, paramFloat2, paramPaint);
    bool = f1 < 0.0F;
    if (bool)
    {
      f1 = -f1;
      paramCanvas.rotate(f1, paramFloat1, paramFloat2);
    }
  }
  
  protected void a(ac paramac, Canvas paramCanvas, Paint paramPaint, List paramList, ad paramad, float paramFloat, int paramInt1, ab.a parama, int paramInt2)
  {
    c localc = paramad.b();
    Paint.Cap localCap = paramPaint.getStrokeCap();
    Paint.Join localJoin = paramPaint.getStrokeJoin();
    float f1 = paramPaint.getStrokeMiter();
    PathEffect localPathEffect = paramPaint.getPathEffect();
    Paint.Style localStyle = paramPaint.getStyle();
    Object localObject1;
    float f3;
    if (localc != null)
    {
      localObject1 = null;
      localObject2 = localc.d();
      if (localObject2 != null)
      {
        localObject1 = new android/graphics/DashPathEffect;
        localObject2 = localc.d();
        float f2 = localc.e();
        ((DashPathEffect)localObject1).<init>((float[])localObject2, f2);
      }
      localObject3 = localc.a();
      localObject4 = localc.b();
      f3 = localc.c();
      localObject5 = Paint.Style.FILL_AND_STROKE;
      localObject2 = this;
      a((Paint.Cap)localObject3, (Paint.Join)localObject4, f3, (Paint.Style)localObject5, (PathEffect)localObject1, paramPaint);
    }
    Object localObject2 = this;
    Object localObject3 = paramCanvas;
    Object localObject4 = paramPaint;
    Object localObject5 = paramad;
    a(paramCanvas, paramPaint, paramList, paramad, paramFloat, paramInt1, paramInt2);
    b(paramCanvas, paramPaint, paramList, paramad, paramFloat, paramInt1, paramInt2);
    float f4 = paramad.o();
    paramPaint.setTextSize(f4);
    localObject2 = ab.a.a;
    if (parama == localObject2)
    {
      localObject2 = Paint.Align.CENTER;
      paramPaint.setTextAlign((Paint.Align)localObject2);
    }
    for (;;)
    {
      boolean bool = paramad.m();
      if (bool)
      {
        localObject2 = paramad.p();
        paramPaint.setTextAlign((Paint.Align)localObject2);
        localObject2 = this;
        localObject3 = paramCanvas;
        localObject4 = paramac;
        localObject5 = paramPaint;
        localObject1 = paramList;
        a(paramCanvas, paramac, paramad, paramPaint, paramList, paramInt1, paramInt2);
      }
      if (localc != null)
      {
        localObject2 = this;
        localObject3 = localCap;
        localObject4 = localJoin;
        f3 = f1;
        localObject5 = localStyle;
        localObject1 = localPathEffect;
        a(localCap, localJoin, f1, localStyle, localPathEffect, paramPaint);
      }
      return;
      localObject2 = Paint.Align.LEFT;
      paramPaint.setTextAlign((Paint.Align)localObject2);
    }
  }
  
  protected void a(List paramList, Double[] paramArrayOfDouble, Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    int j = paramList.size();
    boolean bool1 = this.b.l();
    Object localObject1 = this.b;
    boolean bool2 = ((ab)localObject1).p();
    float f1;
    if (bool2)
    {
      localObject1 = this.c;
      localObject2 = Paint.Style.STROKE;
      ((Paint)localObject1).setStyle((Paint.Style)localObject2);
      localObject1 = this.c;
      localObject2 = this.b;
      f1 = ((ab)localObject2).q();
      ((Paint)localObject1).setStrokeWidth(f1);
    }
    boolean bool3 = this.b.n();
    int k = 0;
    float f2 = 0.0F;
    localObject1 = null;
    for (int m = 0; m < j; m = k)
    {
      localObject1 = (Double)paramList.get(m);
      double d1 = ((Double)localObject1).doubleValue();
      double d2 = paramInt1;
      double d3 = (d1 - paramDouble2) * paramDouble1;
      d2 += d3;
      f1 = (float)d2;
      float f3;
      float f4;
      float f5;
      Paint localPaint;
      if (bool1)
      {
        localObject1 = this.b;
        k = ((ab)localObject1).af();
        paramPaint.setColor(k);
        if (bool3)
        {
          f3 = paramInt3;
          f2 = paramInt3;
          localObject3 = this.b;
          f4 = ((ab)localObject3).i() / 3.0F;
          f5 = f2 + f4;
          localObject1 = paramCanvas;
          f4 = f1;
          localPaint = paramPaint;
          paramCanvas.drawLine(f1, f3, f1, f5, paramPaint);
        }
        localObject1 = this.b.al();
        String str = a((NumberFormat)localObject1, d1);
        f2 = paramInt3;
        f3 = this.b.i() * 4.0F;
        f4 = 3.0F;
        f3 /= f4;
        f2 += f3;
        f3 = this.b.ah();
        float f6 = f2 + f3;
        localObject1 = this.b;
        float f7 = ((ab)localObject1).ac();
        localObject4 = this;
        localObject3 = paramCanvas;
        a(paramCanvas, str, f1, f6, paramPaint, f7);
      }
      if (bool2)
      {
        localObject1 = this.c;
        localObject4 = this.b;
        localObject3 = null;
        int n = ((ab)localObject4).p(0);
        ((Paint)localObject1).setColor(n);
        f3 = paramInt3;
        f5 = paramInt2;
        localPaint = this.c;
        localObject1 = paramCanvas;
        f4 = f1;
        paramCanvas.drawLine(f1, f3, f1, f5, localPaint);
      }
      k = m + 1;
    }
    localObject1 = this;
    Object localObject2 = paramArrayOfDouble;
    Object localObject4 = paramCanvas;
    Object localObject3 = paramPaint;
    a(paramArrayOfDouble, paramCanvas, paramPaint, bool1, paramInt1, paramInt2, paramInt3, paramDouble1, paramDouble2, paramDouble3);
  }
  
  protected void a(Map paramMap, Canvas paramCanvas, Paint paramPaint, int paramInt1, int paramInt2, int paramInt3, int paramInt4, double[] paramArrayOfDouble1, double[] paramArrayOfDouble2)
  {
    ab.a locala = this.b.O();
    Object localObject1 = this.b;
    boolean bool1 = ((ab)localObject1).o();
    Object localObject2;
    float f1;
    if (bool1)
    {
      localObject1 = this.c;
      localObject2 = Paint.Style.STROKE;
      ((Paint)localObject1).setStyle((Paint.Style)localObject2);
      localObject1 = this.c;
      localObject2 = this.b;
      f1 = ((ab)localObject2).q();
      ((Paint)localObject1).setStrokeWidth(f1);
    }
    boolean bool2 = this.b.m();
    boolean bool3 = this.b.n();
    int j = 0;
    float f2 = 0.0F;
    localObject1 = null;
    for (int k = 0; k < paramInt1; k = j)
    {
      localObject1 = this.b.t(k);
      paramPaint.setTextAlign((Paint.Align)localObject1);
      localObject1 = Integer.valueOf(k);
      localObject1 = paramMap.get(localObject1);
      Object localObject3 = localObject1;
      localObject3 = (List)localObject1;
      int m = ((List)localObject3).size();
      j = 0;
      f2 = 0.0F;
      localObject1 = null;
      int n = 0;
      if (n < m)
      {
        double d1 = ((Double)((List)localObject3).get(n)).doubleValue();
        Object localObject4 = this.b.u(k);
        localObject1 = this.b;
        localObject2 = Double.valueOf(d1);
        localObject1 = ((ab)localObject1).a((Double)localObject2, k);
        label245:
        float f3;
        float f4;
        Object localObject5;
        float f5;
        float f6;
        float f7;
        label478:
        int i1;
        if (localObject1 != null)
        {
          j = 1;
          f2 = Float.MIN_VALUE;
          double d2 = paramInt4;
          double d3 = paramArrayOfDouble1[k];
          double d4 = paramArrayOfDouble2[k];
          d4 = d1 - d4;
          d3 *= d4;
          d2 -= d3;
          f3 = (float)d2;
          localObject2 = ab.a.a;
          if (locala != localObject2) {
            break label709;
          }
          if ((bool2) && (j == 0))
          {
            j = this.b.s(k);
            paramPaint.setColor(j);
            localObject1 = Paint.Align.LEFT;
            if (localObject4 != localObject1) {
              break label569;
            }
            if (bool3)
            {
              j = a((Paint.Align)localObject4) + paramInt2;
              f1 = j;
              f4 = paramInt2;
              localObject1 = paramCanvas;
              localObject5 = paramPaint;
              paramCanvas.drawLine(f1, f3, f4, f3, paramPaint);
            }
            localObject1 = this.b.v(k);
            localObject5 = a((NumberFormat)localObject1, d1);
            f2 = paramInt2;
            localObject2 = this.b;
            f1 = ((ab)localObject2).ai();
            f5 = f2 - f1;
            f2 = this.b.aj();
            f6 = f3 - f2;
            localObject1 = this.b;
            f7 = ((ab)localObject1).ad();
            localObject4 = this;
            a(paramCanvas, (String)localObject5, f5, f6, paramPaint, f7);
          }
          if (bool1)
          {
            localObject1 = this.c;
            localObject2 = this.b;
            i1 = ((ab)localObject2).p(k);
            ((Paint)localObject1).setColor(i1);
            f1 = paramInt2;
            f4 = paramInt3;
            localObject5 = this.c;
            localObject1 = paramCanvas;
            paramCanvas.drawLine(f1, f3, f4, f3, (Paint)localObject5);
          }
        }
        for (;;)
        {
          j = n + 1;
          n = j;
          break;
          j = 0;
          f2 = 0.0F;
          localObject1 = null;
          break label245;
          label569:
          if (bool3)
          {
            f1 = paramInt3;
            j = a((Paint.Align)localObject4) + paramInt3;
            f4 = j;
            localObject1 = paramCanvas;
            localObject5 = paramPaint;
            paramCanvas.drawLine(f1, f3, f4, f3, paramPaint);
          }
          localObject1 = this.b.v(k);
          localObject5 = a((NumberFormat)localObject1, d1);
          f2 = paramInt3;
          localObject2 = this.b;
          f1 = ((ab)localObject2).ai();
          f5 = f2 + f1;
          f2 = this.b.aj();
          f6 = f3 - f2;
          localObject1 = this.b;
          f7 = ((ab)localObject1).ad();
          localObject4 = this;
          a(paramCanvas, (String)localObject5, f5, f6, paramPaint, f7);
          break label478;
          label709:
          localObject2 = ab.a.b;
          if (locala == localObject2)
          {
            if ((bool2) && (j == 0))
            {
              localObject1 = this.b;
              j = ((ab)localObject1).s(k);
              paramPaint.setColor(j);
              if (bool3)
              {
                j = a((Paint.Align)localObject4);
                j = paramInt3 - j;
                f1 = j;
                f4 = paramInt3;
                localObject1 = paramCanvas;
                localObject5 = paramPaint;
                paramCanvas.drawLine(f1, f3, f4, f3, paramPaint);
              }
              localObject1 = this.b.ak();
              localObject5 = a((NumberFormat)localObject1, d1);
              j = paramInt3 + 10;
              f2 = j;
              localObject2 = this.b;
              f1 = ((ab)localObject2).ai();
              f5 = f2 + f1;
              f2 = this.b.aj();
              f6 = f3 - f2;
              localObject1 = this.b;
              f7 = ((ab)localObject1).ad();
              localObject4 = this;
              a(paramCanvas, (String)localObject5, f5, f6, paramPaint, f7);
            }
            if (bool1)
            {
              localObject1 = this.c;
              localObject2 = this.b;
              i1 = ((ab)localObject2).p(k);
              ((Paint)localObject1).setColor(i1);
              if (bool3)
              {
                f1 = paramInt3;
                f4 = paramInt2;
                localObject5 = this.c;
                localObject1 = paramCanvas;
                paramCanvas.drawLine(f1, f3, f4, f3, (Paint)localObject5);
              }
            }
          }
        }
      }
      j = k + 1;
    }
  }
  
  protected void a(Double[] paramArrayOfDouble, Canvas paramCanvas, Paint paramPaint, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, double paramDouble1, double paramDouble2, double paramDouble3)
  {
    boolean bool1 = this.b.r();
    Object localObject1 = this.b;
    boolean bool2 = ((ab)localObject1).n();
    if (paramBoolean)
    {
      int j = this.b.af();
      paramPaint.setColor(j);
      int m = paramArrayOfDouble.length;
      j = 0;
      float f1 = 0.0F;
      localObject1 = null;
      int k;
      for (int n = 0; n < m; n = k)
      {
        Double localDouble = paramArrayOfDouble[n];
        double d1 = localDouble.doubleValue();
        boolean bool3 = paramDouble2 < d1;
        if (!bool3)
        {
          d1 = localDouble.doubleValue();
          bool3 = d1 < paramDouble3;
          if (!bool3)
          {
            d1 = paramInt1;
            double d2 = (localDouble.doubleValue() - paramDouble2) * paramDouble1;
            d1 += d2;
            float f2 = (float)d1;
            localObject1 = this.b;
            k = ((ab)localObject1).af();
            paramPaint.setColor(k);
            float f5;
            if (bool2)
            {
              f3 = paramInt3;
              f1 = paramInt3;
              localObject2 = this.b;
              f4 = ((ab)localObject2).i() / 3.0F;
              f5 = f1 + f4;
              localObject1 = paramCanvas;
              f4 = f2;
              paramCanvas.drawLine(f2, f3, f2, f5, paramPaint);
            }
            String str = this.b.a(localDouble);
            f1 = paramInt3;
            float f3 = this.b.i() * 4.0F;
            float f4 = 3.0F;
            f3 /= f4;
            f1 += f3;
            f3 = this.b.ah();
            float f6 = f1 + f3;
            localObject1 = this.b;
            float f7 = ((ab)localObject1).ac();
            Object localObject2 = paramCanvas;
            a(paramCanvas, str, f2, f6, paramPaint, f7);
            if (bool1)
            {
              localObject1 = this.b;
              k = ((ab)localObject1).p(0);
              paramPaint.setColor(k);
              f3 = paramInt3;
              f5 = paramInt2;
              localObject1 = paramCanvas;
              f4 = f2;
              paramCanvas.drawLine(f2, f3, f2, f5, paramPaint);
            }
          }
        }
        k = n + 1;
      }
    }
  }
  
  public boolean a(w paramw)
  {
    return false;
  }
  
  public double[] a(float paramFloat1, float paramFloat2, int paramInt)
  {
    double d1 = this.b.f(paramInt);
    double d2 = this.b.h(paramInt);
    double d3 = this.b.j(paramInt);
    Object localObject1 = this.b;
    double d4 = ((ab)localObject1).l(paramInt);
    Object localObject2 = this.b;
    boolean bool = ((ab)localObject2).g(paramInt);
    if (bool)
    {
      localObject2 = this.b;
      bool = ((ab)localObject2).i(paramInt);
      if (bool)
      {
        localObject2 = this.b;
        bool = ((ab)localObject2).k(paramInt);
        if (bool)
        {
          localObject2 = this.b;
          bool = ((ab)localObject2).m(paramInt);
          if (bool) {
            break label163;
          }
        }
      }
    }
    localObject2 = b(paramInt);
    int k;
    if (localObject2 != null)
    {
      localObject1 = null;
      d1 = localObject2[0];
      d2 = localObject2[1];
      d3 = localObject2[2];
      k = 3;
      d4 = localObject2[k];
    }
    label163:
    localObject2 = this.g;
    if (localObject2 != null)
    {
      int j = 2;
      localObject2 = new double[j];
      float f1 = this.g.left;
      f1 = paramFloat1 - f1;
      double d5 = f1;
      d2 = (d2 - d1) * d5;
      Rect localRect1 = this.g;
      int m = localRect1.width();
      d5 = m;
      d2 = d2 / d5 + d1;
      localObject2[0] = d2;
      int n = 1;
      int i1 = this.g.top;
      Rect localRect2 = this.g;
      int i2 = localRect2.height();
      float f2 = i1 + i2 - paramFloat2;
      d1 = f2;
      d4 = (d4 - d3) * d1;
      Rect localRect3 = this.g;
      i1 = localRect3.height();
      d1 = i1;
      d4 = d4 / d1 + d3;
      localObject2[n] = d4;
      localObject1 = localObject2;
    }
    for (;;)
    {
      return (double[])localObject1;
      k = 2;
      localObject1 = new double[k];
      d3 = paramFloat1;
      localObject1[0] = d3;
      int i3 = 1;
      d3 = paramFloat2;
      localObject1[i3] = d3;
    }
  }
  
  protected abstract f[] a(List paramList1, List paramList2, float paramFloat, int paramInt1, int paramInt2);
  
  public aa b()
  {
    return this.a;
  }
  
  protected void b(Canvas paramCanvas, Paint paramPaint, List paramList, ad paramad, float paramFloat, int paramInt1, int paramInt2)
  {
    boolean bool = a(paramad);
    if (bool)
    {
      u localu = d();
      if (localu != null) {
        localu.a(paramCanvas, paramPaint, paramList, paramad, paramFloat, paramInt1, paramInt2);
      }
    }
  }
  
  public double[] b(int paramInt)
  {
    Map localMap = this.h;
    Integer localInteger = Integer.valueOf(paramInt);
    return (double[])localMap.get(localInteger);
  }
  
  protected boolean c()
  {
    return false;
  }
  
  public u d()
  {
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */