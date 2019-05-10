package android.support.c.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build.VERSION;
import android.support.v4.a.a.c;
import android.support.v4.b.b;
import android.support.v4.b.b.b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class e
{
  private static int a(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, XmlPullParser paramXmlPullParser)
  {
    int i = 0;
    Object localObject = a.j;
    TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject);
    localObject = "value";
    TypedValue localTypedValue = c.b(localTypedArray, paramXmlPullParser, (String)localObject, 0);
    boolean bool;
    if (localTypedValue != null) {
      bool = true;
    }
    for (;;)
    {
      if (bool)
      {
        bool = a(localTypedValue.type);
        if (bool) {
          i = 3;
        }
      }
      localTypedArray.recycle();
      return i;
      bool = false;
      localObject = null;
    }
  }
  
  private static int a(TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    int i = 1;
    int j = 0;
    TypedValue localTypedValue1 = paramTypedArray.peekValue(paramInt1);
    int k;
    int m;
    label32:
    TypedValue localTypedValue2;
    int n;
    if (localTypedValue1 != null)
    {
      k = i;
      if (k == 0) {
        break label103;
      }
      m = localTypedValue1.type;
      localTypedValue2 = paramTypedArray.peekValue(paramInt2);
      if (localTypedValue2 == null) {
        break label112;
      }
      n = i;
      label47:
      if (n == 0) {
        break label118;
      }
    }
    label94:
    label103:
    label112:
    label118:
    for (i = localTypedValue2.type;; i = 0)
    {
      if (k != 0)
      {
        bool = a(m);
        if (bool) {}
      }
      else
      {
        if (n == 0) {
          break label94;
        }
        bool = a(i);
        if (!bool) {
          break label94;
        }
      }
      j = 3;
      return j;
      k = 0;
      break;
      boolean bool = false;
      localTypedValue1 = null;
      break label32;
      n = 0;
      break label47;
    }
  }
  
  public static Animator a(Context paramContext, int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 24;
    if (i >= j) {}
    Resources.Theme localTheme;
    for (Object localObject = AnimatorInflater.loadAnimator(paramContext, paramInt);; localObject = a(paramContext, (Resources)localObject, localTheme, paramInt))
    {
      return (Animator)localObject;
      localObject = paramContext.getResources();
      localTheme = paramContext.getTheme();
    }
  }
  
  public static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, int paramInt)
  {
    return a(paramContext, paramResources, paramTheme, paramInt, 1.0F);
  }
  
  /* Error */
  public static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, int paramInt, float paramFloat)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_1
    //   4: iload_3
    //   5: invokevirtual 79	android/content/res/Resources:getAnimation	(I)Landroid/content/res/XmlResourceParser;
    //   8: astore 5
    //   10: aload_0
    //   11: aload_1
    //   12: aload_2
    //   13: aload 5
    //   15: fload 4
    //   17: invokestatic 82	android/support/c/a/e:a	(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;F)Landroid/animation/Animator;
    //   20: astore 6
    //   22: aload 5
    //   24: ifnull +10 -> 34
    //   27: aload 5
    //   29: invokeinterface 87 1 0
    //   34: aload 6
    //   36: areturn
    //   37: astore 6
    //   39: new 89	android/content/res/Resources$NotFoundException
    //   42: astore 7
    //   44: new 91	java/lang/StringBuilder
    //   47: astore 8
    //   49: aload 8
    //   51: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   54: ldc 96
    //   56: astore 9
    //   58: aload 8
    //   60: aload 9
    //   62: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: astore 8
    //   67: iload_3
    //   68: invokestatic 106	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   71: astore 9
    //   73: aload 8
    //   75: aload 9
    //   77: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: astore 8
    //   82: aload 8
    //   84: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   87: astore 8
    //   89: aload 7
    //   91: aload 8
    //   93: invokespecial 113	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   96: aload 7
    //   98: aload 6
    //   100: invokevirtual 117	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   103: pop
    //   104: aload 7
    //   106: athrow
    //   107: astore 6
    //   109: aload 5
    //   111: ifnull +10 -> 121
    //   114: aload 5
    //   116: invokeinterface 87 1 0
    //   121: aload 6
    //   123: athrow
    //   124: astore 6
    //   126: new 89	android/content/res/Resources$NotFoundException
    //   129: astore 7
    //   131: new 91	java/lang/StringBuilder
    //   134: astore 8
    //   136: aload 8
    //   138: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   141: ldc 96
    //   143: astore 9
    //   145: aload 8
    //   147: aload 9
    //   149: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: astore 8
    //   154: iload_3
    //   155: invokestatic 106	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   158: astore 9
    //   160: aload 8
    //   162: aload 9
    //   164: invokevirtual 100	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: astore 8
    //   169: aload 8
    //   171: invokevirtual 110	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: astore 8
    //   176: aload 7
    //   178: aload 8
    //   180: invokespecial 113	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   183: aload 7
    //   185: aload 6
    //   187: invokevirtual 117	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   190: pop
    //   191: aload 7
    //   193: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	194	0	paramContext	Context
    //   0	194	1	paramResources	Resources
    //   0	194	2	paramTheme	Resources.Theme
    //   0	194	3	paramInt	int
    //   0	194	4	paramFloat	float
    //   1	114	5	localXmlResourceParser	android.content.res.XmlResourceParser
    //   20	15	6	localAnimator	Animator
    //   37	62	6	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   107	15	6	localObject1	Object
    //   124	62	6	localIOException	java.io.IOException
    //   42	150	7	localNotFoundException	android.content.res.Resources.NotFoundException
    //   47	132	8	localObject2	Object
    //   56	107	9	str	String
    // Exception table:
    //   from	to	target	type
    //   4	8	37	org/xmlpull/v1/XmlPullParserException
    //   15	20	37	org/xmlpull/v1/XmlPullParserException
    //   4	8	107	finally
    //   15	20	107	finally
    //   39	42	107	finally
    //   44	47	107	finally
    //   49	54	107	finally
    //   60	65	107	finally
    //   67	71	107	finally
    //   75	80	107	finally
    //   82	87	107	finally
    //   91	96	107	finally
    //   98	104	107	finally
    //   104	107	107	finally
    //   126	129	107	finally
    //   131	134	107	finally
    //   136	141	107	finally
    //   147	152	107	finally
    //   154	158	107	finally
    //   162	167	107	finally
    //   169	174	107	finally
    //   178	183	107	finally
    //   185	191	107	finally
    //   191	194	107	finally
    //   4	8	124	java/io/IOException
    //   15	20	124	java/io/IOException
  }
  
  private static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, float paramFloat)
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    return a(paramContext, paramResources, paramTheme, paramXmlPullParser, localAttributeSet, null, 0, paramFloat);
  }
  
  private static Animator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, AnimatorSet paramAnimatorSet, int paramInt, float paramFloat)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    int i = paramXmlPullParser.getDepth();
    int j;
    int k;
    do
    {
      j = paramXmlPullParser.next();
      k = 3;
      if (j == k)
      {
        k = paramXmlPullParser.getDepth();
        if (k <= i) {
          break;
        }
      }
      k = 1;
      if (j == k) {
        break;
      }
      k = 2;
    } while (j != k);
    Object localObject3 = paramXmlPullParser.getName();
    Object localObject4 = "objectAnimator";
    boolean bool2 = ((String)localObject3).equals(localObject4);
    Object localObject5;
    if (bool2)
    {
      localObject3 = paramContext;
      localObject1 = paramResources;
      localObject4 = paramTheme;
      localObject5 = paramXmlPullParser;
      localObject1 = a(paramContext, paramResources, paramTheme, paramAttributeSet, paramFloat, paramXmlPullParser);
      j = 0;
      localObject3 = null;
      label124:
      if ((paramAnimatorSet == null) || (j != 0)) {
        break label413;
      }
      if (localObject2 != null) {
        break label582;
      }
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
    }
    for (;;)
    {
      ((ArrayList)localObject3).add(localObject1);
      localObject2 = localObject3;
      break;
      localObject4 = "animator";
      bool2 = ((String)localObject3).equals(localObject4);
      Object localObject6;
      if (bool2)
      {
        localObject6 = null;
        localObject3 = paramContext;
        localObject1 = paramResources;
        localObject4 = paramTheme;
        localObject1 = a(paramContext, paramResources, paramTheme, paramAttributeSet, null, paramFloat, paramXmlPullParser);
        j = 0;
        localObject3 = null;
        break label124;
      }
      localObject4 = "set";
      bool2 = ((String)localObject3).equals(localObject4);
      if (bool2)
      {
        AnimatorSet localAnimatorSet = new android/animation/AnimatorSet;
        localAnimatorSet.<init>();
        localObject3 = a.h;
        TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject3);
        bool2 = false;
        int m = c.a(localTypedArray, paramXmlPullParser, "ordering", 0, 0);
        localObject5 = localAnimatorSet;
        localObject5 = (AnimatorSet)localAnimatorSet;
        localObject3 = paramContext;
        localObject1 = paramResources;
        localObject4 = paramTheme;
        localObject6 = paramAttributeSet;
        a(paramContext, paramResources, paramTheme, paramXmlPullParser, paramAttributeSet, (AnimatorSet)localObject5, m, paramFloat);
        localTypedArray.recycle();
        j = 0;
        localObject3 = null;
        localObject1 = localAnimatorSet;
        break label124;
      }
      localObject4 = "propertyValuesHolder";
      boolean bool1 = ((String)localObject3).equals(localObject4);
      if (bool1)
      {
        localObject3 = Xml.asAttributeSet(paramXmlPullParser);
        localObject4 = a(paramContext, paramResources, paramTheme, paramXmlPullParser, (AttributeSet)localObject3);
        if ((localObject4 != null) && (localObject1 != null))
        {
          bool1 = localObject1 instanceof ValueAnimator;
          if (bool1)
          {
            localObject3 = localObject1;
            localObject3 = (ValueAnimator)localObject1;
            ((ValueAnimator)localObject3).setValues((PropertyValuesHolder[])localObject4);
          }
        }
        bool1 = true;
        break label124;
        label413:
        break;
      }
      localObject3 = new java/lang/RuntimeException;
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject1 = ((StringBuilder)localObject1).append("Unknown animator name: ");
      localObject4 = paramXmlPullParser.getName();
      localObject1 = (String)localObject4;
      ((RuntimeException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
      if ((paramAnimatorSet != null) && (localObject2 != null))
      {
        localObject6 = new Animator[((ArrayList)localObject2).size()];
        bool1 = false;
        localObject3 = null;
        localObject5 = ((ArrayList)localObject2).iterator();
        bool2 = false;
        localObject4 = null;
        for (;;)
        {
          bool1 = ((Iterator)localObject5).hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = (Animator)((Iterator)localObject5).next();
          int n = bool2 + true;
          localObject6[bool2] = localObject3;
          bool2 = n;
        }
        if (paramInt != 0) {
          break label572;
        }
        paramAnimatorSet.playTogether((Animator[])localObject6);
      }
      for (;;)
      {
        return (Animator)localObject1;
        label572:
        paramAnimatorSet.playSequentially((Animator[])localObject6);
      }
      label582:
      localObject3 = localObject2;
    }
  }
  
  private static Keyframe a(Keyframe paramKeyframe, float paramFloat)
  {
    Object localObject = paramKeyframe.getType();
    Class localClass = Float.TYPE;
    if (localObject == localClass) {
      localObject = Keyframe.ofFloat(paramFloat);
    }
    for (;;)
    {
      return (Keyframe)localObject;
      localObject = paramKeyframe.getType();
      localClass = Integer.TYPE;
      if (localObject == localClass) {
        localObject = Keyframe.ofInt(paramFloat);
      } else {
        localObject = Keyframe.ofObject(paramFloat);
      }
    }
  }
  
  private static Keyframe a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int paramInt, XmlPullParser paramXmlPullParser)
  {
    int i = 3;
    int j = 1;
    Object localObject1 = a.j;
    TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject1);
    int k = 0;
    float f1 = 0.0F;
    localObject1 = null;
    float f2 = c.a(localTypedArray, paramXmlPullParser, "fraction", i, -1.0F);
    String str = "value";
    TypedValue localTypedValue = c.b(localTypedArray, paramXmlPullParser, str, 0);
    int m;
    if (localTypedValue != null)
    {
      m = j;
      int n = 4;
      if (paramInt == n)
      {
        if (m == 0) {
          break label195;
        }
        boolean bool = a(localTypedValue.type);
        if (!bool) {
          break label195;
        }
        paramInt = i;
      }
      label104:
      if (m == 0) {
        break label257;
      }
      switch (paramInt)
      {
      }
    }
    for (;;)
    {
      Object localObject2 = "interpolator";
      i = c.c(localTypedArray, paramXmlPullParser, (String)localObject2, j, 0);
      if (i > 0)
      {
        localObject2 = d.a(paramContext, i);
        ((Keyframe)localObject1).setInterpolator((TimeInterpolator)localObject2);
      }
      localTypedArray.recycle();
      return (Keyframe)localObject1;
      m = 0;
      str = null;
      break;
      label195:
      paramInt = 0;
      break label104;
      i = 0;
      localObject2 = null;
      f1 = c.a(localTypedArray, paramXmlPullParser, "value", 0, 0.0F);
      localObject1 = Keyframe.ofFloat(f2, f1);
      continue;
      k = c.a(localTypedArray, paramXmlPullParser, "value", 0, 0);
      localObject1 = Keyframe.ofInt(f2, k);
      continue;
      label257:
      if (paramInt == 0) {
        localObject1 = Keyframe.ofFloat(f2);
      } else {
        localObject1 = Keyframe.ofInt(f2);
      }
    }
  }
  
  private static ObjectAnimator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    ObjectAnimator localObjectAnimator = new android/animation/ObjectAnimator;
    localObjectAnimator.<init>();
    a(paramContext, paramResources, paramTheme, paramAttributeSet, localObjectAnimator, paramFloat, paramXmlPullParser);
    return localObjectAnimator;
  }
  
  private static PropertyValuesHolder a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, String paramString, int paramInt)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    int k = paramInt;
    int m = paramXmlPullParser.next();
    int i1 = 3;
    Object localObject2;
    Object localObject3;
    int n;
    float f2;
    AttributeSet localAttributeSet;
    Object localObject4;
    if (m != i1)
    {
      i1 = 1;
      if (m != i1)
      {
        localObject2 = paramXmlPullParser.getName();
        localObject3 = "keyframe";
        boolean bool2 = ((String)localObject2).equals(localObject3);
        if (!bool2) {
          break label735;
        }
        n = 4;
        f2 = 5.6E-45F;
        if (k == n)
        {
          localObject2 = Xml.asAttributeSet(paramXmlPullParser);
          k = a(paramResources, paramTheme, (AttributeSet)localObject2, paramXmlPullParser);
        }
        localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
        localObject2 = paramContext;
        localObject3 = paramResources;
        localObject4 = paramXmlPullParser;
        localObject3 = a(paramContext, paramResources, paramTheme, localAttributeSet, k, paramXmlPullParser);
        if (localObject3 == null) {
          break label728;
        }
        if (localObject1 != null) {
          break label721;
        }
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>();
        label146:
        ((ArrayList)localObject2).add(localObject3);
        label154:
        paramXmlPullParser.next();
      }
    }
    for (;;)
    {
      localObject1 = localObject2;
      break;
      label338:
      label362:
      label471:
      label511:
      int i3;
      if (localObject1 != null)
      {
        int i2 = ((ArrayList)localObject1).size();
        if (i2 > 0)
        {
          n = 0;
          f2 = 0.0F;
          localObject2 = (Keyframe)((ArrayList)localObject1).get(0);
          i1 = i2 + -1;
          localObject3 = (Keyframe)((ArrayList)localObject1).get(i1);
          float f3 = ((Keyframe)localObject3).getFraction();
          float f4 = 1.0F;
          boolean bool4 = f3 < f4;
          if (bool4)
          {
            bool4 = false;
            f4 = 0.0F;
            localObject4 = null;
            boolean bool5 = f3 < 0.0F;
            float f5;
            int i6;
            boolean bool3;
            if (bool5)
            {
              int i5 = 1065353216;
              f3 = 1.0F;
              ((Keyframe)localObject3).setFraction(f3);
              i1 = i2;
              f5 = ((Keyframe)localObject2).getFraction();
              f3 = 0.0F;
              localAttributeSet = null;
              i6 = f5 < 0.0F;
              if (i6 != 0)
              {
                i6 = 0;
                f3 = 0.0F;
                localAttributeSet = null;
                bool3 = f5 < 0.0F;
                if (!bool3) {
                  break label471;
                }
                bool3 = false;
                f5 = 0.0F;
                ((Keyframe)localObject2).setFraction(0.0F);
              }
              localObject4 = new Keyframe[i1];
              ((ArrayList)localObject1).toArray((Object[])localObject4);
              i6 = 0;
              f3 = 0.0F;
              localAttributeSet = null;
              if (i6 >= i1) {
                break label668;
              }
              localObject2 = localObject4[i6];
              f5 = ((Keyframe)localObject2).getFraction();
              i = 0;
              f1 = 0.0F;
              localObject1 = null;
              bool3 = f5 < 0.0F;
              if (bool3)
              {
                if (i6 != 0) {
                  break label511;
                }
                bool3 = false;
                f5 = 0.0F;
                ((Keyframe)localObject2).setFraction(0.0F);
              }
            }
            int i7;
            for (;;)
            {
              i6 += 1;
              break label362;
              i7 = ((ArrayList)localObject1).size();
              int i4 = 1065353216;
              f4 = 1.0F;
              localObject3 = a((Keyframe)localObject3, f4);
              ((ArrayList)localObject1).add(i7, localObject3);
              i1 = bool3 + true;
              break;
              bool3 = false;
              f5 = 0.0F;
              i7 = 0;
              f3 = 0.0F;
              localAttributeSet = null;
              localObject2 = a((Keyframe)localObject2, 0.0F);
              ((ArrayList)localObject1).add(0, localObject2);
              i1 += 1;
              break label338;
              i3 = i1 + -1;
              if (i7 != i3) {
                break label542;
              }
              i3 = 1065353216;
              f5 = 1.0F;
              ((Keyframe)localObject2).setFraction(f5);
            }
            label542:
            n = i7 + 1;
            i3 = i7;
            for (;;)
            {
              i = i1 + -1;
              if (n < i)
              {
                localObject1 = localObject4[n];
                f1 = ((Keyframe)localObject1).getFraction();
                boolean bool1 = f1 < 0.0F;
                if (bool1) {}
              }
              else
              {
                n = i3 + 1;
                localObject2 = localObject4[n];
                f2 = ((Keyframe)localObject2).getFraction();
                int j = i7 + -1;
                localObject1 = localObject4[j];
                f1 = ((Keyframe)localObject1).getFraction();
                f2 -= f1;
                a((Keyframe[])localObject4, f2, i7, i3);
                break;
              }
              int i8 = n + 1;
              i3 = n;
              n = i8;
            }
            label668:
            localObject2 = PropertyValuesHolder.ofKeyframe(paramString, (Keyframe[])localObject4);
            i1 = 3;
            if (k == i1)
            {
              localObject3 = f.a();
              ((PropertyValuesHolder)localObject2).setEvaluator((TypeEvaluator)localObject3);
            }
          }
        }
      }
      for (;;)
      {
        return (PropertyValuesHolder)localObject2;
        i1 = i3;
        break;
        n = 0;
        localObject2 = null;
        f2 = 0.0F;
      }
      label721:
      localObject2 = localObject1;
      break label146;
      label728:
      localObject2 = localObject1;
      break label154;
      label735:
      localObject2 = localObject1;
    }
  }
  
  private static PropertyValuesHolder a(TypedArray paramTypedArray, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Object localObject1 = paramTypedArray.peekValue(paramInt2);
    int n;
    label35:
    float f2;
    int i3;
    label58:
    int i4;
    label74:
    boolean bool4;
    label123:
    boolean bool6;
    if (localObject1 != null)
    {
      i = 1;
      f1 = Float.MIN_VALUE;
      n = i;
      if (n == 0) {
        break label301;
      }
      i = ((TypedValue)localObject1).type;
      localObject2 = paramTypedArray.peekValue(paramInt3);
      if (localObject2 == null) {
        break label313;
      }
      int i1 = 1;
      f2 = Float.MIN_VALUE;
      i3 = i1;
      if (i3 == 0) {
        break label328;
      }
      i1 = ((TypedValue)localObject2).type;
      i4 = i1;
      i1 = 4;
      f2 = 5.6E-45F;
      if (paramInt1 == i1)
      {
        if (n != 0)
        {
          bool4 = a(i);
          if (bool4) {}
        }
        else
        {
          if (i3 == 0) {
            break label346;
          }
          bool4 = a(i4);
          if (!bool4) {
            break label346;
          }
        }
        paramInt1 = 3;
      }
      if (paramInt1 != 0) {
        break label351;
      }
      bool4 = true;
      f2 = Float.MIN_VALUE;
      bool6 = bool4;
    }
    Object localObject4;
    b.b[] arrayOfb;
    boolean bool5;
    for (;;)
    {
      bool4 = false;
      f2 = 0.0F;
      localObject1 = null;
      i6 = 2;
      if (paramInt1 != i6) {
        break label512;
      }
      localObject3 = paramTypedArray.getString(paramInt2);
      localObject2 = paramTypedArray.getString(paramInt3);
      localObject4 = b.b((String)localObject3);
      arrayOfb = b.b((String)localObject2);
      if ((localObject4 == null) && (arrayOfb == null)) {
        break label1222;
      }
      if (localObject4 == null) {
        break label456;
      }
      localObject1 = new android/support/c/a/e$a;
      i3 = 0;
      ((e.a)localObject1).<init>(null);
      if (arrayOfb == null) {
        break label416;
      }
      bool5 = b.a((b.b[])localObject4, arrayOfb);
      if (bool5) {
        break label369;
      }
      localObject1 = new android/view/InflateException;
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>();
      localObject3 = " Can't morph from " + (String)localObject3 + " to " + (String)localObject2;
      ((InflateException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
      i = 0;
      f1 = 0.0F;
      localObject3 = null;
      n = 0;
      break;
      label301:
      i = 0;
      f1 = 0.0F;
      localObject3 = null;
      break label35;
      label313:
      bool4 = false;
      f2 = 0.0F;
      localObject1 = null;
      bool5 = false;
      break label58;
      label328:
      bool4 = false;
      f2 = 0.0F;
      localObject1 = null;
      i4 = 0;
      arrayOfb = null;
      break label74;
      label346:
      paramInt1 = 0;
      break label123;
      label351:
      bool4 = false;
      f2 = 0.0F;
      localObject1 = null;
      bool6 = false;
      localObject4 = null;
    }
    label369:
    int i = 2;
    float f1 = 2.8E-45F;
    Object localObject3 = new Object[i];
    Object localObject2 = null;
    localObject3[0] = localObject4;
    int i6 = 1;
    localObject3[i6] = arrayOfb;
    localObject3 = PropertyValuesHolder.ofObject(paramString, (TypeEvaluator)localObject1, (Object[])localObject3);
    for (;;)
    {
      return (PropertyValuesHolder)localObject3;
      label416:
      i = 1;
      f1 = Float.MIN_VALUE;
      localObject3 = new Object[i];
      i6 = 0;
      localObject2 = null;
      localObject3[0] = localObject4;
      localObject3 = PropertyValuesHolder.ofObject(paramString, (TypeEvaluator)localObject1, (Object[])localObject3);
      continue;
      label456:
      label512:
      label575:
      label609:
      label694:
      label711:
      label871:
      label1008:
      label1054:
      int m;
      if (arrayOfb != null)
      {
        localObject3 = new android/support/c/a/e$a;
        ((e.a)localObject3).<init>(null);
        bool4 = true;
        f2 = Float.MIN_VALUE;
        localObject1 = new Object[bool4];
        i6 = 0;
        localObject2 = null;
        localObject1[0] = arrayOfb;
        localObject3 = PropertyValuesHolder.ofObject(paramString, (TypeEvaluator)localObject3, (Object[])localObject1);
        continue;
        i6 = 0;
        localObject2 = null;
        int i7 = 3;
        if (paramInt1 == i7) {
          localObject2 = f.a();
        }
        int i2;
        int i5;
        if (bool6) {
          if (n != 0)
          {
            i2 = 5;
            f2 = 7.0E-45F;
            if (i == i2)
            {
              i = 0;
              localObject3 = null;
              f1 = paramTypedArray.getDimension(paramInt2, 0.0F);
              f2 = f1;
              if (!bool5) {
                break label711;
              }
              i = 5;
              f1 = 7.0E-45F;
              if (i4 != i) {
                break label694;
              }
              i = 0;
              localObject3 = null;
              f1 = paramTypedArray.getDimension(paramInt3, 0.0F);
              i5 = 2;
              localObject4 = new float[i5];
              i4 = 0;
              arrayOfb = null;
              localObject4[0] = f2;
              i2 = 1;
              f2 = Float.MIN_VALUE;
              localObject4[i2] = f1;
              localObject3 = PropertyValuesHolder.ofFloat(paramString, (float[])localObject4);
            }
          }
        }
        for (;;)
        {
          if ((localObject3 == null) || (localObject2 == null)) {
            break label1220;
          }
          ((PropertyValuesHolder)localObject3).setEvaluator((TypeEvaluator)localObject2);
          break;
          i = 0;
          localObject3 = null;
          f1 = paramTypedArray.getFloat(paramInt2, 0.0F);
          f2 = f1;
          break label575;
          i = 0;
          localObject3 = null;
          f1 = paramTypedArray.getFloat(paramInt3, 0.0F);
          break label609;
          i = 1;
          f1 = Float.MIN_VALUE;
          localObject3 = new float[i];
          i5 = 0;
          localObject4 = null;
          localObject3[0] = f2;
          localObject3 = PropertyValuesHolder.ofFloat(paramString, (float[])localObject3);
          continue;
          i = 5;
          f1 = 7.0E-45F;
          if (i4 == i)
          {
            i = 0;
            localObject3 = null;
          }
          for (f1 = paramTypedArray.getDimension(paramInt3, 0.0F);; f1 = paramTypedArray.getFloat(paramInt3, 0.0F))
          {
            i2 = 1;
            f2 = Float.MIN_VALUE;
            localObject1 = new float[i2];
            i5 = 0;
            localObject4 = null;
            localObject1[0] = f1;
            localObject3 = PropertyValuesHolder.ofFloat(paramString, (float[])localObject1);
            break;
            i = 0;
            localObject3 = null;
          }
          int k;
          if (n != 0)
          {
            i2 = 5;
            f2 = 7.0E-45F;
            if (i == i2)
            {
              localObject3 = null;
              f1 = paramTypedArray.getDimension(paramInt2, 0.0F);
              i = (int)f1;
              i2 = i;
              if (!bool5) {
                break label1054;
              }
              i = 5;
              f1 = 7.0E-45F;
              if (i4 != i) {
                break label1008;
              }
              localObject3 = null;
              f1 = paramTypedArray.getDimension(paramInt3, 0.0F);
              i = (int)f1;
            }
            for (;;)
            {
              i5 = 2;
              localObject4 = new int[i5];
              i4 = 0;
              arrayOfb = null;
              localObject4[0] = i2;
              i2 = 1;
              f2 = Float.MIN_VALUE;
              localObject4[i2] = i;
              localObject3 = PropertyValuesHolder.ofInt(paramString, (int[])localObject4);
              break;
              boolean bool1 = a(i);
              if (bool1)
              {
                f1 = 0.0F;
                localObject3 = null;
                j = paramTypedArray.getColor(paramInt2, 0);
                i2 = j;
                break label871;
              }
              f1 = 0.0F;
              localObject3 = null;
              int j = paramTypedArray.getInt(paramInt2, 0);
              i2 = j;
              break label871;
              boolean bool2 = a(i4);
              if (bool2)
              {
                f1 = 0.0F;
                localObject3 = null;
                k = paramTypedArray.getColor(paramInt3, 0);
              }
              else
              {
                f1 = 0.0F;
                localObject3 = null;
                k = paramTypedArray.getInt(paramInt3, 0);
              }
            }
            k = 1;
            f1 = Float.MIN_VALUE;
            localObject3 = new int[k];
            i5 = 0;
            localObject4 = null;
            localObject3[0] = i2;
            localObject3 = PropertyValuesHolder.ofInt(paramString, (int[])localObject3);
          }
          else
          {
            if (bool5)
            {
              k = 5;
              f1 = 7.0E-45F;
              if (i4 == k)
              {
                localObject3 = null;
                f1 = paramTypedArray.getDimension(paramInt3, 0.0F);
                k = (int)f1;
              }
              for (;;)
              {
                i2 = 1;
                f2 = Float.MIN_VALUE;
                localObject1 = new int[i2];
                i5 = 0;
                localObject4 = null;
                localObject1[0] = k;
                localObject3 = PropertyValuesHolder.ofInt(paramString, (int[])localObject1);
                break;
                boolean bool3 = a(i4);
                if (bool3)
                {
                  f1 = 0.0F;
                  localObject3 = null;
                  m = paramTypedArray.getColor(paramInt3, 0);
                }
                else
                {
                  f1 = 0.0F;
                  localObject3 = null;
                  m = paramTypedArray.getInt(paramInt3, 0);
                }
              }
            }
            m = 0;
            localObject3 = null;
            f1 = 0.0F;
          }
        }
      }
      else
      {
        label1220:
        label1222:
        m = 0;
        localObject3 = null;
        f1 = 0.0F;
      }
    }
  }
  
  private static ValueAnimator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, ValueAnimator paramValueAnimator, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = a.g;
    localObject1 = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject1);
    Object localObject2 = a.k;
    localObject2 = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject2);
    if (paramValueAnimator == null)
    {
      paramValueAnimator = new android/animation/ValueAnimator;
      paramValueAnimator.<init>();
    }
    a(paramValueAnimator, (TypedArray)localObject1, (TypedArray)localObject2, paramFloat, paramXmlPullParser);
    Object localObject3 = "interpolator";
    int i = c.c((TypedArray)localObject1, paramXmlPullParser, (String)localObject3, 0, 0);
    if (i > 0)
    {
      localObject3 = d.a(paramContext, i);
      paramValueAnimator.setInterpolator((TimeInterpolator)localObject3);
    }
    ((TypedArray)localObject1).recycle();
    if (localObject2 != null) {
      ((TypedArray)localObject2).recycle();
    }
    return paramValueAnimator;
  }
  
  private static void a(ValueAnimator paramValueAnimator, TypedArray paramTypedArray, int paramInt, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    int i = 2;
    paramValueAnimator = (ObjectAnimator)paramValueAnimator;
    int j = 1;
    Object localObject1 = c.a(paramTypedArray, paramXmlPullParser, "pathData", j);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = c.a(paramTypedArray, paramXmlPullParser, "propertyXName", i);
      int k = 3;
      float f = 4.2E-45F;
      String str = c.a(paramTypedArray, paramXmlPullParser, "propertyYName", k);
      if (paramInt != i)
      {
        k = 4;
        f = 5.6E-45F;
        if (paramInt != k) {}
      }
      if ((localObject2 == null) && (str == null))
      {
        localObject1 = new android/view/InflateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = paramTypedArray.getPositionDescription();
        localObject2 = str + " propertyXName or propertyYName is needed for PathData";
        ((InflateException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
      localObject1 = b.a((String)localObject1);
      k = 1056964608;
      f = 0.5F * paramFloat;
      a((Path)localObject1, paramValueAnimator, f, (String)localObject2, str);
    }
    for (;;)
    {
      return;
      j = 0;
      localObject2 = null;
      localObject1 = c.a(paramTypedArray, paramXmlPullParser, "propertyName", 0);
      paramValueAnimator.setPropertyName((String)localObject1);
    }
  }
  
  private static void a(ValueAnimator paramValueAnimator, TypedArray paramTypedArray1, TypedArray paramTypedArray2, float paramFloat, XmlPullParser paramXmlPullParser)
  {
    int i = 6;
    int j = 5;
    int k = 4;
    int m = 1;
    long l1 = c.a(paramTypedArray1, paramXmlPullParser, "duration", m, 300);
    long l2 = c.a(paramTypedArray1, paramXmlPullParser, "startOffset", 2, 0);
    String str = "valueType";
    int n = c.a(paramTypedArray1, paramXmlPullParser, str, 7, k);
    Object localObject = "valueFrom";
    boolean bool = c.a(paramXmlPullParser, (String)localObject);
    if (bool)
    {
      localObject = "valueTo";
      bool = c.a(paramXmlPullParser, (String)localObject);
      if (bool)
      {
        if (n == k) {
          n = a(paramTypedArray1, j, i);
        }
        localObject = a(paramTypedArray1, n, j, i, "");
        if (localObject != null)
        {
          PropertyValuesHolder[] arrayOfPropertyValuesHolder = new PropertyValuesHolder[m];
          arrayOfPropertyValuesHolder[0] = localObject;
          paramValueAnimator.setValues(arrayOfPropertyValuesHolder);
        }
      }
    }
    paramValueAnimator.setDuration(l1);
    paramValueAnimator.setStartDelay(l2);
    int i2 = 3;
    int i1 = c.a(paramTypedArray1, paramXmlPullParser, "repeatCount", i2, 0);
    paramValueAnimator.setRepeatCount(i1);
    localObject = "repeatMode";
    i1 = c.a(paramTypedArray1, paramXmlPullParser, (String)localObject, k, m);
    paramValueAnimator.setRepeatMode(i1);
    if (paramTypedArray2 != null) {
      a(paramValueAnimator, paramTypedArray2, n, paramFloat, paramXmlPullParser);
    }
  }
  
  private static void a(Path paramPath, ObjectAnimator paramObjectAnimator, float paramFloat, String paramString1, String paramString2)
  {
    Object localObject1 = new android/graphics/PathMeasure;
    ((PathMeasure)localObject1).<init>(paramPath, false);
    int i = 0;
    float f1 = 0.0F;
    Object localObject2 = null;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    boolean bool2 = false;
    float f2 = 0.0F;
    Object localObject3 = Float.valueOf(0.0F);
    localArrayList.add(localObject3);
    do
    {
      f2 = ((PathMeasure)localObject1).getLength();
      f1 += f2;
      localObject3 = Float.valueOf(f1);
      localArrayList.add(localObject3);
      bool2 = ((PathMeasure)localObject1).nextContour();
    } while (bool2);
    PathMeasure localPathMeasure = new android/graphics/PathMeasure;
    localPathMeasure.<init>(paramPath, false);
    int k = (int)(f1 / paramFloat) + 1;
    int m = Math.min(100, k);
    float[] arrayOfFloat1 = new float[m];
    float[] arrayOfFloat2 = new float[m];
    float[] arrayOfFloat3 = new float[2];
    k = 0;
    f2 = 0.0F;
    localObject3 = null;
    float f3 = m + -1;
    float f4 = f1 / f3;
    int n = 0;
    f3 = 0.0F;
    localObject1 = null;
    int i1 = 0;
    i = 0;
    localObject2 = null;
    f1 = 0.0F;
    int j;
    if (i1 < m)
    {
      localPathMeasure.getPosTan(f1, arrayOfFloat3, null);
      localObject1 = null;
      f3 = arrayOfFloat3[0];
      arrayOfFloat1[i1] = f3;
      n = 1;
      f3 = arrayOfFloat3[n];
      arrayOfFloat2[i1] = f3;
      f3 = f1 + f4;
      i = k + 1;
      int i2 = localArrayList.size();
      if (i >= i2) {
        break label529;
      }
      i = k + 1;
      localObject2 = (Float)localArrayList.get(i);
      f1 = ((Float)localObject2).floatValue();
      boolean bool1 = f3 < f1;
      if (!bool1) {
        break label529;
      }
      j = k + 1;
      localObject2 = (Float)localArrayList.get(j);
      f1 = ((Float)localObject2).floatValue();
      f1 = f3 - f1;
      n = k + 1;
      localPathMeasure.nextContour();
    }
    for (;;)
    {
      i1 += 1;
      k = n;
      break;
      n = 0;
      f3 = 0.0F;
      localObject1 = null;
      j = 0;
      f1 = 0.0F;
      localObject2 = null;
      if (paramString1 != null) {
        localObject1 = PropertyValuesHolder.ofFloat(paramString1, arrayOfFloat1);
      }
      if (paramString2 != null) {
        localObject2 = PropertyValuesHolder.ofFloat(paramString2, arrayOfFloat2);
      }
      if (localObject1 == null)
      {
        n = 1;
        f3 = Float.MIN_VALUE;
        localObject1 = new PropertyValuesHolder[n];
        k = 0;
        f2 = 0.0F;
        localObject3 = null;
        localObject1[0] = localObject2;
        paramObjectAnimator.setValues((PropertyValuesHolder[])localObject1);
      }
      for (;;)
      {
        return;
        if (localObject2 == null)
        {
          j = 1;
          f1 = Float.MIN_VALUE;
          localObject2 = new PropertyValuesHolder[j];
          k = 0;
          f2 = 0.0F;
          localObject3 = null;
          localObject2[0] = localObject1;
          paramObjectAnimator.setValues((PropertyValuesHolder[])localObject2);
        }
        else
        {
          k = 2;
          f2 = 2.8E-45F;
          localObject3 = new PropertyValuesHolder[k];
          i1 = 0;
          localObject3[0] = localObject1;
          n = 1;
          f3 = Float.MIN_VALUE;
          localObject3[n] = localObject2;
          paramObjectAnimator.setValues((PropertyValuesHolder[])localObject3);
        }
      }
      label529:
      f1 = f3;
      n = k;
    }
  }
  
  private static void a(Keyframe[] paramArrayOfKeyframe, float paramFloat, int paramInt1, int paramInt2)
  {
    int i = paramInt2 - paramInt1 + 2;
    float f1 = i;
    f1 = paramFloat / f1;
    while (paramInt1 <= paramInt2)
    {
      Keyframe localKeyframe1 = paramArrayOfKeyframe[paramInt1];
      int j = paramInt1 + -1;
      Keyframe localKeyframe2 = paramArrayOfKeyframe[j];
      float f2 = localKeyframe2.getFraction() + f1;
      localKeyframe1.setFraction(f2);
      paramInt1 += 1;
    }
  }
  
  private static boolean a(int paramInt)
  {
    int i = 28;
    if (paramInt >= i)
    {
      i = 31;
      if (paramInt > i) {}
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  private static PropertyValuesHolder[] a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    Object localObject1 = null;
    int k;
    for (;;)
    {
      int i = paramXmlPullParser.getEventType();
      k = 3;
      if (i == k) {
        break label221;
      }
      k = 1;
      if (i == k) {
        break label221;
      }
      k = 2;
      if (i == k) {
        break;
      }
      paramXmlPullParser.next();
    }
    Object localObject2 = paramXmlPullParser.getName();
    Object localObject3 = "propertyValuesHolder";
    boolean bool = ((String)localObject2).equals(localObject3);
    int m;
    if (bool)
    {
      localObject2 = a.i;
      TypedArray localTypedArray = c.a(paramResources, paramTheme, paramAttributeSet, (int[])localObject2);
      String str = c.a(localTypedArray, paramXmlPullParser, "propertyName", 3);
      k = 2;
      m = 4;
      int n = c.a(localTypedArray, paramXmlPullParser, "valueType", k, m);
      localObject2 = paramContext;
      localObject3 = paramResources;
      localObject2 = a(paramContext, paramResources, paramTheme, paramXmlPullParser, str, n);
      if (localObject2 == null)
      {
        bool = false;
        k = 1;
        localObject2 = a(localTypedArray, n, 0, k, str);
        localObject3 = localObject2;
        label174:
        if (localObject3 != null) {
          if (localObject1 == null)
          {
            localObject2 = new java/util/ArrayList;
            ((ArrayList)localObject2).<init>();
            label194:
            ((ArrayList)localObject2).add(localObject3);
            label202:
            localTypedArray.recycle();
          }
        }
      }
    }
    for (;;)
    {
      paramXmlPullParser.next();
      localObject1 = localObject2;
      break;
      label221:
      bool = false;
      localObject2 = null;
      if (localObject1 != null)
      {
        int i1 = ((ArrayList)localObject1).size();
        localObject3 = new PropertyValuesHolder[i1];
        bool = false;
        localObject2 = null;
        int j;
        for (m = 0; m < i1; m = j)
        {
          localObject2 = (PropertyValuesHolder)((ArrayList)localObject1).get(m);
          localObject3[m] = localObject2;
          j = m + 1;
        }
        localObject2 = localObject3;
      }
      return (PropertyValuesHolder[])localObject2;
      localObject2 = localObject1;
      break label194;
      localObject2 = localObject1;
      break label202;
      localObject3 = localObject2;
      break label174;
      localObject2 = localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */