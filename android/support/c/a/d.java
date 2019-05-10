package android.support.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import org.xmlpull.v1.XmlPullParser;

public class d
{
  /* Error */
  public static Interpolator a(Context paramContext, int paramInt)
  {
    // Byte code:
    //   0: getstatic 10	android/os/Build$VERSION:SDK_INT	I
    //   3: istore_2
    //   4: bipush 21
    //   6: istore_3
    //   7: iload_2
    //   8: iload_3
    //   9: if_icmplt +13 -> 22
    //   12: aload_0
    //   13: iload_1
    //   14: invokestatic 17	android/view/animation/AnimationUtils:loadInterpolator	(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
    //   17: astore 4
    //   19: aload 4
    //   21: areturn
    //   22: iconst_0
    //   23: istore_3
    //   24: aconst_null
    //   25: astore 5
    //   27: ldc 18
    //   29: istore_2
    //   30: iload_1
    //   31: iload_2
    //   32: if_icmpne +26 -> 58
    //   35: new 21	android/support/v4/view/b/a
    //   38: astore 4
    //   40: aload 4
    //   42: invokespecial 25	android/support/v4/view/b/a:<init>	()V
    //   45: iconst_0
    //   46: ifeq -27 -> 19
    //   49: aconst_null
    //   50: invokeinterface 30 1 0
    //   55: goto -36 -> 19
    //   58: ldc 31
    //   60: istore_2
    //   61: iload_1
    //   62: iload_2
    //   63: if_icmpne +26 -> 89
    //   66: new 34	android/support/v4/view/b/b
    //   69: astore 4
    //   71: aload 4
    //   73: invokespecial 35	android/support/v4/view/b/b:<init>	()V
    //   76: iconst_0
    //   77: ifeq -58 -> 19
    //   80: aconst_null
    //   81: invokeinterface 30 1 0
    //   86: goto -67 -> 19
    //   89: ldc 36
    //   91: istore_2
    //   92: iload_1
    //   93: iload_2
    //   94: if_icmpne +26 -> 120
    //   97: new 39	android/support/v4/view/b/c
    //   100: astore 4
    //   102: aload 4
    //   104: invokespecial 40	android/support/v4/view/b/c:<init>	()V
    //   107: iconst_0
    //   108: ifeq -89 -> 19
    //   111: aconst_null
    //   112: invokeinterface 30 1 0
    //   117: goto -98 -> 19
    //   120: aload_0
    //   121: invokevirtual 46	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   124: astore 4
    //   126: aload 4
    //   128: iload_1
    //   129: invokevirtual 52	android/content/res/Resources:getAnimation	(I)Landroid/content/res/XmlResourceParser;
    //   132: astore 5
    //   134: aload_0
    //   135: invokevirtual 46	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   138: astore 4
    //   140: aload_0
    //   141: invokevirtual 56	android/content/Context:getTheme	()Landroid/content/res/Resources$Theme;
    //   144: astore 6
    //   146: aload_0
    //   147: aload 4
    //   149: aload 6
    //   151: aload 5
    //   153: invokestatic 60	android/support/c/a/d:a	(Landroid/content/Context;Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)Landroid/view/animation/Interpolator;
    //   156: astore 4
    //   158: aload 5
    //   160: ifnull -141 -> 19
    //   163: aload 5
    //   165: invokeinterface 30 1 0
    //   170: goto -151 -> 19
    //   173: astore 4
    //   175: new 62	android/content/res/Resources$NotFoundException
    //   178: astore 6
    //   180: new 64	java/lang/StringBuilder
    //   183: astore 7
    //   185: aload 7
    //   187: invokespecial 65	java/lang/StringBuilder:<init>	()V
    //   190: ldc 67
    //   192: astore 8
    //   194: aload 7
    //   196: aload 8
    //   198: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: astore 7
    //   203: iload_1
    //   204: invokestatic 77	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   207: astore 8
    //   209: aload 7
    //   211: aload 8
    //   213: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: astore 7
    //   218: aload 7
    //   220: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   223: astore 7
    //   225: aload 6
    //   227: aload 7
    //   229: invokespecial 84	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   232: aload 6
    //   234: aload 4
    //   236: invokevirtual 88	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   239: pop
    //   240: aload 6
    //   242: athrow
    //   243: astore 4
    //   245: aload 5
    //   247: ifnull +10 -> 257
    //   250: aload 5
    //   252: invokeinterface 30 1 0
    //   257: aload 4
    //   259: athrow
    //   260: astore 4
    //   262: new 62	android/content/res/Resources$NotFoundException
    //   265: astore 6
    //   267: new 64	java/lang/StringBuilder
    //   270: astore 7
    //   272: aload 7
    //   274: invokespecial 65	java/lang/StringBuilder:<init>	()V
    //   277: ldc 67
    //   279: astore 8
    //   281: aload 7
    //   283: aload 8
    //   285: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   288: astore 7
    //   290: iload_1
    //   291: invokestatic 77	java/lang/Integer:toHexString	(I)Ljava/lang/String;
    //   294: astore 8
    //   296: aload 7
    //   298: aload 8
    //   300: invokevirtual 71	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   303: astore 7
    //   305: aload 7
    //   307: invokevirtual 81	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   310: astore 7
    //   312: aload 6
    //   314: aload 7
    //   316: invokespecial 84	android/content/res/Resources$NotFoundException:<init>	(Ljava/lang/String;)V
    //   319: aload 6
    //   321: aload 4
    //   323: invokevirtual 88	android/content/res/Resources$NotFoundException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   326: pop
    //   327: aload 6
    //   329: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	330	0	paramContext	Context
    //   0	330	1	paramInt	int
    //   3	92	2	i	int
    //   6	18	3	j	int
    //   17	140	4	localObject1	Object
    //   173	62	4	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   243	15	4	localObject2	Object
    //   260	62	4	localIOException	java.io.IOException
    //   25	226	5	localXmlResourceParser	android.content.res.XmlResourceParser
    //   144	184	6	localObject3	Object
    //   183	132	7	localObject4	Object
    //   192	107	8	str	String
    // Exception table:
    //   from	to	target	type
    //   35	38	173	org/xmlpull/v1/XmlPullParserException
    //   40	45	173	org/xmlpull/v1/XmlPullParserException
    //   66	69	173	org/xmlpull/v1/XmlPullParserException
    //   71	76	173	org/xmlpull/v1/XmlPullParserException
    //   97	100	173	org/xmlpull/v1/XmlPullParserException
    //   102	107	173	org/xmlpull/v1/XmlPullParserException
    //   120	124	173	org/xmlpull/v1/XmlPullParserException
    //   128	132	173	org/xmlpull/v1/XmlPullParserException
    //   134	138	173	org/xmlpull/v1/XmlPullParserException
    //   140	144	173	org/xmlpull/v1/XmlPullParserException
    //   151	156	173	org/xmlpull/v1/XmlPullParserException
    //   35	38	243	finally
    //   40	45	243	finally
    //   66	69	243	finally
    //   71	76	243	finally
    //   97	100	243	finally
    //   102	107	243	finally
    //   120	124	243	finally
    //   128	132	243	finally
    //   134	138	243	finally
    //   140	144	243	finally
    //   151	156	243	finally
    //   175	178	243	finally
    //   180	183	243	finally
    //   185	190	243	finally
    //   196	201	243	finally
    //   203	207	243	finally
    //   211	216	243	finally
    //   218	223	243	finally
    //   227	232	243	finally
    //   234	240	243	finally
    //   240	243	243	finally
    //   262	265	243	finally
    //   267	270	243	finally
    //   272	277	243	finally
    //   283	288	243	finally
    //   290	294	243	finally
    //   298	303	243	finally
    //   305	310	243	finally
    //   314	319	243	finally
    //   321	327	243	finally
    //   327	330	243	finally
    //   35	38	260	java/io/IOException
    //   40	45	260	java/io/IOException
    //   66	69	260	java/io/IOException
    //   71	76	260	java/io/IOException
    //   97	100	260	java/io/IOException
    //   102	107	260	java/io/IOException
    //   120	124	260	java/io/IOException
    //   128	132	260	java/io/IOException
    //   134	138	260	java/io/IOException
    //   140	144	260	java/io/IOException
    //   151	156	260	java/io/IOException
  }
  
  private static Interpolator a(Context paramContext, Resources paramResources, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = paramXmlPullParser.getDepth();
    for (;;)
    {
      int j = paramXmlPullParser.next();
      int k = 3;
      if (j == k)
      {
        k = paramXmlPullParser.getDepth();
        if (k <= i) {
          break label467;
        }
      }
      k = 1;
      if (j == k) {
        break label467;
      }
      k = 2;
      if (j == k)
      {
        localObject2 = Xml.asAttributeSet(paramXmlPullParser);
        localObject1 = paramXmlPullParser.getName();
        String str = "linearInterpolator";
        boolean bool2 = ((String)localObject1).equals(str);
        if (bool2)
        {
          localObject1 = new android/view/animation/LinearInterpolator;
          ((LinearInterpolator)localObject1).<init>();
        }
        else
        {
          str = "accelerateInterpolator";
          bool2 = ((String)localObject1).equals(str);
          if (bool2)
          {
            localObject1 = new android/view/animation/AccelerateInterpolator;
            ((AccelerateInterpolator)localObject1).<init>(paramContext, (AttributeSet)localObject2);
          }
          else
          {
            str = "decelerateInterpolator";
            bool2 = ((String)localObject1).equals(str);
            if (bool2)
            {
              localObject1 = new android/view/animation/DecelerateInterpolator;
              ((DecelerateInterpolator)localObject1).<init>(paramContext, (AttributeSet)localObject2);
            }
            else
            {
              str = "accelerateDecelerateInterpolator";
              bool2 = ((String)localObject1).equals(str);
              if (bool2)
              {
                localObject1 = new android/view/animation/AccelerateDecelerateInterpolator;
                ((AccelerateDecelerateInterpolator)localObject1).<init>();
              }
              else
              {
                str = "cycleInterpolator";
                bool2 = ((String)localObject1).equals(str);
                if (bool2)
                {
                  localObject1 = new android/view/animation/CycleInterpolator;
                  ((CycleInterpolator)localObject1).<init>(paramContext, (AttributeSet)localObject2);
                }
                else
                {
                  str = "anticipateInterpolator";
                  bool2 = ((String)localObject1).equals(str);
                  if (bool2)
                  {
                    localObject1 = new android/view/animation/AnticipateInterpolator;
                    ((AnticipateInterpolator)localObject1).<init>(paramContext, (AttributeSet)localObject2);
                  }
                  else
                  {
                    str = "overshootInterpolator";
                    bool2 = ((String)localObject1).equals(str);
                    if (bool2)
                    {
                      localObject1 = new android/view/animation/OvershootInterpolator;
                      ((OvershootInterpolator)localObject1).<init>(paramContext, (AttributeSet)localObject2);
                    }
                    else
                    {
                      str = "anticipateOvershootInterpolator";
                      bool2 = ((String)localObject1).equals(str);
                      if (bool2)
                      {
                        localObject1 = new android/view/animation/AnticipateOvershootInterpolator;
                        ((AnticipateOvershootInterpolator)localObject1).<init>(paramContext, (AttributeSet)localObject2);
                      }
                      else
                      {
                        str = "bounceInterpolator";
                        bool2 = ((String)localObject1).equals(str);
                        if (bool2)
                        {
                          localObject1 = new android/view/animation/BounceInterpolator;
                          ((BounceInterpolator)localObject1).<init>();
                        }
                        else
                        {
                          str = "pathInterpolator";
                          bool1 = ((String)localObject1).equals(str);
                          if (!bool1) {
                            break;
                          }
                          localObject1 = new android/support/c/a/g;
                          ((g)localObject1).<init>(paramContext, (AttributeSet)localObject2, paramXmlPullParser);
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
    localObject1 = new java/lang/RuntimeException;
    Object localObject3 = new java/lang/StringBuilder;
    ((StringBuilder)localObject3).<init>();
    localObject3 = ((StringBuilder)localObject3).append("Unknown interpolator name: ");
    Object localObject2 = paramXmlPullParser.getName();
    localObject3 = (String)localObject2;
    ((RuntimeException)localObject1).<init>((String)localObject3);
    throw ((Throwable)localObject1);
    label467:
    return (Interpolator)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */