package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.view.b;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import org.xmlpull.v1.XmlPullParser;

public class SupportMenuInflater
  extends MenuInflater
{
  static final Class[] ACTION_PROVIDER_CONSTRUCTOR_SIGNATURE = ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
  static final Class[] ACTION_VIEW_CONSTRUCTOR_SIGNATURE;
  static final String LOG_TAG = "SupportMenuInflater";
  static final int NO_ID = 0;
  private static final String XML_GROUP = "group";
  private static final String XML_ITEM = "item";
  private static final String XML_MENU = "menu";
  final Object[] mActionProviderConstructorArguments;
  final Object[] mActionViewConstructorArguments;
  Context mContext;
  private Object mRealOwner;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    ACTION_VIEW_CONSTRUCTOR_SIGNATURE = arrayOfClass;
  }
  
  public SupportMenuInflater(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    this.mActionViewConstructorArguments = arrayOfObject;
    arrayOfObject = this.mActionViewConstructorArguments;
    this.mActionProviderConstructorArguments = arrayOfObject;
  }
  
  private Object findRealOwner(Object paramObject)
  {
    boolean bool = paramObject instanceof Activity;
    if (bool) {}
    for (;;)
    {
      return paramObject;
      bool = paramObject instanceof ContextWrapper;
      if (bool)
      {
        Context localContext = ((ContextWrapper)paramObject).getBaseContext();
        paramObject = findRealOwner(localContext);
      }
    }
  }
  
  private void parseMenu(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    SupportMenuInflater.MenuState localMenuState = new android/support/v7/view/SupportMenuInflater$MenuState;
    localMenuState.<init>(this, paramMenu);
    int j = paramXmlPullParser.getEventType();
    int k = 2;
    Object localObject2;
    boolean bool1;
    label71:
    int m;
    float f2;
    int n;
    if (j == k)
    {
      localObject1 = paramXmlPullParser.getName();
      localObject2 = "menu";
      bool1 = ((String)localObject1).equals(localObject2);
      if (bool1)
      {
        j = paramXmlPullParser.next();
        bool1 = false;
        localObject2 = null;
        m = 0;
        f2 = 0.0F;
        n = j;
        j = 0;
        localObject1 = null;
        label93:
        if (j != 0) {
          return;
        }
      }
    }
    label128:
    float f3;
    switch (n)
    {
    default: 
      n = m;
      f3 = f2;
    case 2: 
    case 3: 
      for (;;)
      {
        m = paramXmlPullParser.next();
        int i1 = n;
        n = m;
        m = i1;
        f2 = f3;
        break label93;
        RuntimeException localRuntimeException = new java/lang/RuntimeException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject1 = "Expecting menu, got " + (String)localObject1;
        localRuntimeException.<init>((String)localObject1);
        throw localRuntimeException;
        j = paramXmlPullParser.next();
        if (j != i) {
          break;
        }
        break label71;
        if (m != 0)
        {
          n = m;
          f3 = f2;
        }
        else
        {
          Object localObject3 = paramXmlPullParser.getName();
          String str = "group";
          boolean bool3 = ((String)localObject3).equals(str);
          if (bool3)
          {
            localMenuState.readGroup(paramAttributeSet);
            n = m;
            f3 = f2;
          }
          else
          {
            str = "item";
            bool3 = ((String)localObject3).equals(str);
            if (bool3)
            {
              localMenuState.readItem(paramAttributeSet);
              n = m;
              f3 = f2;
            }
            else
            {
              str = "menu";
              bool3 = ((String)localObject3).equals(str);
              if (bool3)
              {
                localObject3 = localMenuState.addSubMenuItem();
                parseMenu(paramXmlPullParser, paramAttributeSet, (Menu)localObject3);
                n = m;
                f3 = f2;
              }
              else
              {
                localObject2 = localObject3;
                n = i;
                f3 = f1;
                continue;
                localObject3 = paramXmlPullParser.getName();
                if (m != 0)
                {
                  bool3 = ((String)localObject3).equals(localObject2);
                  if (bool3)
                  {
                    bool1 = false;
                    localObject2 = null;
                    n = 0;
                    localObject3 = null;
                    f3 = 0.0F;
                    continue;
                  }
                }
                str = "group";
                bool3 = ((String)localObject3).equals(str);
                if (bool3)
                {
                  localMenuState.resetGroup();
                  n = m;
                  f3 = f2;
                }
                else
                {
                  str = "item";
                  bool3 = ((String)localObject3).equals(str);
                  if (bool3)
                  {
                    bool2 = localMenuState.hasAddedItem();
                    if (bool2) {
                      break label128;
                    }
                    localObject3 = localMenuState.itemActionProvider;
                    if (localObject3 != null)
                    {
                      localObject3 = localMenuState.itemActionProvider;
                      bool2 = ((b)localObject3).hasSubMenu();
                      if (bool2)
                      {
                        localMenuState.addSubMenuItem();
                        bool2 = m;
                        f3 = f2;
                        continue;
                      }
                    }
                    localMenuState.addItem();
                    bool2 = m;
                    f3 = f2;
                    continue;
                  }
                  str = "menu";
                  boolean bool2 = ((String)localObject3).equals(str);
                  if (!bool2) {
                    break label128;
                  }
                  j = i;
                  bool2 = m;
                  f3 = f2;
                }
              }
            }
          }
        }
      }
    }
    Object localObject1 = new java/lang/RuntimeException;
    ((RuntimeException)localObject1).<init>("Unexpected end of document");
    throw ((Throwable)localObject1);
  }
  
  Object getRealOwner()
  {
    Object localObject = this.mRealOwner;
    if (localObject == null)
    {
      localObject = this.mContext;
      localObject = findRealOwner(localObject);
      this.mRealOwner = localObject;
    }
    return this.mRealOwner;
  }
  
  /* Error */
  public void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 148
    //   4: istore_3
    //   5: iload_3
    //   6: ifne +10 -> 16
    //   9: aload_0
    //   10: iload_1
    //   11: aload_2
    //   12: invokespecial 152	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   15: return
    //   16: aconst_null
    //   17: astore 4
    //   19: aload_0
    //   20: getfield 46	android/support/v7/view/SupportMenuInflater:mContext	Landroid/content/Context;
    //   23: astore 5
    //   25: aload 5
    //   27: invokevirtual 156	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   30: astore 5
    //   32: aload 5
    //   34: iload_1
    //   35: invokevirtual 162	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   38: astore 4
    //   40: aload 4
    //   42: invokestatic 168	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   45: astore 5
    //   47: aload_0
    //   48: aload 4
    //   50: aload 5
    //   52: aload_2
    //   53: checkcast 170	android/view/Menu
    //   56: invokespecial 123	android/support/v7/view/SupportMenuInflater:parseMenu	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   59: aload 4
    //   61: ifnull -46 -> 15
    //   64: aload 4
    //   66: invokeinterface 175 1 0
    //   71: goto -56 -> 15
    //   74: astore 5
    //   76: new 177	android/view/InflateException
    //   79: astore 6
    //   81: ldc -77
    //   83: astore 7
    //   85: aload 6
    //   87: aload 7
    //   89: aload 5
    //   91: invokespecial 182	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   94: aload 6
    //   96: athrow
    //   97: astore 5
    //   99: aload 4
    //   101: ifnull +10 -> 111
    //   104: aload 4
    //   106: invokeinterface 175 1 0
    //   111: aload 5
    //   113: athrow
    //   114: astore 5
    //   116: new 177	android/view/InflateException
    //   119: astore 6
    //   121: ldc -77
    //   123: astore 7
    //   125: aload 6
    //   127: aload 7
    //   129: aload 5
    //   131: invokespecial 182	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   134: aload 6
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	SupportMenuInflater
    //   0	137	1	paramInt	int
    //   0	137	2	paramMenu	Menu
    //   4	2	3	bool	boolean
    //   17	88	4	localXmlResourceParser	android.content.res.XmlResourceParser
    //   23	28	5	localObject1	Object
    //   74	16	5	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   97	15	5	localObject2	Object
    //   114	16	5	localIOException	java.io.IOException
    //   79	56	6	localInflateException	android.view.InflateException
    //   83	45	7	str	String
    // Exception table:
    //   from	to	target	type
    //   19	23	74	org/xmlpull/v1/XmlPullParserException
    //   25	30	74	org/xmlpull/v1/XmlPullParserException
    //   34	38	74	org/xmlpull/v1/XmlPullParserException
    //   40	45	74	org/xmlpull/v1/XmlPullParserException
    //   52	59	74	org/xmlpull/v1/XmlPullParserException
    //   19	23	97	finally
    //   25	30	97	finally
    //   34	38	97	finally
    //   40	45	97	finally
    //   52	59	97	finally
    //   76	79	97	finally
    //   89	94	97	finally
    //   94	97	97	finally
    //   116	119	97	finally
    //   129	134	97	finally
    //   134	137	97	finally
    //   19	23	114	java/io/IOException
    //   25	30	114	java/io/IOException
    //   34	38	114	java/io/IOException
    //   40	45	114	java/io/IOException
    //   52	59	114	java/io/IOException
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\SupportMenuInflater.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */